package X;

import java.util.Set;

/* loaded from: classes6.dex */
public final class FvW {
    public final Set<C9012Fwp> A00;
    public final Set<C9uG<? extends InterfaceC9011Fwo>> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.request.ChangesTokenRequest");
                FvW fvW = (FvW) obj;
                if (!this.A01.equals(fvW.A01) || !this.A00.equals(fvW.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FvW(Set<? extends C9uG<? extends InterfaceC9011Fwo>> set, Set<C9012Fwp> set2) {
        this.A01 = set;
        this.A00 = set2;
    }
}
