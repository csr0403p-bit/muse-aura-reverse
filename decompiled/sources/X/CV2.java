package X;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class CV2 implements CVE {
    public final Map<String, CV4> A00 = C60O.A1C();
    public final LinkedBlockingQueue A01 = new LinkedBlockingQueue();

    @Override // X.CVE
    public final synchronized CVI AHC(String str) {
        CV4 cv4;
        Map<String, CV4> map = this.A00;
        cv4 = map.get(str);
        if (cv4 == null) {
            cv4 = new CV4(str, this.A01);
            map.put(str, cv4);
        }
        return cv4;
    }
}
