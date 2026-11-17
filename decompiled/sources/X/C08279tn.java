package X;

import java.util.Arrays;

/* renamed from: X.9tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08279tn extends C9tZ<Long, long[], C08369tw> implements C9hr<long[]> {
    public static final C08279tn A00 = new C08279tn();

    public C08279tn() {
        super(C9j1.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08369tw c08369tw = (C08369tw) obj;
        AnonymousClass003.A0v(c9j4, c08369tw);
        long jA8X = c9j4.A8X(((C9tZ) this).A00, i);
        int iA00 = c08369tw.A00() + 1;
        long[] jArrCopyOf = c08369tw.A01;
        int length = jArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, iA00);
            C7384Etj.A0U(jArrCopyOf);
            c08369tw.A01 = jArrCopyOf;
        }
        int i3 = c08369tw.A00;
        c08369tw.A00 = i3 + 1;
        jArrCopyOf[i3] = jA8X;
    }
}
