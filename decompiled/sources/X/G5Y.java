package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {156}, m = "withTimeoutOrNull", v = 1)
/* loaded from: classes6.dex */
public final class G5Y<T> extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GAX.A01(this, null, 0L);
    }

    public G5Y(HtJ<? super G5Y> htJ) {
        super(htJ);
    }
}
