package X;

/* loaded from: classes5.dex */
public final class DJD {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DJD) {
                DJD djd = (DJD) obj;
                if (this.A00 != djd.A00 || this.A01 != djd.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return FGI.A0Y("CrashResilientEventSchemaKey(markerId=", ", schemaVersion=", ")", this.A00, this.A01);
    }

    public DJD(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
