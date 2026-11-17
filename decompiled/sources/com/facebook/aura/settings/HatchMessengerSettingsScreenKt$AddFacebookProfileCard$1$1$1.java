package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessengerSettingsScreenKt$AddFacebookProfileCard$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onLinked;

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$AddFacebookProfileCard$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onLinked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Function0<Unit> function0) {
            super(0);
            this.$context = context;
            this.$onLinked = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, HatchScreen.CHANNELS_MESSENGER, HatchComponent.ACCOUNTS_CENTER_BUTTON, null, null, null);
            CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(this.$context, HatchAccountLinkingTarget.MESSENGER, false, this.$onLinked, CcvBloksHelperKt.AnonymousClass2.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        auraButtonGroupStyleByScope.mo2448buttonIiUgNnk(R.string._name_removed__res_0x7f120ce8, null, null, null, true, false, null, new AnonymousClass1(this.$context, this.$onLinked), null, null, BRg.A00, AuraHaptics.BUTTON_TAP);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessengerSettingsScreenKt$AddFacebookProfileCard$1$1$1(Context context, Function0<Unit> function0) {
        super(1);
        this.$context = context;
        this.$onLinked = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
