package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPauseBottomSheetContentKt$PauseHatchConfirmDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ boolean $isPausing;
    public final /* synthetic */ String $lockText;
    public final /* synthetic */ Function0<Unit> $onConfirmPause;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        boolean z = !this.$isPausing;
        String str = this.$lockText;
        Function0<Unit> function0 = this.$onConfirmPause;
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, z, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, function0, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelText, null, !this.$isPausing, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onDismiss, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseBottomSheetContentKt$PauseHatchConfirmDialog$1$1$1(boolean z, String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        super(1);
        this.$isPausing = z;
        this.$lockText = str;
        this.$onConfirmPause = function0;
        this.$cancelText = str2;
        this.$onDismiss = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
