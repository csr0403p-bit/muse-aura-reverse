package com.facebook.aura.maps;

import X.AnonymousClass006;
import X.C3cG;
import X.FGI;
import com.facebook.aura.maps.model.HatchMapScene;

/* loaded from: classes4.dex */
public abstract class HatchNativeMapRendererKt {
    public static final String mapInstanceId(String str, String str2, HatchMapScene hatchMapScene) {
        if (str2.length() == 0) {
            str2 = FGI.A0H("restored:", hatchMapScene.hashCode());
        }
        return AnonymousClass006.A0y(str2, ":", C3cG.A0g(str));
    }
}
