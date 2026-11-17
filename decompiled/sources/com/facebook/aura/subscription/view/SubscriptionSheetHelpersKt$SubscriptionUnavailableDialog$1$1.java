package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SubscriptionSheetHelpersKt$SubscriptionUnavailableDialog$1$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ SubscriptionAttribution $attribution;
    public final /* synthetic */ MutableState<Boolean> $impressionLogged$delegate;

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionSheetHelpersKt$SubscriptionUnavailableDialog$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        if (!MutableState.A0A((MutableState) this.$impressionLogged$delegate)) {
            MutableState.A09(true, this.$impressionLogged$delegate);
            new HatchNMEGaiWaterfallEventLogger(null, 1, null).logEvent(C98e.GENERIC_INELIGIBLE_SCREEN, C98d.ROUTING, C98b.IMPRESSION, AuraSubscriptionPaywallBottomSheetKt.toNmeEntryPoint(this.$attribution), null, C98c.WHOLE_SCREEN, null);
        }
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        C7384Etj.A0Y(anonymousClass1, 0);
        return new BL5(anonymousClass1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionSheetHelpersKt$SubscriptionUnavailableDialog$1$1(SubscriptionAttribution subscriptionAttribution, MutableState<Boolean> mutableState) {
        super(1);
        this.$attribution = subscriptionAttribution;
        this.$impressionLogged$delegate = mutableState;
    }
}
