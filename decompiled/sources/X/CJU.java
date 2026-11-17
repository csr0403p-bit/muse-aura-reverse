package X;

/* loaded from: classes5.dex */
public final class CJU extends CJV {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof CJV) {
                CJU cju = (CJU) ((CJV) obj);
                if (this.A00 != cju.A00 || this.A01 != cju.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 ^ 1000003;
        long j = this.A01;
        return (i * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.A00;
        long j = this.A01;
        StringBuilder sbA0y = C60O.A0y("EventRecord{eventType=", i);
        sbA0y.append(", eventTimestamp=");
        sbA0y.append(j);
        return BV7.A11(sbA0y);
    }

    public CJU(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
