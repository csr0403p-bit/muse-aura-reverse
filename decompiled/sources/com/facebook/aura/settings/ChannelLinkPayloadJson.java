package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelLinkPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long agent_id;
    public final boolean is_paired;
    public final String message;
    public final boolean ok;
    public final String pairing_url;

    public final class Companion {
        public final C9hr<ChannelLinkPayloadJson> serializer() {
            return ChannelLinkPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelLinkPayloadJson channelLinkPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(channelLinkPayloadJson.pairing_url)) {
            c9j5.AAV(channelLinkPayloadJson.pairing_url, c9iZ, 0);
        }
        if (zAfR || channelLinkPayloadJson.is_paired) {
            c9j5.AA7(c9iZ, 1, channelLinkPayloadJson.is_paired);
        }
        if (zAfR || channelLinkPayloadJson.ok) {
            c9j5.AA7(c9iZ, 2, channelLinkPayloadJson.ok);
        }
        if (zAfR || !"".equals(channelLinkPayloadJson.message)) {
            c9j5.AAV(channelLinkPayloadJson.message, c9iZ, 3);
        }
        if (zAfR || channelLinkPayloadJson.agent_id != null) {
            c9j5.AAP(channelLinkPayloadJson.agent_id, C9j1.A00, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelLinkPayloadJson) {
                ChannelLinkPayloadJson channelLinkPayloadJson = (ChannelLinkPayloadJson) obj;
                if (!C7384Etj.areEqual(this.pairing_url, channelLinkPayloadJson.pairing_url) || this.is_paired != channelLinkPayloadJson.is_paired || this.ok != channelLinkPayloadJson.ok || !C7384Etj.areEqual(this.message, channelLinkPayloadJson.message) || !C7384Etj.areEqual(this.agent_id, channelLinkPayloadJson.agent_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelLinkPayloadJson copy$default(ChannelLinkPayloadJson channelLinkPayloadJson, String str, boolean z, boolean z2, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelLinkPayloadJson.pairing_url;
        }
        if ((i & 2) != 0) {
            z = channelLinkPayloadJson.is_paired;
        }
        if ((i & 4) != 0) {
            z2 = channelLinkPayloadJson.ok;
        }
        if ((i & 8) != 0) {
            str2 = channelLinkPayloadJson.message;
        }
        if ((i & 16) != 0) {
            l = channelLinkPayloadJson.agent_id;
        }
        return channelLinkPayloadJson.copy(str, z, z2, str2, l);
    }

    public final String component1() {
        return this.pairing_url;
    }

    public final boolean component2() {
        return this.is_paired;
    }

    public final boolean component3() {
        return this.ok;
    }

    public final String component4() {
        return this.message;
    }

    public final Long component5() {
        return this.agent_id;
    }

    public final Long getAgent_id() {
        return this.agent_id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getPairing_url() {
        return this.pairing_url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.message, C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.pairing_url), this.is_paired), this.ok)) + AnonymousClass006.A0D(this.agent_id);
    }

    public final boolean is_paired() {
        return this.is_paired;
    }

    public /* synthetic */ ChannelLinkPayloadJson(int i, String str, boolean z, boolean z2, String str2, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.pairing_url = "";
        } else {
            this.pairing_url = str;
        }
        if ((i & 2) == 0) {
            this.is_paired = false;
        } else {
            this.is_paired = z;
        }
        if ((i & 4) == 0) {
            this.ok = false;
        } else {
            this.ok = z2;
        }
        if ((i & 8) == 0) {
            this.message = "";
        } else {
            this.message = str2;
        }
        if ((i & 16) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = l;
        }
    }

    public final ChannelLinkPayloadJson copy(String str, boolean z, boolean z2, String str2, Long l) {
        AnonymousClass003.A0w(str, str2);
        return new ChannelLinkPayloadJson(str, z, z2, str2, l);
    }

    public String toString() {
        return super.toString();
    }

    public ChannelLinkPayloadJson(String str, boolean z, boolean z2, String str2, Long l) {
        AnonymousClass003.A0w(str, str2);
        this.pairing_url = str;
        this.is_paired = z;
        this.ok = z2;
        this.message = str2;
        this.agent_id = l;
    }

    public /* synthetic */ ChannelLinkPayloadJson(String str, boolean z, boolean z2, String str2, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : l);
    }

    public ChannelLinkPayloadJson() {
        this("", false, false, "", null);
    }
}
