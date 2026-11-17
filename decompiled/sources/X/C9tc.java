package X;

import java.util.Arrays;

/* renamed from: X.9tc, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9tc extends C9tZ<FKC, C9oX, C08309tq> implements C9hr<C9oX> {
    public static final C9tc A00 = new C9tc();

    public C9tc() {
        super(C9oC.A01);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08309tq c08309tq = (C08309tq) obj;
        AnonymousClass003.A0v(c9j4, c08309tq);
        int iA8T = c9j4.A8S(((C9tZ) this).A00, i).A8T();
        int iA00 = c08309tq.A00() + 1;
        int[] iArrCopyOf = c08309tq.A01;
        int length = iArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iA00);
            C7384Etj.A0U(iArrCopyOf);
            c08309tq.A01 = iArrCopyOf;
        }
        int i3 = c08309tq.A00;
        c08309tq.A00 = i3 + 1;
        iArrCopyOf[i3] = iA8T;
    }
}
