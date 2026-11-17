package X;

/* loaded from: classes6.dex */
public final class HyS implements HyR {
    public final String A00;

    public final boolean equals(Object obj) {
        return (obj instanceof HyS) && C7384Etj.areEqual(this.A00, ((HyS) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C60O.A0r("FunctionTableIdentifier(ftId=", this.A00);
    }

    public /* synthetic */ HyS(String str) {
        this.A00 = str;
    }
}
