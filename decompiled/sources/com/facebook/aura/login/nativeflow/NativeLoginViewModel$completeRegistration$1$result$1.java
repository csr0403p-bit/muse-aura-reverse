package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$completeRegistration$1$result$1", f = "NativeLoginViewModel.kt", l = {5126}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$completeRegistration$1$result$1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $contactPoint;
    public final /* synthetic */ HatchAuthCredentials $credentials;
    public final /* synthetic */ String $encryptedPassword;
    public final /* synthetic */ String $firstName;
    public final /* synthetic */ String $handle;
    public final /* synthetic */ String $isoDate;
    public final /* synthetic */ String $lastName;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$completeRegistration$1$result$1(String str, String str2, String str3, String str4, String str5, String str6, HatchAuthCredentials hatchAuthCredentials, HtJ<? super NativeLoginViewModel$completeRegistration$1$result$1> htJ) {
        super(2, htJ);
        this.$handle = str;
        this.$contactPoint = str2;
        this.$isoDate = str3;
        this.$firstName = str4;
        this.$lastName = str5;
        this.$encryptedPassword = str6;
        this.$credentials = hatchAuthCredentials;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginViewModel$completeRegistration$1$result$1 nativeLoginViewModel$completeRegistration$1$result$1 = new NativeLoginViewModel$completeRegistration$1$result$1(this.$handle, this.$contactPoint, this.$isoDate, this.$firstName, this.$lastName, this.$encryptedPassword, this.$credentials, htJ);
        nativeLoginViewModel$completeRegistration$1$result$1.L$0 = obj;
        return nativeLoginViewModel$completeRegistration$1$result$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(str, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1257registerCompletion5p_uFSQ;
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
            String str2 = this.$handle;
            String str3 = this.$contactPoint;
            String str4 = this.$isoDate;
            String str5 = this.$firstName;
            String str6 = this.$lastName;
            String str7 = this.$encryptedPassword;
            HatchAuthCredentials hatchAuthCredentials = this.$credentials;
            HatchTosDisclosure hatchTosDisclosure = hatchAuthCredentials.tos;
            String str8 = hatchTosDisclosure != null ? hatchTosDisclosure.contentVersion : null;
            HatchAttestationRequest hatchAttestationRequest = hatchAuthCredentials.attestationRequest;
            this.L$0 = null;
            this.label = 1;
            objM1257registerCompletion5p_uFSQ = hatchAuthApi.m1257registerCompletion5p_uFSQ(str, str2, str3, null, str4, str5, str6, str7, str8, hatchAttestationRequest, this);
            if (objM1257registerCompletion5p_uFSQ == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1257registerCompletion5p_uFSQ = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1257registerCompletion5p_uFSQ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((NativeLoginViewModel$completeRegistration$1$result$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
