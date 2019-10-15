/*
 * Copyright @ 2018 - present 8x8, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jitsi.utils.config;

import org.jitsi.utils.config.validation.*;

import java.lang.annotation.*;

/**
 * Denote that a configuration property is obsolete and no longer used
 *
 * See {@link ConfigValidator#checkForDefinedObsoleteProperties()}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ObsoleteConfig
{
    /**
     * A deprecation message which can be provided when using the annotation
     * @return the deprecation message
     */
    String value();
}