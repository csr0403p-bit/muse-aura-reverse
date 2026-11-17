package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0U;
import com.facebook.aura.subscription.model.SubscriptionEntryPointDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1$1$1 extends AbstractC7559F3s implements G0U<SubscriptionEntryPointDestination, Unit> {
    public final /* synthetic */ Function0<Unit> $onRedeemComplimentaryClick;
    public final /* synthetic */ Function0<Unit> $onSubscriptionManageClick;
    public final /* synthetic */ Function0<Unit> $onSubscriptionUpgradeClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SubscriptionEntryPointDestination subscriptionEntryPointDestination) {
        Function0<Unit> function0;
        int iA0E = AnonymousClass001.A0E(subscriptionEntryPointDestination, 0);
        if (iA0E == 0) {
            function0 = this.$onSubscriptionUpgradeClick;
        } else if (iA0E == 1) {
            function0 = this.$onSubscriptionManageClick;
        } else {
            if (iA0E != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function0 = this.$onRedeemComplimentaryClick;
        }
        function0.invoke();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionEntryPointDestination.values().length];
            try {
                AnonymousClass002.A13(SubscriptionEntryPointDestination.UPGRADE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionEntryPointDestination.MANAGE_SUBSCRIPTION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SubscriptionEntryPointDestination.REDEEM_COMPLIMENTARY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1$1$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$onSubscriptionUpgradeClick = function0;
        this.$onSubscriptionManageClick = function02;
        this.$onRedeemComplimentaryClick = function03;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SubscriptionEntryPointDestination subscriptionEntryPointDestination) {
        invoke2(subscriptionEntryPointDestination);
        return Unit.INSTANCE;
    }
}
