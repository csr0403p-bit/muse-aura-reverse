package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class CTK {
    public final /* synthetic */ C3942ChY A00;
    public final /* synthetic */ String A01;

    public final void A00(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            C3942ChY.A01(this.A00, this.A01, str);
        } catch (IOException e) {
            EtU etU = this.A00.A03;
            String str2 = this.A01;
            etU.A01(str2, e.toString(), true);
            CFK.A02(str2, e, "PushTokenRefresher", "Failed to register %s token with token senders");
        }
    }

    public CTK(C3942ChY c3942ChY, String str) {
        this.A00 = c3942ChY;
        this.A01 = str;
    }
}
