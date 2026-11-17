package com.facebook.aura.login.nativeflow;

import X.AnonymousClass002;
import X.BFI;
import X.C3cG;
import com.facebook.aura.analytics.hatch.caa.HatchCaaAccountErrorType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;
import com.facebook.aura.analytics.hatch.caa.HatchCaaFailure;
import com.facebook.aura.network.hatchauth.HatchAuthError;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class HatchCaaFailureClassificationKt {
    public static final Set<String> INTEGRITY_ERROR_WIRE_TYPES;
    public static final HatchCaaFailure LINKING_DISCLOSURE_REQUIRED_FAILURE;
    public static final HatchCaaFailure LINKING_DISCLOSURE_UNAVAILABLE_FAILURE;
    public static final HatchCaaFailure NAME_REQUIRED_FAILURE;
    public static final HatchCaaFailure NTP_UPSELL_LINKING_DISCLOSURE_REQUIRED_FAILURE;
    public static final HatchCaaFailure NTP_UPSELL_LINKING_DISCLOSURE_UNAVAILABLE_FAILURE;
    public static final Set<String> SYSTEM_ERROR_WIRE_TYPES;
    public static final Set<String> USER_ERROR_WIRE_TYPES;

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:
    
        if (r2 < 600) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.analytics.hatch.caa.HatchCaaAccountErrorType hatchCaaAccountErrorType(com.facebook.aura.network.hatchauth.HatchAuthError r1, java.lang.String r2, java.lang.Integer r3, com.facebook.aura.login.nativeflow.HatchCaaRateLimit r4) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchCaaFailureClassificationKt.hatchCaaAccountErrorType(com.facebook.aura.network.hatchauth.HatchAuthError, java.lang.String, java.lang.Integer, com.facebook.aura.login.nativeflow.HatchCaaRateLimit):com.facebook.aura.analytics.hatch.caa.HatchCaaAccountErrorType");
    }

    public static final HatchCaaAccountErrorType unmappedWireTypeErrorType(String str) {
        if (str == null) {
            return null;
        }
        if (USER_ERROR_WIRE_TYPES.contains(str)) {
            return HatchCaaAccountErrorType.USER_ERROR;
        }
        if (INTEGRITY_ERROR_WIRE_TYPES.contains(str)) {
            return HatchCaaAccountErrorType.INTEGRITY_ERROR;
        }
        if (SYSTEM_ERROR_WIRE_TYPES.contains(str)) {
            return HatchCaaAccountErrorType.SYSTEM_ERROR;
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCaaRateLimit.values().length];
            try {
                AnonymousClass002.A13(HatchCaaRateLimit.ATTEMPT_BLOCK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCaaRateLimit.PLATFORM_BUDGET, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HatchCaaFailure.Companion companion = HatchCaaFailure.Companion;
        HatchCaaStage hatchCaaStage = HatchCaaStage.SSO_EXCHANGE;
        String value = hatchCaaStage.getValue();
        HatchCaaAccountErrorType hatchCaaAccountErrorType = HatchCaaAccountErrorType.USER_ERROR;
        NAME_REQUIRED_FAILURE = companion.clientSide(HatchCaaErrorType.NAME_REQUIRED, value, hatchCaaAccountErrorType);
        LINKING_DISCLOSURE_REQUIRED_FAILURE = companion.clientSide("linking_disclosure_required", hatchCaaStage.getValue(), hatchCaaAccountErrorType);
        LINKING_DISCLOSURE_UNAVAILABLE_FAILURE = C3cG.A0B(companion, HatchCaaErrorType.LINKING_DISCLOSURE_UNAVAILABLE, hatchCaaStage.getValue());
        HatchCaaStage hatchCaaStage2 = HatchCaaStage.REGISTER_COMPLETION_LINKED;
        NTP_UPSELL_LINKING_DISCLOSURE_REQUIRED_FAILURE = companion.clientSide("linking_disclosure_required", hatchCaaStage2.getValue(), hatchCaaAccountErrorType);
        NTP_UPSELL_LINKING_DISCLOSURE_UNAVAILABLE_FAILURE = C3cG.A0B(companion, HatchCaaErrorType.LINKING_DISCLOSURE_UNAVAILABLE, hatchCaaStage2.getValue());
        USER_ERROR_WIRE_TYPES = BFI.A0H(new String[]{"contactPointInUse", "invalidBirthday", AuraSubscriptionRepositoryKt.INVALID_NAME_ERROR_TYPE, "loginAuthenticationFailed", "passwordMatchesOld", "passwordRecoveryCrossAppFacebook", "passwordRecoveryCrossAppInstagram", "weakPassword"});
        INTEGRITY_ERROR_WIRE_TYPES = BFI.A0H(new String[]{"accountSelectionRequired", "missingContactPoint", "passkeyDisabled", "registrationBlocked", "unmigratedLegacyAccount"});
        SYSTEM_ERROR_WIRE_TYPES = BFI.A0H(new String[]{"confirmationFailed", "createFailed", "invalidHandle", "invalidNonce", "invalidRecoveryState", "invalidResetState", "invalidToken", "loginFailed", "otpSendFailed", "passkeyLoginFailed", "passwordRecoveryFailed", "passwordResetFailed", "provisionFailed", "registrationFailed", "removeFailed", "savedAccountUnavailable", "saveFailed", "twoFactorLoginFailed", "twoFactorSendFailed"});
    }

    public static final HatchCaaFailure getLINKING_DISCLOSURE_REQUIRED_FAILURE() {
        return LINKING_DISCLOSURE_REQUIRED_FAILURE;
    }

    public static final HatchCaaFailure getLINKING_DISCLOSURE_UNAVAILABLE_FAILURE() {
        return LINKING_DISCLOSURE_UNAVAILABLE_FAILURE;
    }

    public static final HatchCaaFailure getNAME_REQUIRED_FAILURE() {
        return NAME_REQUIRED_FAILURE;
    }

    public static final HatchCaaFailure getNTP_UPSELL_LINKING_DISCLOSURE_REQUIRED_FAILURE() {
        return NTP_UPSELL_LINKING_DISCLOSURE_REQUIRED_FAILURE;
    }

    public static final HatchCaaFailure getNTP_UPSELL_LINKING_DISCLOSURE_UNAVAILABLE_FAILURE() {
        return NTP_UPSELL_LINKING_DISCLOSURE_UNAVAILABLE_FAILURE;
    }

    public static /* synthetic */ HatchCaaAccountErrorType hatchCaaAccountErrorType$default(HatchAuthError hatchAuthError, String str, Integer num, HatchCaaRateLimit hatchCaaRateLimit, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchCaaRateLimit = HatchCaaRateLimit.PLATFORM_BUDGET;
        }
        return hatchCaaAccountErrorType(hatchAuthError, str, num, hatchCaaRateLimit);
    }

    public static /* synthetic */ HatchCaaFailure hatchCaaFailure$default(Throwable th, HatchCaaStage hatchCaaStage, HatchCaaRateLimit hatchCaaRateLimit, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchCaaRateLimit = HatchCaaRateLimit.PLATFORM_BUDGET;
        }
        return hatchCaaFailure(th, hatchCaaStage, hatchCaaRateLimit);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[PHI: r3 r4 r5 r9
  0x001d: PHI (r3v7 com.facebook.aura.json.HatchProblemJson) = (r3v1 com.facebook.aura.json.HatchProblemJson), (r3v8 com.facebook.aura.json.HatchProblemJson) binds: [B:49:0x00aa, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:49:0x00aa, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r5v4 com.facebook.aura.network.hatchauth.HatchAuthError) = (r5v1 com.facebook.aura.network.hatchauth.HatchAuthError), (r5v5 com.facebook.aura.network.hatchauth.HatchAuthError) binds: [B:49:0x00aa, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r9v6 com.facebook.aura.network.hatchauth.HatchAuthException) = 
  (r9v2 com.facebook.aura.network.hatchauth.HatchAuthException)
  (r9v8 com.facebook.aura.network.hatchauth.HatchAuthException)
 binds: [B:49:0x00aa, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae A[PHI: r3 r4 r5 r9
  0x00ae: PHI (r3v2 com.facebook.aura.json.HatchProblemJson) = (r3v1 com.facebook.aura.json.HatchProblemJson), (r3v7 com.facebook.aura.json.HatchProblemJson) binds: [B:49:0x00aa, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:49:0x00aa, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r5v2 com.facebook.aura.network.hatchauth.HatchAuthError) = (r5v1 com.facebook.aura.network.hatchauth.HatchAuthError), (r5v4 com.facebook.aura.network.hatchauth.HatchAuthError) binds: [B:49:0x00aa, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r9v3 com.facebook.aura.network.hatchauth.HatchAuthException) = 
  (r9v2 com.facebook.aura.network.hatchauth.HatchAuthException)
  (r9v6 com.facebook.aura.network.hatchauth.HatchAuthException)
 binds: [B:49:0x00aa, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.analytics.hatch.caa.HatchCaaFailure hatchCaaFailure(java.lang.Throwable r11, com.facebook.aura.login.nativeflow.HatchCaaStage r12, com.facebook.aura.login.nativeflow.HatchCaaRateLimit r13) {
        /*
            X.AnonymousClass003.A0x(r12, r13)
            boolean r0 = r11 instanceof com.facebook.aura.network.hatchauth.HatchAuthException
            r2 = 0
            if (r0 == 0) goto La6
            r9 = r11
            com.facebook.aura.network.hatchauth.HatchAuthException r9 = (com.facebook.aura.network.hatchauth.HatchAuthException) r9
            if (r9 == 0) goto La7
            com.facebook.aura.network.hatchauth.HatchAuthError r5 = r9.error
            com.facebook.aura.json.HatchProblemJson r3 = r9.problem
            if (r3 == 0) goto La9
            java.lang.String r4 = r3.type
            if (r4 == 0) goto La9
            int r0 = r4.length()
            if (r0 <= 0) goto La9
        L1d:
            int r0 = r3.status
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto Lae
        L25:
            r7 = 200(0xc8, float:2.8E-43)
            if (r4 != 0) goto L37
            if (r10 == 0) goto L37
            int r8 = r10.intValue()
            if (r7 > r8) goto L37
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 1
            r6 = r2
            if (r8 < r0) goto L39
        L37:
            r1 = 0
            r6 = r10
        L39:
            if (r9 != 0) goto L45
            if (r11 == 0) goto L45
            java.lang.Class r0 = r11.getClass()
            java.lang.String r2 = r0.getName()
        L45:
            if (r4 != 0) goto La4
            if (r1 == 0) goto L95
            java.lang.String r0 = "malformed_response"
        L4b:
            java.lang.StringBuilder r9 = X.C3cG.A0g(r0)
            java.lang.String r8 = " "
            if (r10 == 0) goto L5d
            int r1 = r10.intValue()
            r9.append(r8)
            r9.append(r1)
        L5d:
            if (r3 == 0) goto L71
            java.lang.String r3 = r3.title
            if (r3 == 0) goto L71
            int r1 = r3.length()
            if (r1 <= 0) goto L71
            java.lang.String r1 = ": "
            r9.append(r1)
            r9.append(r3)
        L71:
            if (r2 == 0) goto L79
            r9.append(r8)
            r9.append(r2)
        L79:
            java.lang.String r3 = r9.toString()
            java.lang.String r2 = r12.getValue()
            java.lang.String r1 = " | "
            java.lang.String r1 = X.FGI.A0U(r2, r1, r3)
            java.lang.String r3 = X.BQG.A17(r1, r7)
            com.facebook.aura.analytics.hatch.caa.HatchCaaAccountErrorType r2 = hatchCaaAccountErrorType(r5, r4, r6, r13)
            com.facebook.aura.analytics.hatch.caa.HatchCaaFailure r1 = new com.facebook.aura.analytics.hatch.caa.HatchCaaFailure
            r1.<init>(r0, r6, r3, r2)
            return r1
        L95:
            com.facebook.aura.network.hatchauth.HatchAuthError$Network r0 = com.facebook.aura.network.hatchauth.HatchAuthError.Network.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r5, r0)
            java.lang.String r0 = "transport_failure"
            if (r1 != 0) goto L4b
            if (r6 == 0) goto L4b
            java.lang.String r0 = "untyped_api_error"
            goto L4b
        La4:
            r0 = r4
            goto L4b
        La6:
            r9 = r2
        La7:
            r5 = r2
            r3 = r2
        La9:
            r4 = r2
            if (r3 == 0) goto Lae
            goto L1d
        Lae:
            boolean r0 = r5 instanceof com.facebook.aura.network.hatchauth.HatchAuthError.Failed
            if (r0 == 0) goto Lbf
            r0 = r5
            com.facebook.aura.network.hatchauth.HatchAuthError$Failed r0 = (com.facebook.aura.network.hatchauth.HatchAuthError.Failed) r0
            if (r0 == 0) goto Lbf
            int r0 = r0.httpCode
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            goto L25
        Lbf:
            r10 = r2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchCaaFailureClassificationKt.hatchCaaFailure(java.lang.Throwable, com.facebook.aura.login.nativeflow.HatchCaaStage, com.facebook.aura.login.nativeflow.HatchCaaRateLimit):com.facebook.aura.analytics.hatch.caa.HatchCaaFailure");
    }
}
