package com.facebook.flexiblesampling;

import X.AnonymousClass005;
import X.C06H;
import X.C3341CFl;
import X.C7384Etj;
import X.C7bS;
import X.FGI;
import X.InterfaceC3325CEq;
import android.content.Context;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class QPLSupportedSamplingPolicyConfig extends DefaultSamplingPolicyConfig_DONOTUSE {
    public static final String PERF_EVENT_NAME = "perf";
    public static final String SEPERATOR = ":";
    public final InterfaceC3325CEq customQPLConfig;

    public QPLSupportedSamplingPolicyConfig(Context context) {
        C7384Etj.A0Y(context, 0);
        this.customQPLConfig = null;
    }

    @Override // com.facebook.flexiblesampling.DefaultSamplingPolicyConfig_DONOTUSE, com.facebook.flexiblesampling.BaseSamplingPolicyConfig
    public void provideConfigVersions(C3341CFl c3341CFl) {
        C7384Etj.A0Y(c3341CFl, 0);
        super.provideConfigVersions(c3341CFl);
    }

    @Override // com.facebook.flexiblesampling.DefaultSamplingPolicyConfig_DONOTUSE
    public void updateItem(JsonReader jsonReader, C7bS c7bS, String str) throws IOException {
        AnonymousClass005.A0x(jsonReader, c7bS, str);
        if (!PERF_EVENT_NAME.equals(str)) {
            super.updateItem(jsonReader, c7bS, str);
            return;
        }
        jsonReader.beginObject();
        while (true) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            JsonToken jsonToken = JsonToken.NAME;
            if (jsonTokenPeek != jsonToken) {
                jsonReader.endObject();
                return;
            }
            String strNextName = jsonReader.nextName();
            if ("*".equals(strNextName)) {
                c7bS.AYo(str, jsonReader.nextInt());
            } else {
                jsonReader.beginObject();
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strA0U = FGI.A0U(str, ":", strNextName);
                    if (jsonReader.peek() == jsonToken) {
                        String strNextName2 = jsonReader.nextName();
                        int iNextInt = jsonReader.nextInt();
                        if (!"*".equals(strNextName2)) {
                            strA0U = FGI.A0U(strA0U, ":", strNextName2);
                        }
                        c7bS.AYo(strA0U, iNextInt);
                    }
                }
                jsonReader.endObject();
            }
        }
    }

    public QPLSupportedSamplingPolicyConfig(Context context, InterfaceC3325CEq interfaceC3325CEq) {
        C7384Etj.A0Y(context, 0);
        this.customQPLConfig = interfaceC3325CEq;
    }

    public /* synthetic */ QPLSupportedSamplingPolicyConfig(Context context, InterfaceC3325CEq interfaceC3325CEq, int i, C06H c06h) {
        this(context, (i & 2) != 0 ? null : interfaceC3325CEq);
    }
}
