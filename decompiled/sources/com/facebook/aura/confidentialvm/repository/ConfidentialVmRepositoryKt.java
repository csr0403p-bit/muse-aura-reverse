package com.facebook.aura.confidentialvm.repository;

import X.ACv;
import X.AnonymousClass002;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7Bm;
import X.G0U;
import X.GBL;
import X.HtJ;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult;

/* loaded from: classes4.dex */
public abstract class ConfidentialVmRepositoryKt {
    public static final int DECIMAL_RADIX = 10;
    public static final int HTTP_REQUEST_TIMEOUT = 408;
    public static final int HTTP_SERVER_ERROR = 500;
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final int HTTP_UNAUTHORIZED = 401;
    public static final String MINT_SSH_ACCESS_TOKENS_URL = "https://api.muse.ai/ssh-access/tokens";
    public static final int RV_KEY_SIZE_BYTES = 32;

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmVestaRegistration.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmVestaRegistration.REGISTERED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmVestaRegistration.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmVestaRegistration.NOT_REGISTERED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> Object awaitResult(ACv<T> aCv, HtJ<? super T> htJ) {
        GBL gblA03 = C7Bm.A03(htJ);
        ConfidentialVmRepositoryKt$awaitResult$2$1 confidentialVmRepositoryKt$awaitResult$2$1 = new ConfidentialVmRepositoryKt$awaitResult$2$1(gblA03);
        synchronized (aCv.A00) {
            if (aCv.A02.getCount() != 0) {
                aCv.A01.add(confidentialVmRepositoryKt$awaitResult$2$1);
            } else {
                confidentialVmRepositoryKt$awaitResult$2$1.run(aCv.A03);
            }
        }
        return gblA03.A0F();
    }

    public static final String normalizeRecoveryPin(String str) {
        int iA02 = C60R.A02(str);
        if (iA02 != 0) {
            StringBuilder sb = new StringBuilder(iA02);
            int iCharCount = 0;
            while (iCharCount < iA02) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int iDigit = Character.digit(iCodePointAt, 10);
                if (iDigit >= 0) {
                    sb.append(iDigit);
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return sb.toString();
        }
        return null;
    }

    public static final String pinSnapshotKey(long j, String str) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(j);
        return C60P.A1M(":", str, sbA0w);
    }

    public static final Object registerEnrollmentPinAfterRegistrationCheck(ConfidentialVmVestaRegistration confidentialVmVestaRegistration, G0U<? super HtJ<? super ConfidentialVmEscrowResult>, ? extends Object> g0u, HtJ<? super ConfidentialVmEscrowResult> htJ) {
        int iOrdinal = confidentialVmVestaRegistration.ordinal();
        if (iOrdinal == 0) {
            return ConfidentialVmEscrowResult.AlreadyRegistered.INSTANCE;
        }
        if (iOrdinal == 2) {
            return ConfidentialVmEscrowResult.RegistrationLookupUnavailable.INSTANCE;
        }
        if (iOrdinal == 1) {
            return g0u.invoke(htJ);
        }
        throw C3cG.A0q();
    }
}
