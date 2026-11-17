package X;

import com.meta.health.healthconnect.HealthConnectPlugin;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.healthconnect.HealthConnectPlugin", f = "HealthConnectPlugin.kt", l = {640, 663, 673, 681, 691}, m = "executeStatisticsQuery", v = 2)
/* renamed from: X.FxI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9036FxI extends HzP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HealthConnectPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9036FxI(HealthConnectPlugin healthConnectPlugin, HtJ<? super C9036FxI> htJ) {
        super(htJ);
        this.this$0 = healthConnectPlugin;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AB6(null, this);
    }
}
