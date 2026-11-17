package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GQP implements InterfaceC9648GXn {
    public static String A00(String str, Object[] objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C7384Etj.A0U(strLocaleSafe);
        return strLocaleSafe;
    }

    @Override // X.InterfaceC9648GXn
    public final void A8D(String str, Object... objArr) {
        C7384Etj.A0Y(str, 1);
        AbstractC7608F5v.A1L(A00(str, objArr));
    }

    @Override // X.InterfaceC9648GXn
    public final void AAr(String str, String str2, Throwable th, Object... objArr) {
        C7384Etj.A0Y(th, 1);
        AbstractC7608F5v.A1L(A00(str2, objArr));
    }

    @Override // X.InterfaceC9648GXn
    public final void AiN(String str, String str2, Object... objArr) {
        C7384Etj.A0Y(str2, 1);
        AbstractC7608F5v.A1L(A00(str2, objArr));
    }

    @Override // X.InterfaceC9648GXn
    public final void AAq(String str, String str2, Object... objArr) {
        AbstractC7608F5v.A1L(A00(str2, objArr));
    }
}
