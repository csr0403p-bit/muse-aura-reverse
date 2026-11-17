package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonScopedVmChannels$open$channel$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Integer $slot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonScopedVmChannels$open$channel$1(Integer num) {
        super(0);
        this.$slot = num;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TigonScopedVmChannels.freeSlots.add(this.$slot);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
