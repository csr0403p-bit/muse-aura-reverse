package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginLandingScreenKt$NativeLoginLandingScreen$4$1 extends AbstractC7559F3s implements G0U<NativeLoginAccountUiModel, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isRemoveProfilesSheetOpen$delegate;
    public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onRemoveProfile;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        C7384Etj.A0Y(nativeLoginAccountUiModel, 0);
        if (MutableState.A0A((MutableState) this.$isRemoveProfilesSheetOpen$delegate)) {
            MutableState.A09(false, this.$isRemoveProfilesSheetOpen$delegate);
            this.$onRemoveProfile.invoke(nativeLoginAccountUiModel);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginLandingScreenKt$NativeLoginLandingScreen$4$1(G0U<? super NativeLoginAccountUiModel, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$onRemoveProfile = g0u;
        this.$isRemoveProfilesSheetOpen$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        invoke2(nativeLoginAccountUiModel);
        return Unit.INSTANCE;
    }
}
