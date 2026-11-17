package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onepassword.OnePasswordError;
import com.facebook.aura.onepassword.OnePasswordHandoff;
import com.facebook.aura.onepassword.OnePasswordHandoffKt;
import com.facebook.aura.onepassword.RequestCredentialAuthorization;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ RequestCredentialAuthorization $contract;
    public final /* synthetic */ HatchCredentialsViewModel $credentialsViewModel;
    public final /* synthetic */ MutableState<OnePasswordError> $errorDialog$delegate;
    public final /* synthetic */ OnePasswordHandoff $handoff;

    /* renamed from: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$2$1$1, reason: invalid class name */
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

    /* renamed from: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchCredentialsViewModel $credentialsViewModel;
        public final /* synthetic */ OnePasswordHandoff $handoff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchCredentialsViewModel hatchCredentialsViewModel, OnePasswordHandoff onePasswordHandoff) {
            super(0);
            this.$credentialsViewModel = hatchCredentialsViewModel;
            this.$handoff = onePasswordHandoff;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchCredentialsViewModel hatchCredentialsViewModel = this.$credentialsViewModel;
            OnePasswordHandoff onePasswordHandoff = this.$handoff;
            hatchCredentialsViewModel.requestExternalProviderGrant(onePasswordHandoff.captureAuthorization, OnePasswordHandoffKt.ONEPASSWORD_AUTH_PROVIDER, onePasswordHandoff.key);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$2$1(RequestCredentialAuthorization requestCredentialAuthorization, Context context, MutableState<OnePasswordError> mutableState, HatchCredentialsViewModel hatchCredentialsViewModel, OnePasswordHandoff onePasswordHandoff) {
        super(0);
        this.$contract = requestCredentialAuthorization;
        this.$context = context;
        this.$errorDialog$delegate = mutableState;
        this.$credentialsViewModel = hatchCredentialsViewModel;
        this.$handoff = onePasswordHandoff;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$contract.checkAvailability(this.$context, new AnonymousClass1(this.$errorDialog$delegate), new AnonymousClass2(this.$credentialsViewModel, this.$handoff));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
