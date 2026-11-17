package X;

/* renamed from: X.1YK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YK {
    public final String A00;
    public final ADq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1YK) {
                C1YK c1yk = (C1YK) obj;
                if (!this.A00.equals(c1yk.A00) || !this.A01.equals(c1yk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass001.A0G(this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchGroup(value=");
        sb.append(this.A00);
        sb.append(", range=");
        return AnonymousClass007.A0Z(this.A01, sb);
    }

    public C1YK(String str, ADq aDq) {
        this.A00 = str;
        this.A01 = aDq;
    }
}
