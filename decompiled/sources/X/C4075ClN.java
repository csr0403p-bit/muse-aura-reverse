package X;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import com.facebook.aura.R;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import java.io.File;

/* renamed from: X.ClN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4075ClN implements InterfaceC4935DFn<File> {
    public long A00;
    public HandlerThread A01;
    public C4080ClS A02;
    public C4077ClP A03;
    public File A04;
    public File A05;
    public File A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B;
    public final Context A0C;
    public final C4045Cko A0D;
    public final long A0E;
    public final DGD A0F;

    private synchronized void A00(C4080ClS c4080ClS) {
        if (!this.A09) {
            Context context = this.A0C;
            C4046Ckp.A04(context);
            int i = this.A0D.A04 == C79.A01 ? 18 : 19;
            this.A03 = new C4077ClP(this);
            HandlerThread handlerThreadA0C = BV5.A0C("JobRanReceiver", i);
            this.A01 = handlerThreadA0C;
            AbstractC4072ClK.A00(this.A03, context, BV4.A09(handlerThreadA0C.getLooper()));
            this.A09 = true;
        }
        if (this.A07 == null) {
            if (!this.A08) {
                this.A08 = true;
                this.A00 = AbstractC4063Cl8.A00(this.A0C).A01(R.id.jobscheduler_analytics2_micro_batch);
            }
            long j = this.A00;
            long j2 = c4080ClS.A01;
            if (j > j2) {
                long j3 = c4080ClS.A00;
                if (j2 == 0 && j3 == 0) {
                    BV4.A1B(R.id.jobscheduler_analytics2_micro_batch, "MicroBatchUploadManager", "Scheduling immediate upload for %d");
                    A03();
                } else {
                    CFK.A01(Integer.valueOf(R.id.jobscheduler_analytics2_micro_batch), Long.valueOf(j2), Long.valueOf(j3), "MicroBatchUploadManager", "Scheduling jobbId %d within interval (%d, %d)");
                    AbstractC4063Cl8.A00(this.A0C).A02(this.A0D, null, R.id.jobscheduler_analytics2_micro_batch, j2, j3);
                    this.A00 = j2;
                }
            }
        }
    }

    private synchronized void A01(C4080ClS c4080ClS) {
        C4080ClS c4080ClS2 = this.A02;
        if (c4080ClS2 == null || c4080ClS.A01 < c4080ClS2.A01) {
            this.A02 = c4080ClS;
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 X.ClN) */
    public static synchronized void A02(C4075ClN c4075ClN) {
        synchronized (c4075ClN) {
            c4075ClN.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
    }

    public final synchronized void A03() {
        Context context = this.A0C;
        ((C4043Ckm) AbstractC4063Cl8.A00(context)).A01.cancel(R.id.jobscheduler_analytics2_micro_batch);
        A02(this);
        try {
            this.A07 = "com.facebook.analytics2.logger.UPLOAD_NOW";
            if (CHb.A00(context).A01()) {
                try {
                    C4055Cky c4055CkyA01 = C4055Cky.A01();
                    C4045Cko c4045Cko = this.A0D;
                    c4055CkyA01.A04(context, c4045Cko, "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch, this.A0E, false);
                    this.A0A = true;
                    C4053Ckw.A01(context, c4045Cko, C4053Ckw.A00(context), R.id.jobscheduler_analytics2_micro_batch);
                } catch (IllegalArgumentException e) {
                    throw BV4.A0e(e);
                }
            } else {
                C4055Cky.A01().A03(context, null, this.A0D, new Cl7(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch);
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC4935DFn
    public final synchronized void AhQ() {
        A03();
    }

    @Override // X.InterfaceC4935DFn
    public final void ARL() {
        C4080ClS c4080ClS = this.A02;
        synchronized (this) {
            this.A05 = this.A04;
            A01(c4080ClS);
        }
        A00(this.A02);
    }

    @Override // X.InterfaceC4935DFn
    public final void ARM() {
        C4080ClS c4080ClS = this.A02;
        synchronized (this) {
            this.A06 = this.A04;
            A01(c4080ClS);
        }
        A00(this.A02);
    }

    @Override // X.InterfaceC4935DFn
    public final void ARN(C4932DFh c4932DFh) {
        C4080ClS c4080ClS = new C4080ClS(c4932DFh.A03, c4932DFh.A02);
        synchronized (this) {
            this.A06 = this.A04;
            A01(c4080ClS);
        }
        A00(c4080ClS);
    }

    @Override // X.InterfaceC4935DFn
    public final synchronized void ARU(String str) {
        try {
            this.A05 = null;
            this.A06 = null;
            this.A02 = null;
            Context context = this.A0C;
            ((C4043Ckm) AbstractC4063Cl8.A00(context)).A01.cancel(R.id.jobscheduler_analytics2_micro_batch);
            A02(this);
            this.A07 = "com.facebook.analytics2.logger.USER_LOGOUT";
            if (CHb.A00(context).A01()) {
                try {
                    C4053Ckw c4053CkwA00 = C4053Ckw.A00(context);
                    Bundle bundleA0N = BV6.A0N();
                    bundleA0N.putString(NodeCommandFallbackWorker.KEY_USER_ID, str);
                    C4053Ckw.A02(new C4054Ckx(context, bundleA0N, null, this.A0D, null, "com.facebook.analytics2.logger.USER_LOGOUT", R.id.jobscheduler_analytics2_micro_batch), null, c4053CkwA00, "com.facebook.analytics2.logger.USER_LOGOUT");
                } catch (IllegalArgumentException e) {
                    throw BV4.A0e(e);
                }
            } else {
                C4055Cky c4055CkyA01 = C4055Cky.A01();
                C4045Cko c4045Cko = this.A0D;
                Bundle bundleA0N2 = BV6.A0N();
                bundleA0N2.putString(NodeCommandFallbackWorker.KEY_USER_ID, str);
                c4055CkyA01.A03(context, bundleA0N2, c4045Cko, null, "com.facebook.analytics2.logger.USER_LOGOUT", R.id.jobscheduler_analytics2_micro_batch);
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC4935DFn
    public final /* bridge */ /* synthetic */ void Adb(File file) {
        File file2 = file;
        synchronized (this) {
            this.A04 = file2;
        }
    }

    public C4075ClN(Context context, DGD dgd, C4045Cko c4045Cko) {
        this.A0C = context;
        this.A0D = c4045Cko;
        A02(this);
        this.A0E = 300000L;
        this.A0B = true;
        this.A0F = dgd;
    }
}
