DESCRIPTION = "test and debugging tools"
LICENSE = "MIT"

inherit packagegroup

#the following builds cross gdb and gdbserver
#DEPENDS += "gdb-cross-${TARGET_ARCH}"

# note: we could also use packagegroup-core-tools-debug
# but this would install a full fledged gbd on target
# maybe perl comes also in as a dependency for mtrace
# and that's not what we want

# we can not use perf at the moment, this is fixed in a newer version of poky but
# this newer version breaks gstreamer recipes im meta-imx

RDEPENDS_${PN} = " \
    strace \
    gdbserver \
    "
