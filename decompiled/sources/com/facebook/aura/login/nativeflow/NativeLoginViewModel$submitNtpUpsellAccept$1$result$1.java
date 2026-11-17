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

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$submitNtpUpsellAccept$1$result$1", f = "NativeLoginViewModel.kt", l = {5275}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$submitNtpUpsellAccept$1$result$1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ HatchAttestationRequest $attestationRequest;
    public final /* synthetic */ String $contactPoint;
    public final /* synthetic */ boolean $drawsLinkingDisclosure;
    public final /* synthetic */ String $linkingDisclosureVersion;
    public final /* synthetic */ HatchNtpUpsellOffer $offer;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$submitNtpUpsellAccept$1$result$1(HatchNtpUpsellOffer hatchNtpUpsellOffer, String str, boolean z, String str2, HatchAttestationRequest hatchAttestationRequest, HtJ<? super NativeLoginViewModel$submitNtpUpsellAccept$1$result$1> htJ) {
        super(2, htJ);
        this.$offer = hatchNtpUpsellOffer;
        this.$contactPoint = str;
        this.$drawsLinkingDisclosure = z;
        this.$linkingDisclosureVersion = str2;
        this.$attestationRequest = hatchAttestationRequest;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginViewModel$submitNtpUpsellAccept$1$result$1 nativeLoginViewModel$submitNtpUpsellAccept$1$result$1 = new NativeLoginViewModel$submitNtpUpsellAccept$1$result$1(this.$offer, this.$contactPoint, this.$drawsLinkingDisclosure, this.$linkingDisclosureVersion, this.$attestationRequest, htJ);
        nativeLoginViewModel$submitNtpUpsellAccept$1$result$1.L$0 = obj;
        return nativeLoginViewModel$submitNtpUpsellAccept$1$result$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(str, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1258registerCompletionLinkedtZkwj4A;
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
            HatchNtpUpsellOffer hatchNtpUpsellOffer = this.$offer;
            String str2 = hatchNtpUpsellOffer.linkHandle;
            String str3 = this.$contactPoint;
            String str4 = hatchNtpUpsellOffer.tos.contentVersion;
            if (hatchNtpUpsellOffer.suppressesTosClause) {
                str4 = null;
            }
            boolean z = this.$drawsLinkingDisclosure;
            String str5 = this.$linkingDisclosureVersion;
            HatchAttestationRequest hatchAttestationRequest = this.$attestationRequest;
            this.L$0 = null;
            this.label = 1;
            objM1258registerCompletionLinkedtZkwj4A = hatchAuthApi.m1258registerCompletionLinkedtZkwj4A(str, str2, str3, null, str4, z, str5, hatchAttestationRequest, this);
            if (objM1258registerCompletionLinkedtZkwj4A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1258registerCompletionLinkedtZkwj4A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1258registerCompletionLinkedtZkwj4A);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((NativeLoginViewModel$submitNtpUpsellAccept$1$result$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
