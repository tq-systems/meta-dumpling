DESCRIPTION = "tools needed for CAN support / testing"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
    can-utils \
    can-utils-cantest \
    iproute2 \
"
