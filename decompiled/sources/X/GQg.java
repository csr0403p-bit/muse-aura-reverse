package X;

import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk", f = "MetaAiRsysSdk.kt", l = {262, 326}, m = "startSession", v = 2)
/* loaded from: classes6.dex */
public final class GQg extends HzP {
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
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaAiRsysSdk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQg(MetaAiRsysSdk metaAiRsysSdk, HtJ<? super GQg> htJ) {
        super(htJ);
        this.this$0 = metaAiRsysSdk;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(null, null, null, null, this);
    }
}
