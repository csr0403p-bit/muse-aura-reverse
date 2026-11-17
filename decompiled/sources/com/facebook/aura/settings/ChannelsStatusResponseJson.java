package com.facebook.aura.settings;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9jH;
import X.F0C;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelsStatusResponseJson extends C06G {
    public static final int $stable = 0;
    public final List<ChannelJson> channels;
    public final boolean ok;
    public final ChannelsPayloadJson payload;
    public final ChannelsPayloadJson result;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, ChannelsStatusResponseJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ChannelsStatusResponseJson> serializer() {
            return ChannelsStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ChannelsStatusResponseJson() {
        this(false, null, null, C0881AGi.A00);
    }

    public final ChannelsStatusResponseJson copy(boolean z, ChannelsPayloadJson channelsPayloadJson, ChannelsPayloadJson channelsPayloadJson2, List<ChannelJson> list) {
        C7384Etj.A0Y(list, 3);
        return new ChannelsStatusResponseJson(z, channelsPayloadJson, channelsPayloadJson2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelsStatusResponseJson) {
                ChannelsStatusResponseJson channelsStatusResponseJson = (ChannelsStatusResponseJson) obj;
                if (this.ok != channelsStatusResponseJson.ok || !C7384Etj.areEqual(this.result, channelsStatusResponseJson.result) || !C7384Etj.areEqual(this.payload, channelsStatusResponseJson.payload) || !C7384Etj.areEqual(this.channels, channelsStatusResponseJson.channels)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ChannelsStatusResponseJson copy$default(ChannelsStatusResponseJson channelsStatusResponseJson, boolean z, ChannelsPayloadJson channelsPayloadJson, ChannelsPayloadJson channelsPayloadJson2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = channelsStatusResponseJson.ok;
        }
        if ((i & 2) != 0) {
            channelsPayloadJson = channelsStatusResponseJson.result;
        }
        if ((i & 4) != 0) {
            channelsPayloadJson2 = channelsStatusResponseJson.payload;
        }
        if ((i & 8) != 0) {
            list = channelsStatusResponseJson.channels;
        }
        C7384Etj.A0Y(list, 3);
        return new ChannelsStatusResponseJson(z, channelsPayloadJson, channelsPayloadJson2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(ChannelsStatusResponseJson channelsStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || channelsStatusResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, channelsStatusResponseJson.ok);
        }
        if (zAfR || channelsStatusResponseJson.result != null) {
            c9j5.AAP(channelsStatusResponseJson.result, ChannelsPayloadJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || channelsStatusResponseJson.payload != null) {
            c9j5.AAP(channelsStatusResponseJson.payload, ChannelsPayloadJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(channelsStatusResponseJson.channels)) {
            c9j5.AAQ(channelsStatusResponseJson.channels, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final boolean component1() {
        return this.ok;
    }

    public final ChannelsPayloadJson component2() {
        return this.result;
    }

    public final ChannelsPayloadJson component3() {
        return this.payload;
    }

    public final List<ChannelJson> component4() {
        return this.channels;
    }

    public final List<ChannelJson> getChannels() {
        return this.channels;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final ChannelsPayloadJson getPayload() {
        return this.payload;
    }

    public final ChannelsPayloadJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.channels, (((C0KA.A02(this.ok) + AnonymousClass006.A0D(this.result)) * 31) + C3cH.A02(this.payload)) * 31);
    }

    public final Map<String, Boolean> toDomain() {
        List<ChannelJson> list;
        if (!this.ok) {
            return C9jH.A00;
        }
        ChannelsPayloadJson channelsPayloadJson = this.result;
        if (channelsPayloadJson == null || (list = channelsPayloadJson.channels) == null) {
            ChannelsPayloadJson channelsPayloadJson2 = this.payload;
            list = channelsPayloadJson2 != null ? channelsPayloadJson2.channels : this.channels;
        }
        ArrayList<ChannelJson> arrayListA0h = C3cG.A0h();
        for (ChannelJson channelJson : list) {
            if (channelJson.provider.length() > 0) {
                arrayListA0h.add(channelJson);
            }
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0h));
        for (ChannelJson channelJson2 : arrayListA0h) {
            linkedHashMapA15.put(channelJson2.provider, Boolean.valueOf(channelJson2.linked));
        }
        return linkedHashMapA15;
    }

    public String toString() {
        return super.toString();
    }

    public ChannelsStatusResponseJson(boolean z, ChannelsPayloadJson channelsPayloadJson, ChannelsPayloadJson channelsPayloadJson2, List<ChannelJson> list) {
        C7384Etj.A0Y(list, 3);
        this.ok = z;
        this.result = channelsPayloadJson;
        this.payload = channelsPayloadJson2;
        this.channels = list;
    }

    public /* synthetic */ ChannelsStatusResponseJson(boolean z, ChannelsPayloadJson channelsPayloadJson, ChannelsPayloadJson channelsPayloadJson2, List list, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : channelsPayloadJson, (i & 4) != 0 ? null : channelsPayloadJson2, (i & 8) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ ChannelsStatusResponseJson(int i, boolean z, ChannelsPayloadJson channelsPayloadJson, ChannelsPayloadJson channelsPayloadJson2, List list, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = channelsPayloadJson;
        }
        if ((i & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = channelsPayloadJson2;
        }
        if ((i & 8) == 0) {
            this.channels = C0881AGi.A00;
        } else {
            this.channels = list;
        }
    }
}
