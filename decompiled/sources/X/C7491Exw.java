package X;

import java.util.Arrays;

/* renamed from: X.Exw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7491Exw<ParamType, UnitType> {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C7491Exw) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(BV4.A1X(this.A00));
    }

    public C7491Exw(long j) {
        this.A00 = j;
    }
}
