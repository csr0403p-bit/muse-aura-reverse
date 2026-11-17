package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {736}, m = "receiveCatching-JP2dKIU$suspendImpl", v = 1)
/* renamed from: X.GCb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9274GCb<E> extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public long J$1;
    public long J$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GCV<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GCV<TE;>;LX/HtJ<-LX/GCb;>;)V */
    public C9274GCb(HtJ htJ, GCV gcv) {
        super(htJ);
        this.this$0 = gcv;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA02 = GCV.A02(this, this.this$0);
        return objA02 != EnumC10460Hji.A02 ? new HoI(objA02) : objA02;
    }
}
