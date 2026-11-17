package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass801;
import X.C06H;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.intf.HatchLiveVmList;

/* loaded from: classes4.dex */
public final class HatchLiveVmListPublisher implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean cleared;
    public final AbstractC3358CGz userSession;

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.cleared = true;
    }

    public final synchronized void publish$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(HatchLiveVmList hatchLiveVmList) {
        C7384Etj.A0Y(hatchLiveVmList, 0);
        if (!this.cleared && AuraSessionManager.INSTANCE.isCurrentSession(this.userSession)) {
            AnonymousClass801.A0c(new int[]{0}[0], this.userSession, hatchLiveVmList);
        }
    }

    public final class Companion {
        public final HatchLiveVmListPublisher getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchLiveVmListPublisher) abstractC3358CGz.A03(HatchLiveVmListPublisher.class, new HatchLiveVmListPublisher$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchLiveVmListPublisher(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public /* synthetic */ HatchLiveVmListPublisher(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
