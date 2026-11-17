package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ChannelUiItem $channelItem;
    public final /* synthetic */ G0U<ChannelUiItem, Unit> $navigateToChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1$1$1$1$1(G0U<? super ChannelUiItem, Unit> g0u, ChannelUiItem channelUiItem) {
        super(0);
        this.$navigateToChannel = g0u;
        this.$channelItem = channelUiItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigateToChannel.invoke(this.$channelItem);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
