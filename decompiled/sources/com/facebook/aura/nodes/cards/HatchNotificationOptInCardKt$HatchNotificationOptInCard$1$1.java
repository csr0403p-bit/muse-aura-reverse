package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchNotificationOptInCardKt$HatchNotificationOptInCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NotificationOptInStore $store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationOptInCardKt$HatchNotificationOptInCard$1$1(NotificationOptInStore notificationOptInStore) {
        super(0);
        this.$store = notificationOptInStore;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$store.refresh();
    }
}
