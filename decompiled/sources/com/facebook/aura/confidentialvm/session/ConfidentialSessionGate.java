package com.facebook.aura.confidentialvm.session;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06H;
import X.C1BO;
import X.C20Q;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.GDB;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;

/* loaded from: classes2.dex */
public final class ConfidentialSessionGate implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final C20Q<Boolean> isConfidentialVmFlow;
    public final C20Q<Boolean> isStandardVmFlow;
    public final AbstractC3358CGz userSession;

    /* loaded from: classes.dex */
    public final class Companion {
        public final ConfidentialSessionGate getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialSessionGate) abstractC3358CGz.A03(ConfidentialSessionGate.class, new ConfidentialSessionGate$Companion$getInstance$1(abstractC3358CGz));
        }

        public final boolean rememberIsConfidentialVm(BFM bfm, int i) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = ConfidentialSessionGate.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            ConfidentialSessionGate confidentialSessionGate = (ConfidentialSessionGate) objAaT;
            C20Q<Boolean> c20q = confidentialSessionGate.isConfidentialVmFlow;
            boolean zA652 = bfm.A65(confidentialSessionGate);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass001.A0j(bfm, confidentialSessionGate.isConfidentialVm());
            }
            return C1BO.A0F(C2CK.A01(bfm, null, objAaT2, c20q, 0, 14));
        }

        public final boolean rememberShouldHideUnsupportedCvmFeatures(BFM bfm, int i) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0j(bfm, ConfidentialSessionGate.Companion.getInstance(abstractC3358CGzA0h).getShouldHideUnsupportedCvmFeatures());
            }
            return AnonymousClass001.A1X(objAaT);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final HatchGatewayPrefsStore getPrefsStore() {
        return HatchGatewayPrefsStore.Companion.getInstance(this.userSession);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final C20Q<Boolean> isConfidentialVmFlow() {
        return this.isConfidentialVmFlow;
    }

    public final C20Q<Boolean> isStandardVmFlow() {
        return this.isStandardVmFlow;
    }

    public ConfidentialSessionGate(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.isConfidentialVmFlow = GDB.A01(new ConfidentialSessionGate$special$$inlined$map$1(getPrefsStore().vmConfidentialityFlow));
        this.isStandardVmFlow = GDB.A01(new ConfidentialSessionGate$special$$inlined$map$2(getPrefsStore().vmConfidentialityFlow));
    }

    public final boolean getShouldHideUnsupportedCvmFeatures() {
        return AnonymousClass002.A1Z(getPrefsStore().getSelectedServerVmType(), HatchlingVmType.HATCH_CVM);
    }

    public final boolean isConfidentialVm() {
        return AnonymousClass002.A1Z(getPrefsStore().getVmConfidentiality(), HatchVmConfidentiality.CONFIDENTIAL);
    }

    public final boolean isConfidentialVmForAnalyticsMode() {
        return isConfidentialVm() || getPrefsStore().getSelectedServerVmType() == HatchlingVmType.HATCH_CVM;
    }

    public final boolean isStandardVm() {
        return AnonymousClass002.A1Z(getPrefsStore().getVmConfidentiality(), HatchVmConfidentiality.STANDARD);
    }

    public /* synthetic */ ConfidentialSessionGate(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
