package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DAs extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ColdInfo $coldInfo;
    public final /* synthetic */ boolean $useStartRequestedUptimeMs;
    public final /* synthetic */ DAW<ColdInfo> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAs(DAW<ColdInfo> daw, boolean z, ColdInfo coldinfo) {
        super(0);
        this.this$0 = daw;
        this.$useStartRequestedUptimeMs = z;
        this.$coldInfo = coldinfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        this.this$0.trackColdStart(this.$useStartRequestedUptimeMs, this.$coldInfo);
        return Unit.INSTANCE;
    }
}
