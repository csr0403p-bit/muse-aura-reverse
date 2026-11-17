package X;

/* renamed from: X.15k, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15k {
    public static final long A01 = AnonymousClass005.A0J(0.5f, 0.5f);
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C15k) && this.A00 == ((C15k) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder sb = new StringBuilder("TransformOrigin(packedValue=");
        sb.append(j);
        return AnonymousClass006.A0z(sb);
    }
}
