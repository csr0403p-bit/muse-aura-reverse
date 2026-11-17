package X;

import java.util.Map;

/* renamed from: X.FBd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7705FBd {
    public final Map<String, ? extends FBm> A00;

    public C7705FBd(Map<String, ? extends FBm> map) {
        C7384Etj.A0Y(map, 0);
        this.A00 = map;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7705FBd) && this.A00.equals(((C7705FBd) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return FGI.A0U("Snapshot(memorySnapshot=", AnonymousClass001.A0v(")", C3cG.A0f(this.A00, "Snapshot(snapshot=")), ")");
    }
}
