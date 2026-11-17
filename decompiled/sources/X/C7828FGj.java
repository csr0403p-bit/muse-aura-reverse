package X;

/* renamed from: X.FGj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7828FGj {
    public static final C7828FGj A00 = new C7828FGj();

    public final long A00(int i, int i2, int i3, int i4) {
        AbstractC7829FGk abstractC7829FGk = i == i2 ? C7840FGw.A00 : i == 0 ? C7838FGu.A00 : C7839FGv.A00;
        AbstractC7829FGk abstractC7829FGk2 = i3 == i4 ? C7840FGw.A00 : i3 == 0 ? C7838FGu.A00 : C7839FGv.A00;
        ADq aDq = abstractC7829FGk.A01;
        int i5 = aDq.A00;
        int i6 = aDq.A01;
        ADq aDq2 = abstractC7829FGk2.A01;
        int i7 = aDq2.A00;
        int i8 = aDq2.A01;
        if (i < 0) {
            StringBuilder sbA0y = C60O.A0y("minWidth must be >= 0, but was: ", i);
            AbstractC7607F5u.A1P(". minWidth=", ", maxWidth=", sbA0y, i, i2);
            AbstractC7607F5u.A1P(", minHeight=", ", maxHeight=", sbA0y, i3, i4);
            throw C60O.A0i(sbA0y.toString());
        }
        if (i3 < 0) {
            StringBuilder sbA0y2 = C60O.A0y("minHeight must be >= 0, but was: ", i3);
            AbstractC7607F5u.A1P(". minWidth=", ", maxWidth=", sbA0y2, i, i2);
            AbstractC7607F5u.A1P(", minHeight=", ", maxHeight=", sbA0y2, i3, i4);
            throw C60O.A0i(sbA0y2.toString());
        }
        if (i > i5 && i != Integer.MAX_VALUE) {
            StringBuilder sbA0y3 = C60O.A0y("minWidth must be <= ", i5);
            sbA0y3.append(", but was: ");
            sbA0y3.append(i);
            AbstractC7607F5u.A1P(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", sbA0y3, i, i2);
            AbstractC7607F5u.A1P(", minHeight=", ", maxHeight=", sbA0y3, i3, i4);
            throw C60O.A0i(sbA0y3.toString());
        }
        if (i2 > i6 && i2 != Integer.MAX_VALUE) {
            StringBuilder sbA0y4 = C60O.A0y("maxWidth must be <= ", i6);
            AbstractC7607F5u.A1P(", but was: ", ". Components this big may affect performance and lead to out of memory errors. minWidth=", sbA0y4, i2, i);
            AbstractC7607F5u.A1P(", maxWidth=", ", minHeight=", sbA0y4, i2, i3);
            throw C60O.A0i(C60P.A1O(", maxHeight=", sbA0y4, i4));
        }
        if (i3 > i7 && i3 != Integer.MAX_VALUE) {
            StringBuilder sbA0y5 = C60O.A0y("minHeight must be <= ", i7);
            AbstractC7607F5u.A1P(", but was: ", ". Components this big may affect performance and lead to out of memory errors. minWidth=", sbA0y5, i3, i);
            AbstractC7607F5u.A1P(", maxWidth=", ", minHeight=", sbA0y5, i2, i3);
            throw C60O.A0i(C60P.A1O(", maxHeight=", sbA0y5, i4));
        }
        if (i4 > i8 && i4 != Integer.MAX_VALUE) {
            StringBuilder sbA0y6 = C60O.A0y("maxHeight must be <= ", i8);
            AbstractC7607F5u.A1P(", but was: ", ". Components this big may affect performance and lead to out of memory errors. minWidth=", sbA0y6, i4, i);
            AbstractC7607F5u.A1P(", maxWidth=", ", minHeight=", sbA0y6, i2, i3);
            throw C60O.A0i(C60P.A1O(", maxHeight=", sbA0y6, i4));
        }
        if (i <= i2) {
            if (i3 <= i4) {
                return (abstractC7829FGk.A06(i, i2) << 32) | abstractC7829FGk2.A06(i3, i4);
            }
            StringBuilder sbA0y7 = C60O.A0y("maxHeight must be >= minHeight, but was: maxHeight=", i4);
            AbstractC7607F5u.A1P("; minHeight=", ". minWidth=", sbA0y7, i3, i);
            AbstractC7607F5u.A1P(", maxWidth=", ", minHeight=", sbA0y7, i2, i3);
            throw C60O.A0i(C60P.A1O(", maxHeight=", sbA0y7, i4));
        }
        StringBuilder sbA0y8 = C60O.A0y("maxWidth must be >= minWidth, but was: maxWidth=", i2);
        sbA0y8.append("; minWidth=");
        sbA0y8.append(i);
        AbstractC7607F5u.A1P(". minWidth=", ", maxWidth=", sbA0y8, i, i2);
        AbstractC7607F5u.A1P(", minHeight=", ", maxHeight=", sbA0y8, i3, i4);
        throw C60O.A0i(sbA0y8.toString());
    }
}
