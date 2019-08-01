####
# TODO: remove this dependency. this brings in debug-tweaks, which allows
# passwordless ssh and other stuff only usable for debug
####
require dynamic-layers/qt5-layer/recipes-fsl/images/fsl-image-qt5.bb

SUMMARY =  "This is a generic demo image for TQ SOM with qt5."

DESCRIPTION = "Demo image based on FSL/NXP validation image. \
This creates a very large image and also debug tools, not \
suitable for production."

IMAGE_LINGUAS_append = " en-us "

LICENSE = "MIT"

inherit distro_features_check

IMAGE_INSTALL += "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', ' packagegroup-systemd', '', d)} \
    packagegroup-hwutils \
    packagegroup-fsutils \
    packagegroup-netutils \
    packagegroup-sysutils \
    ${@bb.utils.contains('MACHINE_FEATURES', 'can', ' packagegroup-can', '', d)} \
    ${@bb.utils.contains('MACHINE_FEATURES', 'alsa', ' packagegroup-audio', '', d)} \
"

# force openssh to prevent conflict with dropbear
IMAGE_FEATURES += " ssh-server-openssh"
