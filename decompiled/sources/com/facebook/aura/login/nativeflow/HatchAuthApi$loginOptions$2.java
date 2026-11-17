package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7BY;
import X.EnumC10460Hji;
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
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$loginOptions$2", f = "HatchAuthApi.kt", l = {848}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$loginOptions$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthLoginOptions>>, Object> {
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$loginOptions$2(String str, HtJ<? super HatchAuthApi$loginOptions$2> htJ) {
        super(2, htJ);
        this.$tempToken = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$loginOptions$2(this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthLoginOptions>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthLoginOptions>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            byte[] bArrA1S = C3cH.A1S(new AuthLoginOptionsRequestJson(C3cG.A0X(), C3cG.A0Y()), AuthLoginOptionsRequestJson$$serializer.INSTANCE, HatchJsonKt.HatchJson);
            HatchAuthClient hatchAuthClient = HatchAuthClient.INSTANCE;
            StefiHatchPath.AuthLoginOptions authLoginOptions = StefiHatchPath.AuthLoginOptions.INSTANCE;
            String str = this.$tempToken;
            this.L$0 = null;
            this.label = 1;
            obj = hatchAuthClient.post(authLoginOptions, bArrA1S, str, this);
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
        String value = StefiHatchPath.AuthLoginOptions.INSTANCE.getValue();
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
                    objA0s = HatchJsonKt.HatchJson.A00(strBodyString, AuthLoginOptionsResponseJson$$serializer.INSTANCE);
                } catch (Exception e) {
                    objA0s = C3cH.A0s(auraHttpResponse, value, e);
                }
            }
        } catch (Exception e2) {
            objA0s = C3cG.A0s(C3cG.A0J(auraHttpResponse, C3cG.A0I(null, auraHttpResponse), C3cH.A0d(auraHttpResponse, value, e2), e2));
        }
        if (!(objA0s instanceof C10571Hud)) {
            AuthLoginOptionsResponseJson authLoginOptionsResponseJson = (AuthLoginOptionsResponseJson) objA0s;
            HatchAuthLoginOptionsState hatchAuthLoginOptionsStateFromWire = HatchAuthLoginOptionsState.Companion.fromWire(authLoginOptionsResponseJson.registration_state);
            String str2 = authLoginOptionsResponseJson.auth_state;
            String str3 = null;
            if (!C7BY.A0j(str2)) {
                str3 = str2;
            }
            boolean z = authLoginOptionsResponseJson.password_login_available;
            HatchAuthFlow hatchAuthFlowFromWire = HatchAuthFlow.Companion.fromWire(authLoginOptionsResponseJson.flow);
            HatchNtpSourceApp hatchNtpSourceAppFromWire = HatchNtpSourceApp.Companion.fromWire(authLoginOptionsResponseJson.ntp_source_app);
            PasskeyRequestOptionsJson passkeyRequestOptionsJson = authLoginOptionsResponseJson.passkey_request_options;
            objA0s = new HatchAuthLoginOptions(hatchAuthLoginOptionsStateFromWire, str3, z, hatchAuthFlowFromWire, hatchNtpSourceAppFromWire, passkeyRequestOptionsJson != null ? passkeyRequestOptionsJson.toDomain() : null);
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthLoginOptions>> htJ) {
        return new HatchAuthApi$loginOptions$2(this.$tempToken, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
