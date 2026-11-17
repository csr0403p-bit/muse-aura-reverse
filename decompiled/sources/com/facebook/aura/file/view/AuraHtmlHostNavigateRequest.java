package com.facebook.aura.file.view;

import X.AnonymousClass003;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class AuraHtmlHostNavigateRequest {
    public static final int $stable = 8;
    public final JsonObject params;
    public final String target;

    public final JsonObject getParams() {
        return this.params;
    }

    public final String getTarget() {
        return this.target;
    }

    public AuraHtmlHostNavigateRequest(String str, JsonObject jsonObject) {
        AnonymousClass003.A0u(str, jsonObject);
        this.target = str;
        this.params = jsonObject;
    }
}
