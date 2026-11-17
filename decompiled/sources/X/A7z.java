package X;

import com.facebook.aura.network.acs.HatchAcsConfigFetcher;
import com.facebook.aura.network.acs.HatchAnonCredProvider;
import com.facebook.privacy.acs.VoprfRistretto;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class A7z {
    public A8C A00;
    public final HatchAcsConfigFetcher A01;
    public final C9bf A02;
    public final A8A A03;

    /* JADX WARN: Multi-variable type inference failed */
    public A7z(HatchAcsConfigFetcher hatchAcsConfigFetcher, C4oT c4oT, C9bf c9bf) {
        A81 a81;
        C7384Etj.A0Y(hatchAcsConfigFetcher, 3);
        if (c4oT == null) {
            A83 a83 = new A83();
            a83.A00 = new HashMap();
            a81 = a83;
        } else {
            a81 = new A81(c4oT);
        }
        this.A03 = a81;
        this.A01 = hatchAcsConfigFetcher;
        this.A02 = c9bf;
        A88 a88 = new A88(this);
        A8C a8c = new A8C();
        a8c.A04 = HatchAnonCredProvider.PROJECT_NAME;
        a8c.A03 = "";
        a8c.A01 = a88;
        a8c.A02 = a81;
        a8c.A00 = new VoprfRistretto();
        this.A00 = a8c;
    }
}
