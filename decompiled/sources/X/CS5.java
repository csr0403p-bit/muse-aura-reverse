package X;

/* loaded from: classes5.dex */
public final class CS5 {
    public final float A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof CS5) {
                CS5 cs5 = (CS5) obj;
                if (!CS7.A01(this.A02, cs5.A02) || Float.compare(this.A00, cs5.A00) != 0 || this.A01 != cs5.A01 || !CS7.A01(this.A03, cs5.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A0A(this.A02, Float.valueOf(this.A00), Integer.valueOf(this.A01), this.A03);
    }

    public CS5(String str, String str2, float f, int i) {
        this.A02 = str == null ? "" : str;
        this.A00 = f;
        this.A01 = i;
        this.A03 = str2;
    }

    public final String toString() {
        String strA0Y = C3cI.A0Y(this);
        String str = this.A02;
        CS6 cs6 = new CS6();
        cs6.A01 = str;
        cs6.A02 = "text";
        String strValueOf = String.valueOf(this.A00);
        CS8 cs8 = new CS8();
        cs6.A00 = cs8;
        cs8.A01 = strValueOf;
        cs8.A02 = "confidence";
        String strValueOf2 = String.valueOf(this.A01);
        CS8 cs82 = new CS8();
        cs8.A00 = cs82;
        cs82.A01 = strValueOf2;
        cs82.A02 = "index";
        String str2 = this.A03;
        CS6 cs62 = new CS6();
        cs82.A00 = cs62;
        cs62.A01 = str2;
        cs62.A02 = "mid";
        StringBuilder sbA0p = BV4.A0p(32);
        BV7.A1J(sbA0p, strA0Y);
        String str3 = "";
        do {
            Object obj = cs6.A01;
            sbA0p.append(str3);
            String str4 = cs6.A02;
            if (str4 != null) {
                BV7.A1I(sbA0p, str4);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sbA0p.append(obj);
            } else {
                BV8.A1O(sbA0p, obj);
            }
            cs6 = cs6.A00;
            str3 = ", ";
        } while (cs6 != null);
        return C8j3.A15(sbA0p);
    }
}
