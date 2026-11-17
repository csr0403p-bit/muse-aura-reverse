package X;

import java.util.ArrayList;

/* renamed from: X.9jL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9jL implements C9hr<byte[]> {
    public static final C9jL A00 = new C9jL();
    public static final C9hr<int[]> A01 = C08249tk.A00;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        int[] iArr = (int[]) interfaceC07829iw.A8b(A01);
        ArrayList arrayListA11 = C60O.A11(iArr.length);
        for (int i : iArr) {
            arrayListA11.add(Byte.valueOf((byte) (i & 255)));
        }
        return AbstractC0878AGe.A0l(arrayListA11);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return C9iY.A04("com.meta.mfa.credentials.MfaByteArray", A01.getDescriptor());
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        byte[] bArr = (byte[]) obj;
        AnonymousClass003.A0u(interfaceC07789is, bArr);
        ArrayList arrayListA11 = C60O.A11(bArr.length);
        for (byte b : bArr) {
            C60Q.A1P(arrayListA11, b & 255);
        }
        interfaceC07789is.AAR(AbstractC0878AGe.A0n(arrayListA11), A01);
    }
}
