package X;

import kotlin.Unit;

/* renamed from: X.3bg, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bg extends AbstractC07127nr implements G0V {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3bg(int i, HtJ<? super C3bg> htJ) {
        super(2, htJ);
        this.$t = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new C3bg(this.$t != 0 ? 1 : 0, htJ);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        HtJ htJ = (HtJ) obj2;
        if (htJ != null) {
            htJ.getContext();
        }
        Unit unit = Unit.INSTANCE;
        Hwg.A00(unit);
        return unit;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Hwg.A00(obj);
        return Unit.INSTANCE;
    }
}
