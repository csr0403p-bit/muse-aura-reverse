package com.facebook.aura.subscription.repo;

import X.AbstractC06907md;
import X.AbstractC0852A5y;
import X.AnonymousClass002;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C7BY;
import X.C9sU;
import X.CFK;
import X.F24;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.subscription.repo.RedeemComplimentarySubscriptionResult;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class AuraSubscriptionRepositoryKt {
    public static final long DEFAULT_SUBSCRIPTION_FRESHNESS = AbstractC0852A5y.A01(F24.A07, 30);
    public static final String INVALID_NAME_ERROR_TYPE = "invalidName";
    public static final long POST_PURCHASE_INITIAL_BACKOFF_MS = 1000;
    public static final int POST_PURCHASE_MAX_ATTEMPTS = 10;
    public static final long POST_PURCHASE_MAX_BACKOFF_MS = 4000;
    public static final String TAG = "AuraSubscriptionRepository";
    public static final String UNTYPED_FAILURE_REASON = "untyped";

    public static final String nameFailureReason(Throwable th, HatchApiErrorJson hatchApiErrorJson) {
        String str;
        int i;
        if (hatchApiErrorJson == null || (str = hatchApiErrorJson.type) == null || C7BY.A0j(str)) {
            NetworkException networkException = th instanceof NetworkException ? (NetworkException) th : null;
            str = UNTYPED_FAILURE_REASON;
            if (networkException != null && (i = networkException.httpResponseCode) > 0) {
                return FGI.A0H("untyped_", i);
            }
        }
        return str;
    }

    public static final long postPurchaseBackoffMs(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 16) {
            i = 16;
        }
        long j = 1000 << i;
        if (j > 4000) {
            return 4000L;
        }
        return j;
    }

    public static final long getDEFAULT_SUBSCRIPTION_FRESHNESS() {
        return DEFAULT_SUBSCRIPTION_FRESHNESS;
    }

    public static final boolean isHomeLinkClaim(SubscriptionManagementCta subscriptionManagementCta) {
        return AnonymousClass002.A1Z(subscriptionManagementCta.action, SubscriptionManagementAction.CLAIM_META_HOME_LINK);
    }

    public static final boolean isProvisioning(SubscriptionDetailsState subscriptionDetailsState) {
        SubscriptionDetailsState.Success success;
        SubscriptionDetails subscriptionDetails;
        HatchSubscriptionStatus hatchSubscriptionStatus = null;
        if ((subscriptionDetailsState instanceof SubscriptionDetailsState.Success) && (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) != null && (subscriptionDetails = success.details) != null) {
            hatchSubscriptionStatus = subscriptionDetails.subscriptionStatus;
        }
        return AnonymousClass002.A1Z(hatchSubscriptionStatus, HatchSubscriptionStatus.PROVISIONING);
    }

    public static final boolean isSettledAfterPurchase(SubscriptionDetailsState subscriptionDetailsState, String str) {
        SubscriptionDetails subscriptionDetails;
        HatchSubscriptionStatus hatchSubscriptionStatus;
        SubscriptionDetailsState.Success success = subscriptionDetailsState instanceof SubscriptionDetailsState.Success ? (SubscriptionDetailsState.Success) subscriptionDetailsState : null;
        if (success == null || (subscriptionDetails = success.details) == null || (hatchSubscriptionStatus = subscriptionDetails.subscriptionStatus) == HatchSubscriptionStatus.PROVISIONING || hatchSubscriptionStatus == HatchSubscriptionStatus.EXPIRED) {
            return false;
        }
        return str == null || str.equals(subscriptionDetails.tierId) || subscriptionDetails.pendingDowngradeEffectiveAt != null;
    }

    public static final void recordServerFailure(String str, Throwable th, String str2) {
        String str3;
        NetworkException networkException = null;
        String strA0Y = (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) ? C3cI.A0Y(th) : FGI.A0H("http_", networkException.httpResponseCode);
        StringBuilder sbA0w = C60O.A0w();
        if (str2 != null) {
            sbA0w.append(FGI.A0M(str2, InviteCodeScratcherKt.CODE_SEPARATOR));
        }
        if (networkException != null && (str3 = networkException.errorCode) != null) {
            sbA0w.append(FGI.A0M("errorCode=", str3));
        }
        String strA0l = AnonymousClass002.A0l(sbA0w.toString());
        CFK.A06(TAG, FGI.A0d(str, " failed: ", strA0Y, strA0l.length() == 0 ? "" : C60O.A0r(" (", strA0l)));
    }

    public static final RedeemComplimentarySubscriptionResult redeemFailureOutcome(Throwable th) {
        NetworkException networkException;
        return ((th instanceof NetworkException) && (networkException = (NetworkException) th) != null && AnonymousClass002.A1b(networkException.serverRetryable, false)) ? RedeemComplimentarySubscriptionResult.Failed.INSTANCE : RedeemComplimentarySubscriptionResult.Ambiguous.INSTANCE;
    }

    public static final HatchApiErrorJson serverErrorBody(Throwable th) {
        if (!(th instanceof NetworkException) || th == null) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return (HatchApiErrorJson) c9sU.A00(message, HatchApiErrorJson$$serializer.INSTANCE);
        } catch (SerializationException e) {
            CFK.A06(TAG, FGI.A0M("Stefi error body did not decode: ", C3cI.A0Y(e)));
            return null;
        }
    }

    public static final String summarize(SubscriptionManagementActions subscriptionManagementActions) {
        SubscriptionManagementAction subscriptionManagementAction;
        if (subscriptionManagementActions == null) {
            return "(server sent none)";
        }
        String strA01 = AbstractC06907md.A01(", ", subscriptionManagementActions.rows, AuraSubscriptionRepositoryKt$summarize$rowActions$1.INSTANCE);
        if (strA01.length() == 0) {
            strA01 = "(empty)";
        }
        SubscriptionManagementCta subscriptionManagementCta = subscriptionManagementActions.primaryCta;
        return FGI.A0h("primary=", (subscriptionManagementCta == null || (subscriptionManagementAction = subscriptionManagementCta.action) == null) ? "(none)" : subscriptionManagementAction.name(), " rows=[", strA01, "]");
    }

    public static final String summarize(CurrencyAmount currencyAmount) {
        Object obj = "(none)";
        if (currencyAmount == null) {
            return "(none)";
        }
        Object obj2 = currencyAmount.amount;
        if (obj2 != null) {
            obj = obj2;
        }
        String str = currencyAmount.currency;
        if (str == null) {
            str = "(no currency)";
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(obj);
        return C60P.A1M(InviteCodeScratcherKt.CODE_SEPARATOR, str, sbA0w);
    }
}
