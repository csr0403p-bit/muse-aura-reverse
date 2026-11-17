package com.facebook.aura.login.nativeflow;

import X.ADq;
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

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$saveAccount$2", f = "HatchAuthApi.kt", l = {491}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$saveAccount$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends String>>, Object> {
    public final /* synthetic */ String $aymhDeviceId;
    public final /* synthetic */ String $frlAccessToken;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$saveAccount$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$saveAccount$2> htJ) {
        super(2, htJ);
        this.$frlAccessToken = str;
        this.$aymhDeviceId = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$saveAccount$2(this.$frlAccessToken, this.$aymhDeviceId, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<String>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            byte[] bArrA1S = C3cH.A1S(new AuthSaveAccountRequestJson(this.$frlAccessToken, this.$aymhDeviceId, C3cG.A0Y()), AuthSaveAccountRequestJson$$serializer.INSTANCE, HatchJsonKt.HatchJson);
            HatchAuthClient hatchAuthClient = HatchAuthClient.INSTANCE;
            StefiHatchPath.AuthSaveAccount authSaveAccount = StefiHatchPath.AuthSaveAccount.INSTANCE;
            String str = this.$tempToken;
            this.L$0 = null;
            this.label = 1;
            obj = hatchAuthClient.post(authSaveAccount, bArrA1S, str, this);
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
        String value = StefiHatchPath.AuthSaveAccount.INSTANCE.getValue();
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
                    objA0s = HatchJsonKt.HatchJson.A00(strBodyString, AuthSaveAccountResponseJson$$serializer.INSTANCE);
                } catch (Exception e) {
                    objA0s = C3cH.A0s(auraHttpResponse, value, e);
                }
            }
        } catch (Exception e2) {
            objA0s = C3cG.A0s(C3cG.A0J(auraHttpResponse, C3cG.A0I(null, auraHttpResponse), C3cH.A0d(auraHttpResponse, value, e2), e2));
        }
        boolean z = !(objA0s instanceof C10571Hud);
        Object obj2 = objA0s;
        if (z) {
            String str2 = ((AuthSaveAccountResponseJson) objA0s).saved_account_id;
            boolean zA0j = C7BY.A0j(str2);
            obj2 = str2;
            if (zA0j) {
                obj2 = null;
            }
        }
        Throwable thA00 = HsJ.A00(obj2);
        Object objA0s2 = obj2;
        if (thA00 != null) {
            try {
                ADq aDq = new ADq(200, 299);
                if (!(thA00 instanceof HatchAuthException)) {
                    throw thA00;
                }
                HatchAuthException hatchAuthException = (HatchAuthException) thA00;
                if (hatchAuthException == null || !aDq.A00(C3cG.A0R(hatchAuthException.httpResponseCode).intValue())) {
                    throw thA00;
                }
                objA0s2 = null;
            } catch (Throwable th) {
                objA0s2 = C3cG.A0s(th);
            }
        }
        return C3cG.A0t(objA0s2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<String>> htJ) {
        return ((HatchAuthApi$saveAccount$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
