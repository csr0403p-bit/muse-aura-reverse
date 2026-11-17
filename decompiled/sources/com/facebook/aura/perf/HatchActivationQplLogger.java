package com.facebook.aura.perf;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BQG;
import X.C3cH;
import X.C3cI;
import X.C5as;
import X.C5b2;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProviderKt;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchActivationQplLogger {
    public static boolean activationPending;
    public static boolean flowActive;
    public static boolean usedInviteCode;
    public static boolean vmRecoveryPending;
    public static final HatchActivationQplLogger INSTANCE = new HatchActivationQplLogger();
    public static final AtomicBoolean ageConfirmationActive = new AtomicBoolean(false);

    @DebugMetadata(c = "com.facebook.aura.perf.HatchActivationQplLogger", f = "HatchActivationQplLogger.kt", l = {227}, m = "traceStatusFetch", v = 2)
    /* renamed from: com.facebook.aura.perf.HatchActivationQplLogger$traceStatusFetch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchActivationQplLogger.this.traceStatusFetch(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.perf.HatchActivationQplLogger", f = "HatchActivationQplLogger.kt", l = {187}, m = "traceStatusRefresh", v = 2)
    /* renamed from: com.facebook.aura.perf.HatchActivationQplLogger$traceStatusRefresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C134301 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C134301(HtJ<? super C134301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchActivationQplLogger.this.traceStatusRefresh(null, null, null, this);
        }
    }

    private final void startFlow(String str) {
        flowActive = true;
        usedInviteCode = false;
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734863447, 0, true);
        hatchQplLogger.markerAnnotate(734863447, "entry_mode", str, 0);
    }

    public final void annotateAgeConfirmation(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        if (ageConfirmationActive.get()) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                HatchQplLogger.INSTANCE.markerAnnotate(734857868, (String) entryA0l.getKey(), (String) entryA0l.getValue(), 0);
            }
        }
    }

    public final synchronized void annotateFlow(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (flowActive) {
            HatchQplLogger.INSTANCE.markerAnnotate(734863447, str, z, 0);
        }
    }

    public final synchronized void cancelVmRecoveryFlow(String str) {
        C7384Etj.A0Y(str, 0);
        if (vmRecoveryPending) {
            vmRecoveryPending = false;
            if (!activationPending) {
                endFlowCancel(str);
            }
        }
    }

    public final void endAgeConfirmationFail(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (ageConfirmationActive.compareAndSet(true, false)) {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734857868, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str, 0);
            if (str2 != null && str2.length() != 0) {
                hatchQplLogger.markerAnnotate(734857868, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, BQG.A17(str2, 200), 0);
            }
            hatchQplLogger.markerEnd(734857868, (short) 3, 0);
        }
    }

    public final synchronized void endFlowCancel(String str) {
        C7384Etj.A0Y(str, 0);
        if (flowActive) {
            flowActive = false;
            activationPending = false;
            vmRecoveryPending = false;
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734863447, "cancel_reason", str, 0);
            hatchQplLogger.markerEnd(734863447, (short) 4, 0);
        }
    }

    public final synchronized void endFlowFail(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        if (flowActive) {
            flowActive = false;
            activationPending = false;
            vmRecoveryPending = false;
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734863447, "hit_terminal_screen", zA1a, 0);
            hatchQplLogger.markerAnnotate(734863447, "terminal_screen", str2, 0);
            hatchQplLogger.markerAnnotate(734863447, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str, 0);
            hatchQplLogger.markerEnd(734863447, (short) 3, 0);
        }
    }

    public final synchronized void endFlowSuccess() {
        activationPending = false;
        if (flowActive && !vmRecoveryPending) {
            flowActive = false;
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734863447, "activation_path", usedInviteCode ? AnonymousClass000.A00(30) : "auto_admitted", 0);
            hatchQplLogger.markerEnd(734863447, (short) 2, 0);
        }
    }

    public final synchronized void endVmRecoveryFlow() {
        if (vmRecoveryPending) {
            vmRecoveryPending = false;
            if (!activationPending) {
                endFlowSuccess();
            }
        }
    }

    public final synchronized void markInviteCodeUsed() {
        usedInviteCode = true;
    }

    public final synchronized void pointActivationStepFailed(String str, String str2, String str3, String str4, String str5) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (flowActive) {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerPoint(734863447, "activation_step_failed", zA1b ? 1 : 0);
            hatchQplLogger.markerAnnotate(734863447, "step_name", str, zA1b ? 1 : 0);
            hatchQplLogger.markerAnnotate(734863447, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str2, zA1b ? 1 : 0);
            if (str3 != null && str3.length() != 0) {
                hatchQplLogger.markerAnnotate(734863447, "error_type", str3, zA1b ? 1 : 0);
            }
            if (str4 != null && str4.length() != 0) {
                hatchQplLogger.markerAnnotate(734863447, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, BQG.A17(str4, 200), zA1b ? 1 : 0);
            }
            if (str5 != null) {
                hatchQplLogger.markerAnnotate(734863447, "request_type", str5, zA1b ? 1 : 0);
            }
        }
    }

    public final synchronized void pointFlow(String str) {
        C7384Etj.A0Y(str, 0);
        if (flowActive) {
            HatchQplLogger.INSTANCE.markerPoint(734863447, str, 0);
        }
    }

    public final synchronized void startActivationFlow() {
        activationPending = true;
        if (!flowActive) {
            startFlow(ConfidentialVmMigrationDoneRepository.MODE_STANDARD);
        }
    }

    public final synchronized void startVmRecoveryFlow() {
        if (!vmRecoveryPending) {
            vmRecoveryPending = true;
            if (!flowActive) {
                startFlow("retroactive");
            }
            pointFlow("vm_disconnected_screen_shown");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object traceStatusFetch(java.lang.String r11, X.G0U<? super X.HtJ<? super com.facebook.aura.user.provider.AuraUserData>, ? extends java.lang.Object> r12, X.HtJ<? super com.facebook.aura.user.provider.AuraUserData> r13) throws java.lang.Exception {
        /*
            r10 = this;
            r3 = r13
            boolean r0 = r13 instanceof com.facebook.aura.perf.HatchActivationQplLogger.AnonymousClass1
            r8 = r10
            if (r0 == 0) goto L26
            r7 = r3
            com.facebook.aura.perf.HatchActivationQplLogger$traceStatusFetch$1 r7 = (com.facebook.aura.perf.HatchActivationQplLogger.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.label = r2
        L14:
            java.lang.Object r3 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L31
            if (r0 != r5) goto L2c
            int r9 = r7.I$0
            java.lang.Object r13 = r7.L$2
            java.lang.String r13 = (java.lang.String) r13
            goto L6b
        L26:
            com.facebook.aura.perf.HatchActivationQplLogger$traceStatusFetch$1 r7 = new com.facebook.aura.perf.HatchActivationQplLogger$traceStatusFetch$1
            r7.<init>(r13)
            goto L14
        L2c:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
            throw r4
        L31:
            X.Hwg.A00(r3)
            java.lang.String r0 = "blocking_startup"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L53
            java.lang.String r13 = "fail_closed"
        L3e:
            com.facebook.aura.perf.HatchQplLogger r4 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            r3 = 0
            r2 = 734856436(0x2bcd04f4, float:1.4567501E-12)
            r1 = 0
            r4.markerStart(r2, r1, r5)
            java.lang.String r0 = "fetch_mode"
            r4.markerAnnotate(r2, r0, r11, r1)
            java.lang.String r0 = "onboarding_statuses_start"
            r4.markerPoint(r2, r0, r1)
            goto L56
        L53:
            java.lang.String r13 = "fail_open"
            goto L3e
        L56:
            r7.L$0 = r3     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L91
            r7.L$1 = r3     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L91
            r7.L$2 = r13     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L91
            r7.I$0 = r2     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L91
            r7.label = r5     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L91
            java.lang.Object r3 = r12.invoke(r7)     // Catch: java.lang.Exception -> L8c java.util.concurrent.CancellationException -> L91
            if (r3 != r6) goto L67
            return r6
        L67:
            r9 = 734856436(0x2bcd04f4, float:1.4567501E-12)
            goto L6e
        L6b:
            X.Hwg.A00(r3)     // Catch: java.util.concurrent.CancellationException -> L96 java.lang.Exception -> La8
        L6e:
            com.facebook.aura.user.provider.AuraUserData r3 = (com.facebook.aura.user.provider.AuraUserData) r3     // Catch: java.util.concurrent.CancellationException -> L96 java.lang.Exception -> La8
            com.facebook.aura.perf.HatchQplLogger r2 = com.facebook.aura.perf.HatchQplLogger.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L96 java.lang.Exception -> La8
            java.lang.String r0 = "onboarding_statuses_end"
            r12 = 0
            r1 = 0
            r2.markerPoint(r9, r0, r1)     // Catch: java.util.concurrent.CancellationException -> L96 java.lang.Exception -> La8
            if (r3 != 0) goto L84
            java.lang.String r10 = "fetch_failed"
            java.lang.String r11 = "null_result"
            r8.annotateFailure(r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L96 java.lang.Exception -> La8
            r0 = 3
            goto L88
        L84:
            r10.annotateUserData(r9, r3)     // Catch: java.util.concurrent.CancellationException -> L96 java.lang.Exception -> La8
            r0 = 2
        L88:
            r2.markerEnd(r9, r0, r1)     // Catch: java.util.concurrent.CancellationException -> L96 java.lang.Exception -> La8
            return r3
        L8c:
            r4 = move-exception
            r9 = 734856436(0x2bcd04f4, float:1.4567501E-12)
            goto La9
        L91:
            r4 = move-exception
            r9 = 734856436(0x2bcd04f4, float:1.4567501E-12)
            goto L97
        L96:
            r4 = move-exception
        L97:
            com.facebook.aura.perf.HatchQplLogger r1 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            java.lang.String r0 = "onboarding_statuses_end"
            r3 = 0
            r1.markerPoint(r9, r0, r3)
            java.lang.String r2 = "cancel_reason"
            java.lang.String r0 = "coroutine_cancelled"
            r1.markerAnnotate(r9, r2, r0, r3)
            r0 = 4
            goto Lb7
        La8:
            r4 = move-exception
        La9:
            com.facebook.aura.perf.HatchQplLogger r1 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            java.lang.String r0 = "onboarding_statuses_end"
            r3 = 0
            r1.markerPoint(r9, r0, r3)
            java.lang.String r0 = "exception"
            r8.annotateFailure(r9, r0, r4, r13)
            r0 = 3
        Lb7:
            r1.markerEnd(r9, r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.perf.HatchActivationQplLogger.traceStatusFetch(java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: CancellationException -> 0x00be, Exception -> 0x00d0, TryCatch #4 {CancellationException -> 0x00be, Exception -> 0x00d0, blocks: (B:18:0x0062, B:19:0x0065, B:21:0x0072, B:23:0x007f, B:26:0x0086, B:28:0x009d, B:29:0x00af), top: B:41:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[Catch: CancellationException -> 0x00be, Exception -> 0x00d0, TryCatch #4 {CancellationException -> 0x00be, Exception -> 0x00d0, blocks: (B:18:0x0062, B:19:0x0065, B:21:0x0072, B:23:0x007f, B:26:0x0086, B:28:0x009d, B:29:0x00af), top: B:41:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object traceStatusRefresh(com.facebook.aura.activation.data.ActivationState r10, java.lang.String r11, X.G0U<? super X.HtJ<? super com.facebook.aura.user.provider.AuraUserData>, ? extends java.lang.Object> r12, X.HtJ<? super com.facebook.aura.user.provider.AuraUserData> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.perf.HatchActivationQplLogger.traceStatusRefresh(com.facebook.aura.activation.data.ActivationState, java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ void annotateFailure$default(HatchActivationQplLogger hatchActivationQplLogger, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        hatchActivationQplLogger.annotateFailure(i, str, str2, str3, str4);
    }

    private final void annotateUserData(int i, AuraUserData auraUserData) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        C5b2 c5b2 = auraUserData.waitlistStatus;
        String strValueOf = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        hatchQplLogger.markerAnnotate(i, AuraViewerDataProviderKt.KEY_WAITLIST_STATUS, c5b2 != null ? AnonymousClass006.A0x(c5b2) : HatchCcvLoggingKt.NO_POSTAL_FIELD, 0);
        hatchQplLogger.markerAnnotate(i, AuraViewerDataProviderKt.KEY_HAS_REDEEMED_INVITE_CODE, auraUserData.hasRedeemedInviteCode, 0);
        C5as c5as = auraUserData.ageConfirmationStatus;
        hatchQplLogger.markerAnnotate(i, AgeCheckFunnelLogging.KEY_CCV_STATUS, c5as != null ? AnonymousClass006.A0x(c5as) : HatchCcvLoggingKt.NO_POSTAL_FIELD, 0);
        hatchQplLogger.markerAnnotate(i, "is_geo_gated", AnonymousClass002.A1b(auraUserData.isPassGeogating, false), 0);
        hatchQplLogger.markerAnnotate(i, "has_completed_activation", auraUserData.hasCompletedHatchActivation, 0);
        Boolean bool = auraUserData.hasProvisionedVm;
        if (bool != null) {
            strValueOf = String.valueOf(bool.booleanValue());
        }
        hatchQplLogger.markerAnnotate(i, AuraViewerDataProviderKt.KEY_HAS_PROVISIONED_VM, strValueOf, 0);
        hatchQplLogger.markerAnnotate(i, "tos_consent_present", auraUserData.hasAcceptedTos, 0);
        hatchQplLogger.markerAnnotate(i, "resolved_destination", AnonymousClass006.A0x(auraUserData.getCurrentActivationState(false, false, false)), 0);
    }

    public static /* synthetic */ void pointActivationStepFailed$default(HatchActivationQplLogger hatchActivationQplLogger, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        hatchActivationQplLogger.pointActivationStepFailed(str, str2, str3, str4, str5);
    }

    public final void endAgeConfirmationCancel() {
        if (ageConfirmationActive.compareAndSet(true, false)) {
            HatchQplLogger.INSTANCE.markerEnd(734857868, (short) 4, 0);
        }
    }

    public final void endAgeConfirmationSuccess() {
        if (ageConfirmationActive.compareAndSet(true, false)) {
            HatchQplLogger.INSTANCE.markerEnd(734857868, (short) 2, 0);
        }
    }

    public final void startAgeConfirmation() {
        if (ageConfirmationActive.compareAndSet(false, true)) {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerStart(734857868, 0, true);
            hatchQplLogger.markerPoint(734857868, "ccv_launched", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void annotateFailure(int i, String str, Exception exc, String str2) {
        annotateFailure(i, str, C3cI.A0Y(exc), exc.getMessage(), str2);
    }

    private final void annotateFailure(int i, String str, String str2, String str3, String str4) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(i, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str, 0);
        if (str2 != null) {
            hatchQplLogger.markerAnnotate(i, "error_type", str2, 0);
        }
        if (str3 != null && str3.length() != 0) {
            hatchQplLogger.markerAnnotate(i, HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, BQG.A17(str3, 200), 0);
        }
        if (str4 != null) {
            hatchQplLogger.markerAnnotate(i, "fail_behavior", str4, 0);
        }
    }

    public final synchronized void annotateFlow(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (flowActive) {
            HatchQplLogger.INSTANCE.markerAnnotate(734863447, str, str2, zA1b ? 1 : 0);
        }
    }
}
