package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$AutocompleteFieldRow$1$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasFocus$delegate;
    public final /* synthetic */ HatchAddressTypeahead $typeahead;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        if (MutableState.A0A((MutableState) this.$hasFocus$delegate)) {
            this.$typeahead.onQueryChange.invoke(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$AutocompleteFieldRow$1$2$1(HatchAddressTypeahead hatchAddressTypeahead, MutableState<Boolean> mutableState) {
        super(1);
        this.$typeahead = hatchAddressTypeahead;
        this.$hasFocus$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
