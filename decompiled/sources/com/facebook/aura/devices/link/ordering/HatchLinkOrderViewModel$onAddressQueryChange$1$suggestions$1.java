package com.facebook.aura.devices.link.ordering;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.checkout.ui.HatchAddressSuggestion;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1", f = "HatchLinkOrderViewModel.kt", l = {194}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AHD<? extends HatchAddressSuggestion>>, Object> {
    public final /* synthetic */ String $trimmed;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1(String str, HtJ<? super HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1> htJ) {
        super(2, htJ);
        this.$trimmed = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1(this.$trimmed, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super AHD<HatchAddressSuggestion>> htJ) {
        return new HatchLinkOrderViewModel$onAddressQueryChange$1$suggestions$1(this.$trimmed, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchLinkOrderRepository hatchLinkOrderRepository = HatchLinkOrderRepository.INSTANCE;
            String str = this.$trimmed;
            this.label = 1;
            obj = hatchLinkOrderRepository.addressSuggestions(str, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super AHD<? extends HatchAddressSuggestion>> htJ) {
        return invoke2(c3ux, (HtJ<? super AHD<HatchAddressSuggestion>>) htJ);
    }
}
