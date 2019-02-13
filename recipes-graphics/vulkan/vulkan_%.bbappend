#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
#
#SRC_URI += "file://0001-Revert-CMakeLists.txt-Modify-the-library-path-to-poi.patch"

####
# for unknown reason ninja will fail, check when upgrading ...
####
OECMAKE_GENERATOR = "Unix Makefiles"

####
# just to be sure, should be cmake default (or vulkan default in the future)
####
CCACHE = ""
