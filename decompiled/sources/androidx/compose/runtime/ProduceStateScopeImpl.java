package androidx.compose.runtime;

import X.C78T;
import X.InterfaceC05161qu;

/* loaded from: classes.dex */
public final class ProduceStateScopeImpl<T> implements InterfaceC05161qu<T>, MutableState<T> {
    public final C78T A00;
    public final /* synthetic */ MutableState<T> A01;

    @Override // X.C3UX
    public final C78T AEA() {
        return this.A00;
    }

    @Override // androidx.compose.runtime.MutableState
    public final void Af8(T t) {
        this.A01.Af8(t);
    }

    @Override // androidx.compose.runtime.MutableState, X.C1BO
    public final T getValue() {
        return this.A01.getValue();
    }

    public ProduceStateScopeImpl(MutableState<T> mutableState, C78T c78t) {
        this.A01 = mutableState;
        this.A00 = c78t;
    }
}
