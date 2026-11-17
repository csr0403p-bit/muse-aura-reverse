package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$WhatsAppConnectContent$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$WhatsAppConnectContent$4$1(Function0<Unit> function0) {
        super(0);
        this.$onDismiss = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDismiss.invoke();
    }
}
