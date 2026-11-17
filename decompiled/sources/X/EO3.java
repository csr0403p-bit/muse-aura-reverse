package X;

/* loaded from: classes5.dex */
public final class EO3 extends EO8 {
    public final EO0 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EO3) && C7384Etj.areEqual(this.A00, ((EO3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("ContentProvider(contentProviderInfo=", this.A00);
    }

    public EO3(EO0 eo0) {
        this.A00 = eo0;
    }
}
