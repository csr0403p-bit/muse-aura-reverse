package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.IOException;

/* renamed from: X.CGt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3356CGt extends C06G {
    public final IOException A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3356CGt) {
                C3356CGt c3356CGt = (C3356CGt) obj;
                if (this.A01 != c3356CGt.A01 || !C7384Etj.areEqual(this.A00, c3356CGt.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return (BV5.A03(num, A0y(num)) * 31) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        Integer num = this.A01;
        IOException iOException = this.A00;
        StringBuilder sbA0x = C60O.A0x("AuthError(type=");
        sbA0x.append(num != null ? A0y(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        return C3cJ.A0L(iOException, AbstractC7606F5t.A00(18), sbA0x);
    }

    public C3356CGt(IOException iOException, Integer num) {
        this.A01 = num;
        this.A00 = iOException;
    }

    public static String A0y(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NETWORK_FAILURE";
            case 2:
                return "CREDENTIAL_NOT_VALID";
            case 3:
                return "USERNAME_NOT_FOUND";
            case 4:
                return "REAUTHENTICATION_USER_MISMATCH";
            case 5:
                return "LOGIN_APPROVAL_CHALLENGE";
            case 6:
                return "WEB_LOGIN_REQUIRED";
            case 7:
                return "SAVE_ACCOUNT_FAILURE";
            case 8:
                return "TWO_FACTOR_INVALID_CODE";
            case 9:
                return "CHECKPOINT_INVALID_CODE";
            case 10:
                return "POST_AUTH_OPERATION_FAILURE";
            case 11:
                return "TOKEN_FETCH_FAILURE";
            case 12:
                return "PRE_SIGN_OUT_OPERATION_FAILURE";
            case 13:
                return "POST_SIGN_OUT_OPERATION_FAILURE";
            case 14:
                return "TWO_FAC_REQUIRED";
            case 15:
                return "NAVIGATION_ERROR";
            case 16:
                return "TOO_MANY_REQUESTS_ERROR";
            case 17:
                return "CONFIG_ERROR";
            default:
                return "UNKNOWN";
        }
    }
}
