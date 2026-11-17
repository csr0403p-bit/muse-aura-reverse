package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FlightCheckoutPassengerSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengersSheetKt$FlightCheckoutPassengersSheet$2$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $approvalId;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightCheckoutPassengersSheetKt$FlightCheckoutPassengersSheet$2$1$1$1$1(AuraNavigator auraNavigator, String str, int i) {
        super(0);
        this.$navigator = auraNavigator;
        this.$approvalId = str;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new FlightCheckoutPassengerSheetKey(this.$approvalId, this.$index), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
