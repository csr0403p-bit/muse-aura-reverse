package X;

import java.util.Arrays;

/* renamed from: X.9tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08269tm extends C9tZ<Boolean, boolean[], C08389ty> implements C9hr<boolean[]> {
    public static final C08269tm A00 = new C08269tm();

    public C08269tm() {
        super(C07839ix.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08389ty c08389ty = (C08389ty) obj;
        AnonymousClass003.A0v(c9j4, c08389ty);
        boolean zA8G = c9j4.A8G(((C9tZ) this).A00, i);
        int iA00 = c08389ty.A00() + 1;
        boolean[] zArrCopyOf = c08389ty.A01;
        int length = zArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            zArrCopyOf = Arrays.copyOf(zArrCopyOf, iA00);
            C7384Etj.A0U(zArrCopyOf);
            c08389ty.A01 = zArrCopyOf;
        }
        int i3 = c08389ty.A00;
        c08389ty.A00 = i3 + 1;
        zArrCopyOf[i3] = zA8G;
    }
}
