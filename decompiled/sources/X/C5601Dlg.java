package X;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

/* renamed from: X.Dlg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5601Dlg implements Closeable {
    public static final AtomicLong A08 = new AtomicLong();
    public InterfaceC6099Dve A00;
    public boolean A01;
    public final C5831DqK A02;
    public final Supplier<InterfaceC6099Dve> A03;
    public final C5092DXa A04;
    public final ArrayList<Runnable> A05;
    public final List<WeakReference<InterfaceC4913DEg>> A06;
    public final boolean A07;

    public final synchronized C5989DtW A02(C4904DDx c4904DDx) {
        C5989DtW c5989DtW;
        C7384Etj.A0Y(c4904DDx, 0);
        if (c4904DDx.A0A != BXX.MOQ) {
            return null;
        }
        C5831DqK c5831DqK = this.A02;
        if (c5831DqK.A00 == 0 || c5831DqK.A04) {
            if (!this.A01) {
                A00(c4904DDx, this);
            }
            boolean zA01 = A01(c4904DDx);
            SystemClock.elapsedRealtime();
            c5989DtW = new C5989DtW(zA01 ? C79.A01 : C79.A0C);
        } else {
            c5989DtW = new C5989DtW(A01(c4904DDx) ? C79.A01 : C79.A0C);
        }
        return c5989DtW;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                this.A06.clear();
            }
        }
    }

    public static final void A00(C4904DDx c4904DDx, C5601Dlg c5601Dlg) {
        InterfaceC6099Dve interfaceC6099Dve;
        Uri uri = c4904DDx.A08;
        if (uri != null && c4904DDx.A0A == BXX.MOQ && c5601Dlg.A07 && AbstractC7385Etm.A02(uri)) {
            if (c5601Dlg.A02.A00 == 0 || A01(c4904DDx)) {
                synchronized (c5601Dlg) {
                    if (c5601Dlg.A01) {
                        interfaceC6099Dve = InterfaceC6099Dve.A00;
                    } else {
                        interfaceC6099Dve = c5601Dlg.A00;
                        if (interfaceC6099Dve == null) {
                            InterfaceC6099Dve interfaceC6099Dve2 = c5601Dlg.A03.get();
                            interfaceC6099Dve = interfaceC6099Dve2;
                            c5601Dlg.A00 = interfaceC6099Dve;
                            C7384Etj.A0U(interfaceC6099Dve2);
                        }
                    }
                }
                if (interfaceC6099Dve != InterfaceC6099Dve.A00) {
                    C5704Dnm c5704Dnm = C5704Dnm.A08;
                    C5608Dln c5608Dln = new C5608Dln();
                    c5608Dln.A00 = uri;
                    c5608Dln.A00();
                }
            }
        }
    }

    public static final boolean A01(C4904DDx c4904DDx) {
        String host;
        Uri uri = c4904DDx.A06;
        return (uri == null || !AbstractC0878AGe.A0k(C60O.A16("https", AuraDeeplinkHandlerActivity.HTTP), uri.getScheme()) || (host = uri.getHost()) == null || C7BY.A0j(host)) ? false : true;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DqK;LX/DXa;Ljava/util/function/Supplier<LX/Dve;>;Z)V */
    public C5601Dlg(C5092DXa c5092DXa, C5831DqK c5831DqK, Supplier supplier, boolean z) {
        this.A02 = c5831DqK;
        this.A04 = c5092DXa;
        this.A03 = supplier;
        this.A07 = z;
        A08.incrementAndGet();
        this.A05 = C3cG.A0h();
        this.A06 = C3cG.A0h();
    }
}
