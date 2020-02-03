DESCRIPTION = "tools for generic hw support"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = " \
    u-boot-fw-utils \
    rng-tools \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'openembedded-layer', ' linuxptp', '', d)} \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'openembedded-layer', ' cpufrequtils', '', d)} \
    "
