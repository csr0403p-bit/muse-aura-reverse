package com.facebook.flexiblesampling;

import X.AnonymousClass005;
import X.BV4;
import X.BV7;
import X.BzK;
import X.C3341CFl;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7bS;
import X.C7cU;
import X.CEp;
import X.CFK;
import X.InterfaceC4071ClJ;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "")
/* loaded from: classes5.dex */
public abstract class DefaultSamplingPolicyConfig_DONOTUSE extends DebuggableSamplingPolicyConfig {
    public static final String ASTERISK_CHARACTER = "*";
    public static final String BLACKLIST_JSON_KEY = "blacklist";
    public static final String CHECKSUM_JSON_KEY = "checksum";
    public static final String CONFIG_JSON_KEY = "config";
    public static final String INVALID_CHECKSUM = "";
    public static final String SAMPLING_CONFIG_VERSION = "v2";
    public static final String TAG = "DefaultSamplingPolicyConfig_DONOTUSE";
    public static final String UNCHANGED_CHECKSUM = "";

    @Override // com.facebook.flexiblesampling.DebuggableSamplingPolicyConfig
    public int add(String str, int i) {
        C7384Etj.A0Y(str, 0);
        C4oT c4oTA0f = BV7.A0f(this);
        int i2 = c4oTA0f.getInt(str, -1);
        int i3 = i2 != -1 ? i2 : -1;
        BzK bzKA02 = BzK.A02(c4oTA0f);
        bzKA02.AYo(str, i);
        bzKA02.A0B(0);
        return i3;
    }

    @Override // com.facebook.flexiblesampling.DebuggableSamplingPolicyConfig
    public void blacklist(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA02 = BzK.A02(BV7.A0f(this));
        bzKA02.AYo(str, -1);
        bzKA02.A0B(0);
    }

    public final C4oT getSharedPrefs(C7cU c7cU) {
        C7384Etj.A0Y(c7cU, 0);
        return c7cU.A00("analytics_sampling_policy");
    }

    public abstract C7cU getSharedPrefsFactory();

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig
    public void provideConfigVersions(C3341CFl c3341CFl) {
        C7384Etj.A0Y(c3341CFl, 0);
        C3341CFl.A00(c3341CFl, "v2", "config_version");
    }

    @Override // com.facebook.flexiblesampling.DebuggableSamplingPolicyConfig
    public boolean remove(String str) {
        C7384Etj.A0Y(str, 0);
        C4oT c4oTA0f = BV7.A0f(this);
        if (!c4oTA0f.contains(str)) {
            return false;
        }
        BzK bzKA02 = BzK.A02(c4oTA0f);
        bzKA02.Aae(str);
        bzKA02.A0B(0);
        return true;
    }

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig, com.facebook.flexiblesampling.SamplingPolicyConfig
    public void updatePolicyFromServer(InputStream inputStream, InterfaceC4071ClJ interfaceC4071ClJ) throws IOException {
        C7384Etj.A0Y(inputStream, 0);
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        jsonReader.beginObject();
        BzK bzKA02 = BzK.A02(BV7.A0f(this));
        bzKA02.A08();
        String strProcess = process(jsonReader, bzKA02, true);
        if ("".equals(strProcess)) {
            return;
        }
        bzKA02.AYr("_checksum", strProcess);
        process(jsonReader, bzKA02, false);
        bzKA02.A0B(0);
    }

    private final void updateConfig(String str, C7bS c7bS) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(BV4.A0E(str.getBytes(C7384Etj.A0M("UTF8")))));
        if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
            c7bS.AYr("_checksum", "");
            CFK.A0I(TAG, "Expected sampling config BEGIN_OBJECT but got config with value = %s", str);
        } else {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (BLACKLIST_JSON_KEY.equals(strNextName)) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c7bS.AYo(jsonReader.nextString(), -1);
                    }
                    jsonReader.endArray();
                } else {
                    C7384Etj.A0X(strNextName);
                    updateItem(jsonReader, c7bS, strNextName);
                }
            }
        }
        jsonReader.close();
    }

    private final String process(JsonReader jsonReader, C7bS c7bS, boolean z) throws IOException {
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (z && CHECKSUM_JSON_KEY.equals(strNextName)) {
                return jsonReader.nextString();
            }
            if ("config".equals(strNextName)) {
                String strNextString = jsonReader.nextString();
                C7384Etj.A0U(strNextString);
                updateConfig(strNextString, c7bS);
            } else {
                jsonReader.skipValue();
            }
        }
        if (z) {
            throw new SamplingParseException("JSON config is missing checksum.");
        }
        return null;
    }

    @Override // com.facebook.flexiblesampling.DebuggableSamplingPolicyConfig
    public void clear() {
        BzK bzKA02 = BzK.A02(BV7.A0f(this));
        bzKA02.A08();
        bzKA02.A0B(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.HashMap] */
    @Override // com.facebook.flexiblesampling.DebuggableSamplingPolicyConfig
    public List<CEp> getEventList() {
        C4oT c4oTA0f = BV7.A0f(this);
        String[] strArr = (String[]) c4oTA0f.ACL().keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        ArrayList arrayListA11 = C60O.A11(strArr.length);
        for (String str : strArr) {
            if (!"_checksum".equals(str)) {
                c4oTA0f.getInt(str, 0);
                C7384Etj.A0Y(str, 0);
                arrayListA11.add(new CEp());
            }
        }
        return arrayListA11;
    }

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig, com.facebook.flexiblesampling.SamplingPolicyConfig
    public void invalidateChecksum() {
        BzK bzKA02 = BzK.A02(BV7.A0f(this));
        bzKA02.AYr("_checksum", "");
        bzKA02.A0B(0);
    }

    @Override // com.facebook.flexiblesampling.BaseSamplingPolicyConfig
    public String provideConfigChecksum() {
        String string = BV7.A0f(this).getString("_checksum", "");
        C7384Etj.A0U(string);
        return string;
    }

    public void updateItem(JsonReader jsonReader, C7bS c7bS, String str) throws IOException {
        AnonymousClass005.A0x(jsonReader, c7bS, str);
        if (jsonReader.peek() == JsonToken.NUMBER) {
            c7bS.AYo(str, jsonReader.nextInt());
            return;
        }
        jsonReader.beginObject();
        if (jsonReader.peek() == JsonToken.NAME && "*".equals(jsonReader.nextName())) {
            c7bS.AYo(str, jsonReader.nextInt());
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
    }
}
