package X;

import kotlin.Unit;

/* renamed from: X.3bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05353bh extends AbstractC07127nr implements G0W {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05353bh(int i, HtJ<? super C05353bh> htJ) {
        super(3, htJ);
        this.$t = i;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        HtJ htJ;
        int i;
        if (this.$t != 0) {
            ((Number) obj2).floatValue();
            htJ = (HtJ) obj3;
            i = 1;
        } else {
            htJ = (HtJ) obj3;
            i = 0;
        }
        new C05353bh(i, htJ);
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
