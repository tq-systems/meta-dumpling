DESCRIPTION = "tools needed to test basic hw support"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = " \
    rng-tools \
    util-linux-fstrim \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'openembedded-layer', ' linuxptp', '', d)} \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'openembedded-layer', ' cpufrequtils', '', d)} \
    "
