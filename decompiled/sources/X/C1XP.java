package X;

import kotlin.Unit;

/* renamed from: X.1XP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XP extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ long $displayedMonthMillis;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Integer, Unit> $onYearSelected;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;JLX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Xj;LX/1Xc;LX/ADq;LX/1Wz;I)V */
    public C1XP(C1Wz c1Wz, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, BRg bRg, G0U g0u, ADq aDq, int i, long j) {
        super(2);
        this.$modifier = bRg;
        this.$displayedMonthMillis = j;
        this.$onYearSelected = g0u;
        this.$selectableDates = interfaceC04801Xj;
        this.$calendarModel = abstractC04741Xc;
        this.$yearRange = aDq;
        this.$colors = c1Wz;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        long j = this.$displayedMonthMillis;
        G0U<Integer, Unit> g0u = this.$onYearSelected;
        C1XA.A05(this.$colors, this.$selectableDates, this.$calendarModel, bfmA0P, bRg, g0u, this.$yearRange, AnonymousClass011.A00(this.$$changed), j);
        return Unit.INSTANCE;
    }
}
