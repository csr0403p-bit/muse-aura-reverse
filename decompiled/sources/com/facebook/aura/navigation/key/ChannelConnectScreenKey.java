package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraContentAreaNavKey;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ChannelConnectScreenKey extends C06G implements AuraContentAreaNavKey, AuraOverlayNavKey {
    public static final Companion Companion = new Companion();
    public final String channel;
    public final String intent;
    public final String utmSource;

    public final class Companion {
        public final C9hr<ChannelConnectScreenKey> serializer() {
            return ChannelConnectScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ChannelConnectScreenKey(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.channel = str;
        this.intent = str2;
        this.utmSource = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ChannelConnectScreenKey channelConnectScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(channelConnectScreenKey.channel, c9iZ, 0);
        if (c9j5.AfR() || channelConnectScreenKey.intent != null) {
            c9j5.AAP(channelConnectScreenKey.intent, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAP(channelConnectScreenKey.utmSource, C07779iq.A01, c9iZ, 2);
    }

    public final ChannelConnectScreenKey copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new ChannelConnectScreenKey(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelConnectScreenKey) {
                ChannelConnectScreenKey channelConnectScreenKey = (ChannelConnectScreenKey) obj;
                if (!C7384Etj.areEqual(this.channel, channelConnectScreenKey.channel) || !C7384Etj.areEqual(this.intent, channelConnectScreenKey.intent) || !C7384Etj.areEqual(this.utmSource, channelConnectScreenKey.utmSource)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelConnectScreenKey copy$default(ChannelConnectScreenKey channelConnectScreenKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelConnectScreenKey.channel;
        }
        if ((i & 2) != 0) {
            str2 = channelConnectScreenKey.intent;
        }
        if ((i & 4) != 0) {
            str3 = channelConnectScreenKey.utmSource;
        }
        return channelConnectScreenKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.channel;
    }

    public final String component2() {
        return this.intent;
    }

    public final String component3() {
        return this.utmSource;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getUtmSource() {
        return this.utmSource;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.channel) + AnonymousClass006.A0G(this.intent)) * 31) + AnonymousClass005.A0H(this.utmSource);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChannelConnectScreenKey(String str, String str2, String str3, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), str3);
    }

    public /* synthetic */ ChannelConnectScreenKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (5 != (i & 5)) {
            C9iI.A00(ChannelConnectScreenKey$$serializer.descriptor, i, 5);
            throw F60.createAndThrow();
        }
        this.channel = str;
        this.intent = (i & 2) == 0 ? null : str2;
        this.utmSource = str3;
    }
}
