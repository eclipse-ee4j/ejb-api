/*
 * Copyright (c) 2006, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ejb;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Declares a concurrency lock for a singleton session bean with container managed concurrency.
 *
 * <p>
 * This annotation may be specified on the bean class, the business methods of the bean class or both. Specifying the
 * annotation on a business method overrides the value specified at class level, if any.
 *
 * <p>
 * If this annotation is not used, a value of <code>Lock(WRITE)</code> is assumed.
 *
 * @since EJB 3.1
 */

@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface Lock {

    LockType value() default LockType.WRITE;

}
