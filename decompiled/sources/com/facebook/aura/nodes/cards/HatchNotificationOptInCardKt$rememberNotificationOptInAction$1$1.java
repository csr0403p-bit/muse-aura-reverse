package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchNotificationOptInCardKt$rememberNotificationOptInAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $showDeniedDialog$delegate;
    public final /* synthetic */ NotificationOptInStore $store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationOptInCardKt$rememberNotificationOptInAction$1$1(NotificationOptInStore notificationOptInStore, MutableState<Boolean> mutableState) {
        super(0);
        this.$store = notificationOptInStore;
        this.$showDeniedDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showDeniedDialog$delegate);
        this.$store.refresh();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
