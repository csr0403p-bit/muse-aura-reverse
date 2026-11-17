package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.Au3;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$FormSelectionRow$1$1$1$1 extends AbstractC7559F3s implements G0U<CharSequence, Boolean> {
    public final /* synthetic */ HatchFormField $field;
    public final /* synthetic */ HatchFormState $state;

    @Override // X.G0U
    public final Boolean invoke(CharSequence charSequence) {
        boolean z;
        C7384Etj.A0Y(charSequence, 0);
        HatchFormOption hatchFormOptionOptionMatching = HatchFormSheetKt.optionMatching(this.$field, charSequence);
        if (hatchFormOptionOptionMatching != null) {
            HatchFormState hatchFormState = this.$state;
            HatchFormField hatchFormField = this.$field;
            hatchFormState.values.put(hatchFormField.id, new C1805ArO(hatchFormOptionOptionMatching.value, Au3.A01));
            hatchFormState.reformatDependents$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(hatchFormField.id);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$FormSelectionRow$1$1$1$1(HatchFormField hatchFormField, HatchFormState hatchFormState) {
        super(1);
        this.$field = hatchFormField;
        this.$state = hatchFormState;
    }
}
