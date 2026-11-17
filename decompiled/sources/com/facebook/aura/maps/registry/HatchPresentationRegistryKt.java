package com.facebook.aura.maps.registry;

import X.AnonymousClass003;
import X.FGI;
import com.facebook.aura.maps.model.HatchMapScene;

/* loaded from: classes4.dex */
public abstract class HatchPresentationRegistryKt {
    public static final String hatchPresentationKey(String str, HatchMapScene hatchMapScene) {
        AnonymousClass003.A0u(str, hatchMapScene);
        return str.length() == 0 ? FGI.A0H("restored:", hatchMapScene.hashCode()) : str;
    }
}
