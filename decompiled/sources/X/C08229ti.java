package X;

import java.util.Arrays;

/* renamed from: X.9ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08229ti extends C9tZ<Float, float[], C9u1> implements C9hr<float[]> {
    public static final C08229ti A00 = new C08229ti();

    public C08229ti() {
        super(C07819iv.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C9u1 c9u1 = (C9u1) obj;
        AnonymousClass003.A0v(c9j4, c9u1);
        float fA8Q = c9j4.A8Q(((C9tZ) this).A00, i);
        int iA00 = c9u1.A00() + 1;
        float[] fArrCopyOf = c9u1.A01;
        int length = fArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, iA00);
            C7384Etj.A0U(fArrCopyOf);
            c9u1.A01 = fArrCopyOf;
        }
        int i3 = c9u1.A00;
        c9u1.A00 = i3 + 1;
        fArrCopyOf[i3] = fA8Q;
    }
}
