package com.facebook.aura.network.hatchauth;

import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.F60;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.network.AuraHttpResponse;

/* loaded from: classes2.dex */
public abstract class HatchAuthResponseDecoderKt {
    public static final /* synthetic */ <T> Object decodeHatchAuthResponse(AuraHttpResponse auraHttpResponse, String str) {
        HatchAuthException hatchAuthExceptionA0J;
        String strBodyString;
        AnonymousClass003.A0u(auraHttpResponse, str);
        try {
            strBodyString = auraHttpResponse.bodyString();
        } catch (Exception e) {
            hatchAuthExceptionA0J = C3cG.A0J(auraHttpResponse, C3cG.A0I(null, auraHttpResponse), C3cH.A0d(auraHttpResponse, str, e), e);
        }
        if (auraHttpResponse.isSuccessful) {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        }
        HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(strBodyString);
        HatchAuthError hatchAuthErrorA0I = C3cG.A0I(hatchProblemJsonHatchProblemOf, auraHttpResponse);
        if ((strBodyString == null || C7BY.A0j(strBodyString)) && ((strBodyString = auraHttpResponse.errorMessage) == null || C7BY.A0j(strBodyString))) {
            strBodyString = C3cG.A0b(auraHttpResponse, str);
        }
        hatchAuthExceptionA0J = C3cH.A0T(hatchProblemJsonHatchProblemOf, auraHttpResponse, hatchAuthErrorA0I, strBodyString);
        return C3cG.A0s(hatchAuthExceptionA0J);
    }
}
