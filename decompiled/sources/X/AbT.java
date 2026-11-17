package X;

import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode;

/* loaded from: classes4.dex */
public final class AbT extends Ab8<TraversablePrefetchStateNode> {
    public final C1229Af7 A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AbT) && C7384Etj.areEqual(this.A00, ((AbT) obj).A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1229Af7 c1229Af7 = this.A00;
        TraversablePrefetchStateNode traversablePrefetchStateNode = new TraversablePrefetchStateNode();
        traversablePrefetchStateNode.A00 = c1229Af7;
        return traversablePrefetchStateNode;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "traversablePrefetchState";
        asf.A00 = this.A00;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("TraversablePrefetchStateModifierElement(prefetchState="));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((TraversablePrefetchStateNode) abstractC1439Aj8).A00 = this.A00;
    }

    public AbT(C1229Af7 c1229Af7) {
        this.A00 = c1229Af7;
    }
}
