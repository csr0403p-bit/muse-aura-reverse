package X;

import java.util.Map;

/* renamed from: X.FBc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7704FBc implements FC2 {
    public final Map<String, FBm> A00;

    @Override // X.FC2
    public final FBm Agj(C7403Euh c7403Euh) {
        return this.A00.get(c7403Euh.A01());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7704FBc) && C7384Etj.areEqual(this.A00, ((C7704FBc) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Snapshot(snapshot=", this.A00);
    }

    public /* synthetic */ C7704FBc(Map map) {
        this.A00 = map;
    }
}
