package com.facebook.aura.maps;

import X.AFR;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C9n4;

/* loaded from: classes4.dex */
public final class HatchMapNavigationController {
    public static final int $stable = 0;
    public AFR retainedMap;
    public C9n4 session;

    public final boolean detachMap$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(C9n4 c9n4) {
        C7384Etj.A0Y(c9n4, 0);
        if (this.session != c9n4) {
            return false;
        }
        this.session = null;
        this.retainedMap = null;
        return true;
    }

    public final AFR getRetainedMap$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl() {
        return this.retainedMap;
    }

    public final C9n4 getSession() {
        return this.session;
    }

    public final void attachMap$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(AFR afr, C9n4 c9n4) {
        AnonymousClass003.A0u(afr, c9n4);
        this.retainedMap = afr;
        this.session = c9n4;
    }
}
