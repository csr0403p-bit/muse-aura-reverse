package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WearablesLinkingFullScreenKt$FullScreenFailureContent$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ Function0<Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onTryAgain;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        boolean z = this.$isLoading;
        Function0<Unit> function0 = this.$onTryAgain;
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(R.string._name_removed__res_0x7f120c19, (Object[]) null, (Drawable) null, !z, z, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, function0, (String) null, bs0);
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f120c04, null, null, !this.$isLoading, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onCancel, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$FullScreenFailureContent$1$2$1(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$isLoading = z;
        this.$onTryAgain = function0;
        this.$onCancel = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
