package com.facebook.aura.subscription.model;

import X.AnonymousClass002;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionManagementAction;

/* loaded from: classes.dex */
public abstract class AuraSubscriptionActionsKt {
    public static final PurchaseBlock purchaseBlock(SubscriptionDetails subscriptionDetails, boolean z) {
        if (subscriptionDetails == null || !z) {
            return null;
        }
        if (subscriptionDetails.isCrossPlatform) {
            return PurchaseBlock.CROSS_PLATFORM;
        }
        if (subscriptionDetails.isNewSubscriptionBlocked) {
            return PurchaseBlock.INELIGIBLE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.subscription.model.SubscriptionActions resolveSubscriptionActions(com.facebook.aura.subscription.repo.SubscriptionManagementActions r14, boolean r15, boolean r16) {
        /*
            r6 = 0
            r9 = r15
            r7 = r16
            if (r14 != 0) goto L18
            if (r15 == 0) goto L15
            com.facebook.aura.subscription.model.SubscriptionEntryPointDestination r10 = com.facebook.aura.subscription.model.SubscriptionEntryPointDestination.MANAGE_SUBSCRIPTION
        La:
            r5 = 0
            X.AHI r8 = X.AHI.A01
            com.facebook.aura.subscription.model.SubscriptionActions r4 = new com.facebook.aura.subscription.model.SubscriptionActions
            r6 = r5
            r11 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L15:
            com.facebook.aura.subscription.model.SubscriptionEntryPointDestination r10 = com.facebook.aura.subscription.model.SubscriptionEntryPointDestination.UPGRADE
            goto La
        L18:
            com.facebook.aura.subscription.repo.SubscriptionManagementCta r5 = r14.primaryCta
            if (r5 == 0) goto L23
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r1 = r5.action
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r0 = com.facebook.aura.subscription.repo.SubscriptionManagementAction.CLAIM_META_HOME_LINK
            r10 = r5
            if (r1 != r0) goto L24
        L23:
            r10 = r6
        L24:
            java.util.List r1 = X.AbstractC0885AGm.A0z(r5)
            X.AHD<com.facebook.aura.subscription.repo.SubscriptionManagementCta> r0 = r14.rows
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0P(r0, r1)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.subscription.repo.SubscriptionManagementCta r0 = (com.facebook.aura.subscription.repo.SubscriptionManagementCta) r0
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r0 = r0.action
            X.AnonymousClass006.A1P(r0, r1, r4, r3)
            goto L3c
        L4f:
            java.util.Iterator r2 = r3.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r11 = r2.next()
            r0 = r11
            com.facebook.aura.subscription.repo.SubscriptionManagementCta r0 = (com.facebook.aura.subscription.repo.SubscriptionManagementCta) r0
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r1 = r0.action
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r0 = com.facebook.aura.subscription.repo.SubscriptionManagementAction.BUY_TOPUP
            if (r1 != r0) goto L53
        L66:
            com.facebook.aura.subscription.repo.SubscriptionManagementCta r11 = (com.facebook.aura.subscription.repo.SubscriptionManagementCta) r11
            if (r5 == 0) goto La5
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r0 = r5.action
        L6c:
            com.facebook.aura.subscription.model.SubscriptionEntryPointDestination r15 = entryPointDestination(r0, r15)
            if (r10 == 0) goto La2
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r0 = r10.action
            if (r0 == 0) goto La2
            com.facebook.aura.subscription.model.SubscriptionMeterDestination r16 = meterDestination(r0)
        L7a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L83:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.aura.subscription.repo.SubscriptionManagementCta r0 = (com.facebook.aura.subscription.repo.SubscriptionManagementCta) r0
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r1 = r0.action
            if (r10 == 0) goto La0
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r0 = r10.action
        L96:
            if (r1 == r0) goto L83
            com.facebook.aura.subscription.repo.SubscriptionManagementAction r0 = com.facebook.aura.subscription.repo.SubscriptionManagementAction.BUY_TOPUP
            if (r1 == r0) goto L83
            r4.add(r2)
            goto L83
        La0:
            r0 = r6
            goto L96
        La2:
            r16 = r6
            goto L7a
        La5:
            r0 = r6
            goto L6c
        La7:
            r11 = r6
            goto L66
        La9:
            X.AHD r13 = X.AGI.A07(r4)
            r14 = 0
            com.facebook.aura.subscription.model.SubscriptionActions r4 = new com.facebook.aura.subscription.model.SubscriptionActions
            r9 = r4
            r12 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionActionsKt.resolveSubscriptionActions(com.facebook.aura.subscription.repo.SubscriptionManagementActions, boolean, boolean):com.facebook.aura.subscription.model.SubscriptionActions");
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionManagementAction.values().length];
            try {
                AnonymousClass002.A13(SubscriptionManagementAction.REACTIVATE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionManagementAction.REDEEM_COMPLIMENTARY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SubscriptionEntryPointDestination entryPointDestination(SubscriptionManagementAction subscriptionManagementAction, boolean z) {
        return subscriptionManagementAction == SubscriptionManagementAction.REDEEM_COMPLIMENTARY ? SubscriptionEntryPointDestination.REDEEM_COMPLIMENTARY : z ? SubscriptionEntryPointDestination.MANAGE_SUBSCRIPTION : SubscriptionEntryPointDestination.UPGRADE;
    }

    public static final SubscriptionMeterDestination meterDestination(SubscriptionManagementAction subscriptionManagementAction) {
        int iOrdinal = subscriptionManagementAction.ordinal();
        return iOrdinal != 6 ? iOrdinal != 10 ? SubscriptionMeterDestination.PAYWALL : SubscriptionMeterDestination.REDEEM_COMPLIMENTARY : SubscriptionMeterDestination.RESUBSCRIBE;
    }
}
