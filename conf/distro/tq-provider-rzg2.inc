# Select CIP Core packages by switching betwwen Buster and Bullseye.
#  - Buster (default)	: build all supported Debian 10 Buster recipes
#  - Bullseye		: build all supported Debian 11 Bullseye recipes
#  - Not set (or different with above): not use CIP Core, use default packages version in Yocto

CIP_MODE = "Buster"

# The rensas layer uses a fixed string "/home/root" to install some
# examples/helpers to the root home dir. For convenience set ROOT_HOME
# accordingly.
ROOT_HOME = "/home/root"
