package X;

/* renamed from: X.AmN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1595AmN {
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1595AmN) && this.A00 == ((C1595AmN) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return AnonymousClass006.A0z(C60O.A0z("IndirectPointerEventData(packedValue=", this.A00));
    }

    public /* synthetic */ C1595AmN(long j) {
        this.A00 = j;
    }
}
