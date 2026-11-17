package X;

/* loaded from: classes4.dex */
public final class AbP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbP) {
                AbP abP = (AbP) obj;
                if (this.A01 != abP.A01 || this.A00 != abP.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return C8j4.A0y("CollectionInfo(rowCount=", ", columnCount=", this.A01, this.A00);
    }

    public AbP(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
