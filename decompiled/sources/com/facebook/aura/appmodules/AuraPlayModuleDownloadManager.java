package com.facebook.aura.appmodules;

import X.AbstractC7391EuP;
import X.AnonymousClass003;
import X.BV4;
import X.C3306CDf;
import X.C3310CDj;
import X.C3313CDn;
import X.C3320CDz;
import X.C4954DHn;
import X.C7384Etj;
import X.CE0;
import X.CE8;
import X.CSA;
import X.F5G;
import X.InterfaceC3307CDg;
import com.facebook.voltron.download.google.GooglePlayDownloader$CancelledException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class AuraPlayModuleDownloadManager implements InterfaceC3307CDg {
    public final String name = "AuraPlay";
    public final C3313CDn playDownloader;

    @Override // X.InterfaceC3307CDg
    public void deferInstall(C3306CDf c3306CDf) {
        C7384Etj.A0Y(c3306CDf, 0);
        C3313CDn c3313CDn = this.playDownloader;
        if (c3313CDn != null) {
            Set<String> set = c3306CDf.A01;
            C7384Etj.A0U(c3313CDn.A0A.A8l(BV4.A0t(set)));
            set.equals(set);
        }
    }

    @Override // X.InterfaceC3307CDg
    public boolean isRetryable(AbstractC7391EuP<C3310CDj> abstractC7391EuP) {
        int i;
        C7384Etj.A0Y(abstractC7391EuP, 0);
        if (this.playDownloader == null) {
            return false;
        }
        Exception excA03 = abstractC7391EuP.A03();
        if (excA03 instanceof GooglePlayDownloader$CancelledException) {
            return true;
        }
        return (!(excA03 instanceof SplitInstallException) || (i = ((ApiException) excA03).mStatus.A00) == -5 || i == -2 || i == 0) ? false : true;
    }

    @Override // X.InterfaceC3307CDg
    public AbstractC7391EuP<C3310CDj> startDownload(C3306CDf c3306CDf) {
        C7384Etj.A0Y(c3306CDf, 0);
        C3313CDn c3313CDn = this.playDownloader;
        if (c3313CDn == null) {
            C3310CDj c3310CDj = new C3310CDj(null, null, 4);
            CE0 ce0 = new CE0();
            ce0.A06(c3310CDj);
            return ce0;
        }
        C3320CDz c3320CDz = new C3320CDz();
        Set<String> set = c3306CDf.A01;
        C7384Etj.A0U(c3313CDn.A0A.A8l(BV4.A0t(set)));
        set.equals(set);
        CE8 ce8 = new CE8(c3320CDz, c3306CDf);
        synchronized (c3313CDn) {
            c3313CDn.A0C.offer(ce8);
            C3313CDn.A02(c3313CDn);
        }
        return c3320CDz.A00;
    }

    public void backgroundInit() {
        C3313CDn c3313CDn = this.playDownloader;
        if (c3313CDn != null) {
            C3313CDn.A01(c3313CDn);
        }
    }

    public String getName() {
        return this.name;
    }

    public AuraPlayModuleDownloadManager(C3313CDn c3313CDn) {
        this.playDownloader = c3313CDn;
    }

    @Override // X.InterfaceC3307CDg
    public AbstractC7391EuP<Integer> startUninstall(C3306CDf c3306CDf, C3320CDz<Integer> c3320CDz) {
        AnonymousClass003.A0u(c3306CDf, c3320CDz);
        C3313CDn c3313CDn = this.playDownloader;
        if (c3313CDn == null) {
            c3320CDz.A00.A06(BV4.A0Z());
        } else {
            CSA<Void> csaA8m = c3313CDn.A0A.A8m(BV4.A0t(c3306CDf.A01));
            C7384Etj.A0U(csaA8m);
            Executor executor = c3313CDn.A0D;
            csaA8m.A06(new C4954DHn(c3320CDz, 8), executor);
            csaA8m.A0A(new F5G(c3320CDz, 3), executor);
        }
        return c3320CDz.A00;
    }
}
