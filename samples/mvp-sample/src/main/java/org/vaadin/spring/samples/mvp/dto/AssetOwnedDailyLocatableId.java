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
package org.vaadin.spring.samples.mvp.dto;

import java.io.Serializable;

/**
 * Uniquely identifies an instrument by asset owner, operating day and location
 * name
 *
 * @author cphillipson
 */
public class AssetOwnedDailyLocatableId implements Serializable {

    private static final long serialVersionUID = 1L;

    private String location;

    private String day;

    private String assetOwner;

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public String getDay() {
        return day;
    }

    public void setDay(final String day) {
        this.day = day;
    }

    public String getAssetOwner() {
        return assetOwner;
    }

    public void setAssetOwner(final String assetOwner) {
        this.assetOwner = assetOwner;
    }

}

