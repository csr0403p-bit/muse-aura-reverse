package com.facebook.aura.localbrowser.core;

import X.C7384Etj;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class BrowserEngineCloseReceipt {
    public static final int $stable = 8;
    public final boolean closed;
    public final JsonObject payload;

    public BrowserEngineCloseReceipt(JsonObject jsonObject, boolean z) {
        C7384Etj.A0Y(jsonObject, 0);
        this.payload = jsonObject;
        this.closed = z;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }
}
