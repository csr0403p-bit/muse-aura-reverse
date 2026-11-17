package X;

import android.content.Context;
import android.os.Trace;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Bha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2678Bha {
    public static final C2678Bha A07 = new C2678Bha();
    public Context A00;
    public C2679Bhc A01;
    public ListenableFuture<C2679Bhc> A02;
    public final Object A05 = C3cG.A0T();
    public ListenableFuture<Void> A03 = BpQ.A01;
    public final C2681Bhe A04 = new C2681Bhe();
    public final Map<AbstractC2453Bbg, C2561Bdp> A06 = BV4.A0u();

    public static final ListenableFuture<C2678Bha> A00(Context context) {
        ListenableFuture listenableFutureA02;
        C7384Etj.A0Y(context, 0);
        C2678Bha c2678Bha = A07;
        synchronized (c2678Bha.A05) {
            listenableFutureA02 = c2678Bha.A02;
            if (listenableFutureA02 == null) {
                listenableFutureA02 = AbstractC2947Bpi.A02(new C2679Bhc(context), c2678Bha, 6);
                c2678Bha.A02 = listenableFutureA02;
            }
        }
        F5M f5m = new F5M(new EQe(context, 0), 0);
        Executor executorA00 = ExecutorC2446BbZ.A00();
        Bpe bpe = new Bpe(new F4M(f5m, 7), listenableFutureA02);
        listenableFutureA02.addListener(bpe, executorA00);
        return bpe;
    }

    public static final void A03(C2678Bha c2678Bha) {
        C2679Bhc c2679Bhc = c2678Bha.A01;
        if (c2679Bhc != null) {
            InterfaceC2541BdS interfaceC2541BdS = c2679Bhc.A01;
            if (interfaceC2541BdS == null) {
                throw C3cG.A0Q("CameraX not initialized yet.");
            }
            C2535BdM c2535BdM = (C2535BdM) ((C2537BdO) interfaceC2541BdS).A04;
            if (1 != c2535BdM.A00) {
                Iterator<InterfaceC2694Bhu> it = c2535BdM.A04.iterator();
                while (it.hasNext()) {
                    synchronized (((BjD) it.next()).A02) {
                    }
                }
            }
            c2535BdM.A00 = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final C2682Bhf A01(C2565Bdt c2565Bdt, C2693Bht c2693Bht, C2693Bht c2693Bht2, Bg6 bg6, C2678Bha c2678Bha, C1HY c1hy, List list, BfD... bfDArr) {
        C2561Bdp c2561Bdp;
        Map<AbstractC2466Bbt, C2682Bhf> map;
        C2682Bhf c2682Bhf;
        Collection collectionUnmodifiableCollection;
        C1HY c1hy2;
        C1HY c1hy3;
        boolean zContains;
        C7384Etj.A0Y(bfDArr, 7);
        AbstractC3136BzG.A00("CX:bindToLifecycle-internal");
        try {
            BoT.A00();
            C2679Bhc c2679Bhc = c2678Bha.A01;
            C7384Etj.A0X(c2679Bhc);
            InterfaceC2610Bfb interfaceC2610BfbA00 = c2565Bdt.A00(c2679Bhc.A09.A00());
            C7384Etj.A0U(interfaceC2610BfbA00);
            interfaceC2610BfbA00.AeF(true);
            AbstractC3136BzG.A00("CX:getCameraInfo");
            try {
                C2679Bhc c2679Bhc2 = c2678Bha.A01;
                C7384Etj.A0X(c2679Bhc2);
                InterfaceC2544BdV interfaceC2544BdVADJ = c2565Bdt.A00(c2679Bhc2.A09.A00()).ADJ();
                C7384Etj.A0U(interfaceC2544BdVADJ);
                Iterator<InterfaceC2455Bbi> it = c2565Bdt.A00.iterator();
                while (it.hasNext()) {
                    C7384Etj.A0U(it.next());
                    Object obj = InterfaceC2455Bbi.A00;
                    if (!obj.equals(obj)) {
                        synchronized (AbstractC2690Bhp.A00) {
                            try {
                                AbstractC2690Bhp.A01.get(obj);
                            } finally {
                            }
                        }
                        C7384Etj.A0X(c2678Bha.A00);
                    }
                }
                InterfaceC2562Bdq interfaceC2562Bdq = AbstractC2591Ben.A00;
                C2451Bbe c2451Bbe = new C2451Bbe(((C2589Bel) interfaceC2562Bdq).A00, interfaceC2544BdVADJ.ADH());
                synchronized (c2678Bha.A05) {
                    try {
                        Map<AbstractC2453Bbg, C2561Bdp> map2 = c2678Bha.A06;
                        c2561Bdp = map2.get(c2451Bbe);
                        if (c2561Bdp == null) {
                            c2561Bdp = new C2561Bdp(interfaceC2562Bdq, interfaceC2544BdVADJ);
                            map2.put(c2451Bbe, c2561Bdp);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C2561Bdp c2561Bdp2 = c2561Bdp;
                Trace.endSection();
                C7384Etj.A0Z(c2561Bdp2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                C2681Bhe c2681Bhe = c2678Bha.A04;
                C2451Bbe c2451Bbe2 = new C2451Bbe(((C2589Bel) c2561Bdp2.A00).A00, FGI.A0M(c2561Bdp2.ADH(), ""));
                Object obj2 = c2681Bhe.A01;
                synchronized (obj2) {
                    try {
                        map = c2681Bhe.A02;
                        c2682Bhf = map.get(new C2465Bbs(c2451Bbe2, c1hy));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                synchronized (obj2) {
                    try {
                        collectionUnmodifiableCollection = Collections.unmodifiableCollection(map.values());
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Iterator it2 = BFI.A0F(bfDArr).iterator();
                while (it2.hasNext()) {
                    BfD bfDA0S = BV6.A0S(it2);
                    Iterator it3 = collectionUnmodifiableCollection.iterator();
                    while (it3.hasNext()) {
                        C2682Bhf c2682Bhf2 = (C2682Bhf) C7384Etj.A0F(it3);
                        synchronized (c2682Bhf2.A03) {
                            try {
                                zContains = c2682Bhf2.A01.A02().contains(bfDA0S);
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        if (zContains && !c2682Bhf2.equals(c2682Bhf)) {
                            throw BV5.A0W("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{bfDA0S}, 1));
                        }
                    }
                }
                if (c2682Bhf == null) {
                    C2679Bhc c2679Bhc3 = c2678Bha.A01;
                    C7384Etj.A0X(c2679Bhc3);
                    InterfaceC2541BdS interfaceC2541BdS = c2679Bhc3.A01;
                    if (interfaceC2541BdS == null) {
                        throw C3cG.A0Q("CameraX not initialized yet.");
                    }
                    InterfaceC2794BlU interfaceC2794BlU = ((C2537BdO) interfaceC2541BdS).A04;
                    C2679Bhc c2679Bhc4 = c2678Bha.A01;
                    C7384Etj.A0X(c2679Bhc4);
                    InterfaceC2497BcO interfaceC2497BcO = c2679Bhc4.A00;
                    if (interfaceC2497BcO == null) {
                        throw C3cG.A0Q("CameraX not initialized yet.");
                    }
                    C2679Bhc c2679Bhc5 = c2678Bha.A01;
                    C7384Etj.A0X(c2679Bhc5);
                    BgD bgD = c2679Bhc5.A02;
                    if (bgD == null) {
                        throw C3cG.A0Q("CameraX not initialized yet.");
                    }
                    C2603BfF c2603BfF = new C2603BfF(c2693Bht, c2693Bht2, interfaceC2794BlU, interfaceC2497BcO, interfaceC2610BfbA00, c2561Bdp2, bgD);
                    synchronized (obj2) {
                        try {
                            BeS.A06(AnonymousClass002.A1Y(map.get(new C2465Bbs(c2603BfF.A0F, c1hy))), "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                            c2682Bhf = new C2682Bhf(c2603BfF, c1hy);
                            if (c2603BfF.A02().isEmpty()) {
                                c2682Bhf.A01();
                            }
                            if (C8j3.A0m(c1hy) != EnumC10573Huf.A03) {
                                synchronized (c2682Bhf.A03) {
                                    c1hy3 = c2682Bhf.A02;
                                }
                                C2561Bdp c2561Bdp3 = c2682Bhf.A01.A0D;
                                C2465Bbs c2465Bbs = new C2465Bbs(new C2451Bbe(((C2589Bel) c2561Bdp3.A00).A00, FGI.A0M(c2561Bdp3.ADH(), "")), c1hy3);
                                C2683Bhg c2683BhgA00 = C2681Bhe.A00(c2681Bhe, c1hy3);
                                Set<AbstractC2466Bbt> setA10 = c2683BhgA00 != null ? BV4.A10(c2683BhgA00, c2681Bhe.A03) : C60O.A13();
                                setA10.add(c2465Bbs);
                                map.put(c2465Bbs, c2682Bhf);
                                if (c2683BhgA00 == null) {
                                    C2683Bhg c2683Bhg = new C2683Bhg(c2681Bhe, c1hy3);
                                    c2681Bhe.A03.put(c2683Bhg, setA10);
                                    c1hy3.getLifecycle().A04(c2683Bhg);
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                int length = bfDArr.length;
                if (length != 0) {
                    List listA11 = AbstractC0885AGm.A11(Arrays.copyOf(bfDArr, length));
                    C2679Bhc c2679Bhc6 = c2678Bha.A01;
                    C7384Etj.A0X(c2679Bhc6);
                    InterfaceC2541BdS interfaceC2541BdS2 = c2679Bhc6.A01;
                    if (interfaceC2541BdS2 == null) {
                        throw C3cG.A0Q("CameraX not initialized yet.");
                    }
                    InterfaceC2794BlU interfaceC2794BlU2 = ((C2537BdO) interfaceC2541BdS2).A04;
                    synchronized (obj2) {
                        try {
                            BeS.A05(BV6.A1b(listA11));
                            c2681Bhe.A00 = interfaceC2794BlU2;
                            Object obj3 = c2682Bhf.A03;
                            synchronized (obj3) {
                                try {
                                    c1hy2 = c2682Bhf.A02;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                            C2683Bhg c2683BhgA002 = C2681Bhe.A00(c2681Bhe, c1hy2);
                            if (c2683BhgA002 != null) {
                                Iterator it4 = BV4.A10(c2683BhgA002, c2681Bhe.A03).iterator();
                                while (it4.hasNext()) {
                                    C2682Bhf c2682Bhf3 = map.get((AbstractC2466Bbt) it4.next());
                                    c2682Bhf3.getClass();
                                    if (!c2682Bhf3.equals(c2682Bhf) && !c2682Bhf3.A00().isEmpty()) {
                                        throw C60O.A0i("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                                    }
                                }
                                try {
                                    C2603BfF c2603BfF2 = c2682Bhf.A01;
                                    Object obj4 = c2603BfF2.A0G;
                                    synchronized (obj4) {
                                        try {
                                            c2603BfF2.A01 = bg6;
                                        } catch (Throwable th7) {
                                            throw th7;
                                        }
                                    }
                                    synchronized (obj4) {
                                        try {
                                            c2603BfF2.A04 = list;
                                        } finally {
                                        }
                                    }
                                    synchronized (obj3) {
                                        try {
                                            synchronized (obj4) {
                                                c2603BfF2.A0B.AdP(c2603BfF2.A09);
                                                LinkedHashSet linkedHashSet = new LinkedHashSet(c2603BfF2.A0H);
                                                linkedHashSet.addAll(listA11);
                                                try {
                                                    C2603BfF.A01(c2603BfF2, linkedHashSet, false);
                                                } catch (IllegalArgumentException e) {
                                                    throw new CameraUseCaseAdapter$CameraException(e);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    if (C8j3.A0m(c1hy2).A00(EnumC10573Huf.A06)) {
                                        c2681Bhe.A03(c1hy2);
                                    }
                                } catch (CameraUseCaseAdapter$CameraException e2) {
                                    throw new IllegalArgumentException(e2);
                                }
                            }
                        } catch (Throwable th8) {
                            throw th8;
                        }
                    }
                }
                return c2682Bhf;
            } catch (Throwable th9) {
                Trace.endSection();
                throw th9;
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final void A02(C2678Bha c2678Bha) {
        C2679Bhc c2679Bhc = c2678Bha.A01;
        if (c2679Bhc != null && c2679Bhc.A01 == null) {
            throw C3cG.A0Q("CameraX not initialized yet.");
        }
    }

    public final void A04(BfD... bfDArr) {
        C1HY c1hy;
        AbstractC3136BzG.A00("CX:unbind");
        try {
            BoT.A00();
            A02(this);
            C2681Bhe c2681Bhe = this.A04;
            List listA11 = AbstractC0885AGm.A11(Arrays.copyOf(bfDArr, bfDArr.length));
            synchronized (c2681Bhe.A01) {
                Map<AbstractC2466Bbt, C2682Bhf> map = c2681Bhe.A02;
                Iterator itA11 = BV5.A11(map);
                while (itA11.hasNext()) {
                    C2682Bhf c2682Bhf = map.get((AbstractC2466Bbt) itA11.next());
                    boolean zIsEmpty = c2682Bhf.A00().isEmpty();
                    Object obj = c2682Bhf.A03;
                    synchronized (obj) {
                        try {
                            ArrayList arrayListA0t = BV4.A0t(listA11);
                            C2603BfF c2603BfF = c2682Bhf.A01;
                            arrayListA0t.retainAll(c2603BfF.A02());
                            c2603BfF.A05(arrayListA0t);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!zIsEmpty && c2682Bhf.A00().isEmpty()) {
                        synchronized (obj) {
                            try {
                                c1hy = c2682Bhf.A02;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        c2681Bhe.A04(c1hy);
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean A05(C2565Bdt c2565Bdt) {
        boolean z;
        AbstractC3136BzG.A00("CX:hasCamera");
        try {
            C2679Bhc c2679Bhc = this.A01;
            C7384Etj.A0X(c2679Bhc);
            c2565Bdt.A00(c2679Bhc.A09.A00());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z;
    }
}
