package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C20Q;
import X.C7384Etj;
import X.C9286GCn;
import X.GDB;
import X.InterfaceC7549F2g;

/* loaded from: classes3.dex */
public final class HatchVmStateStore implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _isStarting;
    public final C20Q<Boolean> isStarting;

    public final void clearStarting$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        AnonymousClass004.A1D(false, this._isStarting);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass004.A1D(false, this._isStarting);
    }

    public final C20Q<Boolean> isStarting() {
        return this.isStarting;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStarting$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(boolean r3) {
        /*
            r2 = this;
            X.BLG<java.lang.Boolean> r2 = r2._isStarting
            if (r3 == 0) goto Ld
            com.facebook.aura.utils.HatchUtils r0 = com.facebook.aura.utils.HatchUtils.INSTANCE
            boolean r1 = r0.isFreshningStateEnabled()
            r0 = 1
            if (r1 != 0) goto Le
        Ld:
            r0 = 0
        Le:
            X.AnonymousClass004.A1D(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmStateStore.setStarting$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(boolean):void");
    }

    public final class Companion {
        public final HatchVmStateStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVmStateStore) abstractC3358CGz.A03(HatchVmStateStore.class, HatchVmStateStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchVmStateStore(C06H c06h) {
        this();
    }

    public HatchVmStateStore() {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isStarting = c9286GCnA0v;
        this.isStarting = GDB.A01(new HatchVmStateStore$special$$inlined$map$1(c9286GCnA0v));
    }
}
