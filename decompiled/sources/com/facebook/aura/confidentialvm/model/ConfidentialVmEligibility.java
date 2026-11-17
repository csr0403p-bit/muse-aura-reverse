package com.facebook.aura.confidentialvm.model;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C4oT;
import X.C7384Etj;
import X.C9286GCn;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;

/* loaded from: classes.dex */
public final class ConfidentialVmEligibility implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String KEY_NOT_ELIGIBLE_VM_ID = "hatch_cvm_not_eligible_vm_id";
    public static final String STATE_ELIGIBLE = "ELIGIBLE";
    public final BLG<Boolean> _isNotEligibleOnCvm;
    public boolean cleared;
    public volatile Boolean isLiveNotEligible;
    public final C1BN<Boolean> isNotEligibleOnCvm;
    public final C4oT prefs;

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.cleared = true;
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.Aae(KEY_NOT_ELIGIBLE_VM_ID);
        bzKA9q.apply();
        this.isLiveNotEligible = null;
        AnonymousClass003.A14(this._isNotEligibleOnCvm, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x004f, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0011, B:11:0x001b, B:14:0x0021, B:16:0x002f, B:18:0x0037, B:19:0x003a, B:21:0x0049, B:20:0x003d), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onLiveVmList$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_model_model(com.facebook.aura.gateway.intf.HatchLiveVmList r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r5.cleared     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L4d
            java.lang.String r1 = r6.cvmEligibilityState     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r6.isConfidentialVmSelected     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L1a
            if (r1 == 0) goto L1a
            java.lang.String r0 = "ELIGIBLE"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L4f
            r4 = 1
            if (r0 == 0) goto L1b
        L1a:
            r4 = 0
        L1b:
            java.lang.String r3 = r6.selectedVmId     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            if (r4 != 0) goto L21
            r3 = r2
        L21:
            X.4oT r0 = r5.prefs     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "hatch_cvm_not_eligible_vm_id"
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L4f
            boolean r0 = X.C7384Etj.areEqual(r0, r3)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L3d
            X.4oT r0 = r5.prefs     // Catch: java.lang.Throwable -> L4f
            X.BzK r0 = r0.A9q()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L49
            r0.AYr(r1, r3)     // Catch: java.lang.Throwable -> L4f
        L3a:
            r0.apply()     // Catch: java.lang.Throwable -> L4f
        L3d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L4f
            r5.isLiveNotEligible = r1     // Catch: java.lang.Throwable -> L4f
            X.BLG<java.lang.Boolean> r0 = r5._isNotEligibleOnCvm     // Catch: java.lang.Throwable -> L4f
            X.AnonymousClass001.A1E(r0, r2, r1)     // Catch: java.lang.Throwable -> L4f
            goto L4d
        L49:
            r0.Aae(r1)     // Catch: java.lang.Throwable -> L4f
            goto L3a
        L4d:
            monitor-exit(r5)
            return
        L4f:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmEligibility.onLiveVmList$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_model_model(com.facebook.aura.gateway.intf.HatchLiveVmList):void");
    }

    public final Boolean isLiveNotEligible() {
        return this.isLiveNotEligible;
    }

    public final C1BN<Boolean> isNotEligibleOnCvm() {
        return this.isNotEligibleOnCvm;
    }

    public final class Companion {
        public final ConfidentialVmEligibility getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmEligibility) abstractC3358CGz.A03(ConfidentialVmEligibility.class, new ConfidentialVmEligibility$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ConfidentialVmEligibility(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public ConfidentialVmEligibility(AbstractC3358CGz abstractC3358CGz) {
        C4oT c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        this.prefs = c4oTUserPrefs;
        String hatcheryVMId = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getHatcheryVMId();
        boolean z = false;
        if (hatcheryVMId != null && hatcheryVMId.equals(c4oTUserPrefs.getString(KEY_NOT_ELIGIBLE_VM_ID, null))) {
            z = true;
        }
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(z);
        this._isNotEligibleOnCvm = c9286GCnA0v;
        this.isNotEligibleOnCvm = C3Pi.A00(c9286GCnA0v);
    }
}
