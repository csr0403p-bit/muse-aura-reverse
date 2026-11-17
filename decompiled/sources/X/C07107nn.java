package X;

/* renamed from: X.7nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07107nn {
    public static final C07107nn A02 = new C07107nn(null, null);
    public final Integer A00;
    public final C9uE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07107nn) {
                C07107nn c07107nn = (C07107nn) obj;
                if (this.A00 != c07107nn.A00 || !C7384Etj.areEqual(this.A01, c07107nn.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        Integer num = this.A00;
        if (num == null) {
            iHashCode = 0;
        } else {
            int iIntValue = num.intValue();
            switch (iIntValue) {
                case 1:
                    str = "IN";
                    break;
                case 2:
                    str = "OUT";
                    break;
                default:
                    str = "INVARIANT";
                    break;
            }
            iHashCode = str.hashCode() + iIntValue;
        }
        return (iHashCode * 31) + C3cH.A02(this.A01);
    }

    public final String toString() {
        int iIntValue;
        String str;
        Integer num = this.A00;
        if (num == null || (iIntValue = num.intValue()) == -1) {
            return "*";
        }
        if (iIntValue == 0) {
            return String.valueOf(this.A01);
        }
        if (iIntValue == 1) {
            str = "in ";
        } else {
            if (iIntValue != 2) {
                throw C3cG.A0q();
            }
            str = "out ";
        }
        StringBuilder sbA0x = C60O.A0x(str);
        sbA0x.append(this.A01);
        return sbA0x.toString();
    }

    public C07107nn(Integer num, C9uE c9uE) {
        String str;
        String strA0U;
        this.A00 = num;
        this.A01 = c9uE;
        if (AnonymousClass002.A1Y(num) == (c9uE == null)) {
            return;
        }
        if (num == null) {
            strA0U = "Star projection must have no type specified.";
        } else {
            switch (num.intValue()) {
                case 1:
                    str = "IN";
                    break;
                case 2:
                    str = "OUT";
                    break;
                default:
                    str = "INVARIANT";
                    break;
            }
            strA0U = FGI.A0U("The projection variance ", str, " requires type to be specified.");
        }
        throw C60O.A0i(strA0U);
    }
}
