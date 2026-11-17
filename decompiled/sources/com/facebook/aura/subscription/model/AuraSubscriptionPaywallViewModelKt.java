package com.facebook.aura.subscription.model;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.SubscriptionChangeDirection;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraSubscriptionPaywallViewModelKt {
    public static final String CLAIM_COMPLIMENTARY_ACTION = "claim_complimentary";
    public static final String CLAIM_PRESENTATION_ID = "activation_complimentary_claim";
    public static final String PAYWALL_LOAD_OPERATION = "load_paywall";
    public static final String TAG = "AuraSubscriptionPaywallViewModel";

    public static final boolean isClaimActive(ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState) {
        C7384Etj.A0Y(complimentarySubscriptionRedemptionState, 0);
        return complimentarySubscriptionRedemptionState == ComplimentarySubscriptionRedemptionState.LOADING || complimentarySubscriptionRedemptionState == ComplimentarySubscriptionRedemptionState.COMPLETED;
    }

    public static final PlanPickerGateState planPickerGateState(SubscriptionDetails subscriptionDetails, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState) {
        PurchaseBlock purchaseBlock = AuraSubscriptionActionsKt.purchaseBlock(subscriptionDetails, true);
        if (purchaseBlock == PurchaseBlock.CROSS_PLATFORM && isClaimActive(complimentarySubscriptionRedemptionState)) {
            purchaseBlock = null;
        }
        return new PlanPickerGateState(complimentarySubscriptionRedemptionState, subscriptionDetails, purchaseBlock);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionChangeDirection.values().length];
            try {
                AnonymousClass002.A13(SubscriptionChangeDirection.UPGRADE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionChangeDirection.DOWNGRADE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SubscriptionChangeDirection.CROSSGRADE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(SubscriptionChangeDirection.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isRenderable(SubscriptionProduct subscriptionProduct) {
        int iA0M = AnonymousClass003.A0M(subscriptionProduct.changeDirection);
        if (iA0M == -1 || iA0M == 0 || iA0M == 1) {
            return true;
        }
        if (iA0M == 2 || iA0M == 3) {
            return false;
        }
        throw C3cG.A0q();
    }

    public static final PaywallCta resolvePaywallCta(boolean z, SubscriptionProduct subscriptionProduct) {
        int iOrdinal;
        if (subscriptionProduct != null) {
            if (!z) {
                return PaywallCta.PayNow;
            }
            SubscriptionChangeDirection subscriptionChangeDirection = subscriptionProduct.changeDirection;
            if (subscriptionChangeDirection != null && (iOrdinal = subscriptionChangeDirection.ordinal()) != -1) {
                if (iOrdinal == 0) {
                    return PaywallCta.Upgrade;
                }
                if (iOrdinal == 1) {
                    return PaywallCta.Downgrade;
                }
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw C3cG.A0q();
                }
            }
        }
        return PaywallCta.CurrentPlan;
    }

    public static final Disclaimer resolvePaywallDisclaimer(SubscriptionProduct subscriptionProduct, Disclaimer disclaimer) {
        Disclaimer disclaimer2;
        return (subscriptionProduct == null || (disclaimer2 = subscriptionProduct.purchaseDisclaimer) == null) ? disclaimer : disclaimer2;
    }

    public static final SubscriptionProduct findDefaultSelectedProduct(List<SubscriptionProduct> list, SubscriptionProduct subscriptionProduct, String str) {
        SubscriptionProduct subscriptionProduct2;
        SubscriptionProduct next;
        Iterator<SubscriptionProduct> it = list.iterator();
        while (true) {
            subscriptionProduct2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.productId, str)) {
                break;
            }
        }
        SubscriptionProduct subscriptionProduct3 = next;
        if (subscriptionProduct3 != null) {
            return subscriptionProduct3;
        }
        if (subscriptionProduct == null) {
            return (SubscriptionProduct) AbstractC0878AGe.A0G(list);
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SubscriptionProduct> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().changeDirection == SubscriptionChangeDirection.UPGRADE) {
                    Iterator<SubscriptionProduct> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        SubscriptionProduct next2 = it3.next();
                        if (!C7384Etj.areEqual(next2.productId, subscriptionProduct.productId)) {
                            subscriptionProduct2 = next2;
                            break;
                        }
                    }
                    return subscriptionProduct2;
                }
            }
        }
        return subscriptionProduct;
    }

    public static final List<SubscriptionProduct> orderPaywallProducts(List<SubscriptionProduct> list, SubscriptionProduct subscriptionProduct) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (SubscriptionProduct subscriptionProduct2 : list) {
            AnonymousClass006.A1O(subscriptionProduct2.productId, subscriptionProduct != null ? subscriptionProduct.productId : null, subscriptionProduct2, arrayListA0h);
        }
        return AbstractC0878AGe.A0P(AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModelKt$orderPaywallProducts$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((SubscriptionProduct) t).rank).compareTo(Integer.valueOf(((SubscriptionProduct) t2).rank));
            }
        }), AbstractC0885AGm.A0z(subscriptionProduct));
    }
}
