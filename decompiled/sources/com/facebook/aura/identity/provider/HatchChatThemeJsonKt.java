package com.facebook.aura.identity.provider;

import X.B6A;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9sU;
import X.F0C;
import X.FGI;
import android.graphics.Color;
import com.facebook.aura.json.HatchEnvelope;
import com.facebook.aura.json.HatchEnvelope$$serializer;
import com.facebook.aura.json.HatchJsonKt;

/* loaded from: classes2.dex */
public abstract class HatchChatThemeJsonKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final HatchChatThemesPayload parseChatThemesResponse(String str) {
        HatchChatThemesPayload domain;
        C7384Etj.A0Y(str, 0);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            C9iZ c9iZ = HatchEnvelope.$cachedDescriptor;
            F0C<C9hr<Object>>[] f0cArr = HatchChatThemesResponseJson.$childSerializers;
            HatchChatThemesResponseJson$$serializer hatchChatThemesResponseJson$$serializer = HatchChatThemesResponseJson$$serializer.INSTANCE;
            C7384Etj.A0Y(hatchChatThemesResponseJson$$serializer, 0);
            HatchChatThemesResponseJson hatchChatThemesResponseJson = (HatchChatThemesResponseJson) ((HatchEnvelope) c9sU.A00(str, new HatchEnvelope$$serializer(hatchChatThemesResponseJson$$serializer))).result;
            return (hatchChatThemesResponseJson == null || (domain = hatchChatThemesResponseJson.toDomain()) == null) ? ((HatchChatThemesResponseJson) c9sU.A00(str, hatchChatThemesResponseJson$$serializer)).toDomain() : domain;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String serializeChatThemesCache(HatchChatThemesResponseJson hatchChatThemesResponseJson) {
        C7384Etj.A0Y(hatchChatThemesResponseJson, 0);
        C9sU c9sU = HatchJsonKt.HatchJson;
        F0C<C9hr<Object>>[] f0cArr = HatchChatThemesResponseJson.$childSerializers;
        return c9sU.A02(hatchChatThemesResponseJson, HatchChatThemesResponseJson$$serializer.INSTANCE);
    }

    public static final B6A colorFromHexString(String str) {
        String string = C7BY.A0F(str).toString();
        C7384Etj.A0Y(string, 0);
        if (!string.startsWith("#")) {
            string = FGI.A0M("#", string);
        }
        int length = string.length();
        if (length != 7 && length != 9) {
            return null;
        }
        try {
            return new B6A(Color.parseColor(string) << 32);
        } catch (Exception unused) {
            return null;
        }
    }
}
