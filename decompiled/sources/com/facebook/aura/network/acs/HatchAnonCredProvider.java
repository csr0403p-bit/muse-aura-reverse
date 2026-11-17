package com.facebook.aura.network.acs;

import X.A7z;
import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.HtJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes4.dex */
public final class HatchAnonCredProvider implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final byte[] EMPTY_DATA = new byte[0];
    public static final String PROJECT_NAME = "HATCH_CVMProvisioning";
    public static final boolean REQUEST_PROOF = true;
    public final A7z anonCredProvider;

    /* renamed from: fetchAndRedeem-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ Object m1583fetchAndRedeemgIAlus$default(HatchAnonCredProvider hatchAnonCredProvider, byte[] bArr, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = EMPTY_DATA;
        }
        return hatchAnonCredProvider.m1584fetchAndRedeemgIAlus(bArr, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* renamed from: fetchAndRedeem-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1584fetchAndRedeemgIAlus(byte[] r13, X.HtJ<? super X.HsJ<? extends X.A8F>> r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.acs.HatchAnonCredProvider.m1584fetchAndRedeemgIAlus(byte[], X.HtJ):java.lang.Object");
    }

    public final void reset() {
        this.anonCredProvider.A03.A04();
    }

    public final class Companion {
        public final HatchAnonCredProvider getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAnonCredProvider) abstractC3358CGz.A03(HatchAnonCredProvider.class, new HatchAnonCredProvider$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAnonCredProvider(AbstractC3358CGz abstractC3358CGz) {
        this.anonCredProvider = new A7z(HatchAcsConfigFetcher.INSTANCE, HatchPrefsStore.INSTANCE.acsTokenPrefs(abstractC3358CGz), new HatchAcsTokenFetcher(true));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        reset();
    }

    public /* synthetic */ HatchAnonCredProvider(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
