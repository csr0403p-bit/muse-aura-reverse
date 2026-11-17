package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightDetailScreenKt$FlightDetailScreen$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ FlightDetailScreenKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightDetailScreen$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public final /* synthetic */ FlightDetailScreenKey $key;

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(((auraNavKey instanceof FlightDetailScreenKey) && C7384Etj.areEqual(((FlightDetailScreenKey) auraNavKey).sessionId, this.$key.sessionId)) || ((auraNavKey instanceof FlightResultsScreenKey) && C7384Etj.areEqual(((FlightResultsScreenKey) auraNavKey).sessionId, this.$key.sessionId)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlightDetailScreenKey flightDetailScreenKey) {
            super(1);
            this.$key = flightDetailScreenKey;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$navigator.popAll(new AnonymousClass1(this.$key));
        this.$navigator.navigate((AuraNavKey) new FlightResultsScreenKey(str, this.$key.sessionId), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailScreenKt$FlightDetailScreen$1$1(AuraNavigator auraNavigator, FlightDetailScreenKey flightDetailScreenKey) {
        super(1);
        this.$navigator = auraNavigator;
        this.$key = flightDetailScreenKey;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
