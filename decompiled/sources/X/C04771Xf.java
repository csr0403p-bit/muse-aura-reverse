package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04771Xf extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Integer, Unit> $onYearSelected;
    public final /* synthetic */ int $selectedYear;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C04771Xf(G0U<? super Integer, Unit> g0u, int i) {
        super(0);
        this.$onYearSelected = g0u;
        this.$selectedYear = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        AnonymousClass005.A0l(this.$selectedYear, this.$onYearSelected);
        return Unit.INSTANCE;
    }
}
