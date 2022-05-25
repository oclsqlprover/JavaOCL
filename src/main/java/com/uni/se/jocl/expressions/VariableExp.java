/**************************************************************************
Copyright 2022 

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: Anonymous Author(s)
***************************************************************************/

package com.uni.se.jocl.expressions;

import com.uni.se.jocl.types.Type;
import com.uni.se.jocl.visit.ParserVisitor;

public class VariableExp extends OclExp {

    private Variable variable;

    public VariableExp(Variable variable) {
        this.variable = variable;
        super.setType(variable.getType());
    }

    public Variable getVariable() {
        return variable;
    }
    
    @Override
    public Type getType() {
        return this.variable.getType();
    }

    @Override
    public void accept(ParserVisitor parserVisitor) {
        parserVisitor.visit(this);
    }
    
    @Override
    public String toString() {
        return this.variable.toString();
    }
}
