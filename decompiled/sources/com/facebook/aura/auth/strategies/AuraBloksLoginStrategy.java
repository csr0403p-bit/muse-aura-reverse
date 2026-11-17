package com.facebook.aura.auth.strategies;

import X.AbstractC3358CGz;
import X.AbstractC4038Ckf;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3351CGh;
import X.C4018Cjz;
import X.C4023CkC;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.CFK;
import X.CGe;
import X.CGg;
import X.CGs;
import X.InterfaceC3352CGi;
import X.InterfaceC3355CGq;
import X.InterfaceC4036Ckc;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AuraBloksLoginStrategy {
    public final String deviceId;
    public final String tierOverride;

    public AuraBloksLoginStrategy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.deviceId = str;
        this.tierOverride = str2;
    }

    public void performUserPassAuthRequest(AbstractC4038Ckf abstractC4038Ckf, InterfaceC4036Ckc interfaceC4036Ckc, C4oT c4oT, final InterfaceC3355CGq interfaceC3355CGq, Map<String, String> map) {
        AnonymousClass005.A12(interfaceC4036Ckc, interfaceC3355CGq, map, 1);
        String strA0p = C60O.A0p(AuraBloksLoginStrategyKt.FRL_ACCESS_TOKEN_KEY, map);
        if (strA0p == null) {
            CGs.A0y(null, C79.A03, interfaceC3355CGq);
            return;
        }
        String str = this.tierOverride;
        if (str == null) {
            str = "ar";
        }
        C4023CkC c4023CkCARE = interfaceC4036Ckc.ARE(HatchStartupPoints.SURFACE_LOGIN, str, HatchStartupPoints.SURFACE_LOGIN, "POST");
        c4023CkCARE.A00(AuraBloksLoginStrategyKt.FRL_ACCESS_TOKEN_KEY, strA0p);
        c4023CkCARE.A00(AuraBloksLoginStrategyKt.LOGGING_SESSION_ID_KEY, AuraLoginSessionId.INSTANCE.getSessionId(false));
        c4023CkCARE.A00("format", "json");
        c4023CkCARE.A00("device_id", this.deviceId);
        c4023CkCARE.A00("generate_session_cookies", "1");
        c4023CkCARE.A00("generate_analytics_claim", "1");
        CGg cGg = new CGg() { // from class: com.facebook.aura.auth.strategies.AuraBloksLoginStrategy.performUserPassAuthRequest.1
            @Override // X.CGg
            public void onFailure(IOException iOException) {
                C7384Etj.A0Y(iOException, 0);
                CFK.A08(AuraBloksLoginStrategyKt.TAG, "onFailure()", iOException);
                CGs.A0y(iOException, C79.A00, interfaceC3355CGq);
            }

            @Override // X.CGg
            public void onSuccess(InterfaceC3352CGi interfaceC3352CGi) throws IOException {
                String strNextString;
                String strNextString2;
                C7384Etj.A0Y(interfaceC3352CGi, 0);
                CFK.A05(AuraBloksLoginStrategyKt.TAG, "onSuccess()");
                InputStream inputStream = ((C3351CGh) interfaceC3352CGi).A00.A01;
                try {
                    try {
                        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, HatchWebPageParserKt.UTF_8));
                        jsonReader.beginObject();
                        strNextString = null;
                        strNextString2 = null;
                        while (jsonReader.hasNext() && jsonReader.peek() != JsonToken.END_OBJECT) {
                            String strNextName = jsonReader.nextName();
                            if (NodeCommandFallbackWorker.KEY_USER_ID.equals(strNextName)) {
                                strNextString = jsonReader.nextString();
                            } else if (NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM.equals(strNextName)) {
                                strNextString2 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    } catch (IOException e) {
                        onFailure(e);
                    }
                    if (strNextString == null || strNextString.length() == 0 || strNextString2 == null || strNextString2.length() == 0) {
                        throw BV4.A0K("Missing user_id or access_token in auth response");
                    }
                    interfaceC3355CGq.ARt(AbstractC3358CGz.A00(AnonymousClass001.A0i(), strNextString, strNextString2, "", "", "", null, null, null));
                } finally {
                    inputStream.close();
                }
            }
        };
        C4018Cjz c4018Cjz = c4023CkCARE.A00;
        c4018Cjz.A03.A00.A00 = new CGe(cGg, c4023CkCARE);
        c4018Cjz.A00();
    }

    public /* synthetic */ AuraBloksLoginStrategy(String str, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
