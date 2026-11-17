package X;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bym, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3122Bym {
    public final Map<String, Object> A01 = BV4.A0u();
    public final List<String> A00 = C3cG.A0h();

    public static void A00(Uri uri, C3122Bym c3122Bym) {
        if (uri == null) {
            c3122Bym.A00.add("exo_redir");
            c3122Bym.A01.remove("exo_redir");
            return;
        }
        String string = uri.toString();
        Map<String, Object> map = c3122Bym.A01;
        string.getClass();
        map.put("exo_redir", string);
        c3122Bym.A00.remove("exo_redir");
    }

    public static void A01(C3122Bym c3122Bym, long j) {
        c3122Bym.A01.put("exo_len", Long.valueOf(j));
        c3122Bym.A00.remove("exo_len");
    }
}
