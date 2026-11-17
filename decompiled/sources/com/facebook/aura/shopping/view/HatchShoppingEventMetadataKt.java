package com.facebook.aura.shopping.view;

import X.AGI;
import X.AIW;
import X.AnonymousClass001;
import X.BO6;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class HatchShoppingEventMetadataKt {
    public static final BO6<String, String> shoppingEventMetadata(String str, Map<String, String> map) {
        C7384Etj.A0Y(map, 1);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(map);
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.HOST_MESSAGE_ID, str, c0924AIaA0u);
        }
        BO6<String, String> bo6A08 = AGI.A08(AIW.A0K(c0924AIaA0u));
        if (bo6A08.isEmpty()) {
            return null;
        }
        return bo6A08;
    }
}
