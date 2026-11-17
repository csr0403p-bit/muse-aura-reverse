package X;

/* loaded from: classes6.dex */
public final class FF5 extends AbstractC8109FTy {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final FIS A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FF5) {
                FF5 ff5 = (FF5) obj;
                if (Float.compare(this.A01, ff5.A01) != 0 || Float.compare(this.A02, ff5.A02) != 0 || Float.compare(this.A00, ff5.A00) != 0 || this.A03 != ff5.A03 || this.A04 != ff5.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, (AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A01), this.A02), this.A00) + this.A03) * 31);
    }

    public final String toString() {
        float f = this.A01;
        float f2 = this.A02;
        float f3 = this.A00;
        int i = this.A03;
        FIS fis = this.A04;
        StringBuilder sbA0x = C60O.A0x("ItemDecoration(spacingBefore=");
        sbA0x.append(f);
        sbA0x.append(", spacingBetween=");
        sbA0x.append(f2);
        sbA0x.append(", spacingAfter=");
        sbA0x.append(f3);
        sbA0x.append(C8j2.A00(38));
        sbA0x.append(i);
        return C3cJ.A0L(fis, ", alignItems=", sbA0x);
    }

    public FF5(FIS fis, float f, float f2, float f3, int i) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = fis;
    }
}
