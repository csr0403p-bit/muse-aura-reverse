package X;

/* renamed from: X.Bcs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2521Bcs extends AbstractC2528Bcz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2528Bcz) {
                C2521Bcs c2521Bcs = (C2521Bcs) ((AbstractC2528Bcz) obj);
                if (this.A02 != c2521Bcs.A02 || !this.A05.equals(c2521Bcs.A05) || this.A00 != c2521Bcs.A00 || this.A04 != c2521Bcs.A04 || this.A01 != c2521Bcs.A01 || this.A03 != c2521Bcs.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.A02 ^ 1000003) * 1000003) ^ this.A05.hashCode()) * 1000003) ^ this.A00) * 1000003) ^ this.A04) * 1000003) ^ this.A01) * 1000003) ^ this.A03;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioProfileProxy{codec=");
        sbA0x.append(this.A02);
        sbA0x.append(", mediaType=");
        sbA0x.append(this.A05);
        sbA0x.append(", bitrate=");
        sbA0x.append(this.A00);
        sbA0x.append(", sampleRate=");
        sbA0x.append(this.A04);
        sbA0x.append(", channels=");
        sbA0x.append(this.A01);
        sbA0x.append(", profile=");
        return BV8.A0z(sbA0x, this.A03);
    }

    public C2521Bcs(String str, int i, int i2, int i3, int i4, int i5) {
        this.A02 = i;
        if (str == null) {
            throw BV4.A0a("Null mediaType");
        }
        this.A05 = str;
        this.A00 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A03 = i5;
    }
}
