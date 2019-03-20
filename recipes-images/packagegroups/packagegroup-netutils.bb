DESCRIPTION = "tools needed for network support / testing"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = " \
    openssh \
    ethtool \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'openembedded-layer', ' iperf2', '', d)} \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'openembedded-layer', ' iperf3', '', d)} \
    "
