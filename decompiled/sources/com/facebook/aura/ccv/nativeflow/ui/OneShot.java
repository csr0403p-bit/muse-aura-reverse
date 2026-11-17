package com.facebook.aura.ccv.nativeflow.ui;

import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OneShot<T> implements G0U<T, Unit> {
    public final G0U<T, Unit> block;
    public boolean fired;

    /* JADX WARN: Multi-variable type inference failed */
    public OneShot(G0U<? super T, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.block = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(T t) {
        if (this.fired) {
            return;
        }
        this.fired = true;
        this.block.invoke(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((OneShot<T>) obj);
        return Unit.INSTANCE;
    }
}
