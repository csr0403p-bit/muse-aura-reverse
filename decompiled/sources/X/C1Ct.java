package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.1Ct, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Ct extends AbstractC7559F3s implements Function0<C1Pn> {
    public final /* synthetic */ G0U<C1Vj, Boolean> $confirmValueChange;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C1Vj $initialValue;
    public final /* synthetic */ boolean $skipHiddenState = false;
    public final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1Ct(C1Vj c1Vj, AXN axn, G0U g0u, boolean z) {
        super(0);
        this.$skipPartiallyExpanded = z;
        this.$density = axn;
        this.$initialValue = c1Vj;
        this.$confirmValueChange = g0u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ C1Pn invoke() {
        boolean z = this.$skipPartiallyExpanded;
        return new C1Pn(this.$initialValue, this.$density, this.$confirmValueChange, z, this.$skipHiddenState);
    }
}
