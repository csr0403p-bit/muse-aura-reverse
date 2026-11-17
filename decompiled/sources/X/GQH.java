package X;

import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession", f = "MetaAiRsysSdkRealTimeSession.kt", l = {1156}, m = "playEndEarconAndReleaseAudio", v = 2)
/* loaded from: classes6.dex */
public final class GQH extends HzP {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQH(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, HtJ<? super GQH> htJ) {
        super(htJ);
        this.this$0 = metaAiRsysSdkRealTimeSession;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AXy(false, this);
    }
}
