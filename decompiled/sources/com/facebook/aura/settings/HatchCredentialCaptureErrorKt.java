package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.R;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchCredentialCaptureErrorKt {
    public static final int credentialCaptureErrorResource(CredentialCaptureError credentialCaptureError) {
        int iA0E = AnonymousClass001.A0E(credentialCaptureError, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f120e94;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f120e92;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f120e91;
        }
        if (iA0E == 3) {
            return R.string._name_removed__res_0x7f120e93;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r1.equals("capture_conflict") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r1.equals("capture_invalid") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r1 != 409) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r0 = com.facebook.aura.settings.CredentialCaptureError.CONFLICT;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.settings.CredentialCaptureResult.Error credentialCaptureResult(java.lang.Throwable r4) {
        /*
            r2 = 0
            X.C7384Etj.A0Y(r4, r2)
            boolean r0 = r4 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L5a
            com.facebook.aura.json.NetworkException r4 = (com.facebook.aura.json.NetworkException) r4
        La:
            r3 = 1
            if (r4 == 0) goto L18
            java.lang.String r1 = r4.errorCode
            if (r1 == 0) goto L32
            int r0 = r1.hashCode()
            switch(r0) {
                case -2142324226: goto L29;
                case -1922675360: goto L4a;
                case 1103586475: goto L20;
                default: goto L18;
            }
        L18:
            com.facebook.aura.settings.CredentialCaptureError r0 = com.facebook.aura.settings.CredentialCaptureError.FAILED
            com.facebook.aura.settings.CredentialCaptureResult$Error r1 = new com.facebook.aura.settings.CredentialCaptureResult$Error
            r1.<init>(r0, r3)
            return r1
        L20:
            java.lang.String r0 = "capture_conflict"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L18
        L29:
            java.lang.String r0 = "capture_invalid"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47
            goto L18
        L32:
            int r1 = r4.httpResponseCode
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L47
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L44
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L41
            goto L18
        L41:
            com.facebook.aura.settings.CredentialCaptureError r0 = com.facebook.aura.settings.CredentialCaptureError.CONFLICT
            goto L54
        L44:
            com.facebook.aura.settings.CredentialCaptureError r0 = com.facebook.aura.settings.CredentialCaptureError.FAILED
            goto L54
        L47:
            com.facebook.aura.settings.CredentialCaptureError r0 = com.facebook.aura.settings.CredentialCaptureError.INVALID
            goto L54
        L4a:
            java.lang.String r0 = "capture_credit_card_rejected"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            com.facebook.aura.settings.CredentialCaptureError r0 = com.facebook.aura.settings.CredentialCaptureError.CREDIT_CARD_REJECTED
        L54:
            com.facebook.aura.settings.CredentialCaptureResult$Error r1 = new com.facebook.aura.settings.CredentialCaptureResult$Error
            r1.<init>(r0, r2)
            return r1
        L5a:
            r4 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchCredentialCaptureErrorKt.credentialCaptureResult(java.lang.Throwable):com.facebook.aura.settings.CredentialCaptureResult$Error");
    }

    public static final Integer errorResource(SecureStorageCaptureUiState secureStorageCaptureUiState) {
        int iOrdinal;
        int iCredentialCaptureErrorResource;
        C7384Etj.A0Y(secureStorageCaptureUiState, 0);
        CredentialCaptureError credentialCaptureError = secureStorageCaptureUiState.captureError;
        if (credentialCaptureError != null) {
            iCredentialCaptureErrorResource = credentialCaptureErrorResource(credentialCaptureError);
        } else {
            SecureStorageCaptureError secureStorageCaptureError = secureStorageCaptureUiState.error;
            if (secureStorageCaptureError == null || (iOrdinal = secureStorageCaptureError.ordinal()) == -1) {
                return null;
            }
            if (iOrdinal == 0) {
                iCredentialCaptureErrorResource = R.string._name_removed__res_0x7f120ea3;
            } else if (iOrdinal == 1) {
                iCredentialCaptureErrorResource = R.string._name_removed__res_0x7f120eb9;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iCredentialCaptureErrorResource = R.string._name_removed__res_0x7f120eab;
            }
        }
        return Integer.valueOf(iCredentialCaptureErrorResource);
    }

    public static final int resource(SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError) {
        int iA0E = AnonymousClass001.A0E(secureStorageVerificationCodeCaptureError, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f120ebb;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f120ec1;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f120ebd;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CredentialCaptureError.values().length];
            try {
                AnonymousClass005.A0v(CredentialCaptureError.INVALID, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(CredentialCaptureError.CREDIT_CARD_REJECTED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(CredentialCaptureError.CONFLICT, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(CredentialCaptureError.FAILED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SecureStorageCaptureError.values().length];
            try {
                AnonymousClass005.A0v(SecureStorageCaptureError.INVALID_WEBSITE, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(SecureStorageCaptureError.USERNAME_TOO_LONG, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(SecureStorageCaptureError.PASSWORD_TOO_LONG, iArr2, 3);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SecureStorageVerificationCodeCaptureError.values().length];
            try {
                AnonymousClass005.A0v(SecureStorageVerificationCodeCaptureError.INVALID_CHARACTERS, iArr3, 1);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(SecureStorageVerificationCodeCaptureError.TOO_LONG, iArr3, 2);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(SecureStorageVerificationCodeCaptureError.SUBMIT_FAILED, iArr3, 3);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Integer errorResource(SecureStorageVerificationCodeCaptureUiState secureStorageVerificationCodeCaptureUiState) {
        int iResource;
        C7384Etj.A0Y(secureStorageVerificationCodeCaptureUiState, 0);
        CredentialCaptureError credentialCaptureError = secureStorageVerificationCodeCaptureUiState.captureError;
        if (credentialCaptureError != null) {
            iResource = credentialCaptureErrorResource(credentialCaptureError);
        } else {
            SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError = secureStorageVerificationCodeCaptureUiState.error;
            if (secureStorageVerificationCodeCaptureError != null) {
                iResource = resource(secureStorageVerificationCodeCaptureError);
            } else {
                return null;
            }
        }
        return Integer.valueOf(iResource);
    }
}
