package X;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.CfK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3831CfK implements InterfaceC3835CfO {
    public final int A00;
    public final Context A01;
    public final ConnectivityManager A02;
    public final InterfaceC3770CeD A03;
    public final InterfaceC3770CeD A04;
    public final CHC A05;
    public final URL A06;

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(1:8)(1:20)|9|(1:11)(2:14|(1:16)(7:17|(1:19)|13|30|21|24|25))|12|13|30|21|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ed, code lost:
    
        android.util.Log.e(X.FGI.A0M("TransportRuntime.", "CctTransportBackend"), "Unable to find version code for package", r3);
        r0 = -1;
     */
    @Override // X.InterfaceC3835CfO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3832CfL A8g(X.AbstractC3834CfN r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3831CfK.A8g(X.CfN):X.CfL");
    }

    public C3831CfK(Context context, InterfaceC3770CeD interfaceC3770CeD, InterfaceC3770CeD interfaceC3770CeD2) {
        CHD chd = new CHD();
        C3850Cff.A00.A6o(chd);
        chd.A01 = true;
        this.A05 = new CHC(chd);
        this.A01 = context;
        this.A02 = (ConnectivityManager) context.getSystemService("connectivity");
        String str = CfH.A02;
        try {
            this.A06 = new URL(str);
            this.A03 = interfaceC3770CeD2;
            this.A04 = interfaceC3770CeD;
            this.A00 = 40000;
        } catch (MalformedURLException e) {
            throw BV4.A0Q(FGI.A0M("Invalid url: ", str), e);
        }
    }
}
