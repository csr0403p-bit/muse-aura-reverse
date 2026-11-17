package X;

/* loaded from: classes5.dex */
public final class BeO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BeO beO = (BeO) obj;
                if (this.A02 != beO.A02 || this.A04 != beO.A04 || this.A01 != beO.A01 || this.A00 != beO.A00 || this.A05 != beO.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioTrackKey{encoding=");
        sbA0x.append(this.A02);
        sbA0x.append(", sampleRate=");
        sbA0x.append(this.A04);
        sbA0x.append(", channelConfig=");
        sbA0x.append(this.A01);
        sbA0x.append(AbstractC7606F5t.A00(14));
        sbA0x.append(this.A00);
        sbA0x.append(C8j2.A00(9));
        sbA0x.append(0);
        sbA0x.append(", usage=");
        sbA0x.append(this.A05);
        return C8j3.A15(sbA0x);
    }

    public BeO(int i, int i2, int i3, int i4, int i5) {
        this.A02 = i;
        this.A04 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A05 = i5;
        this.A03 = (((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31 * 31) + i5;
    }
}
