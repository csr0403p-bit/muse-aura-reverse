package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EWk {
    public final /* synthetic */ C6711EWr A00;
    public final /* synthetic */ C6709EWo A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Iterator A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;

    public EWk(C6711EWr c6711EWr, C6709EWo c6709EWo, String str, Iterator it, Map map, Map map2) {
        this.A01 = c6709EWo;
        this.A05 = map;
        this.A02 = str;
        this.A03 = it;
        this.A04 = map2;
        this.A00 = c6711EWr;
    }

    public final void A00(String str, Throwable th) {
        if (th != null) {
            C6709EWo c6709EWo = this.A01;
            EWe.A03(c6709EWo.A00, c6709EWo.A01, null, th, c6709EWo.A03);
        } else {
            Map map = this.A05;
            map.put(this.A02, str);
            AbstractC6705EWj.A01(this.A00, this.A01, this.A03, this.A04, map);
        }
    }
}
