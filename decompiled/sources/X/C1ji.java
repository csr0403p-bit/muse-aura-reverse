package X;

/* renamed from: X.1ji, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ji extends AbstractC1699Aoe {
    public final C1697Aoc A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1ji) {
                C1ji c1ji = (C1ji) obj;
                if (!C7384Etj.areEqual(this.A01, c1ji.A01) || !C7384Etj.areEqual(this.A00, c1ji.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1699Aoe
    public final InterfaceC1702Aoh A00() {
        return null;
    }

    @Override // X.AbstractC1699Aoe
    public final C1697Aoc A01() {
        return this.A00;
    }

    public final int hashCode() {
        int iA0G = AnonymousClass001.A0G(this.A01);
        C1697Aoc c1697Aoc = this.A00;
        return (iA0G + (c1697Aoc != null ? c1697Aoc.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return FGI.A0N("LinkAnnotation.Url(url=", this.A01, ')');
    }

    public C1ji(C1697Aoc c1697Aoc, String str) {
        this.A01 = str;
        this.A00 = c1697Aoc;
    }
}
