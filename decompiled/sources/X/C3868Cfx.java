package X;

import java.util.List;

/* renamed from: X.Cfx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3868Cfx extends AbstractC3930ChC {
    public final List<Ch9> A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3930ChC) {
            return this.A00.equals(((C3868Cfx) ((AbstractC3930ChC) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return BV8.A0v(this.A00, C60O.A0x("BatchedLogRequest{logRequests="));
    }

    public C3868Cfx(List<Ch9> list) {
        this.A00 = list;
    }
}
