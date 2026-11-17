package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass005;
import X.C06H;
import X.C8j3;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public abstract class VoyagerAsrJsonKt {
    public static final String encodeVoyagerAsrHandshake(String str, String str2, VoyagerAsrAudioEncoding voyagerAsrAudioEncoding, VoyagerAsrMode voyagerAsrMode, List<String> list) {
        List<String> list2 = list;
        AnonymousClass005.A17(str, str2, voyagerAsrAudioEncoding, voyagerAsrMode, list);
        C9sU c9sU = HatchJsonKt.HatchJson;
        String wireValue = voyagerAsrMode.getWireValue();
        VoyagerAsrAuthorizationJson voyagerAsrAuthorizationJson = new VoyagerAsrAuthorizationJson(str);
        String wireValue2 = voyagerAsrAudioEncoding.getWireValue();
        if (list.isEmpty()) {
            list2 = null;
        }
        return c9sU.A02(new VoyagerAsrHandshakeJson(wireValue, voyagerAsrAuthorizationJson, wireValue2, str2, list2), VoyagerAsrHandshakeJson$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String encodeVoyagerAsrEndStream() {
        return HatchJsonKt.HatchJson.A02(new VoyagerAsrEndStreamJson((JsonObject) null, 1, (C06H) (0 == true ? 1 : 0)), VoyagerAsrEndStreamJson$$serializer.INSTANCE);
    }

    public static final VoyagerAsrMessageJson decodeVoyagerAsrMessage(String str) {
        return (VoyagerAsrMessageJson) C8j3.A1G(str).A00(str, VoyagerAsrMessageJson$$serializer.INSTANCE);
    }
}
