/**
 * Copyright 2009-2018 PrimeTek.
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
 */
package org.primefaces.component.inputmask;

import javax.faces.component.html.HtmlInputText;

import org.primefaces.component.api.Widget;
import org.primefaces.util.ComponentUtils;


abstract class InputMaskBase extends HtmlInputText implements Widget {

    public static final String COMPONENT_FAMILY = "org.primefaces.component";

    public static final String DEFAULT_RENDERER = "org.primefaces.component.InputMaskRenderer";

    public enum PropertyKeys {

        placeholder,
        widgetVar,
        mask,
        slotChar,
        autoClear,
        type
    }

    public InputMaskBase() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getPlaceholder() {
        return (String) getStateHelper().eval(PropertyKeys.placeholder, null);
    }

    public void setPlaceholder(String placeholder) {
        getStateHelper().put(PropertyKeys.placeholder, placeholder);
    }

    public String getWidgetVar() {
        return (String) getStateHelper().eval(PropertyKeys.widgetVar, null);
    }

    public void setWidgetVar(String widgetVar) {
        getStateHelper().put(PropertyKeys.widgetVar, widgetVar);
    }

    public String getMask() {
        return (String) getStateHelper().eval(PropertyKeys.mask, null);
    }

    public void setMask(String mask) {
        getStateHelper().put(PropertyKeys.mask, mask);
    }

    public String getSlotChar() {
        return (String) getStateHelper().eval(PropertyKeys.slotChar, null);
    }

    public void setSlotChar(String slotChar) {
        getStateHelper().put(PropertyKeys.slotChar, slotChar);
    }

    public boolean isAutoClear() {
        return (Boolean) getStateHelper().eval(PropertyKeys.autoClear, true);
    }

    public void setAutoClear(boolean autoClear) {
        getStateHelper().put(PropertyKeys.autoClear, autoClear);
    }

    public String getType() {
        return (String) getStateHelper().eval(PropertyKeys.type, "text");
    }

    public void setType(String type) {
        getStateHelper().put(PropertyKeys.type, type);
    }

    @Override
    public String resolveWidgetVar() {
        return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
    }
}