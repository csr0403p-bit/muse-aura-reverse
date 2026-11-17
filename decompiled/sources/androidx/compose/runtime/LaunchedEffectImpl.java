package androidx.compose.runtime;

import X.BFB;
import X.C3UX;
import X.C6ys;
import X.C7384Etj;
import X.C78I;
import X.C78T;
import X.C78W;
import X.C78X;
import X.C79;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hxb;
import X.InterfaceC1559AlZ;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class LaunchedEffectImpl implements CoroutineExceptionHandler, InterfaceC1559AlZ {
    public static final int $stable = 8;
    public HoC job;
    public final C78T parentCoroutineContext;
    public final C3UX scope;
    public final G0V<C3UX, HtJ<? super Unit>, Object> task;

    @Override // X.C78T
    public /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public C78I<?> getKey() {
        return CoroutineExceptionHandler.Key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) throws Throwable {
        BFB bfb = (BFB) c78t.get(BFB.A01);
        if (bfb != null) {
            bfb.A4s(this, th);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.parentCoroutineContext.get(CoroutineExceptionHandler.Key);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(c78t, th);
    }

    @Override // X.InterfaceC1559AlZ
    public void onAbandoned() {
        HoC hoC = this.job;
        if (hoC != null) {
            hoC.A5w(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // X.InterfaceC1559AlZ
    public void onForgotten() {
        HoC hoC = this.job;
        if (hoC != null) {
            hoC.A5w(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // X.InterfaceC1559AlZ
    public void onRemembered() {
        HoC hoC = this.job;
        if (hoC != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            hoC.A5w(cancellationException);
        }
        C3UX c3ux = this.scope;
        G0V<C3UX, HtJ<? super Unit>, Object> g0v = this.task;
        this.job = GAo.A02(C79.A00, C6ys.A00, g0v, c3ux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(C78T c78t, G0V<? super C3UX, ? super HtJ<? super Unit>, ? extends Object> g0v) {
        this.parentCoroutineContext = c78t;
        this.task = g0v;
        this.scope = Hxb.A02(c78t.plus(this));
    }

    @Override // X.C78X, X.C78T
    public /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}
