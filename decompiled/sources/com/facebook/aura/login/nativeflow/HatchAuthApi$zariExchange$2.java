package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7BY;
import X.C9hr;
import X.C9sU;
import X.EnumC10460Hji;
import X.F0C;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.network.AuraHttpResponse;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.hatchauth.HatchAuthClient;
import com.facebook.aura.network.hatchauth.HatchAuthError;
import com.facebook.aura.network.hatchauth.HatchAuthException;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$zariExchange$2", f = "HatchAuthApi.kt", l = {454}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$zariExchange$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ HatchSsoAccountInfoRequest $account;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$zariExchange$2(HatchSsoAccountInfoRequest hatchSsoAccountInfoRequest, String str, HtJ<? super HatchAuthApi$zariExchange$2> htJ) {
        super(2, htJ);
        this.$account = hatchSsoAccountInfoRequest;
        this.$tempToken = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$zariExchange$2(this.$account, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = AuthZariExchangeRequestJson.$childSerializers;
            AuthZariExchangeRequestJson$$serializer authZariExchangeRequestJson$$serializer = AuthZariExchangeRequestJson$$serializer.INSTANCE;
            HatchSsoAccountInfoRequest hatchSsoAccountInfoRequest = this.$account;
            byte[] bArrA1S = C3cH.A1S(new AuthZariExchangeRequestJson(Collections.singletonList(new AuthSsoAccountInfoEntryJson(hatchSsoAccountInfoRequest.sourceApp.getWireValue(), hatchSsoAccountInfoRequest.accessToken, hatchSsoAccountInfoRequest.ref)), C3cG.A0X(), C3cG.A0Y()), authZariExchangeRequestJson$$serializer, c9sU);
            HatchAuthClient hatchAuthClient = HatchAuthClient.INSTANCE;
            StefiHatchPath.AuthZariExchange authZariExchange = StefiHatchPath.AuthZariExchange.INSTANCE;
            String str = this.$tempToken;
            this.L$0 = null;
            this.label = 1;
            obj = hatchAuthClient.post(authZariExchange, bArrA1S, str, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        AuraHttpResponse auraHttpResponse = (AuraHttpResponse) obj;
        String value = StefiHatchPath.AuthZariExchange.INSTANCE.getValue();
        HatchAuthCredentials credentials = null;
        try {
            String strBodyString = auraHttpResponse.bodyString();
            if (!auraHttpResponse.isSuccessful) {
                HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(strBodyString);
                HatchAuthError hatchAuthErrorA0I = C3cG.A0I(hatchProblemJsonHatchProblemOf, auraHttpResponse);
                if ((strBodyString == null || C7BY.A0j(strBodyString)) && ((strBodyString = auraHttpResponse.errorMessage) == null || C7BY.A0j(strBodyString))) {
                    strBodyString = C3cG.A0b(auraHttpResponse, value);
                }
                objA0s = C3cG.A0s(C3cH.A0T(hatchProblemJsonHatchProblemOf, auraHttpResponse, hatchAuthErrorA0I, strBodyString));
            } else if (strBodyString == null || C7BY.A0j(strBodyString)) {
                int i2 = auraHttpResponse.code;
                objA0s = C3cG.A0s(new HatchAuthException(new HatchAuthError.Failed(i2), C3cH.A0c(auraHttpResponse, value), i2, null, null));
            } else {
                try {
                    objA0s = HatchJsonKt.HatchJson.A00(strBodyString, AuthZariExchangeResponseJson$$serializer.INSTANCE);
                } catch (Exception e) {
                    objA0s = C3cH.A0s(auraHttpResponse, value, e);
                }
            }
        } catch (Exception e2) {
            objA0s = C3cG.A0s(C3cG.A0J(auraHttpResponse, C3cG.A0I(null, auraHttpResponse), C3cH.A0d(auraHttpResponse, value, e2), e2));
        }
        if (!(objA0s instanceof C10571Hud)) {
            try {
                AuthZariExchangeResponseJson authZariExchangeResponseJson = (AuthZariExchangeResponseJson) objA0s;
                AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson = authZariExchangeResponseJson.credentials;
                if (authRegisterCompletionResponseJson != null && authZariExchangeResponseJson.matched && !C7BY.A0j(authRegisterCompletionResponseJson.abra_access_token) && !C7BY.A0j(authRegisterCompletionResponseJson.abra_user_id) && !C7BY.A0j(authRegisterCompletionResponseJson.frl_access_token)) {
                    credentials = HatchAuthApiJsonKt.toCredentials(authRegisterCompletionResponseJson);
                }
                objA0s = credentials;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$zariExchange$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
