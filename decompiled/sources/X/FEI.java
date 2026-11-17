package X;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class FEI<State, RenderContext> extends C10443Hhq<FEE<State, RenderContext>> {
    public final long A00;
    public volatile FEE<State, RenderContext> A01;

    public final FEE<State, RenderContext> A02() {
        if (0 != 0) {
            throw new NullPointerException("future");
        }
        return A01() ? A00() : this.A01;
    }

    public FEI(FEE fee, Callable callable, long j) {
        super(callable);
        this.A01 = fee;
        this.A00 = j;
    }
}
