package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation", v = 1)
/* renamed from: X.8Zj, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8Zj extends HzP {
    public int I$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C7Bq.A02(this);
    }

    public C8Zj(HtJ<? super C8Zj> htJ) {
        super(htJ);
    }
}
