package X;

/* loaded from: classes6.dex */
public final class GMC extends GLK {
    public final int A00;
    public final GMR A01;

    public final boolean equals(Object o) {
        if (!(o instanceof GMC)) {
            return false;
        }
        GMC gmc = (GMC) o;
        return gmc.A01 == this.A01 && gmc.A00 == this.A00;
    }

    public final int hashCode() {
        return BV7.A0E(GMC.class, this.A01, Integer.valueOf(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("X-AES-GCM Parameters (variant: ");
        sbA0x.append(this.A01);
        sbA0x.append("salt_size_bytes: ");
        sbA0x.append(this.A00);
        return BV7.A10(sbA0x);
    }

    public GMC(GMR variant, int saltSizeBytes) {
        this.A01 = variant;
        this.A00 = saltSizeBytes;
    }
}
