package com.facebook.aura.maps;

import X.AFz;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BNO;
import X.BRg;
import X.BSF;
import X.C07389Vo;
import X.C07399Vr;
import X.C07459Wa;
import X.C07C;
import X.C0881AGi;
import X.C1he;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8j3;
import X.C8sP;
import X.C9VR;
import X.C9VS;
import X.C9VT;
import X.C9VZ;
import X.C9Va;
import X.C9Vc;
import X.C9Vd;
import X.C9Vm;
import X.C9WF;
import X.G0V;
import X.G0W;
import X.G2k;
import X.HZx;
import X.HkU;
import X.HxE;
import com.facebook.aura.maps.theme.HatchPlaceDetailsStyleKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchPlaceDetailsSheetKt {

    /* renamed from: com.facebook.aura.maps.HatchPlaceDetailsSheetKt$HatchPlaceDetails$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $artifactId;
        public final /* synthetic */ G2k<C9VS, C9VZ, String, BFM, Integer, Unit> $content;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, Function0<Unit> function0, G2k<? super C9VS, ? super C9VZ, ? super String, ? super BFM, ? super Integer, Unit> g2k, int i) {
            super(2);
            this.$presentationId = str;
            this.$artifactId = str2;
            this.$onDismiss = function0;
            this.$content = g2k;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceDetailsSheetKt.HatchPlaceDetails(this.$presentationId, this.$artifactId, this.$onDismiss, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceDetailsSheetKt$HatchPlaceDetails$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $artifactId;
        public final /* synthetic */ G2k<C9VS, C9VZ, String, BFM, Integer, Unit> $content;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, Function0<Unit> function0, G2k<? super C9VS, ? super C9VZ, ? super String, ? super BFM, ? super Integer, Unit> g2k, int i) {
            super(2);
            this.$presentationId = str;
            this.$artifactId = str2;
            this.$onDismiss = function0;
            this.$content = g2k;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceDetailsSheetKt.HatchPlaceDetails(this.$presentationId, this.$artifactId, this.$onDismiss, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceDetailsSheetKt$HatchPlaceDetails$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $analyticsId;
        public final /* synthetic */ HatchPlaceDetailsCallbacks $callbacks;
        public final /* synthetic */ G2k<C9VS, C9VZ, String, BFM, Integer, Unit> $content;
        public final /* synthetic */ C9VS $data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G2k<? super C9VS, ? super C9VZ, ? super String, ? super BFM, ? super Integer, Unit> g2k, C9VS c9vs, HatchPlaceDetailsCallbacks hatchPlaceDetailsCallbacks, String str) {
            super(2);
            this.$content = g2k;
            this.$data = c9vs;
            this.$callbacks = hatchPlaceDetailsCallbacks;
            this.$analyticsId = str;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                this.$content.invoke(this.$data, this.$callbacks, this.$analyticsId, bfm, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceDetailsSheetKt$HatchPlaceDetails$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $artifactId;
        public final /* synthetic */ G2k<C9VS, C9VZ, String, BFM, Integer, Unit> $content;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, String str2, Function0<Unit> function0, G2k<? super C9VS, ? super C9VZ, ? super String, ? super BFM, ? super Integer, Unit> g2k, int i) {
            super(2);
            this.$presentationId = str;
            this.$artifactId = str2;
            this.$onDismiss = function0;
            this.$content = g2k;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceDetailsSheetKt.HatchPlaceDetails(this.$presentationId, this.$artifactId, this.$onDismiss, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceDetailsSheetKt$HatchPlaceDetailsSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C126781 extends AbstractC7559F3s implements G2k<C9VS, C9VZ, String, BFM, Integer, Unit> {
        public final /* synthetic */ long $impressionKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* renamed from: com.facebook.aura.maps.HatchPlaceDetailsSheetKt$HatchPlaceDetailsSheet$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ C9VZ $callbacks;
            public final /* synthetic */ C9VS $data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C9VS c9vs, C9VZ c9vz) {
                super(3);
                this.$data = c9vs;
                this.$callbacks = c9vz;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                    bfm.Afo();
                } else {
                    C9VR.A00(bfm, null, this.$callbacks, this.$data, HatchPlaceDetailsStyleKt.hatchPlaceDetailsStyle(bfm, 0), 0, 2);
                }
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        public final void invoke(C9VS c9vs, C9VZ c9vz, String str, BFM bfm, int i) {
            AnonymousClass005.A10(c9vs, c9vz, str);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c9vs) | i : i;
            if ((i & 48) == 0) {
                iA0d |= AnonymousClass004.A0e(bfm, c9vz);
            }
            if ((i & 384) == 0) {
                iA0d |= AnonymousClass004.A0f(bfm, str);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            BRg bRg = this.$modifier;
            int i2 = iA0d & 896;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 256) | bfm.A64(this.$impressionKey);
            long j = this.$impressionKey;
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = HatchMapAnalytics.INSTANCE.placeDetailsImpression(str, j);
                bfm.Ai0(objAaT);
            }
            BRg bRgThen = bRg.then((BRg) objAaT);
            boolean zA1V = C8j3.A1V(bfm, this.$onDismiss, i2 == 256);
            Function0<Unit> function0 = this.$onDismiss;
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new HatchPlaceDetailsSheetKt$HatchPlaceDetailsSheet$1$2$1(str, function0);
                BBI.A0T(bfm, objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRgThen, null, null, null, null, (Function0) objAaT2, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(c9vs, c9vz), 1308892769), bfm, 0, 48, 1981);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126781(BRg bRg, long j, Function0<Unit> function0) {
            super(5);
            this.$modifier = bRg;
            this.$impressionKey = j;
            this.$onDismiss = function0;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(C9VS c9vs, C9VZ c9vz, String str, BFM bfm, Integer num) {
            invoke(c9vs, c9vz, str, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchPlaceDetailsSheetKt$HatchPlaceDetailsSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C126792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $artifactId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126792(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$presentationId = str;
            this.$artifactId = str2;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPlaceDetailsSheetKt.HatchPlaceDetailsSheet(this.$presentationId, this.$artifactId, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final String A01(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() == 0) {
            return null;
        }
        return strA0l;
    }

    public static final void HatchPlaceDetailsSheet(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A0x(str, str2, function0);
        bfm.AgG(973528166);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = {str2};
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchPlaceDetailsSheetKt$HatchPlaceDetailsSheet$impressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            HatchPlaceDetails(str, str2, function0, B1V.A00(bfm, new C126781(bRg2, C3cG.A05(AFz.A03(bfm, (Function0) objAaT, objArr)), function0), 4272254), bfm, AnonymousClass002.A07(iA0d, (iA0d & 14) | 3072));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126792(str, str2, function0, bRg2, i, i2);
        }
    }

    public static final C9Vm A00(String str) {
        String strA0u = str != null ? AnonymousClass001.A0u(str) : "";
        return (C7BY.A0q(strA0u, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM, false) || strA0u.equals("ig")) ? C9Vm.A03 : (C7BY.A0q(strA0u, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK, false) || strA0u.equals("fb")) ? C9Vm.A02 : C9Vm.A04;
    }

    public static final C9VS forHatch(C9VS c9vs) {
        C9VT c9vt = c9vs.A06;
        String str = c9vt.A08;
        Double d = c9vt.A00;
        String str2 = c9vt.A05;
        C9VT c9vt2 = new C9VT(d, null, null, c9vt.A02, c9vt.A01, str, str2, null, c9vt.A07);
        C9WF c9wf = new C9WF(C0881AGi.A00, -1);
        C9WF c9wf2 = c9vs.A07;
        C9Va c9Va = c9vs.A04;
        Map<String, Integer> map = HZx.A01;
        C7384Etj.A0Y(c9Va, 0);
        List<C9Vc> list = c9Va.A00;
        ArrayList<C9Vc> arrayListA0h = C3cG.A0h();
        for (C9Vc c9Vc : list) {
            if (c9Vc.A02) {
                arrayListA0h.add(c9Vc);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (C9Vc c9Vc2 : arrayListA0h) {
            HkU hkU = HZx.A00.get(c9Vc2.A01);
            if (hkU != null) {
                AnonymousClass002.A1J(hkU, c9Vc2, arrayListA0h2);
            }
        }
        List listA0c = AbstractC0878AGe.A0c(arrayListA0h2, new BSF(10));
        ArrayList arrayListA0m = AnonymousClass002.A0m(listA0c);
        Iterator it = listA0c.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(((HxE) it.next()).second);
        }
        C9Va c9Va2 = new C9Va(arrayListA0m);
        C07399Vr c07399Vr = c9vs.A00;
        C1he c1he = c9vs.A0B;
        C9Vd c9Vd = c9vs.A05;
        C07389Vo c07389Vo = c9vs.A0A;
        C07459Wa c07459Wa = c9vs.A01;
        BNO bno = c9vs.A09;
        C9Va c9Va3 = c9vs.A03;
        C8sP c8sP = c9vs.A02;
        C7384Etj.A0Y(c07399Vr, 1);
        AnonymousClass005.A16(c1he, c9Vd, c07389Vo, c07459Wa, 2);
        AnonymousClass002.A1F(c9wf2, 7, bno);
        AnonymousClass002.A1G(c9Va3, 10, c8sP);
        return new C9VS(c07399Vr, c07459Wa, c8sP, c9Va2, c9Va3, c9Vd, c9vt2, c9wf, c9wf2, bno, c07389Vo, c1he);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d4 A[PHI: r8
  0x01d4: PHI (r8v82 java.lang.String) = (r8v6 java.lang.String), (r8v83 java.lang.String) binds: [B:109:0x01d2, B:103:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0269 A[PHI: r37
  0x0269: PHI (r37v11 java.lang.String) = (r37v8 java.lang.String), (r37v12 java.lang.String) binds: [B:156:0x0267, B:154:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ea A[PHI: r8
  0x03ea: PHI (r8v34 java.lang.String) = (r8v33 java.lang.String), (r8v53 java.lang.String) binds: [B:267:0x03e0, B:269:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r49v0, types: [X.BFM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchPlaceDetails(java.lang.String r45, java.lang.String r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, X.G2k<? super X.C9VS, ? super X.C9VZ, ? super java.lang.String, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r48, X.BFM r49, int r50) {
        /*
            Method dump skipped, instructions count: 1773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchPlaceDetailsSheetKt.HatchPlaceDetails(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.G2k, X.BFM, int):void");
    }
}
