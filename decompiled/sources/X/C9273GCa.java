package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.GCa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9273GCa implements GCR, HpO {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(C9273GCa.class, Object.class, "state$volatile");
    public Object A00;
    public final C78T A04;
    public volatile /* synthetic */ Object state$volatile = AbstractC9282GCj.A05;
    public List<C9273GCa<R>.ClauseData> A02 = new ArrayList(2);
    public int A03 = -1;
    public Object A01 = AbstractC9282GCj.A01;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.Object r7, java.lang.Object r8, X.C9273GCa r9) {
        /*
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X.C9273GCa.A05
            java.lang.Object r3 = r4.get(r9)
            boolean r0 = r3 instanceof X.Hm1
            r6 = 2
            if (r0 == 0) goto L37
            X.GCf r5 = r9.A04(r7)
            if (r5 == 0) goto L0
            X.G0W r1 = r5.A05
            if (r1 == 0) goto L35
            java.lang.Object r0 = r5.A04
            java.lang.Object r2 = r1.invoke(r9, r0, r8)
            X.G0W r2 = (X.G0W) r2
        L1d:
            boolean r0 = X.AbstractC5217DdT.A00(r9, r3, r5, r4)
            if (r0 == 0) goto L0
            X.Hm1 r3 = (X.Hm1) r3
            r9.A01 = r8
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r0 = 0
            java.lang.Object r0 = r3.AhY(r1, r0, r2)
            if (r0 != 0) goto L6b
            X.HrH r0 = X.AbstractC9282GCj.A01
            r9.A01 = r0
        L34:
            return r6
        L35:
            r2 = 0
            goto L1d
        L37:
            X.HrH r0 = X.AbstractC9282GCj.A04
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 != 0) goto L77
            boolean r0 = r3 instanceof X.C9278GCf
            if (r0 != 0) goto L77
            X.HrH r0 = X.AbstractC9282GCj.A03
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 != 0) goto L34
            X.HrH r0 = X.AbstractC9282GCj.A05
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            r6 = 1
            if (r0 == 0) goto L5f
            java.util.List r0 = java.util.Collections.singletonList(r7)
        L58:
            boolean r0 = X.AbstractC5217DdT.A00(r9, r3, r0, r4)
            if (r0 == 0) goto L0
            return r6
        L5f:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L70
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0Q(r7, r0)
            goto L58
        L6b:
            r3.A6g()
            r6 = 0
            return r6
        L70:
            java.lang.String r0 = "Unexpected state: "
            java.lang.IllegalStateException r0 = X.AbstractC7607F5u.A10(r3, r0)
            throw r0
        L77:
            r6 = 3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9273GCa.A00(java.lang.Object, java.lang.Object, X.GCa):int");
    }

    private final Object A01(HtJ<? super R> htJ) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        Object obj = atomicReferenceFieldUpdater.get(this);
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C9278GCf c9278GCf = (C9278GCf) obj;
        Object obj2 = this.A01;
        List<C9273GCa<R>.ClauseData> list = this.A02;
        if (list != null) {
            Iterator<C9273GCa<R>.ClauseData> it = list.iterator();
            while (it.hasNext()) {
                C9278GCf c9278GCf2 = (C9278GCf) it.next();
                if (c9278GCf2 != c9278GCf) {
                    c9278GCf2.A00();
                }
            }
            atomicReferenceFieldUpdater.set(this, AbstractC9282GCj.A04);
            this.A01 = AbstractC9282GCj.A01;
            this.A02 = null;
        }
        G0W<Object, Object, Object, Object> g0w = c9278GCf.A06;
        Object obj3 = c9278GCf.A03;
        Object obj4 = c9278GCf.A04;
        Object objInvoke = g0w.invoke(obj3, obj4, obj2);
        Object obj5 = c9278GCf.A02;
        return obj4 == AbstractC9282GCj.A02 ? ((G0U) obj5).invoke(htJ) : ((G0V) obj5).invoke(objInvoke, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.HtJ r9, X.C9273GCa r10) throws kotlinx.coroutines.DispatchException {
        /*
            r3 = 12
            boolean r0 = r9 instanceof X.C8914FtW
            if (r0 == 0) goto Laa
            r6 = r9
            X.FtW r6 = (X.C8914FtW) r6
            int r0 = r6.$t
            if (r0 != r3) goto Laa
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r1 = r6.A01
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r5 = 2
            r8 = 1
            if (r0 == 0) goto L2a
            if (r0 == r8) goto L9e
            if (r0 != r5) goto Lb1
            X.Hwg.A00(r1)
        L29:
            return r1
        L2a:
            X.Hwg.A00(r1)
            r6.A00 = r8
            java.lang.String r0 = X.GBL.__redex_internal_original_name
            X.HtJ r0 = X.C7Bm.A02(r6)
            X.GBL r4 = new X.GBL
            r4.<init>(r8, r0)
            r4.A0I()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C9273GCa.A05
        L3f:
            java.lang.Object r9 = r3.get(r10)
            X.HrH r1 = X.AbstractC9282GCj.A05
            if (r9 != r1) goto L57
            boolean r0 = X.AbstractC5217DdT.A00(r10, r9, r4, r3)
            if (r0 == 0) goto L3f
            X.GBO.A01(r10, r4)
        L50:
            java.lang.Object r0 = r4.A0F()
            if (r0 != r7) goto La1
            return r7
        L57:
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L82
            boolean r0 = X.AbstractC5217DdT.A00(r10, r9, r1, r3)
            if (r0 == 0) goto L3f
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r2 = r9.iterator()
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r2.next()
            X.GCf r1 = r10.A04(r0)
            X.C7384Etj.A0X(r1)
            r0 = 0
            r1.A01 = r0
            r0 = -1
            r1.A00 = r0
            r10.A05(r1, r8)
            goto L67
        L82:
            boolean r0 = r9 instanceof X.C9278GCf
            if (r0 == 0) goto Lb9
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            X.GCf r9 = (X.C9278GCf) r9
            java.lang.Object r2 = r10.A01
            X.G0W r1 = r9.A05
            if (r1 == 0) goto L9c
            java.lang.Object r0 = r9.A04
            java.lang.Object r0 = r1.invoke(r10, r0, r2)
            X.G0W r0 = (X.G0W) r0
        L98:
            r4.Abe(r3, r0)
            goto L50
        L9c:
            r0 = 0
            goto L98
        L9e:
            X.Hwg.A00(r1)
        La1:
            r6.A00 = r5
            java.lang.Object r1 = r10.A01(r6)
            if (r1 != r7) goto L29
            return r7
        Laa:
            X.FtW r6 = new X.FtW
            r6.<init>(r10, r9, r3)
            goto L18
        Lb1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lb9:
            java.lang.String r1 = "unexpected state: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9273GCa.A02(X.HtJ, X.GCa):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/GCa<TR;>;LX/HtJ<-TR;>;)Ljava/lang/Object; */
    public static /* synthetic */ Object A03(HtJ htJ, C9273GCa c9273GCa) {
        return A05.get(c9273GCa) instanceof C9278GCf ? c9273GCa.A01(htJ) : A02(htJ, c9273GCa);
    }

    /* JADX WARN: Incorrect inner types in method signature: (Ljava/lang/Object;)LX/GCa<TR;>.ClauseData; */
    private final C9278GCf A04(Object obj) {
        List<C9273GCa<R>.ClauseData> list = this.A02;
        C9278GCf c9278GCf = null;
        if (list != null) {
            Iterator<C9273GCa<R>.ClauseData> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9278GCf next = it.next();
                if (next.A03 == obj) {
                    c9278GCf = next;
                    break;
                }
            }
            c9278GCf = c9278GCf;
            if (c9278GCf == null) {
                throw BV8.A0m(" is not found", C3cG.A0f(obj, "Clause with object "));
            }
        }
        return c9278GCf;
    }

    /* JADX WARN: Incorrect inner types in method signature: (LX/GCa<TR;>.ClauseData;Z)V */
    private final void A05(C9278GCf c9278GCf, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        if (atomicReferenceFieldUpdater.get(this) instanceof C9278GCf) {
            return;
        }
        if (!z) {
            Object obj = c9278GCf.A03;
            List<C9273GCa<R>.ClauseData> list = this.A02;
            C7384Etj.A0X(list);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C9273GCa<R>.ClauseData> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().A03 == obj) {
                        StringBuilder sb = new StringBuilder("Cannot use select clauses on the same object: ");
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
        }
        c9278GCf.A07.invoke(c9278GCf.A03, this, c9278GCf.A04);
        if (this.A01 != AbstractC9282GCj.A01) {
            atomicReferenceFieldUpdater.set(this, c9278GCf);
            return;
        }
        if (!z) {
            List<C9273GCa<R>.ClauseData> list2 = this.A02;
            C7384Etj.A0X(list2);
            list2.add(c9278GCf);
        }
        c9278GCf.A01 = this.A00;
        c9278GCf.A00 = this.A03;
        this.A00 = null;
        this.A03 = -1;
    }

    public final void A06(G0U g0u, C9283GCk c9283GCk) {
        A05(new C9278GCf(c9283GCk.A00, AbstractC9282GCj.A02, g0u, c9283GCk.A02, c9283GCk.A01, null, this), false);
    }

    public final void A07(G0V g0v, C9284GCl c9284GCl) {
        A05(new C9278GCf(c9284GCl.A00, null, g0v, c9284GCl.A03, c9284GCl.A02, c9284GCl.A01, this), false);
    }

    @Override // X.GCR
    public final void AO3(GCK<?> gck, int i) {
        this.A00 = gck;
        this.A03 = i;
    }

    @Override // X.HpO
    public final void invoke(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AbstractC9282GCj.A04) {
                return;
            }
        } while (!AbstractC5217DdT.A00(this, obj, AbstractC9282GCj.A03, atomicReferenceFieldUpdater));
        List<C9273GCa<R>.ClauseData> list = this.A02;
        if (list != null) {
            Iterator<C9273GCa<R>.ClauseData> it = list.iterator();
            while (it.hasNext()) {
                it.next().A00();
            }
            this.A01 = AbstractC9282GCj.A01;
            this.A02 = null;
        }
    }

    public C9273GCa(C78T c78t) {
        this.A04 = c78t;
    }
}
