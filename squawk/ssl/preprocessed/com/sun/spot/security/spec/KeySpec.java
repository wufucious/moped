/*
 * Copyright 2006-2008 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * only, as published by the Free Software Foundation.
 * 
 * This code is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included in the LICENSE file that accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA
 * 
 * Please contact Sun Microsystems, Inc., 16 Network Circle, Menlo
 * Park, CA 94025 or visit www.sun.com if you need additional
 * information or have any questions.
 */

package com.sun.spot.security.spec;

/**
 * A (transparent) specification of the key material that 
 * constitutes a cryptographic key.
 * <p>If the key is stored on a hardware device, its specification may contain
 * information that helps identify the key on the device.
 * <p>A key may be specified in an algorithm-specific way, or in an 
 * algorithm-independent encoding format (such as ASN.1).
 * <p>This interface contains no methods or constants. Its only purpose is to 
 * group (and provide type safety for) all key specifications. All key 
 * specifications must implement this interface.
 */
public interface KeySpec {

}
