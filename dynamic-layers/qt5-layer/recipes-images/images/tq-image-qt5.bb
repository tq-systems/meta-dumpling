require dynamic-layers/qt5-layer/recipes-fsl/images/fsl-image-qt5.bb

SUMMARY =  "This is a generic image for TQ SOM with qt5."

IMAGE_LINGUAS += " en-us "

LICENSE = "MIT"

inherit distro_features_check

IMAGE_INSTALL += "\
    packagegroup-hwutils \
    packagegroup-fsutils \
    packagegroup-netutils \
    packagegroup-sysutils \
    ${@bb.utils.contains('MACHINE_FEATURES', 'can', ' packagegroup-can', '', d)} \
    ${@bb.utils.contains('MACHINE_FEATURES', 'alsa', ' packagegroup-audio', '', d)} \
"

# force openssh to prevent conflict with dropbear
EXTRA_IMAGE_FEATURES += " ssh-server-openssh"
