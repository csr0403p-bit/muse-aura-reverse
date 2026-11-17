package X;

import java.util.Map;

/* renamed from: X.Hng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10503Hng {
    public final String A00;
    public final Map<String, Long> A02 = C3cG.A0j();
    public final Map<String, String> A01 = C3cG.A0j();

    public final void A01(String str, long j) {
        this.A02.put(FGI.A0U(this.A00, "_", str), Long.valueOf(j));
    }

    public final void A02(String str, String str2) {
        this.A01.put(FGI.A0U(this.A00, "_", str), str2);
    }

    public AbstractC10503Hng(String str) {
        this.A00 = str;
    }

    public static HrX A00(AbstractC10503Hng abstractC10503Hng, String str, String str2) {
        abstractC10503Hng.A02(str, str2);
        return new HrX(AGH.A0A(abstractC10503Hng.A02), AGH.A0A(abstractC10503Hng.A01));
    }
}
