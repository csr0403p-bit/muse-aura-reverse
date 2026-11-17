package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C8j3;
import com.facebook.aura.checkout.ui.HatchFormState;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEvent;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLinkOrderSheetKt$HatchLinkOrderSheet$onBack$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchLinkOrderBlockReason $blockReason;
    public final /* synthetic */ HatchFormState $formState;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<HatchLinkOrderFormState> $state$delegate;
    public final /* synthetic */ HatchLinkOrderViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkOrderSheetKt$HatchLinkOrderSheet$onBack$1$1(HatchLinkOrderBlockReason hatchLinkOrderBlockReason, HatchLinkOrderViewModel hatchLinkOrderViewModel, AuraNavigator auraNavigator, HatchFormState hatchFormState, C1BO<HatchLinkOrderFormState> c1bo) {
        super(0);
        this.$blockReason = hatchLinkOrderBlockReason;
        this.$viewModel = hatchLinkOrderViewModel;
        this.$navigator = auraNavigator;
        this.$formState = hatchFormState;
        this.$state$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason = this.$blockReason;
        HatchLinkOrderViewModel hatchLinkOrderViewModel = this.$viewModel;
        if (hatchLinkOrderBlockReason != null) {
            hatchLinkOrderViewModel.logExit();
            this.$navigator.back();
        } else {
            C1BO<HatchLinkOrderFormState> c1bo = this.$state$delegate;
            Set<HatchLinkOrderField> set = HatchLinkOrderSheetKt.ADDRESS_FIELDS;
            hatchLinkOrderViewModel.onEvent(new HatchLinkOrderEvent.BackPressed((C8j3.A0o(c1bo).step != HatchLinkOrderStep.DETAILS || C8j3.A0o(this.$state$delegate).isLoadingSavedDetails) ? null : HatchLinkOrderSheetKt.withDetails(C8j3.A0o(this.$state$delegate).input, this.$formState.collected())));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
