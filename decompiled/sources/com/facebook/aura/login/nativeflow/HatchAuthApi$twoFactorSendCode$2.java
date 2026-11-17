package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
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

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorSendCode$2", f = "HatchAuthApi.kt", l = {779}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$twoFactorSendCode$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ String $methodId;
    public final /* synthetic */ String $tempToken;
    public final /* synthetic */ String $twoFactorState;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$twoFactorSendCode$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$twoFactorSendCode$2> htJ) {
        super(2, htJ);
        this.$twoFactorState = str;
        this.$methodId = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$twoFactorSendCode$2(this.$twoFactorState, this.$methodId, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<Unit>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchAuthException hatchAuthExceptionA0J;
        Object objA0s;
        String strBodyString;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            byte[] bArrA1S = C3cH.A1S(new AuthTwoFactorSendCodeRequestJson(this.$twoFactorState, this.$methodId, C3cG.A0X(), C3cG.A0Y()), AuthTwoFactorSendCodeRequestJson$$serializer.INSTANCE, HatchJsonKt.HatchJson);
            HatchAuthClient hatchAuthClient = HatchAuthClient.INSTANCE;
            StefiHatchPath.AuthTwoFactorSendCode authTwoFactorSendCode = StefiHatchPath.AuthTwoFactorSendCode.INSTANCE;
            String str = this.$tempToken;
            this.L$0 = null;
            this.label = 1;
            obj = hatchAuthClient.post(authTwoFactorSendCode, bArrA1S, str, this);
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
        String value = StefiHatchPath.AuthTwoFactorSendCode.INSTANCE.getValue();
        try {
            strBodyString = auraHttpResponse.bodyString();
        } catch (Exception e) {
            hatchAuthExceptionA0J = C3cG.A0J(auraHttpResponse, C3cG.A0I(null, auraHttpResponse), C3cH.A0d(auraHttpResponse, value, e), e);
        }
        if (auraHttpResponse.isSuccessful) {
            objA0s = Unit.INSTANCE;
            return C3cG.A0t(objA0s);
        }
        HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(strBodyString);
        HatchAuthError hatchAuthErrorA0I = C3cG.A0I(hatchProblemJsonHatchProblemOf, auraHttpResponse);
        if ((strBodyString == null || C7BY.A0j(strBodyString)) && ((strBodyString = auraHttpResponse.errorMessage) == null || C7BY.A0j(strBodyString))) {
            strBodyString = C3cG.A0b(auraHttpResponse, value);
        }
        hatchAuthExceptionA0J = C3cH.A0T(hatchProblemJsonHatchProblemOf, auraHttpResponse, hatchAuthErrorA0I, strBodyString);
        objA0s = C3cG.A0s(hatchAuthExceptionA0J);
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<Unit>> htJ) {
        return ((HatchAuthApi$twoFactorSendCode$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
