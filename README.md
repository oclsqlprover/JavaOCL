# jocl

A representation of OCL expression in Java.
 
# jocl: A submodule committed for Manuscript 54 [MODELS22]

**Paper**: "Proving correctness for SQL implementations of OCL constraints"

The submodule performs some parsing form OCL expressions to Java object hierarchy. 
Given a datamodel (in JSON format) and an OCL expression, **jocl** generates a Java object representation of this expression.

**Note**: This repository stores the source code of the text-to-model transformation. This code will be exported to a JAR file and included as a submodule in the main project(s). Although it can operate as a standalone software, its functionality will not be discussed in detail here since it is out of the manuscript scope.

 