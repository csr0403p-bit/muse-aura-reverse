package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$4$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $additionalInfo$delegate;
    public final /* synthetic */ HatchModelLockSupportViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$additionalInfo$delegate.Af8(this.$viewModel.capAdditionalInfo(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchModelLockSupportSheetKt$HatchModelLockSupportSheet$4$1$1(HatchModelLockSupportViewModel hatchModelLockSupportViewModel, MutableState<String> mutableState) {
        super(1);
        this.$viewModel = hatchModelLockSupportViewModel;
        this.$additionalInfo$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
