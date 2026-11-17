package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import com.facebook.aura.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1XM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XM extends AbstractC7559F3s implements G2j<C03X, Integer, BFM, Integer, Unit> {
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ int $currentYear;
    public final /* synthetic */ int $displayedYear;
    public final /* synthetic */ LazyGridState $lazyGridState;
    public final /* synthetic */ G0U<Integer, Unit> $onYearSelected;
    public final /* synthetic */ String $scrollToEarlierYearsLabel;
    public final /* synthetic */ String $scrollToLaterYearsLabel;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/ADq;Landroidx/compose/foundation/lazy/grid/LazyGridState;LX/3UX;Ljava/lang/String;Ljava/lang/String;IILX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Xj;LX/1Wz;)V */
    public C1XM(LazyGridState lazyGridState, C1Wz c1Wz, InterfaceC04801Xj interfaceC04801Xj, String str, String str2, G0U g0u, ADq aDq, C3UX c3ux, int i, int i2) {
        super(4);
        this.$yearRange = aDq;
        this.$lazyGridState = lazyGridState;
        this.$coroutineScope = c3ux;
        this.$scrollToEarlierYearsLabel = str;
        this.$scrollToLaterYearsLabel = str2;
        this.$displayedYear = i;
        this.$currentYear = i2;
        this.$onYearSelected = g0u;
        this.$selectableDates = interfaceC04801Xj;
        this.$colors = c1Wz;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Unit invoke(C03X c03x, Integer num, BFM bfm, Integer num2) {
        int iA0F = AnonymousClass001.A0F(num);
        BFM bfm2 = bfm;
        int iA0F2 = AnonymousClass001.A0F(num2);
        if ((iA0F2 & 48) == 0) {
            iA0F2 |= AnonymousClass004.A0E(bfm2, iA0F);
        }
        if ((iA0F2 & 145) == 144 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            int i = iA0F + this.$yearRange.A00;
            String strA00 = AbstractC8161FXd.A00(i);
            BRg bRgA0B = C10G.A0B(BRg.A00, 72.0f, 36.0f);
            boolean zA1R = AnonymousClass001.A1R(bfm2, this.$scrollToLaterYearsLabel, AnonymousClass001.A1R(bfm2, this.$scrollToEarlierYearsLabel, AnonymousClass001.A1T(bfm2, this.$coroutineScope, AnonymousClass003.A1C(iA0F2) | bfm2.A65(this.$lazyGridState))));
            LazyGridState lazyGridState = this.$lazyGridState;
            C3UX c3ux = this.$coroutineScope;
            String str = this.$scrollToEarlierYearsLabel;
            String str2 = this.$scrollToLaterYearsLabel;
            Object objAaT = bfm2.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new AdC(lazyGridState, str, str2, c3ux, iA0F);
                bfm2.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, false);
            boolean zA1Q = AnonymousClass002.A1Q(i, this.$displayedYear);
            boolean zA1Q2 = AnonymousClass002.A1Q(i, this.$currentYear);
            boolean zA1W = AnonymousClass003.A1W(this.$onYearSelected, bfm2, i);
            G0U<Integer, Unit> g0u = this.$onYearSelected;
            Object objAaT2 = bfm2.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new C04771Xf(g0u, i);
                bfm2.Ai0(objAaT2);
            }
            boolean zIsSelectableYear = this.$selectableDates.isSelectableYear(i);
            String str3 = String.format(C1EO.A00(bfm2, R.string._name_removed__res_0x7f120cc0), Arrays.copyOf(new Object[]{strA00}, 1));
            C1XA.A09(this.$colors, bfm2, bRgA0Y, str3, (Function0) objAaT2, B1V.A00(bfm2, new C3UU(strA00, 2), 882189459), 12582912, zA1Q, zA1Q2, zIsSelectableYear);
        }
        return Unit.INSTANCE;
    }
}
