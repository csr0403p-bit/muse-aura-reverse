package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class RentalCarResultsCardKt$RentalCarResultsCard$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ RentalCarRate $rate;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarResultsCardKt$RentalCarResultsCard$1$1$1$1(AuraNavigator auraNavigator, String str, String str2, String str3, int i, RentalCarRate rentalCarRate) {
        super(0);
        this.$navigator = auraNavigator;
        this.$sessionId = str;
        this.$hostMessageId = str2;
        this.$presentationId = str3;
        this.$index = i;
        this.$rate = rentalCarRate;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.GENERIC_LIST_ROW, null, null, null);
        AuraNavigator auraNavigator = this.$navigator;
        String str = this.$sessionId;
        String str2 = this.$hostMessageId;
        String str3 = this.$presentationId;
        int i = this.$index;
        RentalCarRate rentalCarRate = this.$rate;
        auraNavigator.navigate((AuraNavKey) new RentalCarDetailsScreenKey(str, str2, str3, i, rentalCarRate.rateId, rentalCarRate.car.imageUrl, false), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
