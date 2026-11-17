package X;

import java.util.Arrays;

/* renamed from: X.9th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08219th extends C9tZ<Double, double[], C9u0> implements C9hr<double[]> {
    public static final C08219th A00 = new C08219th();

    public C08219th() {
        super(C07799it.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C9u0 c9u0 = (C9u0) obj;
        AnonymousClass003.A0v(c9j4, c9u0);
        double dA8M = c9j4.A8M(((C9tZ) this).A00, i);
        int iA00 = c9u0.A00() + 1;
        double[] dArrCopyOf = c9u0.A01;
        int length = dArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, iA00);
            C7384Etj.A0U(dArrCopyOf);
            c9u0.A01 = dArrCopyOf;
        }
        int i3 = c9u0.A00;
        c9u0.A00 = i3 + 1;
        dArrCopyOf[i3] = dA8M;
    }
}
