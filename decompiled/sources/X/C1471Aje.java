package X;

/* renamed from: X.Aje, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1471Aje {
    public final C7538F0m<C1453AjM> A00 = new C7538F0m<>(AbstractC1483Ajq.A00);

    public final void A00(C1453AjM c1453AjM) {
        if (c1453AjM.A0D != null) {
            this.A00.remove(c1453AjM);
        } else {
            ASP.A01("DepthSortedSet.remove called on an unattached node");
            throw F60.createAndThrow();
        }
    }

    public final String toString() {
        return this.A00.toString();
    }
}
