package X;

import kotlin.Unit;

/* renamed from: X.19z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C046519z extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C046519z(long j, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
        super(2);
        this.$contentColor = j;
        this.$content = g0v;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        AbstractC046219w.A01(this.$contentColor, this.$content, AnonymousClass005.A0P(bfm, num), AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
