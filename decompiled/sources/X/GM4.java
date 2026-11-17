package X;

/* loaded from: classes6.dex */
public final class GM4 extends GLK {
    public final int A01;
    public final GMK A03;
    public final int A00 = 12;
    public final int A02 = 16;

    public GM4(GMK gmk, int i) {
        this.A01 = i;
        this.A03 = gmk;
    }

    public final boolean equals(Object o) {
        if (!(o instanceof GM4)) {
            return false;
        }
        GM4 gm4 = (GM4) o;
        return gm4.A01 == this.A01 && gm4.A00 == this.A00 && gm4.A02 == this.A02 && gm4.A03 == this.A03;
    }

    public final int hashCode() {
        return BV7.A0F(GM4.class, Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AesGcm Parameters (variant: ");
        AbstractC7608F5v.A1O(sbA0x, this.A03);
        sbA0x.append(this.A00);
        sbA0x.append("-byte IV, ");
        sbA0x.append(this.A02);
        sbA0x.append("-byte tag, and ");
        sbA0x.append(this.A01);
        return AnonymousClass001.A0v("-byte key)", sbA0x);
    }
}
