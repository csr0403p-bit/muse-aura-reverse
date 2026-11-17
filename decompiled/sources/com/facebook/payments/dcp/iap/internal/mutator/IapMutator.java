package com.facebook.payments.dcp.iap.internal.mutator;

import X.A7N;
import X.A7O;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.BGK;
import X.C0881AGi;
import X.C10490Hlu;
import X.C10511HoF;
import X.C60O;
import X.C7384Etj;
import X.C7Bm;
import X.C8S;
import X.C8j5;
import X.CPX;
import X.DYI;
import X.DcQ;
import X.E8e;
import X.EDJ;
import X.EP6;
import X.EQe;
import X.EnumC6672EOk;
import X.F1G;
import X.FYY;
import X.GBL;
import X.GPR;
import X.HmS;
import X.HoJ;
import X.HoX;
import X.Hon;
import X.Hr9;
import X.HsR;
import X.HtJ;
import X.HxP;
import X.HzE;
import X.HzF;
import X.InterfaceC5107DYf;
import X.InterfaceC5234Dds;
import X.InterfaceC9729Gei;
import android.os.Handler;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.aura.iap.HatchIapConfig;
import com.facebook.aura.iap.HatchIapUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.EnumHelper;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class IapMutator {
    public final Handler A00;
    public final InterfaceC5107DYf A01;
    public final Hon A02;
    public final InterfaceC5234Dds A03;
    public final HsR A04;
    public final InterfaceC9729Gei A05;
    public final String A06;
    public static final Set<String> A08 = C60O.A1A("actor_id", "client_mutation_id", "platform");
    public static final Set<String> A07 = BFI.A0H(new String[]{"platform", "product_ids", "product_type", ErrorReportingConstants.APP_NAME_KEY, "developer_payload", "purchase_country"});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.Integer r22, java.lang.Integer r23, java.lang.String r24, java.lang.String r25, java.util.List r26, X.HtJ r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.iap.internal.mutator.IapMutator.A05(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, X.HtJ):java.lang.Object");
    }

    public static final Object A00(DYI dyi, IapMutator iapMutator, HtJ htJ, Function0 function0) {
        String str = GBL.__redex_internal_original_name;
        GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        try {
            E8e e8e = new E8e(2, function0, gbl);
            EP6 ep6 = new EP6(1, gbl, function0);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            AtomicBoolean atomicBoolean2 = new AtomicBoolean();
            AtomicBoolean atomicBoolean3 = new AtomicBoolean();
            AtomicReference atomicReference = new AtomicReference();
            EDJ edj = new EDJ(new E8e(0, e8e, atomicBoolean), atomicReference, atomicBoolean3, iapMutator, dyi, 3);
            C8S c8s = new C8S(iapMutator, atomicBoolean, atomicBoolean3, edj, ep6);
            gbl.AO2(new EQe(new DcQ(iapMutator, c8s, atomicBoolean3, atomicReference), 10));
            edj.invoke(new FYY(c8s, ep6, iapMutator, atomicBoolean, atomicBoolean2, 0));
            return gbl.A0F();
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.F1G r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.iap.internal.mutator.IapMutator.A01(X.F1G, boolean):java.lang.Object");
    }

    public static final String A02(IapMutator iapMutator) {
        String str = ((HatchIapConfig) iapMutator.A05).uplAppName;
        EnumC6672EOk enumC6672EOk = EnumC6672EOk.A02;
        Enum enumA00 = EnumHelper.A00(str, enumC6672EOk);
        C7384Etj.A0U(enumA00);
        if (enumA00 != enumC6672EOk) {
            return enumA00.toString();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List A03(F1G f1g) {
        C10490Hlu c10490Hlu;
        C10511HoF c10511HoF;
        String strAIJ;
        String strAIJ2;
        String strAIJ3;
        A7O a7o = null;
        A7O a7o2 = null;
        A7N a7n = (A7N) ((CPX) f1g).A01;
        if (a7n == null) {
            return C0881AGi.A00;
        }
        ImmutableList<? extends A7O> immutableListAJc = a7n.innerData.AJc(966576963);
        ArrayList arrayListA0m = AnonymousClass002.A0m(immutableListAJc);
        Iterator<? extends A7O> it = immutableListAJc.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(new HzE(C8j5.A0S(it)));
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListA0m);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(immutableListCopyOf);
        Iterator<E> it2 = immutableListCopyOf.iterator();
        while (it2.hasNext()) {
            A7N a7n2 = (A7N) it2.next();
            C7384Etj.A0Y(a7n2, 0);
            String strAIJ4 = a7n2.innerData.AIJ(1753008747);
            String str = "";
            if (strAIJ4 == null) {
                strAIJ4 = "";
            }
            String strAIJ5 = a7n2.innerData.AIJ(756285279);
            if (strAIJ5 == null) {
                strAIJ5 = "";
            }
            A7O a7oAIK = a7n2.innerData.AIK(-1019793001);
            boolean z = false;
            if (a7oAIK != null) {
                z = true;
                a7o2 = a7oAIK;
            }
            HoX hoX = null;
            if (z) {
                ImmutableList<? extends A7O> immutableListAJc2 = a7o2.AJc(-257111303);
                ArrayList arrayListA0m3 = AnonymousClass002.A0m(immutableListAJc2);
                Iterator<? extends A7O> it3 = immutableListAJc2.iterator();
                while (it3.hasNext()) {
                    A7O next = it3.next();
                    C7384Etj.A0Y(next, 0);
                    arrayListA0m3.add(new HzF(next));
                }
                ImmutableList immutableListCopyOf2 = ImmutableList.copyOf((Collection) arrayListA0m3);
                ArrayList arrayListA0m4 = AnonymousClass002.A0m(immutableListCopyOf2);
                Iterator<E> it4 = immutableListCopyOf2.iterator();
                while (it4.hasNext()) {
                    A7N a7n3 = (A7N) it4.next();
                    String strAIJ6 = a7n3.innerData.AIJ(-768546338);
                    if (strAIJ6 == null) {
                        strAIJ6 = "";
                    }
                    String strAIJ7 = a7n3.innerData.AIJ(960023506);
                    if (strAIJ7 == null) {
                        strAIJ7 = "";
                    }
                    arrayListA0m4.add(new HmS(strAIJ6, strAIJ7));
                }
                c10490Hlu = new C10490Hlu(arrayListA0m4);
            } else {
                c10490Hlu = null;
            }
            String strAIJ8 = a7n2.innerData.AIJ(366905478);
            if (strAIJ8 == null) {
                strAIJ8 = "";
            }
            String strAIJ9 = a7n2.innerData.AIJ(1282546590);
            A7O a7oAIK2 = a7n2.innerData.AIK(2020430508);
            if (a7oAIK2 != null) {
                A7O a7oAa6 = a7oAIK2.Aa6(-468248031);
                C7384Etj.A0Y(a7oAa6, 0);
                Hr9 hr9 = Hr9.A04;
                Hr9 hr92 = (Hr9) a7oAa6.AIH(hr9, -1497087374);
                if (hr92 == null) {
                    hr92 = hr9;
                }
                HxP hxP = (HxP) a7oAa6.AIH(HxP.A02, 537844207);
                A7O a7oAIK3 = a7oAa6.AIK(1480970781);
                boolean z2 = false;
                if (a7oAIK3 != null) {
                    z2 = true;
                    a7o = a7oAIK3;
                }
                HoJ hoJ = null;
                if (z2 && (strAIJ = a7o.AIJ(110541305)) != null && strAIJ.length() != 0) {
                    String strAIJ10 = a7o.AIJ(110541305);
                    if (strAIJ10 == null) {
                        strAIJ10 = "";
                    }
                    String strAIJ11 = a7o.AIJ(1753008747);
                    if (strAIJ11 == null) {
                        strAIJ11 = "";
                    }
                    String strAIJ12 = a7o.AIJ(130414211);
                    if (strAIJ12 == null) {
                        strAIJ12 = "";
                    }
                    String strAIJ13 = a7o.AIJ(-768546338);
                    A7O a7oAIK4 = a7o.AIK(106934601);
                    if (a7oAIK4 == null || (strAIJ2 = a7oAIK4.AIJ(-1413853096)) == null) {
                        strAIJ2 = "";
                    }
                    A7O a7oAIK5 = a7o.AIK(106934601);
                    if (a7oAIK5 != null && (strAIJ3 = a7oAIK5.AIJ(575402001)) != null) {
                        str = strAIJ3;
                    }
                    hoJ = new HoJ(strAIJ10, strAIJ11, strAIJ12, strAIJ13, strAIJ2, str, a7o.ADm(-833811170));
                }
                c10511HoF = new C10511HoF(hxP, hr92, hoJ, a7oAa6.AIJ(-176388946));
            } else {
                Hr9 hr93 = (Hr9) a7n2.innerData.AIH(Hr9.A04, -1497087374);
                if (hr93 == null) {
                    hr93 = Hr9.A03;
                }
                c10511HoF = new C10511HoF((HxP) a7n2.innerData.AIH(HxP.A02, 537844207), hr93, null, null);
            }
            A7O a7oAIK6 = a7n2.innerData.AIK(-480056719);
            HoX hoX2 = a7oAIK6 != null ? new HoX(a7oAIK6.AIJ(-1413853096), a7oAIK6.AIJ(-565489467), a7oAIK6.AIJ(575402001), a7oAIK6.AIJ(1814466875)) : null;
            A7O a7oAIK7 = a7n2.innerData.AIK(754431350);
            if (a7oAIK7 != null) {
                hoX = new HoX(a7oAIK7.AIJ(-1413853096), a7oAIK7.AIJ(-565489467), a7oAIK7.AIJ(575402001), a7oAIK7.AIJ(1814466875));
            }
            arrayListA0m2.add(new GPR(c10511HoF, c10490Hlu, hoX2, hoX, strAIJ4, strAIJ5, strAIJ8, strAIJ9));
        }
        return arrayListA0m2;
    }

    public IapMutator(Hon hon, HsR hsR) {
        this.A02 = hon;
        this.A04 = hsR;
        String actorID = hon.getActorID();
        this.A06 = actorID == null ? "" : actorID;
        this.A01 = AuraGraphQLService.INSTANCE.iapInstance();
        this.A05 = new HatchIapConfig();
        this.A03 = ((HatchIapUserSession) hon).transientErrorClassifier;
        this.A00 = C60O.A02();
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Lcom/facebook/graphql/calls/GraphQlCallInput;>(TT;Ljava/util/Set<Ljava/lang/String;>;)TT; */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.TreeMap] */
    public static final void A04(GraphQlCallInput graphQlCallInput, Set set) {
        Iterator it = BGK.A03(set, graphQlCallInput.A05().keySet()).iterator();
        while (it.hasNext()) {
            graphQlCallInput.A06(AnonymousClass005.A0j(it));
        }
    }
}
