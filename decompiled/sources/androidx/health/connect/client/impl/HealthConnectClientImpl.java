package androidx.health.connect.client.impl;

import X.AbstractC7608F5v;
import X.AbstractC8868Frh;
import X.AbstractC8871Frk;
import X.AbstractC8994FwX;
import X.AbstractC9043FxP;
import X.AbstractC9050FxY;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.Br8;
import X.C0881AGi;
import X.C10456Hiz;
import X.C10457Hje;
import X.C5272Dem;
import X.C60O;
import X.C7384Etj;
import X.C8866Frf;
import X.C8867Frg;
import X.C8869Fri;
import X.C8870Frj;
import X.C8872Frl;
import X.C8874Frn;
import X.C8875Fro;
import X.C8876Frp;
import X.C8877Frq;
import X.C8878Frr;
import X.C8879Frs;
import X.C8880Frt;
import X.C8914FtW;
import X.C8951FuQ;
import X.C8952FuR;
import X.C8990FwS;
import X.C8993FwW;
import X.C8997Fwa;
import X.C8998Fwb;
import X.C8999Fwc;
import X.C8j3;
import X.C9000Fwd;
import X.C9001Fwe;
import X.C9002Fwf;
import X.C9003Fwg;
import X.C9004Fwh;
import X.C9005Fwi;
import X.C9006Fwj;
import X.C9007Fwk;
import X.C9012Fwp;
import X.C9025Fx3;
import X.C9028Fx8;
import X.C9034FxG;
import X.C9039FxL;
import X.C9040FxM;
import X.C9046FxU;
import X.C9048FxW;
import X.C9052Fxa;
import X.C9056Fxe;
import X.C9057Fxf;
import X.C9059Fxh;
import X.C9060Fxi;
import X.C9061Fxj;
import X.C9062Fxk;
import X.C9063Fxl;
import X.C9064Fxm;
import X.C9065Fxn;
import X.C9066Fxo;
import X.C9067Fxp;
import X.C9068Fxq;
import X.C9069Fxr;
import X.C9071Fxx;
import X.C9072Fxy;
import X.C9073Fxz;
import X.C9074Fy0;
import X.C9075Fy2;
import X.C9076Fy3;
import X.C9077Fy4;
import X.C9078Fy5;
import X.C9079Fy6;
import X.C9080Fy7;
import X.C9081Fy8;
import X.C9082Fy9;
import X.C9084FyB;
import X.C9085FyC;
import X.C9086FyD;
import X.C9087FyE;
import X.C9088FyF;
import X.C9095FyM;
import X.C9107FyY;
import X.C9120Fyl;
import X.C9139Fz7;
import X.C9140Fz8;
import X.C9144FzD;
import X.C9147FzG;
import X.C9148FzH;
import X.C9168Fzb;
import X.C9169Fzc;
import X.C9172Fzf;
import X.C9174Fzh;
import X.C9175Fzi;
import X.C9178Fzl;
import X.C9179Fzm;
import X.C9181Fzo;
import X.C9183Fzq;
import X.C9184Fzr;
import X.C9187Fzu;
import X.C9uG;
import X.EnumC9091FyI;
import X.EnumC9092FyJ;
import X.EnumC9093FyK;
import X.EnumC9094FyL;
import X.EnumC9110Fyb;
import X.EnumC9112Fyd;
import X.EnumC9160FzT;
import X.F5J;
import X.Fy1;
import X.GDN;
import X.GF3;
import X.GF5;
import X.Hj8;
import X.Hma;
import X.Hrc;
import X.HsY;
import X.InterfaceC5283Dey;
import X.InterfaceC9011Fwo;
import X.InterfaceC9037FxJ;
import X.InterfaceC9132Fyx;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.common.util.concurrent.SettableFuture;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class HealthConnectClientImpl implements InterfaceC9037FxJ, Hrc {
    public final HsY A00;
    public final InterfaceC5283Dey A01;

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 java.lang.Object, still in use, count: 2, list:
          (r1v3 java.lang.Object) from 0x0012: IF  (r1v3 java.lang.Object) == (null java.lang.Object)  -> B:8:0x0014 A[HIDDEN] (LINE:18)
          (r1v3 java.lang.Object) from 0x0017: PHI (r1v2 java.lang.Object) = (r1v1 java.lang.Object), (r1v3 java.lang.Object) binds: [B:9:0x0015, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final int A01(X.InterfaceC9132Fyx r4, java.lang.String r5, java.util.Map r6) {
        /*
            r3 = 0
            java.util.Map r0 = r4.AMW()
            X.Fzu r2 = A09(r5, r0)
            if (r2 == 0) goto L14
            int r1 = r2.valueCase_
            r0 = 4
            if (r1 != r0) goto L15
            java.lang.Object r1 = r2.value_
            if (r1 != 0) goto L17
        L14:
            return r3
        L15:
            java.lang.String r1 = ""
        L17:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r6.getOrDefault(r1, r0)
            int r0 = X.AnonymousClass001.A0F(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientImpl.A01(X.Fyx, java.lang.String, java.util.Map):int");
    }

    public static final C8990FwS A04(C9169Fzc c9169Fzc) {
        C7384Etj.A0Y(c9169Fzc, 0);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(c9169Fzc.longValues_);
        Map mapUnmodifiableMap2 = Collections.unmodifiableMap(c9169Fzc.doubleValues_);
        GDN<C9183Fzq> gdn = c9169Fzc.dataOrigins_;
        C7384Etj.A0U(gdn);
        HashSet hashSetA13 = C60O.A13();
        Iterator<C9183Fzq> it = gdn.iterator();
        while (it.hasNext()) {
            String str = it.next().applicationId_;
            C7384Etj.A0U(str);
            hashSetA13.add(new C9012Fwp(str));
        }
        return new C8990FwS(mapUnmodifiableMap, mapUnmodifiableMap2, hashSetA13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v24, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v38, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final InterfaceC9011Fwo A05(C9168Fzb c9168Fzb) {
        InterfaceC9011Fwo c9063Fxl;
        InterfaceC9011Fwo c9005Fwi;
        InterfaceC9011Fwo c8878Frr;
        InterfaceC9011Fwo c9057Fxf;
        InterfaceC9011Fwo c9056Fxe;
        InterfaceC9011Fwo c8999Fwc;
        List listA0m;
        List listA0m2;
        List listA0m3;
        AbstractC9043FxP c9139Fz7;
        ?? A0m;
        C9184Fzr c9184Fzr = c9168Fzb.dataType_;
        C9184Fzr c9184Fzr2 = c9184Fzr;
        if (c9184Fzr == null) {
            c9184Fzr = C9184Fzr.DEFAULT_INSTANCE;
        }
        String str = c9184Fzr.name_;
        if (str != null) {
            C9072Fxy c9072Fxy = null;
            switch (str.hashCode()) {
                case -2137162425:
                    if (str.equals("Height")) {
                        c9063Fxl = new C9063Fxl(A06(c9168Fzb), AbstractC7608F5v.A0J(A00(c9168Fzb, HatchWebPageParserKt.HEIGHT_ATTR)), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case -1931142571:
                    if (str.equals("BasalMetabolicRate")) {
                        double dA00 = A00(c9168Fzb, "bmr");
                        C9144FzD c9144FzD = C9077Fy4.A02;
                        c9063Fxl = new C9069Fxr(A06(c9168Fzb), new C9077Fy4(EnumC9091FyI.A02, dA00), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case -1878699588:
                    if (str.equals("MenstruationPeriod")) {
                        Duration duration = C9000Fwd.A05;
                        return new C9000Fwd(A06(c9168Fzb), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb));
                    }
                    break;
                case -1739492291:
                    if (str.equals("HeartRateSeries")) {
                        Instant instantA0E = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I = A0I(c9168Fzb);
                        Instant instantA0G = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H = A0H(c9168Fzb);
                        GDN<C9172Fzf> gdn = c9168Fzb.seriesValues_;
                        C7384Etj.A0U(gdn);
                        ArrayList arrayListA0m = AnonymousClass002.A0m(gdn);
                        for (C9172Fzf c9172Fzf : gdn) {
                            Instant instantA11 = AbstractC7608F5v.A11(c9172Fzf.instantTimeMillis_);
                            C9187Fzu c9187FzuA09 = A09("bpm", Collections.unmodifiableMap(c9172Fzf.values_));
                            arrayListA0m.add(new C8879Frs(c9187FzuA09 != null ? A02(c9187FzuA09) : 0L, instantA11));
                        }
                        c9005Fwi = new C9005Fwi(A06(c9168Fzb), instantA0E, instantA0G, zoneOffsetA0I, zoneOffsetA0H, arrayListA0m);
                        return c9005Fwi;
                    }
                    break;
                case -1728782805:
                    if (str.equals("Vo2Max")) {
                        c8878Frr = new C8878Frr(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), A00(c9168Fzb, "vo2"), A01(c9168Fzb, "measurementMethod", C8878Frr.A06));
                        return c8878Frr;
                    }
                    break;
                case -1707725160:
                    if (str.equals("Weight")) {
                        c9063Fxl = new C9067Fxp(A06(c9168Fzb), AbstractC7608F5v.A0K(A00(c9168Fzb, "weight")), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case -1547814841:
                    if (str.equals("HeartRateVariabilityRmssd")) {
                        double dA002 = 1.0d;
                        if (A00(c9168Fzb, "heartRateVariability") >= 1.0d) {
                            dA002 = 200.0d;
                            if (A00(c9168Fzb, "heartRateVariability") <= 200.0d) {
                                dA002 = A00(c9168Fzb, "heartRateVariability");
                            }
                        }
                        return new C8877Frq(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), dA002);
                    }
                    break;
                case -1380153916:
                    if (str.equals("ActivityIntensity")) {
                        c8878Frr = new C8997Fwa(A06(c9168Fzb), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb), A01(c9168Fzb, "activityIntensityType", C8997Fwa.A0B));
                        return c8878Frr;
                    }
                    break;
                case -1249467044:
                    if (str.equals("LeanBodyMass")) {
                        c9063Fxl = new C9071Fxx(A06(c9168Fzb), AbstractC7608F5v.A0K(A00(c9168Fzb, "mass")), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case -1170329975:
                    if (str.equals("SexualActivity")) {
                        c9063Fxl = new C8870Frj(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "protectionUsed", C8870Frj.A05));
                        return c9063Fxl;
                    }
                    break;
                case -1089246824:
                    if (str.equals("TotalCaloriesBurned")) {
                        c9057Fxf = new C9057Fxf(A06(c9168Fzb), AbstractC7608F5v.A0I(A00(c9168Fzb, "energy")), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb));
                        return c9057Fxf;
                    }
                    break;
                case -633416129:
                    if (str.equals("BloodPressure")) {
                        c9056Fxe = new C9056Fxe(A06(c9168Fzb), new C9095FyM(A00(c9168Fzb, "systolic")), new C9095FyM(A00(c9168Fzb, "diastolic")), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "bodyPosition", C9056Fxe.A0E), A01(c9168Fzb, "measurementLocation", C9056Fxe.A0G));
                        return c9056Fxe;
                    }
                    break;
                case -562822786:
                    if (str.equals("SpeedSeries")) {
                        Instant instantA0E2 = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I2 = A0I(c9168Fzb);
                        Instant instantA0G2 = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H2 = A0H(c9168Fzb);
                        GDN<C9172Fzf> gdn2 = c9168Fzb.seriesValues_;
                        C7384Etj.A0U(gdn2);
                        ArrayList arrayListA0m2 = AnonymousClass002.A0m(gdn2);
                        for (C9172Fzf c9172Fzf2 : gdn2) {
                            Instant instantA112 = AbstractC7608F5v.A11(c9172Fzf2.instantTimeMillis_);
                            C9187Fzu c9187FzuA092 = A09("speed", c9172Fzf2.AMW());
                            double dA08 = c9187FzuA092 != null ? c9187FzuA092.A08() : 0.0d;
                            C9147FzG c9147FzG = C9078Fy5.A02;
                            arrayListA0m2.add(new C9028Fx8(new C9078Fy5(EnumC9094FyL.A02, dA08), instantA112));
                        }
                        c9005Fwi = new C9060Fxi(A06(c9168Fzb), instantA0E2, instantA0G2, zoneOffsetA0I2, zoneOffsetA0H2, arrayListA0m2);
                        return c9005Fwi;
                    }
                    break;
                case -561665783:
                    if (str.equals("BodyWaterMass")) {
                        c9063Fxl = new C9073Fxz(A06(c9168Fzb), AbstractC7608F5v.A0K(A00(c9168Fzb, "mass")), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case -539421262:
                    if (str.equals("OxygenSaturation")) {
                        c9063Fxl = new C8951FuQ(A06(c9168Fzb), new Hj8(A00(c9168Fzb, "percentage")), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case -187790444:
                    if (str.equals("MindfulnessSession")) {
                        c8878Frr = new C9002Fwf(A06(c9168Fzb), A0D(c9168Fzb, "title"), A0D(c9168Fzb, "notes"), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb), A01(c9168Fzb, "sessionType", C9002Fwf.A0A));
                        return c8878Frr;
                    }
                    break;
                case -136898551:
                    if (str.equals("OvulationTest")) {
                        c9063Fxl = new C8869Fri(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "result", C8869Fri.A05));
                        return c9063Fxl;
                    }
                    break;
                case 8847540:
                    if (str.equals("BloodGlucose")) {
                        Map<EnumC9093FyK, C9080Fy7> map = C9080Fy7.A02;
                        c8878Frr = new C9065Fxn(A06(c9168Fzb), new C9080Fy7(EnumC9093FyK.A02, A00(c9168Fzb, "level")), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "specimenSource", C9065Fxn.A0A), A01(c9168Fzb, "mealType", AbstractC8868Frh.A01), A01(c9168Fzb, "relationToMeal", C9065Fxn.A08));
                        return c8878Frr;
                    }
                    break;
                case 80208647:
                    if (str.equals("Steps")) {
                        C9187Fzu c9187FzuA093 = A09(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, c9168Fzb.AMW());
                        c8999Fwc = new C8999Fwc(A06(c9168Fzb), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb), c9187FzuA093 != null ? A02(c9187FzuA093) : 0L);
                        return c8999Fwc;
                    }
                    break;
                case 128630298:
                    if (str.equals("ActiveCaloriesBurned")) {
                        c9057Fxf = new C9064Fxm(A06(c9168Fzb), AbstractC7608F5v.A0I(A00(c9168Fzb, "energy")), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb));
                        return c9057Fxf;
                    }
                    break;
                case 187665747:
                    if (str.equals("BasalBodyTemperature")) {
                        c9056Fxe = new C9075Fy2(A06(c9168Fzb), new C9087FyE(EnumC9110Fyb.A02, A00(c9168Fzb, "temperature")), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "measurementLocation", AbstractC8871Frk.A01));
                        return c9056Fxe;
                    }
                    break;
                case 246984731:
                    if (str.equals("Menstruation")) {
                        c9063Fxl = new C8866Frf(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "flow", C8866Frf.A05));
                        return c9063Fxl;
                    }
                    break;
                case 353103893:
                    if (str.equals("Distance")) {
                        c9057Fxf = new C9061Fxj(A06(c9168Fzb), AbstractC7608F5v.A0J(A00(c9168Fzb, "distance")), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb));
                        return c9057Fxf;
                    }
                    break;
                case 557067342:
                    if (str.equals("CervicalMucus")) {
                        c9063Fxl = new C8867Frg(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "texture", C8867Frg.A06), A01(c9168Fzb, "amount", C8867Frg.A08));
                        return c9063Fxl;
                    }
                    break;
                case 578805655:
                    if (str.equals("SkinTemperature")) {
                        C9187Fzu c9187FzuA094 = A09("baseline", GF5.A03(c9168Fzb));
                        C9087FyE c9087FyE = c9187FzuA094 != null ? new C9087FyE(EnumC9110Fyb.A02, c9187FzuA094.A08()) : null;
                        int iA01 = A01(c9168Fzb, "measurementLocation", C9052Fxa.A0C);
                        Instant instantA0E3 = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I3 = A0I(c9168Fzb);
                        Instant instantA0G3 = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H3 = A0H(c9168Fzb);
                        C9179Fzm c9179Fzm = (C9179Fzm) Collections.unmodifiableMap(c9168Fzb.subTypeDataLists_).get("deltas");
                        if (c9179Fzm != null) {
                            GDN<C9175Fzi> gdn3 = c9179Fzm.values_;
                            C7384Etj.A0U(gdn3);
                            listA0m = AnonymousClass002.A0m(gdn3);
                            for (C9175Fzi c9175Fzi : gdn3) {
                                C9082Fy9 c9082Fy9 = C9085FyC.A03;
                                Instant instantA113 = AbstractC7608F5v.A11(c9175Fzi.startTimeMillis_);
                                C9187Fzu c9187FzuA095 = A09("temperatureDelta", Collections.unmodifiableMap(c9175Fzi.values_));
                                listA0m.add(new C9085FyC(new C9082Fy9(EnumC9112Fyd.A02, c9187FzuA095 != null ? c9187FzuA095.A08() : 0.0d), instantA113));
                            }
                        } else {
                            listA0m = C0881AGi.A00;
                        }
                        c9056Fxe = new C9052Fxa(A06(c9168Fzb), c9087FyE, instantA0E3, instantA0G3, zoneOffsetA0I3, zoneOffsetA0H3, listA0m, iA01);
                        return c9056Fxe;
                    }
                    break;
                case 761063032:
                    if (str.equals("RestingHeartRate")) {
                        C9187Fzu c9187FzuA096 = A09("bpm", c9168Fzb.AMW());
                        c8999Fwc = new C8880Frt(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), c9187FzuA096 != null ? A02(c9187FzuA096) : 0L);
                        return c8999Fwc;
                    }
                    break;
                case 955204109:
                    if (str.equals("FloorsClimbed")) {
                        c8999Fwc = new C9001Fwe(A06(c9168Fzb), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb), A00(c9168Fzb, "floors"));
                        return c8999Fwc;
                    }
                    break;
                case 989918314:
                    if (str.equals("RespiratoryRate")) {
                        c8999Fwc = new C8876Frp(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb), A00(c9168Fzb, "rate"));
                        return c8999Fwc;
                    }
                    break;
                case 1051870422:
                    if (str.equals("Hydration")) {
                        double dA003 = A00(c9168Fzb, "volume");
                        C9148FzH c9148FzH = C9079Fy6.A02;
                        c9057Fxf = new C9059Fxh(A06(c9168Fzb), new C9079Fy6(EnumC9092FyJ.A02, dA003), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb));
                        return c9057Fxf;
                    }
                    break;
                case 1108584865:
                    if (str.equals("StepsCadenceSeries")) {
                        Instant instantA0E4 = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I4 = A0I(c9168Fzb);
                        Instant instantA0G4 = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H4 = A0H(c9168Fzb);
                        GDN<C9172Fzf> gdn4 = c9168Fzb.seriesValues_;
                        C7384Etj.A0U(gdn4);
                        ArrayList arrayListA0m3 = AnonymousClass002.A0m(gdn4);
                        for (C9172Fzf c9172Fzf3 : gdn4) {
                            Instant instantA114 = AbstractC7608F5v.A11(c9172Fzf3.instantTimeMillis_);
                            C9187Fzu c9187FzuA097 = A09("rate", c9172Fzf3.AMW());
                            arrayListA0m3.add(new C8875Fro(c9187FzuA097 != null ? c9187FzuA097.A08() : 0.0d, instantA114));
                        }
                        c9005Fwi = new C9006Fwj(A06(c9168Fzb), instantA0E4, instantA0G4, zoneOffsetA0I4, zoneOffsetA0H4, arrayListA0m3);
                        return c9005Fwi;
                    }
                    break;
                case 1193457969:
                    if (str.equals("IntermenstrualBleeding")) {
                        return new C8872Frl(A06(c9168Fzb), A0F(c9168Fzb), A0J(c9168Fzb));
                    }
                    break;
                case 1468615931:
                    if (str.equals("ElevationGained")) {
                        c9057Fxf = new C9066Fxo(A06(c9168Fzb), AbstractC7608F5v.A0J(A00(c9168Fzb, "elevation")), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb));
                        return c9057Fxf;
                    }
                    break;
                case 1478142546:
                    if (str.equals("WheelchairPushes")) {
                        C9187Fzu c9187FzuA098 = A09(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, c9168Fzb.AMW());
                        c8999Fwc = new C8998Fwb(A06(c9168Fzb), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb), c9187FzuA098 != null ? A02(c9187FzuA098) : 0L);
                        return c8999Fwc;
                    }
                    break;
                case 1498531293:
                    if (str.equals("CyclingPedalingCadenceSeries")) {
                        Instant instantA0E5 = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I5 = A0I(c9168Fzb);
                        Instant instantA0G5 = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H5 = A0H(c9168Fzb);
                        GDN<C9172Fzf> gdn5 = c9168Fzb.seriesValues_;
                        C7384Etj.A0U(gdn5);
                        ArrayList arrayListA0m4 = AnonymousClass002.A0m(gdn5);
                        for (C9172Fzf c9172Fzf4 : gdn5) {
                            Instant instantA115 = AbstractC7608F5v.A11(c9172Fzf4.instantTimeMillis_);
                            C9187Fzu c9187FzuA099 = A09("rpm", c9172Fzf4.AMW());
                            arrayListA0m4.add(new C8874Frn(c9187FzuA099 != null ? c9187FzuA099.A08() : 0.0d, instantA115));
                        }
                        c9005Fwi = new C9007Fwk(A06(c9168Fzb), instantA0E5, instantA0G5, zoneOffsetA0I5, zoneOffsetA0H5, arrayListA0m4);
                        return c9005Fwi;
                    }
                    break;
                case 1513758823:
                    if (str.equals("ActivitySession")) {
                        int iA012 = A01(c9168Fzb, "activityType", C9048FxW.A0E);
                        String strA0D = A0D(c9168Fzb, "title");
                        String strA0D2 = A0D(c9168Fzb, "notes");
                        Instant instantA0E6 = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I6 = A0I(c9168Fzb);
                        Instant instantA0G6 = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H6 = A0H(c9168Fzb);
                        C9086FyD c9086FyDA06 = A06(c9168Fzb);
                        C9179Fzm c9179Fzm2 = (C9179Fzm) Collections.unmodifiableMap(c9168Fzb.subTypeDataLists_).get("segments");
                        if (c9179Fzm2 != null) {
                            GDN<C9175Fzi> gdn6 = c9179Fzm2.values_;
                            C7384Etj.A0U(gdn6);
                            listA0m2 = AnonymousClass002.A0m(gdn6);
                            for (C9175Fzi c9175Fzi2 : gdn6) {
                                Set<Integer> set = C9068Fxq.A07;
                                Instant instantA116 = AbstractC7608F5v.A11(c9175Fzi2.startTimeMillis_);
                                Instant instantA117 = AbstractC7608F5v.A11(c9175Fzi2.endTimeMillis_);
                                C9187Fzu c9187FzuA0910 = A09("type", Collections.unmodifiableMap(c9175Fzi2.values_));
                                int iA02 = 0;
                                int iA0F = AnonymousClass001.A0F(c9187FzuA0910 != null ? Long.valueOf(A02(c9187FzuA0910)) : 0);
                                C9187Fzu c9187FzuA0911 = A09("reps", Collections.unmodifiableMap(c9175Fzi2.values_));
                                if (c9187FzuA0911 != null) {
                                    iA02 = (int) A02(c9187FzuA0911);
                                }
                                listA0m2.add(new C9068Fxq(instantA116, instantA117, iA0F, iA02));
                            }
                        } else {
                            listA0m2 = C0881AGi.A00;
                        }
                        C9179Fzm c9179Fzm3 = (C9179Fzm) Collections.unmodifiableMap(c9168Fzb.subTypeDataLists_).get("laps");
                        if (c9179Fzm3 != null) {
                            GDN<C9175Fzi> gdn7 = c9179Fzm3.values_;
                            C7384Etj.A0U(gdn7);
                            listA0m3 = AnonymousClass002.A0m(gdn7);
                            for (C9175Fzi c9175Fzi3 : gdn7) {
                                Instant instantA118 = AbstractC7608F5v.A11(c9175Fzi3.startTimeMillis_);
                                Instant instantA119 = AbstractC7608F5v.A11(c9175Fzi3.endTimeMillis_);
                                C9187Fzu c9187FzuA0912 = A09("length", Collections.unmodifiableMap(c9175Fzi3.values_));
                                listA0m3.add(new C9088FyF(c9187FzuA0912 != null ? AbstractC7608F5v.A0J(c9187FzuA0912.A08()) : null, instantA118, instantA119));
                            }
                        } else {
                            listA0m3 = C0881AGi.A00;
                        }
                        C9179Fzm c9179Fzm4 = (C9179Fzm) Collections.unmodifiableMap(c9168Fzb.subTypeDataLists_).get("route");
                        if (c9179Fzm4 != null) {
                            GDN<C9175Fzi> gdn8 = c9179Fzm4.values_;
                            C7384Etj.A0U(gdn8);
                            ArrayList arrayListA0m5 = AnonymousClass002.A0m(gdn8);
                            for (C9175Fzi c9175Fzi4 : gdn8) {
                                Instant instantA1110 = AbstractC7608F5v.A11(c9175Fzi4.startTimeMillis_);
                                C9187Fzu c9187FzuA0913 = A09(GeofenceEventWorker.KEY_LATITUDE, Collections.unmodifiableMap(c9175Fzi4.values_));
                                double dA082 = c9187FzuA0913 != null ? c9187FzuA0913.A08() : 0.0d;
                                C9187Fzu c9187FzuA0914 = A09(GeofenceEventWorker.KEY_LONGITUDE, Collections.unmodifiableMap(c9175Fzi4.values_));
                                double dA083 = c9187FzuA0914 != null ? c9187FzuA0914.A08() : 0.0d;
                                C9187Fzu c9187FzuA0915 = A09("altitude", Collections.unmodifiableMap(c9175Fzi4.values_));
                                Fy1 fy1A0J = null;
                                Fy1 fy1A0J2 = c9187FzuA0915 != null ? AbstractC7608F5v.A0J(c9187FzuA0915.A08()) : null;
                                C9187Fzu c9187FzuA0916 = A09("horizontal_accuracy", Collections.unmodifiableMap(c9175Fzi4.values_));
                                Fy1 fy1A0J3 = c9187FzuA0916 != null ? AbstractC7608F5v.A0J(c9187FzuA0916.A08()) : null;
                                C9187Fzu c9187FzuA0917 = A09("vertical_accuracy", Collections.unmodifiableMap(c9175Fzi4.values_));
                                if (c9187FzuA0917 != null) {
                                    fy1A0J = AbstractC7608F5v.A0J(c9187FzuA0917.A08());
                                }
                                arrayListA0m5.add(new C9034FxG(fy1A0J3, fy1A0J, fy1A0J2, instantA1110, dA082, dA083));
                            }
                            c9139Fz7 = new C9039FxL(new C9040FxM(arrayListA0m5));
                        } else {
                            C9187Fzu c9187FzuA0918 = A09("hasRoute", GF5.A03(c9168Fzb));
                            c9139Fz7 = (c9187FzuA0918 != null && c9187FzuA0918.valueCase_ == 5 && AnonymousClass001.A1X(c9187FzuA0918.value_)) ? new C9139Fz7() : new C9140Fz8();
                        }
                        c8878Frr = new C9048FxW(c9139Fz7, c9086FyDA06, strA0D, strA0D2, null, instantA0E6, instantA0G6, zoneOffsetA0I6, zoneOffsetA0H6, listA0m2, listA0m3, iA012);
                        return c8878Frr;
                    }
                    break;
                case 1584919122:
                    if (str.equals("BodyTemperature")) {
                        c9056Fxe = new C9084FyB(A06(c9168Fzb), new C9087FyE(EnumC9110Fyb.A02, A00(c9168Fzb, "temperature")), A0F(c9168Fzb), A0J(c9168Fzb), A01(c9168Fzb, "measurementLocation", AbstractC8871Frk.A01));
                        return c9056Fxe;
                    }
                    break;
                case 1719563767:
                    if (str.equals("BodyFat")) {
                        c9063Fxl = new C8952FuR(A06(c9168Fzb), new Hj8(A00(c9168Fzb, "percentage")), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case 1738316664:
                    if (str.equals("Nutrition")) {
                        C9072Fxy c9072FxyA07 = A07("biotin", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA072 = A07("caffeine", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA073 = A07("calcium", GF5.A03(c9168Fzb));
                        C9187Fzu c9187FzuA0919 = A09("calories", GF5.A03(c9168Fzb));
                        C9076Fy3 c9076Fy3A0I = c9187FzuA0919 != null ? AbstractC7608F5v.A0I(c9187FzuA0919.A08()) : null;
                        C9187Fzu c9187FzuA0920 = A09("caloriesFromFat", GF5.A03(c9168Fzb));
                        C9076Fy3 c9076Fy3A0I2 = c9187FzuA0920 != null ? AbstractC7608F5v.A0I(c9187FzuA0920.A08()) : null;
                        C9072Fxy c9072FxyA074 = A07("chloride", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA075 = A07("cholesterol", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA076 = A07("chromium", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA077 = A07("copper", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA078 = A07("dietaryFiber", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA079 = A07("folate", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0710 = A07("folicAcid", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0711 = A07("iodine", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0712 = A07("iron", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0713 = A07("magnesium", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0714 = A07("manganese", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0715 = A07("molybdenum", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0716 = A07("monounsaturatedFat", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0717 = A07("niacin", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0718 = A07("pantothenicAcid", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0719 = A07("phosphorus", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0720 = A07("polyunsaturatedFat", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0721 = A07("potassium", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0722 = A07("protein", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0723 = A07("riboflavin", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0724 = A07("saturatedFat", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0725 = A07("selenium", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0726 = A07("sodium", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0727 = A07("sugar", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0728 = A07("thiamin", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0729 = A07("totalCarbohydrate", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0730 = A07("totalFat", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0731 = A07("transFat", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0732 = A07("unsaturatedFat", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0733 = A07("vitaminA", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0734 = A07("vitaminB12", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0735 = A07("vitaminB6", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0736 = A07("vitaminC", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0737 = A07("vitaminD", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0738 = A07("vitaminE", GF5.A03(c9168Fzb));
                        C9072Fxy c9072FxyA0739 = A07("vitaminK", GF5.A03(c9168Fzb));
                        C9187Fzu c9187FzuA0921 = A09("zinc", GF5.A03(c9168Fzb));
                        if (c9187FzuA0921 != null) {
                            double dA084 = c9187FzuA0921.A08();
                            C9120Fyl c9120Fyl = C9072Fxy.A02;
                            c9072Fxy = new C9072Fxy(EnumC9160FzT.A02, dA084);
                        }
                        c9056Fxe = new C9046FxU(A06(c9168Fzb), c9076Fy3A0I, c9076Fy3A0I2, c9072FxyA07, c9072FxyA072, c9072FxyA073, c9072FxyA074, c9072FxyA075, c9072FxyA076, c9072FxyA077, c9072FxyA078, c9072FxyA079, c9072FxyA0710, c9072FxyA0711, c9072FxyA0712, c9072FxyA0713, c9072FxyA0714, c9072FxyA0715, c9072FxyA0716, c9072FxyA0717, c9072FxyA0718, c9072FxyA0719, c9072FxyA0720, c9072FxyA0721, c9072FxyA0722, c9072FxyA0723, c9072FxyA0724, c9072FxyA0725, c9072FxyA0726, c9072FxyA0727, c9072FxyA0728, c9072FxyA0729, c9072FxyA0730, c9072FxyA0731, c9072FxyA0732, c9072FxyA0733, c9072FxyA0734, c9072FxyA0735, c9072FxyA0736, c9072FxyA0737, c9072FxyA0738, c9072FxyA0739, c9072Fxy, A0D(c9168Fzb, "name"), A0E(c9168Fzb), A0G(c9168Fzb), A0I(c9168Fzb), A0H(c9168Fzb), A01(c9168Fzb, "mealType", AbstractC8868Frh.A01));
                        return c9056Fxe;
                    }
                    break;
                case 2034898936:
                    if (str.equals("BoneMass")) {
                        c9063Fxl = new C9074Fy0(A06(c9168Fzb), AbstractC7608F5v.A0K(A00(c9168Fzb, "mass")), A0F(c9168Fzb), A0J(c9168Fzb));
                        return c9063Fxl;
                    }
                    break;
                case 2065313759:
                    if (str.equals("SleepSession")) {
                        String strA0D3 = A0D(c9168Fzb, "title");
                        String strA0D4 = A0D(c9168Fzb, "notes");
                        Instant instantA0E7 = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I7 = A0I(c9168Fzb);
                        Instant instantA0G7 = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H7 = A0H(c9168Fzb);
                        C9179Fzm c9179Fzm5 = (C9179Fzm) Collections.unmodifiableMap(c9168Fzb.subTypeDataLists_).get("stages");
                        if (c9179Fzm5 != null) {
                            GDN<C9175Fzi> gdn9 = c9179Fzm5.values_;
                            C7384Etj.A0U(gdn9);
                            A0m = AnonymousClass002.A0m(gdn9);
                            for (C9175Fzi c9175Fzi5 : gdn9) {
                                Instant instantA1111 = AbstractC7608F5v.A11(c9175Fzi5.startTimeMillis_);
                                Instant instantA1112 = AbstractC7608F5v.A11(c9175Fzi5.endTimeMillis_);
                                Map<String, Integer> map2 = C9003Fwg.A0A;
                                C9187Fzu c9187FzuA0922 = A09(AgeCheckFunnelLogging.KEY_STAGE, Collections.unmodifiableMap(c9175Fzi5.values_));
                                Number numberA0b = BV4.A0b(c9187FzuA0922 != null ? c9187FzuA0922.valueCase_ == 4 ? c9187FzuA0922.value_ : "" : null, map2);
                                A0m.add(new C9004Fwh(instantA1111, instantA1112, numberA0b != null ? numberA0b.intValue() : 0));
                            }
                        } else {
                            A0m = C0881AGi.A00;
                        }
                        return new C9003Fwg(A06(c9168Fzb), strA0D3, strA0D4, instantA0E7, instantA0G7, zoneOffsetA0I7, zoneOffsetA0H7, A0m);
                    }
                    break;
                case 2095285180:
                    if (str.equals("PowerSeries")) {
                        Instant instantA0E8 = A0E(c9168Fzb);
                        ZoneOffset zoneOffsetA0I8 = A0I(c9168Fzb);
                        Instant instantA0G8 = A0G(c9168Fzb);
                        ZoneOffset zoneOffsetA0H8 = A0H(c9168Fzb);
                        GDN<C9172Fzf> gdn10 = c9168Fzb.seriesValues_;
                        C7384Etj.A0U(gdn10);
                        ArrayList arrayListA0m6 = AnonymousClass002.A0m(gdn10);
                        for (C9172Fzf c9172Fzf5 : gdn10) {
                            Instant instantA1113 = AbstractC7608F5v.A11(c9172Fzf5.instantTimeMillis_);
                            C9187Fzu c9187FzuA0923 = A09("power", c9172Fzf5.AMW());
                            double dA085 = c9187FzuA0923 != null ? c9187FzuA0923.A08() : 0.0d;
                            C9144FzD c9144FzD2 = C9077Fy4.A02;
                            arrayListA0m6.add(new C9081Fy8(new C9077Fy4(EnumC9091FyI.A03, dA085), instantA1113));
                        }
                        c9005Fwi = new C9062Fxk(A06(c9168Fzb), instantA0E8, instantA0G8, zoneOffsetA0I8, zoneOffsetA0H8, arrayListA0m6);
                        return c9005Fwi;
                    }
                    break;
            }
        }
        if (c9184Fzr2 == null) {
            c9184Fzr2 = C9184Fzr.DEFAULT_INSTANCE;
        }
        throw BV5.A0h("Unknown data type ", c9184Fzr2.name_);
    }

    public static C9072Fxy A07(Object obj, Map map) {
        C9187Fzu c9187Fzu = (C9187Fzu) map.get(obj);
        if (c9187Fzu == null) {
            return null;
        }
        double dA08 = c9187Fzu.A08();
        C9120Fyl c9120Fyl = C9072Fxy.A02;
        return new C9072Fxy(EnumC9160FzT.A02, dA08);
    }

    public static final C9184Fzr A08(C9uG<? extends InterfaceC9011Fwo> c9uG) {
        C7384Etj.A0Y(c9uG, 0);
        GF3 gf3A05 = C9184Fzr.DEFAULT_INSTANCE.A05();
        String strA0p = C60O.A0p(c9uG, AbstractC9050FxY.A00);
        if (strA0p == null) {
            throw C8j3.A18(AnonymousClass007.A0a("Not supported yet: ", c9uG));
        }
        gf3A05.A01();
        C9184Fzr c9184Fzr = (C9184Fzr) gf3A05.A00;
        c9184Fzr.bitField0_ |= 1;
        c9184Fzr.name_ = strA0p;
        return (C9184Fzr) gf3A05.A00();
    }

    public static final C9178Fzl A0A(C8993FwW<?> c8993FwW) {
        C7384Etj.A0Y(c8993FwW, 0);
        GF3 gf3A05 = C9178Fzl.DEFAULT_INSTANCE.A05();
        String str = c8993FwW.A03;
        gf3A05.A01();
        C9178Fzl c9178Fzl = (C9178Fzl) gf3A05.A00;
        c9178Fzl.bitField0_ |= 1;
        c9178Fzl.dataTypeName_ = str;
        String strA00 = AbstractC8994FwX.A00(c8993FwW.A01);
        gf3A05.A01();
        C9178Fzl c9178Fzl2 = (C9178Fzl) gf3A05.A00;
        c9178Fzl2.bitField0_ |= 2;
        c9178Fzl2.aggregationType_ = strA00;
        String str2 = c8993FwW.A02;
        if (str2 != null) {
            gf3A05.A01();
            C9178Fzl c9178Fzl3 = (C9178Fzl) gf3A05.A00;
            c9178Fzl3.bitField0_ |= 4;
            c9178Fzl3.fieldName_ = str2;
        }
        return (C9178Fzl) gf3A05.A00();
    }

    public static Object A0C(C5272Dem c5272Dem, Object obj, C8914FtW c8914FtW, int i) {
        SettableFuture settableFutureA01 = c5272Dem.A01(new F5J(i, c5272Dem, obj), 1);
        c8914FtW.A00 = 1;
        return Br8.A00(settableFutureA01, c8914FtW);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A48(X.C9031FxC r8, X.HtJ<? super X.C8990FwS> r9) throws android.os.RemoteException {
        /*
            r7 = this;
            r6 = 0
            boolean r0 = r9 instanceof X.C8914FtW
            if (r0 == 0) goto L23
            r4 = r9
            X.FtW r4 = (X.C8914FtW) r4
            int r0 = r4.$t
            if (r0 != r6) goto L23
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r2 = r4.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L29
            goto L9c
        L23:
            X.FtW r4 = new X.FtW
            r4.<init>(r7, r9, r6)
            goto L17
        L29:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L2e:
            X.Hwg.A00(r2)
            X.Dey r5 = r7.A01     // Catch: android.os.RemoteException -> Lce
            X.C7384Etj.A0Y(r8, r6)     // Catch: android.os.RemoteException -> Lce
            X.Fzd r0 = X.C9170Fzd.DEFAULT_INSTANCE     // Catch: android.os.RemoteException -> Lce
            X.GF3 r6 = r0.A05()     // Catch: android.os.RemoteException -> Lce
            X.FyG r6 = (X.C9089FyG) r6     // Catch: android.os.RemoteException -> Lce
            X.Fx3 r0 = r8.A00     // Catch: android.os.RemoteException -> Lce
            X.Fzh r0 = A0B(r0)     // Catch: android.os.RemoteException -> Lce
            r6.A01()     // Catch: android.os.RemoteException -> Lce
            MessageType extends X.GF2<MessageType, BuilderType> r1 = r6.A00     // Catch: android.os.RemoteException -> Lce
            X.Fzd r1 = (X.C9170Fzd) r1     // Catch: android.os.RemoteException -> Lce
            r0.getClass()     // Catch: android.os.RemoteException -> Lce
            r1.timeSpec_ = r0     // Catch: android.os.RemoteException -> Lce
            int r0 = r1.bitField0_     // Catch: android.os.RemoteException -> Lce
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch: android.os.RemoteException -> Lce
            java.util.Set<X.Fwp> r0 = r8.A01     // Catch: android.os.RemoteException -> Lce
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)     // Catch: android.os.RemoteException -> Lce
            java.util.Iterator r1 = r0.iterator()     // Catch: android.os.RemoteException -> Lce
        L60:
            boolean r0 = r1.hasNext()     // Catch: android.os.RemoteException -> Lce
            if (r0 == 0) goto L6a
            A0K(r2, r1)     // Catch: android.os.RemoteException -> Lce
            goto L60
        L6a:
            r6.A02(r2)     // Catch: android.os.RemoteException -> Lce
            java.util.Set<X.FwW<?>> r0 = r8.A02     // Catch: android.os.RemoteException -> Lce
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)     // Catch: android.os.RemoteException -> Lce
            java.util.Iterator r1 = r0.iterator()     // Catch: android.os.RemoteException -> Lce
        L77:
            boolean r0 = r1.hasNext()     // Catch: android.os.RemoteException -> Lce
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r1.next()     // Catch: android.os.RemoteException -> Lce
            X.FwW r0 = (X.C8993FwW) r0     // Catch: android.os.RemoteException -> Lce
            X.Fzl r0 = A0A(r0)     // Catch: android.os.RemoteException -> Lce
            r2.add(r0)     // Catch: android.os.RemoteException -> Lce
            goto L77
        L8b:
            r6.A03(r2)     // Catch: android.os.RemoteException -> Lce
            X.GF2 r1 = r6.A00()     // Catch: android.os.RemoteException -> Lce
            X.Dem r5 = (X.C5272Dem) r5     // Catch: android.os.RemoteException -> Lce
            r0 = 2
            java.lang.Object r2 = A0C(r5, r1, r4, r0)     // Catch: android.os.RemoteException -> Lce
            if (r2 != r3) goto L9f
            return r3
        L9c:
            X.Hwg.A00(r2)     // Catch: android.os.RemoteException -> Lce
        L9f:
            X.Fzp r2 = (X.C9182Fzp) r2     // Catch: android.os.RemoteException -> Lce
            X.GDN<X.Fzc> r0 = r2.rows_
            X.C7384Etj.A0U(r0)
            java.lang.Object r0 = X.AbstractC0878AGe.A0F(r0)
            X.C7384Etj.A0U(r0)
            X.Fzc r0 = (X.C9169Fzc) r0
            X.FwS r3 = A04(r0)
            java.util.Map<java.lang.String, java.lang.Long> r0 = r3.A01
            int r2 = r0.size()
            java.util.Map<java.lang.String, java.lang.Double> r0 = r3.A00
            int r0 = r0.size()
            int r2 = r2 + r0
            java.lang.String r1 = "Retrieved "
            java.lang.String r0 = " metrics."
            java.lang.String r1 = X.FGI.A0I(r1, r2, r0)
            java.lang.String r0 = "HealthConnectClient"
            X.AbstractC7529Ezo.A00(r0, r1)
            return r3
        Lce:
            r0 = move-exception
            android.os.RemoteException r1 = A03(r0)
            r1.initCause(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientImpl.A48(X.FxC, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A49(X.C9029FxA r9, X.HtJ<? super java.util.List<X.C9030FxB>> r10) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientImpl.A49(X.FxA, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ADV(java.lang.String r9, X.HtJ<? super X.C8973FvT> r10) throws android.os.RemoteException {
        /*
            r8 = this;
            r3 = 2
            boolean r0 = r10 instanceof X.C8914FtW
            if (r0 == 0) goto L23
            r7 = r10
            X.FtW r7 = (X.C8914FtW) r7
            int r0 = r7.$t
            if (r0 != r3) goto L23
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.A00 = r2
        L17:
            java.lang.Object r5 = r7.A01
            X.Hji r0 = X.EnumC10460Hji.A02
            int r1 = r7.A00
            r6 = 1
            if (r1 == 0) goto L2e
            if (r1 != r6) goto L29
            goto L59
        L23:
            X.FtW r7 = new X.FtW
            r7.<init>(r8, r10, r3)
            goto L17
        L29:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L2e:
            X.Hwg.A00(r5)
            X.Dey r5 = r8.A01     // Catch: android.os.RemoteException -> Lae
            X.Fzt r1 = X.C9186Fzt.DEFAULT_INSTANCE     // Catch: android.os.RemoteException -> Lae
            X.GF3 r4 = r1.A05()     // Catch: android.os.RemoteException -> Lae
            r4.A01()     // Catch: android.os.RemoteException -> Lae
            MessageType extends X.GF2<MessageType, BuilderType> r2 = r4.A00     // Catch: android.os.RemoteException -> Lae
            X.Fzt r2 = (X.C9186Fzt) r2     // Catch: android.os.RemoteException -> Lae
            r9.getClass()     // Catch: android.os.RemoteException -> Lae
            int r1 = r2.bitField0_     // Catch: android.os.RemoteException -> Lae
            r1 = r1 | 1
            r2.bitField0_ = r1     // Catch: android.os.RemoteException -> Lae
            r2.changesToken_ = r9     // Catch: android.os.RemoteException -> Lae
            X.GF2 r2 = r4.A00()     // Catch: android.os.RemoteException -> Lae
            X.Dem r5 = (X.C5272Dem) r5     // Catch: android.os.RemoteException -> Lae
            r1 = 0
            java.lang.Object r5 = A0C(r5, r2, r7, r1)     // Catch: android.os.RemoteException -> Lae
            if (r5 != r0) goto L5c
            return r0
        L59:
            X.Hwg.A00(r5)     // Catch: android.os.RemoteException -> Lae
        L5c:
            X.Fzj r5 = (X.C9176Fzj) r5     // Catch: android.os.RemoteException -> Lae
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            X.GDN<X.Fzx> r0 = r5.changes_
            java.util.ArrayList r4 = X.C60Q.A0s(r0)
            java.util.Iterator r2 = r0.iterator()
        L6c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r1 = r2.next()
            X.Fzx r1 = (X.C9190Fzx) r1
            int r0 = r1.changeCase_
            if (r0 != r3) goto L8c
            java.lang.Object r0 = r1.change_
            java.lang.String r0 = (java.lang.String) r0
            X.C7384Etj.A0U(r0)
            X.FvR r1 = new X.FvR
            r1.<init>(r0)
        L88:
            r4.add(r1)
            goto L6c
        L8c:
            if (r0 != r6) goto L6c
            java.lang.Object r0 = r1.change_
            X.Fzb r0 = (X.C9168Fzb) r0
            X.C7384Etj.A0U(r0)
            X.Fwo r0 = A05(r0)
            X.FvS r1 = new X.FvS
            r1.<init>(r0)
            goto L88
        L9f:
            java.lang.String r3 = r5.nextChangesToken_
            X.C7384Etj.A0U(r3)
            boolean r2 = r5.hasMore_
            boolean r1 = r5.changesTokenExpired_
            X.FvT r0 = new X.FvT
            r0.<init>(r4, r3, r2, r1)
            return r0
        Lae:
            r0 = move-exception
            android.os.RemoteException r1 = A03(r0)
            r1.initCause(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientImpl.ADV(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ADW(X.FvW r10, X.HtJ<? super java.lang.String> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            r3 = 3
            boolean r0 = r11 instanceof X.C8914FtW
            if (r0 == 0) goto Ld
            r0 = r11
            X.FtW r0 = (X.C8914FtW) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2b
            r5 = r11
            X.FtW r5 = (X.C8914FtW) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r5.A00 = r2
        L1e:
            java.lang.Object r1 = r5.A01
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 != r4) goto L31
            goto Ld1
        L2b:
            X.FtW r5 = new X.FtW
            r5.<init>(r9, r11, r3)
            goto L1e
        L31:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L36:
            X.Hwg.A00(r1)
            X.Dey r8 = r9.A01     // Catch: android.os.RemoteException -> Ldc
            X.Fzg r0 = X.C9173Fzg.DEFAULT_INSTANCE     // Catch: android.os.RemoteException -> Ldc
            X.GF3 r9 = r0.A05()     // Catch: android.os.RemoteException -> Ldc
            java.util.Set<X.9uG<? extends X.Fwo>> r0 = r10.A01     // Catch: android.os.RemoteException -> Ldc
            java.util.ArrayList r7 = X.AnonymousClass002.A0m(r0)     // Catch: android.os.RemoteException -> Ldc
            java.util.Iterator r1 = r0.iterator()     // Catch: android.os.RemoteException -> Ldc
        L4b:
            boolean r0 = r1.hasNext()     // Catch: android.os.RemoteException -> Ldc
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.next()     // Catch: android.os.RemoteException -> Ldc
            X.9uG r0 = (X.C9uG) r0     // Catch: android.os.RemoteException -> Ldc
            X.Fzr r0 = A08(r0)     // Catch: android.os.RemoteException -> Ldc
            r7.add(r0)     // Catch: android.os.RemoteException -> Ldc
            goto L4b
        L5f:
            r9.A01()     // Catch: android.os.RemoteException -> Ldc
            MessageType extends X.GF2<MessageType, BuilderType> r3 = r9.A00     // Catch: android.os.RemoteException -> Ldc
            X.Fzg r3 = (X.C9173Fzg) r3     // Catch: android.os.RemoteException -> Ldc
            X.GDN<X.Fzr> r2 = r3.dataType_     // Catch: android.os.RemoteException -> Ldc
            r0 = r2
            X.GDC r0 = (X.GDC) r0     // Catch: android.os.RemoteException -> Ldc
            boolean r0 = r0.A00     // Catch: android.os.RemoteException -> Ldc
            if (r0 != 0) goto L7f
            int r1 = r2.size()     // Catch: android.os.RemoteException -> Ldc
            int r0 = r1 * 2
            if (r1 != 0) goto L79
            r0 = 10
        L79:
            X.GDN r2 = r2.AR0(r0)     // Catch: android.os.RemoteException -> Ldc
            r3.dataType_ = r2     // Catch: android.os.RemoteException -> Ldc
        L7f:
            X.AbstractC10480Hkv.A00(r7, r2)     // Catch: android.os.RemoteException -> Ldc
            java.util.Set<X.Fwp> r0 = r10.A00     // Catch: android.os.RemoteException -> Ldc
            java.util.ArrayList r7 = X.AnonymousClass002.A0m(r0)     // Catch: android.os.RemoteException -> Ldc
            java.util.Iterator r1 = r0.iterator()     // Catch: android.os.RemoteException -> Ldc
        L8c:
            boolean r0 = r1.hasNext()     // Catch: android.os.RemoteException -> Ldc
            if (r0 == 0) goto L96
            A0K(r7, r1)     // Catch: android.os.RemoteException -> Ldc
            goto L8c
        L96:
            r9.A01()     // Catch: android.os.RemoteException -> Ldc
            MessageType extends X.GF2<MessageType, BuilderType> r3 = r9.A00     // Catch: android.os.RemoteException -> Ldc
            X.Fzg r3 = (X.C9173Fzg) r3     // Catch: android.os.RemoteException -> Ldc
            X.GDN<X.Fzq> r2 = r3.dataOriginFilters_     // Catch: android.os.RemoteException -> Ldc
            r0 = r2
            X.GDC r0 = (X.GDC) r0     // Catch: android.os.RemoteException -> Ldc
            boolean r0 = r0.A00     // Catch: android.os.RemoteException -> Ldc
            if (r0 != 0) goto Lb6
            int r1 = r2.size()     // Catch: android.os.RemoteException -> Ldc
            int r0 = r1 * 2
            if (r1 != 0) goto Lb0
            r0 = 10
        Lb0:
            X.GDN r2 = r2.AR0(r0)     // Catch: android.os.RemoteException -> Ldc
            r3.dataOriginFilters_ = r2     // Catch: android.os.RemoteException -> Ldc
        Lb6:
            X.AbstractC10480Hkv.A00(r7, r2)     // Catch: android.os.RemoteException -> Ldc
            X.GF2 r1 = r9.A00()     // Catch: android.os.RemoteException -> Ldc
            X.Dem r8 = (X.C5272Dem) r8     // Catch: android.os.RemoteException -> Ldc
            X.F5J r0 = new X.F5J     // Catch: android.os.RemoteException -> Ldc
            r0.<init>(r4, r8, r1)     // Catch: android.os.RemoteException -> Ldc
            com.google.common.util.concurrent.SettableFuture r0 = r8.A01(r0, r4)     // Catch: android.os.RemoteException -> Ldc
            r5.A00 = r4     // Catch: android.os.RemoteException -> Ldc
            java.lang.Object r1 = X.Br8.A00(r0, r5)     // Catch: android.os.RemoteException -> Ldc
            if (r1 != r6) goto Ld4
            return r6
        Ld1:
            X.Hwg.A00(r1)     // Catch: android.os.RemoteException -> Ldc
        Ld4:
            X.Fzw r1 = (X.C9189Fzw) r1     // Catch: android.os.RemoteException -> Ldc
            java.lang.String r6 = r1.changesToken_
            X.C7384Etj.A0X(r6)
            return r6
        Ldc:
            r0 = move-exception
            android.os.RemoteException r1 = A03(r0)
            r1.initCause(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientImpl.ADW(X.FvW, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.Hrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AG0(X.HtJ<? super java.util.Set<java.lang.String>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r3 = 4
            boolean r0 = r9 instanceof X.C8914FtW
            if (r0 == 0) goto Ld
            r0 = r9
            X.FtW r0 = (X.C8914FtW) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2a
            r4 = r9
            X.FtW r4 = (X.C8914FtW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r4.A00 = r2
        L1e:
            java.lang.Object r1 = r4.A01
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L35
            if (r0 != r6) goto L30
            goto L90
        L2a:
            X.FtW r4 = new X.FtW
            r4.<init>(r8, r9, r3)
            goto L1e
        L30:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L35:
            X.Hwg.A00(r1)
            X.Dey r7 = r8.A01     // Catch: android.os.RemoteException -> Ld1
            java.util.List<java.lang.String> r0 = X.AbstractC9051FxZ.A00     // Catch: android.os.RemoteException -> Ld1
            java.util.ArrayList r9 = X.AnonymousClass002.A0m(r0)     // Catch: android.os.RemoteException -> Ld1
            java.util.Iterator r8 = r0.iterator()     // Catch: android.os.RemoteException -> Ld1
        L44:
            boolean r0 = r8.hasNext()     // Catch: android.os.RemoteException -> Ld1
            if (r0 == 0) goto L6e
            java.lang.String r3 = X.AnonymousClass005.A0j(r8)     // Catch: android.os.RemoteException -> Ld1
            X.Fzn r0 = X.C9180Fzn.DEFAULT_INSTANCE     // Catch: android.os.RemoteException -> Ld1
            X.GF3 r2 = r0.A05()     // Catch: android.os.RemoteException -> Ld1
            r2.A01()     // Catch: android.os.RemoteException -> Ld1
            MessageType extends X.GF2<MessageType, BuilderType> r1 = r2.A00     // Catch: android.os.RemoteException -> Ld1
            X.Fzn r1 = (X.C9180Fzn) r1     // Catch: android.os.RemoteException -> Ld1
            r3.getClass()     // Catch: android.os.RemoteException -> Ld1
            int r0 = r1.bitField0_     // Catch: android.os.RemoteException -> Ld1
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch: android.os.RemoteException -> Ld1
            r1.permission_ = r3     // Catch: android.os.RemoteException -> Ld1
            X.GF2 r0 = r2.A00()     // Catch: android.os.RemoteException -> Ld1
            r9.add(r0)     // Catch: android.os.RemoteException -> Ld1
            goto L44
        L6e:
            java.util.Set r3 = X.AbstractC0878AGe.A0g(r9)     // Catch: android.os.RemoteException -> Ld1
            X.Dem r7 = (X.C5272Dem) r7     // Catch: android.os.RemoteException -> Ld1
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)     // Catch: android.os.RemoteException -> Ld1
            r0 = 5
            int r2 = java.lang.Math.min(r6, r0)     // Catch: android.os.RemoteException -> Ld1
            r1 = 3
            X.F5J r0 = new X.F5J     // Catch: android.os.RemoteException -> Ld1
            r0.<init>(r1, r7, r3)     // Catch: android.os.RemoteException -> Ld1
            com.google.common.util.concurrent.SettableFuture r0 = r7.A01(r0, r2)     // Catch: android.os.RemoteException -> Ld1
            r4.A00 = r6     // Catch: android.os.RemoteException -> Ld1
            java.lang.Object r1 = X.Br8.A00(r0, r4)     // Catch: android.os.RemoteException -> Ld1
            if (r1 != r5) goto L93
            return r5
        L90:
            X.Hwg.A00(r1)     // Catch: android.os.RemoteException -> Ld1
        L93:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: android.os.RemoteException -> Ld1
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r1)     // Catch: android.os.RemoteException -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: android.os.RemoteException -> Ld1
        L9d:
            boolean r0 = r1.hasNext()     // Catch: android.os.RemoteException -> Ld1
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r1.next()     // Catch: android.os.RemoteException -> Ld1
            X.Fzn r0 = (X.C9180Fzn) r0     // Catch: android.os.RemoteException -> Ld1
            java.lang.String r0 = r0.permission_     // Catch: android.os.RemoteException -> Ld1
            r2.add(r0)     // Catch: android.os.RemoteException -> Ld1
            goto L9d
        Laf:
            java.util.Set r5 = X.AbstractC0878AGe.A0g(r2)     // Catch: android.os.RemoteException -> Ld1
            java.lang.String r4 = "Granted "
            int r3 = r5.size()
            java.lang.String r2 = " out of "
            java.util.List<java.lang.String> r0 = X.AbstractC9051FxZ.A00
            int r1 = r0.size()
            r0 = 32
            java.lang.String r0 = X.C60N.A00(r0)
            java.lang.String r1 = X.FGI.A0Y(r4, r2, r0, r3, r1)
            java.lang.String r0 = "HealthConnectClient"
            X.AbstractC7529Ezo.A00(r0, r1)
            return r5
        Ld1:
            r0 = move-exception
            android.os.RemoteException r1 = A03(r0)
            r1.initCause(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientImpl.AG0(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // X.InterfaceC9037FxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends X.InterfaceC9011Fwo> java.lang.Object AZS(X.C9042FxO<T> r9, X.HtJ<? super X.C9041FxN<T>> r10) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.connect.client.impl.HealthConnectClientImpl.AZS(X.FxO, X.HtJ):java.lang.Object");
    }

    public HealthConnectClientImpl(Context context) {
        if (HealthConnectPermissionUtils.PROVIDER_PACKAGE.length() == 0) {
            throw C60O.A0i("Service package name must not be empty.");
        }
        C5272Dem c5272Dem = new C5272Dem(context);
        C10456Hiz c10456Hiz = new C10456Hiz(context);
        this.A01 = c5272Dem;
        this.A00 = c10456Hiz;
    }

    public static final double A00(InterfaceC9132Fyx interfaceC9132Fyx, String str) {
        C9187Fzu c9187FzuA09 = A09(str, interfaceC9132Fyx.AMW());
        if (c9187FzuA09 != null) {
            return c9187FzuA09.A08();
        }
        return 0.0d;
    }

    public static long A02(C9187Fzu c9187Fzu) {
        if (c9187Fzu.valueCase_ == 1) {
            return ((Number) c9187Fzu.value_).longValue();
        }
        return 0L;
    }

    public static RemoteException A03(Throwable th) {
        if (th instanceof DeadObjectException) {
            return new DeadObjectException(th.getMessage());
        }
        boolean z = th instanceof TransactionTooLargeException;
        String message = th.getMessage();
        return z ? new TransactionTooLargeException(message) : new RemoteException(message);
    }

    public static final C9086FyD A06(C9168Fzb c9168Fzb) {
        String str = (c9168Fzb.bitField0_ & 2) != 0 ? c9168Fzb.uid_ : "";
        C7384Etj.A0X(str);
        C9183Fzq c9183Fzq = c9168Fzb.dataOrigin_;
        if (c9183Fzq == null) {
            c9183Fzq = C9183Fzq.DEFAULT_INSTANCE;
        }
        String str2 = c9183Fzq.applicationId_;
        C7384Etj.A0U(str2);
        C9012Fwp c9012Fwp = new C9012Fwp(str2);
        Instant instantA11 = AbstractC7608F5v.A11(c9168Fzb.updateTimeMillis_);
        int i = c9168Fzb.bitField0_;
        C10457Hje c10457Hje = null;
        String str3 = AnonymousClass002.A1L(i & 512) ? c9168Fzb.clientId_ : null;
        long j = c9168Fzb.clientVersion_;
        if ((i & 2048) != 0) {
            C9181Fzo c9181Fzo = c9168Fzb.device_;
            if (c9181Fzo == null) {
                c9181Fzo = C9181Fzo.DEFAULT_INSTANCE;
            }
            C7384Etj.A0U(c9181Fzo);
            int i2 = c9181Fzo.bitField0_;
            String str4 = AnonymousClass002.A1L(i2 & 2) ? c9181Fzo.manufacturer_ : null;
            String str5 = (i2 & 4) != 0 ? c9181Fzo.model_ : null;
            Map<String, Integer> map = Hma.A00;
            String str6 = c9181Fzo.type_;
            C7384Etj.A0U(str6);
            c10457Hje = new C10457Hje(AnonymousClass001.A0F(map.getOrDefault(str6, 0)), str4, str5);
        }
        return new C9086FyD(c9012Fwp, c10457Hje, str, str3, instantA11, c9168Fzb.recordingMethod_, j);
    }

    public static final C9174Fzh A0B(C9025Fx3 c9025Fx3) {
        GF3 gf3A05 = C9174Fzh.DEFAULT_INSTANCE.A05();
        Instant instant = c9025Fx3.A01;
        if (instant != null) {
            long epochMilli = instant.toEpochMilli();
            gf3A05.A01();
            C9174Fzh c9174Fzh = (C9174Fzh) gf3A05.A00;
            c9174Fzh.bitField0_ |= 1;
            c9174Fzh.startTimeEpochMs_ = epochMilli;
        }
        Instant instant2 = c9025Fx3.A00;
        if (instant2 != null) {
            long epochMilli2 = instant2.toEpochMilli();
            gf3A05.A01();
            C9174Fzh c9174Fzh2 = (C9174Fzh) gf3A05.A00;
            c9174Fzh2.bitField0_ |= 2;
            c9174Fzh2.endTimeEpochMs_ = epochMilli2;
        }
        LocalDateTime localDateTime = c9025Fx3.A03;
        if (localDateTime != null) {
            String string = localDateTime.toString();
            gf3A05.A01();
            C9174Fzh c9174Fzh3 = (C9174Fzh) gf3A05.A00;
            string.getClass();
            c9174Fzh3.bitField0_ |= 4;
            c9174Fzh3.startLocalDateTime_ = string;
        }
        LocalDateTime localDateTime2 = c9025Fx3.A02;
        if (localDateTime2 != null) {
            String string2 = localDateTime2.toString();
            gf3A05.A01();
            C9174Fzh c9174Fzh4 = (C9174Fzh) gf3A05.A00;
            string2.getClass();
            c9174Fzh4.bitField0_ |= 8;
            c9174Fzh4.endLocalDateTime_ = string2;
        }
        return (C9174Fzh) gf3A05.A00();
    }

    public static Instant A0E(C9168Fzb c9168Fzb) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c9168Fzb.startTimeMillis_);
        C7384Etj.A0U(instantOfEpochMilli);
        return instantOfEpochMilli;
    }

    public static Instant A0F(C9168Fzb c9168Fzb) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c9168Fzb.instantTimeMillis_);
        C7384Etj.A0U(instantOfEpochMilli);
        return instantOfEpochMilli;
    }

    public static Instant A0G(C9168Fzb c9168Fzb) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(c9168Fzb.endTimeMillis_);
        C7384Etj.A0U(instantOfEpochMilli);
        return instantOfEpochMilli;
    }

    public static final ZoneOffset A0H(C9168Fzb c9168Fzb) {
        if ((c9168Fzb.bitField0_ & 131072) != 0) {
            return ZoneOffset.ofTotalSeconds(c9168Fzb.endZoneOffsetSeconds_);
        }
        return null;
    }

    public static final ZoneOffset A0I(C9168Fzb c9168Fzb) {
        if ((c9168Fzb.bitField0_ & 65536) != 0) {
            return ZoneOffset.ofTotalSeconds(c9168Fzb.startZoneOffsetSeconds_);
        }
        return null;
    }

    public static final ZoneOffset A0J(C9168Fzb c9168Fzb) {
        if ((c9168Fzb.bitField0_ & 16) != 0) {
            return ZoneOffset.ofTotalSeconds(c9168Fzb.zoneOffsetSeconds_);
        }
        return null;
    }

    @Override // X.InterfaceC9037FxJ
    public final HsY AFa() {
        return this.A00;
    }

    public static C9187Fzu A09(Object obj, Map map) {
        return (C9187Fzu) map.get(obj);
    }

    public static final String A0D(InterfaceC9132Fyx interfaceC9132Fyx, String str) {
        C9187Fzu c9187FzuA09 = A09(str, interfaceC9132Fyx.AMW());
        if (c9187FzuA09 != null) {
            return c9187FzuA09.valueCase_ == 3 ? (String) c9187FzuA09.value_ : "";
        }
        return null;
    }

    public static void A0K(AbstractCollection abstractCollection, Iterator it) {
        C9012Fwp c9012Fwp = (C9012Fwp) it.next();
        C9107FyY c9107FyY = (C9107FyY) C9183Fzq.DEFAULT_INSTANCE.A05();
        String str = c9012Fwp.A00;
        c9107FyY.A01();
        C9183Fzq c9183Fzq = (C9183Fzq) c9107FyY.A00;
        c9183Fzq.bitField0_ |= 1;
        c9183Fzq.applicationId_ = str;
        abstractCollection.add(c9107FyY.A00());
    }
}
