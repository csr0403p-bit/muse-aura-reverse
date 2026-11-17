package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04781Xg extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ long $dateInMillis;
    public final /* synthetic */ G0U<Long, Unit> $onDateSelectionChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C04781Xg(G0U<? super Long, Unit> g0u, long j) {
        super(0);
        this.$onDateSelectionChange = g0u;
        this.$dateInMillis = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        this.$onDateSelectionChange.invoke(Long.valueOf(this.$dateInMillis));
        return Unit.INSTANCE;
    }
}
