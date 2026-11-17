package X;

import com.facebook.payments.dcp.xapp.controller.scope.BillingScope$special$$inlined$CoroutineExceptionHandler$1;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.78U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78U implements Closeable {
    public boolean A00;
    public boolean A01;
    public final C7516Eyi A02;
    public final C78T A03;
    public final Object A04;
    public final List<Function0<Unit>> A05;
    public final C78T A06;
    public final C27a A07;
    public final CoroutineExceptionHandler A08;
    public final C3UX A09;
    public final C3UX A0A;

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0V<-LX/3UX;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;)V */
    public final void A04(G0U g0u, G0V g0v, Function0 function0) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        C10533Hqc c10533HqcA00 = A00(this, C79.A00, new C05413bn(g0u, g0v, atomicBoolean2, atomicBoolean, null, 1));
        if (c10533HqcA00 == null) {
            function0.invoke();
        } else {
            c10533HqcA00.AO5(new C8185FYc(atomicBoolean2, g0u, function0, atomicBoolean, 27));
        }
    }

    public static final C10533Hqc A00(C78U c78u, Integer num, G0V g0v) {
        C10533Hqc c10533HqcA02;
        synchronized (c78u.A04) {
            if (c78u.A00) {
                c10533HqcA02 = null;
            } else {
                c10533HqcA02 = GAo.A02(num, c78u.A08, g0v, c78u.A0A);
            }
        }
        return c10533HqcA02;
    }

    public final HoC A02(G0V<? super C3UX, ? super HtJ<? super Unit>, ? extends Object> g0v) {
        C10533Hqc c10533HqcA00 = A00(this, C79.A00, g0v);
        if (c10533HqcA00 != null) {
            return c10533HqcA00;
        }
        C9250GBd c9250GBd = new C9250GBd(null);
        c9250GBd.A5w(null);
        return c9250GBd;
    }

    public final void A03(Function0<Unit> function0) {
        Integer num;
        synchronized (this.A04) {
            if (this.A01) {
                num = C79.A0C;
            } else if (this.A00) {
                num = C79.A01;
            } else {
                this.A05.add(function0);
                num = C79.A00;
            }
        }
        int iIntValue = num.intValue();
        if (iIntValue == 2) {
            CFK.A04("BillingScope", AnonymousClass007.A0a("Rejected close-hook registration from a running hook: ", function0));
        } else if (iIntValue == 1) {
            A01(function0);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/G0V<-LX/3UX;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;)LX/HoC; */
    public final void A05(G0V g0v) {
        AnonymousClass001.A1I(this.A08, g0v, this.A09);
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A04) {
            z = this.A00;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.A04;
        synchronized (obj) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            this.A01 = true;
            List<Function0<Unit>> list = this.A05;
            List listA0X = AbstractC0878AGe.A0X(list);
            list.clear();
            Iterator it = listA0X.iterator();
            while (it.hasNext()) {
                A01((Function0) it.next());
            }
            synchronized (obj) {
                this.A01 = false;
            }
            this.A07.A5w(null);
        }
    }

    public C78U(C7516Eyi c7516Eyi) {
        this.A02 = c7516Eyi;
        C8eO c8eO = new C8eO(null);
        this.A07 = c8eO;
        C78T c78tAEA = C78W.A05(new C8eO(null), AbstractC9266GBt.A00).AEA();
        GQE gqe = HoC.A00;
        C78T c78tMinusKey = c78tAEA.minusKey(gqe);
        this.A06 = c78tMinusKey;
        HzC hzCA05 = C78W.A05(new C8eO(null), ((B8t) AbstractC7429Evm.A00).A01);
        this.A09 = hzCA05;
        this.A04 = C3cG.A0T();
        this.A05 = C3cG.A0h();
        BillingScope$special$$inlined$CoroutineExceptionHandler$1 billingScope$special$$inlined$CoroutineExceptionHandler$1 = new BillingScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
        this.A08 = billingScope$special$$inlined$CoroutineExceptionHandler$1;
        this.A0A = Hxb.A02(c78tMinusKey.plus(c8eO).plus(billingScope$special$$inlined$CoroutineExceptionHandler$1));
        this.A03 = hzCA05.AEA().minusKey(gqe);
    }

    public static final void A01(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            try {
                CFK.A08("BillingScope", "Close handler failed", th);
            } catch (Throwable th2) {
                C3cG.A0s(th2);
            }
        }
    }
}
