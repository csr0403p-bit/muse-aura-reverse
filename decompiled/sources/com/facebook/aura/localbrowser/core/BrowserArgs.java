package com.facebook.aura.localbrowser.core;

import X.AbstractC7610F5x;
import X.C7384Etj;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public final class BrowserArgs {
    public static final int $stable = 8;
    public final Map<String, Object> values;

    public BrowserArgs(Map<String, ? extends Object> map) {
        C7384Etj.A0Y(map, 0);
        this.values = map;
    }

    public final JsonArray array(String str) {
        Object objA0q = AbstractC7610F5x.A0q(this, str);
        if (objA0q instanceof JsonArray) {
            return (JsonArray) objA0q;
        }
        return null;
    }

    /* renamed from: boolean, reason: not valid java name */
    public final Boolean m1243boolean(String str) {
        Object objA0q = AbstractC7610F5x.A0q(this, str);
        if (objA0q instanceof Boolean) {
            return (Boolean) objA0q;
        }
        return null;
    }

    /* renamed from: long, reason: not valid java name */
    public final Long m1244long(String str) {
        Object objA0q = AbstractC7610F5x.A0q(this, str);
        if (objA0q instanceof Long) {
            return (Long) objA0q;
        }
        return null;
    }

    public final Double number(String str) {
        Object objA0q = AbstractC7610F5x.A0q(this, str);
        if (objA0q instanceof Double) {
            return (Double) objA0q;
        }
        return null;
    }

    public final JsonObject objectValue(String str) {
        Object objA0q = AbstractC7610F5x.A0q(this, str);
        if (objA0q instanceof JsonObject) {
            return (JsonObject) objA0q;
        }
        return null;
    }

    public final String string(String str) {
        Object objA0q = AbstractC7610F5x.A0q(this, str);
        if (objA0q instanceof String) {
            return (String) objA0q;
        }
        return null;
    }
}
