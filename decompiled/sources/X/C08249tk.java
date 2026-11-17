package X;

import java.util.Arrays;

/* renamed from: X.9tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08249tk extends C9tZ<Integer, int[], C08359tv> implements C9hr<int[]> {
    public static final C08249tk A00 = new C08249tk();

    public C08249tk() {
        super(C07729ii.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08359tv c08359tv = (C08359tv) obj;
        AnonymousClass003.A0v(c9j4, c08359tv);
        int iA8U = c9j4.A8U(((C9tZ) this).A00, i);
        int iA00 = c08359tv.A00() + 1;
        int[] iArrCopyOf = c08359tv.A01;
        int length = iArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iA00);
            C7384Etj.A0U(iArrCopyOf);
            c08359tv.A01 = iArrCopyOf;
        }
        int i3 = c08359tv.A00;
        c08359tv.A00 = i3 + 1;
        iArrCopyOf[i3] = iA8U;
    }
}
