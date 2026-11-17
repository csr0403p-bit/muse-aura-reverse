package X;

import java.util.Arrays;

/* renamed from: X.9ta, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ta extends C9tZ<C9oA, C9oW, C08329ts> implements C9hr<C9oW> {
    public static final C9ta A00 = new C9ta();

    public C9ta() {
        super(C9o9.A01);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08329ts c08329ts = (C08329ts) obj;
        AnonymousClass003.A0v(c9j4, c08329ts);
        byte bA8H = c9j4.A8S(((C9tZ) this).A00, i).A8H();
        int iA00 = c08329ts.A00() + 1;
        byte[] bArrCopyOf = c08329ts.A01;
        int length = bArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, iA00);
            C7384Etj.A0U(bArrCopyOf);
            c08329ts.A01 = bArrCopyOf;
        }
        int i3 = c08329ts.A00;
        c08329ts.A00 = i3 + 1;
        bArrCopyOf[i3] = bA8H;
    }
}
