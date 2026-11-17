package X;

import java.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1XC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XC extends AbstractC7559F3s implements G2j<AnonymousClass037, Integer, BFM, Integer, Unit> {
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C1X9 $dateFormatter;
    public final /* synthetic */ C1XY $firstMonth;
    public final /* synthetic */ G0U<Long, Unit> $onDateSelectionChange;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ Long $selectedDateMillis;
    public final /* synthetic */ C1XX $today;

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
        AnonymousClass037 anonymousClass0372 = anonymousClass037;
        int iA0F = AnonymousClass001.A0F(num);
        BFM bfm2 = bfm;
        int iA0F2 = AnonymousClass001.A0F(num2);
        int iA0d = (iA0F2 & 6) == 0 ? iA0F2 | AnonymousClass004.A0d(bfm2, anonymousClass0372) : iA0F2;
        if ((iA0F2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm2, iA0F);
        }
        if ((iA0d & 147) == 146 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
            C1XY c1xyA00 = this.$firstMonth;
            C1Y1 c1y1 = (C1Y1) abstractC04741Xc;
            if (iA0F > 0) {
                c1xyA00 = C1Y1.A00(c1y1, Instant.ofEpochMilli(c1xyA00.A04).atZone(C1Y1.A02).toLocalDate().plusMonths(iA0F));
            }
            C1Z5 c1z5 = new C1Z5(((C0AU) anonymousClass0372).A01, null, "fillParentMaxWidth", 1.0f);
            G0U<Long, Unit> g0u = this.$onDateSelectionChange;
            C1XX c1xx = this.$today;
            Long l = this.$selectedDateMillis;
            C1X9 c1x9 = this.$dateFormatter;
            InterfaceC04801Xj interfaceC04801Xj = this.$selectableDates;
            C1Wz c1Wz = this.$colors;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
            BBI bbi = (BBI) bfm2;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm2, c1z5);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function0);
            AnonymousClass003.A0o(bfm2, interfaceC1380AiAA01, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0J)) {
                AnonymousClass006.A1U(g0v, bfm2, iA0J);
            }
            AnonymousClass001.A16(bfm2, bRgA01);
            C1XA.A04(c1Wz, c1x9, interfaceC04801Xj, c1xyA00, bfm2, l, null, g0u, 221184, c1xx.A03);
            BBI.A0R(bbi, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/1Xc;LX/1XY;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1XX;Ljava/lang/Long;LX/1X9;LX/1Xj;LX/1Wz;)V */
    public C1XC(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, C1XX c1xx, AbstractC04741Xc abstractC04741Xc, C1XY c1xy, Long l, G0U g0u) {
        super(4);
        this.$calendarModel = abstractC04741Xc;
        this.$firstMonth = c1xy;
        this.$onDateSelectionChange = g0u;
        this.$today = c1xx;
        this.$selectedDateMillis = l;
        this.$dateFormatter = c1x9;
        this.$selectableDates = interfaceC04801Xj;
        this.$colors = c1Wz;
    }
}
