package com.facebook.aura.file.view;

import X.AnonymousClass003;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class AuraHtmlHostCallRequest {
    public static final int $stable = 8;
    public final String action;
    public final JsonObject payload;

    public final String getAction() {
        return this.action;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }

    public AuraHtmlHostCallRequest(String str, JsonObject jsonObject) {
        AnonymousClass003.A0u(str, jsonObject);
        this.action = str;
        this.payload = jsonObject;
    }
}
