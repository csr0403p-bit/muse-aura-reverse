package X;

import android.content.Context;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class CGP {
    public static final C06827l3 A04 = C06827l3.A02("[\r\n]+");
    public final LinkedBlockingQueue<String> A00;
    public final boolean A01;
    public final InterfaceC7539F0o A02;
    public final G0U<Long, Integer> A03;

    /* JADX WARN: Multi-variable type inference failed */
    public CGP(Context context, InterfaceC7539F0o interfaceC7539F0o, G0U<? super Long, Integer> g0u) {
        C7384Etj.A0Y(context, 0);
        C7384Etj.A0Y(g0u, 2);
        this.A02 = interfaceC7539F0o;
        this.A03 = g0u;
        this.A00 = new LinkedBlockingQueue<>();
        boolean zEquals = "true".equals(C9X.A01("log_mobile_config_usage", true, false));
        this.A01 = zEquals;
        CFK.A0H("E2EMobileConfigAccessListenerImpl", "Mobile Config usage logging is %s", zEquals ? "enabled" : "disabled");
        if (zEquals) {
            new Thread(new CGQ(this, context.openFileOutput("mobile_config_usage.csv", 32768))).start();
        }
    }

    public final void A00(String str, String str2, long j) {
        C7384Etj.A0Y(str2, 5);
        if (this.A01) {
            long jNow = this.A02.now();
            int iIntValue = this.A03.invoke(Long.valueOf(j)).intValue();
            int iA00 = CA5.A00(j);
            String strA0z = AbstractC2159Azp.A0z(A04.A03(str2, InviteCodeScratcherKt.CODE_SEPARATOR), "\"", "\"\"");
            if (str == null) {
                str = "";
            }
            String strA0z2 = AbstractC2159Azp.A0z(str, "\"", "\"\"");
            StringBuilder sb = new StringBuilder();
            sb.append(jNow);
            sb.append(",");
            sb.append(iIntValue);
            sb.append(",");
            sb.append(iA00);
            sb.append(",\"");
            sb.append(strA0z);
            sb.append("\",\"");
            sb.append(strA0z2);
            sb.append("\"\r\n");
            this.A00.add(sb.toString());
        }
    }
}
