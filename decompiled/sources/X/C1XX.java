package X;

/* renamed from: X.1XX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XX implements Comparable<C1XX> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1XX) {
                C1XX c1xx = (C1XX) obj;
                if (this.A02 != c1xx.A02 || this.A01 != c1xx.A01 || this.A00 != c1xx.A00 || this.A03 != c1xx.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C1XX c1xx) {
        return C7384Etj.A01(this.A03, c1xx.A03);
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A03, ((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.A02);
        sb.append(", month=");
        sb.append(this.A01);
        sb.append(", dayOfMonth=");
        sb.append(this.A00);
        sb.append(", utcTimeMillis=");
        sb.append(this.A03);
        return AnonymousClass006.A0z(sb);
    }

    public C1XX(int i, int i2, long j, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = j;
    }
}
