package com.facebook.aura.settings;

import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9jH;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class HatchChannelsJsonKt {
    public static final ChannelLinkResult parseChannelLinkResponse(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (ChannelLinkResponseJson) HatchJsonKt.HatchJson.A00(str, ChannelLinkResponseJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ChannelLinkResponseJson channelLinkResponseJson = (ChannelLinkResponseJson) objA0s;
        if (channelLinkResponseJson != null) {
            return channelLinkResponseJson.toDomain();
        }
        return null;
    }

    public static final Map<String, Boolean> parseChannelStatuses(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = ChannelsStatusResponseJson.$stable;
            objA0s = (ChannelsStatusResponseJson) c9sU.A00(str, ChannelsStatusResponseJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ChannelsStatusResponseJson channelsStatusResponseJson = (ChannelsStatusResponseJson) objA0s;
        Map<String, Boolean> domain = channelsStatusResponseJson != null ? channelsStatusResponseJson.toDomain() : null;
        return domain == null ? C9jH.A00 : domain;
    }

    public static final ChannelLinkResult toDomain(ChannelLinkOuterJson channelLinkOuterJson) {
        C7384Etj.A0Y(channelLinkOuterJson, 0);
        ChannelLinkPayloadJson innerFromOuter = channelLinkOuterJson.result;
        if (innerFromOuter == null && (innerFromOuter = channelLinkOuterJson.toInnerFromOuter()) == null) {
            return null;
        }
        String str = innerFromOuter.pairing_url;
        String str2 = null;
        if (str.length() > 0) {
            str2 = str;
        }
        boolean z = innerFromOuter.is_paired;
        boolean z2 = innerFromOuter.ok;
        String str3 = innerFromOuter.message;
        String str4 = null;
        if (str3.length() > 0) {
            str4 = str3;
        }
        Long l = innerFromOuter.agent_id;
        return new ChannelLinkResult(str2, z, z2, str4, (l == null && (l = channelLinkOuterJson.agent_id) == null) ? null : String.valueOf(l.longValue()));
    }
}
