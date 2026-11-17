package com.facebook.aura.pairs;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class PairsHistoryScreenKt$PairsHistoryScreen$3$2$1 extends C7438Evz implements Function0<Unit> {
    public PairsHistoryScreenKt$PairsHistoryScreen$3$2$1(Object obj) {
        super(0, obj, PairsHistoryViewModel.class, "loadOlder", "loadOlder()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PairsHistoryViewModel) this.receiver).loadOlder();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
