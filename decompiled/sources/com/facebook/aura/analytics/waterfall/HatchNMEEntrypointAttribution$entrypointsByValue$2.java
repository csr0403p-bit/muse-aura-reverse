package com.facebook.aura.analytics.waterfall;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C98f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchNMEEntrypointAttribution$entrypointsByValue$2 extends AbstractC7559F3s implements Function0<Map<String, ? extends C98f>> {
    public static final HatchNMEEntrypointAttribution$entrypointsByValue$2 INSTANCE = new HatchNMEEntrypointAttribution$entrypointsByValue$2();

    public HatchNMEEntrypointAttribution$entrypointsByValue$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends C98f> invoke() {
        C98f[] c98fArrValues = C98f.values();
        ArrayList arrayListA0h = C3cG.A0h();
        for (C98f c98f : c98fArrValues) {
            if (c98f != C98f.A05) {
                arrayListA0h.add(c98f);
            }
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0h));
        for (Object obj : arrayListA0h) {
            linkedHashMapA15.put(((C98f) obj).mValue, obj);
        }
        return linkedHashMapA15;
    }
}
