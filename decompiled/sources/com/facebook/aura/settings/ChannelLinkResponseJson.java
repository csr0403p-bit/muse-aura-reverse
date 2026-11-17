package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelLinkResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean ok;
    public final ChannelLinkOuterJson result;

    public final class Companion {
        public final C9hr<ChannelLinkResponseJson> serializer() {
            return ChannelLinkResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelLinkResponseJson channelLinkResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || channelLinkResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, channelLinkResponseJson.ok);
        }
        if (zAfR || channelLinkResponseJson.result != null) {
            c9j5.AAP(channelLinkResponseJson.result, ChannelLinkOuterJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelLinkResponseJson) {
                ChannelLinkResponseJson channelLinkResponseJson = (ChannelLinkResponseJson) obj;
                if (this.ok != channelLinkResponseJson.ok || !C7384Etj.areEqual(this.result, channelLinkResponseJson.result)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelLinkResponseJson copy$default(ChannelLinkResponseJson channelLinkResponseJson, boolean z, ChannelLinkOuterJson channelLinkOuterJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = channelLinkResponseJson.ok;
        }
        if ((i & 2) != 0) {
            channelLinkOuterJson = channelLinkResponseJson.result;
        }
        return new ChannelLinkResponseJson(z, channelLinkOuterJson);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final ChannelLinkOuterJson component2() {
        return this.result;
    }

    public final ChannelLinkResponseJson copy(boolean z, ChannelLinkOuterJson channelLinkOuterJson) {
        return new ChannelLinkResponseJson(z, channelLinkOuterJson);
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final ChannelLinkOuterJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return C0KA.A02(this.ok) + AnonymousClass006.A0D(this.result);
    }

    public final ChannelLinkResult toDomain() {
        ChannelLinkOuterJson channelLinkOuterJson;
        if (!this.ok || (channelLinkOuterJson = this.result) == null) {
            return null;
        }
        return HatchChannelsJsonKt.toDomain(channelLinkOuterJson);
    }

    public ChannelLinkResponseJson(boolean z, ChannelLinkOuterJson channelLinkOuterJson) {
        this.ok = z;
        this.result = channelLinkOuterJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ChannelLinkResponseJson(int i, boolean z, ChannelLinkOuterJson channelLinkOuterJson, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = channelLinkOuterJson;
        }
    }

    public /* synthetic */ ChannelLinkResponseJson(boolean z, ChannelLinkOuterJson channelLinkOuterJson, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : channelLinkOuterJson);
    }

    public ChannelLinkResponseJson() {
        this(false, null);
    }
}
