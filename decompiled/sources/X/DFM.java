package X;

import android.content.Context;
import android.os.HandlerThread;
import com.facebook.aura.R;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* loaded from: classes5.dex */
public final class DFM implements DG4 {
    public CIA A00;
    public DFO A01;
    public DFO A02;
    public DFN A03;
    public final Context A04;
    public final DGD A05;
    public final DGW A06;
    public final DGW A07;
    public final DGc A08;
    public final CI8 A09;
    public final InterfaceC4081ClT A0A;
    public final C4941DFx A0B;
    public final InterfaceC4083Clb A0C;
    public final InterfaceC4083Clb A0D;
    public final C3339CFj A0E;
    public final DFV A0F;
    public final DGI A0G;
    public final Class<? extends SamplingPolicyConfig> A0H;
    public final Class<? extends InterfaceC4012Cjq> A0I;
    public final F18<InterfaceC4071ClJ> A0J;

    private synchronized C4061Cl4 A02(String str) {
        return new C4061Cl4(this.A0I, this.A0H, this.A0J.AMN().getClass(), C79.A00, str);
    }

    @Override // X.DG4
    public final /* synthetic */ void AgA(CIA cia) {
        C7384Etj.A0Y(cia, 1);
        Ag9(cia);
    }

    private DFO A00(long j) {
        DFO dfo;
        synchronized (this) {
            if (j == -2) {
                if (this.A01 == null) {
                    Context context = this.A04;
                    C4046Ckp.A04(context);
                    HandlerThread handlerThreadA0C = BV5.A0C("Analytics-HighPri-Proc", 0);
                    DGW dgw = this.A06;
                    C4940DFw c4940DFw = new C4940DFw(this.A0B);
                    C3339CFj c3339CFj = this.A0E;
                    C4061Cl4 c4061Cl4A02 = A02("ads");
                    InterfaceC4081ClT interfaceC4081ClT = this.A0A;
                    InterfaceC4083Clb interfaceC4083Clb = this.A0C;
                    CI8 ci8 = this.A09;
                    DGD dgd = this.A05;
                    DFO dfo2 = new DFO(handlerThreadA0C, dgd, dgw, null, new DFR(context, dgd, dgw, ci8, interfaceC4081ClT, c4940DFw, c4061Cl4A02, interfaceC4083Clb, c3339CFj, "high", R.id.jobscheduler_analytics2_high_pri));
                    this.A01 = dfo2;
                    CIA cia = this.A00;
                    DFL dfl = dfo2.A06;
                    C1H.A01(cia, "Cannot start a session with null batchSession");
                    BV4.A1D(dfl, cia, 3);
                }
                dfo = this.A01;
            } else {
                if (this.A02 == null) {
                    Context context2 = this.A04;
                    C4046Ckp.A04(context2);
                    HandlerThread handlerThreadA0C2 = BV5.A0C("Analytics-NormalPri-Proc", 10);
                    DGc dGc = this.A08;
                    DGW dgw2 = this.A07;
                    C4940DFw c4940DFw2 = new C4940DFw(this.A0B);
                    C3339CFj c3339CFj2 = this.A0E;
                    C4061Cl4 c4061Cl4A022 = A02("regular");
                    InterfaceC4081ClT interfaceC4081ClT2 = this.A0A;
                    InterfaceC4083Clb interfaceC4083Clb2 = this.A0D;
                    CI8 ci82 = this.A09;
                    DGD dgd2 = this.A05;
                    DFO dfo3 = new DFO(handlerThreadA0C2, dgd2, dgw2, dGc, new DFR(context2, dgd2, dgw2, ci82, interfaceC4081ClT2, c4940DFw2, c4061Cl4A022, interfaceC4083Clb2, c3339CFj2, "normal", R.id.jobscheduler_analytics2_normal_pri));
                    this.A02 = dfo3;
                    CIA cia2 = this.A00;
                    DFL dfl2 = dfo3.A06;
                    C1H.A01(cia2, "Cannot start a session with null batchSession");
                    BV4.A1D(dfl2, cia2, 3);
                }
                dfo = this.A02;
            }
        }
        return dfo;
    }

    private synchronized DFN A01() {
        DFV dfv = this.A0F;
        InterfaceC4083Clb normalPriUploadSchedulerParamsProvider = dfv.getNormalPriUploadSchedulerParamsProvider();
        InterfaceC4083Clb highPriUploadSchedulerParamsProvider = dfv.getHighPriUploadSchedulerParamsProvider();
        if (this.A03 == null) {
            InterfaceC4081ClT interfaceC4081ClT = this.A0A;
            if (normalPriUploadSchedulerParamsProvider == null) {
                normalPriUploadSchedulerParamsProvider = this.A0D;
            }
            if (highPriUploadSchedulerParamsProvider == null) {
                highPriUploadSchedulerParamsProvider = this.A0C;
            }
            C4082ClZ c4082ClZ = new C4082ClZ(interfaceC4081ClT, normalPriUploadSchedulerParamsProvider, highPriUploadSchedulerParamsProvider, dfv.getRealTimeExemptLatency(), dfv.getRegularExemptLatency(), dfv.getLatencyWindowMultiplier());
            Context context = this.A04;
            C4046Ckp.A04(context);
            HandlerThread handlerThreadA0C = BV5.A0C("Analytics-MicroBatch-Proc", 10);
            DGc dGc = this.A08;
            DGW dgw = this.A07;
            C4940DFw c4940DFw = new C4940DFw(this.A0B);
            C3339CFj c3339CFj = this.A0E;
            C4061Cl4 c4061Cl4A02 = A02("micro_batch");
            CI8 ci8 = this.A09;
            DGD dgd = this.A05;
            DFN dfn = new DFN(handlerThreadA0C, dgd, dgw, dGc, dfv, new DFS(context, dgd, dgw, ci8, c4940DFw, dfv, c4061Cl4A02, c4082ClZ, c3339CFj), c4082ClZ);
            this.A03 = dfn;
            CIA cia = this.A00;
            if (cia != null) {
                dfn.Ag9(cia);
            }
        }
        return this.A03;
    }

