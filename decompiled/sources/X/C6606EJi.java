package X;

/* renamed from: X.EJi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6606EJi {
    public EnumC6619EKm A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6606EJi) {
                C6606EJi c6606EJi = (C6606EJi) obj;
                if (!C7384Etj.areEqual(this.A01, c6606EJi.A01) || this.A00 != c6606EJi.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", state=", C3cI.A0x("IdAndState(id=", this.A01));
    }
}
