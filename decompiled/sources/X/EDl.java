package X;

import android.app.Application;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class EDl {
    public static final AtomicInteger A04 = BV5.A17();
    public final LightweightQuickPerformanceLogger A00;
    public final EDa A01;
    public final InterfaceC6544EDz A02;

    /* JADX INFO: Incorrect field signature: TT; */
    public final EDT A03;

    public EDl(Application application) {
        C7384Etj.A0Y(application, 0);
        EDm eDm = new EDm(new ED9(application));
        ED9 ed9 = new ED9(application);
        C6541EDw c6541EDw = new C6541EDw();
        this.A01 = eDm;
        this.A03 = ed9;
        this.A02 = c6541EDw;
        this.A00 = new DI4();
    }
}
