package X;

import java.util.Iterator;
import libraries.accessv2.src.model.FXAccessException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ENt {
    public static final ENt A00 = new ENt();
    public static final BXn A01 = BXn.A02;

    public final boolean A02(String str, ENw eNw) throws FXAccessException {
        if (str != null && !str.equals(eNw.A02)) {
            return false;
        }
        EP1 ep1 = eNw.A04;
        Long l = eNw.A00;
        if (ep1 != EP1.A05 || l == null) {
            return true;
        }
        if (System.currentTimeMillis() - l.longValue() <= 7344000000L) {
            return true;
        }
        throw new FXAccessException(AnonymousClass007.A0a("Expired credential for credentialSource ", ep1), ENz.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[Catch: Exception -> 0x00e6, TryCatch #2 {Exception -> 0x00e6, blocks: (B:37:0x0089, B:39:0x009f, B:41:0x00ae, B:42:0x00b0, B:46:0x00d9, B:43:0x00ce), top: B:69:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.ENw A01(java.lang.String r20, java.lang.String r21, java.lang.String r22, X.EP0 r23, X.EP1 r24, X.EO8 r25) throws libraries.accessv2.src.model.FXAccessException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENt.A01(java.lang.String, java.lang.String, java.lang.String, X.EP0, X.EP1, X.EO8):X.ENw");
    }

    public static final BXn A00(String str, String str2, JSONObject jSONObject) {
        Object next;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str2);
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString(str, "");
            Iterator<E> it = BXn.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.toString(), strOptString)) {
                    break;
                }
            }
            BXn bXn = (BXn) next;
            if (bXn != null) {
                return bXn;
            }
        }
        return A01;
    }
}
