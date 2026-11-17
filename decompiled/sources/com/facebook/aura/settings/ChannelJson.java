package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String agent_id;
    public final String attention_reason;
    public final String bot_username;
    public final boolean linked;
    public final String next_action;
    public final String provider;
    public final String status;

    public final class Companion {
        public final C9hr<ChannelJson> serializer() {
            return ChannelJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ChannelJson(String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        this.provider = str;
        this.linked = z;
        this.status = str2;
        this.next_action = str3;
        this.bot_username = str4;
        this.agent_id = str5;
        this.attention_reason = str6;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelJson channelJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(channelJson.provider)) {
            c9j5.AAV(channelJson.provider, c9iZ, 0);
        }
        if (zAfR || channelJson.linked) {
            c9j5.AA7(c9iZ, 1, channelJson.linked);
        }
        if (zAfR || channelJson.status != null) {
            c9j5.AAP(channelJson.status, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || channelJson.next_action != null) {
            c9j5.AAP(channelJson.next_action, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || channelJson.bot_username != null) {
            c9j5.AAP(channelJson.bot_username, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || channelJson.agent_id != null) {
            c9j5.AAP(channelJson.agent_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || channelJson.attention_reason != null) {
            c9j5.AAP(channelJson.attention_reason, C07779iq.A01, c9iZ, 6);
        }
    }

    public final ChannelJson copy(String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        return new ChannelJson(str, z, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelJson) {
                ChannelJson channelJson = (ChannelJson) obj;
                if (!C7384Etj.areEqual(this.provider, channelJson.provider) || this.linked != channelJson.linked || !C7384Etj.areEqual(this.status, channelJson.status) || !C7384Etj.areEqual(this.next_action, channelJson.next_action) || !C7384Etj.areEqual(this.bot_username, channelJson.bot_username) || !C7384Etj.areEqual(this.agent_id, channelJson.agent_id) || !C7384Etj.areEqual(this.attention_reason, channelJson.attention_reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelJson copy$default(ChannelJson channelJson, String str, boolean z, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelJson.provider;
        }
        if ((i & 2) != 0) {
            z = channelJson.linked;
        }
        if ((i & 4) != 0) {
            str2 = channelJson.status;
        }
        if ((i & 8) != 0) {
            str3 = channelJson.next_action;
        }
        if ((i & 16) != 0) {
            str4 = channelJson.bot_username;
        }
        if ((i & 32) != 0) {
            str5 = channelJson.agent_id;
        }
        if ((i & 64) != 0) {
            str6 = channelJson.attention_reason;
        }
        return channelJson.copy(str, z, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.provider;
    }

    public final boolean component2() {
        return this.linked;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.next_action;
    }

    public final String component5() {
        return this.bot_username;
    }

    public final String component6() {
        return this.agent_id;
    }

    public final String component7() {
        return this.attention_reason;
    }

    public final String getAgent_id() {
        return this.agent_id;
    }

    public final String getAttention_reason() {
        return this.attention_reason;
    }

    public final String getBot_username() {
        return this.bot_username;
    }

    public final boolean getLinked() {
        return this.linked;
    }

    public final String getNext_action() {
        return this.next_action;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((((((((C0KA.A01(AnonymousClass001.A0G(this.provider), this.linked) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.next_action)) * 31) + AnonymousClass006.A0G(this.bot_username)) * 31) + AnonymousClass006.A0G(this.agent_id)) * 31) + AnonymousClass005.A0H(this.attention_reason);
    }

    public final boolean isChecking() {
        return "checking".equals(this.status);
    }

    public final boolean isUnlinked() {
        return "unlinked".equals(this.status);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean needsAttention() {
        /*
            r1 = this;
            java.lang.String r0 = r1.attention_reason
            if (r0 == 0) goto Lb
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ChannelJson.needsAttention():boolean");
    }

    public final boolean requiresUnlink() {
        return "unlink".equals(this.next_action);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChannelJson(String str, boolean z, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public /* synthetic */ ChannelJson(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        this.provider = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.linked = false;
        } else {
            this.linked = z;
        }
        if ((i & 4) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i & 8) == 0) {
            this.next_action = null;
        } else {
            this.next_action = str3;
        }
        if ((i & 16) == 0) {
            this.bot_username = null;
        } else {
            this.bot_username = str4;
        }
        if ((i & 32) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str5;
        }
        if ((i & 64) == 0) {
            this.attention_reason = null;
        } else {
            this.attention_reason = str6;
        }
    }

    public ChannelJson() {
        this("", false, null, null, null, null, null);
    }
}
