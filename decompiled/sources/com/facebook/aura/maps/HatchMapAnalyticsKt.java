package com.facebook.aura.maps;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.maps.model.HatchMapElement;
import com.facebook.aura.maps.model.HatchMapPlace;
import com.facebook.aura.maps.model.HatchMapScene;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class HatchMapAnalyticsKt {
    public static final HatchScreen getAnalyticsScreen(HatchMapDisplayMode hatchMapDisplayMode) {
        C7384Etj.A0Y(hatchMapDisplayMode, 0);
        int iOrdinal = hatchMapDisplayMode.ordinal();
        if (iOrdinal == 0) {
            return HatchScreen.INLINE_MAP;
        }
        if (iOrdinal == 1) {
            return HatchScreen.FULL_SCREEN_MAP;
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchMapDisplayMode.values().length];
            try {
                AnonymousClass002.A13(HatchMapDisplayMode.INLINE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchMapDisplayMode.FULLSCREEN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String analyticsId(HatchMapScene hatchMapScene, String str) {
        HatchMapElement next;
        AnonymousClass003.A0u(hatchMapScene, str);
        Iterator<HatchMapElement> it = hatchMapScene.elements.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.getArtifactId())) {
                break;
            }
        }
        HatchMapElement hatchMapElement = next;
        return hatchMapElement instanceof HatchMapPlace ? ((HatchMapPlace) hatchMapElement).placeId : hatchMapElement != null ? hatchMapElement.getId() : str;
    }
}
