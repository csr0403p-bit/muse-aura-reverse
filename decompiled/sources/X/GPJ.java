package X;

/* loaded from: classes6.dex */
public abstract class GPJ extends Enum<GPJ> {
    public final String wireValue;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "exact_match";
            case 2:
                return "blank_offer_intent";
            case 3:
                return "missing_base_plan";
            case 4:
                return "google_no_match";
            case 5:
                return "empty_offer_token";
            case 6:
                return "duplicate_offer";
            case 7:
                return "missing_pricing_phase";
            case 8:
                return "unsupported_offer_product";
            case 9:
                return "sku_mismatch";
            default:
                return "base_plan_intended";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EXACT_MATCH";
            case 2:
                return "BLANK_INTENT";
            case 3:
                return "MISSING_BASE_PLAN";
            case 4:
                return "MISSING_OFFER";
            case 5:
                return "EMPTY_TOKEN";
            case 6:
                return "DUPLICATE_OFFER";
            case 7:
                return "MISSING_PRICING_PHASE";
            case 8:
                return "UNSUPPORTED_PRODUCT";
            case 9:
                return "SKU_MISMATCH";
            default:
                return "BASE_PLAN";
        }
    }
}
