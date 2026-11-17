package X;

/* renamed from: X.Dub, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6040Dub extends C06G {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6040Dub) {
                C6040Dub c6040Dub = (C6040Dub) obj;
                if (this.A01 != c6040Dub.A01 || this.A00 != c6040Dub.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A00, AnonymousClass005.A07(this.A01));
    }

    public C6040Dub(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
