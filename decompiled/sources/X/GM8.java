package X;

/* loaded from: classes6.dex */
public final class GM8 extends GLK {
    public final int A00;
    public final GML A01;

    public final boolean equals(Object o) {
        if (!(o instanceof GM8)) {
            return false;
        }
        GM8 gm8 = (GM8) o;
        return gm8.A00 == this.A00 && gm8.A01 == this.A01;
    }

    public final int hashCode() {
        return BV7.A0E(GM8.class, Integer.valueOf(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AesGcmSiv Parameters (variant: ");
        AbstractC7608F5v.A1O(sbA0x, this.A01);
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v("-byte key)", sbA0x);
    }

    public GM8(GML keySizeBytes, int variant) {
        this.A00 = variant;
        this.A01 = keySizeBytes;
    }
}
