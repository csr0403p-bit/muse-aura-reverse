package com.facebook.tigon;

import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.IOException;

/* loaded from: classes5.dex */
public class TigonErrorException extends IOException {
    public final TigonError tigonError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError) {
        super(A01(tigonError, ""));
        C7384Etj.A0Y(tigonError, 0);
        this.tigonError = tigonError;
    }

    public static final String convertErrorToRequestStatus(TigonError tigonError) {
        C7384Etj.A0Y(tigonError, 0);
        int iOrdinal = tigonError.category.ordinal();
        return iOrdinal != 1 ? iOrdinal != 0 ? "error" : "done" : "cancelled";
    }

    public static final String formatTigonException(IOException iOException) {
        StringBuilder sbA0g;
        if (iOException == null) {
            return null;
        }
        TigonError tigonErrorA00 = A00(iOException);
        if (tigonErrorA00 != null) {
            String strSubstring = tigonErrorA00.A02;
            if (strSubstring.startsWith("Tigon") && strSubstring.endsWith("Domain")) {
                strSubstring = strSubstring.substring(5, strSubstring.length() - 6);
            }
            TigonErrorCode tigonErrorCode = tigonErrorA00.category;
            int i = tigonErrorA00.A00;
            sbA0g = BV5.A0q(tigonErrorCode);
            C60O.A1R(":", strSubstring, sbA0g);
            sbA0g.append(i);
        } else {
            String strA0Y = C3cI.A0Y(iOException);
            Throwable cause = iOException.getCause();
            if (cause == null) {
                return strA0Y;
            }
            String strA0Y2 = C3cI.A0Y(cause);
            sbA0g = C3cG.A0g(strA0Y);
            sbA0g.append("|");
            sbA0g.append(strA0Y2);
        }
        return sbA0g.toString();
    }

    public static final TigonError A00(Throwable th) {
        while (true) {
            if (!(th instanceof IOException)) {
                break;
            }
            if (th instanceof TigonErrorException) {
                TigonErrorException tigonErrorException = (TigonErrorException) th;
                if (tigonErrorException != null) {
                    return tigonErrorException.tigonError;
                }
            } else {
                th = th.getCause();
            }
        }
        return null;
    }

    public static final String convertExceptionToRequestStatus(IOException iOException) {
        if (iOException == null) {
            return "done";
        }
        TigonError tigonErrorA00 = A00(iOException);
        if (tigonErrorA00 == null) {
            return "error";
        }
        int iOrdinal = tigonErrorA00.category.ordinal();
        return iOrdinal != 1 ? iOrdinal != 0 ? "error" : "done" : "cancelled";
    }

    public static final String A01(TigonError tigonError, String str) {
        AnonymousClass003.A0u(tigonError, str);
        StringBuilder sbA0x = C60O.A0x("TigonError(error=");
        BV4.A1O(sbA0x, tigonError.category);
        sbA0x.append(", errorDomain=");
        sbA0x.append(tigonError.A02);
        sbA0x.append(", domainErrorCode=");
        sbA0x.append(tigonError.A00);
        if (str.length() != 0) {
            sbA0x.append(", tigonErrorClassname=");
            sbA0x.append(str);
        }
        String str2 = tigonError.A01;
        if (str2.length() != 0) {
            sbA0x.append(", analyticsDetail=\"");
            sbA0x.append(str2);
            sbA0x.append("\"");
        }
        return BV7.A10(sbA0x);
    }

    public static final String formatTigonError(TigonError tigonError, String str) {
        return A01(tigonError, str);
    }

    public static final TigonError getUnderlyingTigonError(Throwable th) {
        return A00(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError, String str) {
        super(A01(tigonError, str));
        AnonymousClass003.A0u(tigonError, str);
        this.tigonError = tigonError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonErrorException(String str, TigonError tigonError) {
        super(str);
        AnonymousClass003.A0u(str, tigonError);
        this.tigonError = tigonError;
    }
}
