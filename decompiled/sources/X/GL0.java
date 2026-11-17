package X;

/* loaded from: classes6.dex */
public final class GL0 extends GLK {
    public final int A00;
    public final int A01;
    public final int A02 = 16;
    public final C9480GKw A03;

    public GL0(C9480GKw c9480GKw, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = c9480GKw;
    }

    public final boolean equals(Object o) {
        if (!(o instanceof GL0)) {
            return false;
        }
        GL0 gl0 = (GL0) o;
        return gl0.A01 == this.A01 && gl0.A00 == this.A00 && gl0.A02 == this.A02 && gl0.A03 == this.A03;
    }

    public final int hashCode() {
        return BV7.A0F(GL0.class, Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AesEax Parameters (variant: ");
        AbstractC7608F5v.A1O(sbA0x, this.A03);
        sbA0x.append(this.A00);
        sbA0x.append("-byte IV, ");
        sbA0x.append(this.A02);
        sbA0x.append("-byte tag, and ");
        sbA0x.append(this.A01);
        return AnonymousClass001.A0v("-byte key)", sbA0x);
    }
}
