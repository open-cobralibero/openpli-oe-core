DESCRIPTION = "Advanced history zap selector"
HOMEPAGE = "https://github.com/Dima73/enigma2-plugin-extensions-historyzapselector"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://README;md5=b5f3c7ed409cbcc6d849e694f25729ba"
SRC_URI = "git://github.com/Dima73/enigma2-plugin-extensions-historyzapselector.git"
S = "${WORKDIR}/git"

inherit gitpkgv
SRCREV = "12caa2f7f8c424abd6496090634d18a49a5f0043"
PV = "1+git${SRCPV}"
PKGV = "1+git${GITPKGV}"

inherit allarch distutils-openplugins
