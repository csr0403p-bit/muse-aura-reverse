package X;

/* renamed from: X.DdM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5210DdM extends C06G {
    public final C5205DdH A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5210DdM) && C7384Etj.areEqual(this.A00, ((C5210DdM) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("AuthModelEvent(model=", this.A00);
    }

    public C5210DdM(C5205DdH c5205DdH) {
        this.A00 = c5205DdH;
    }
}
