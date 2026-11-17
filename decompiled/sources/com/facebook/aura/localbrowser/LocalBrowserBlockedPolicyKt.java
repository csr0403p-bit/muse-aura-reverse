package com.facebook.aura.localbrowser;

import X.AbstractC2159Azp;
import X.AnonymousClass003;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class LocalBrowserBlockedPolicyKt {
    public static final JsonObject policyReceipt(byte[] bArr, String str) {
        JsonObject jsonObject;
        AnonymousClass003.A0u(bArr, str);
        JsonElement jsonElementA04 = HatchJsonKt.HatchJson.A04(AbstractC2159Azp.A10(bArr, bArr.length));
        if (!(jsonElementA04 instanceof JsonObject) || (jsonObject = (JsonObject) jsonElementA04) == null) {
            throw new SerializationException("Invalid policy object");
        }
        if (str.equals(LocalBrowserEndpointKt.optionalString(jsonObject, "browser_instance_id"))) {
            return jsonObject;
        }
        throw new SerializationException("Policy runtime mismatch");
    }
}
