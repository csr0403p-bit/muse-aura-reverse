package com.facebook.aura.checkout.ui;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.Au3;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$FormSelectionRow$1$1$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ HatchFormField $field;
    public final /* synthetic */ HatchFormState $state;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$expanded$delegate);
        HatchFormOption hatchFormOption = (HatchFormOption) AbstractC0878AGe.A0A(auraContextMenuItem.id, this.$field.options);
        if (hatchFormOption != null) {
            HatchFormState hatchFormState = this.$state;
            HatchFormField hatchFormField = this.$field;
            hatchFormState.values.put(hatchFormField.id, new C1805ArO(hatchFormOption.value, Au3.A01));
            hatchFormState.reformatDependents$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(hatchFormField.id);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$FormSelectionRow$1$1$3$1(HatchFormField hatchFormField, MutableState<Boolean> mutableState, HatchFormState hatchFormState) {
        super(1);
        this.$field = hatchFormField;
        this.$expanded$delegate = mutableState;
        this.$state = hatchFormState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
