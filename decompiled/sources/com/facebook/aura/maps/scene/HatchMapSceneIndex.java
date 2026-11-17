package com.facebook.aura.maps.scene;

import X.AnonymousClass005;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.maps.model.HatchMapElement;
import com.facebook.aura.maps.model.HatchMapScene;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchMapSceneIndex {
    public static final int $stable = 8;
    public final Map<String, HatchMapElement> elementsByArtifactId;

    public HatchMapSceneIndex(HatchMapScene hatchMapScene) {
        C7384Etj.A0Y(hatchMapScene, 0);
        List<HatchMapElement> list = hatchMapScene.elements;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (HatchMapElement hatchMapElement : list) {
            linkedHashMapA15.put(hatchMapElement.getArtifactId(), hatchMapElement);
        }
        this.elementsByArtifactId = linkedHashMapA15;
    }

    public final HatchMapElement element(String str) {
        C7384Etj.A0Y(str, 0);
        return this.elementsByArtifactId.get(str);
    }
}