    @Override // X.DG4
    public final boolean AOX() {
        return true;
    }

    @Override // X.InterfaceC4936DFr
    public final void ART(C4931DFd c4931DFd) {
        DFO dfo = this.A01;
        if (dfo != null) {
            BV4.A1D(dfo.A06, c4931DFd != null ? c4931DFd.userId : null, 4);
        }
        DFO dfo2 = this.A02;
        if (dfo2 != null) {
            BV4.A1D(dfo2.A06, c4931DFd != null ? c4931DFd.userId : null, 4);
        }
        DFN dfn = this.A03;
        if (dfn != null) {
            dfn.ART(c4931DFd);
        }
    }

    @Override // X.InterfaceC4936DFr
    public final void AYY(C4932DFh c4932DFh) {
        String str = c4932DFh.A09;
        if (this.A0F.isMicroBatchingEnabled()) {
            A01().AYY(c4932DFh);
            return;
        }
        DFL dfl = A00(c4932DFh.A01).A06;
        dfl.sendMessageAtFrontOfQueue(dfl.obtainMessage(1, c4932DFh));
        DFL.A03(dfl, c4932DFh.A07, "event.queued", str, c4932DFh.A0A);
    }

    @Override // X.InterfaceC4936DFr
    public final void AYZ(C4932DFh c4932DFh) {
        String str = c4932DFh.A09;
        if (this.A0F.isMicroBatchingEnabled()) {
            A01().AYZ(c4932DFh);
            return;
        }
        DFL dfl = A00(c4932DFh.A01).A06;
        DFL.A03(dfl, c4932DFh.A07, "event.queued", str, c4932DFh.A0A);
        dfl.sendMessage(dfl.obtainMessage(1, 1, 0, c4932DFh));
    }

    @Override // X.DG4
    public final void AcW(int i) {
        DFN dfn;
        DFU dfu;
        InterfaceC4935DFn interfaceC4935DFn;
        DFO dfo;
        DFT dft;
        if (this.A0F.isMicroBatchingEnabled()) {
            dfn = this.A03;
            if (dfn != null || (dfu = dfn.A00) == null) {
                return;
            } else {
                interfaceC4935DFn = dfu.A01;
            }
        } else {
            if (i == 1) {
                dfo = this.A02;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw BV5.A0Q("priority=", i);
                    }
                    dfn = this.A03;
                    if (dfn != null) {
                        return;
                    } else {
                        return;
                    }
                }
                dfo = this.A01;
            }
            if (dfo == null || (dft = dfo.A00) == null) {
                return;
            } else {
                interfaceC4935DFn = dft.A01;
            }
        }
        if (interfaceC4935DFn instanceof C4076ClO) {
            ((C4076ClO) interfaceC4935DFn).A02();
        } else {
            ((C4075ClN) interfaceC4935DFn).A03();
        }
    }

    @Override // X.InterfaceC4936DFr
    public final void Ag9(CIA cia) {
        this.A00 = cia;
        DFO dfo = this.A01;
        if (dfo != null) {
            DFL dfl = dfo.A06;
            C1H.A01(cia, "Cannot start a session with null batchSession");
            BV4.A1D(dfl, cia, 3);
        }
        DFO dfo2 = this.A02;
        if (dfo2 != null) {
            DFL dfl2 = dfo2.A06;
            C1H.A01(cia, "Cannot start a session with null batchSession");
            BV4.A1D(dfl2, cia, 3);
        }
        DFN dfn = this.A03;
        if (dfn != null) {
            dfn.Ag9(cia);
        }
    }

    @Override // X.InterfaceC4936DFr
    public final void AhQ() {
        DFO dfo = this.A01;
        if (dfo != null) {
            BV4.A1C(dfo.A06, 9);
        }
        DFO dfo2 = this.A02;
        if (dfo2 != null) {
            BV4.A1C(dfo2.A06, 9);
        }
        DFN dfn = this.A03;
        if (dfn != null) {
            dfn.AhQ();
        }
    }

    @Override // X.DG4
    public final C4934DFk shouldLog(String str) {
        return this.A0G.shouldLog(str);
    }

    public DFM(Context context, DGD dgd, DGW dgw, DGW dgw2, DGc dGc, CI8 ci8, InterfaceC4081ClT interfaceC4081ClT, C4941DFx c4941DFx, DFV dfv, InterfaceC4083Clb interfaceC4083Clb, InterfaceC4083Clb interfaceC4083Clb2, C3339CFj c3339CFj, DGI dgi, Class cls, Class cls2, F18 f18) {
        this.A04 = context;
        this.A0I = cls;
        this.A08 = dGc;
        this.A0H = cls2;
        this.A0B = c4941DFx;
        this.A0E = c3339CFj;
        this.A0A = interfaceC4081ClT;
        this.A0D = interfaceC4083Clb;
        this.A0C = interfaceC4083Clb2;
        this.A07 = dgw;
        this.A06 = dgw2;
        this.A0F = dfv;
        this.A09 = ci8;
        this.A0J = f18;
        this.A05 = dgd;
        this.A0G = dgi;
    }
}
