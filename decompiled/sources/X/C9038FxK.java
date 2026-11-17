package X;

import com.meta.health.healthconnect.HealthConnectPlugin;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.healthconnect.HealthConnectPlugin", f = "HealthConnectPlugin.kt", l = {230}, m = "mapExerciseSessionToWorkoutSummary", v = 2)
/* renamed from: X.FxK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9038FxK extends HzP {
    public double D$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HealthConnectPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9038FxK(HealthConnectPlugin healthConnectPlugin, HtJ<? super C9038FxK> htJ) {
        super(htJ);
        this.this$0 = healthConnectPlugin;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HealthConnectPlugin.A08(null, this.this$0, this);
    }
}
