package X;

import java.util.Map;

/* renamed from: X.Dfp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5306Dfp<T> {
    public static final Object A0A = C3cG.A0T();
    public int A00;
    public int A01;
    public boolean A02;
    public C5304Dfn<Bs1<? super T>, AbstractC5306Dfp<T>.ObserverWrapper> A03;
    public boolean A04;
    public boolean A05;
    public final Object A06;
    public final Runnable A07;
    public volatile Object A08;
    public volatile Object A09;

    public void A03() {
    }

    public void A04() {
    }

    /* JADX WARN: Incorrect inner types in method signature: (LX/Dfp<TT;>.ObserverWrapper;)V */
    private void A00(AbstractC5309Dfs abstractC5309Dfs) {
        if (abstractC5309Dfs.A01) {
            if ((abstractC5309Dfs instanceof C5308Dfr) && !C8j3.A0m(((C5308Dfr) abstractC5309Dfs).A00).A00(EnumC10573Huf.A06)) {
                abstractC5309Dfs.A00(false);
                return;
            }
            int i = abstractC5309Dfs.A00;
            int i2 = this.A01;
            if (i < i2) {
                abstractC5309Dfs.A00 = i2;
                abstractC5309Dfs.A02.onChanged((Object) this.A08);
            }
        }
    }

    public final T A02() {
        if (this instanceof C2955Bpt) {
            C2955Bpt c2955Bpt = (C2955Bpt) this;
            AbstractC5306Dfp<T> abstractC5306Dfp = c2955Bpt.A00;
            return abstractC5306Dfp == null ? c2955Bpt.A01 : abstractC5306Dfp.A02();
        }
        T t = (T) this.A08;
        if (t == A0A) {
            return null;
        }
        return t;
    }

    public void A05(C1HY c1hy, Bs1<? super T> bs1) {
        A01("observe");
        if (C8j3.A0m(c1hy) != EnumC10573Huf.A03) {
            AbstractC5306Dfp<T>.ObserverWrapper c5308Dfr = new C5308Dfr(c1hy, this, bs1);
            AbstractC5309Dfs abstractC5309DfsA02 = this.A03.A02(bs1, c5308Dfr);
            if (abstractC5309DfsA02 == null) {
                c1hy.getLifecycle().A04(c5308Dfr);
            } else if (!(abstractC5309DfsA02 instanceof C5308Dfr) || !AnonymousClass002.A1Z(((C5308Dfr) abstractC5309DfsA02).A00, c1hy)) {
                throw C60O.A0i("Cannot add the same observer with different lifecycles");
            }
        }
    }

    /* JADX WARN: Incorrect inner types in method signature: (LX/Dfp<TT;>.ObserverWrapper;)V */
    public final void A06(AbstractC5309Dfs abstractC5309Dfs) {
        if (this.A05) {
            this.A04 = true;
            return;
        }
        this.A05 = true;
        do {
            this.A04 = false;
            if (abstractC5309Dfs != null) {
                A00(abstractC5309Dfs);
                abstractC5309Dfs = null;
            } else {
                C5304Dfn<Bs1<? super T>, AbstractC5306Dfp<T>.ObserverWrapper> c5304Dfn = this.A03;
                C5311Dfu c5311Dfu = new C5311Dfu(c5304Dfn);
                c5304Dfn.A03.put(c5311Dfu, false);
                while (c5311Dfu.hasNext()) {
                    A00((AbstractC5309Dfs) ((Map.Entry) c5311Dfu.next()).getValue());
                    if (this.A04) {
                        break;
                    }
                }
            }
        } while (this.A04);
        this.A05 = false;
    }

    public void A07(Bs1<? super T> bs1) {
        A01("removeObserver");
        AbstractC5309Dfs abstractC5309DfsA01 = this.A03.A01(bs1);
        if (abstractC5309DfsA01 != null) {
            if (abstractC5309DfsA01 instanceof C5308Dfr) {
                C5308Dfr c5308Dfr = (C5308Dfr) abstractC5309DfsA01;
                c5308Dfr.A00.getLifecycle().A05(c5308Dfr);
            }
            abstractC5309DfsA01.A00(false);
        }
    }

    public final void A08(Bs1<? super T> bs1) {
        A01("observeForever");
        AbstractC5306Dfp<T>.ObserverWrapper c5312Dfv = new C5312Dfv(this, bs1);
        AbstractC5306Dfp<T>.ObserverWrapper observerWrapperA02 = this.A03.A02(bs1, c5312Dfv);
        if (observerWrapperA02 instanceof C5308Dfr) {
            throw C60O.A0i("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapperA02 == null) {
            c5312Dfv.A00(true);
        }
    }

    public final void A09(T t) {
        boolean zA1Z;
        synchronized (this.A06) {
            zA1Z = AnonymousClass002.A1Z(this.A09, A0A);
            this.A09 = t;
        }
        if (zA1Z) {
            Dg0.A00().A02(this.A07);
        }
    }

    public AbstractC5306Dfp(T t) {
        this.A06 = C3cG.A0T();
        this.A03 = new C5304Dfn<>();
        this.A00 = 0;
        this.A09 = A0A;
        this.A07 = new RunnableC5314Dfx(this);
        this.A08 = t;
        this.A01 = 0;
    }

    public static void A01(String str) {
        if (!Dg0.A00().A03()) {
            throw BV5.A0V("Cannot invoke ", str, " on a background thread");
        }
    }

    public final void A0A(T t) {
        A01("setValue");
        this.A01++;
        this.A08 = t;
        A06(null);
    }

    public AbstractC5306Dfp() {
        this.A06 = C3cG.A0T();
        this.A03 = new C5304Dfn<>();
        this.A00 = 0;
        Object obj = A0A;
        this.A09 = obj;
        this.A07 = new RunnableC5314Dfx(this);
        this.A08 = obj;
        this.A01 = -1;
    }
}
