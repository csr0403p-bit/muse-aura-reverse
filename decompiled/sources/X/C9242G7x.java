package X;

import java.util.List;

/* renamed from: X.G7x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9242G7x {
    public final List A00;
    public final G7Y A01;
    public final G7Y A02;

    public final boolean equals(Object obj) {
        C9242G7x c9242G7x = obj instanceof C9242G7x ? (C9242G7x) obj : null;
        if (c9242G7x != null && this.A01.equals(c9242G7x.A01) && this.A02.equals(c9242G7x.A02)) {
            return BV7.A1X(this.A00, c9242G7x.A00, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0G(this.A02, this.A01.hashCode() * 37) * 37);
    }

    public C9242G7x(List list, G7Y g7y, G7Y g7y2) {
        this.A01 = g7y;
        this.A02 = g7y2;
        this.A00 = list;
    }
}
