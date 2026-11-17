package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0U;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ ChannelUiItem $channelItem;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<ChannelUiItem, Unit> $navigateToChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1$1$1(ChannelUiItem channelUiItem, G0U<? super ChannelUiItem, Unit> g0u, boolean z) {
        super(3);
        this.$channelItem = channelUiItem;
        this.$navigateToChannel = g0u;
        this.$enabled = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            ChannelUiItem channelUiItem = this.$channelItem;
            MessagingChannel messagingChannel = channelUiItem.channel;
            boolean z = channelUiItem.needsAttention;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$channelItem, bfm.A65(this.$navigateToChannel));
            G0U<ChannelUiItem, Unit> g0u = this.$navigateToChannel;
            ChannelUiItem channelUiItem2 = this.$channelItem;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2$1$3$1$1$1$1$1(g0u, channelUiItem2);
                bfm.Ai0(objAaT);
            }
            AuraChannelsSettingsScreenKt.ChannelCard(messagingChannel, (Function0) objAaT, null, this.$enabled, z, bfm, 0, 4);
            return;
        }
        bfm.Afo();
    }
}
