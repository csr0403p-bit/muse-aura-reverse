package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BGK;
import X.BzK;
import X.C3cG;
import X.C4oT;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.HxE;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.model.AppearancePaths;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarVideoVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class HatchStatusVideoCache {
    public static final int $stable = 8;
    public final HatchGatewayPrefsStore gatewayPrefs;
    public final C4oT prefs;
    public final AbstractC3358CGz userSession;

    public HatchStatusVideoCache(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.prefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        this.gatewayPrefs = C3cG.A0D(abstractC3358CGz);
    }

    private final String cacheKey(String str) {
        return FGI.A0M("status_video_paths:", str);
    }

    public static final Map<AvatarVideoVariant, String> store$paths(AvatarMedia avatarMedia, G0U<? super AppearancePaths, ? extends List<String>> g0u) {
        Map<AvatarVideoVariant, AppearancePaths> map = avatarMedia.videos;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            Object key = entry.getKey();
            Object objA0G = AbstractC0878AGe.A0G(g0u.invoke(entry.getValue()));
            if (objA0G != null) {
                arrayListA0h.add(new HxE(key, objA0G));
            }
        }
        return AGH.A06(arrayListA0h);
    }

    public final Map<AvatarVideoVariant, AppearancePaths> loadPaths() {
        HatchStatusVideoPathsJson hatchStatusVideoPathsJsonDecodeStatusVideoPaths;
        Map mapA0E;
        String strA0a = C3cG.A0a(this.gatewayPrefs);
        if (strA0a == null) {
            strA0a = this.gatewayPrefs.getGatewayUrl();
        }
        String strA00 = C4oT.A00(this.prefs, FGI.A0M("status_video_paths:", strA0a));
        if (strA00 == null || (hatchStatusVideoPathsJsonDecodeStatusVideoPaths = HatchStatusVideoCacheJsonKt.decodeStatusVideoPaths(strA00)) == null) {
            return AGH.A0E();
        }
        Map<AvatarVideoVariant, String> map = HatchStatusVideoCacheKt.toMap(hatchStatusVideoPathsJsonDecodeStatusVideoPaths);
        HatchStatusVideoPathsJson hatchStatusVideoPathsJson = hatchStatusVideoPathsJsonDecodeStatusVideoPaths.dark;
        if (hatchStatusVideoPathsJson == null || (mapA0E = HatchStatusVideoCacheKt.toMap(hatchStatusVideoPathsJson)) == null) {
            mapA0E = AGH.A0E();
        }
        LinkedHashSet linkedHashSetA01 = BGK.A01(mapA0E.keySet(), map.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(linkedHashSetA01));
        Iterator it = linkedHashSetA01.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, new AppearancePaths(AbstractC0885AGm.A0z(mapA0E.get(next)), AbstractC0885AGm.A0z(map.get(next))));
        }
        return linkedHashMap;
    }

    public final void store$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, AvatarMedia avatarMedia) {
        AnonymousClass003.A0u(str, avatarMedia);
        Map<AvatarVideoVariant, String> mapStore$paths = store$paths(avatarMedia, HatchStatusVideoCache$store$dark$1.INSTANCE);
        HatchStatusVideoPathsJson json = HatchStatusVideoCacheKt.toJson(store$paths(avatarMedia, HatchStatusVideoCache$store$cached$1.INSTANCE));
        HatchStatusVideoPathsJson hatchStatusVideoPathsJson = new HatchStatusVideoPathsJson(json.idle, json.working, json.making_something, json.connecting, json.waking, mapStore$paths.isEmpty() ? null : HatchStatusVideoCacheKt.toJson(mapStore$paths));
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.AYr(FGI.A0M("status_video_paths:", str), HatchStatusVideoCacheJsonKt.encodeStatusVideoPaths(hatchStatusVideoPathsJson));
        bzKA9q.apply();
    }
}
