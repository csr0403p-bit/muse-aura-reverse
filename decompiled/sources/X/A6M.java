package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class A6M {
    public final A6F A00;
    public final Map<String, BLG<Object>> A01;
    public final Map<String, BLG<Object>> A02;
    public final Map<String, A6F> A03;
    public final Map<String, Object> A04;

    public final <T> void A00(String str, T t) {
        C7384Etj.A0Y(str, 0);
        this.A04.put(str, t);
        BLG<Object> blg = this.A01.get(str);
        if (blg != null) {
            blg.Af8(t);
        }
        BLG<Object> blg2 = this.A02.get(str);
        if (blg2 != null) {
            blg2.Af8(t);
        }
    }

    public A6M(Map<String, ? extends Object> map) {
        this.A04 = new LinkedHashMap(map);
        this.A03 = C3cG.A0j();
        this.A01 = C3cG.A0j();
        this.A02 = C3cG.A0j();
        this.A00 = new C2306BTg(this, 1);
    }

    public A6M() {
        this(C9jH.A00);
    }
}
