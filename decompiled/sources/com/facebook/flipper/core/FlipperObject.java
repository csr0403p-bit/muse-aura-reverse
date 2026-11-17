package com.facebook.flipper.core;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class FlipperObject {
    public final JSONObject A00;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.A00.toString().equals(obj.toString());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public FlipperObject(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }
}
