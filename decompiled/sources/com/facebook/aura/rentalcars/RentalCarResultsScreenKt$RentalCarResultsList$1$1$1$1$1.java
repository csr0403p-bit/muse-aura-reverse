package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class RentalCarResultsScreenKt$RentalCarResultsList$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ RentalCarRate $rate;
    public final /* synthetic */ RentalCarResultsScreenKey $screenKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarResultsScreenKt$RentalCarResultsList$1$1$1$1$1(AuraNavigator auraNavigator, RentalCarResultsScreenKey rentalCarResultsScreenKey, int i, RentalCarRate rentalCarRate) {
        super(0);
        this.$navigator = auraNavigator;
        this.$screenKey = rentalCarResultsScreenKey;
        this.$index = i;
        this.$rate = rentalCarRate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        RentalCarResultsScreenKey rentalCarResultsScreenKey = this.$screenKey;
        String str = rentalCarResultsScreenKey.sessionId;
        String str2 = rentalCarResultsScreenKey.hostMessageId;
        String str3 = rentalCarResultsScreenKey.presentationId;
        int i = this.$index;
        RentalCarRate rentalCarRate = this.$rate;
        auraNavigator.navigate((AuraNavKey) new RentalCarDetailsScreenKey(str, str2, str3, i, rentalCarRate.rateId, rentalCarRate.car.imageUrl, true), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
