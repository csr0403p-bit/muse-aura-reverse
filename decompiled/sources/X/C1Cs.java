package X;

/* renamed from: X.1Cs, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Cs extends AbstractC7559F3s implements G0U<C1Vj, C1Pn> {
    public final /* synthetic */ G0U<C1Vj, Boolean> $confirmValueChange;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ boolean $skipHiddenState = false;
    public final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1Cs(AXN axn, G0U g0u, boolean z) {
        super(1);
        this.$skipPartiallyExpanded = z;
        this.$density = axn;
        this.$confirmValueChange = g0u;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ C1Pn invoke(C1Vj c1Vj) {
        return new C1Pn(c1Vj, this.$density, this.$confirmValueChange, this.$skipPartiallyExpanded, this.$skipHiddenState);
    }
}
