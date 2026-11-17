package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmTemporaryAccessBottomSheetKt$ConfidentialVmTemporaryAccessBottomSheet$3$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $acknowledged$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmTemporaryAccessBottomSheetKt$ConfidentialVmTemporaryAccessBottomSheet$3$1$1$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$acknowledged$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        MutableState.A09(z, this.$acknowledged$delegate);
    }
}
