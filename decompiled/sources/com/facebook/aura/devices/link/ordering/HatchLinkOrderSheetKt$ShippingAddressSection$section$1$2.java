package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.C1BO;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$ShippingAddressSection$section$1$2 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $latestOnAddAddress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkOrderSheetKt$ShippingAddressSection$section$1$2(C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$latestOnAddAddress$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C1BO<Function0<Unit>> c1bo = this.$latestOnAddAddress$delegate;
        Set<HatchLinkOrderField> set = HatchLinkOrderSheetKt.ADDRESS_FIELDS;
        C1BO.A0D(c1bo);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
