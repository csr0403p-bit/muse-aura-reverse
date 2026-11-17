package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WearablesLinkingBottomSheetKt$BottomSheetFailureContent$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ Function0<Unit> $onCancel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f120c04, null, null, !this.$isLoading, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onCancel, null, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingBottomSheetKt$BottomSheetFailureContent$1$1$1(boolean z, Function0<Unit> function0) {
        super(1);
        this.$isLoading = z;
        this.$onCancel = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
