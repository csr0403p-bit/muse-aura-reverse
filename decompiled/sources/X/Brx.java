package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class Brx {
    public String A00;
    public String A01;
    public List<List<byte[]>> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Brx) {
                Brx brx = (Brx) obj;
                if (!C6xC.A00(this.A00, brx.A00) || !C6xC.A00(this.A01, brx.A01) || !C6xC.A00(this.A02, brx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(this.A00, this.A01, this.A02);
    }
}
