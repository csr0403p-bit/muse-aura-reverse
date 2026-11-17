package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1XB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XB extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ AbstractC04741Xc $calendarModel;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ C1XY $displayedMonth;
    public final /* synthetic */ long $displayedMonthMillis;
    public final /* synthetic */ LazyListState $monthsListState;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (JLandroidx/compose/runtime/MutableState<Ljava/lang/Boolean;>;LX/3UX;Landroidx/compose/foundation/lazy/LazyListState;LX/ADq;LX/1XY;LX/1Xj;LX/1Xc;LX/1Wz;)V */
    public C1XB(LazyListState lazyListState, C1Wz c1Wz, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, C1XY c1xy, MutableState mutableState, ADq aDq, C3UX c3ux, long j) {
        super(3);
        this.$displayedMonthMillis = j;
        this.$yearPickerVisible$delegate = mutableState;
        this.$coroutineScope = c3ux;
        this.$monthsListState = lazyListState;
        this.$yearRange = aDq;
        this.$displayedMonth = c1xy;
        this.$selectableDates = interfaceC04801Xj;
        this.$calendarModel = abstractC04741Xc;
        this.$colors = c1Wz;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        String strA00 = C1EO.A00(bfmA0P, R.string._name_removed__res_0x7f120ccc);
        BS0 bs0 = BRg.A00;
        boolean zA65 = bfmA0P.A65(strA00);
        Object objAaT = bfmA0P.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new C3cE(strA00, 3);
            bfmA0P.Ai0(objAaT);
        }
        BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
        long j = this.$displayedMonthMillis;
        MutableState<Boolean> mutableState = this.$yearPickerVisible$delegate;
        C3UX c3ux = this.$coroutineScope;
        LazyListState lazyListState = this.$monthsListState;
        ADq aDq = this.$yearRange;
        C1XY c1xy = this.$displayedMonth;
        InterfaceC04801Xj interfaceC04801Xj = this.$selectableDates;
        AbstractC04741Xc abstractC04741Xc = this.$calendarModel;
        C1Wz c1Wz = this.$colors;
        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfmA0P);
        BBI bbi = (BBI) bfmA0P;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfmA0P, bRgA0Y);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfmA0P, bbi, function0);
        AnonymousClass003.A0o(bfmA0P, interfaceC1380AiAA0U, akqA04);
        G0V<InterfaceC1516AkQ, Integer, Unit> g0v = C1515AkP.A03;
        if (bbi.A0M || !AnonymousClass007.A1K(bfmA0P, iA0J)) {
            AnonymousClass006.A1U(g0v, bfmA0P, iA0J);
        }
        AnonymousClass001.A16(bfmA0P, bRgA01);
        BRg bRgA0B = C3U4.A0B(C10G.A05(bs0, (48.0f * 7.0f) - 1.0f), 12.0f, 0.0f);
        boolean zA1U = AnonymousClass005.A1U(bfmA0P, lazyListState, aDq, c1xy, AnonymousClass003.A1J(bfmA0P, mutableState, c3ux));
        Object objAaT2 = bfmA0P.AaT();
        if (zA1U || objAaT2 == C78N.A00) {
            objAaT2 = new C1XH(lazyListState, c1xy, mutableState, aDq, c3ux);
            bfmA0P.Ai0(objAaT2);
        }
        C1XA.A05(c1Wz, interfaceC04801Xj, abstractC04741Xc, bfmA0P, bRgA0B, (G0U) objAaT2, aDq, 6, j);
        C0xs.A00(0.0f, c1Wz.A0B, null, bfmA0P, 0, 3);
        BBI.A0R(bbi, true);
        return Unit.INSTANCE;
    }
}
