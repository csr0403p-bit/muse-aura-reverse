package X;

import android.text.Spanned;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FYY extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FYY() {
        super(1);
        this.$t = 3;
        this.A03 = "Warm up";
        this.A04 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.AbstractMap, java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.AbstractMap, java.util.TreeMap] */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2;
        String string;
        Object obj2;
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(obj, 0);
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.A00;
                if (!atomicBoolean.get() && ((AtomicBoolean) this.A01).compareAndSet(false, true) && atomicBoolean.compareAndSet(false, true)) {
                    ((G0U) this.A02).invoke(obj);
                }
                return Unit.INSTANCE;
            case 1:
                EVS evs = (EVS) obj;
                C9699Ge6 c9699Ge6 = (C9699Ge6) this.A04;
                C9698Ge3 c9698Ge3 = (C9698Ge3) this.A03;
                if (c9698Ge3 == null || (str = c9698Ge3.A04) == null) {
                    str = c9699Ge6.A0B;
                }
                AbstractC7607F5u.A1L(evs, str);
                if (c9698Ge3 == null || (str2 = c9698Ge3.A09) == null) {
                    str2 = "ALL_PRODUCTS";
                }
                HVr.A01(evs, str2);
                AbstractC7607F5u.A1K(evs, this.A02);
                C9580GPr c9580GPr = (C9580GPr) this.A00;
                String str3 = c9580GPr.A00;
                if (str3 != null) {
                    evs.A03("error_code", str3);
                }
                evs.A03(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, c9580GPr.A01);
                evs.A04((Map) this.A01);
                return evs;
            case 2:
                EVS evs2 = (EVS) obj;
                InterfaceC9725Ged interfaceC9725Ged = (InterfaceC9725Ged) this.A00;
                String strAMI = interfaceC9725Ged.AMI();
                if (strAMI == null) {
                    C9699Ge6 c9699Ge62 = (C9699Ge6) this.A04;
                    C9698Ge3 c9698Ge3AJG = interfaceC9725Ged.AJG();
                    if (c9698Ge3AJG == null || (strAMI = c9698Ge3AJG.A04) == null) {
                        strAMI = c9699Ge62.A0B;
                    }
                }
                AbstractC7607F5u.A1L(evs2, strAMI);
                HVr.A01(evs2, interfaceC9725Ged.AJA());
                AbstractC7607F5u.A1K(evs2, this.A03);
                evs2.A04((Map) this.A01);
                GraphQlCallInput graphQlCallInput = (GraphQlCallInput) this.A02;
                Object obj3 = graphQlCallInput.A05().get(ReplyAttributionSerializer.TYPE_MESSAGE);
                if (obj3 == null || (string = obj3.toString()) == null) {
                    string = "";
                }
                evs2.A03(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, string);
                Object obj4 = graphQlCallInput.A05().get(BrowserOperationCatalogKt.VALUE);
                obj2 = evs2;
                if (obj4 != null) {
                    String string2 = obj4.toString();
                    obj2 = evs2;
                    if (string2 != null) {
                        obj2 = evs2;
                        if (string2.length() > 0) {
                            evs2.A03("error_code", string2);
                            return evs2;
                        }
                    }
                }
                return obj2;
            default:
                C7899FJt c7899FJt = (C7899FJt) obj;
                C7384Etj.A0Y(c7899FJt, 0);
                CharSequence charSequence = (CharSequence) this.A03;
                if (charSequence instanceof Spanned) {
                    C7384Etj.A0U(((Spanned) charSequence).getSpans(0, charSequence.length(), FRR.class));
                }
                Object obj5 = Unit.INSTANCE;
                c7899FJt.A00(new C8630Fhh(8), new Object[]{obj5});
                c7899FJt.A01(new C8633Fhk(1), new Object[]{obj5});
                c7899FJt.A02(C7903FJy.A00);
                c7899FJt.A02(C7902FJx.A00);
                c7899FJt.A02(FJw.A00);
                G0U g0u = (G0U) this.A02;
                obj2 = obj5;
                if (g0u != null) {
                    g0u.invoke(c7899FJt);
                    obj2 = obj5;
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FYY(Object obj, InterfaceC9725Ged interfaceC9725Ged, C9699Ge6 c9699Ge6, C9748Gf1 c9748Gf1, Map<String, String> map, Hzd hzd) {
        super(1);
        this.$t = hzd;
        this.A00 = c9748Gf1;
        this.A04 = c9699Ge6;
        this.A03 = obj;
        this.A01 = map;
        this.A02 = interfaceC9725Ged;
    }
}
