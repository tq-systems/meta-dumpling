# OpenEmbedded / Yocto Project evaluation BSP layer for TQ-Systems ARM SOM

**Attention:** This branch should only be used for TQMaRZG2x machines. For all
other machines use current yocto versions.

This README file contains information on the content of the meta-dumpling layer.

Please see the corresponding sections below for details.

[[_TOC_]]

## Overview

### Abstract

This layer provides recipes to generate images to help evaluation of
TQ-Systems CPU modules and Starterkits. This layer additionally contains
optional fixes and extensions for other layers as far as is needed / useful
for TQ-Systems SOM and some initial example distro support.

### Dependencies

This layer in the checked out branch depends on:

This layer depends on:

  URI: git://git.yoctoproject.org/poky  
  branch: rocko  
  layers: meta  

  URI: https://github.com/tq-systems/meta-tq.git  
  branch: rocko  
  layers: meta-tq  

This layer additionally contains optional fixes and extensions for other layers
as far as needed for TQ-Systems SOM. Most of these bbappends are implemented
under dynamic-layers and are only visible, if the original layer is in your
bblayer.conf. For details look for `BBFILES_DYNAMIC` in Yocto Project
documentation.

### Patches

Please submit patches against meta-dumpling to Markus.Niebel@tq-group.com

Additionally you can use github's collaboration features.

## Usage

### Adding the meta-dumpling layer to your build

Run 'bitbake-layers add-layer <path-to-meta-dumpling>/meta-dumpling'

Assuming the tq layer exists in subdir sources at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the tq layer to bblayers.conf, along with any
other layers needed. e.g.:

```
BSPDIR := "${@os.path.abspath(os.path.dirname(d.getVar('FILE', True)) + '/../..')}"

BBLAYERS ?= "\
...
    ${BSPDIR}/sources/meta-tq \
    ${BSPDIR}/sources/poky/meta \
    ...
"
```

### Image recipes

The meta-dumpling layer defines images recipes for test / evaluation of
TQ-Systems SOM:

| image                  | intended use                                                  |
| ---------------------- | ------------------------------------------------------------- |
| tq-image-generic       | based on poky core-image-minimal                              |

**Attention:** These recipes can be used as a starting point for own customization.
Because of the intended usage, a lot debug and test tools are included.
These packages should not go into a production image. Depending on the actual
project, security must be taken in account.

It is recommended to use the [Format_Guidelines](https://www.openembedded.org/wiki/Styleguide#Format_Guidelines)
from openembedded.

### Example distros

The meta-dumpling layer defines distros as starting point for own customization.
These distros are also available for usage together with vendor based kernel /
vendor hardware support layer.

| distro name           | purpose                                                           |
| --------------------- | ----------------------------------------------------------------- |
| dumpling              | systemd, features depends on machine settings                     |
| dumpling-rzg2         | systemd, features depends on machine settings with Renesas kernel |
| dumpling-wayland-rzg2 | like dumpling-rzg2, additional wayland / weston                   |

**Attention:** These distro configs can be used as a starting point for own
customization. Because of the intended usage, they are focused on demonstration.
These configs should not go into a production usage without thorough review.
Depending on the actual project, security must be taken in account.
