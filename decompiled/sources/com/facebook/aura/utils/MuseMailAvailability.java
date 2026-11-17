package com.facebook.aura.utils;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C0981AMm;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;

/* loaded from: classes.dex */
public final class MuseMailAvailability implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final C0981AMm<String, Boolean> enabledByEnvironment;
    public final HatchGatewayPrefsStore prefs;

    public final void record(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.enabledByEnvironment.put(str, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.enabledByEnvironment.clear();
    }

    public final boolean isEnabled() {
        String hatcheryVMId = this.prefs.getHatcheryVMId();
        if (hatcheryVMId == null) {
            return false;
        }
        return AnonymousClass001.A0i().equals(this.enabledByEnvironment.get(hatcheryVMId));
    }

    public final class Companion {
        public final MuseMailAvailability getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (MuseMailAvailability) abstractC3358CGz.A03(MuseMailAvailability.class, new MuseMailAvailability$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ MuseMailAvailability(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public MuseMailAvailability(AbstractC3358CGz abstractC3358CGz) {
        this.prefs = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz);
        this.enabledByEnvironment = new C0981AMm<>();
    }
}
