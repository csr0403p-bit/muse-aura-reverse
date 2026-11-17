package com.facebook.aura.appid;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes5.dex */
public final class AuraAppId {
    public static final AuraAppId INSTANCE = new AuraAppId();

    public final String getAbraAppId() {
        return "944424684749591";
    }

    public final String getAppClientToken() {
        return "330bd45681a06ad240322862d206c0be";
    }

    public final String getAppId() {
        return "4331325740476680";
    }

    public final String getAppName() {
        return "AuraForAndroid";
    }

    @Deprecated(message = "Legacy \u2014 only used by AuthLite/CrudoNet. Use getAbraAppId() for new code.", replaceWith = @ReplaceWith(expression = "getAbraAppId()", imports = {}))
    public final String getArAppId() {
        return "1237225311881278";
    }

    public final String getFrlAppId() {
        return "4387961628157459";
    }

    public final String getPushAppId() {
        return "944424684749591";
    }
}
