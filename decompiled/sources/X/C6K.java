package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.acra.util.InputStreamField;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class C6K extends C4O {
    public static final String __redex_internal_original_name = "DirectReportInternal$2";
    public final /* synthetic */ C6E A00;
    public final /* synthetic */ Map A01;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.HashMap] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            C6E c6e = this.A00;
            if (c6e.A00 == null) {
                List<String> list = C3280C7k.A04;
                c6e.A00 = new C3280C7k(C7Je.A01(c6e.A01), new CCY(), null, "Android");
            }
            Map map = this.A01;
            Properties properties = new Properties();
            properties.putAll(map);
            properties.put(C6B.A8A.name, "android_large_soft_error");
            synchronized (C6E.A05) {
                if (!C6E.A04) {
                    C6E.A04 = true;
                }
            }
            try {
                ?? A00 = C6R.A00();
                if (A00.containsKey("ig.ig_server_rev_hash")) {
                    properties.put(C6B.A7E.name, A00.get("ig.ig_server_rev_hash"));
                }
                if (A00.containsKey("fb.maui_command_id")) {
                    properties.put(C6B.A8H.name, A00.get("fb.maui_command_id"));
                }
                if (A00.containsKey(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP)) {
                    properties.put(C6B.AA1.name, A00.get(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP));
                    if (A00.containsKey("fb.testing.build_target")) {
                        properties.put(C6B.A8p.name, A00.get("fb.testing.build_target"));
                    }
                }
            } catch (IOException e) {
                C2Q.A00().AT9("DirectReportSource", e, null);
                CFK.A0K(C9Y.TAG, e, "Failed to read report source ref");
            }
            HashMap mapA0u = BV4.A0u();
            c6e.A00.A00(new C4P(properties), mapA0u, 1);
            Iterator itA0x = BV5.A0x(mapA0u);
            while (itA0x.hasNext()) {
                ((InputStreamField) itA0x.next()).mInputStream.close();
            }
        } catch (Exception e2) {
            C2Q.A00().AT9("DirectSend", e2, null);
            CFK.A08(C9Y.TAG, "Failed to send direct report", e2);
        }
    }

    public C6K(C6E c6e, Map map) {
        this.A01 = map;
        this.A00 = c6e;
    }
}
