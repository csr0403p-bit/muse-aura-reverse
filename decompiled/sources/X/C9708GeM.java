package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GeM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9708GeM extends AbstractC7559F3s implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ String $launchedSku;
    public final /* synthetic */ C9720GeY $paymentLogContext;
    public final /* synthetic */ C9698Ge3 $purchaseParams;
    public final /* synthetic */ C9661Gd3 $quoteContext;
    public final /* synthetic */ C9699Ge6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9708GeM(C9699Ge6 c9699Ge6, C9720GeY c9720GeY, C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3, String str) {
        super(0);
        this.this$0 = c9699Ge6;
        this.$purchaseParams = c9698Ge3;
        this.$launchedSku = str;
        this.$quoteContext = c9661Gd3;
        this.$paymentLogContext = c9720GeY;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Map<String, ? extends String> invoke() {
        String str;
        C9699Ge6 c9699Ge6 = this.this$0;
        C9698Ge3 c9698Ge3 = this.$purchaseParams;
        HxE hxEA0r = C3cG.A0r("product_id", c9698Ge3 != null ? c9698Ge3.A08 : null);
        String str2 = this.$launchedSku;
        if (str2 == null) {
            C9661Gd3 c9661Gd3 = this.$quoteContext;
            str2 = c9661Gd3 != null ? c9661Gd3.A05 : null;
        }
        HxE hxEA0r2 = C3cG.A0r("external_product_id", str2);
        HxE hxEA0r3 = C3cG.A0r("product_session_id", null);
        if (c9698Ge3 == null || (str = c9698Ge3.A09) == null) {
            str = "ALL_PRODUCTS";
        }
        HxE hxEA0r4 = C3cG.A0r("product_type", HVr.A00(str).mValue);
        C9661Gd3 c9661Gd32 = this.$quoteContext;
        C9700GeE c9700GeEA0J = c9699Ge6.A0J(AbstractC7608F5v.A16(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, C3cG.A0r("quote_id", c9661Gd32 != null ? c9661Gd32.A07 : null)));
        C9700GeE.A00(c9700GeEA0J, this.$paymentLogContext, this.$purchaseParams, this.$quoteContext, null, null);
        return c9700GeEA0J.A01;
    }
}
