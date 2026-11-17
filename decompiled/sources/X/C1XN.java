package X;

import kotlin.Unit;

/* renamed from: X.1XN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XN extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C1X9 $dateFormatter;
    public final /* synthetic */ int $displayMode;
    public final /* synthetic */ long $displayedMonthMillis;
    public final /* synthetic */ G0U<Long, Unit> $onDateSelectionChange;
    public final /* synthetic */ G0U<Long, Unit> $onDisplayedMonthChange;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ Long $selectedDateMillis;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Long;JILX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/ADq;LX/1X9;LX/1Xj;LX/1Wz;I)V */
    public C1XN(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, Long l, G0U g0u, G0U g0u2, ADq aDq, int i, int i2, long j) {
        super(2);
        this.$selectedDateMillis = l;
        this.$displayedMonthMillis = j;
        this.$displayMode = i;
        this.$onDateSelectionChange = g0u;
        this.$onDisplayedMonthChange = g0u2;
        this.$calendarModel = abstractC04741Xc;
        this.$yearRange = aDq;
        this.$dateFormatter = c1x9;
        this.$selectableDates = interfaceC04801Xj;
        this.$colors = c1Wz;
        this.$$changed = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        Long l = this.$selectedDateMillis;
        long j = this.$displayedMonthMillis;
        int i = this.$displayMode;
        G0U<Long, Unit> g0u = this.$onDateSelectionChange;
        G0U<Long, Unit> g0u2 = this.$onDisplayedMonthChange;
        AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
        ADq aDq = this.$yearRange;
        C1XA.A02(this.$colors, this.$dateFormatter, this.$selectableDates, abstractC04741Xc, bfmA0P, l, g0u, g0u2, aDq, i, AnonymousClass011.A00(this.$$changed), j);
        return Unit.INSTANCE;
    }
}
