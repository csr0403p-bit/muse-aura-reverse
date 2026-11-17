package X;

/* renamed from: X.1Y4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y4 {
    public final char A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1Y4) {
                C1Y4 c1y4 = (C1Y4) obj;
                if (!this.A01.equals(c1y4.A01) || this.A00 != c1y4.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DateInputFormat(patternWithDelimiters=");
        sb.append(this.A01);
        sb.append(", delimiter=");
        sb.append(this.A00);
        return AnonymousClass006.A0z(sb);
    }

    public C1Y4(String str, char c) {
        this.A01 = str;
        this.A00 = c;
        this.A02 = AbstractC2159Azp.A0z(str, String.valueOf(c), "");
    }
}
