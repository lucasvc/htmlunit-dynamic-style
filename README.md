# HtmlUnit and dynamic styles

After upgrading [HtmlUnit](http://htmlunit.sourceforge.net/) from 2.15 to 2.17, some elements are being not "displayed", even major browsers display it. This elements are labels with a 'dynamic' style, based on size.

This repo contains a JUnit test which works using 2.15, but on changing to newer version it fails.

## How to try

After cloning, you execute:

    ./gradlew

And the test should pass.

Edit `build.gradle` file, variable `htmlunitVersion` with a newer version (tested with 2.16, 2.17 and 2.18), and execute again the build. Test will fail.
