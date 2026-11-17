package X;

/* renamed from: X.1VW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VW {
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1VW) && this.A00 == ((C1VW) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder sb = new StringBuilder("GridItemSpan(packedValue=");
        sb.append(j);
        return AnonymousClass006.A0z(sb);
    }
}
