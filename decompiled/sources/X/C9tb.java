package X;

import java.util.Arrays;

/* renamed from: X.9tb, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9tb extends C9tZ<C9oE, C9oV, C08319tr> implements C9hr<C9oV> {
    public static final C9tb A00 = new C9tb();

    public C9tb() {
        super(C9oD.A01);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08319tr c08319tr = (C08319tr) obj;
        AnonymousClass003.A0v(c9j4, c08319tr);
        short sA8c = c9j4.A8S(((C9tZ) this).A00, i).A8c();
        int iA00 = c08319tr.A00() + 1;
        short[] sArrCopyOf = c08319tr.A01;
        int length = sArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            sArrCopyOf = Arrays.copyOf(sArrCopyOf, iA00);
            C7384Etj.A0U(sArrCopyOf);
            c08319tr.A01 = sArrCopyOf;
        }
        int i3 = c08319tr.A00;
        c08319tr.A00 = i3 + 1;
        sArrCopyOf[i3] = sA8c;
    }
}
