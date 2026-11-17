package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Cn, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Cn extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $color;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (JLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZI)V */
    public C1Cn(Function0 function0, int i, long j, boolean z) {
        super(2);
        this.$color = j;
        this.$onDismissRequest = function0;
        this.$visible = z;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        long j = this.$color;
        C1Co.A05(bfmA0P, this.$onDismissRequest, AnonymousClass011.A00(this.$$changed), j, this.$visible);
        return Unit.INSTANCE;
    }
}
