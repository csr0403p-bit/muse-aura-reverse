package X;

/* loaded from: classes4.dex */
public abstract class AZD {
    public static final void A00(int i, int i2) {
        StringBuilder sbA0y;
        if (i <= 0 || i2 <= 0) {
            sbA0y = C60O.A0y("both minLines ", i);
            sbA0y.append(" and maxLines ");
            sbA0y.append(i2);
            sbA0y.append(" must be greater than zero");
        } else {
            if (i <= i2) {
                return;
            }
            sbA0y = C60O.A0y("minLines ", i);
            sbA0y.append(" must be less than or equal to maxLines ");
            sbA0y.append(i2);
        }
        AbstractC1061ATk.A00(sbA0y.toString());
        throw F60.createAndThrow();
    }
}
