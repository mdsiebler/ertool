/**
* Copyright 2014-2016 IBM Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
**/

package com.ibm.datapower.er.mgmt;

/**
 * This exception is thrown when the destination hostname is unknown.
 * 
 * @author Dana Numkena
 *
 */

public class ERMgmtUnknownHostException extends ERMgmtException {

    ERMgmtUnknownHostException(String a) {
        super(a);
    }
    ERMgmtUnknownHostException(String message, Throwable e) {
        super(message, e);
    }

}
