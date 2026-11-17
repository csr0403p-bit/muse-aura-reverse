package X;

import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession", f = "MetaAiRsysSdkRealTimeSession.kt", l = {1049, 1055}, m = "endInternal", v = 2)
/* loaded from: classes6.dex */
public final class GQJ extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQJ(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, HtJ<? super GQJ> htJ) {
        super(htJ);
        this.this$0 = metaAiRsysSdkRealTimeSession;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MetaAiRsysSdkRealTimeSession.A02(this.this$0, null, this, 0, false);
    }
}
