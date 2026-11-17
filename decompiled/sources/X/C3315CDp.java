package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.CDp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3315CDp implements CEF<Integer> {
    public boolean A00;
    public final CE8 A01;
    public final /* synthetic */ C3313CDn A02;

    @Override // X.CEF
    public final void onComplete(CSA<Integer> csa) {
        C3320CDz<C3310CDj> c3320CDz;
        C3310CDj c3310CDj;
        Integer numA08;
        C7384Etj.A0Y(csa, 0);
        C3313CDn c3313CDn = this.A02;
        synchronized (c3313CDn) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            if (csa.A0C() && csa.A08() != null && ((numA08 = csa.A08()) == null || numA08.intValue() != 0)) {
                c3313CDn.A0B.put(csa.A08(), this.A01);
                c3313CDn.A00 = true;
            }
            if (!csa.A0C()) {
                Exception excA07 = csa.A07();
                int i = excA07 instanceof SplitInstallException ? ((ApiException) excA07).mStatus.A00 : 0;
                c3320CDz = this.A01.A00;
                c3310CDj = new C3310CDj(csa.A07(), i == 0 ? null : Integer.valueOf(i), 2);
            } else {
                if (csa.A08() == null) {
                    ArrayList arrayListA0h = C3cG.A0h();
                    CE8 ce8 = this.A01;
                    C3306CDf c3306CDf = ce8.A01;
                    Set<String> set = c3306CDf.A01;
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        arrayListA0h.add(Boolean.valueOf(CDH.A04.A00().A03(AnonymousClass005.A0j(it))));
                    }
                    Throwable thA07 = csa.A07();
                    if (thA07 == null) {
                        thA07 = BV4.A0c("No download exception found");
                    }
                    CFK.A0E("GooglePlayDownloader", "Play Core returned an successful task but null result found. modules:%s usecase:%s modulelocalstate:%s", thA07, set.toString(), c3306CDf.A00.toString(), arrayListA0h.toString());
                    csa.A07();
                    ce8.A00.A00(BV4.A0c("Play Core returned an successful task but null result found."));
                    return;
                }
                Integer numA082 = csa.A08();
                if (numA082 == null || numA082.intValue() != 0) {
                    return;
                }
                c3320CDz = this.A01.A00;
                c3310CDj = new C3310CDj(null, null, 1);
            }
            c3320CDz.A00.A06(c3310CDj);
        }
    }

    public C3315CDp(CE8 ce8, C3313CDn c3313CDn) {
        this.A02 = c3313CDn;
        this.A01 = ce8;
    }
}
