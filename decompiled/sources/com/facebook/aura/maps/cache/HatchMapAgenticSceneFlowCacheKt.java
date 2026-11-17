package com.facebook.aura.maps.cache;

import X.C7384Etj;
import X.C7BY;
import X.C9VN;
import X.C9VY;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class HatchMapAgenticSceneFlowCacheKt {
    public static final String supportingImageUrl(C9VN c9vn) {
        C9VY next;
        C7384Etj.A0Y(c9vn, 0);
        Iterator<C9VY> it = c9vn.A0J.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C9VY c9vy = next;
            String str = c9vy.A02;
            if (str != null && !C7BY.A0j(str) && !"video".equalsIgnoreCase(c9vy.A01)) {
                break;
            }
        }
        C9VY c9vy2 = next;
        if (c9vy2 != null) {
            return c9vy2.A02;
        }
        return null;
    }
}
