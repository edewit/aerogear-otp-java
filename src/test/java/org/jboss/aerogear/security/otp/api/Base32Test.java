/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.aerogear.security.otp.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Base32Test {

    @Test
    public void testRandom() throws Exception {
        assertEquals(16, Base32.random().length());
    }

    @Test
    public void testDecode() throws Exception {
        assertEquals(10, Base32.decode(Base32.random()).length);
    }

    @Test
    public void testEncodeDecode() throws Exception {
        //given
        String code = "thecode";

        //when
        final String encoded = Base32.encode(code.getBytes());
        String result = new String(Base32.decode(encoded));

        //then
        assertEquals(code, result);
    }
}
