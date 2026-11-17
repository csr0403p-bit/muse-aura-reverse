package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HwU;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onepassword.OnePasswordError;
import com.facebook.aura.onepassword.OnePasswordHandoff;
import com.facebook.aura.onepassword.RequestCredentialAuthorization;
import com.facebook.aura.settings.ExternalProviderGrantRequest;
import com.facebook.aura.settings.ExternalProviderGrantResult;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1", f = "HatchOnePasswordCardButton.kt", l = {78}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ RequestCredentialAuthorization $contract;
    public final /* synthetic */ HatchCredentialsViewModel $credentialsViewModel;
    public final /* synthetic */ C1BO<HwU<String>> $currentLauncher$delegate;
    public final /* synthetic */ MutableState<OnePasswordError> $errorDialog$delegate;
    public final /* synthetic */ OnePasswordHandoff $handoff;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1(HatchCredentialsViewModel hatchCredentialsViewModel, OnePasswordHandoff onePasswordHandoff, RequestCredentialAuthorization requestCredentialAuthorization, C1BO<? extends HwU<String>> c1bo, MutableState<OnePasswordError> mutableState, HtJ<? super HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1> htJ) {
        super(2, htJ);
        this.$credentialsViewModel = hatchCredentialsViewModel;
        this.$handoff = onePasswordHandoff;
        this.$contract = requestCredentialAuthorization;
        this.$currentLauncher$delegate = c1bo;
        this.$errorDialog$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1(this.$credentialsViewModel, this.$handoff, this.$contract, this.$currentLauncher$delegate, this.$errorDialog$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1$invokeSuspend$$inlined$filter$1 hatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1$invokeSuspend$$inlined$filter$1 = new HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1$invokeSuspend$$inlined$filter$1(this.$credentialsViewModel.externalProviderGrantRequests, this.$handoff);
            final RequestCredentialAuthorization requestCredentialAuthorization = this.$contract;
            final C1BO<HwU<String>> c1bo = this.$currentLauncher$delegate;
            final MutableState<OnePasswordError> mutableState = this.$errorDialog$delegate;
            C20Z<? super ExternalProviderGrantRequest> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1.2

                /* renamed from: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<RequestCredentialAuthorization.Result.Failed, Unit> {
                    public final /* synthetic */ MutableState<OnePasswordError> $errorDialog$delegate;

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(RequestCredentialAuthorization.Result.Failed failed) {
                        C7384Etj.A0Y(failed, 0);
                        this.$errorDialog$delegate.Af8(HatchOnePasswordCardButtonKt.onePasswordError(failed));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(MutableState<OnePasswordError> mutableState) {
                        super(1);
                        this.$errorDialog$delegate = mutableState;
                    }

                    @Override // X.G0U
                    public /* bridge */ /* synthetic */ Unit invoke(RequestCredentialAuthorization.Result.Failed failed) {
                        invoke2(failed);
                        return Unit.INSTANCE;
                    }
                }

                public final Object emit(ExternalProviderGrantRequest externalProviderGrantRequest, HtJ<? super Unit> htJ) {
                    MutableState<OnePasswordError> mutableState2;
                    OnePasswordError onePasswordError;
                    HwU<String> value = c1bo.getValue();
                    ExternalProviderGrantResult externalProviderGrantResult = externalProviderGrantRequest.result;
                    if (externalProviderGrantResult instanceof ExternalProviderGrantResult.Requested) {
                        if (value != null) {
                            requestCredentialAuthorization.launch(value, OnePasswordHandoff.Companion.accessRequestReference(((ExternalProviderGrantResult.Requested) externalProviderGrantResult).grantRequest), new AnonymousClass1(mutableState));
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (C7384Etj.areEqual(externalProviderGrantResult, ExternalProviderGrantResult.Expired.INSTANCE)) {
                            mutableState2 = mutableState;
                            onePasswordError = OnePasswordError.EXPIRED;
                            mutableState2.Af8(onePasswordError);
                            return Unit.INSTANCE;
                        }
                        if (!C7384Etj.areEqual(externalProviderGrantResult, ExternalProviderGrantResult.Failed.INSTANCE)) {
                            throw C3cG.A0q();
                        }
                    }
                    mutableState2 = mutableState;
                    onePasswordError = OnePasswordError.FAILED;
                    mutableState2.Af8(onePasswordError);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ExternalProviderGrantRequest) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (hatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
