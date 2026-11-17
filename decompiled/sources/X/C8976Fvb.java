package X;

import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.meta.health.core.MetaHealthQuery;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.core.MetaHealthQuery", f = "MetaHealthQuery.kt", l = {234, HatchDeviceBleManagerKt.REQUESTED_MTU, 258}, m = "queryAllRawSamples", v = 2)
/* renamed from: X.Fvb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8976Fvb extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaHealthQuery this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8976Fvb(MetaHealthQuery metaHealthQuery, HtJ<? super C8976Fvb> htJ) {
        super(htJ);
        this.this$0 = metaHealthQuery;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A06(null, null, null, null, this, 0);
    }
}
