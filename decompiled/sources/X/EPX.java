package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "libraries.access.src.main.bloks.impl.FxAccessLibraryUnifiedBloksImpl", f = "FxAccessLibraryUnifiedBloksImpl.kt", l = {227}, m = "fetchAuthDataWithUnifiedAPI", v = 2)
/* loaded from: classes5.dex */
public final class EPX extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
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
    public final /* synthetic */ EPU this$0;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EPU.A00(null, null, null, null, null, null, this, null, null, this.this$0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/EPU;LX/HtJ<-LX/EPX;>;)V */
    public EPX(HtJ htJ, EPU epu) {
        super(htJ);
        this.this$0 = epu;
    }
}
