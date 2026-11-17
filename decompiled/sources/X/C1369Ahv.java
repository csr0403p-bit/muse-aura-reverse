package X;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ahv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1369Ahv implements BKv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public BBV A04;
    public SubcomposeSlotReusePolicy A05;
    public final C0918AHu<Object, AfC> A06;
    public final C0918AHu<C1453AjM, C1375Ai1> A07;
    public final C0918AHu<Object, C1453AjM> A08;
    public final C0918AHu<Object, C1453AjM> A09;
    public final C0910AHm<Object> A0A;
    public final C1365Ahr A0B;
    public final C1364Ahq A0C;
    public final C1453AjM A0D;
    public final AIS A0E;

    private final void A04(C1375Ai1 c1375Ai1, boolean z) {
        if (z || !c1375Ai1.A05) {
            c1375Ai1.A00 = AbstractC1798ArH.A08(false);
        } else {
            MutableState.A09(false, c1375Ai1.A00);
        }
        if (c1375Ai1.A01 != null) {
            A02(c1375Ai1);
            return;
        }
        if (!z) {
            AndroidComposeView outOfFrameExecutor = ((AndroidComposeView) AbstractC1333AhK.A00(this.A0D)).getOutOfFrameExecutor();
            if (outOfFrameExecutor != null) {
                C2328BUc c2328BUcA00 = C2328BUc.A00(c1375Ai1, 13);
                AIG<Function0<Unit>> aig = outOfFrameExecutor.A15;
                boolean zIsEmpty = aig.isEmpty();
                aig.addLast(c2328BUcA00);
                if (zIsEmpty) {
                    Handler handler = outOfFrameExecutor.getHandler();
                    if (handler == null) {
                        throw C60O.A0i("schedule is called when outOfFrameExecutor is not available (view is detached)");
                    }
                    handler.postAtFrontOfQueue(outOfFrameExecutor.A14);
                    return;
                }
                return;
            }
            if (c1375Ai1.A05) {
                return;
            }
        }
        InterfaceC1377Ai3 interfaceC1377Ai3 = c1375Ai1.A02;
        if (interfaceC1377Ai3 != null) {
            interfaceC1377Ai3.deactivate();
        }
    }

    public static final void A05(C1369Ahv c1369Ahv, int i, int i2) {
        C1453AjM c1453AjM = c1369Ahv.A0D;
        c1453AjM.A0O = true;
        c1453AjM.A0U(i, i2, 1);
        c1453AjM.A0O = false;
    }

    public static final void A09(C1369Ahv c1369Ahv, boolean z) {
        c1369Ahv.A02 = 0;
        c1369Ahv.A08.A0D();
        List<C1453AjM> listA08 = c1369Ahv.A0D.A0e.A00.A08();
        int size = listA08.size();
        if (c1369Ahv.A03 != size) {
            c1369Ahv.A03 = size;
            Snapshot snapshotA03 = Snapshot.A03();
            G0U g0uA1F = C8j3.A1F(snapshotA03);
            Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
            for (int i = 0; i < size; i++) {
                try {
                    C1453AjM c1453AjM = listA08.get(i);
                    C1375Ai1 c1375Ai1A05 = c1369Ahv.A07.A05(c1453AjM);
                    if (c1375Ai1A05 != null && MutableState.A0A((MutableState) c1375Ai1A05.A00)) {
                        C1459AjS c1459AjS = c1453AjM.A0d;
                        C1454AjN c1454AjN = c1459AjS.A0G;
                        Integer num = C79.A0C;
                        c1454AjN.A0A = num;
                        C1455AjO c1455AjO = c1459AjS.A04;
                        if (c1455AjO != null) {
                            c1455AjO.A07 = num;
                        }
                        c1369Ahv.A04(c1375Ai1A05, z);
                        c1375Ai1A05.A03 = AbstractC1360Ahl.A00;
                    }
                } catch (Throwable th) {
                    Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
                    throw th;
                }
            }
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
            c1369Ahv.A09.A0D();
        }
        c1369Ahv.A0A();
    }

    public final void A0B(int i) {
        this.A03 = 0;
        C1453AjM c1453AjM = this.A0D;
        List<C1453AjM> listA08 = c1453AjM.A0e.A00.A08();
        int size = (listA08.size() - this.A02) - 1;
        if (i <= size) {
            AIS ais = this.A0E;
            ais.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    C1375Ai1 c1375Ai1A05 = this.A07.A05(listA08.get(i2));
                    C7384Etj.A0X(c1375Ai1A05);
                    ais.A00.A07(c1375Ai1A05.A03);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.A05.AKj(ais);
            Snapshot snapshotA03 = Snapshot.A03();
            G0U g0uA1F = C8j3.A1F(snapshotA03);
            Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
            boolean z = false;
            while (size >= i) {
                try {
                    C1453AjM c1453AjM2 = listA08.get(size);
                    C0918AHu<C1453AjM, C1375Ai1> c0918AHu = this.A07;
                    C1375Ai1 c1375Ai1A052 = c0918AHu.A05(c1453AjM2);
                    C7384Etj.A0X(c1375Ai1A052);
                    C1375Ai1 c1375Ai1 = c1375Ai1A052;
                    Object obj = c1375Ai1.A03;
                    if (ais.contains(obj)) {
                        this.A03++;
                        if (c1375Ai1.A00.getValue().booleanValue()) {
                            C1459AjS c1459AjS = c1453AjM2.A0d;
                            C1454AjN c1454AjN = c1459AjS.A0G;
                            Integer num = C79.A0C;
                            c1454AjN.A0A = num;
                            C1455AjO c1455AjO = c1459AjS.A04;
                            if (c1455AjO != null) {
                                c1455AjO.A07 = num;
                            }
                            A04(c1375Ai1, false);
                            if (c1375Ai1.A05) {
                                z = true;
                            }
                        }
                    } else {
                        c1453AjM.A0O = true;
                        c0918AHu.A0B(c1453AjM2);
                        InterfaceC1377Ai3 interfaceC1377Ai3 = c1375Ai1.A02;
                        if (interfaceC1377Ai3 != null) {
                            interfaceC1377Ai3.dispose();
                        }
                        c1453AjM.A0T(size, 1);
                        c1453AjM.A0O = false;
                    }
                    this.A09.A0B(obj);
                    size--;
                } finally {
                    Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
                }
            }
            if (z) {
                Snapshot.A05();
            }
        }
        A0A();
    }

    @Override // X.BKv
    public final void ASU() {
        A09(this, true);
    }

    @Override // X.BKv
    public final void AVb() {
        A09(this, false);
    }

    public static final AfC A00(C1369Ahv c1369Ahv, Object obj) {
        return c1369Ahv.A0D.A0D != null ? new C1352Ahd(c1369Ahv, obj) : new Ai5();
    }

    public static final C1453AjM A01(C1369Ahv c1369Ahv, Object obj) {
        C0918AHu<C1453AjM, C1375Ai1> c0918AHu;
        if (c1369Ahv.A03 != 0) {
            List<C1453AjM> listA08 = c1369Ahv.A0D.A0e.A00.A08();
            int size = listA08.size() - c1369Ahv.A02;
            int i = size - c1369Ahv.A03;
            int i2 = size - 1;
            int i3 = i2;
            while (true) {
                if (i3 < i) {
                    break;
                }
                C1453AjM c1453AjM = listA08.get(i3);
                c0918AHu = c1369Ahv.A07;
                C1375Ai1 c1375Ai1A05 = c0918AHu.A05(c1453AjM);
                C7384Etj.A0X(c1375Ai1A05);
                if (!C7384Etj.areEqual(c1375Ai1A05.A03, obj)) {
                    i3--;
                } else if (i3 == -1) {
                    break;
                }
            }
            while (i2 >= i) {
                C1453AjM c1453AjM2 = listA08.get(i2);
                c0918AHu = c1369Ahv.A07;
                C1375Ai1 c1375Ai1A052 = c0918AHu.A05(c1453AjM2);
                C7384Etj.A0X(c1375Ai1A052);
                C1375Ai1 c1375Ai1 = c1375Ai1A052;
                Object obj2 = c1375Ai1.A03;
                if (obj2 == AbstractC1360Ahl.A00 || c1369Ahv.A05.A4k(obj, obj2)) {
                    c1375Ai1.A03 = obj;
                    i3 = i2;
                    if (i3 != -1) {
                        if (i3 != i) {
                            A05(c1369Ahv, i3, i);
                        }
                        c1369Ahv.A03--;
                        C1453AjM c1453AjM3 = listA08.get(i);
                        C1375Ai1 c1375Ai1A053 = c0918AHu.A05(c1453AjM3);
                        C7384Etj.A0X(c1375Ai1A053);
                        C1375Ai1 c1375Ai12 = c1375Ai1A053;
                        c1375Ai12.A00 = AbstractC1798ArH.A08(true);
                        c1375Ai12.A07 = true;
                        c1375Ai12.A06 = true;
                        return c1453AjM3;
                    }
                } else {
                    i2--;
                }
            }
        }
        return null;
    }

    public static final void A02(C1375Ai1 c1375Ai1) {
        InterfaceC1367Aht interfaceC1367Aht = c1375Ai1.A01;
        if (interfaceC1367Aht != null) {
            C1373Ahz c1373Ahz = (C1373Ahz) interfaceC1367Aht;
            c1373Ahz.A01.set(EnumC1374Ai0.A04);
            AlX alX = c1373Ahz.A06;
            C0917AHt<InterfaceC1560Ala> c0917AHt = alX.A02;
            C0917AHt<InterfaceC1560Ala> c0917AHt2 = null;
            if (c0917AHt.A01 != 0) {
                c0917AHt2 = c0917AHt;
                alX.A02 = C0917AHt.A02();
                alX.A09.A09();
            }
            alX.A02();
            BBG bbg = c1373Ahz.A04;
            bbg.A04 = null;
            if (c0917AHt2 != null) {
                bbg.A0H.A03 = c0917AHt2;
                bbg.A01 = 2;
            }
            c1375Ai1.A01 = null;
            InterfaceC1377Ai3 interfaceC1377Ai3 = c1375Ai1.A02;
            if (interfaceC1377Ai3 != null) {
                interfaceC1377Ai3.dispose();
            }
            c1375Ai1.A02 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[Catch: Exception -> 0x01bc, all -> 0x01c5, TryCatch #3 {Exception -> 0x01bc, blocks: (B:17:0x0042, B:18:0x0050, B:19:0x0053, B:20:0x0057, B:21:0x0058, B:22:0x005f, B:23:0x0066, B:24:0x006d, B:25:0x0074, B:66:0x0158, B:68:0x0167, B:89:0x01b0), top: B:105:0x0042, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: Exception -> 0x01bc, all -> 0x01c5, TryCatch #3 {Exception -> 0x01bc, blocks: (B:17:0x0042, B:18:0x0050, B:19:0x0053, B:20:0x0057, B:21:0x0058, B:22:0x005f, B:23:0x0066, B:24:0x006d, B:25:0x0074, B:66:0x0158, B:68:0x0167, B:89:0x01b0), top: B:105:0x0042, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: Exception -> 0x01bc, all -> 0x01c5, TryCatch #3 {Exception -> 0x01bc, blocks: (B:17:0x0042, B:18:0x0050, B:19:0x0053, B:20:0x0057, B:21:0x0058, B:22:0x005f, B:23:0x0066, B:24:0x006d, B:25:0x0074, B:66:0x0158, B:68:0x0167, B:89:0x01b0), top: B:105:0x0042, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[Catch: Exception -> 0x01bc, all -> 0x01c5, TryCatch #3 {Exception -> 0x01bc, blocks: (B:17:0x0042, B:18:0x0050, B:19:0x0053, B:20:0x0057, B:21:0x0058, B:22:0x005f, B:23:0x0066, B:24:0x006d, B:25:0x0074, B:66:0x0158, B:68:0x0167, B:89:0x01b0), top: B:105:0x0042, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[Catch: Exception -> 0x01bc, all -> 0x01c5, TryCatch #3 {Exception -> 0x01bc, blocks: (B:17:0x0042, B:18:0x0050, B:19:0x0053, B:20:0x0057, B:21:0x0058, B:22:0x005f, B:23:0x0066, B:24:0x006d, B:25:0x0074, B:66:0x0158, B:68:0x0167, B:89:0x01b0), top: B:105:0x0042, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: Exception -> 0x01bc, all -> 0x01c5, TRY_LEAVE, TryCatch #3 {Exception -> 0x01bc, blocks: (B:17:0x0042, B:18:0x0050, B:19:0x0053, B:20:0x0057, B:21:0x0058, B:22:0x005f, B:23:0x0066, B:24:0x006d, B:25:0x0074, B:66:0x0158, B:68:0x0167, B:89:0x01b0), top: B:105:0x0042, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C1375Ai1 r20, X.C1369Ahv r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369Ahv.A03(X.Ai1, X.Ahv, boolean):void");
    }

    public static final void A06(C1369Ahv c1369Ahv, C1453AjM c1453AjM, Object obj, G0V g0v, boolean z) {
        C0918AHu<C1453AjM, C1375Ai1> c0918AHu = c1369Ahv.A07;
        C1375Ai1 c1375Ai1A05 = c0918AHu.A05(c1453AjM);
        if (c1375Ai1A05 == null) {
            G0V<BFM, Integer, Unit> g0v2 = C8kB.A00;
            c1375Ai1A05 = new C1375Ai1();
            c1375Ai1A05.A03 = obj;
            c1375Ai1A05.A04 = g0v2;
            c1375Ai1A05.A02 = null;
            c1375Ai1A05.A00 = AbstractC1798ArH.A08(true);
            c0918AHu.A0E(c1453AjM, c1375Ai1A05);
        }
        C1375Ai1 c1375Ai1 = c1375Ai1A05;
        boolean zA1N = true;
        boolean zA1Z = AnonymousClass006.A1Z(c1375Ai1.A04, g0v);
        if (c1375Ai1.A01 != null) {
            if (zA1Z) {
                A02(c1375Ai1);
            } else if (z) {
                return;
            } else {
                A03(c1375Ai1, c1369Ahv, true);
            }
        }
        InterfaceC1377Ai3 interfaceC1377Ai3 = c1375Ai1.A02;
        if (interfaceC1377Ai3 != null) {
            BBG bbg = (BBG) interfaceC1377Ai3;
            synchronized (bbg.A0I) {
                zA1N = AnonymousClass002.A1N(bbg.A02.A01);
            }
        }
        if (zA1Z || zA1N || c1375Ai1.A06) {
            c1375Ai1.A04 = g0v;
            if (c1375Ai1.A01 != null) {
                throw C60O.A0i("new subcompose call while paused composition is still active");
            }
            Snapshot snapshotA03 = Snapshot.A03();
            G0U g0uA1F = C8j3.A1F(snapshotA03);
            Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
            try {
                C1453AjM c1453AjM2 = c1369Ahv.A0D;
                c1453AjM2.A0O = true;
                InterfaceC1377Ai3 bbg2 = c1375Ai1.A02;
                BBV bbv = c1369Ahv.A04;
                if (bbv == null) {
                    throw C3cG.A0Q("parent composition reference not set");
                }
                if (bbg2 == null || ((BBG) bbg2).A01 == 3) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = AbstractC1648AnR.A00;
                        bbg2 = new BBG(new C1376Ai2(c1453AjM), bbv);
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = AbstractC1648AnR.A00;
                        bbg2 = new BBG(new C1376Ai2(c1453AjM), bbv);
                    }
                }
                c1375Ai1.A02 = bbg2;
                G0V<? super BFM, ? super Integer, Unit> g0vA03 = c1375Ai1.A04;
                if (((AndroidComposeView) AbstractC1333AhK.A00(c1453AjM2)).getOutOfFrameExecutor() != null) {
                    c1375Ai1.A05 = false;
                } else {
                    c1375Ai1.A05 = true;
                    g0vA03 = B1U.A03(new C2336BUk(1, c1375Ai1, g0vA03), 1524156494, true);
                }
                if (z) {
                    if (c1375Ai1.A07) {
                        BBG bbg3 = (BBG) ((Ai6) bbg2);
                        BBG.A0A(bbg3);
                        BBG.A06(bbg3);
                        c1375Ai1.A01 = BBG.A00(bbg3, g0vA03, true);
                    } else {
                        BBG bbg4 = (BBG) ((Ai6) bbg2);
                        c1375Ai1.A01 = BBG.A00(bbg4, g0vA03, BBG.A0A(bbg4));
                    }
                } else if (c1375Ai1.A07) {
                    BBG bbg5 = (BBG) bbg2;
                    BBG.A0A(bbg5);
                    BBG.A06(bbg5);
                    BBI bbi = bbg5.A0F;
                    bbi.A05 = 0;
                    bbi.A0Q = true;
                    bbg5.A06 = g0vA03;
                    bbg5.A0D.A0U(bbg5, g0vA03);
                    bbi.A0Y();
                } else {
                    bbg2.Ad8(g0vA03);
                }
                c1375Ai1.A07 = false;
                c1453AjM2.A0O = false;
                Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
                c1375Ai1.A06 = false;
            } catch (Throwable th) {
                Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
                throw th;
            }
        }
    }

    public static final void A08(C1369Ahv c1369Ahv, Object obj, G0V g0v, boolean z) {
        C1453AjM c1453AjM = c1369Ahv.A0D;
        if (c1453AjM.A0D != null) {
            c1369Ahv.A0A();
            if (c1369Ahv.A09.A07(obj)) {
                return;
            }
            c1369Ahv.A06.A0B(obj);
            C0918AHu<Object, C1453AjM> c0918AHu = c1369Ahv.A08;
            C1453AjM c1453AjMA05 = c0918AHu.A05(obj);
            if (c1453AjMA05 == null) {
                c1453AjMA05 = A01(c1369Ahv, obj);
                C0910AHm<C1453AjM> c0910AHm = c1453AjM.A0e.A00;
                List<C1453AjM> listA08 = c0910AHm.A08();
                if (c1453AjMA05 != null) {
                    A05(c1369Ahv, listA08.indexOf(c1453AjMA05), c0910AHm.A08().size());
                } else {
                    int size = listA08.size();
                    c1453AjMA05 = new C1453AjM(true, ARD.A00.addAndGet(1));
                    c1453AjM.A0O = true;
                    c1453AjM.A0V(c1453AjMA05, size);
                    c1453AjM.A0O = false;
                }
                c1369Ahv.A02++;
                c0918AHu.A0E(obj, c1453AjMA05);
            }
            A06(c1369Ahv, c1453AjMA05, obj, g0v, z);
        }
    }

    public final void A0A() {
        StringBuilder sbA0y;
        int size = this.A0D.A0e.A00.A08().size();
        int i = this.A07.A01;
        if (i == size) {
            int i2 = this.A03;
            int i3 = this.A02;
            if ((size - i2) - i3 >= 0) {
                int i4 = this.A08.A01;
                if (i4 == i3) {
                    return;
                }
                sbA0y = C60O.A0y("Incorrect state. Precomposed children ", i3);
                sbA0y.append(". Map size ");
                sbA0y.append(i4);
            } else {
                sbA0y = C60O.A0y("Incorrect state. Total children ", size);
                sbA0y.append(". Reusable children ");
                sbA0y.append(i2);
                sbA0y.append(". Precomposed children ");
                sbA0y.append(i3);
            }
        } else {
            sbA0y = C60O.A0y("Inconsistency between the count of nodes tracked by the state (", i);
            sbA0y.append(") and the children count on the SubcomposeLayout (");
            sbA0y.append(size);
            sbA0y.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        throw C60O.A0i(sbA0y.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // X.BKv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AVE() {
        /*
            r17 = this;
            r10 = r17
            X.AjM r11 = r10.A0D
            r0 = 1
            r11.A0O = r0
            X.AHu<X.AjM, X.Ai1> r9 = r10.A07
            java.lang.Object[] r8 = r9.A05
            long[] r7 = r9.A03
            int r0 = r7.length
            int r6 = r0 + (-2)
            r5 = 0
            if (r6 < 0) goto L59
            r4 = 0
        L14:
            r16 = r7[r4]
            r12 = -1
            long r12 = r12 ^ r16
            r0 = 7
            long r12 = r12 << r0
            long r12 = r12 & r16
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            int r0 = r4 - r6
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r3 = 8
            int r2 = 8 - r0
            r1 = 0
        L33:
            if (r1 >= r2) goto L52
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r16
            r12 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L4d
            int r0 = r4 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            X.Ai1 r0 = (X.C1375Ai1) r0
            X.Ai3 r0 = r0.A02
            if (r0 == 0) goto L4d
            r0.dispose()
        L4d:
            long r16 = r16 >> r3
            int r1 = r1 + 1
            goto L33
        L52:
            if (r2 != r3) goto L59
        L54:
            if (r4 == r6) goto L59
            int r4 = r4 + 1
            goto L14
        L59:
            r11.A0O()
            r11.A0O = r5
            r9.A0D()
            X.AHu<java.lang.Object, X.AjM> r0 = r10.A09
            r0.A0D()
            r10.A02 = r5
            r10.A03 = r5
            X.AHu<java.lang.Object, X.AjM> r0 = r10.A08
            r0.A0D()
            r10.A0A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369Ahv.AVE():void");
    }

    public C1369Ahv(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy, C1453AjM c1453AjM) {
        this.A0D = c1453AjM;
        this.A05 = subcomposeSlotReusePolicy;
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A07 = new C0918AHu<>(6);
        this.A09 = new C0918AHu<>(6);
        this.A0C = new C1364Ahq(this);
        this.A0B = new C1365Ahr(this);
        this.A08 = new C0918AHu<>(6);
        this.A0E = new AIS(null, null, 1);
        this.A06 = new C0918AHu<>(6);
        this.A0A = C0910AHm.A01(new Object[16]);
    }

    public static final void A07(C1369Ahv c1369Ahv, Object obj) {
        String str;
        c1369Ahv.A0A();
        C1453AjM c1453AjMA0B = c1369Ahv.A08.A0B(obj);
        if (c1453AjMA0B != null) {
            if (c1369Ahv.A02 > 0) {
                C0910AHm<C1453AjM> c0910AHm = c1369Ahv.A0D.A0e.A00;
                int iIndexOf = c0910AHm.A08().indexOf(c1453AjMA0B);
                int size = c0910AHm.A08().size();
                int i = c1369Ahv.A02;
                if (iIndexOf >= size - i) {
                    c1369Ahv.A03++;
                    c1369Ahv.A02 = i - 1;
                    C1375Ai1 c1375Ai1A05 = c1369Ahv.A07.A05(c1453AjMA0B);
                    if (c1375Ai1A05 != null) {
                        A02(c1375Ai1A05);
                    }
                    int size2 = (c0910AHm.A08().size() - c1369Ahv.A02) - c1369Ahv.A03;
                    A05(c1369Ahv, iIndexOf, size2);
                    c1369Ahv.A0B(size2);
                } else {
                    str = "Item is not in pre-composed item range";
                }
            } else {
                str = "No pre-composed items to dispose";
            }
            ASP.A01(str);
            throw F60.createAndThrow();
        }
        if (c1369Ahv.A0A.A0H(obj)) {
            C1453AjM.A0B(c1369Ahv.A0D, true, true, true);
        }
    }
}
