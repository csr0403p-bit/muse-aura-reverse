package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsComponentsKt$PairsConfirmationDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ PairsConfirmation $confirmation;
    public final /* synthetic */ Function0<Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onConfirm;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        BS0 bs0;
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        PairsConfirmation pairsConfirmation = this.$confirmation;
        boolean z = pairsConfirmation.isDestructive;
        String str = pairsConfirmation.confirmLabel;
        Function0<Unit> function0 = this.$onConfirm;
        if (z) {
            bs0 = BRg.A00;
            auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, function0, null, bs0);
        } else {
            bs0 = BRg.A00;
            auraButtonGroupScope.primaryButton(str, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, function0, (String) null, Integer.MAX_VALUE, (BRg) bs0);
        }
        auraButtonGroupScope.secondaryButton(this.$confirmation.dismissLabel, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onCancel, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsComponentsKt$PairsConfirmationDialog$1$1$1(PairsConfirmation pairsConfirmation, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$confirmation = pairsConfirmation;
        this.$onConfirm = function0;
        this.$onCancel = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
