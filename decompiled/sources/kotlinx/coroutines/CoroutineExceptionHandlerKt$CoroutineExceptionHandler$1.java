package kotlinx.coroutines;

import X.C78T;
import X.C78p;
import X.G0V;
import X.HqU;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ G0V<C78T, Throwable, Unit> $handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(G0V<? super C78T, ? super Throwable, Unit> g0v, C78p c78p) {
        super(c78p);
        this.$handler = g0v;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        this.$handler.invoke(c78t, th);
    }
}
