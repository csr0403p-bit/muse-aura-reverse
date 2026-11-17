package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EBa implements InterfaceC9648GXn {
    public static final EBa A00 = new EBa();

    @Override // X.InterfaceC9648GXn
    public final void A8D(String str, Object... objArr) {
        C7384Etj.A0Y(str, 1);
        Arrays.copyOf(objArr, objArr.length);
    }

    @Override // X.InterfaceC9648GXn
    public final void AAq(String str, String str2, Object... objArr) {
        CFK.A0F(str, str2, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // X.InterfaceC9648GXn
    public final void AAr(String str, String str2, Throwable th, Object... objArr) {
        C7384Etj.A0Y(th, 1);
        CFK.A0C(str, str2, th, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // X.InterfaceC9648GXn
    public final void AiN(String str, String str2, Object... objArr) {
        C7384Etj.A0Y(str2, 1);
        CFK.A0H(str, str2, Arrays.copyOf(objArr, objArr.length));
    }
}
