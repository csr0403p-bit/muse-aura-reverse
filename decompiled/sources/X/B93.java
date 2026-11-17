package X;

import android.graphics.Typeface;

/* loaded from: classes4.dex */
public final class B93 implements B9C {
    @Override // X.B9C
    public final Typeface A7v(C1736ApY c1736ApY, C1847AsK c1847AsK, int i) {
        Typeface typefaceCreate;
        String str = c1847AsK.A00;
        if (i != 0 || !C7384Etj.areEqual(c1736ApY, C1736ApY.A04)) {
            if (str == null) {
                typefaceCreate = Typeface.DEFAULT;
            }
            return Typeface.create(typefaceCreate, c1736ApY.A00, AnonymousClass002.A1Q(i, 1));
        }
        if (str == null || str.length() == 0) {
            return Typeface.DEFAULT;
        }
        typefaceCreate = Typeface.create(str, 0);
        return Typeface.create(typefaceCreate, c1736ApY.A00, AnonymousClass002.A1Q(i, 1));
    }
}
