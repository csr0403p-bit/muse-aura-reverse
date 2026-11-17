package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightDetailScreenKt$FlightDetailScreen$onPrimaryAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FlightDetailScreenKey $key;
    public final /* synthetic */ FlightDetailViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightDetailScreen$onPrimaryAction$1$1$1, reason: invalid class name */
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

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightDetailNavigation.values().length];
            try {
                AnonymousClass002.A13(FlightDetailNavigation.CLOSE_FLOW, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FlightDetailNavigation.OPEN_BOOKING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailScreenKt$FlightDetailScreen$onPrimaryAction$1$1(FlightDetailViewModel flightDetailViewModel, AuraNavigator auraNavigator, FlightDetailScreenKey flightDetailScreenKey) {
        super(0);
        this.$model = flightDetailViewModel;
        this.$navigator = auraNavigator;
        this.$key = flightDetailScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int iOrdinal;
        FlightDetailNavigation flightDetailNavigationOnPrimaryAction = this.$model.onPrimaryAction();
        if (flightDetailNavigationOnPrimaryAction == null || (iOrdinal = flightDetailNavigationOnPrimaryAction.ordinal()) == -1) {
            return;
        }
        if (iOrdinal == 0) {
            this.$navigator.popAll(new AnonymousClass1(this.$key));
            return;
        }
        if (iOrdinal != 1) {
            throw C3cG.A0q();
        }
        AuraNavigator auraNavigator = this.$navigator;
        FlightDetailScreenKey flightDetailScreenKey = this.$key;
        String str = flightDetailScreenKey.presentationId;
        String str2 = flightDetailScreenKey.offerId;
        String str3 = flightDetailScreenKey.sessionId;
        AnonymousClass005.A0x(str, str2, str3);
        auraNavigator.navigate((AuraNavKey) new FlightDetailScreenKey(str, str2, str3, true), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
