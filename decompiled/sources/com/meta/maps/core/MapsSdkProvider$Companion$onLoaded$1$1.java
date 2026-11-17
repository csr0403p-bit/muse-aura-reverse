package com.meta.maps.core;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class MapsSdkProvider$Companion$onLoaded$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ LoadedSubscription $subscription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapsSdkProvider$Companion$onLoaded$1$1(LoadedSubscription loadedSubscription) {
        super(0);
        this.$subscription = loadedSubscription;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$subscription.onModuleLoaded();
    }
}
