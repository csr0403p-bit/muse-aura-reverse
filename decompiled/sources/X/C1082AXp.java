package X;

import kotlin.Unit;

/* renamed from: X.AXp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1082AXp extends Ab8<C1081AXo> {
    public final G0V<AWx, HtJ<? super Unit>, Object> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1082AXp) && this.A00 == ((C1082AXp) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1081AXo(this.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C60R.A01(this.A00);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "TextContextMenuGestures";
        asf.A02.A01("onPreShowContextMenu", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C1081AXo) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1082AXp(G0V<? super AWx, ? super HtJ<? super Unit>, ? extends Object> g0v) {
        this.A00 = g0v;
    }
}
