package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.G0U;
import X.G0W;
import android.content.Context;
import com.facebook.aura.subscription.repo.SubscriptionManagementAction;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ String $billingSubtitle;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isCancelling;
    public final /* synthetic */ boolean $isResubscribing;
    public final /* synthetic */ G0U<SubscriptionManagementCta, Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onManagePayment;
    public final /* synthetic */ Function0<Unit> $onOpenPaywall;
    public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
    public final /* synthetic */ Function0<Unit> $onResubscribe;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ SubscriptionManagementCta $row;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionManagementAction.values().length];
            try {
                AnonymousClass002.A13(SubscriptionManagementAction.CANCEL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionManagementAction.REACTIVATE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1$1$1(SubscriptionManagementCta subscriptionManagementCta, Map<String, String> map, String str, boolean z, boolean z2, Function0<Unit> function0, G0U<? super SubscriptionManagementCta, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, Context context, Function0<Unit> function04, Function0<Unit> function05) {
        super(3);
        this.$row = subscriptionManagementCta;
        this.$subscriptionMetadata = map;
        this.$billingSubtitle = str;
        this.$isCancelling = z;
        this.$isResubscribing = z2;
        this.$onManagePayment = function0;
        this.$onCancel = g0u;
        this.$onResubscribe = function02;
        this.$onRetry = function03;
        this.$context = context;
        this.$onOpenPaywall = function04;
        this.$onRedeemComplimentary = function05;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.C07C r23, X.BFM r24, int r25) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1$1$1.invoke(X.07C, X.BFM, int):void");
    }
}
