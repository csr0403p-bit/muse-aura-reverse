package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Gci, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9658Gci<TState> extends C9659Gcj<TState> {
    public G0U<Object, ? extends Object> A00;
    public final Function0<TState> A01;
    public final G0U<G0V<? super TState, Object, ? extends TState>, Unit> A02;
    public final G0U<Function0<Unit>, Function0<Unit>> A03;

    public C9658Gci(Function0 function0, GRU gru) {
        super(gru);
        this.A01 = function0;
        this.A00 = new FZG(16, gru, this);
        this.A02 = new FZG(17, gru, this);
        this.A03 = new FZG(18, gru, this);
    }
}
