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
package org.vaadin.spring.samples.mvp.ui;

import javax.inject.Inject;

import org.vaadin.spring.events.EventBus;
import org.vaadin.spring.samples.mvp.ui.presenter.Action;
import org.vaadin.spring.samples.mvp.ui.presenter.MainPresenter;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI(path = "/ui")
@Theme("valo")
@Title("Market User Interface")
public class MvpUI extends UI {

    private static final long serialVersionUID = 1L;

    @Inject
    EventBus.SessionEventBus eventBus;

    @Inject
    MainPresenter presenter;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        eventBus.publish(this, Action.START);
        setContent(presenter.getView());
    }

}
