package com.facebook.aura.auth.strategies;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BzK;
import X.C06H;
import X.C3351CGh;
import X.C3357CGy;
import X.C4018Cjz;
import X.C4021Ck4;
import X.C4022Ck5;
import X.C4023CkC;
import X.C4030CkL;
import X.C4oT;
import X.C7384Etj;
import X.C79;
import X.CFK;
import X.CGe;
import X.CGg;
import X.CGs;
import X.Ck3;
import X.InterfaceC3352CGi;
import X.InterfaceC3355CGq;
import X.InterfaceC4036Ckc;
import X.InterfaceC4039Ckg;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.aura.network.crudonet.AuraCrudoNet;
import com.facebook.aura.network.endpoint.AuraEndpointSelector;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes5.dex */
public final class AuraSignOutStrategy {
    public final String tierOverride;

    public void performSignOutAuthRequest(final AbstractC3358CGz abstractC3358CGz, InterfaceC4036Ckc interfaceC4036Ckc, final C4oT c4oT, final InterfaceC3355CGq interfaceC3355CGq) {
        AnonymousClass005.A11(abstractC3358CGz, c4oT, interfaceC3355CGq, 0);
        CFK.A05(AuraSignOutStrategyKt.TAG, "onPerformSignOutAuthRequest()");
        C4022Ck5 c4022Ck5 = new C4022Ck5(new Ck3((C4021Ck4) C7384Etj.A0G(AuraCrudoNet.requestFactory$delegate), new InterfaceC4039Ckg() { // from class: com.facebook.aura.auth.strategies.AuraSignOutStrategy$performSignOutAuthRequest$fbRequestFactory$1
            @Override // X.InterfaceC4039Ckg
            public final String get() {
                return C3357CGy.A0z(abstractC3358CGz);
            }
        }, new AuraEndpointSelector()));
        String str = this.tierOverride;
        if (str == null) {
            str = "ar";
        }
        C4023CkC c4023CkCARE = c4022Ck5.ARE("logout", str, "logout", "POST");
        C4018Cjz c4018Cjz = c4023CkCARE.A00;
        C4030CkL c4030CkL = c4018Cjz.A03;
        c4030CkL.A02.A00("Content-Type", "application/json");
        c4030CkL.A00.A00 = new CGe(new CGg() { // from class: com.facebook.aura.auth.strategies.AuraSignOutStrategy.performSignOutAuthRequest.1
            @Override // X.CGg
            public void onFailure(IOException iOException) {
                C7384Etj.A0Y(iOException, 0);
                CFK.A05(AuraSignOutStrategyKt.TAG, AnonymousClass007.A0a("Logged out but session not killed on server. ", iOException));
                logoutComplete();
            }

            @Override // X.CGg
            public void onSuccess(InterfaceC3352CGi interfaceC3352CGi) {
                C7384Etj.A0Y(interfaceC3352CGi, 0);
                if (AnonymousClass002.A1b(readLogoutSuccessFlag(interfaceC3352CGi), true)) {
                    logoutComplete();
                } else {
                    CGs.A0y(null, C79.A00, interfaceC3355CGq);
                }
            }

            private final void logoutComplete() {
                BzK bzKA02 = BzK.A02(c4oT);
                bzKA02.A08();
                bzKA02.A0B(0);
                interfaceC3355CGq.ARt(abstractC3358CGz);
            }

            private final Boolean readLogoutSuccessFlag(InterfaceC3352CGi interfaceC3352CGi) throws IOException {
                JsonReader jsonReader = new JsonReader(new InputStreamReader(((C3351CGh) interfaceC3352CGi).A00.A01, HatchWebPageParserKt.UTF_8));
                jsonReader.beginObject();
                Boolean boolValueOf = null;
                while (jsonReader.hasNext() && jsonReader.peek() != JsonToken.END_OBJECT) {
                    if ("success".equals(jsonReader.nextName())) {
                        boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                }
                jsonReader.endObject();
                return boolValueOf;
            }
        }, c4023CkCARE);
        c4018Cjz.A00();
    }

    public AuraSignOutStrategy(String str) {
        this.tierOverride = str;
    }

    public /* synthetic */ AuraSignOutStrategy(String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str);
    }

    public AuraSignOutStrategy() {
        this(null);
    }
}
