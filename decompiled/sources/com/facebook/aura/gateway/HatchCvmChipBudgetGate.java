package com.facebook.aura.gateway;

import X.A3q;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BGK;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchCvmReplacement;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchCvmChipBudgetGate implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _isRetrying;
    public final BLG<Integer> _retryRequests;
    public final BLG<Set<String>> _settingUpVmIds;
    public final BLG<HatchCvmChipBudgetStop> _stopped;
    public final C1BN<Boolean> isRetrying;
    public volatile HatchCvmChipBudgetStop pendingRetry;
    public final C1BN<Integer> retryRequests;
    public final C1BN<Set<String>> settingUpVmIds;
    public final C1BN<HatchCvmChipBudgetStop> stopped;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmChipBudgetGate", f = "HatchCvmChipBudgetGate.kt", l = {63}, m = "bid", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmChipBudgetGate$bid$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCvmChipBudgetGate.this.bid(null, null, null, null, this);
        }
    }

    public final void beginSetup(String str) {
        Set<String> value;
        C7384Etj.A0Y(str, 0);
        BLG<Set<String>> blg = this._settingUpVmIds;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, BGK.A02(str, value)));
    }

    public final void endSetup(String str) {
        Set<String> value;
        C7384Etj.A0Y(str, 0);
        BLG<Set<String>> blg = this._settingUpVmIds;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, BGK.A04(str, value)));
    }

    public final void onReplacement(String str, HatchCvmReplacement hatchCvmReplacement) {
        C7384Etj.A0Y(str, 0);
        if (hatchCvmReplacement == null || hatchCvmReplacement.equals(HatchCvmReplacement.Unknown.INSTANCE) || hatchCvmReplacement.equals(HatchCvmReplacement.NotFound.INSTANCE)) {
            return;
        }
        HatchCvmReplacement.Active activeForVm = HatchCvmReplaceStoreKt.forVm(hatchCvmReplacement, str);
        String str2 = (activeForVm == null || !HatchCvmReplaceStoreKt.isAwaitingChipSelection(activeForVm)) ? null : activeForVm.attemptId;
        HatchCvmChipBudgetStop value = this._stopped.getValue();
        if (C7384Etj.areEqual(value != null ? value.attemptId : null, str2)) {
            return;
        }
        release(str);
    }

    public final void release(String str) {
        C7384Etj.A0Y(str, 0);
        HatchCvmChipBudgetStop value = this._stopped.getValue();
        if (str.equals(value != null ? value.vmId : null)) {
            this._stopped.Af8(null);
            this.pendingRetry = null;
            AnonymousClass003.A14(this._isRetrying, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #2 {all -> 0x00dd, blocks: (B:31:0x0081, B:35:0x008a, B:34:0x0088), top: B:86:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.aura.gateway.HatchCvmChipBudgetStop, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.facebook.aura.gateway.HatchCvmChipSelectionRepository] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bid(java.lang.String r15, java.lang.String r16, byte[] r17, com.facebook.aura.common.HatchCvmChipPinPurpose r18, X.HtJ<? super com.facebook.aura.gateway.HatchCvmChipSelectionOutcome> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmChipBudgetGate.bid(java.lang.String, java.lang.String, byte[], com.facebook.aura.common.HatchCvmChipPinPurpose, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._settingUpVmIds.Af8(A3q.A00);
        this._stopped.Af8(null);
        this.pendingRetry = null;
        AnonymousClass003.A14(this._isRetrying, false);
    }

    public final C1BN<Integer> getRetryRequests() {
        return this.retryRequests;
    }

    public final C1BN<Set<String>> getSettingUpVmIds() {
        return this.settingUpVmIds;
    }

    public final C1BN<HatchCvmChipBudgetStop> getStopped() {
        return this.stopped;
    }

    public final C1BN<Boolean> isRetrying() {
        return this.isRetrying;
    }

    public final void retry() {
        HatchCvmChipBudgetStop value = this._stopped.getValue();
        if (value == null || AnonymousClass003.A1Z(this._isRetrying)) {
            return;
        }
        this.pendingRetry = value;
        AnonymousClass004.A1D(true, this._isRetrying);
        while (!C3cJ.A11(this._retryRequests)) {
        }
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchCvmChipBudgetGate getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCvmChipBudgetGate) abstractC3358CGz.A03(HatchCvmChipBudgetGate.class, HatchCvmChipBudgetGate$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchCvmChipBudgetGate(C06H c06h) {
        this();
    }

    public HatchCvmChipBudgetGate() {
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this._stopped = c9286GCnA01;
        this.stopped = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._isRetrying = c9286GCnA14;
        this.isRetrying = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(0);
        this._retryRequests = c9286GCnA142;
        this.retryRequests = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA012 = HnJ.A01(A3q.A00);
        this._settingUpVmIds = c9286GCnA012;
        this.settingUpVmIds = C3cG.A11(c9286GCnA012);
    }
}
