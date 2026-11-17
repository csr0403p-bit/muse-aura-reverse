package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import java.util.Map;

/* renamed from: X.GeL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9707GeL {
    public static final Map<EnumC9706GeK, Hyh> A00 = AGH.A0D(A00(EnumC9706GeK.A04, "BILLING_UNAVAILABLE", "Billing API version is not supported for the type requested"), A00(EnumC9706GeK.A09, "DEVELOPER_ERROR", "Invalid arguments provided to the API"), A00(EnumC9706GeK.A0A, "ERROR", "Fatal error during the API action"), A00(EnumC9706GeK.A0B, "FEATURE_NOT_SUPPORTED", "Requested feature is not supported by Play Store on the current device"), A00(EnumC9706GeK.A0C, "ITEM_ALREADY_OWNED", "Failure to purchase since item is already owned"), A00(EnumC9706GeK.A0D, "ITEM_NOT_OWNED", "Failure to consume since item is not owned"), A00(EnumC9706GeK.A0E, "ITEM_UNAVAILABLE", "Requested product is not available for purchase"), A00(EnumC9706GeK.A0H, "OK", HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS), A00(EnumC9706GeK.A0J, "SERVICE_DISCONNECTED", "Play Store service is not connected now - potentially transient state"), A00(EnumC9706GeK.A0L, "SERVICE_UNAVAILABLE", "The service is currently unavailable"), A00(EnumC9706GeK.A0K, "SERVICE_TIMEOUT", "The service timed out while processing the request"), A00(EnumC9706GeK.A0M, "USER_CANCELED", "User pressed back or canceled a dialog"), A00(EnumC9706GeK.A0G, "NETWORK_ERROR", "Network connection is down"), A00(EnumC9706GeK.A02, "BILLING_CLIENT_NULL_FOR_CATALOG", "Google Billing Client is null for catalog product fetch"), A00(EnumC9706GeK.A03, "BILLING_CLIENT_NULL_FOR_HISTORY", "Google Billing Client is null for purchase history query"), A00(EnumC9706GeK.A07, "CATALOG_EMPTY_SKUS_LIST", "Catalog request had empty SKUs list"), A00(EnumC9706GeK.A08, "CATALOG_FETCH_INTERNAL_FAILURE", "Internal failure when fetching catalog details"), A00(EnumC9706GeK.A06, "CATALOG_EMPTY_QUERY_PARAMS", "Failed to fetch DCP catalog details due to empty params"), A00(EnumC9706GeK.A05, "CATALOG_EMPTY_PRODUCT_DETAILS_LIST", "Product details list is empty"), A00(EnumC9706GeK.A0I, "PAYMENT_LAUNCH_FAILURE", "Launching payment bottomsheet threw failure, see payment failed logs"), A00(EnumC9706GeK.A0F, "MOCK_FAILURE", "Mock purchase failed during development/testing"));

    public static HxE A00(Object obj, String str, String str2) {
        return new HxE(obj, new Hyh(str, str2));
    }
}
