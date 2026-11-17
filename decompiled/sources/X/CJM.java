package X;

import android.os.Bundle;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class CJM implements Runnable {
    public static final String __redex_internal_original_name = "zzy";
    public final /* synthetic */ CEU A00;
    public final /* synthetic */ CJL A01;

    public CJM(CEU ceu, CJL cjl) {
        this.A01 = cjl;
        this.A00 = ceu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CJ6 cj6 = this.A01.A00;
        CEU ceu = this.A00;
        List list = ceu.A00;
        List list2 = ceu.A01;
        ArrayList arrayListA0t = C60Q.A0t(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayListA0t.add(((Locale) it.next()).toLanguageTag());
        }
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putInt("session_id", 0);
        bundleA0N.putInt(AuraDeeplinkRouteMapper.STATUS_ROUTE, 5);
        bundleA0N.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundleA0N.putStringArrayList("module_names", BV4.A0t(list));
        }
        if (!arrayListA0t.isEmpty()) {
            bundleA0N.putStringArrayList("languages", BV4.A0t(arrayListA0t));
        }
        bundleA0N.putLong("total_bytes_to_download", 0L);
        bundleA0N.putLong("bytes_downloaded", 0L);
        cj6.A01(CJN.A00(bundleA0N));
    }
}
