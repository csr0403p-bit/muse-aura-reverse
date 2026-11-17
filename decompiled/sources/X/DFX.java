package X;

import android.content.Context;
import com.facebook.aura.analytics.impl.MetaAppInfoProvider;
import com.facebook.aura.analytics.impl.MetaPrivacyContextProvider;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DFX {
    public DFV A00;
    public final HsC<DFW> A01;
    public final DG4 A02;
    public final DGD A03;
    public final DFW A04;
    public final DFP A05;
    public final C4930DFb A06;
    public final AbstractC4937DFs A07;
    public final InterfaceC4081ClT A08;
    public final MetaAppInfoProvider A09;
    public final MetaPrivacyContextProvider A0A;
    public final C3339CFj A0B;
    public final InterfaceC4944DGi A0C;
    public final Set<String> A0D;
    public final F18<InterfaceC4071ClJ> A0E;
    public final DGI A0F;
    public final Context A0G;
    public static final C4079ClR A0K = new C4079ClR(900000, ConfidentialVmDowngradeOperation.EXPORT_REFRESH_INTERVAL_MS, 0, 1800000);
    public static final C4079ClR A0J = new C4079ClR(0, 0, 0, 0);
    public static final C4079ClR A0I = new C4079ClR(900000, ConfidentialVmDowngradeOperation.EXPORT_REFRESH_INTERVAL_MS, 0, 1800000);
    public static final C4079ClR A0H = new C4079ClR(0, 0, 0, 0);

    public static DFW A01(DFX dfx, Integer num, String str, String str2, boolean z) {
        boolean zIsHealthCounterEnabled = dfx.A03.isHealthCounterEnabled();
        String fFDBToken = dfx.A0E.AMN().getFFDBToken();
        String strA0j = (fFDBToken == null || fFDBToken.isEmpty()) ? "" : BV5.A0j();
        if (zIsHealthCounterEnabled) {
            System.currentTimeMillis();
            A02(dfx, "event.logged", str2, strA0j);
        }
        C4934DFk c4934DFkShouldLog = dfx.A02.shouldLog(str2);
        int i = c4934DFkShouldLog.A00;
        if (i < 0) {
            throw BV5.A0Q("Not sure how to proceed with negative sampling rate ", i);
        }
        if (i == 0 || C4934DFk.A06.nextInt(i) != 0) {
            if (zIsHealthCounterEnabled) {
                A02(dfx, "event.filters.sampling", str2, strA0j);
            }
            return dfx.A04;
        }
        if (strA0j.isEmpty()) {
            strA0j = BV5.A0j();
        }
        DFW dfwA00 = A00(dfx, c4934DFkShouldLog, num, str, str2, strA0j, z);
        A03(dfwA00, c4934DFkShouldLog);
        return dfwA00;
    }

    public final DFW A04(String str, boolean z) {
        C4934DFk c4934DFkShouldLog = this.A02.shouldLog(str);
        Integer num = C79.A00;
        String strA0j = BV5.A0j();
        A02(this, "event.logged", str, strA0j);
        System.currentTimeMillis();
        DFW dfwA00 = A00(this, c4934DFkShouldLog, num, null, str, strA0j, z);
        dfwA00.A0A();
        A03(dfwA00, c4934DFkShouldLog);
        return dfwA00;
    }

    public DFX(DFY dfy) {
        CG3.A01 = this;
        CG3 cg3 = CG3.A02;
        if (cg3 == null) {
            cg3 = new CG3();
            CG3.A02 = cg3;
        }
        this.A04 = cg3;
        this.A01 = new C3110ByZ(6);
        InterfaceC4081ClT interfaceC4081ClT = dfy.A06;
        interfaceC4081ClT.getClass();
        this.A08 = interfaceC4081ClT;
        DGI dgi = dfy.A0C;
        dgi.getClass();
        this.A0F = dgi;
        C3339CFj c3339CFj = new C3339CFj();
        this.A0B = c3339CFj;
        AbstractC4937DFs abstractC4937DFs = dfy.A03;
        abstractC4937DFs.getClass();
        this.A07 = abstractC4937DFs;
        Class<? extends SamplingPolicyConfig> cls = dfy.A0E;
        DFV dfv = dfy.A07;
        this.A00 = dfv == null ? new DGJ() : dfv;
        Context context = dfy.A0I;
        context.getClass();
        this.A0G = context;
        MetaAppInfoProvider metaAppInfoProvider = dfy.A0A;
        metaAppInfoProvider.getClass();
        this.A09 = metaAppInfoProvider;
        InterfaceC4944DGi interfaceC4944DGi = dfy.A0D;
        interfaceC4944DGi.getClass();
        this.A0C = interfaceC4944DGi;
        this.A0A = dfy.A0B;
        CI7 dgk = dfy.A02;
        dgk = dgk == null ? new DGK() : dgk;
        CI8 ci8 = dfy.A05;
        if (ci8 == null) {
            synchronized (DDE.class) {
                if (DDE.A04 == null) {
                    DDE dde = new DDE();
                    dde.A02 = C9M.A00();
                    dde.A00 = 0;
                    dde.A01 = CIB.FOREGROUND;
                    dde.A03 = true;
                    DDE.A04 = dde;
                    abstractC4937DFs.registerCallback(dde);
                }
                ci8 = DDE.A04;
            }
        }
        DGD dgr = dfy.A01;
        dgr = dgr == null ? new DGR() : dgr;
        this.A03 = dgr;
        F18<InterfaceC4071ClJ> c7601F5o = dfy.A0H;
        c7601F5o = c7601F5o == null ? new C7601F5o(0) : c7601F5o;
        this.A0E = c7601F5o;
        this.A0D = dfy.A0G;
        InterfaceC4083Clb dge = dfy.A09;
        dge = dge == null ? new DGE(A0K, A0I) : dge;
        InterfaceC4083Clb dge2 = dfy.A08;
        dge2 = dge2 == null ? new DGE(A0J, A0H) : dge2;
        DG4 dfm = dfy.A00;
        if (dfm == null) {
            Class<? extends InterfaceC4012Cjq> cls2 = dfy.A0F;
            cls2.getClass();
            DGc dGc = dfy.A04;
            Class<? extends SamplingPolicyConfig> cls3 = dfy.A0E;
            MetaAppInfoProvider metaAppInfoProvider2 = dfy.A0A;
            metaAppInfoProvider2.getClass();
            InterfaceC4944DGi interfaceC4944DGi2 = dfy.A0D;
            interfaceC4944DGi2.getClass();
            dfm = new DFM(context, dgr, new DGW(50), new DGW(1), dGc, ci8, dfy.A06, new C4941DFx(dgk, metaAppInfoProvider2, c3339CFj, interfaceC4944DGi2), this.A00, dge, dge2, c3339CFj, dgi, cls2, cls3, c7601F5o);
        }
        this.A02 = dfm;
        DFP dfp = new DFP(context, dfm, dgr, interfaceC4081ClT, this.A00, dge, dge2);
        this.A05 = dfp;
        this.A06 = new C4930DFb(dfp, abstractC4937DFs, ci8);
        if (cls != null) {
            abstractC4937DFs.registerCallback(new C4051Cku(context, cls));
        }
    }

    public static DFW A00(DFX dfx, C4934DFk c4934DFk, Integer num, String str, String str2, String str3, boolean z) {
        String fFDBToken;
        DFW dfwA2t = dfx.A01.A2t();
        if (dfwA2t == null) {
            dfwA2t = new DFW();
        }
        boolean z2 = z || !((fFDBToken = dfx.A0E.AMN().getFFDBToken()) == null || fFDBToken.isEmpty());
        dfwA2t.A04 = dfx;
        dfwA2t.A0C = str;
        dfwA2t.A0B = str2;
        dfwA2t.A09 = num;
        dfwA2t.A0F = z2;
        dfwA2t.A0D = str3;
        C3341CFl c3341CFlA03 = dfx.A0B.A03();
        dfwA2t.A05 = c3341CFlA03;
        C3343CFo c3343CFoA00 = C3343CFo.A00();
        C1H.A01(c3343CFoA00, "encoder cannot be null!");
        c3341CFlA03.A02 = c3343CFoA00;
        String str4 = dfwA2t.A0D;
        if (!str4.isEmpty()) {
            C3341CFl.A00(dfwA2t.A05, str4, "trace_id");
        }
        dfwA2t.A07 = c4934DFk;
        if (dfwA2t.A0G) {
            throw new IllegalStateException("Expected immutability");
        }
        dfwA2t.A0G = true;
        return dfwA2t;
    }

    public static void A02(DFX dfx, String str, String str2, String str3) {
        DGD dgd = dfx.A03;
        if (dgd.isHealthCounterEnabled()) {
            dgd.get().APw(str, str2, 1L, str3);
        }
    }

    public static void A03(DFW dfw, C4934DFk c4934DFk) {
        dfw.A0A = Integer.valueOf(c4934DFk.A00);
        if (c4934DFk.A02) {
            dfw.A03 = 64 | dfw.A03;
        }
        if (c4934DFk.A03) {
            dfw.A03 = 128 | dfw.A03;
        }
    }
}
