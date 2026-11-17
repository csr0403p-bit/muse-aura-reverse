package com.facebook.aura.settings;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelLinkOuterJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long agent_id;
    public final boolean is_paired;
    public final String message;
    public final boolean ok;
    public final String pairing_url;
    public final ChannelLinkPayloadJson result;

    public final class Companion {
        public final C9hr<ChannelLinkOuterJson> serializer() {
            return ChannelLinkOuterJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelLinkOuterJson channelLinkOuterJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || channelLinkOuterJson.result != null) {
            c9j5.AAP(channelLinkOuterJson.result, ChannelLinkPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !"".equals(channelLinkOuterJson.pairing_url)) {
            c9j5.AAV(channelLinkOuterJson.pairing_url, c9iZ, 1);
        }
        if (zAfR || channelLinkOuterJson.is_paired) {
            c9j5.AA7(c9iZ, 2, channelLinkOuterJson.is_paired);
        }
        if (zAfR || channelLinkOuterJson.ok) {
            c9j5.AA7(c9iZ, 3, channelLinkOuterJson.ok);
        }
        if (zAfR || !"".equals(channelLinkOuterJson.message)) {
            c9j5.AAV(channelLinkOuterJson.message, c9iZ, 4);
        }
        if (zAfR || channelLinkOuterJson.agent_id != null) {
            c9j5.AAP(channelLinkOuterJson.agent_id, C9j1.A00, c9iZ, 5);
        }
    }

    public final ChannelLinkOuterJson copy(ChannelLinkPayloadJson channelLinkPayloadJson, String str, boolean z, boolean z2, String str2, Long l) {
        AnonymousClass002.A1C(str, 1, str2);
        return new ChannelLinkOuterJson(channelLinkPayloadJson, str, z, z2, str2, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelLinkOuterJson) {
                ChannelLinkOuterJson channelLinkOuterJson = (ChannelLinkOuterJson) obj;
                if (!C7384Etj.areEqual(this.result, channelLinkOuterJson.result) || !C7384Etj.areEqual(this.pairing_url, channelLinkOuterJson.pairing_url) || this.is_paired != channelLinkOuterJson.is_paired || this.ok != channelLinkOuterJson.ok || !C7384Etj.areEqual(this.message, channelLinkOuterJson.message) || !C7384Etj.areEqual(this.agent_id, channelLinkOuterJson.agent_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelLinkOuterJson copy$default(ChannelLinkOuterJson channelLinkOuterJson, ChannelLinkPayloadJson channelLinkPayloadJson, String str, boolean z, boolean z2, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            channelLinkPayloadJson = channelLinkOuterJson.result;
        }
        if ((i & 2) != 0) {
            str = channelLinkOuterJson.pairing_url;
        }
        if ((i & 4) != 0) {
            z = channelLinkOuterJson.is_paired;
        }
        if ((i & 8) != 0) {
            z2 = channelLinkOuterJson.ok;
        }
        if ((i & 16) != 0) {
            str2 = channelLinkOuterJson.message;
        }
        if ((i & 32) != 0) {
            l = channelLinkOuterJson.agent_id;
        }
        return channelLinkOuterJson.copy(channelLinkPayloadJson, str, z, z2, str2, l);
    }

    public final ChannelLinkPayloadJson component1() {
        return this.result;
    }

    public final String component2() {
        return this.pairing_url;
    }

    public final boolean component3() {
        return this.is_paired;
    }

    public final boolean component4() {
        return this.ok;
    }

    public final String component5() {
        return this.message;
    }

    public final Long component6() {
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

    public final ChannelLinkPayloadJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.message, C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.pairing_url, AnonymousClass006.A0D(this.result) * 31), this.is_paired), this.ok)) + C3cH.A02(this.agent_id);
    }

    public final boolean is_paired() {
        return this.is_paired;
    }

    public final ChannelLinkPayloadJson toInnerFromOuter() {
        String str = this.pairing_url;
        if (str.length() == 0 && !this.is_paired && !this.ok && this.message.length() == 0 && this.agent_id == null) {
            return null;
        }
        return new ChannelLinkPayloadJson(str, this.is_paired, this.ok, this.message, this.agent_id);
    }

    public /* synthetic */ ChannelLinkOuterJson(int i, ChannelLinkPayloadJson channelLinkPayloadJson, String str, boolean z, boolean z2, String str2, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = channelLinkPayloadJson;
        }
        if ((i & 2) == 0) {
            this.pairing_url = "";
        } else {
            this.pairing_url = str;
        }
        if ((i & 4) == 0) {
            this.is_paired = false;
        } else {
            this.is_paired = z;
        }
        if ((i & 8) == 0) {
            this.ok = false;
        } else {
            this.ok = z2;
        }
        if ((i & 16) == 0) {
            this.message = "";
        } else {
            this.message = str2;
        }
        if ((i & 32) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = l;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ChannelLinkOuterJson(ChannelLinkPayloadJson channelLinkPayloadJson, String str, boolean z, boolean z2, String str2, Long l) {
        AnonymousClass002.A1C(str, 1, str2);
        this.result = channelLinkPayloadJson;
        this.pairing_url = str;
        this.is_paired = z;
        this.ok = z2;
        this.message = str2;
        this.agent_id = l;
    }

    public /* synthetic */ ChannelLinkOuterJson(ChannelLinkPayloadJson channelLinkPayloadJson, String str, boolean z, boolean z2, String str2, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : channelLinkPayloadJson, (i & 2) != 0 ? "" : str, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : l);
    }

    public ChannelLinkOuterJson() {
        this(null, "", false, false, "", null);
    }
}
