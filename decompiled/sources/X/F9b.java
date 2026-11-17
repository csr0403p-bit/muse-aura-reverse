package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.facebook.aura.R;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.instagram.common.bloks.BloksParseResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class F9b implements FB4 {
    public static final Handler A0U = C60O.A02();
    public int A00;
    public F9Q A01;
    public C3094By7 A02;
    public FAX A03;
    public F8I A05;
    public C7674F9s A07;
    public FCA A08;
    public WeakReference<FBB> A09;
    public boolean A0A;
    public boolean A0B;
    public final FAV A0C;
    public final C7668F9m A0D;
    public final C7671F9p A0E;
    public final C7670F9o A0F;
    public final F9N A0G;
    public final List<Hgy> A0H;
    public final List A0I;
    public final List<FBH> A0J;
    public final List<Pair<FAW, FAS>> A0K;
    public final List<BloksParseResult> A0L;
    public final Map<String, Object> A0M;
    public final Object A0N;
    public final Runnable A0O;
    public volatile FDW A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;
    public volatile BloksParseResult A0T;
    public volatile AbstractC7688FAh A0P = null;
    public F6v A06 = C7683FAb.A00;
    public F9X A04 = new F9X();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v9 */
    private final Pair<Boolean, List<Pair<FAW, FAS>>> A00(List<BloksParseResult> list) {
        Pair<Boolean, List<Pair<FAW, FAS>>> pair;
        F9T f9t;
        boolean z;
        ArrayList arrayListA1F;
        C7648F8p c7648F8p;
        C0881AGi<F8M> c0881AGi = null;
        List<F9V> listA0X = null;
        this.A0S = true;
        try {
            LinkedList linkedList = new LinkedList(list);
            ArrayList arrayListA0h = C3cG.A0h();
            FBB fbb = this.A09.get();
            if (fbb == null) {
                pair = new Pair<>(false, C3cG.A0h());
            } else {
                F9X f9x = this.A04;
                while (!linkedList.isEmpty()) {
                    BloksParseResult bloksParseResult = (BloksParseResult) linkedList.poll();
                    if (bloksParseResult != null && (f9t = bloksParseResult.A01) != null) {
                        FDW fdw = bloksParseResult.A02;
                        this.A04 = this.A04.A02(f9t);
                        String strA00 = (fdw == null || (c7648F8p = fdw.A09) == null) ? null : AbstractC7647F8o.A00(c7648F8p, C79.A00);
                        for (F6K f6k : f9t.A06) {
                            String str = f6k.A01;
                            String strA02 = f6k.A00.booleanValue() ? AbstractC7647F8o.A02(str, strA00) : str;
                            if (!this.A04.A09.containsKey(str)) {
                                this.A04 = this.A04.A03(Collections.singletonMap(str, f6k));
                            }
                            if (!this.A04.A0A.containsKey(strA02)) {
                                C7648F8p c7648F8p2 = fdw != null ? fdw.A09 : null;
                                C7670F9o c7670F9o = this.A0F;
                                Htq<F6D> htqA02 = FBA.A02(fbb);
                                String strA022 = FBB.A02(fbb);
                                Integer num = C79.A0C;
                                C7384Etj.A0Y(c7670F9o, 6);
                                F6D f6d = new F6D(null, fbb, null, c7670F9o, null, htqA02, c7648F8p2, num, strA022, null, null, false);
                                String str2 = f6k.A02;
                                InterfaceC7700FAy<Object> interfaceC7700FAy = FBA.A06(fbb).get(str2);
                                if (interfaceC7700FAy == null) {
                                    throw BV5.A0h("Missing variable module with type: ", str2);
                                }
                                FAR far = interfaceC7700FAy.AfK(f6d, null, f6k.A03).A00;
                                this.A02.A01(far.A6c(this, strA02));
                                this.A04 = this.A04.A04(Collections.singletonMap(strA02, far.AGT()));
                            }
                        }
                        C7648F8p c7648F8p3 = fdw != null ? fdw.A09 : null;
                        C7670F9o c7670F9o2 = this.A0F;
                        Htq<F6D> htqA022 = FBA.A02(fbb);
                        String strA023 = FBB.A02(fbb);
                        Integer num2 = C79.A0K;
                        C7384Etj.A0Y(c7670F9o2, 6);
                        F6D f6d2 = new F6D(null, fbb, null, c7670F9o2, null, htqA022, c7648F8p3, num2, strA023, null, null, false);
                        List<F9S> list2 = f9t.A02;
                        if (list2 == null || list2.isEmpty()) {
                            z = false;
                            c0881AGi = c0881AGi;
                        } else {
                            try {
                                F9Q f9q = this.A01;
                                if (f9q == null) {
                                    FBN fbn = (FBN) fbb.A03(R.id.bk_context_key_async_component_store);
                                    if (fbn == null) {
                                        throw BV4.A0c("Attempting to process async components but missing component query store");
                                    }
                                    f9q = new F9Q(this.A02, this, fbn);
                                    this.A01 = f9q;
                                }
                                ArrayList arrayListA0h2 = C3cG.A0h();
                                ?? A0h = 0;
                                for (F9S f9s : list2) {
                                    String str3 = (String) F9Q.A00(f6d2, f9s.A00, AuraBloksDataProps.APP_ID);
                                    if (str3 != null) {
                                        Map map = (Map) F9Q.A00(f6d2, f9s.A03, AuraBloksDataProps.PARAMS);
                                        if (map == null) {
                                            map = C9jH.A00;
                                        }
                                        Long l = (Long) F9Q.A00(f6d2, f9s.A01, "cacheTtlSeconds");
                                        if (l != null) {
                                            AbstractC7689FAi abstractC7689FAiA02 = f9q.A02.A02(new FBX(HlX.A02, new C7711FBj(l.longValue()), str3, map), new C8192FYj(f9q, (G0U<? super Throwable, Unit>) f6d2, f9s, 12), f9s.A07);
                                            if (abstractC7689FAiA02 instanceof C7664F9h) {
                                                f9q.A00.A01(((C7664F9h) abstractC7689FAiA02).A00);
                                                A0h = A0h;
                                                if (A0h == 0) {
                                                    A0h = C3cG.A0h();
                                                }
                                                A0h.add(new F8M(FGI.A0M("query_info_", f9s.A04), null));
                                            } else {
                                                if (!(abstractC7689FAiA02 instanceof C7665F9i)) {
                                                    throw C3cG.A0q();
                                                }
                                                AnonymousClass002.A1J(f9s, ((C7665F9i) abstractC7689FAiA02).A00, arrayListA0h2);
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                synchronized (f9q.A03) {
                                    try {
                                        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
                                        Iterator it = arrayListA0h2.iterator();
                                        while (it.hasNext()) {
                                            HxE hxEA10 = C60Q.A10(it);
                                            arrayListA0i.add(F9Q.A01(f9q, f6d2, (HoL) hxEA10.second, (F9S) hxEA10.first, C79.A00));
                                        }
                                        arrayListA1F = Hr7.A1F(arrayListA0i);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                listA0X = AbstractC0878AGe.A0X(arrayListA1F);
                                C0881AGi c0881AGi2 = A0h;
                                if (A0h == 0) {
                                    c0881AGi2 = C0881AGi.A00;
                                }
                                C7384Etj.A0Y(listA0X, 0);
                                z = true;
                                c0881AGi = c0881AGi2;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z) {
                            for (F9V f9v : listA0X) {
                                F9U f9u = f9v.A01;
                                F8M f8m = f9v.A00;
                                if (f9u != null) {
                                    linkedList.add(f9u.A00);
                                    arrayListA0h.add(new Pair(f9u.A01, f9u.A02));
                                }
                                this.A04 = this.A04.A04(AnonymousClass006.A10(f8m.A01, f8m.A00));
                            }
                            if (c0881AGi != null) {
                                for (F8M f8m2 : c0881AGi) {
                                    this.A04 = this.A04.A04(AnonymousClass006.A10(f8m2.A01, f8m2.A00));
                                }
                            }
                        }
                    }
                }
                pair = new Pair<>(Boolean.valueOf(AnonymousClass006.A1Z(this.A04, f9x)), arrayListA0h);
            }
            return pair;
        } finally {
            this.A0S = false;
        }
    }

    public static FDW A01(F9b f9b, List list) {
        FDW fdw = f9b.A0Q;
        return !list.isEmpty() ? FAH.A00(null, new C7660F9d(list), fdw) : fdw;
    }

    public static void A02(F9b f9b) {
        synchronized (f9b.A0N) {
            if (!f9b.A0B) {
                f9b.A0A = true;
                return;
            }
            Handler handler = A0U;
            Runnable runnable = f9b.A0O;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FBB;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;LX/FAX;)LX/FAc; */
    public final C7684FAc A03(FBB fbb, FAX fax, Map map) {
        F9X f9x = this.A04;
        C7384Etj.A0Y(map, 0);
        if (!map.isEmpty() || !f9x.A05.isEmpty()) {
            f9x = new F9X(f9x.A00, f9x.A09, f9x.A06, f9x.A0A, map, f9x.A04, f9x.A03, f9x.A07, f9x.A08, f9x.A02, f9x.A01);
        }
        this.A04 = f9x;
        this.A02 = new C3094By7(fbb.A00);
        this.A09 = BV4.A0q(fbb);
        this.A03 = fax;
        Pair<Boolean, List<Pair<FAW, FAS>>> pairA00 = A00(Collections.singletonList(this.A0T));
        this.A0T = null;
        Map<String, InterfaceC7700FAy<Object>> mapA06 = FBA.A06(fbb);
        HashMap mapA0v = BV4.A0v(mapA06.size());
        Iterator itA0n = AnonymousClass002.A0n(mapA06);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            FAO faoAKk = ((InterfaceC7700FAy) entryA0l.getValue()).AKk(this);
            mapA0v.put(entryA0l.getKey(), faoAKk != null ? faoAKk.A00 : null);
            if (faoAKk != null) {
                this.A02.A01(faoAKk.A01);
            }
        }
        F9X f9xA00 = this.A04;
        if (!mapA0v.isEmpty()) {
            f9xA00 = F9X.A00(f9xA00, AbstractC7609F5w.A0z(f9xA00.A02, mapA0v));
        }
        this.A04 = f9xA00;
        if (!((List) pairA00.second).isEmpty()) {
            this.A0Q = A01(this, (List) pairA00.second);
        }
        if (FBA.A0A(fbb)) {
            this.A05 = new F8I();
            FDW fdw = this.A0Q;
            F8I f8i = this.A05;
            C7384Etj.A0Y(fdw, 0);
            C7384Etj.A0Y(f8i, 1);
            C7769FDy<Integer> c7769FDy = AbstractC7752FDe.A01;
            Integer numA01 = c7769FDy.A01();
            try {
                c7769FDy.A02(BV4.A0X());
                FDW fdwA00 = FAH.A00(null, new F83(f8i, fdw), fdw);
                C7384Etj.A0U(fdwA00);
                c7769FDy.A02(numA01);
                this.A0Q = fdwA00;
            } catch (Throwable th) {
                c7769FDy.A02(numA01);
                throw th;
            }
        }
        synchronized (this.A0N) {
            this.A0B = true;
            if (this.A0A) {
                A02(this);
            }
        }
        return new C7684FAc(this.A04, this.A07, this.A0Q);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            r5 = this;
            boolean r0 = r5.A0R
            if (r0 != 0) goto L8c
            java.lang.String r0 = "Tree operations are only supported from the UI Thread"
            X.AbstractC8162FXe.A02(r0)
            X.F9m r0 = r5.A0D
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.A00
            boolean r0 = r2.isEmpty()
            r4 = 0
            if (r0 != 0) goto L24
            X.F9X r1 = r5.A04
            X.F9X r0 = r1.A04(r2)
            r5.A04 = r0
            r2.clear()
            X.F9X r0 = r5.A04
            r3 = 1
            if (r1 != r0) goto L25
        L24:
            r3 = 0
        L25:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.A0M
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L44
            X.F9X r1 = r5.A04
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L3f
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.A02
            java.util.HashMap r0 = X.AbstractC7609F5w.A0z(r0, r2)
            X.F9X r1 = X.F9X.A00(r1, r0)
        L3f:
            r5.A04 = r1
            r2.clear()
        L44:
            java.util.List<com.instagram.common.bloks.BloksParseResult> r1 = r5.A0L
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L67
            java.util.ArrayList r0 = X.BV4.A0t(r1)
            r1.clear()
            android.util.Pair r2 = r5.A00(r0)
            java.lang.Object r0 = r2.first
            boolean r0 = X.AnonymousClass001.A1X(r0)
            r3 = r3 | r0
            java.util.List<android.util.Pair<X.FAW, X.FAS>> r1 = r5.A0K
            java.lang.Object r0 = r2.second
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
        L67:
            java.util.List<android.util.Pair<X.FAW, X.FAS>> r2 = r5.A0K
            X.FDW r1 = A01(r5, r2)
            X.FDW r0 = r5.A0Q
            if (r0 == r1) goto L72
            r4 = 1
        L72:
            r3 = r3 | r4
            r5.A0Q = r1
            r2.clear()
            X.FAX r4 = r5.A03
            if (r4 == 0) goto L8c
            if (r3 == 0) goto L8c
            X.FDW r3 = r5.A0Q
            X.F9X r2 = r5.A04
            X.F9s r1 = r5.A07
            X.FAc r0 = new X.FAc
            r0.<init>(r2, r1, r3)
            r4.AUM(r0)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F9b.A05():void");
    }

    public final void A06(BloksParseResult bloksParseResult, Map<String, Object> map) {
        AbstractC8162FXe.A02("Tree operations are only supported from the UI Thread");
        this.A0K.addAll((Collection) A00(Collections.singletonList(bloksParseResult)).second);
        HashMap mapA0u = BV4.A0u();
        mapA0u.putAll(this.A04.A0A);
        if (map != null) {
            mapA0u.putAll(map);
        }
        if (mapA0u.isEmpty()) {
            return;
        }
        this.A04 = this.A04.A04(mapA0u);
        this.A0E.A00.Agi(mapA0u);
    }

    public final void A07(AbstractC7629F7m abstractC7629F7m) {
        F8M f8m;
        C7662F9f c7662F9f;
        if (this.A0R) {
            return;
        }
        AbstractC8162FXe.A02("Tree operations are only supported from the UI Thread");
        boolean z = abstractC7629F7m instanceof F8M;
        if (!z) {
            if (abstractC7629F7m instanceof C7662F9f) {
                c7662F9f = (C7662F9f) abstractC7629F7m;
                if (c7662F9f != null) {
                }
            } else {
                if (!(abstractC7629F7m instanceof C7661F9e)) {
                    throw C3cG.A0q();
                }
                C7661F9e c7661F9e = (C7661F9e) abstractC7629F7m;
                c7662F9f = new C7662F9f(c7661F9e.A02, c7661F9e.A00);
            }
            AbstractC7692FAm.A02.incrementAndGet();
            this.A0M.put(c7662F9f.A01, c7662F9f.A00);
        }
        if (z) {
            f8m = (F8M) abstractC7629F7m;
            if (f8m == null) {
                return;
            }
        } else {
            if (abstractC7629F7m instanceof C7662F9f) {
                return;
            }
            if (!(abstractC7629F7m instanceof C7661F9e)) {
                throw C3cG.A0q();
            }
            C7661F9e c7661F9e2 = (C7661F9e) abstractC7629F7m;
            f8m = new F8M(c7661F9e2.A03, c7661F9e2.A01);
        }
        AbstractC7692FAm.A06.incrementAndGet();
        C7668F9m c7668F9m = this.A0D;
        c7668F9m.A00.put(f8m.A01, f8m.A00);
        A02(this);
    }

    public final void A08(FAW faw, FAS<?> fas) {
        if (this.A0R) {
            return;
        }
        AbstractC8162FXe.A02("Tree operations are only supported from the UI Thread");
        this.A0K.add(new Pair<>(faw, fas));
    }

    @Override // X.FB4
    public final void AAj(final Object obj, final Object obj2, final String str, final String str2) {
        Runnable runnable = new Runnable() { // from class: X.F9j
            public static final String __redex_internal_original_name = "BloksTreeManager$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                F9b f9b = this.A00;
                String str3 = str;
                f9b.A07(new C7661F9e(obj, obj2, str3, str2));
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A0U.post(runnable);
        }
    }

    public F9b(BloksParseResult bloksParseResult, F9N f9n) {
        C7670F9o c7670F9o = new C7670F9o(this);
        this.A0F = c7670F9o;
        this.A0E = new C7671F9p(this, c7670F9o);
        this.A0C = new FAV(this);
        this.A0K = C3cG.A0h();
        this.A0D = new C7668F9m();
        this.A0M = BV4.A0u();
        this.A0L = C3cG.A0h();
        this.A0H = C3cG.A0h();
        this.A0I = C3cG.A0h();
        this.A0J = C3cG.A0h();
        this.A09 = BV4.A0q(null);
        this.A0O = new RunnableC7667F9l(this);
        this.A0B = false;
        this.A0A = false;
        this.A0S = false;
        this.A0N = C3cG.A0T();
        this.A0Q = bloksParseResult.A02;
        this.A0T = bloksParseResult;
        this.A0G = f9n;
    }

    public final F6v A04() {
        if (AbstractC8162FXe.A03()) {
            return this.A06;
        }
        throw BV4.A0c("Expanded Variables can only be accessed from the UI Thread");
    }
}
