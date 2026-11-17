package X;

/* loaded from: classes5.dex */
public final class Cg2 extends Cg9 {
    public final long A04 = 10485760;
    public final int A01 = 200;
    public final int A00 = 10000;
    public final long A03 = 604800000;
    public final int A02 = 81920;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Cg9) {
                Cg2 cg2 = (Cg2) ((Cg9) obj);
                if (this.A04 != cg2.A04 || this.A01 != cg2.A01 || this.A00 != cg2.A00 || this.A03 != cg2.A03 || this.A02 != cg2.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02 ^ ((((((((((int) this.A04) ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00) * 1000003) ^ ((int) this.A03)) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EventStoreConfig{maxStorageSizeInBytes=");
        sbA0x.append(this.A04);
        sbA0x.append(", loadBatchSize=");
        sbA0x.append(this.A01);
        sbA0x.append(", criticalSectionEnterTimeoutMs=");
        sbA0x.append(this.A00);
        sbA0x.append(", eventCleanUpAge=");
        sbA0x.append(this.A03);
        sbA0x.append(", maxBlobByteSizePerRow=");
        return BV8.A0z(sbA0x, this.A02);
    }
}
