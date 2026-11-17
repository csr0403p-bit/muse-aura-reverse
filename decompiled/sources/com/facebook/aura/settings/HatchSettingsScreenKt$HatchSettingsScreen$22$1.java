package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0U;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.HatchSettingsSubdestination;
import com.facebook.aura.utils.HatchUtil;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$22$1 extends AbstractC7559F3s implements G0U<HatchSettingsSubdestination, Function0<? extends Unit>> {
    public final /* synthetic */ HatchSettingsConfig $config;
    public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToSubscriptionSurface;
    public final /* synthetic */ Function0<Unit> $onVoiceControlsSettingsClick;
    public final /* synthetic */ boolean $showVoiceControls;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$22$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToSubscriptionSurface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super AuraSubscriptionPage, Unit> g0u) {
            super(0);
            this.$navigateToSubscriptionSurface = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$navigateToSubscriptionSurface.invoke(AuraSubscriptionPage.Usage.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final Function0<Unit> invoke(HatchSettingsSubdestination hatchSettingsSubdestination) {
        int iA0E = AnonymousClass001.A0E(hatchSettingsSubdestination, 0);
        if (iA0E == 0) {
            if (this.$config.showSubscription && HatchUtil.INSTANCE.isSubscriptionEnabled()) {
                return new AnonymousClass1(this.$navigateToSubscriptionSurface);
            }
            return null;
        }
        if (iA0E != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.$showVoiceControls) {
            return this.$onVoiceControlsSettingsClick;
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSettingsSubdestination.values().length];
            try {
                AnonymousClass002.A13(HatchSettingsSubdestination.SUBSCRIPTIONS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSettingsSubdestination.VOICE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$22$1(HatchSettingsConfig hatchSettingsConfig, boolean z, Function0<Unit> function0, G0U<? super AuraSubscriptionPage, Unit> g0u) {
        super(1);
        this.$config = hatchSettingsConfig;
        this.$showVoiceControls = z;
        this.$onVoiceControlsSettingsClick = function0;
        this.$navigateToSubscriptionSurface = g0u;
    }
}
