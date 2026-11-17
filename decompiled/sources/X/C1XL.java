package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.Unit;

/* renamed from: X.1XL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XL extends AbstractC7559F3s implements G0U<C1Cj, Unit> {
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
    public C1XL(LazyGridState lazyGridState, C1Wz c1Wz, InterfaceC04801Xj interfaceC04801Xj, String str, String str2, G0U g0u, ADq aDq, C3UX c3ux, int i, int i2) {
        super(1);
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

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C1Cj c1Cj) {
        C1Cj c1Cj2 = c1Cj;
        int iA05 = AbstractC0878AGe.A05(this.$yearRange);
        ADq aDq = this.$yearRange;
        LazyGridState lazyGridState = this.$lazyGridState;
        C3UX c3ux = this.$coroutineScope;
        String str = this.$scrollToEarlierYearsLabel;
        String str2 = this.$scrollToLaterYearsLabel;
        int i = this.$displayedYear;
        int i2 = this.$currentYear;
        G0U<Integer, Unit> g0u = this.$onYearSelected;
        c1Cj2.APM(null, new G0U() { // from class: X.1Xl
            @Override // X.G0U
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                AnonymousClass005.A0w(obj);
                return null;
            }
        }, null, AnonymousClass001.A0M(new C1XM(lazyGridState, this.$colors, this.$selectableDates, str, str2, g0u, aDq, c3ux, i, i2), 1040623618), iA05);
        return Unit.INSTANCE;
    }
}
