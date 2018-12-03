require recipes-fsl/images/fsl-image-networking.bb

SUMMARY =  "This image is for TQ SOM in network oriented designs."

IMAGE_FEATURES += "ssh-server-openssh"

LICENSE = "MIT"

inherit distro_features_check

IMAGE_INSTALL += "\
    packagegroup-hwutils \
    packagegroup-fsutils \
    packagegroup-netutils \
"
