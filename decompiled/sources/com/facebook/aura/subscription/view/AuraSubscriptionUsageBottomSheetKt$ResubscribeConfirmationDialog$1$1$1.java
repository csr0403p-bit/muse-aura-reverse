package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$ResubscribeConfirmationDialog$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onConfirm;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$ResubscribeConfirmationDialog$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, String> map, Function0<Unit> function0) {
            super(0);
            this.$subscriptionMetadata = map;
            this.$onConfirm = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.RESUME_SUBSCRIPTION_DIALOG, HatchComponent.RESUBSCRIBE_CONFIRM_BUTTON, null, this.$subscriptionMetadata, null);
            this.$onConfirm.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$ResubscribeConfirmationDialog$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Map<String, String> map, Function0<Unit> function0) {
            super(0);
            this.$subscriptionMetadata = map;
            this.$onDismiss = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.RESUME_SUBSCRIPTION_DIALOG, HatchComponent.RESUBSCRIBE_DISMISS_BUTTON, null, this.$subscriptionMetadata);
            this.$onDismiss.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$subscriptionMetadata, this.$onConfirm);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(R.string._name_removed__res_0x7f1210bd, (Object[]) null, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, (Function0<Unit>) anonymousClass1, (String) null, (BRg) bs0);
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f1206f0, null, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$subscriptionMetadata, this.$onDismiss), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$ResubscribeConfirmationDialog$1$1$1(Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$subscriptionMetadata = map;
        this.$onConfirm = function0;
        this.$onDismiss = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
