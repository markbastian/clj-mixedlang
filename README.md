# clj-mixedlang

A simple example of how to mix Clojure and Java sources in the same project.
 
There are two ways to do this:

 * If you just want to add some Java sources into your project and not modify them on the fly, simply add them to a java source directory and specify this directory with the `:java-source-paths` key in your project.clj file. When I do this I either keep the default src directory for Clojure and add a java folder for Java or I rearrange the code to use a mvn-style layout as is done in this project. This latter option also requires setting the `:source-paths` option in your project.clj. 
 * If you want to live-code your Java sources with hot reloading you'll need to add the `lein-virgil` plugin to your project. If, when launching the REPL, you get errors along the lines of "Unsupported class file major version 57" then you'll need to change your JDK version to produce compatible bytecode. This is done in IntelliJ by right clicking on your project name in the source tree, then selecting "Open Module Settings," then choosing the appropriate module SDK (In my case, OpenJDK 11).

## Usage

 1. Fire up the REPL.
 1. Invoke `(JavaClass/square 42)`. In Cursive you will be prompted to import the class as you type the form. Import the class prior to evaluation.
 1. Go to `clj_mixedlang.JavaClass` and uncomment the `cube` static method. You'll see that the code is recompiled in your REPL. Repeat the above step to evalute it. Magic!

## License

Copyright © 2020 Mark Bastian

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
