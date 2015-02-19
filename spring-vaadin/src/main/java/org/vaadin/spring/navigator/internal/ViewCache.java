/*
 * Copyright 2015 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.navigator.internal;

import com.vaadin.navigator.View;
import org.vaadin.spring.internal.BeanStore;

import java.io.Serializable;

/**
 * A view cache is used to keep track of the currently active {@link com.vaadin.navigator.View view} and its
 * corresponding {@link org.vaadin.spring.internal.BeanStore}. It is also responsible for cleaning up views that have gone
 * out of scope. Used as a delegate by {@link org.vaadin.spring.navigator.internal.VaadinViewScope}.
 * For internal use only.
 *
 * @author Petter Holmström (petter@vaadin.com)
 */
public interface ViewCache extends Serializable {

    /**
     * Called by the view provider before a view with the specified name will be created.
     *
     * @param viewName the name of the view (not the name of the Spring bean).
     * @see org.vaadin.spring.navigator.annotation.VaadinView#name()
     */
    void creatingView(String viewName);

    /**
     * Called by the view provider after a view with the specified name has been created.
     *
     * @param viewName     the name of the view (not the name of the Spring bean).
     * @param viewInstance the created view instance, or {@code null} if the instance could not be created for some reason.
     * @see org.vaadin.spring.navigator.annotation.VaadinView#name()
     */
    void viewCreated(String viewName, View viewInstance);

    /**
     * Returns the bean store for the currently active view.
     *
     * @throws java.lang.IllegalStateException if there is no active view.
     */
    BeanStore getCurrentViewBeanStore() throws IllegalStateException;
}
