package X;

import X.InterfaceC9011Fwo;
import com.meta.health.healthconnect.HealthConnectPlugin;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.healthconnect.HealthConnectPlugin", f = "HealthConnectPlugin.kt", l = {462}, m = "readAllRecords", v = 2)
/* renamed from: X.FxH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9035FxH<T extends InterfaceC9011Fwo> extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HealthConnectPlugin this$0;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HealthConnectPlugin.A0A(null, this.this$0, this, null, null, 0, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9035FxH(HealthConnectPlugin healthConnectPlugin, HtJ<? super C9035FxH> htJ) {
        super(htJ);
        this.this$0 = healthConnectPlugin;
    }
}
