package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFI;
import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchMessageChannel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchMessageChannel[] $VALUES;
    public static final Companion Companion;
    public static final HatchMessageChannel INSTAGRAM;
    public static final HatchMessageChannel MESSENGER;
    public static final Set<String> NATIVE_SESSION_CHANNELS;
    public static final HatchMessageChannel TELEGRAM;
    public static final HatchMessageChannel THREADS;
    public static final HatchMessageChannel WHATSAPP;
    public final String serverValue;

    public final class Companion {
        private final String normalizeSessionChannel(String str) {
            String strA0l;
            if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
                String strA0u = AnonymousClass001.A0u(strA0l);
                if (strA0u.length() > 0 && !HatchMessageChannel.NATIVE_SESSION_CHANNELS.contains(strA0u)) {
                    return strA0u;
                }
            }
            return null;
        }

        public final HatchMessageChannel fromServerValue(String str) {
            HatchMessageChannel next;
            C7384Etj.A0Y(str, 0);
            Iterator<HatchMessageChannel> it = HatchMessageChannel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getServerValue())) {
                    break;
                }
            }
            return next;
        }

        public final HatchMessageChannel fromSessionChannel(String str) {
            String strNormalizeSessionChannel = normalizeSessionChannel(str);
            if (strNormalizeSessionChannel != null) {
                return HatchMessageChannel.Companion.fromServerValue(strNormalizeSessionChannel);
            }
            return null;
        }

        public final boolean isExternalSessionChannel(String str) {
            return AnonymousClass002.A1X(normalizeSessionChannel(str));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchMessageChannel hatchMessageChannel = new HatchMessageChannel("WHATSAPP", 0, NativeLoginAccountResolverKt.WHATSAPP_USER_ID);
        WHATSAPP = hatchMessageChannel;
        HatchMessageChannel hatchMessageChannel2 = new HatchMessageChannel("MESSENGER", 1, "messenger");
        MESSENGER = hatchMessageChannel2;
        HatchMessageChannel hatchMessageChannel3 = new HatchMessageChannel("INSTAGRAM", 2, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM);
        INSTAGRAM = hatchMessageChannel3;
        HatchMessageChannel hatchMessageChannel4 = new HatchMessageChannel("THREADS", 3, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_THREADS);
        THREADS = hatchMessageChannel4;
        HatchMessageChannel hatchMessageChannel5 = new HatchMessageChannel("TELEGRAM", 4, "telegram");
        TELEGRAM = hatchMessageChannel5;
        HatchMessageChannel[] hatchMessageChannelArr = {hatchMessageChannel, hatchMessageChannel2, hatchMessageChannel3, hatchMessageChannel4, hatchMessageChannel5};
        $VALUES = hatchMessageChannelArr;
        $ENTRIES = new F3w(hatchMessageChannelArr);
        Companion = new Companion();
        NATIVE_SESSION_CHANNELS = BFI.A0H(new String[]{"main", "hatch"});
    }

    public static Ey9<HatchMessageChannel> getEntries() {
        return $ENTRIES;
    }

    public static HatchMessageChannel valueOf(String str) {
        return (HatchMessageChannel) Enum.valueOf(HatchMessageChannel.class, str);
    }

    public static HatchMessageChannel[] values() {
        return (HatchMessageChannel[]) $VALUES.clone();
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    public HatchMessageChannel(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
