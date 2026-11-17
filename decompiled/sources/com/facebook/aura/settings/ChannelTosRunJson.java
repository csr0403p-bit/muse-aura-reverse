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
public final class ChannelTosRunJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String text;
    public final String url;

    public final class Companion {
        public final C9hr<ChannelTosRunJson> serializer() {
            return ChannelTosRunJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ChannelTosRunJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.url = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelTosRunJson channelTosRunJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(channelTosRunJson.text, c9iZ, 0);
        if (c9j5.AfR() || channelTosRunJson.url != null) {
            c9j5.AAP(channelTosRunJson.url, C07779iq.A01, c9iZ, 1);
        }
    }

    public final ChannelTosRunJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ChannelTosRunJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelTosRunJson) {
                ChannelTosRunJson channelTosRunJson = (ChannelTosRunJson) obj;
                if (!C7384Etj.areEqual(this.text, channelTosRunJson.text) || !C7384Etj.areEqual(this.url, channelTosRunJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelTosRunJson copy$default(ChannelTosRunJson channelTosRunJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelTosRunJson.text;
        }
        if ((i & 2) != 0) {
            str2 = channelTosRunJson.url;
        }
        C7384Etj.A0Y(str, 0);
        return new ChannelTosRunJson(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.url;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0G(this.url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChannelTosRunJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ChannelTosRunJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.text = str;
        this.url = C8j4.A0t(i, str2);
    }

    public /* synthetic */ ChannelTosRunJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
