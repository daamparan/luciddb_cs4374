/*
// Licensed to DynamoBI Corporation (DynamoBI) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  DynamoBI licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at

//   http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
*/
package org.eigenbase.sql.validate;

import org.eigenbase.reltype.*;
import org.eigenbase.sql.*;


/**
 * Namespace representing the type of a dynamic parameter.
 *
 * @author jhyde
 * @version $Id$
 * @see ParameterScope
 * @since Mar 25, 2003
 */
class ParameterNamespace
    extends AbstractNamespace
{
    //~ Instance fields --------------------------------------------------------

    private final RelDataType type;

    //~ Constructors -----------------------------------------------------------

    public ParameterNamespace(SqlValidatorImpl validator, RelDataType type)
    {
        super(validator, null);
        this.type = type;
    }

    //~ Methods ----------------------------------------------------------------

    public SqlNode getNode()
    {
        return null;
    }

    public RelDataType validateImpl()
    {
        return type;
    }

    public RelDataType getRowType()
    {
        return type;
    }
}

// End ParameterNamespace.java
