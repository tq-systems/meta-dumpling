# OpenEmbedded / Yocto Project evaluation BSP layer for TQ Systems ARM SOM

This README file contains information on the contents of the meta-dumpling layer.
This layer provides recipes to generate images to help evaluation of
TQ Systems CPU modules and Starterkits.

Please see the corresponding sections below for details.

## Overview

### Dependencies

This layer depends on:

URI: https://git.yoctoproject.org/poky  
branch: sumo  
layers: meta  

URI: https://github.com/tq-systems/meta-tq.git  
branch: sumo  
layers: meta-tq  

This layer additionally contains optional fixes and extensions for other layers
as far as needed for TQ Systems SOM. Most of these bbappends are implemented
under dynamic-layers and are only visible, if the original layer is in your
bblayer.conf. For details look for `BBFILES_DYNAMIC` in Yocto Project
documentation.

### Patches

Please submit patches against the meta-dumpling layer to the
maintainer:

Maintainer: Markus Niebel <Markus.Niebel@tq-group.com>

Additionally you can use github's collaboration features.

## Table of Contents

1. Adding the meta-dumpling layer to your build
2. Misc

### 1. Adding the meta-dumpling layer to your build

To add meta-dumpling layer to your build run

`bitbake-layers add-layer <path-to-meta-dumpling>/meta-dumpling`

### 2. Misc

The meta-dumpling layer defines images recipes for test / evaluation of
TQ Systems SOM:

* tq-image-generic (based on poky core-image-minimal)
* tq-image-qt5 (based on fsl-image-qt5)

**Attention:** These recipes can be used as a starting point for own customization.
Because of the intended usage, a lot for debug and test tools are included.
These packages should not go into a production image. Depending on the actual
project, security must be taken in account.
