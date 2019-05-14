require recipes-core/images/core-image-minimal.bb

SUMMARY =  "This image is for TQ SOM in network oriented designs."

IMAGE_LINGUAS = " en-us "

LICENSE = "MIT"

inherit distro_features_check

IMAGE_INSTALL += "\
    packagegroup-hwutils \
    packagegroup-fsutils \
    packagegroup-netutils \
    packagegroup-sysutils \
    packagegroup-testutils \
    ${@bb.utils.contains('MACHINE_FEATURES', 'can', ' packagegroup-can', '', d)} \
"

# force openssh to prevent conflict with dropbear
EXTRA_IMAGE_FEATURES += " ssh-server-openssh"
