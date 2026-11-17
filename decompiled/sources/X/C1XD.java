package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.facebook.aura.R;
import java.time.LocalDate;
import kotlin.Unit;

/* renamed from: X.1XD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XD extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ long $displayedMonthMillis;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Integer, Unit> $onYearSelected;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/1Xc;JLX/ADq;LX/1Wz;LX/BRg;LX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Xj;)V */
    public C1XD(C1Wz c1Wz, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, BRg bRg, G0U g0u, ADq aDq, long j) {
        super(2);
        this.$calendarModel = abstractC04741Xc;
        this.$displayedMonthMillis = j;
        this.$yearRange = aDq;
        this.$colors = c1Wz;
        this.$modifier = bRg;
        this.$onYearSelected = g0u;
        this.$selectableDates = interfaceC04801Xj;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
            C1XX c1xxA02 = abstractC04741Xc.A02();
            int i = C1Y1.A00((C1Y1) abstractC04741Xc, LocalDate.of(c1xxA02.A02, c1xxA02.A01, 1)).A03;
            int i2 = this.$calendarModel.A04(this.$displayedMonthMillis).A03;
            LazyGridState lazyGridStateA00 = Ad7.A00(bfm2, Math.max(0, (i2 - this.$yearRange.A00) - 3), 2);
            long j = this.$colors.A00;
            Object objAaT = bfm2.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = ((C066978i) AnonymousClass007.A0V(bfm2, objAaT, obj)).A00;
            String strA00 = C1EO.A00(bfm2, R.string._name_removed__res_0x7f120cc2);
            String strA002 = C1EO.A00(bfm2, R.string._name_removed__res_0x7f120cc3);
            C1DD c1dd = new C1DD(3);
            BRg bRgA01 = ARD.A01(C1b8.A01(this.$modifier, j), new BUT(15), false);
            C02i c02i = AcQ.A04;
            C9m9 c9m9A00 = AcQ.A00(16.0f);
            boolean zA1R = AnonymousClass001.A1R(bfm2, this.$colors, AnonymousClass001.A1R(bfm2, this.$selectableDates, AnonymousClass001.A1R(bfm2, this.$onYearSelected, AnonymousClass001.A1a(AnonymousClass001.A1a(AnonymousClass005.A1W(bfm2, c3ux, strA00, strA002, AnonymousClass003.A1N(bfm2, this.$yearRange, lazyGridStateA00)), bfm2, i2), bfm2, i))));
            ADq aDq = this.$yearRange;
            G0U<Integer, Unit> g0u = this.$onYearSelected;
            InterfaceC04801Xj interfaceC04801Xj = this.$selectableDates;
            C1Wz c1Wz = this.$colors;
            Object objAaT2 = bfm2.AaT();
            if (zA1R || objAaT2 == obj) {
                objAaT2 = new C1XL(lazyGridStateA00, c1Wz, interfaceC04801Xj, strA00, strA002, g0u, aDq, c3ux, i2, i);
                bfm2.Ai0(objAaT2);
            }
            C1YZ.A01(null, c02i, c9m9A00, null, c1dd, lazyGridStateA00, bfm2, bRgA01, (G0U) objAaT2, 1769472, 408, false, false);
        }
        return Unit.INSTANCE;
    }
}
