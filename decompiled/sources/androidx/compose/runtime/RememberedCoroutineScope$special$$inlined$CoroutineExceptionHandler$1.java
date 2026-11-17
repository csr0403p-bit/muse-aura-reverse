package androidx.compose.runtime;

import X.BFB;
import X.C067078j;
import X.C78T;
import X.C78p;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ BFB $traceContext$inlined;
    public final /* synthetic */ C067078j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(C78p c78p, BFB bfb, C067078j c067078j) {
        super(c78p);
        this.$traceContext$inlined = bfb;
        this.this$0 = c067078j;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) throws Throwable {
        this.$traceContext$inlined.A4s(this.this$0, th);
        C78T c78t2 = this.this$0.A00;
        C78p c78p = CoroutineExceptionHandler.Key;
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) c78t2.get(c78p);
        if (coroutineExceptionHandler == null && (coroutineExceptionHandler = (CoroutineExceptionHandler) this.this$0.A01.get(c78p)) == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(c78t, th);
    }
}
