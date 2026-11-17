package com.facebook.aura.settings;

import X.AnonymousClass002;
import X.C31u;
import X.C7354EnR;
import X.Ey9;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.settings.MC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchChannelGating {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchChannelGating.class, "isWhatsAppEnabled", "isWhatsAppEnabled()Z", 0), new C7354EnR(HatchChannelGating.class, "isWhatsAppOnCvmEnabled", "isWhatsAppOnCvmEnabled()Z", 0), new C7354EnR(HatchChannelGating.class, "isTelegramEnabled", "isTelegramEnabled()Z", 0)};
    public static final HatchChannelGating INSTANCE = new HatchChannelGating();
    public static final C31u isWhatsAppEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.show_whatsapp_channel);
    public static final C31u isWhatsAppOnCvmEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_cvm.show_whatsapp_on_cvm);
    public static final C31u isTelegramEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.show_telegram_channel);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEnabled(com.facebook.aura.settings.MessagingChannel r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            int r2 = X.AnonymousClass001.A0E(r5, r3)
            r1 = 1
            if (r2 == r3) goto L1f
            if (r2 == r1) goto L18
            r0 = 2
            if (r2 != r0) goto L2c
            if (r6 != 0) goto L32
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isMessengerChannelEnabled()
        L15:
            if (r0 == 0) goto L32
        L17:
            return r1
        L18:
            if (r6 != 0) goto L32
            boolean r0 = r4.isTelegramEnabled()
            goto L15
        L1f:
            boolean r0 = r4.isWhatsAppEnabled()
            if (r0 == 0) goto L32
            if (r6 == 0) goto L17
            boolean r0 = r4.isWhatsAppOnCvmEnabled()
            goto L15
        L2c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchChannelGating.isEnabled(com.facebook.aura.settings.MessagingChannel, boolean):boolean");
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

    private final boolean isTelegramEnabled() {
        return C31u.A01(this, isTelegramEnabled$delegate, $$delegatedProperties, 2);
    }

    private final boolean isWhatsAppEnabled() {
        return C31u.A01(this, isWhatsAppEnabled$delegate, $$delegatedProperties, 0);
    }

    private final boolean isWhatsAppOnCvmEnabled() {
        return C31u.A01(this, isWhatsAppOnCvmEnabled$delegate, $$delegatedProperties, 1);
    }

    public final List<MessagingChannel> enabledChannels(boolean z) {
        Ey9<MessagingChannel> entries = MessagingChannel.getEntries();
        ArrayList arrayList = new ArrayList();
        for (MessagingChannel messagingChannel : entries) {
            if (INSTANCE.isEnabled(messagingChannel, z)) {
                arrayList.add(messagingChannel);
            }
        }
        return arrayList;
    }

    public final boolean hasAnyEnabledChannel(boolean z) {
        Ey9<MessagingChannel> entries = MessagingChannel.getEntries();
        if (!(entries instanceof Collection) || !entries.isEmpty()) {
            Iterator<MessagingChannel> it = entries.iterator();
            while (it.hasNext()) {
                if (INSTANCE.isEnabled(it.next(), z)) {
                    return true;
                }
            }
        }
        return false;
    }
}
