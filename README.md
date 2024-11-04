# Bug reproduction

This repo contains a minimal reproduction for the bug described in https://github.com/com-lihaoyi/mill/issues/3857

## Steps to reproduce

1. Clone this repository.
2. Run `mill Demo.test`
3. Run `mill Demo.scoverage.htmlReport` => we see the error
4. Change .mill-version to `0.11.8`
5. Run `mill Demo.test`
6. Run `mill Demo.scoverage.htmlReport` => we see no error