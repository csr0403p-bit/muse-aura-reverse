package X;

/* renamed from: X.AxN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2050AxN {
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C2050AxN) && this.A00 == ((C2050AxN) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        return FGI.A0Y("(", ", ", ")", C8j3.A0G(j), AnonymousClass002.A09(j));
    }
}
