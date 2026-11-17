package X;

/* renamed from: X.FKo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7916FKo {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7916FKo) {
                C7916FKo c7916FKo = (C7916FKo) obj;
                if (Float.compare(this.A01, c7916FKo.A01) != 0 || Float.compare(this.A02, c7916FKo.A02) != 0 || Float.compare(this.A00, c7916FKo.A00) != 0 || Float.compare(this.A03, c7916FKo.A03) != 0 || this.A04 != c7916FKo.A04 || this.A05 != c7916FKo.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00((AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A01), this.A02), this.A00), this.A03) + this.A04) * 31, this.A05);
    }

    public final String toString() {
        float f = this.A01;
        float f2 = this.A02;
        float f3 = this.A00;
        float f4 = this.A03;
        int i = this.A04;
        boolean z = this.A05;
        StringBuilder sbA0x = C60O.A0x("BoxShadowLayer(offsetX=");
        sbA0x.append(f);
        sbA0x.append(", offsetY=");
        sbA0x.append(f2);
        sbA0x.append(C8j2.A00(26));
        sbA0x.append(f3);
        sbA0x.append(", spread=");
        sbA0x.append(f4);
        sbA0x.append(C60N.A00(3));
        sbA0x.append(i);
        return C8j5.A0W(", inset=", sbA0x, z);
    }

    public C7916FKo(float f, float f2, float f3, float f4, int i, boolean z) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = f4;
        this.A04 = i;
        this.A05 = z;
    }
}
