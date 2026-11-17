package com.facebook.aura.model;

import X.AGH;
import X.AIW;
import X.AbstractC0878AGe;
import X.C0881AGi;
import X.HxE;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AvatarMediaSelectionKt {
    public static final List<String> select(AppearancePaths appearancePaths, boolean z) {
        if (!z) {
            return appearancePaths.light;
        }
        return AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(appearancePaths.light, appearancePaths.dark));
    }

    public static final Map<AvatarVideoVariant, AppearancePaths> withConnectingFallback(Map<AvatarVideoVariant, AppearancePaths> map) {
        AppearancePaths appearancePaths = map.get(AvatarVideoVariant.IDLE);
        if (appearancePaths == null) {
            return map;
        }
        AvatarVideoVariant avatarVideoVariant = AvatarVideoVariant.CONNECTING;
        AppearancePaths appearancePaths2 = map.get(avatarVideoVariant);
        if (appearancePaths2 == null) {
            C0881AGi c0881AGi = C0881AGi.A00;
            appearancePaths2 = new AppearancePaths(c0881AGi, c0881AGi);
        }
        List<String> list = appearancePaths2.dark;
        if (list.isEmpty()) {
            list = appearancePaths.dark;
        }
        List<String> list2 = appearancePaths2.light;
        if (list2.isEmpty()) {
            list2 = appearancePaths.light;
        }
        return AGH.A0C(map, new HxE(avatarVideoVariant, new AppearancePaths(list, list2)));
    }

    public static final Map<AvatarVideoVariant, List<String>> select(Map<AvatarVideoVariant, AppearancePaths> map, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(map.size()));
        for (Map.Entry<AvatarVideoVariant, AppearancePaths> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), select(entry.getValue(), z));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((List) entry2.getValue()).isEmpty()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.SelectedAvatarMedia select(com.facebook.aura.model.AvatarMedia r5, boolean r6) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            com.facebook.aura.model.AppearancePaths r0 = r5.still
            java.util.List r1 = select(r0, r6)
            if (r6 == 0) goto L17
            com.facebook.aura.model.AppearancePaths r0 = r5.still
            java.util.List<java.lang.String> r0 = r0.dark
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 == 0) goto L18
        L17:
            r2 = 0
        L18:
            java.util.Map<com.facebook.aura.model.AvatarVideoVariant, com.facebook.aura.model.AppearancePaths> r0 = r5.videos
            java.util.Map r0 = withConnectingFallback(r0)
            java.util.Map r3 = select(r0, r6)
            java.util.Map<com.facebook.aura.model.AvatarVideoVariant, com.facebook.aura.model.AppearancePaths> r0 = r5.startFrames
            java.util.Map r4 = select(r0, r6)
            com.facebook.aura.model.AppearancePaths r0 = r5.callIdle
            java.util.List r5 = select(r0, r6)
            com.facebook.aura.model.SelectedAvatarMedia r0 = new com.facebook.aura.model.SelectedAvatarMedia
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.AvatarMediaSelectionKt.select(com.facebook.aura.model.AvatarMedia, boolean):com.facebook.aura.model.SelectedAvatarMedia");
    }
}
