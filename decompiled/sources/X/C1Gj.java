package X;

import kotlin.Unit;

/* renamed from: X.1Gj, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Gj extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0W<InterfaceC1009APa, BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1Gj(G0W<? super InterfaceC1009APa, ? super BFM, ? super Integer, Unit> g0w, int i) {
        super(2);
        this.$content = g0w;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        AZo.A01(AnonymousClass005.A0P(bfm, num), this.$content, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
