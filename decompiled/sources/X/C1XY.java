package X;

/* renamed from: X.1XY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1XY) {
                C1XY c1xy = (C1XY) obj;
                if (this.A03 != c1xy.A03 || this.A01 != c1xy.A01 || this.A02 != c1xy.A02 || this.A00 != c1xy.A00 || this.A04 != c1xy.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A04, ((((((this.A03 * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.A03);
        sb.append(", month=");
        sb.append(this.A01);
        sb.append(", numberOfDays=");
        sb.append(this.A02);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.A00);
        sb.append(", startUtcTimeMillis=");
        sb.append(this.A04);
        return AnonymousClass006.A0z(sb);
    }

    public C1XY(int i, int i2, int i3, long j, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = j;
    }
}
