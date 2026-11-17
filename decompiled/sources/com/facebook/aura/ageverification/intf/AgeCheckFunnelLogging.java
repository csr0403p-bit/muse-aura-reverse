package com.facebook.aura.ageverification.intf;

import X.AGH;
import X.AIW;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C0881AGi;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.user.provider.AgeCheckLayout;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.aura.user.provider.AuraUserData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AgeCheckFunnelLogging implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final String ACTIVATION_LAUNCH = "activation_launch";
    public static final String EXISTING_ACCOUNT = "existing_account";
    public static final String IN_APP_REGATE = "in_app_regate";
    public static final String KEY_AGE_CHECK_ID = "age_check_id";
    public static final String KEY_ATTEMPTS = "attempts";
    public static final String KEY_CCV_STATUS = "ccv_status";
    public static final String KEY_ENTRY_CONTEXT = "entry_context";
    public static final String KEY_ENTRY_TRIGGER = "entry_trigger";
    public static final String KEY_FACE_MODULE = "face_module";
    public static final String KEY_FINAL_METHOD = "final_method";
    public static final String KEY_FIRST_STEP = "first_step";
    public static final String KEY_FROM_STEP = "from_step";
    public static final String KEY_LAYOUT = "layout";
    public static final String KEY_METHOD = "method";
    public static final String KEY_METHODS_OFFERED = "methods_offered";
    public static final String KEY_METHODS_TRIED = "methods_tried";
    public static final String KEY_NATIVE_CCV = "native_ccv";
    public static final String KEY_OUTCOME = "outcome";
    public static final String KEY_POSITION = "position";
    public static final String KEY_PREVIOUS_STEP = "previous_step";
    public static final String KEY_RESET_REASON = "reset_reason";
    public static final String KEY_RETRIES_LEFT = "retries_left";
    public static final String KEY_SEQ = "seq";
    public static final String KEY_STAGE = "stage";
    public static final String KEY_UPL_SESSION_ID = "upl_session_id";
    public static final String KEY_VIA = "via";
    public static final String LAYOUT_LEGACY = "legacy";
    public static final int MAX_RESETS = 10;
    public static final String NEW_ACCOUNT = "new_account";
    public static AgeCheck check;
    public static boolean hasCompletedActivation;
    public static boolean inAppRegate;
    public static int resets;
    public static final AgeCheckFunnelLogging INSTANCE = new AgeCheckFunnelLogging();
    public static final Set<String> CCV_STATUSES = C60O.A1A("ccv_required", "blocked", "not_required");
    public static final Object lock = C3cG.A0T();
    public static Map<String, String> statusKeys = AGH.A0E();
    public static final Set<SelfieCapturePhase> capturePhases = C3cG.A0k();

    private final void closeAttempt(AgeCheck ageCheck, AgeCheckResult ageCheckResult, AgeCheckFailure ageCheckFailure, Integer num, String str) {
        String str2 = ageCheck.openMethod;
        if (str2 != null) {
            ageCheck.openMethod = null;
            Stage stage = Stage.ATTEMPT_RESULT;
            String str3 = ageCheck.step;
            LinkedHashMap linkedHashMapA02 = AGH.A02(attemptKeys(ageCheck, str2), attemptDuration(ageCheck));
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), AnonymousClass006.A0x(ageCheckResult));
            if (ageCheckFailure != null) {
                c0924AIaA0u.put(HatchMetadataKey.FAILURE_REASON.getValue(), ageCheckFailure.getWireValue$fbandroid_express_aura_java_com_facebook_aura_ageverification_intf_intf());
            }
            if (num != null) {
                c0924AIaA0u.put(KEY_RETRIES_LEFT, String.valueOf(num.intValue()));
            }
            if (str != null) {
                c0924AIaA0u.put("upl_session_id", str);
            }
            log(ageCheck, stage, str3, AGH.A02(linkedHashMapA02, AIW.A0K(c0924AIaA0u)), ageCheckResult.getEventType$fbandroid_express_aura_java_com_facebook_aura_ageverification_intf_intf());
        }
    }

    private final void select(AgeCheck ageCheck, String str, int i) {
        ageCheck.selectedMethod = str;
        Stage stage = Stage.METHOD_SELECTED;
        String str2 = ageCheck.step;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(KEY_METHOD, str);
        c0924AIaA0u.put(KEY_POSITION, String.valueOf(i));
        String str3 = ageCheck.step;
        if (str3 != null) {
            c0924AIaA0u.put(KEY_FROM_STEP, str3);
        }
        log(ageCheck, stage, str2, AIW.A0K(c0924AIaA0u), HatchEventType.STATUS_CHECK.getValue());
    }

    private final void showStep(AgeCheck ageCheck, String str, AgeCheckVia ageCheckVia) {
        if (C7384Etj.areEqual(ageCheck.step, str)) {
            return;
        }
        String str2 = ageCheck.step;
        ageCheck.previousStep = str2;
        ageCheck.step = str;
        if (C7384Etj.areEqual(str, AnonymousClass006.A0x(AgeCheckStep.SELFIE_INTRO)) || C7384Etj.areEqual(str, AnonymousClass006.A0x(AgeCheckStep.SELFIE_INTRO_PICKED))) {
            ageCheck.introStep = str;
        }
        Stage stage = Stage.STEP_SHOWN;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.STEP, str, c0924AIaA0u);
        if (str2 != null) {
            c0924AIaA0u.put(KEY_PREVIOUS_STEP, str2);
        }
        c0924AIaA0u.put(KEY_VIA, AnonymousClass006.A0x(ageCheckVia));
        log(ageCheck, stage, str, AIW.A0K(c0924AIaA0u), HatchEventType.STATUS_CHECK.getValue());
    }

    public final void attemptCancelled(AgeCheckMethod ageCheckMethod) {
        C7384Etj.A0Y(ageCheckMethod, 0);
        attemptResult(ageCheckMethod, AgeCheckResult.CANCELLED, AgeCheckFailure.CANCELLED, null, null);
    }

    public final void attemptResult(AgeCheckMethod ageCheckMethod, AgeCheckResult ageCheckResult, AgeCheckFailure ageCheckFailure, Integer num, String str) {
        AnonymousClass003.A0u(ageCheckMethod, ageCheckResult);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                String str2 = ageCheck.openMethod;
                AgeCheckFunnelLogging ageCheckFunnelLogging = INSTANCE;
                if (C7384Etj.areEqual(str2, AnonymousClass006.A0x(ageCheckMethod))) {
                    ageCheckFunnelLogging.closeAttempt(ageCheck, ageCheckResult, ageCheckFailure, num, str);
                }
            }
        }
    }

    public final void attemptStarted(AgeCheckMethod ageCheckMethod) {
        C7384Etj.A0Y(ageCheckMethod, 0);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                AgeCheckFunnelLogging ageCheckFunnelLogging = INSTANCE;
                String strA0x = AnonymousClass006.A0x(ageCheckMethod);
                String str = ageCheck.openMethod;
                if (str != null) {
                    if (!str.equals(strA0x)) {
                        ageCheckFunnelLogging.closeAttempt(ageCheck, AgeCheckResult.CANCELLED, AgeCheckFailure.CANCELLED, null, null);
                    }
                }
                if (!C7384Etj.areEqual(ageCheck.selectedMethod, strA0x)) {
                    ageCheckFunnelLogging.select(ageCheck, strA0x, 0);
                }
                ageCheck.attempts++;
                ageCheck.openMethod = strA0x;
                ageCheck.lastMethod = strA0x;
                ageCheck.attemptStartedAtMs = SystemClock.elapsedRealtime();
                if (!ageCheck.methodsTried.contains(strA0x)) {
                    ageCheck.setMethodsTried(AbstractC0878AGe.A0Q(strA0x, ageCheck.methodsTried));
                }
                capturePhases.clear();
                resets = 0;
                ageCheckFunnelLogging.log(ageCheck, Stage.ATTEMPT_STARTED, ageCheck.step, ageCheckFunnelLogging.attemptKeys(ageCheck, strA0x), HatchEventType.STATUS_CHECK.getValue());
            }
        }
    }

    public final void attemptSubmitted(AgeCheckMethod ageCheckMethod, String str) {
        C7384Etj.A0Y(ageCheckMethod, 0);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                String str2 = ageCheck.openMethod;
                AgeCheckFunnelLogging ageCheckFunnelLogging = INSTANCE;
                if (C7384Etj.areEqual(str2, AnonymousClass006.A0x(ageCheckMethod))) {
                    ageCheckFunnelLogging.log(ageCheck, Stage.ATTEMPT_SUBMITTED, ageCheck.step, AGH.A08(AbstractC0885AGm.A0z(str != null ? C3cG.A0r("upl_session_id", str) : null), AGH.A02(ageCheckFunnelLogging.attemptKeys(ageCheck, AnonymousClass006.A0x(ageCheckMethod)), ageCheckFunnelLogging.attemptDuration(ageCheck))), HatchEventType.STATUS_CHECK.getValue());
                }
            }
        }
    }

    public final void methodSelected(AgeCheckMethod ageCheckMethod, int i) {
        C7384Etj.A0Y(ageCheckMethod, 0);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                INSTANCE.select(ageCheck, AnonymousClass006.A0x(ageCheckMethod), i);
            }
        }
    }

    public final void methodSelectedIfNew(AgeCheckMethod ageCheckMethod) {
        C7384Etj.A0Y(ageCheckMethod, 0);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                String str = ageCheck.selectedMethod;
                AgeCheckFunnelLogging ageCheckFunnelLogging = INSTANCE;
                if (!C7384Etj.areEqual(str, AnonymousClass006.A0x(ageCheckMethod))) {
                    ageCheckFunnelLogging.select(ageCheck, AnonymousClass006.A0x(ageCheckMethod), 0);
                }
            }
        }
    }

    public final void onStatus(AuraUserData auraUserData, String str) {
        String strA0x;
        C7384Etj.A0Y(auraUserData, 0);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (str != null) {
            String strA0u = AnonymousClass001.A0u(str);
            if (CCV_STATUSES.contains(strA0u)) {
                c0924AIaA0u.put(KEY_CCV_STATUS, strA0u);
            }
        }
        if (!auraUserData.ageVerificationMethods.isEmpty()) {
            c0924AIaA0u.put(KEY_METHODS_OFFERED, AbstractC06907md.A01(",", auraUserData.ageVerificationMethods, AgeCheckFunnelLogging$onStatus$keys$1$3.INSTANCE));
        }
        AgeCheckLayout ageCheckLayout = auraUserData.ageVerificationLayout;
        if (ageCheckLayout == null || (strA0x = AnonymousClass006.A0x(ageCheckLayout)) == null) {
            strA0x = "legacy";
        }
        c0924AIaA0u.put(KEY_LAYOUT, strA0x);
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        synchronized (lock) {
            hasCompletedActivation = auraUserData.hasCompletedHatchActivation;
            statusKeys = c0924AIaA0K;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:16:0x0031, B:17:0x0033, B:19:0x005d, B:21:0x0068, B:23:0x0073, B:24:0x0080, B:27:0x008a, B:28:0x008e, B:13:0x0028), top: B:34:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:16:0x0031, B:17:0x0033, B:19:0x005d, B:21:0x0068, B:23:0x0073, B:24:0x0080, B:27:0x008a, B:28:0x008e, B:13:0x0028), top: B:34:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:16:0x0031, B:17:0x0033, B:19:0x005d, B:21:0x0068, B:23:0x0073, B:24:0x0080, B:27:0x008a, B:28:0x008e, B:13:0x0028), top: B:34:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:16:0x0031, B:17:0x0033, B:19:0x005d, B:21:0x0068, B:23:0x0073, B:24:0x0080, B:27:0x008a, B:28:0x008e, B:13:0x0028), top: B:34:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void selfieCapture(com.facebook.aura.ageverification.intf.SelfieCapturePhase r9, com.facebook.aura.ageverification.intf.SelfieFaceModule r10, com.facebook.aura.ageverification.intf.SelfieResetReason r11, com.facebook.aura.ageverification.intf.AgeCheckFailure r12) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
            java.lang.Object r3 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.lock
            monitor-enter(r3)
            com.facebook.aura.ageverification.intf.AgeCheck r5 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.check     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L95
            java.lang.String r1 = r5.openMethod     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging r4 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.INSTANCE     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.user.provider.AgeCheckMethod r0 = com.facebook.aura.user.provider.AgeCheckMethod.SELFIE     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = X.AnonymousClass006.A0x(r0)     // Catch: java.lang.Throwable -> L97
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L95
            com.facebook.aura.ageverification.intf.SelfieCapturePhase r0 = com.facebook.aura.ageverification.intf.SelfieCapturePhase.RESET     // Catch: java.lang.Throwable -> L97
            if (r9 != r0) goto L28
            int r1 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.resets     // Catch: java.lang.Throwable -> L97
            r0 = 10
            if (r1 >= r0) goto L95
            int r0 = r1 + 1
            goto L31
        L28:
            java.util.Set<com.facebook.aura.ageverification.intf.SelfieCapturePhase> r0 = com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.capturePhases     // Catch: java.lang.Throwable -> L97
            boolean r0 = r0.add(r9)     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L33
            goto L95
        L31:
            com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.resets = r0     // Catch: java.lang.Throwable -> L97
        L33:
            com.facebook.aura.ageverification.intf.Stage r6 = com.facebook.aura.ageverification.intf.Stage.SELFIE_CAPTURE     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.ageverification.intf.AgeCheckStep r0 = com.facebook.aura.ageverification.intf.AgeCheckStep.SELFIE_CAPTURE     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = X.AnonymousClass006.A0x(r0)     // Catch: java.lang.Throwable -> L97
            X.AIa r2 = X.C3cG.A0u()     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.PHASE     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r0.getValue()     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = X.AnonymousClass006.A0x(r9)     // Catch: java.lang.Throwable -> L97
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.ATTEMPT_NUMBER     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r0.getValue()     // Catch: java.lang.Throwable -> L97
            int r0 = r5.attempts     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L97
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L66
            java.lang.String r1 = "face_module"
            java.lang.String r0 = X.AnonymousClass006.A0x(r10)     // Catch: java.lang.Throwable -> L97
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L97
        L66:
            if (r11 == 0) goto L71
            java.lang.String r1 = "reset_reason"
            java.lang.String r0 = X.AnonymousClass006.A0x(r11)     // Catch: java.lang.Throwable -> L97
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L97
        L71:
            if (r12 == 0) goto L80
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.FAILURE_REASON     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r0.getValue()     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r12.getWireValue$fbandroid_express_aura_java_com_facebook_aura_ageverification_intf_intf()     // Catch: java.lang.Throwable -> L97
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L97
        L80:
            X.AIa r8 = X.AIW.A0K(r2)     // Catch: java.lang.Throwable -> L97
            com.facebook.aura.ageverification.intf.SelfieCapturePhase r0 = com.facebook.aura.ageverification.intf.SelfieCapturePhase.FAILED     // Catch: java.lang.Throwable -> L97
            if (r9 != r0) goto L8e
            java.lang.String r9 = "error"
        L8a:
            r4.log(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L97
            goto L95
        L8e:
            com.facebook.aura.analytics.hatch.HatchEventType r0 = com.facebook.aura.analytics.hatch.HatchEventType.STATUS_CHECK     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = r0.getValue()     // Catch: java.lang.Throwable -> L97
            goto L8a
        L95:
            monitor-exit(r3)
            return
        L97:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging.selfieCapture(com.facebook.aura.ageverification.intf.SelfieCapturePhase, com.facebook.aura.ageverification.intf.SelfieFaceModule, com.facebook.aura.ageverification.intf.SelfieResetReason, com.facebook.aura.ageverification.intf.AgeCheckFailure):void");
    }

    public final void selfieIntroShown(AgeCheckVia ageCheckVia) {
        String str;
        C7384Etj.A0Y(ageCheckVia, 0);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null && (str = ageCheck.introStep) != null) {
                INSTANCE.showStep(ageCheck, str, ageCheckVia);
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Outcome.values().length];
            try {
                AnonymousClass002.A13(Outcome.VERIFIED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(Outcome.CLEARED_BY_SERVER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(Outcome.BLOCKED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(Outcome.LOGGED_OUT, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Map<String, String> attemptDuration(AgeCheck ageCheck) {
        return AnonymousClass006.A10(HatchMetadataKey.DURATION_MS.getValue(), String.valueOf(SystemClock.elapsedRealtime() - ageCheck.attemptStartedAtMs));
    }

    private final Map<String, String> attemptKeys(AgeCheck ageCheck, String str) {
        return AnonymousClass007.A0d(HatchMetadataKey.ATTEMPT_NUMBER.getValue(), String.valueOf(ageCheck.attempts), C3cG.A0r(KEY_METHOD, str));
    }

    public static /* synthetic */ void attemptResult$default(AgeCheckFunnelLogging ageCheckFunnelLogging, AgeCheckMethod ageCheckMethod, AgeCheckResult ageCheckResult, AgeCheckFailure ageCheckFailure, Integer num, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            ageCheckFailure = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        ageCheckFunnelLogging.attemptResult(ageCheckMethod, ageCheckResult, ageCheckFailure, num, str);
    }

    public static /* synthetic */ void closeAttempt$default(AgeCheckFunnelLogging ageCheckFunnelLogging, AgeCheck ageCheck, AgeCheckResult ageCheckResult, AgeCheckFailure ageCheckFailure, Integer num, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        ageCheckFunnelLogging.closeAttempt(ageCheck, ageCheckResult, ageCheckFailure, num, str);
    }

    private final void log(AgeCheck ageCheck, Stage stage, String str, Map<String, String> map, String str2) {
        int i = ageCheck.seq + 1;
        ageCheck.seq = i;
        HatchAppEventLogger.INSTANCE.logEvent(AgeCheckFunnelLoggingKt.EVENT_NAME, HatchSurface.AGE_CONFIRMATION.getValue(), AgeCheckFunnelLoggingKt.EVENT_NAME, str2, str, AGH.A02(AGH.A02(statusKeys, AGH.A0D(C3cG.A0r("age_check_id", ageCheck.id), C3cG.A0r(KEY_STAGE, AnonymousClass006.A0x(stage)), C3cG.A0r(KEY_SEQ, String.valueOf(i)), C3cG.A0r(KEY_ENTRY_CONTEXT, ageCheck.entryContext), C3cG.A0r(KEY_ENTRY_TRIGGER, ageCheck.entryTrigger))), map), null);
    }

    public static /* synthetic */ void log$default(AgeCheckFunnelLogging ageCheckFunnelLogging, AgeCheck ageCheck, Stage stage, String str, Map map, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = HatchEventType.STATUS_CHECK.getValue();
        }
        ageCheckFunnelLogging.log(ageCheck, stage, str, map, str2);
    }

    public static /* synthetic */ void selfieCapture$default(AgeCheckFunnelLogging ageCheckFunnelLogging, SelfieCapturePhase selfieCapturePhase, SelfieFaceModule selfieFaceModule, SelfieResetReason selfieResetReason, AgeCheckFailure ageCheckFailure, int i, Object obj) {
        if ((i & 2) != 0) {
            selfieFaceModule = null;
        }
        if ((i & 4) != 0) {
            selfieResetReason = null;
        }
        if ((i & 8) != 0) {
            ageCheckFailure = null;
        }
        ageCheckFunnelLogging.selfieCapture(selfieCapturePhase, selfieFaceModule, selfieResetReason, ageCheckFailure);
    }

    public final String ageCheckId() {
        String str;
        synchronized (lock) {
            AgeCheck ageCheck = check;
            str = ageCheck != null ? ageCheck.id : null;
        }
        return str;
    }

    public final void ageStepShown(AgeCheckStep ageCheckStep, AgeCheckVia ageCheckVia) {
        boolean zA1b = AnonymousClass004.A1b(ageCheckStep, ageCheckVia);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                INSTANCE.showStep(ageCheck, AnonymousClass006.A0x(ageCheckStep), ageCheckVia);
            } else {
                AgeCheck ageCheck2 = new AgeCheck(AnonymousClass002.A0k(), hasCompletedActivation ? EXISTING_ACCOUNT : NEW_ACCOUNT, inAppRegate ? IN_APP_REGATE : ACTIVATION_LAUNCH, SystemClock.elapsedRealtime(), zA1b ? 1 : 0, zA1b ? 1 : 0, null, 0L, null, null, null, null, null, C0881AGi.A00);
                inAppRegate = zA1b;
                check = ageCheck2;
                AgeCheckFunnelLogging ageCheckFunnelLogging = INSTANCE;
                Stage stage = Stage.ENTERED;
                String strA0x = AnonymousClass006.A0x(ageCheckStep);
                ageCheckFunnelLogging.log(ageCheck2, stage, strA0x, AGH.A0D(C60O.A1Z(KEY_NATIVE_CCV, "true", C3cG.A0r(KEY_FIRST_STEP, strA0x))), HatchEventType.STATUS_CHECK.getValue());
                ageCheckFunnelLogging.showStep(ageCheck2, AnonymousClass006.A0x(ageCheckStep), AgeCheckVia.ENTRY);
            }
        }
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                INSTANCE.exit(ageCheck, Outcome.LOGGED_OUT);
            }
            inAppRegate = false;
            hasCompletedActivation = false;
            statusKeys = AGH.A0E();
        }
    }

    public final void linkingReturned() {
        String str;
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                String str2 = ageCheck.step;
                AgeCheckFunnelLogging ageCheckFunnelLogging = INSTANCE;
                if ((C7384Etj.areEqual(str2, AnonymousClass006.A0x(AgeCheckStep.LINKING_FACEBOOK)) || C7384Etj.areEqual(ageCheck.step, AnonymousClass006.A0x(AgeCheckStep.LINKING_INSTAGRAM))) && (str = ageCheck.previousStep) != null) {
                    ageCheckFunnelLogging.showStep(ageCheck, str, AgeCheckVia.LINKING_RETURN);
                }
            }
        }
    }

    public final void onAgeCheckCleared() {
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                INSTANCE.exit(ageCheck, ageCheck.attempts > 0 ? Outcome.VERIFIED : Outcome.CLEARED_BY_SERVER);
            }
        }
    }

    public final void onBlocked() {
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                AgeCheckFunnelLogging ageCheckFunnelLogging = INSTANCE;
                ageCheckFunnelLogging.showStep(ageCheck, AnonymousClass006.A0x(AgeCheckStep.BLOCKED), AgeCheckVia.SERVER_REFRESH);
                ageCheckFunnelLogging.exit(ageCheck, Outcome.BLOCKED);
            }
        }
    }

    public final void onInAppRegate() {
        synchronized (lock) {
            inAppRegate = true;
        }
    }

    public final Map<String, String> qplAnnotations() {
        Map<String, String> mapA0E;
        synchronized (lock) {
            AgeCheck ageCheck = check;
            mapA0E = ageCheck == null ? AGH.A0E() : AGH.A0D(C3cG.A0r("age_check_id", ageCheck.id), C3cG.A0r(KEY_ENTRY_CONTEXT, ageCheck.entryContext), C3cG.A0r(KEY_ENTRY_TRIGGER, ageCheck.entryTrigger));
        }
        return mapA0E;
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.G0U, com.facebook.aura.ageverification.intf.AgeCheck] */
    /* JADX WARN: Type inference failed for: r10v2 */
    private final void exit(AgeCheck ageCheck, Outcome outcome) {
        ?? r10;
        AgeCheckResult ageCheckResult;
        AgeCheckFailure ageCheckFailure;
        int iOrdinal = outcome.ordinal();
        if (iOrdinal == 0 || iOrdinal == 3) {
            r10 = 0;
            closeAttempt(ageCheck, AgeCheckResult.VERIFIED, null, null, null);
        } else {
            if (iOrdinal == 1) {
                ageCheckResult = AgeCheckResult.BLOCKED;
                ageCheckFailure = AgeCheckFailure.GENERIC;
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                ageCheckResult = AgeCheckResult.CANCELLED;
                ageCheckFailure = AgeCheckFailure.CANCELLED;
            }
            r10 = 0;
            closeAttempt(ageCheck, ageCheckResult, ageCheckFailure, null, null);
        }
        Stage stage = Stage.EXITED;
        String str = ageCheck.step;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("outcome", AnonymousClass006.A0x(outcome));
        C3cH.A1A(HatchMetadataKey.DURATION_MS.getValue(), c0924AIaA0u, SystemClock.elapsedRealtime() - ageCheck.enteredAtMs);
        c0924AIaA0u.put(KEY_ATTEMPTS, String.valueOf(ageCheck.attempts));
        String str2 = ageCheck.lastMethod;
        if (str2 != null) {
            c0924AIaA0u.put(KEY_FINAL_METHOD, str2);
        }
        if (!ageCheck.methodsTried.isEmpty()) {
            c0924AIaA0u.put(KEY_METHODS_TRIED, AbstractC06907md.A01(",", ageCheck.methodsTried, r10));
        }
        log(ageCheck, stage, str, AIW.A0K(c0924AIaA0u), outcome.getEventType());
        check = r10;
    }

    private final String getWire(Enum<?> r1) {
        return AnonymousClass006.A0x(r1);
    }

    public final void stepShown(AgeCheckStep ageCheckStep, AgeCheckVia ageCheckVia) {
        AnonymousClass003.A0u(ageCheckStep, ageCheckVia);
        synchronized (lock) {
            AgeCheck ageCheck = check;
            if (ageCheck != null) {
                INSTANCE.showStep(ageCheck, AnonymousClass006.A0x(ageCheckStep), ageCheckVia);
            }
        }
    }
}
