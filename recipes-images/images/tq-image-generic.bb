require recipes-core/images/core-image-minimal.bb

SUMMARY =  "This image is for TQ SOM in network oriented designs."

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_LINGUAS = " en-us "

LICENSE = "MIT"

inherit distro_features_check

IMAGE_INSTALL += "\
    packagegroup-hwutils \
    packagegroup-fsutils \
    packagegroup-netutils \
    packagegroup-sysutils \
    packagegroup-testutils \
"
