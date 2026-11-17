package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public class GBL<T> extends GBN<T> implements Hm1<T>, GAu, GCR {
    public static final String __redex_internal_original_name = "CancellableContinuationImpl";
    public final HtJ<T> A00;
    public final C78T A01;
    public volatile /* synthetic */ int _decisionAndIndex$volatile;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(GBL.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(GBL.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(GBL.class, Object.class, "_parentHandle$volatile");

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/G6I;TR;ILX/G0W<-Ljava/lang/Throwable;-TR;-LX/78T;Lkotlin/Unit;>;Ljava/lang/Object;)Ljava/lang/Object; */
    public static final Object A00(Object obj, Object obj2, G0W g0w, G6I g6i, int i) {
        if ((obj instanceof C10474Hkl) || (!(i == 1 || i == 2 || obj2 != null) || (g0w == null && !(g6i instanceof HpO) && obj2 == null))) {
            return obj;
        }
        return new GBW(obj, obj2, null, g0w, g6i instanceof HpO ? (HpO) g6i : null);
    }

    private final HsS A01() {
        HoC hoC = (HoC) this.A01.get(HoC.A00);
        if (hoC == null) {
            return null;
        }
        HsS hsSA01 = HzS.A01(hoC, new GBU(this), true);
        AbstractC5217DdT.A00(this, null, hsSA01, A03);
        return hsSA01;
    }

    public static final HrH A02(Object obj, Object obj2, G0W g0w, GBL gbl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(gbl);
            if (obj3 instanceof G6I) {
                if (AbstractC5217DdT.A00(gbl, obj3, A00(obj, obj2, g0w, (G6I) obj3, ((GBN) gbl).A00), atomicReferenceFieldUpdater)) {
                    if (!A08(gbl)) {
                        gbl.A0H();
                    }
                }
            } else if (!(obj3 instanceof GBW) || obj2 == null || ((GBW) obj3).A00 != obj2) {
                return null;
            }
        }
        return AbstractC9270GBx.A00;
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(TR;ILX/G0W<-Ljava/lang/Throwable;-TR;-LX/78T;Lkotlin/Unit;>;)V */
    private final void A03(Object obj, G0W g0w, int i) throws DispatchException {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof G6I)) {
                if (obj2 instanceof C9260GBn) {
                    C10474Hkl c10474Hkl = (C10474Hkl) obj2;
                    if (C9260GBn.A00.compareAndSet(c10474Hkl, 0, 1)) {
                        if (g0w != null) {
                            A0K(obj, c10474Hkl.A00, g0w);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("Already resumed, but proposed with update ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
        } while (!AbstractC5217DdT.A00(this, obj2, A00(obj, null, g0w, (G6I) obj2, i), atomicReferenceFieldUpdater));
        if (!A08(this)) {
            A0H();
        }
        A06(this, i);
    }

    public static final void A04(Object obj, GBL gbl) {
        GBW gbw;
        boolean zA00;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(gbl);
            if (!(obj2 instanceof GC0)) {
                if (!(obj2 instanceof HpO) && !(obj2 instanceof GCK)) {
                    if (obj2 instanceof C10474Hkl) {
                        C10474Hkl c10474Hkl = (C10474Hkl) obj2;
                        if (C10474Hkl.A01.compareAndSet(c10474Hkl, 0, 1)) {
                            if (obj2 instanceof C9260GBn) {
                                Throwable th = c10474Hkl.A00;
                                if (obj instanceof HpO) {
                                    gbl.A0L(th, (HpO) obj);
                                    return;
                                } else {
                                    C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                    gbl.A07((GCK) obj);
                                    return;
                                }
                            }
                            return;
                        }
                    } else {
                        if (obj2 instanceof GBW) {
                            GBW gbw2 = (GBW) obj2;
                            if (gbw2.A04 == null) {
                                if (obj instanceof GCK) {
                                    return;
                                }
                                C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                                HpO hpO = (HpO) obj;
                                Throwable th2 = gbw2.A02;
                                if (th2 != null) {
                                    gbl.A0L(th2, hpO);
                                    return;
                                } else {
                                    gbw = new GBW(gbw2.A01, gbw2.A00, th2, gbw2.A03, hpO);
                                }
                            }
                        } else {
                            if (obj instanceof GCK) {
                                return;
                            }
                            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            gbw = new GBW(obj2, null, null, null, (HpO) obj);
                        }
                        zA00 = AbstractC5217DdT.A00(gbl, obj2, gbw, atomicReferenceFieldUpdater);
                    }
                }
                StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
                sb.append(obj);
                sb.append(", already has ");
                sb.append(obj2);
                throw new IllegalStateException(sb.toString());
            }
            zA00 = AbstractC5217DdT.A00(gbl, obj2, obj, atomicReferenceFieldUpdater);
        } while (!zA00);
    }

    public static final void A06(GBL gbl, int i) throws DispatchException {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(gbl);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                HtJ<T> htJA0E = gbl.A0E();
                boolean z = true;
                if (i != 4) {
                    z = false;
                    if (htJA0E instanceof GBJ) {
                        boolean z2 = true;
                        if (i != 1 && i != 2) {
                            z2 = false;
                        }
                        int i4 = ((GBN) gbl).A00;
                        boolean z3 = true;
                        if (i4 != 1 && i4 != 2) {
                            z3 = false;
                        }
                        if (z2 == z3) {
                            GBJ gbj = (GBJ) htJA0E;
                            GBK gbk = gbj.A03;
                            C78T context = gbj.A02.getContext();
                            if (GBI.A02(context, gbk)) {
                                GBI.A01(gbl, context, gbk);
                                return;
                            }
                            GB7 gb7A00 = AbstractC9246GAy.A00();
                            long j = gb7A00.A00;
                            if (j >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                                gb7A00.A03(gbl);
                                return;
                            }
                            gb7A00.A00 = j + LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES;
                            try {
                                A05(htJA0E, gbl, true);
                                do {
                                } while (gb7A00.A05());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                }
                A05(htJA0E, gbl, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(gbl, i2, 1073741824 + (536870911 & i2)));
    }

    private final void A07(GCK gck) {
        int i = A02.get(this) & 536870911;
        if (i == 536870911) {
            throw C3cG.A0Q("The index for Segment.onCancellation(..) is broken");
        }
        try {
            gck.A06(this.A01, i);
        } catch (Throwable th) {
            HwS.A00(this.A01, new CompletionHandlerException(AnonymousClass007.A0a("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    public static final boolean A08(GBL gbl) {
        if (((GBN) gbl).A00 == 2) {
            HtJ<T> htJ = gbl.A00;
            C7384Etj.A0Z(htJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (GBJ.A04.get(htJ) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.GBN
    public final Object A0B() {
        return A04.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GBN
    public final <T> T A0C(Object obj) {
        return obj instanceof GBW ? (T) ((GBW) obj).A01 : obj;
    }

    @Override // X.GBN
    public final HtJ<T> A0E() {
        return this.A00;
    }

    public final void A0H() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        HsS hsS = (HsS) atomicReferenceFieldUpdater.get(this);
        if (hsS != null) {
            hsS.dispose();
            atomicReferenceFieldUpdater.set(this, HsE.A00);
        }
    }

    public final void A0J() {
        HrH hrH;
        HtJ<T> htJ = this.A00;
        if (!(htJ instanceof GBJ) || htJ == null) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBJ.A04;
        do {
            Object obj = atomicReferenceFieldUpdater.get(htJ);
            hrH = GBI.A00;
            if (obj != hrH) {
                if (!(obj instanceof Throwable)) {
                    StringBuilder sb = new StringBuilder("Inconsistent state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
                if (!AbstractC5217DdT.A00(htJ, obj, null, atomicReferenceFieldUpdater)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Throwable th = (Throwable) obj;
                if (th != null) {
                    A0H();
                    A5x(th);
                    return;
                }
                return;
            }
        } while (!AbstractC5217DdT.A00(htJ, hrH, this, atomicReferenceFieldUpdater));
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(LX/G0W<-Ljava/lang/Throwable;-TR;-LX/78T;Lkotlin/Unit;>;Ljava/lang/Throwable;TR;)V */
    public final void A0K(Object obj, Throwable th, G0W g0w) {
        try {
            g0w.invoke(th, obj, this.A01);
        } catch (Throwable th2) {
            HwS.A00(this.A01, new CompletionHandlerException(AnonymousClass007.A0a("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // X.Hm1
    public final boolean A5x(Throwable th) throws DispatchException {
        Object obj;
        boolean z;
        boolean z2;
        Throwable cancellationException;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof G6I)) {
                return false;
            }
            z = obj instanceof HpO;
            z2 = z || (obj instanceof GCK);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C9260GBn.A00;
            cancellationException = th;
            if (th == null) {
                StringBuilder sb = new StringBuilder("Continuation ");
                sb.append(this);
                sb.append(" was cancelled normally");
                cancellationException = new CancellationException(sb.toString());
            }
        } while (!AbstractC5217DdT.A00(this, obj, new C9260GBn(cancellationException, z2), atomicReferenceFieldUpdater));
        if (z) {
            A0L(th, (HpO) obj);
        } else if (obj instanceof GCK) {
            A07((GCK) obj);
        }
        if (!A08(this)) {
            A0H();
        }
        A06(this, ((GBN) this).A00);
        return true;
    }

    @Override // X.Hm1
    public final void A6g() throws DispatchException {
        A06(this, ((GBN) this).A00);
    }

    @Override // X.Hm1
    public final void AO2(G0U<? super Throwable, Unit> g0u) {
        GBO.A01(new C10463Hjp(g0u), this);
    }

    @Override // X.GCR
    public final void AO3(GCK<?> gck, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A04(gck, this);
    }

    @Override // X.Hm1
    public final <R extends T> void Abe(R r, G0W<? super Throwable, ? super R, ? super C78T, Unit> g0w) throws DispatchException {
        A03(r, g0w, ((GBN) this).A00);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;)V */
    @Override // X.Hm1
    public final void Abf(G0U g0u, Object obj) throws DispatchException {
        A03(obj, g0u != null ? new GY7(g0u, 0) : null, ((GBN) this).A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GBK;TT;)V */
    @Override // X.Hm1
    public final void Abi(Object obj, GBK gbk) throws DispatchException {
        GBJ gbj;
        HtJ<T> htJ = this.A00;
        GBK gbk2 = null;
        if ((htJ instanceof GBJ) && (gbj = (GBJ) htJ) != null) {
            gbk2 = gbj.A03;
        }
        A03(obj, null, gbk2 == gbk ? 4 : ((GBN) this).A00);
    }

    @Override // X.GAu
    public final GAu getCallerFrame() {
        HtJ<T> htJ = this.A00;
        if (htJ instanceof GAu) {
            return (GAu) htJ;
        }
        return null;
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return this.A01;
    }

    @Override // X.Hm1
    public final boolean isActive() {
        return A04.get(this) instanceof G6I;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/HtJ<-TT;>;I)V */
    public GBL(int i, HtJ htJ) {
        ((GBN) this).A00 = i;
        this.A00 = htJ;
        this.A01 = htJ.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = GC0.A00;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/GBN<-TT;>;LX/HtJ<-TT;>;Z)V */
    public static final void A05(HtJ htJ, GBN gbn, boolean z) {
        Object objA0B = gbn.A0B();
        Throwable thA0D = gbn.A0D(objA0B);
        Object c10571Hud = thA0D != null ? new C10571Hud(thA0D) : gbn.A0C(objA0B);
        if (!z) {
            htJ.resumeWith(c10571Hud);
            return;
        }
        C7384Etj.A0Z(htJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        GBJ gbj = (GBJ) htJ;
        HtJ<T> htJ2 = gbj.A02;
        Object obj = gbj.A01;
        C78T context = htJ2.getContext();
        Object objA00 = GCA.A00(obj, context);
        GAp gApA03 = objA00 != GCA.A00 ? GAr.A03(objA00, htJ2, context) : null;
        try {
            htJ2.resumeWith(c10571Hud);
        } finally {
            if (gApA03 == null || gApA03.A0Y()) {
                GCA.A02(objA00, context);
            }
        }
    }

    @Override // X.GBN
    public final Throwable A0D(Object obj) {
        Throwable thA0D = super.A0D(obj);
        if (thA0D == null) {
            return null;
        }
        return thA0D;
    }

    public final Object A0F() {
        int i;
        HoC hoC;
        boolean zA08 = A08(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zA08) {
                    A0J();
                }
                Object obj = A04.get(this);
                if (obj instanceof C10474Hkl) {
                    throw ((C10474Hkl) obj).A00;
                }
                int i3 = ((GBN) this).A00;
                if ((i3 != 1 && i3 != 2) || (hoC = (HoC) this.A01.get(HoC.A00)) == null || hoC.isActive()) {
                    return A0C(obj);
                }
                CancellationException cancellationExceptionADQ = hoC.ADQ();
                A09(cancellationExceptionADQ);
                throw cancellationExceptionADQ;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (A03.get(this) == null) {
            A01();
        }
        if (zA08) {
            A0J();
        }
        return EnumC10460Hji.A02;
    }

    public Throwable A0G(HoC hoC) {
        return hoC.ADQ();
    }

    public final void A0I() {
        HsS hsSA01 = A01();
        if (hsSA01 == null || !(!(A04.get(this) instanceof G6I))) {
            return;
        }
        hsSA01.dispose();
        A03.set(this, HsE.A00);
    }

    public final void A0L(Throwable th, HpO hpO) {
        try {
            hpO.invoke(th);
        } catch (Throwable th2) {
            HwS.A00(this.A01, new CompletionHandlerException(AnonymousClass007.A0a("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    @Override // X.Hm1
    public final <R extends T> Object AhY(R r, Object obj, G0W<? super Throwable, ? super R, ? super C78T, Unit> g0w) {
        return A02(r, obj, g0w, this);
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            obj = new C10474Hkl(thA00, false);
        }
        A03(obj, null, ((GBN) this).A00);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this instanceof C9247GBa ? "AwaitContinuation" : "CancellableContinuation");
        sbA0w.append('(');
        sbA0w.append(AbstractC10504Hnh.A00(this.A00));
        sbA0w.append("){");
        Object obj = A04.get(this);
        sbA0w.append(obj instanceof G6I ? "Active" : obj instanceof C9260GBn ? "Cancelled" : "Completed");
        sbA0w.append("}@");
        AbstractC7609F5w.A1K(sbA0w, this);
        return sbA0w.toString();
    }
}
