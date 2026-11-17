package com.facebook.aura.pairs;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ConnectionsShareScreenKt$ConnectionsShareScreen$2$2$1 extends C7438Evz implements Function0<Unit> {
    public ConnectionsShareScreenKt$ConnectionsShareScreen$2$2$1(Object obj) {
        super(0, obj, ConnectionsShareViewModel.class, "loadMore", "loadMore()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConnectionsShareViewModel) this.receiver).loadMore();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
