package X;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BBH extends BBV {
    public static final BLG<AKC<ApI>> A0R = HnJ.A01(C0972AJz.A03);
    public static final AtomicReference<Boolean> A0S = new AtomicReference<>(AnonymousClass001.A0h());
    public long A00;
    public C0917AHt<BCN> A01;
    public C0917AHt<Object> A02;
    public Throwable A03;
    public List<? extends BCN> A04;
    public Hm1<? super Unit> A05;
    public HoC A06;
    public boolean A07;
    public boolean A08;
    public List<BCN> A09;
    public BLG<C2241BCm> A0A;
    public final C0918AHu<Object, Object> A0B;
    public final C0918AHu<Object, Object> A0C;
    public final C0918AHu<C2229BBz, C2239BCk> A0D;
    public final BOm A0E;
    public final BCY A0F;
    public final BCP A0G;
    public final ApI A0H;
    public final C0910AHm<BCN> A0I;
    public final C2254BDx<C0917AHt<BBb>> A0J;
    public final Object A0K;
    public final List<BCN> A0L;
    public final List<BCN> A0M;
    public final List<C2229BBz> A0N;
    public final C78T A0O;
    public final C27a A0P;
    public final BLG<BFw> A0Q;

    @Override // X.BBV
    public final void A0U(BCN bcn, G0V<? super BFM, ? super Integer, Unit> g0v) throws Throwable {
        BLG<BFw> blg;
        BFw bFw;
        boolean z;
        BBG bbg = (BBG) bcn;
        BBI bbi = bbg.A0F;
        boolean z2 = bbi.A0N;
        Object obj = this.A0K;
        synchronized (obj) {
            blg = this.A0Q;
            BFw value = blg.getValue();
            bFw = BFw.A07;
            z = value.compareTo(bFw) > 0 ? !A02(this).contains(bcn) : true;
        }
        try {
            BDi bDiA00 = Snapshot.A00(C2297BSx.A00(bcn, 24), new BT9(15, (Object) null, bcn));
            try {
                Snapshot snapshotA0A = bDiA00.A0A();
                try {
                    synchronized (bbg.A0I) {
                        BBG.A04(bbg);
                        C0918AHu<Object, Object> c0918AHu = bbg.A02;
                        bbg.A02 = C0918AHu.A02();
                        try {
                            InterfaceC2246BCr interfaceC2246BCr = bbg.A05;
                            if (((C2232BCc) bbi.A09).A00.A02 != 0) {
                                BBL.A01("Expected applyChanges() to have been called");
                                throw F60.createAndThrow();
                            }
                            bbi.A0E = interfaceC2246BCr;
                            try {
                                BBI.A0F(c0918AHu, bbi, g0v);
                                bbi.A0E = null;
                            } catch (Throwable th) {
                                bbi.A0E = null;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            bbg.A02 = c0918AHu;
                            throw th2;
                        }
                    }
                    synchronized (obj) {
                        if (blg.getValue().compareTo(bFw) > 0 && !A02(this).contains(bcn)) {
                            this.A0L.add(bcn);
                            this.A04 = null;
                        }
                    }
                    if (!z2) {
                        BDh.A00().A0J();
                    }
                    try {
                        A04(bcn, this);
                        try {
                            bcn.A4T();
                            bcn.A4W();
                            if (z2) {
                                return;
                            }
                            BDh.A00().A0J();
                        } catch (Throwable th3) {
                            A06(null, this, th3);
                        }
                    } catch (Throwable th4) {
                        A06(bcn, this, th4);
                    }
                } catch (Throwable th5) {
                    try {
                        Set<InterfaceC1559AlZ> set = bbg.A0J;
                        if (set.isEmpty()) {
                            throw th5;
                        }
                        AlX alX = bbg.A0H;
                        try {
                            alX.A05(bbi.A0W(), set);
                            alX.A02();
                            alX.A01();
                            throw th5;
                        } catch (Throwable th6) {
                            alX.A01();
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        try {
                            bbg.A2q();
                            throw th7;
                        } finally {
                            Snapshot.A06(snapshotA0A);
                        }
                    }
                }
            } finally {
                A09(bDiA00);
            }
        } catch (Throwable th8) {
            if (z) {
                synchronized (obj) {
                }
            }
            A06(bcn, this, th8);
        }
    }

    public final Object A0a(HtJ<? super Unit> htJ) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this, null);
        C78X c78x = htJ.getContext().get(BQr.A00);
        if (c78x == null) {
            throw C3cG.A0Q("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        }
        Object objA00 = GAo.A00(htJ, this.A0E, new BUI(c78x, this, recomposer$runRecomposeAndApplyChanges$2, null, 6));
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA00 != enumC10460Hji) {
            objA00 = Unit.INSTANCE;
        }
        return objA00 != enumC10460Hji ? Unit.INSTANCE : objA00;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BCN A00(X.C0917AHt r18, X.BCN r19, X.BBH r20) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBH.A00(X.AHt, X.BCN, X.BBH):X.BCN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0266, code lost:
    
        X.BBI.A0J(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0269, code lost:
    
        r2 = r3.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026d, code lost:
    
        r2.A0D(r5);
        r10.A05 = r5;
        r3 = new X.C2232BCc();
        X.BBI.A0G(null, null, r12, null, X.C0881AGi.A00, new X.BTW(r13, r3, r12, r2, 1));
        r1 = r10.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0299, code lost:
    
        if (r3.A00.A02 == 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x029b, code lost:
    
        r1 = r1.A00;
        r1.A02(X.C2217BBn.A00);
        X.BCJ.A01(r1, r3, r7, 0, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a7, code lost:
    
        r1 = r12.A0W;
        r5 = r1.A0H(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02af, code lost:
    
        if (r5 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02b1, code lost:
    
        r2 = X.BCA.A01(r5.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b9, code lost:
    
        if (r2.A07 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02bb, code lost:
    
        X.BBL.A01("use active SlotWriter to create an anchor location instead");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02c2, code lost:
    
        r1 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c4, code lost:
    
        if (0 >= r1) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c6, code lost:
    
        r15 = r2.A05;
        r14 = X.BCA.A00(r15, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02cc, code lost:
    
        if (r14 >= 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02ce, code lost:
    
        r1 = new X.BCR();
        r1.A00 = 0;
        r15.add(-(r14 + 1), r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02dc, code lost:
    
        r1 = r15.get(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e2, code lost:
    
        if (r1 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e4, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02e5, code lost:
    
        r2 = X.BCA.A01(r0.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02eb, code lost:
    
        r1 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ed, code lost:
    
        r16 = X.BCV.A00(r1);
        r15 = new java.util.ArrayList();
        r14 = r2.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02fa, code lost:
    
        X.BBY.A02(r14, r15, r2.A00(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0303, code lost:
    
        r14.A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030a, code lost:
    
        if (r15.isEmpty() != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x030c, code lost:
    
        r14 = r10.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0312, code lost:
    
        if (r15.isEmpty() != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0314, code lost:
    
        r14 = r14.A00;
        r14.A02(X.C2218BBo.A00);
        X.BCJ.A01(r14, r15, r7, 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x031e, code lost:
    
        r14 = r12.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0324, code lost:
    
        if (r3.equals(r14) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0326, code lost:
    
        r4 = r14.A00(r4);
        X.BBI.A0L(r12, r4, X.BBI.A00(r12, r4) + r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0336, code lost:
    
        r3 = r10.A06.A00;
        r3.A02(X.BBU.A00);
        r4 = r3.A01 - r3.A04[r3.A02 - 1].A01;
        r3 = r3.A05;
        r3[r4] = r5;
        r3[r4 + 1] = r1;
        r3[r4 + 3] = r13;
        r3[r4 + 2] = r0;
        r14 = r2.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0360, code lost:
    
        r1 = r12.A0F;
        r5 = r12.A0T;
        r4 = r12.A08;
        r12.A0T = null;
        r12.A08 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x036e, code lost:
    
        r12.A0F = r14;
        r1 = r2.A00(X.BCV.A00(r16));
        r14.A0D(r1);
        r10.A05 = r1;
        r3 = new X.C2232BCc();
        r2 = r10.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0384, code lost:
    
        r10.A06 = r3;
        r1 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0388, code lost:
    
        r10.A07 = false;
        X.BBI.A0G(r0.A02, r13.A02, r12, java.lang.Integer.valueOf(r14.A01), r0.A00, new X.BTB(25, r12, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03b0, code lost:
    
        r10.A07 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03b2, code lost:
    
        r10.A06 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03b8, code lost:
    
        if (r3.A00.A02 == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ba, code lost:
    
        r1 = r2.A00;
        r1.A02(X.C2217BBn.A00);
        X.BCJ.A01(r1, r3, r7, 0, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03cc, code lost:
    
        r14.A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03d0, code lost:
    
        r2.A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03d3, code lost:
    
        r10.A06.A00.A02(X.BCE.A00);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03e0, code lost:
    
        X.BBR.A00(r10);
        r10.A06.A00.A02(X.BC7.A00);
        r10.A05 = 0;
        r10.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03f1, code lost:
    
        r10.A06 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03f5, code lost:
    
        X.BBI.A0I(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0414, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0415, code lost:
    
        r10.A07 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0417, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0418, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0419, code lost:
    
        r10.A06 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x041b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x041c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x041d, code lost:
    
        r12.A0F = r1;
        r12.A0T = r5;
        r12.A08 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0425, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0426, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0427, code lost:
    
        r14.A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x042b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x042c, code lost:
    
        r14.A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0430, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0431, code lost:
    
        r2.A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0434, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0435, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0437, code lost:
    
        X.BBL.A02("Inconsistent composition");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0441, code lost:
    
        r10.A06 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0445, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0446, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0447, code lost:
    
        X.BBI.A0H(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x044a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x044b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x044c, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x044f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0450, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0451, code lost:
    
        r2 = r22.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0459, code lost:
    
        if (r2.isEmpty() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x045b, code lost:
    
        r1 = r22.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0463, code lost:
    
        r1.A05(r12.A0W(), r2);
        r1.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0469, code lost:
    
        r1.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x046d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x046e, code lost:
    
        r1.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0471, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0472, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0473, code lost:
    
        r22.A2q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x047a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x047c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:?, code lost:
    
        throw X.F60.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
    
        throw X.C60O.A0i("Parameter index is out of range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:?, code lost:
    
        throw X.F60.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:?, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:?, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:?, code lost:
    
        throw X.F60.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0173, code lost:
    
        r2 = r11.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0178, code lost:
    
        if (r1 >= r2) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
    
        if (((X.HxE) r11.get(r1)).second == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0187, code lost:
    
        r4 = new java.util.ArrayList(r11.size());
        r3 = r11.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0195, code lost:
    
        if (r2 >= r3) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0197, code lost:
    
        r1 = (X.HxE) r11.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019f, code lost:
    
        if (r1.second != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a1, code lost:
    
        r0 = (X.C2229BBz) r1.first;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a6, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a7, code lost:
    
        if (r0 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a9, code lost:
    
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ac, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01af, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b0, code lost:
    
        X.AbstractC0882AGj.A0r(r4, r34.A0N);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b5, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b6, code lost:
    
        r4 = new java.util.ArrayList(r11.size());
        r3 = r11.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c4, code lost:
    
        if (r2 >= r3) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c6, code lost:
    
        r1 = r11.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
    
        if (((X.HxE) r1).second == 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d1, code lost:
    
        r4.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d4, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d7, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d8, code lost:
    
        r3 = r11.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dd, code lost:
    
        if (r2 >= r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f1, code lost:
    
        if (X.C7384Etj.areEqual(((X.C2229BBz) ((X.HxE) r11.get(r2)).first).A02, r22) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f3, code lost:
    
        X.BBL.A01("Check failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fa, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fd, code lost:
    
        android.os.Trace.beginSection("Compose:insertMovableContent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0202, code lost:
    
        r10 = r12.A0b;
        r1 = r12.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0208, code lost:
    
        if ((r1 instanceof X.C2232BCc) == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020a, code lost:
    
        r1 = (X.C2232BCc) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020c, code lost:
    
        if (r1 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020e, code lost:
    
        r0 = r10.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0212, code lost:
    
        r10.A06 = r1;
        r1.A00.A02(X.C2222BBs.A00);
        r19 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0222, code lost:
    
        if (r9 >= r19) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0224, code lost:
    
        r0 = (X.HxE) r11.get(r9);
        r13 = (X.C2229BBz) r0.first;
        r0 = (X.C2229BBz) r0.second;
        r4 = X.BCV.A00(r13.A01);
        r3 = X.BCA.A01(r13.A05);
        r5 = r3.A00(r4);
        r7 = new X.B8p();
        r7.A00 = 0;
        X.BBR.A00(r10);
        r2 = r10.A06.A00;
        r2.A02(X.BBa.A00);
        X.BCJ.A01(r2, r7, r4, 0, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025c, code lost:
    
        if (r0 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0264, code lost:
    
        if (r3.equals(r12.A0G) == false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A01(X.C0917AHt r33, X.BBH r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBH.A01(X.AHt, X.BBH, java.util.List):java.util.List");
    }

    public static final List A02(BBH bbh) {
        List<? extends BCN> arrayList = bbh.A04;
        if (arrayList == null) {
            List<BCN> list = bbh.A0L;
            arrayList = list.isEmpty() ? C0881AGi.A00 : new ArrayList<>(list);
            bbh.A04 = arrayList;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.Hm1 A03(X.BBH r4) {
        /*
            X.BLG<X.BFw> r2 = r4.A0Q
            java.lang.Object r1 = r2.getValue()
            X.BFw r1 = (X.BFw) r1
            X.BFw r0 = X.BFw.A07
            int r0 = r1.compareTo(r0)
            r1 = 0
            if (r0 > 0) goto L53
            java.util.List r3 = A02(r4)
            int r2 = r3.size()
            r0 = 0
        L1a:
            if (r0 >= r2) goto L22
            r3.get(r0)
            int r0 = r0 + 1
            goto L1a
        L22:
            java.util.List<X.BCN> r0 = r4.A0L
            r0.clear()
            X.AGi r0 = X.C0881AGi.A00
            r4.A04 = r0
            r2 = 6
            X.AHt r0 = new X.AHt
            r0.<init>(r2)
            r4.A02 = r0
            X.AHm<X.BCN> r0 = r4.A0I
            r0.A09()
            java.util.List<X.BCN> r0 = r4.A0M
            r0.clear()
            java.util.List<X.BBz> r0 = r4.A0N
            r0.clear()
            r4.A09 = r1
            X.Hm1<? super kotlin.Unit> r0 = r4.A05
            if (r0 == 0) goto L4b
            r0.A5x(r1)
        L4b:
            r4.A05 = r1
            X.BLG<X.BCm> r0 = r4.A0A
            r0.Af8(r1)
            return r1
        L53:
            X.BLG<X.BCm> r0 = r4.A0A
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto Lbc
            X.HoC r0 = r4.A06
            if (r0 != 0) goto L88
            r3 = 6
            X.AHt r0 = new X.AHt
            r0.<init>(r3)
            r4.A02 = r0
            X.AHm<X.BCN> r0 = r4.A0I
            r0.A09()
            boolean r0 = A0B(r4)
            if (r0 != 0) goto L78
            boolean r0 = r4.A0A()
            if (r0 == 0) goto Lbc
        L78:
            X.BFw r3 = X.BFw.A04
        L7a:
            X.GCn r2 = (X.C9286GCn) r2
            X.C9286GCn.A00(r1, r3, r2)
            X.BFw r0 = X.BFw.A05
            if (r3 != r0) goto Lbf
            X.Hm1<? super kotlin.Unit> r0 = r4.A05
            r4.A05 = r1
            return r0
        L88:
            X.AHm<X.BCN> r0 = r4.A0I
            int r0 = r0.A00
            if (r0 != 0) goto Lb9
            X.AHt<java.lang.Object> r0 = r4.A02
            int r0 = r0.A01
            if (r0 != 0) goto Lb9
            java.util.List<X.BCN> r0 = r4.A0M
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb9
            java.util.List<X.BBz> r0 = r4.A0N
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb9
            boolean r0 = A0B(r4)
            if (r0 != 0) goto Lb9
            boolean r0 = r4.A0A()
            if (r0 != 0) goto Lb9
            X.AHu<java.lang.Object, java.lang.Object> r0 = r4.A0C
            int r0 = r0.A01
            if (r0 != 0) goto Lb9
            X.BFw r3 = X.BFw.A02
            goto L7a
        Lb9:
            X.BFw r3 = X.BFw.A05
            goto L7a
        Lbc:
            X.BFw r3 = X.BFw.A03
            goto L7a
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBH.A03(X.BBH):X.Hm1");
    }

    public static final void A04(BCN bcn, BBH bbh) {
        Object obj = bbh.A0K;
        synchronized (obj) {
            List<C2229BBz> list = bbh.A0N;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (C7384Etj.areEqual(list.get(i).A02, bcn)) {
                    ArrayList arrayListA0h = C3cG.A0h();
                    while (true) {
                        arrayListA0h.clear();
                        synchronized (obj) {
                            Iterator<C2229BBz> it = list.iterator();
                            while (it.hasNext()) {
                                C2229BBz next = it.next();
                                if (C7384Etj.areEqual(next.A02, bcn)) {
                                    arrayListA0h.add(next);
                                    it.remove();
                                }
                            }
                        }
                        if (arrayListA0h.isEmpty()) {
                            return;
                        } else {
                            A01(null, bbh, arrayListA0h);
                        }
                    }
                }
            }
        }
    }

    public static final void A05(BCN bcn, BBH bbh) {
        List listA0h = bbh.A09;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            bbh.A09 = listA0h;
        }
        if (!listA0h.contains(bcn)) {
            listA0h.add(bcn);
        }
        if (bbh.A0L.remove(bcn)) {
            bbh.A04 = null;
        }
    }

    public static final void A06(BCN bcn, BBH bbh, Throwable th) throws Throwable {
        if (!AnonymousClass001.A1X(A0S.get()) || (th instanceof ComposeRuntimeError)) {
            synchronized (bbh.A0K) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                BLG<C2241BCm> blg = bbh.A0A;
                C2241BCm value = blg.getValue();
                if (value != null) {
                    throw value.A00;
                }
                AnonymousClass002.A1I(blg, new C2241BCm(th));
            }
            throw th;
        }
        synchronized (bbh.A0K) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            bbh.A0M.clear();
            bbh.A0I.A09();
            bbh.A02 = new C0917AHt<>(6);
            bbh.A0N.clear();
            bbh.A0C.A0D();
            bbh.A0D.A0D();
            AnonymousClass002.A1I(bbh.A0A, new C2241BCm(th));
            if (bcn != null) {
                A05(bcn, bbh);
            }
            if (A03(bbh) != null) {
                BBL.A01("expected to go to inactive state due to composition error");
            }
        }
    }

    public static final void A07(C2229BBz c2229BBz, C2229BBz c2229BBz2, BBH bbh) {
        List<C2229BBz> list = c2229BBz2.A07;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2229BBz c2229BBz3 = list.get(i);
                BCY bcy = bbh.A0F;
                BCO<Object> bco = c2229BBz3.A03;
                C2237BCh c2237BCh = new C2237BCh(c2229BBz3, c2229BBz);
                C0914AHq.A01(bcy.A01, bco, c2237BCh);
                C0914AHq.A01(bcy.A00, c2237BCh.A00, bco);
                A07(c2229BBz, c2229BBz3, bbh);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A08(ApI apI) {
        BLG<AKC<ApI>> blg;
        AKC<ApI> value;
        C0972AJz c0972AJz;
        do {
            blg = A0R;
            value = blg.getValue();
            c0972AJz = (C0972AJz) value;
            C0959AJm c0959AJmA06 = c0972AJz.A00;
            AKS aks = (AKS) c0959AJmA06.get(apI);
            if (aks != null) {
                C0957AJk c0957AJk = c0959AJmA06.A00;
                C0957AJk c0957AJkA0K = c0957AJk.A0K(apI, C60R.A01(apI), 0);
                if (c0957AJk != c0957AJkA0K) {
                    c0959AJmA06 = c0957AJkA0K == null ? C0959AJm.A02 : new C0959AJm(c0957AJkA0K, c0959AJmA06.size() - 1);
                }
                Object obj = aks.A01;
                AKE ake = AKE.A00;
                boolean zA1Z = AnonymousClass006.A1Z(obj, ake);
                if (zA1Z) {
                    V v = c0959AJmA06.get(obj);
                    C7384Etj.A0X(v);
                    c0959AJmA06 = c0959AJmA06.A06(obj, new AKS(((AKS) v).A01, aks.A00));
                }
                Object obj2 = aks.A00;
                boolean z = false;
                if (obj2 != ake) {
                    z = true;
                    V v2 = c0959AJmA06.get(obj2);
                    C7384Etj.A0X(v2);
                    c0959AJmA06 = c0959AJmA06.A06(obj2, new AKS(obj, ((AKS) v2).A00));
                }
                if (zA1Z) {
                    obj2 = c0972AJz.A01;
                }
                if (z) {
                    obj = c0972AJz.A02;
                }
                c0972AJz = new C0972AJz(c0959AJmA06, obj2, obj);
            }
            if (value == c0972AJz) {
                return;
            }
        } while (!blg.A6e(value, c0972AJz));
    }

    private final boolean A0A() {
        return !this.A07 && (this.A0G.A01.A03.get() & 134217727) > 0;
    }

    public static final boolean A0B(BBH bbh) {
        return !bbh.A07 && (bbh.A0E.A00.A03.get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0C(X.BBH r3) {
        /*
            java.lang.Object r2 = r3.A0K
            monitor-enter(r2)
            X.AHt<java.lang.Object> r0 = r3.A02     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1c
            X.AHm<X.BCN> r0 = r3.A0I     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1c
            boolean r0 = A0B(r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1c
            boolean r1 = r3.A0A()     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            if (r1 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            monitor-exit(r2)
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBH.A0C(X.BBH):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0D(X.BBH r7) {
        /*
            java.lang.Object r2 = r7.A0K
            monitor-enter(r2)
            X.AHt<java.lang.Object> r0 = r7.A02     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L22
            X.AHm<X.BCN> r0 = r7.A0I     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7b
            boolean r0 = A0B(r7)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7b
            boolean r0 = r7.A0A()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7b
            X.AHu<java.lang.Object, java.lang.Object> r0 = r7.A0C     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L79
            goto L7b
        L22:
            java.util.List r6 = A02(r7)     // Catch: java.lang.Throwable -> L8f
            X.AHt<java.lang.Object> r0 = r7.A02     // Catch: java.lang.Throwable -> L8f
            X.AGQ r5 = new X.AGQ     // Catch: java.lang.Throwable -> L8f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8f
            r4 = 0
            r1 = 6
            X.AHt r0 = new X.AHt     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8f
            r7.A02 = r0     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r2)
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L86
        L3b:
            if (r4 >= r3) goto L59
            java.lang.Object r0 = r6.get(r4)     // Catch: java.lang.Throwable -> L86
            X.BCN r0 = (X.BCN) r0     // Catch: java.lang.Throwable -> L86
            r0.AZm(r5)     // Catch: java.lang.Throwable -> L86
            X.BLG<X.BFw> r0 = r7.A0Q     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L86
            X.BFw r1 = (X.BFw) r1     // Catch: java.lang.Throwable -> L86
            X.BFw r0 = X.BFw.A07     // Catch: java.lang.Throwable -> L86
            int r0 = r1.compareTo(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 <= 0) goto L59
            int r4 = r4 + 1
            goto L3b
        L59:
            monitor-enter(r2)
            X.Hm1 r0 = A03(r7)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7e
            X.AHm<X.BCN> r0 = r7.A0I     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7b
            boolean r0 = A0B(r7)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7b
            boolean r0 = r7.A0A()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7b
            X.AHu<java.lang.Object, java.lang.Object> r0 = r7.A0C     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L79
            goto L7b
        L79:
            r0 = 0
            goto L7c
        L7b:
            r0 = 1
        L7c:
            monitor-exit(r2)
            return r0
        L7e:
            java.lang.String r1 = "called outside of runRecomposeAndApplyChanges"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L86:
            r1 = move-exception
            monitor-enter(r2)
            X.AHt<java.lang.Object> r0 = r7.A02     // Catch: java.lang.Throwable -> L8f
            r0.A0A(r5)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r2)
            throw r1
        L8f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBH.A0D(X.BBH):boolean");
    }

    @Override // X.BBV
    public final long A0S() {
        return 1000L;
    }

    @Override // X.BBV
    public final C78T A0T() {
        return this.A0O;
    }

    @Override // X.BBV
    public final void A0V(C2229BBz c2229BBz) {
        Hm1 hm1A03;
        synchronized (this.A0K) {
            this.A0N.add(c2229BBz);
            hm1A03 = A03(this);
        }
        if (hm1A03 != null) {
            hm1A03.resumeWith(Unit.INSTANCE);
        }
    }

    @Override // X.BBV
    public final boolean A0W() {
        return A0S.get().booleanValue();
    }

    @Override // X.BBV
    public final boolean A0X() {
        return false;
    }

    @Override // X.BBV
    public final boolean A0Y() {
        return false;
    }

    @Override // X.BBV
    public final boolean A0Z() {
        return false;
    }

    public final void A0b() {
        synchronized (this.A0K) {
            BLG<BFw> blg = this.A0Q;
            if (blg.getValue().compareTo(BFw.A02) >= 0) {
                AnonymousClass002.A1I(blg, BFw.A07);
            }
        }
        this.A0P.A5w(null);
    }

    public BBH(C78T c78t) {
        BOm bOm = new BOm(C2293BSt.A00(this, 25));
        this.A0E = bOm;
        this.A0G = new BCP(C2293BSt.A00(this, 26));
        this.A0K = C3cG.A0T();
        this.A0L = C3cG.A0h();
        this.A02 = new C0917AHt<>(6);
        this.A0I = C0910AHm.A02(new BCN[16], 0);
        this.A0M = C3cG.A0h();
        this.A0N = C3cG.A0h();
        this.A0C = new C0918AHu<>(6);
        this.A0F = new BCY();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A0D = new C0918AHu<>(6);
        this.A0B = new C0918AHu<>(6);
        this.A0A = HnJ.A01(null);
        this.A0Q = C3cG.A14(BFw.A03);
        this.A0J = new C2254BDx<>();
        C9250GBd c9250GBd = new C9250GBd((HoC) c78t.get(HoC.A00));
        c9250GBd.AO5(C2297BSx.A00(this, 25));
        this.A0P = c9250GBd;
        this.A0O = c78t.plus(bOm).plus(c9250GBd);
        this.A0H = new ApI(this);
    }

    public static final void A09(BDi bDi) {
        try {
            if (bDi.A0T() instanceof BDt) {
                throw C3cG.A0Q("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            bDi.A0G();
        }
    }
}
