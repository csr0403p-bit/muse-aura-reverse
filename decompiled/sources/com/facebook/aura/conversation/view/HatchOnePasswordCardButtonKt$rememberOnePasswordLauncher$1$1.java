package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AbstractC8583Fgi;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.C8588Fgn;
import X.FT4;
import X.G0U;
import X.HwU;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onepassword.RequestCredentialAuthorization;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchOnePasswordCardButtonKt$rememberOnePasswordLauncher$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ RequestCredentialAuthorization $contract;
    public final /* synthetic */ C1BO<G0U<RequestCredentialAuthorization.Result, Unit>> $currentOnResult$delegate;
    public final /* synthetic */ String $key;
    public final /* synthetic */ MutableState<HwU<String>> $launcher$delegate;
    public final /* synthetic */ AbstractC8583Fgi $registry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchOnePasswordCardButtonKt$rememberOnePasswordLauncher$1$1(AbstractC8583Fgi abstractC8583Fgi, String str, RequestCredentialAuthorization requestCredentialAuthorization, C1BO<? extends G0U<? super RequestCredentialAuthorization.Result, Unit>> c1bo, MutableState<HwU<String>> mutableState) {
        super(1);
        this.$registry = abstractC8583Fgi;
        this.$key = str;
        this.$contract = requestCredentialAuthorization;
        this.$currentOnResult$delegate = c1bo;
        this.$launcher$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AbstractC8583Fgi abstractC8583Fgi = this.$registry;
        String str = this.$key;
        RequestCredentialAuthorization requestCredentialAuthorization = this.$contract;
        final C1BO<G0U<RequestCredentialAuthorization.Result, Unit>> c1bo = this.$currentOnResult$delegate;
        final C8588Fgn c8588FgnA02 = abstractC8583Fgi.A02(new FT4() { // from class: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$rememberOnePasswordLauncher$1$1$registered$1
            @Override // X.FT4
            public final void onActivityResult(RequestCredentialAuthorization.Result result) {
                C7384Etj.A0Y(result, 0);
                C1BO.A0B(c1bo).invoke(result);
            }
        }, requestCredentialAuthorization, str);
        this.$launcher$delegate.Af8(c8588FgnA02);
        final MutableState<HwU<String>> mutableState = this.$launcher$delegate;
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchOnePasswordCardButtonKt$rememberOnePasswordLauncher$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                c8588FgnA02.A00();
                mutableState.Af8(null);
            }
        };
    }
}
