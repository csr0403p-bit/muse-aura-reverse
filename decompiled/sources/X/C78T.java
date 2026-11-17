package X;

import com.facebook.aura.executors.AuraDispatchers;

/* renamed from: X.78T, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C78T {
    <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v);

    <E extends C78X> E get(C78I<E> c78i);

    C78T minusKey(C78I<?> c78i);

    C78T plus(C78T c78t);

    static HzC A00() {
        return Hxb.A02(AuraDispatchers.INSTANCE.io().plus(new C8eO(null)));
    }

    static HzC A01(C78T c78t, HoC hoC) {
        return Hxb.A02(c78t.plus(new C8eO(hoC)));
    }
}
