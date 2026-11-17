package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onepassword.OnePasswordError;
import com.facebook.aura.onepassword.OnePasswordHandoff;
import com.facebook.aura.onepassword.OnePasswordHandoffKt;
import com.facebook.aura.onepassword.RequestCredentialAuthorization;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$launcher$1$1 extends AbstractC7559F3s implements G0U<RequestCredentialAuthorization.Result, Unit> {
    public final /* synthetic */ HatchCredentialsViewModel $credentialsViewModel;
    public final /* synthetic */ MutableState<OnePasswordError> $errorDialog$delegate;
    public final /* synthetic */ OnePasswordHandoff $handoff;
    public final /* synthetic */ C1BO<String> $primarySessionId$delegate;
    public final /* synthetic */ String $sourceSessionId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RequestCredentialAuthorization.Result result) {
        C7384Etj.A0Y(result, 0);
        if (!(result instanceof RequestCredentialAuthorization.Result.Authorized)) {
            if (result instanceof RequestCredentialAuthorization.Result.Failed) {
                this.$errorDialog$delegate.Af8(HatchOnePasswordCardButtonKt.onePasswordError((RequestCredentialAuthorization.Result.Failed) result));
                return;
            } else {
                if (!result.equals(RequestCredentialAuthorization.Result.Denied.INSTANCE) && !result.equals(RequestCredentialAuthorization.Result.Cancelled.INSTANCE)) {
                    throw C3cG.A0q();
                }
                return;
            }
        }
        HatchCredentialsViewModel hatchCredentialsViewModel = this.$credentialsViewModel;
        OnePasswordHandoff onePasswordHandoff = this.$handoff;
        String str = onePasswordHandoff.key;
        String str2 = onePasswordHandoff.pageUrl;
        String strGrantFor = onePasswordHandoff.grantFor(((RequestCredentialAuthorization.Result.Authorized) result).grantReference);
        String strA08 = this.$sourceSessionId;
        if (strA08 == null) {
            strA08 = C1BO.A08(this.$primarySessionId$delegate);
        }
        hatchCredentialsViewModel.captureExternalGrant(str, str2, OnePasswordHandoffKt.ONEPASSWORD_AUTH_PROVIDER, strGrantFor, strA08, this.$handoff.captureAuthorization);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchOnePasswordCardButtonKt$HatchOnePasswordCardButton$launcher$1$1(HatchCredentialsViewModel hatchCredentialsViewModel, OnePasswordHandoff onePasswordHandoff, String str, C1BO<String> c1bo, MutableState<OnePasswordError> mutableState) {
        super(1);
        this.$credentialsViewModel = hatchCredentialsViewModel;
        this.$handoff = onePasswordHandoff;
        this.$sourceSessionId = str;
        this.$primarySessionId$delegate = c1bo;
        this.$errorDialog$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(RequestCredentialAuthorization.Result result) {
        invoke2(result);
        return Unit.INSTANCE;
    }
}
