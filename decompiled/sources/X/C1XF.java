package X;

import kotlin.Unit;

/* renamed from: X.1XF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XF extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C1X9 $dateFormatter;
    public final /* synthetic */ C1XY $firstMonth;
    public final /* synthetic */ G0U<Long, Unit> $onDateSelectionChange;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ Long $selectedDateMillis;
    public final /* synthetic */ C1XX $today;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/ADq;LX/1Xc;LX/1XY;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1XX;Ljava/lang/Long;LX/1X9;LX/1Xj;LX/1Wz;)V */
    public C1XF(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, C1XX c1xx, AbstractC04741Xc abstractC04741Xc, C1XY c1xy, Long l, G0U g0u, ADq aDq) {
        super(1);
        this.$yearRange = aDq;
        this.$calendarModel = abstractC04741Xc;
        this.$firstMonth = c1xy;
        this.$onDateSelectionChange = g0u;
        this.$today = c1xx;
        this.$selectedDateMillis = l;
        this.$dateFormatter = c1x9;
        this.$selectableDates = interfaceC04801Xj;
        this.$colors = c1Wz;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        ADq aDq = this.$yearRange;
        int i = ((aDq.A01 - aDq.A00) + 1) * 12;
        AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
        C1XY c1xy = this.$firstMonth;
        G0U<Long, Unit> g0u = this.$onDateSelectionChange;
        C1XX c1xx = this.$today;
        Long l = this.$selectedDateMillis;
        c0cd.APL(null, C0t8.A00, AnonymousClass001.A0M(new C1XC(this.$colors, this.$dateFormatter, this.$selectableDates, c1xx, abstractC04741Xc, c1xy, l, g0u), 1137566309), i);
        return Unit.INSTANCE;
    }
}
