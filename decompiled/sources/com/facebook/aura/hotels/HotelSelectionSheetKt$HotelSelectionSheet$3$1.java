package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HotelSelectionSheetKt$HotelSelectionSheet$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<HotelSelectionUiState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionSheetKt$HotelSelectionSheet$3$1(AuraNavigator auraNavigator, C1BO<HotelSelectionUiState> c1bo) {
        super(0);
        this.$navigator = auraNavigator;
        this.$state$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HotelReviewState hotelReviewState = this.$state$delegate.getValue().review;
        HotelReviewState hotelReviewState2 = HotelReviewState.REQUESTING;
        if (hotelReviewState == hotelReviewState2 || this.$state$delegate.getValue().roomDiscussion == hotelReviewState2) {
            return;
        }
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
