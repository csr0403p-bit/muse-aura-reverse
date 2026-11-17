package X;

/* loaded from: classes6.dex */
public final class HBD implements Cloneable {
    public float A00;
    public Integer A01;

    public final float A00(float f) {
        float f2;
        float f3;
        int iIntValue = this.A01.intValue();
        if (iIntValue != 0) {
            switch (iIntValue) {
                case 3:
                    return this.A00 * f;
                case 4:
                    f2 = this.A00 * f;
                    f3 = 2.54f;
                    break;
                case 5:
                    f2 = this.A00 * f;
                    f3 = 25.4f;
                    break;
                case 6:
                    f2 = this.A00 * f;
                    f3 = 72.0f;
                    break;
                case 7:
                    f2 = this.A00 * f;
                    f3 = 6.0f;
                    break;
            }
            return f2 / f3;
        }
        return this.A00;
    }

    public final float A01(HB9 hb9) {
        if (this.A01 != C79.A0Z) {
            return A02(hb9);
        }
        HBE hbe = hb9.A03;
        HBQ hbq = hbe.A02;
        if (hbq == null && (hbq = hbe.A03) == null) {
            return this.A00;
        }
        float f = hbq.A03;
        return (f == hbq.A00 ? this.A00 * f : this.A00 * ((float) (Math.sqrt((f * f) + (r1 * r1)) / 1.414213562373095d))) / 100.0f;
    }

    public final float A02(HB9 hb9) {
        float f;
        float f2;
        float f3;
        float textSize;
        switch (this.A01.intValue()) {
            case 1:
                f3 = this.A00;
                textSize = hb9.A03.A00.getTextSize();
                return f3 * textSize;
            case 2:
                f3 = this.A00;
                textSize = hb9.A03.A00.getTextSize() / 2.0f;
                return f3 * textSize;
            case 3:
                f3 = this.A00;
                textSize = hb9.A00;
                return f3 * textSize;
            case 4:
                f = this.A00 * hb9.A00;
                f2 = 2.54f;
                return f / f2;
            case 5:
                f = this.A00 * hb9.A00;
                f2 = 25.4f;
                return f / f2;
            case 6:
                f = this.A00 * hb9.A00;
                f2 = 72.0f;
                return f / f2;
            case 7:
                f = this.A00 * hb9.A00;
                f2 = 6.0f;
                return f / f2;
            case 8:
                HBE hbe = hb9.A03;
                HBQ hbq = hbe.A02;
                if (hbq == null) {
                    hbq = hbe.A03;
                }
                float f4 = this.A00;
                if (hbq == null) {
                    return f4;
                }
                f = f4 * hbq.A03;
                f2 = 100.0f;
                return f / f2;
            default:
                return this.A00;
        }
    }

    public final float A03(HB9 hb9) {
        if (this.A01 != C79.A0Z) {
            return A02(hb9);
        }
        HBE hbe = hb9.A03;
        HBQ hbq = hbe.A02;
        if (hbq == null) {
            hbq = hbe.A03;
        }
        float f = this.A00;
        return hbq != null ? (f * hbq.A00) / 100.0f : f;
    }

    public final float A04(HB9 hb9, float f) {
        return this.A01 == C79.A0Z ? (this.A00 * f) / 100.0f : A02(hb9);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.A00);
        switch (this.A01.intValue()) {
            case 1:
                str = "em";
                break;
            case 2:
                str = "ex";
                break;
            case 3:
                str = "in";
                break;
            case 4:
                str = "cm";
                break;
            case 5:
                str = "mm";
                break;
            case 6:
                str = "pt";
                break;
            case 7:
                str = "pc";
                break;
            case 8:
                str = "percent";
                break;
            default:
                str = "px";
                break;
        }
        return FGI.A0M(strValueOf, str);
    }

    public HBD(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
