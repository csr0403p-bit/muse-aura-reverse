package X;

/* loaded from: classes4.dex */
public final class B0J {
    public final int A00;
    public final int A01;
    public final AbstractC1996Aw5 A02;
    public final C1736ApY A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B0J) {
                B0J b0j = (B0J) obj;
                if (!C7384Etj.areEqual(this.A02, b0j.A02) || !C7384Etj.areEqual(this.A03, b0j.A03) || this.A00 != b0j.A00 || this.A01 != b0j.A01 || !C7384Etj.areEqual(this.A04, b0j.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AbstractC1996Aw5 abstractC1996Aw5 = this.A02;
        int iHashCode = (((((((abstractC1996Aw5 == null ? 0 : abstractC1996Aw5.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31;
        Object obj = this.A04;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TypefaceRequest(fontFamily=");
        sbA0x.append(this.A02);
        sbA0x.append(", fontWeight=");
        sbA0x.append(this.A03);
        sbA0x.append(", fontStyle=");
        int i = this.A00;
        sbA0x.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sbA0x.append(", fontSynthesis=");
        int i2 = this.A01;
        sbA0x.append((Object) (i2 == 0 ? "None" : i2 == 1 ? "Weight" : i2 == 2 ? "Style" : i2 == 65535 ? "All" : "Invalid"));
        sbA0x.append(", resourceLoaderCacheKey=");
        return AnonymousClass007.A0Z(this.A04, sbA0x);
    }

    public B0J(AbstractC1996Aw5 abstractC1996Aw5, C1736ApY c1736ApY, Object obj, int i, int i2) {
        this.A02 = abstractC1996Aw5;
        this.A03 = c1736ApY;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj;
    }
}
