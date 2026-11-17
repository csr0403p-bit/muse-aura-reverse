package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;
import com.facebook.aura.R;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MessagingChannel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MessagingChannel[] $VALUES;
    public static final MessagingChannel MESSENGER;
    public static final MessagingChannel TELEGRAM;
    public static final MessagingChannel WHATSAPP;
    public final int iconResId;
    public final String provider;
    public final int titleResId;

    public static Ey9<MessagingChannel> getEntries() {
        return $ENTRIES;
    }

    public static MessagingChannel valueOf(String str) {
        return (MessagingChannel) Enum.valueOf(MessagingChannel.class, str);
    }

    public static MessagingChannel[] values() {
        return (MessagingChannel[]) $VALUES.clone();
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    static {
        MessagingChannel messagingChannel = new MessagingChannel("WHATSAPP", 0, NativeLoginAccountResolverKt.WHATSAPP_USER_ID, R.string._name_removed__res_0x7f120ee2, R.drawable.ic_channel_whatsapp);
        WHATSAPP = messagingChannel;
        MessagingChannel messagingChannel2 = new MessagingChannel("TELEGRAM", 1, "telegram", R.string._name_removed__res_0x7f120ee0, R.drawable.ic_channel_telegram);
        TELEGRAM = messagingChannel2;
        MessagingChannel messagingChannel3 = new MessagingChannel("MESSENGER", 2, "messenger", R.string._name_removed__res_0x7f120ede, R.drawable.app_icon_messenger_squircle);
        MESSENGER = messagingChannel3;
        MessagingChannel[] messagingChannelArr = {messagingChannel, messagingChannel2, messagingChannel3};
        $VALUES = messagingChannelArr;
        $ENTRIES = new F3w(messagingChannelArr);
    }

    public MessagingChannel(String str, int i, String str2, int i2, int i3) {
        this.provider = str2;
        this.titleResId = i2;
        this.iconResId = i3;
    }
}
