package X;

/* loaded from: classes4.dex */
public final class BGi {
    public float A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGi) {
                BGi bGi = (BGi) obj;
                if (this.A01 != bGi.A01 || Float.compare(this.A00, bGi.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(C3cI.A01(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DataPointAtTime(time=");
        sbA0x.append(this.A01);
        sbA0x.append(", dataPoint=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }
}
