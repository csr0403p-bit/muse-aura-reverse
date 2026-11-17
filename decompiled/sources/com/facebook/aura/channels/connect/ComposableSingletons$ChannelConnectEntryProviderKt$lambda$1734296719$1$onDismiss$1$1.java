package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.channels.connect.ComposableSingletons$ChannelConnectEntryProviderKt$lambda$-1734296719$1$onDismiss$1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ChannelConnectEntryProviderKt$lambda$1734296719$1$onDismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ChannelConnectEntryProviderKt$lambda$1734296719$1$onDismiss$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.back();
    }
}
