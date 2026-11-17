package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelProviderRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String provider;
    public final String token;

    public final class Companion {
        public final C9hr<ChannelProviderRequestJson> serializer() {
            return ChannelProviderRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ChannelProviderRequestJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.provider = str;
        this.token = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelProviderRequestJson channelProviderRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(channelProviderRequestJson.provider, c9iZ, 0);
        if (c9j5.AfR() || channelProviderRequestJson.token != null) {
            c9j5.AAP(channelProviderRequestJson.token, C07779iq.A01, c9iZ, 1);
        }
    }

    public final ChannelProviderRequestJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ChannelProviderRequestJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelProviderRequestJson) {
                ChannelProviderRequestJson channelProviderRequestJson = (ChannelProviderRequestJson) obj;
                if (!C7384Etj.areEqual(this.provider, channelProviderRequestJson.provider) || !C7384Etj.areEqual(this.token, channelProviderRequestJson.token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelProviderRequestJson copy$default(ChannelProviderRequestJson channelProviderRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelProviderRequestJson.provider;
        }
        if ((i & 2) != 0) {
            str2 = channelProviderRequestJson.token;
        }
        C7384Etj.A0Y(str, 0);
        return new ChannelProviderRequestJson(str, str2);
    }

    public final String component1() {
        return this.provider;
    }

    public final String component2() {
        return this.token;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.provider) + AnonymousClass006.A0G(this.token);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChannelProviderRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ChannelProviderRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.provider = str;
        this.token = C8j4.A0t(i, str2);
    }

    public /* synthetic */ ChannelProviderRequestJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
