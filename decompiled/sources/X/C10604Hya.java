package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.List;

/* renamed from: X.Hya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10604Hya extends AbstractC10622Hzi {
    public final int $t;

    public C10604Hya(String str, String str2, String str3) {
        this.$t = 0;
        this.$t = 0;
        C7384Etj.A0Y(str2, 1);
        A08("actor_id", str);
        A08("client_mutation_id", str2);
        A08("platform", str3);
        A09("active_inuse_skus", null);
        A08(ErrorReportingConstants.APP_NAME_KEY, null);
        A08("apple_receipt", null);
        A08("country_code", null);
        A08("developer_payload", null);
        A09("existing_transaction_candidates", null);
        A08("external_product_id", null);
        A08("platform_mode", null);
        A08("play_billing_version", null);
        A08("purchase_funnel_id", null);
        A09("purchase_history", null);
        A08("quotable_id", null);
        A08("quote_uuid", null);
        A08("session_id", null);
        A07("supports_in_band_quote_errors", null);
        A09("unfinished_txn_info", null);
    }

    public C10604Hya(String str, String str2, List list) {
        this.$t = 1;
        this.$t = 1;
        A08("actor_id", str);
        A08("client_mutation_id", str2);
        A09("digital_content_purchases", list);
        A08("fulfillment_type", null);
    }
}
