package X;

import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1X7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X7 extends AbstractC7559F3s implements Function0<C1XE> {
    public final /* synthetic */ int $initialDisplayMode = 0;
    public final /* synthetic */ Long $initialDisplayedMonthMillis;
    public final /* synthetic */ Long $initialSelectedDateMillis;
    public final /* synthetic */ Locale $locale;
    public final /* synthetic */ InterfaceC04801Xj $selectableDates;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1X7(InterfaceC04801Xj interfaceC04801Xj, Long l, Long l2, Locale locale, ADq aDq) {
        super(0);
        this.$initialSelectedDateMillis = l;
        this.$initialDisplayedMonthMillis = l2;
        this.$yearRange = aDq;
        this.$selectableDates = interfaceC04801Xj;
        this.$locale = locale;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ C1XE invoke() {
        return new C1XE(this.$selectableDates, this.$initialSelectedDateMillis, this.$initialDisplayedMonthMillis, this.$locale, this.$yearRange, this.$initialDisplayMode);
    }
}
