package com.facebook.aura.gateway.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass801;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public class GatewayEventHandlerStatic {
    public static int[] getKeys() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static boolean handle(int i, String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        return AnonymousClass801.A0k(i, str, jsonObject, abstractC3358CGz);
    }
}
