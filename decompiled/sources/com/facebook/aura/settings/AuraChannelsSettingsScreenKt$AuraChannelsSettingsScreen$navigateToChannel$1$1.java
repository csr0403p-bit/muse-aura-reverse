package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$navigateToChannel$1$1 extends AbstractC7559F3s implements G0U<ChannelUiItem, Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onMessengerSettingsClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onTelegramSettingsClick;
    public final /* synthetic */ G0V<Boolean, Boolean, Unit> $onWhatsAppSettingsClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ChannelUiItem channelUiItem) {
        HatchComponent hatchComponent;
        G0U<Boolean, Unit> g0u;
        C7384Etj.A0Y(channelUiItem, 0);
        int iOrdinal = channelUiItem.channel.ordinal();
        if (iOrdinal == 0) {
            hatchComponent = HatchComponent.WHATSAPP_BUTTON;
        } else if (iOrdinal == 1) {
            hatchComponent = HatchComponent.TELEGRAM_BUTTON;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hatchComponent = HatchComponent.MESSENGER_BUTTON;
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, HatchScreen.CHANNELS, hatchComponent, null, null, null);
        int iOrdinal2 = channelUiItem.channel.ordinal();
        if (iOrdinal2 == 0) {
            this.$onWhatsAppSettingsClick.invoke(Boolean.valueOf(channelUiItem.linked), Boolean.valueOf(channelUiItem.needsAttention));
            return;
        }
        if (iOrdinal2 == 1) {
            g0u = this.$onTelegramSettingsClick;
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g0u = this.$onMessengerSettingsClick;
        }
        AnonymousClass001.A1K(channelUiItem.linked, g0u);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagingChannel.values().length];
            try {
                AnonymousClass002.A13(MessagingChannel.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(MessagingChannel.TELEGRAM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(MessagingChannel.MESSENGER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$navigateToChannel$1$1(G0V<? super Boolean, ? super Boolean, Unit> g0v, G0U<? super Boolean, Unit> g0u, G0U<? super Boolean, Unit> g0u2) {
        super(1);
        this.$onWhatsAppSettingsClick = g0v;
        this.$onTelegramSettingsClick = g0u;
        this.$onMessengerSettingsClick = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ChannelUiItem channelUiItem) {
        invoke2(channelUiItem);
        return Unit.INSTANCE;
    }
}
