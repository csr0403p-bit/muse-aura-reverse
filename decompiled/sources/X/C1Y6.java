package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* renamed from: X.1Y6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C1X9 $dateFormatter;
    public final /* synthetic */ C1XY $firstMonth;
    public final /* synthetic */ LazyListState $lazyListState;
    public final /* synthetic */ G0U<Long, Unit> $onDateSelectionChange;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ Long $selectedDateMillis;
    public final /* synthetic */ C1XX $today;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/lazy/LazyListState;LX/ADq;LX/1Xc;LX/1XY;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1XX;Ljava/lang/Long;LX/1X9;LX/1Xj;LX/1Wz;)V */
    public C1Y6(LazyListState lazyListState, C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, C1XX c1xx, AbstractC04741Xc abstractC04741Xc, C1XY c1xy, Long l, G0U g0u, ADq aDq) {
        super(2);
        this.$lazyListState = lazyListState;
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

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        if (AnonymousClass005.A0D(num) == 2 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            BRg bRgA01 = ARD.A01(BRg.A00, new BUT(12), false);
            LazyListState lazyListState = this.$lazyListState;
            C1054ATb c1054ATb = new C1054ATb(new C1Y8(1.0f, 0.1f));
            boolean zA65 = (bfm2.A65(lazyListState)) | bfm2.A65(c1054ATb);
            Object objAaT = bfm2.AaT();
            if (zA65 || objAaT == C78N.A00) {
                final C2AB c2ab = new C2AB(C1YB.A00, lazyListState);
                objAaT = new SnapFlingBehavior(new C1003AOr(null, 1.0f, 400.0f), c1054ATb, new C1YA() { // from class: X.1Y9
                    @Override // X.C1YA
                    public final float A5p(float f) {
                        return c2ab.A5p(f);
                    }

                    @Override // X.C1YA
                    public final float A5g(float f, float f2) {
                        return 0.0f;
                    }
                });
                bfm2.Ai0(objAaT);
            }
            BLD bld = (BLD) objAaT;
            boolean zA1R = AnonymousClass001.A1R(bfm2, this.$colors, AnonymousClass001.A1R(bfm2, this.$selectableDates, AnonymousClass001.A1T(bfm2, this.$dateFormatter, AnonymousClass001.A1R(bfm2, this.$selectedDateMillis, AnonymousClass001.A1R(bfm2, this.$today, AnonymousClass001.A1R(bfm2, this.$onDateSelectionChange, AnonymousClass001.A1R(bfm2, this.$firstMonth, AnonymousClass001.A1T(bfm2, this.$calendarModel, bfm2.A67(this.$yearRange)))))))));
            ADq aDq = this.$yearRange;
            AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
            C1XY c1xy = this.$firstMonth;
            G0U<Long, Unit> g0u = this.$onDateSelectionChange;
            C1XX c1xx = this.$today;
            Long l = this.$selectedDateMillis;
            C1X9 c1x9 = this.$dateFormatter;
            InterfaceC04801Xj interfaceC04801Xj = this.$selectableDates;
            C1Wz c1Wz = this.$colors;
            Object objAaT2 = bfm2.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new C1XF(c1Wz, c1x9, interfaceC04801Xj, c1xx, abstractC04741Xc, c1xy, l, g0u, aDq);
                bfm2.Ai0(objAaT2);
            }
            C1YY.A02(bld, null, null, lazyListState, bfm2, null, bRgA01, (G0U) objAaT2, 0, 188, false, false);
        }
        return Unit.INSTANCE;
    }
}
