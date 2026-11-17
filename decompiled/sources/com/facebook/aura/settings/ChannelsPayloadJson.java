package com.facebook.aura.settings;

import X.AbstractC5321DgF;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelsPayloadJson extends C06G {
    public static final int $stable = 8;
    public final List<ChannelJson> channels;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ChannelsPayloadJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ChannelsPayloadJson> serializer() {
            return ChannelsPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ChannelsPayloadJson copy(List<ChannelJson> list) {
        C7384Etj.A0Y(list, 0);
        return new ChannelsPayloadJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ChannelsPayloadJson) && C7384Etj.areEqual(this.channels, ((ChannelsPayloadJson) obj).channels));
    }

    public static /* synthetic */ ChannelsPayloadJson copy$default(ChannelsPayloadJson channelsPayloadJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = channelsPayloadJson.channels;
        }
        C7384Etj.A0Y(list, 0);
        return new ChannelsPayloadJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelsPayloadJson channelsPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(channelsPayloadJson.channels)) {
            c9j5.AAQ(channelsPayloadJson.channels, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<ChannelJson> component1() {
        return this.channels;
    }

    public final List<ChannelJson> detailedChannels() {
        List<ChannelJson> list = this.channels;
        ArrayList arrayListA0h = C3cG.A0h();
        for (ChannelJson channelJson : list) {
            if (channelJson.provider.length() > 0) {
                arrayListA0h.add(channelJson);
            }
        }
        return arrayListA0h;
    }

    public final List<ChannelJson> getChannels() {
        return this.channels;
    }

    public int hashCode() {
        return this.channels.hashCode();
    }

    public /* synthetic */ ChannelsPayloadJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.channels = C0881AGi.A00;
        } else {
            this.channels = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ChannelsPayloadJson(List<ChannelJson> list) {
        C7384Etj.A0Y(list, 0);
        this.channels = list;
    }

    public /* synthetic */ ChannelsPayloadJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public ChannelsPayloadJson() {
        this(C0881AGi.A00);
    }
}
