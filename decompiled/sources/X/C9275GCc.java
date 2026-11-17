package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3093}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", v = 1)
/* renamed from: X.GCc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9275GCc extends HzP {
    public int I$0;
    public int I$1;
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GCV<E> this$0;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA03 = GCV.A03(this, this.this$0, null, 0, 0L);
        return objA03 != EnumC10460Hji.A02 ? new HoI(objA03) : objA03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GCV<TE;>;LX/HtJ<-LX/GCc;>;)V */
    public C9275GCc(HtJ htJ, GCV gcv) {
        super(htJ);
        this.this$0 = gcv;
    }
}
