package X;

import kotlin.Unit;

/* renamed from: X.1XG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XG extends AbstractC7559F3s implements G2j<C06c, C04811Xk, BFM, Integer, Unit> {
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C1X9 $dateFormatter;
    public final /* synthetic */ long $displayedMonthMillis;
    public final /* synthetic */ G0U<Long, Unit> $onDateSelectionChange;
    public final /* synthetic */ G0U<Long, Unit> $onDisplayedMonthChange;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ Long $selectedDateMillis;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Long;JLX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/ADq;LX/1X9;LX/1Xj;LX/1Wz;)V */
    public C1XG(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, Long l, G0U g0u, G0U g0u2, ADq aDq, long j) {
        super(4);
        this.$selectedDateMillis = l;
        this.$displayedMonthMillis = j;
        this.$onDateSelectionChange = g0u;
        this.$onDisplayedMonthChange = g0u2;
        this.$calendarModel = abstractC04741Xc;
        this.$yearRange = aDq;
        this.$dateFormatter = c1x9;
        this.$selectableDates = interfaceC04801Xj;
        this.$colors = c1Wz;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Unit invoke(C06c c06c, C04811Xk c04811Xk, BFM bfm, Integer num) {
        int i = c04811Xk.A00;
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        if (i == 0) {
            bfmA0P.AgE(-1870116901);
            Long l = this.$selectedDateMillis;
            long j = this.$displayedMonthMillis;
            G0U<Long, Unit> g0u = this.$onDateSelectionChange;
            G0U<Long, Unit> g0u2 = this.$onDisplayedMonthChange;
            AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
            ADq aDq = this.$yearRange;
            C1XA.A03(this.$colors, this.$dateFormatter, this.$selectableDates, abstractC04741Xc, bfmA0P, l, g0u, g0u2, aDq, 0, j);
        } else if (i == 1) {
            bfmA0P.AgE(-1870098348);
            Long l2 = this.$selectedDateMillis;
            G0U<Long, Unit> g0u3 = this.$onDateSelectionChange;
            AbstractC04741Xc abstractC04741Xc2 = this.$calendarModel;
            ADq aDq2 = this.$yearRange;
            AbstractC04941Xz.A01(this.$colors, this.$dateFormatter, this.$selectableDates, abstractC04741Xc2, bfmA0P, l2, g0u3, aDq2, 0);
        } else {
            bfmA0P.AgE(-2138080579);
        }
        AnonymousClass001.A1D(bfmA0P);
        return Unit.INSTANCE;
    }
}
