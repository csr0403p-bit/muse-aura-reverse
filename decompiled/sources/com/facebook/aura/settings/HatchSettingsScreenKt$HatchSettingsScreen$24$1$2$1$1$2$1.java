package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BL5;
import X.C1BO;
import X.C2BR;
import X.C7384Etj;
import X.C98f;
import X.G0U;
import com.facebook.aura.analytics.waterfall.HatchNMEEntrypointLogger;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1$2$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ C1BO<AuraSubscriptionUsageViewModel.UiState> $subscriptionUiState$delegate;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1$2$1$1, reason: invalid class name */
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
        new HatchNMEEntrypointLogger(null, 1, null).logImpression(C98f.A04, HatchSettingsScreenKt.entrypointViewerData(this.$subscriptionUiState$delegate.getValue()));
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        C7384Etj.A0Y(anonymousClass1, 0);
        return new BL5(anonymousClass1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1$2$1(C1BO<? extends AuraSubscriptionUsageViewModel.UiState> c1bo) {
        super(1);
        this.$subscriptionUiState$delegate = c1bo;
    }
}
