package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class JarvisProtocol$parseIdeaWidgetData$iconVariant$1 extends AbstractC7559F3s implements G0U<JsonElement, JsonObject> {
    public static final JarvisProtocol$parseIdeaWidgetData$iconVariant$1 INSTANCE = new JarvisProtocol$parseIdeaWidgetData$iconVariant$1();

    public JarvisProtocol$parseIdeaWidgetData$iconVariant$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ JsonObject invoke(JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        C7384Etj.A0Y(jsonElement2, 0);
        return JsonObjectExtensionsKt.asJsonObjectOrNull(jsonElement2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final JsonObject invoke2(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return JsonObjectExtensionsKt.asJsonObjectOrNull(jsonElement);
    }
}
