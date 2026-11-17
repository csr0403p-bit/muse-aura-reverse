package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.C2Um;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$AutocompleteFieldRow$1$1$1 extends AbstractC7559F3s implements G0U<C2Um, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasFocus$delegate;
    public final /* synthetic */ HatchAddressTypeahead $typeahead;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2Um c2Um) {
        C7384Etj.A0Y(c2Um, 0);
        if (MutableState.A0A((MutableState) this.$hasFocus$delegate) && !c2Um.AG5()) {
            this.$typeahead.onClose.invoke();
        }
        MutableState.A09(c2Um.AG5(), this.$hasFocus$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$AutocompleteFieldRow$1$1$1(HatchAddressTypeahead hatchAddressTypeahead, MutableState<Boolean> mutableState) {
        super(1);
        this.$typeahead = hatchAddressTypeahead;
        this.$hasFocus$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2Um c2Um) {
        invoke2(c2Um);
        return Unit.INSTANCE;
    }
}
