package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import java.io.File;

/* renamed from: X.ClO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4076ClO implements InterfaceC4935DFn<File> {
    public long A00;
    public File A01;
    public File A02;
    public File A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = false;
    public final int A08;
    public final Context A09;
    public final InterfaceC4081ClT A0A;
    public final C4045Cko A0B;
    public final C4079ClR A0C;
    public final C4079ClR A0D;
    public final DGD A0E;

    private synchronized void A00(long j, long j2) {
        if (!this.A06) {
            Context context = this.A09;
            C4046Ckp.A04(context);
            AbstractC4072ClK.A00(new C4078ClQ(this), context, BV4.A09(BV5.A0C("JobRanReceiver", this.A0B.A04 == C79.A01 ? 18 : 19).getLooper()));
            this.A06 = true;
        }
        if (this.A04 == null) {
            if (!this.A05) {
                this.A05 = true;
                this.A00 = AbstractC4063Cl8.A00(this.A09).A01(this.A08);
            }
            if (this.A00 > j) {
                if (j == 0 && j2 == 0) {
                    BV4.A1B(this.A08, "UploadManager", "Scheduling immediate upload for %d");
                    A02();
                } else {
                    int i = this.A08;
                    CFK.A01(Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), "UploadManager", "Scheduling jobbId %d within interval (%d, %d)");
                    AbstractC4063Cl8.A00(this.A09).A02(this.A0B, null, i, j, j2);
                    this.A00 = j;
                }
            }
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 X.ClO) */
    public static synchronized void A01(C4076ClO c4076ClO) {
        synchronized (c4076ClO) {
            c4076ClO.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
    }

    public final synchronized void A02() {
        Context context = this.A09;
        AbstractC4063Cl8 abstractC4063Cl8A00 = AbstractC4063Cl8.A00(context);
        int i = this.A08;
        ((C4043Ckm) abstractC4063Cl8A00).A01.cancel(i);
        A01(this);
        try {
            this.A04 = "com.facebook.analytics2.logger.UPLOAD_NOW";
            if (CHb.A00(context).A01()) {
                try {
                    C4055Cky c4055CkyA01 = C4055Cky.A01();
                    C4045Cko c4045Cko = this.A0B;
                    c4055CkyA01.A04(context, c4045Cko, "com.facebook.analytics2.logger.UPLOAD_NOW", i, 300000L, false);
                    this.A07 = true;
                    C4053Ckw.A01(context, c4045Cko, C4053Ckw.A00(context), i);
                } catch (IllegalArgumentException e) {
                    throw BV4.A0e(e);
                }
            } else {
                C4055Cky.A01().A03(context, null, this.A0B, new Cl7(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i);
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC4935DFn
    public final void ARL() {
        synchronized (this) {
            this.A02 = this.A01;
        }
        AuraAppLifecycleManager auraAppLifecycleManager = AuraAppLifecycleManager.INSTANCE;
        A00((auraAppLifecycleManager.isAppInForeground() ^ true ? this.A0C : this.A0D).A02, (auraAppLifecycleManager.isAppInForeground() ^ true ? this.A0C : this.A0D).A00);
    }

    @Override // X.InterfaceC4935DFn
    public final void ARM() {
        synchronized (this) {
            this.A03 = this.A01;
        }
        AuraAppLifecycleManager auraAppLifecycleManager = AuraAppLifecycleManager.INSTANCE;
        A00((auraAppLifecycleManager.isAppInForeground() ^ true ? this.A0C : this.A0D).A03, (auraAppLifecycleManager.isAppInForeground() ^ true ? this.A0C : this.A0D).A01);
    }

    @Override // X.InterfaceC4935DFn
    public final synchronized void AhQ() {
        A02();
    }

    @Override // X.InterfaceC4935DFn
    public final synchronized void ARU(String str) {
        try {
            this.A02 = null;
            this.A03 = null;
            Context context = this.A09;
            AbstractC4063Cl8 abstractC4063Cl8A00 = AbstractC4063Cl8.A00(context);
            int i = this.A08;
            ((C4043Ckm) abstractC4063Cl8A00).A01.cancel(i);
            A01(this);
            this.A04 = "com.facebook.analytics2.logger.USER_LOGOUT";
            if (CHb.A00(context).A01()) {
                try {
                    C4053Ckw c4053CkwA00 = C4053Ckw.A00(context);
                    Bundle bundleA0N = BV6.A0N();
                    bundleA0N.putString(NodeCommandFallbackWorker.KEY_USER_ID, str);
                    C4053Ckw.A02(new C4054Ckx(context, bundleA0N, null, this.A0B, null, "com.facebook.analytics2.logger.USER_LOGOUT", i), null, c4053CkwA00, "com.facebook.analytics2.logger.USER_LOGOUT");
                } catch (IllegalArgumentException e) {
                    throw BV4.A0e(e);
                }
            } else {
                C4055Cky c4055CkyA01 = C4055Cky.A01();
                C4045Cko c4045Cko = this.A0B;
                Bundle bundleA0N2 = BV6.A0N();
                bundleA0N2.putString(NodeCommandFallbackWorker.KEY_USER_ID, str);
                c4055CkyA01.A03(context, bundleA0N2, c4045Cko, null, "com.facebook.analytics2.logger.USER_LOGOUT", i);
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC4935DFn
    public final /* bridge */ /* synthetic */ void Adb(File file) {
        File file2 = file;
        synchronized (this) {
            this.A01 = file2;
        }
    }

    public C4076ClO(Context context, DGD dgd, InterfaceC4081ClT interfaceC4081ClT, C4045Cko c4045Cko, C4079ClR c4079ClR, C4079ClR c4079ClR2, int i) {
        this.A09 = context;
        this.A08 = i;
        this.A0B = c4045Cko;
        this.A0A = interfaceC4081ClT;
        this.A0D = c4079ClR;
        this.A0C = c4079ClR2;
        A01(this);
        this.A0E = dgd;
    }

    @Override // X.InterfaceC4935DFn
    public final void ARN(C4932DFh c4932DFh) {
        throw F60.createAndThrow();
    }
}
