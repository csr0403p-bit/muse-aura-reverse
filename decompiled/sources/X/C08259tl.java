package X;

import java.util.Arrays;

/* renamed from: X.9tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08259tl extends C9tZ<Character, char[], C08399tz> implements C9hr<char[]> {
    public static final C08259tl A00 = new C08259tl();

    public C08259tl() {
        super(C08289to.A00);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08399tz c08399tz = (C08399tz) obj;
        AnonymousClass003.A0v(c9j4, c08399tz);
        char cA8K = c9j4.A8K(((C9tZ) this).A00, i);
        int iA00 = c08399tz.A00() + 1;
        char[] cArrCopyOf = c08399tz.A01;
        int length = cArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, iA00);
            C7384Etj.A0U(cArrCopyOf);
            c08399tz.A01 = cArrCopyOf;
        }
        int i3 = c08399tz.A00;
        c08399tz.A00 = i3 + 1;
        cArrCopyOf[i3] = cA8K;
    }
}
