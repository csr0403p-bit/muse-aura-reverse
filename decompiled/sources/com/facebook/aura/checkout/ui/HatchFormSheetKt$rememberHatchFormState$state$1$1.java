package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$rememberHatchFormState$state$1$1 extends AbstractC7559F3s implements Function0<HatchFormState> {
    public final /* synthetic */ List<HatchFormField> $allFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$rememberHatchFormState$state$1$1(List<HatchFormField> list) {
        super(0);
        this.$allFields = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchFormState invoke() {
        return new HatchFormState(this.$allFields);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ HatchFormState invoke() {
        return new HatchFormState(this.$allFields);
    }
}
