package com.facebook.aura.gateway;

import X.AGH;
import X.AnonymousClass002;
import X.C3cG;
import X.C7BY;
import X.HxE;
import com.facebook.aura.model.AvatarVideoVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class HatchStatusVideoCacheKt {
    public static final HatchStatusVideoPathsJson toJson(Map<AvatarVideoVariant, String> map) {
        return new HatchStatusVideoPathsJson(map.get(AvatarVideoVariant.IDLE), map.get(AvatarVideoVariant.WORKING), map.get(AvatarVideoVariant.MAKING_SOMETHING), map.get(AvatarVideoVariant.CONNECTING), map.get(AvatarVideoVariant.WAKING), null);
    }

    public static final Map<AvatarVideoVariant, String> toMap(HatchStatusVideoPathsJson hatchStatusVideoPathsJson) {
        Map mapA0D = AGH.A0D(C3cG.A0r(AvatarVideoVariant.IDLE, hatchStatusVideoPathsJson.idle), C3cG.A0r(AvatarVideoVariant.WORKING, hatchStatusVideoPathsJson.working), C3cG.A0r(AvatarVideoVariant.MAKING_SOMETHING, hatchStatusVideoPathsJson.making_something), C3cG.A0r(AvatarVideoVariant.CONNECTING, hatchStatusVideoPathsJson.connecting), C3cG.A0r(AvatarVideoVariant.WAKING, hatchStatusVideoPathsJson.waking));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(mapA0D);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            if (str != null && !C7BY.A0j(str)) {
                arrayListA0h.add(new HxE(key, str));
            }
        }
        return AGH.A06(arrayListA0h);
    }
}
