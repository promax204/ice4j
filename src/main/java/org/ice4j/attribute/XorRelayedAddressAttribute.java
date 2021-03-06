/*
 * ice4j, the OpenSource Java Solution for NAT and Firewall Traversal.
 *
 * Copyright @ 2015 Atlassian Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ice4j.attribute;

/**
 * The XOR-RELAYED-ADDRESS attribute is given by a TURN server to
 * indicates the client its relayed address.
 *
 * It has the same format as XOR-MAPPED-ADDRESS.
 *
 * @author Sebastien Vincent
 */
public class XorRelayedAddressAttribute extends XorMappedAddressAttribute
{

    /**
     * Constructor.
     */
    XorRelayedAddressAttribute()
    {
        super(Attribute.Type.XOR_RELAYED_ADDRESS);
    }
}
