package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchFormRow$id$1 extends AbstractC7559F3s implements G0U<HatchFormField, CharSequence> {
    public static final HatchFormRow$id$1 INSTANCE = new HatchFormRow$id$1();

    public HatchFormRow$id$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(HatchFormField hatchFormField) {
        HatchFormField hatchFormField2 = hatchFormField;
        C7384Etj.A0Y(hatchFormField2, 0);
        return hatchFormField2.id;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(HatchFormField hatchFormField) {
        C7384Etj.A0Y(hatchFormField, 0);
        return hatchFormField.id;
    }
}
