package com.facebook.aura.localbrowser;

import X.AbstractC7609F5w;
import X.C7438Evz;
import X.G0U;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes6.dex */
public final /* synthetic */ class ManagedBrowserDecoder$action$required$5 extends C7438Evz implements G0U<JsonElement, Boolean> {
    public ManagedBrowserDecoder$action$required$5(Object obj) {
        super(1, obj, ManagedBrowserDecoder.class, "nonnegative", "nonnegative(Lkotlinx/serialization/json/JsonElement;)Z", 0);
    }

    @Override // X.G0U
    public final Boolean invoke(JsonElement jsonElement) {
        return Boolean.valueOf(AbstractC7609F5w.A0Z(jsonElement, this).nonnegative(jsonElement));
    }
}
