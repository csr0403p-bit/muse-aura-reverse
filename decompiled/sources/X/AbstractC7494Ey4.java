package X;

import android.util.Base64;

/* renamed from: X.Ey4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7494Ey4 {
    public static final String A00(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        byte[] bArrEncode = Base64.encode(bArr, 11);
        C7384Etj.A0U(bArrEncode);
        return BV4.A0o(bArrEncode);
    }
}
