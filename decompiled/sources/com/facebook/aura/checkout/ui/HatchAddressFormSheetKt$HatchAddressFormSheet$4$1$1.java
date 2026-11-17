package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.C60O;
import X.G0U;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAddressFormSheetKt$HatchAddressFormSheet$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchAddress, Unit> $onSave;
    public final /* synthetic */ HatchFormState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAddressFormSheetKt$HatchAddressFormSheet$4$1$1(HatchFormState hatchFormState, G0U<? super HatchAddress, Unit> g0u) {
        super(0);
        this.$state = hatchFormState;
        this.$onSave = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<String, String> mapCollected = this.$state.collected();
        G0U<HatchAddress, Unit> g0u = this.$onSave;
        String strA0p = C60O.A0p(AddressFieldId.FULL_NAME, mapCollected);
        if (strA0p == null) {
            strA0p = "";
        }
        String strA0p2 = C60O.A0p("address", mapCollected);
        g0u.invoke(new HatchAddress(strA0p, strA0p2 != null ? strA0p2 : ""));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
