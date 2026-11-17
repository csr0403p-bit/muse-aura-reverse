package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {123}, m = "collect", v = 1)
/* renamed from: X.Gfz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9778Gfz extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C10650I0u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9778Gfz(C10650I0u c10650I0u, HtJ htJ) {
        super(htJ);
        this.this$0 = c10650I0u;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
