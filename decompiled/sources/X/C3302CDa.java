package X;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.CDa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3302CDa {
    public final Context A00;
    public final Set<HgZ> A01;
    public final ConnectivityManager A02;
    public final C3303CDb A03;
    public final CDv A04;
    public final InterfaceC3307CDg A05;
    public final CDU A06;
    public final C3301CCy A07;
    public final Executor A08;

    public C3302CDa(Context context, C3303CDb c3303CDb, CDv cDv, InterfaceC3307CDg interfaceC3307CDg, C3301CCy c3301CCy, Executor executor) {
        AnonymousClass002.A1B(interfaceC3307CDg, 2, executor);
        this.A04 = cDv;
        this.A07 = c3301CCy;
        this.A05 = interfaceC3307CDg;
        this.A08 = executor;
        this.A00 = context;
        this.A03 = c3303CDb;
        Object systemService = context.getSystemService("connectivity");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.A02 = connectivityManager;
        this.A01 = C60O.A13();
        if (connectivityManager == null) {
            CFK.A07("AppModuleManager", "Failed to get ConnectivityManager");
        }
        CDH cdhA00 = CDH.A04.A00();
        C3308CDh c3308CDh = new C3308CDh(this, cdhA00);
        this.A06 = c3308CDh;
        synchronized (cdhA00) {
            CDP cdp = new CDP(c3308CDh, executor);
            cdhA00.A02.add(cdp);
            int i = 0;
            do {
                String moduleName = CCn.getModuleName(i);
                if (cdhA00.A02(moduleName)) {
                    C7384Etj.A0Y(moduleName, 0);
                    cdp.A01.execute(new CDN(cdp, moduleName));
                }
                i++;
            } while (i < 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[Catch: ActionQueryCalculator$DownloadDisabledException -> 0x0262, ActionQueryCalculator$UndefinedModuleException -> 0x026a, TryCatch #2 {ActionQueryCalculator$DownloadDisabledException -> 0x0262, ActionQueryCalculator$UndefinedModuleException -> 0x026a, blocks: (B:36:0x00f7, B:37:0x00ff, B:39:0x0105, B:41:0x0113, B:42:0x0115, B:43:0x0119, B:45:0x011f, B:47:0x0125, B:67:0x018d, B:68:0x0191, B:65:0x0179, B:50:0x0133, B:52:0x0144, B:54:0x0148, B:56:0x0159, B:58:0x0165, B:66:0x0188, B:59:0x0168, B:61:0x0170, B:62:0x0173), top: B:121:0x00f7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC7391EuP<X.C7Gm> A00(X.C7463Ews r18) throws com.facebook.voltron.api.ActionQueryCalculator$UndefinedModuleException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3302CDa.A00(X.Ews):X.CE0");
    }
}
