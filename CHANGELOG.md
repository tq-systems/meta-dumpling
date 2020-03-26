# Changelog

All notable changes to this project will be documented in this file.
Releases are named with thefollowing scheme:

`<Yocto Project version name>.<TQ module family>.BSP.SW.<version number>`

## Next release

### Added

* backport for rng-tools
* backport for libjitterentropy
* packagegroup-systemd
* packagegroup-audio
* packagegroup-canutils

### Fixed

* rng-tools: fix start scripts for systems without /dev/hwrng
* packagegroups: make some RDEPENDS optional (only if layer is present)

### Changed

* packagegroup-hwutils: add more packages
* packagegroup-netutils: add more packages
* packagegroup-testutils: add more packages
* tq-image-generic: rdepend on packagegroup-testutils

## sumo.TQMLS1012AL.BSP.SW.0005
## sumo.TQMLS1012AL.BSP.SW.0004
## sumo.TQMLS1012AL.BSP.SW.0003

### Changed

* packagegroup-hwutils: add lmsensors

### Added

* images: tq-image-generic
* packagegroups: add packagegroup-sysutils

## Older releases
