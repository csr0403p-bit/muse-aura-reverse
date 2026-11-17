package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DRs {
    public long A00;
    public boolean A01;
    public final String A04;
    public final String A05;
    public final Object A03 = C3cG.A0T();
    public final Map<Long, C5060DSc> A06 = BV4.A0u();
    public final C1685AoO<C5060DSc> A02 = new C1685AoO<>(10);

    public static final String A00(DRs dRs) {
        String str;
        String strA0M = dRs.A04;
        if (!strA0M.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
            strA0M = FGI.A0M(strA0M, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        }
        String strA0M2 = FGI.A0M(strA0M, "mobileconfig/");
        String str2 = dRs.A05;
        int length = str2.length();
        StringBuilder sbA0w = C60O.A0w();
        if (length == 0) {
            sbA0w.append(strA0M2);
            str = "mc_silent_push.json";
        } else {
            sbA0w.append(strA0M2);
            sbA0w.append("mc_silent_push_");
            sbA0w.append(str2);
            str = ".json";
        }
        sbA0w.append(str);
        return sbA0w.toString();
    }

    public DRs(String str, String str2) {
        this.A04 = str;
        this.A05 = str2;
    }
}
