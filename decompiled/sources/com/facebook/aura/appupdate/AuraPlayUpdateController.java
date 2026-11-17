package com.facebook.aura.appupdate;

import X.AbstractC3097ByB;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3399CJq;
import X.C3404CKi;
import X.C5303Dfm;
import X.C7384Etj;
import X.C7438Evz;
import X.CFK;
import X.CJ1;
import X.CK2;
import X.CK5;
import X.CK6;
import X.CKj;
import X.CKk;
import X.CKp;
import X.CLD;
import X.CSC;
import X.CSE;
import X.CSP;
import X.CSZ;
import X.EnumC10573Huf;
import X.F2N;
import X.G0U;
import X.HwU;
import X.InterfaceC3408CKu;
import androidx.activity.result.IntentSenderRequest;
import com.facebook.common.build.BuildConstants;
import com.google.android.gms.common.api.ApiException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraPlayUpdateController {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "AuraPlayUpdateController";
    public boolean awaitingResult;
    public boolean checking;
    public boolean completing;
    public boolean disposed;
    public G0U<? super AuraPlayFlexibleUpdateResult, Unit> flexibleUpdateRequest;
    public int lastInstallStatus;
    public int lastProgressBucket;
    public final F2N lifecycle;
    public final CJ1 listener;
    public final InterfaceC3408CKu manager;
    public int offeredVersion;
    public final Function0<AuraPlayUpdatePrompts> prompts;

    /* renamed from: com.facebook.aura.appupdate.AuraPlayUpdateController$showUpdateReady$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C109471 extends C7438Evz implements Function0<Unit> {
        public C109471(Object obj) {
            super(0, obj, AuraPlayUpdateController.class, "completeUpdate", "completeUpdate()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AuraPlayUpdateController) this.receiver).completeUpdate();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailure() {
        this.awaitingResult = false;
        this.completing = false;
        AuraPlayUpdateRecovery.INSTANCE.block(this.offeredVersion, true);
        showFallback();
        finishFlexibleUpdateRequest(AuraPlayFlexibleUpdateResult.FAILED);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.CSA, X.CSC] */
    public final void checkForUpdate(final HwU<IntentSenderRequest> hwU) {
        C7384Etj.A0Y(hwU, 0);
        if (this.checking || !canStartFlow()) {
            return;
        }
        this.checking = true;
        ?? ACS = this.manager.ACS();
        ACS.A06(new CSZ() { // from class: com.facebook.aura.appupdate.AuraPlayUpdateController.checkForUpdate.1
            @Override // X.CSZ
            public final void onSuccess(CLD cld) {
                AuraPlayUpdateController auraPlayUpdateController = AuraPlayUpdateController.this;
                auraPlayUpdateController.checking = false;
                if (auraPlayUpdateController.canShowUi()) {
                    AuraPlayUpdateController auraPlayUpdateController2 = AuraPlayUpdateController.this;
                    C7384Etj.A0X(cld);
                    auraPlayUpdateController2.onUpdateInfo(cld, hwU);
                }
                AuraPlayUpdateController auraPlayUpdateController3 = AuraPlayUpdateController.this;
                if (auraPlayUpdateController3.awaitingResult) {
                    return;
                }
                auraPlayUpdateController3.finishFlexibleUpdateRequest(AuraPlayFlexibleUpdateResult.NOT_OFFERED);
            }
        }, AbstractC3097ByB.A00);
        ACS.A0E(new CSP() { // from class: com.facebook.aura.appupdate.AuraPlayUpdateController.checkForUpdate.2
            @Override // X.CSP
            public final void onFailure(Exception exc) {
                C7384Etj.A0Y(exc, 0);
                AuraPlayUpdateController auraPlayUpdateController = AuraPlayUpdateController.this;
                auraPlayUpdateController.checking = false;
                auraPlayUpdateController.logFailure("check", exc);
                AuraPlayUpdateController.this.finishFlexibleUpdateRequest(AuraPlayFlexibleUpdateResult.FAILED);
            }
        });
    }

    public final void dispose() {
        this.disposed = true;
        InterfaceC3408CKu interfaceC3408CKu = this.manager;
        CJ1 cj1 = this.listener;
        CKk cKk = (CKk) interfaceC3408CKu;
        synchronized (cKk) {
            CK5 ck5 = cKk.A01;
            synchronized (ck5) {
                ck5.A03.A02("unregisterListener", BV4.A1W());
                if (cj1 == null) {
                    throw BV4.A0a("Unregistered Play Core listener should not be null.");
                }
                ck5.A04.remove(cj1);
                CK5.A00(ck5);
            }
        }
    }

    public final void onUpdateResult(int i) {
        AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult;
        this.awaitingResult = false;
        AuraPlayUpdateRecovery auraPlayUpdateRecovery = AuraPlayUpdateRecovery.INSTANCE;
        this.offeredVersion = auraPlayUpdateRecovery.getAttemptedVersion();
        CFK.A01(Integer.valueOf(i), Integer.valueOf(BuildConstants.A00()), Integer.valueOf(this.offeredVersion), TAG, "Update result: result=%d installed=%d offered=%d");
        if (i == -1) {
            auraPlayFlexibleUpdateResult = AuraPlayFlexibleUpdateResult.ACCEPTED;
        } else if (i != 0) {
            onFailure();
            return;
        } else {
            auraPlayUpdateRecovery.block(this.offeredVersion, false);
            auraPlayFlexibleUpdateResult = AuraPlayFlexibleUpdateResult.DECLINED;
        }
        finishFlexibleUpdateRequest(auraPlayFlexibleUpdateResult);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canShowUi() {
        return !this.disposed && ((C5303Dfm) this.lifecycle).A01.A00(EnumC10573Huf.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishFlexibleUpdateRequest(AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult) {
        G0U<? super AuraPlayFlexibleUpdateResult, Unit> g0u = this.flexibleUpdateRequest;
        if (g0u != null) {
            this.flexibleUpdateRequest = null;
            g0u.invoke(auraPlayFlexibleUpdateResult);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:8:0x002e, B:13:0x0037, B:15:0x003b, B:22:0x0047, B:24:0x004b, B:18:0x0040, B:11:0x0033, B:26:0x005b), top: B:31:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void launchUpdate(X.CLD r8, X.HwU<androidx.activity.result.IntentSenderRequest> r9, int r10) {
        /*
            r7 = this;
            com.facebook.aura.appupdate.AuraPlayUpdateRecovery r1 = com.facebook.aura.appupdate.AuraPlayUpdateRecovery.INSTANCE
            int r0 = r7.offeredVersion
            r1.recordAttempt(r0)
            r6 = 1
            r7.awaitingResult = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            int r0 = com.facebook.common.build.BuildConstants.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r7.offeredVersion
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "AuraPlayUpdateController"
            java.lang.String r0 = "Starting update: type=%d installed=%d offered=%d"
            X.CFK.A01(r5, r2, r1, r4, r0)
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L5b
            if (r9 == 0) goto L5b
            if (r10 != 0) goto L2c
            goto L33
        L2c:
            if (r10 != r6) goto L5b
            android.app.PendingIntent r0 = r8.A06     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L5b
            goto L37
        L33:
            android.app.PendingIntent r0 = r8.A07     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L5b
        L37:
            boolean r0 = r8.A00     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L5b
            r8.A00 = r6     // Catch: java.lang.Exception -> L70
            if (r10 != 0) goto L40
            goto L47
        L40:
            android.app.PendingIntent r0 = r8.A06     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L45
            goto L4b
        L45:
            r0 = r3
            goto L4b
        L47:
            android.app.PendingIntent r0 = r8.A07     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L45
        L4b:
            android.content.IntentSender r1 = r0.getIntentSender()     // Catch: java.lang.Exception -> L70
            X.C7384Etj.A0Y(r1, r2)     // Catch: java.lang.Exception -> L70
            androidx.activity.result.IntentSenderRequest r0 = new androidx.activity.result.IntentSenderRequest     // Catch: java.lang.Exception -> L70
            r0.<init>(r3, r1, r2, r2)     // Catch: java.lang.Exception -> L70
            r9.A02(r0)     // Catch: java.lang.Exception -> L70
            return
        L5b:
            java.lang.String r1 = "Update flow did not start: type=%d offered=%d"
            int r0 = r7.offeredVersion     // Catch: java.lang.Exception -> L70
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L70
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}     // Catch: java.lang.Exception -> L70
            X.CFK.A0H(r4, r1, r0)     // Catch: java.lang.Exception -> L70
            r7.awaitingResult = r2     // Catch: java.lang.Exception -> L70
            r7.onFailure()     // Catch: java.lang.Exception -> L70
            return
        L70:
            r1 = move-exception
            r7.awaitingResult = r2
            java.lang.String r0 = "launch"
            r7.logFailure(r0, r1)
            r7.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AuraPlayUpdateController.launchUpdate(X.CLD, X.HwU, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInstallState(InstallState installState) {
        if (this.disposed) {
            return;
        }
        CK6 ck6 = (CK6) installState;
        int i = ck6.A00;
        long j = ck6.A03;
        int i2 = j > 0 ? (int) ((ck6.A02 * 10) / j) : -1;
        if (i != this.lastInstallStatus || i2 != this.lastProgressBucket) {
            CFK.A0G(TAG, "Install state: installed=%d offered=%d status=%d error=%d bytes=%d total=%d", Integer.valueOf(BuildConstants.A00()), Integer.valueOf(this.offeredVersion), Integer.valueOf(i), Integer.valueOf(ck6.A01), Long.valueOf(ck6.A02), Long.valueOf(j));
            this.lastInstallStatus = i;
            this.lastProgressBucket = i2;
        }
        if (i == 5) {
            onFailure();
            return;
        }
        if (i != 6) {
            if (i == 11) {
                showUpdateReady();
            }
        } else {
            this.awaitingResult = false;
            this.completing = false;
            AuraPlayUpdateRecovery.INSTANCE.block(this.offeredVersion, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0048 A[PHI: r10
  0x0048: PHI (r10v3 boolean) = (r10v2 boolean), (r10v5 boolean) binds: [B:3:0x0042, B:5:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpdateInfo(X.CLD r15, X.HwU<androidx.activity.result.IntentSenderRequest> r16) {
        /*
            r14 = this;
            int r0 = r15.A01
            r14.offeredVersion = r0
            int r0 = com.facebook.common.build.BuildConstants.A00()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r0 = r14.offeredVersion
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            int r4 = r15.A02
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            int r2 = r15.A03
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            long r0 = r15.A04
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            long r0 = r15.A05
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r6 = 6
            r1 = 0
            r3 = 1
            r7 = 2
            r0 = 3
            r5 = 5
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r9 = "AuraPlayUpdateController"
            java.lang.String r8 = "Update info: installed=%d offered=%d availability=%d status=%d bytes=%d total=%d"
            X.CFK.A0G(r9, r8, r10)
            com.facebook.aura.appupdate.AuraPlayInAppUpdater r8 = com.facebook.aura.appupdate.AuraPlayInAppUpdater.INSTANCE
            boolean r11 = r8.shouldForceUpdate()
            r10 = 1
            if (r4 == r7) goto L48
            r10 = 0
            r9 = 1
            if (r4 == r0) goto L49
        L48:
            r9 = 0
        L49:
            r8 = 11
            if (r10 != 0) goto L52
            if (r9 != 0) goto L52
            if (r2 == r8) goto L52
        L51:
            return
        L52:
            X.G0U<? super com.facebook.aura.appupdate.AuraPlayFlexibleUpdateResult, kotlin.Unit> r0 = r14.flexibleUpdateRequest
            boolean r7 = X.AnonymousClass002.A1X(r0)
            com.facebook.aura.appupdate.AuraPlayUpdateRecovery r4 = com.facebook.aura.appupdate.AuraPlayUpdateRecovery.INSTANCE
            int r0 = r14.offeredVersion
            boolean r0 = r4.isBlocked(r0)
            if (r0 == 0) goto L72
            if (r7 != 0) goto L72
            if (r11 != 0) goto L6e
            int r0 = r14.offeredVersion
            boolean r0 = r4.needsFallback(r0)
            if (r0 == 0) goto L51
        L6e:
            r14.showFallback()
            return
        L72:
            if (r2 != r5) goto L78
            r14.onFailure()
            return
        L78:
            if (r2 != r6) goto L80
            int r0 = r14.offeredVersion
            r4.block(r0, r1)
            return
        L80:
            if (r2 != r8) goto L86
            r14.showUpdateReady()
            return
        L86:
            r5 = r16
            if (r11 == 0) goto Lab
            if (r10 != 0) goto L8e
            if (r9 == 0) goto L6e
        L8e:
            com.facebook.aura.appupdate.AppUpdateNudgeCooldown r2 = com.facebook.aura.appupdate.AuraPlayStalledUpdateRetry.cooldown
            boolean r0 = r2.isElapsed()
            if (r0 != 0) goto La0
            if (r10 == 0) goto L6e
            int r1 = r14.offeredVersion
            int r0 = r4.getAttemptedVersion()
            if (r1 == r0) goto L6e
        La0:
            android.app.PendingIntent r0 = r15.A06
            if (r0 == 0) goto L6e
            r2.record()
            r14.launchUpdate(r15, r5, r3)
            return
        Lab:
            if (r9 == 0) goto Lb5
            int r0 = r14.offeredVersion
            r4.recordAttempt(r0)
            if (r2 != 0) goto L51
            goto L6e
        Lb5:
            if (r7 == 0) goto L51
            if (r10 == 0) goto L51
            if (r2 != 0) goto L51
            android.app.PendingIntent r0 = r15.A07
            if (r0 == 0) goto L51
            r14.launchUpdate(r15, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AuraPlayUpdateController.onUpdateInfo(X.CLD, X.HwU):void");
    }

    public final void startListening() {
        InterfaceC3408CKu interfaceC3408CKu = this.manager;
        CJ1 cj1 = this.listener;
        CKk cKk = (CKk) interfaceC3408CKu;
        synchronized (cKk) {
            CK5 ck5 = cKk.A01;
            synchronized (ck5) {
                ck5.A03.A02("registerListener", BV4.A1W());
                if (cj1 == null) {
                    throw BV4.A0a("Registered Play Core listener should not be null.");
                }
                ck5.A04.add(cj1);
                CK5.A00(ck5);
            }
        }
    }

    public AuraPlayUpdateController(InterfaceC3408CKu interfaceC3408CKu, F2N f2n, Function0<AuraPlayUpdatePrompts> function0) {
        AnonymousClass005.A0x(interfaceC3408CKu, f2n, function0);
        this.manager = interfaceC3408CKu;
        this.lifecycle = f2n;
        this.prompts = function0;
        this.offeredVersion = AuraPlayUpdateRecovery.INSTANCE.getAttemptedVersion();
        this.lastProgressBucket = -1;
        this.listener = new CJ1() { // from class: com.facebook.aura.appupdate.AuraPlayUpdateController$listener$1
            @Override // X.CIz
            public final void onStateUpdate(InstallState installState) {
                C7384Etj.A0Y(installState, 0);
                this.$tmp0.onInstallState(installState);
            }
        };
    }

    private final boolean canStartFlow() {
        return (!canShowUi() || this.awaitingResult || this.completing) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeUpdate() {
        CSC cscA01;
        if (!canShowUi() || this.completing) {
            return;
        }
        this.completing = true;
        CKk cKk = (CKk) this.manager;
        C3399CJq c3399CJq = cKk.A02;
        String packageName = cKk.A00.getPackageName();
        C3404CKi c3404CKi = c3399CJq.A00;
        if (c3404CKi == null) {
            cscA01 = C3399CJq.A01();
        } else {
            C3399CJq.A03.A02("completeUpdate(%s)", packageName);
            CSE cse = new CSE();
            CK2 ck2 = new CK2(cse, cse, c3399CJq);
            c3404CKi.A01().post(new CKj(((CKp) ck2).A00, cse, ck2, c3404CKi));
            cscA01 = cse.A00;
        }
        cscA01.A06(new CSZ() { // from class: com.facebook.aura.appupdate.AuraPlayUpdateController.completeUpdate.1
            public final void onSuccess(Void r3) {
                CFK.A02(Integer.valueOf(BuildConstants.A00()), Integer.valueOf(AuraPlayUpdateController.this.offeredVersion), AuraPlayUpdateController.TAG, "Update completion accepted: installed=%d offered=%d");
            }

            @Override // X.CSZ
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                onSuccess((Void) null);
            }
        }, AbstractC3097ByB.A00);
        cscA01.A0E(new CSP() { // from class: com.facebook.aura.appupdate.AuraPlayUpdateController.completeUpdate.2
            @Override // X.CSP
            public final void onFailure(Exception exc) {
                C7384Etj.A0Y(exc, 0);
                AuraPlayUpdateController auraPlayUpdateController = AuraPlayUpdateController.this;
                auraPlayUpdateController.completing = false;
                auraPlayUpdateController.logFailure("complete", exc);
                AuraPlayUpdateController.this.onFailure();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logFailure(String str, Exception exc) {
        ApiException apiException;
        Integer numValueOf = Integer.valueOf(BuildConstants.A00());
        Integer numValueOf2 = Integer.valueOf(this.offeredVersion);
        Integer numValueOf3 = null;
        if ((exc instanceof InstallException) && (apiException = (ApiException) exc) != null) {
            numValueOf3 = Integer.valueOf(apiException.mStatus.A00);
        }
        CFK.A0D(TAG, "Update %s failed: installed=%d offered=%d error=%s", exc, str, numValueOf, numValueOf2, numValueOf3);
    }

    private final void showFallback() {
        if (canShowUi()) {
            AuraPlayUpdateRecovery auraPlayUpdateRecovery = AuraPlayUpdateRecovery.INSTANCE;
            if (auraPlayUpdateRecovery.canShowFallback(this.offeredVersion)) {
                auraPlayUpdateRecovery.recordFallbackShown(this.offeredVersion);
                this.prompts.invoke().showPlayStore();
            }
        }
    }

    private final void showUpdateReady() {
        if (!canShowUi() || this.completing) {
            return;
        }
        if (!AuraPlayUpdateRecovery.INSTANCE.isBlocked(this.offeredVersion) || AuraPlayInAppUpdater.INSTANCE.shouldForceUpdate()) {
            AppUpdateNudgeCooldown appUpdateNudgeCooldown = AuraPlayUpdateReadyNudge.cooldown;
            if (appUpdateNudgeCooldown.isElapsed()) {
                appUpdateNudgeCooldown.record();
                this.prompts.invoke().showUpdateReady(new C109471(this));
            }
        }
    }

    public final void requestFlexibleUpdate(HwU<IntentSenderRequest> hwU, G0U<? super AuraPlayFlexibleUpdateResult, Unit> g0u) {
        AnonymousClass003.A0u(hwU, g0u);
        if (!canStartFlow()) {
            g0u.invoke(AuraPlayFlexibleUpdateResult.NOT_OFFERED);
        } else {
            this.flexibleUpdateRequest = g0u;
            checkForUpdate(hwU);
        }
    }
}
