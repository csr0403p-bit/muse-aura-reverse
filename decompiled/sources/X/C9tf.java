package X;

import java.util.Arrays;

/* renamed from: X.9tf, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9tf extends C9tZ<Byte, byte[], C08349tu> implements C9hr<byte[]> {
    public static final C9tf A00 = new C9tf();

    public C9tf() {
        super(C9o7.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08349tu c08349tu = (C08349tu) obj;
        AnonymousClass003.A0v(c9j4, c08349tu);
        byte bA8I = c9j4.A8I(((C9tZ) this).A00, i);
        int iA00 = c08349tu.A00() + 1;
        byte[] bArrCopyOf = c08349tu.A01;
        int length = bArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, iA00);
            C7384Etj.A0U(bArrCopyOf);
            c08349tu.A01 = bArrCopyOf;
        }
        int i3 = c08349tu.A00;
        c08349tu.A00 = i3 + 1;
        bArrCopyOf[i3] = bA8I;
    }
}
