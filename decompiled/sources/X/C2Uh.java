package X;

/* renamed from: X.2Uh, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Uh {
    public final long A00;

    public static String A00(long j) {
        StringBuilder sb = new StringBuilder("PointerId(value=");
        sb.append(j);
        return AnonymousClass006.A0z(sb);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2Uh) && this.A00 == ((C2Uh) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A00(this.A00);
    }
}
