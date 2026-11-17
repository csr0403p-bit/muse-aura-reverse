package X;

import android.window.OnBackInvokedDispatcher;
import java.util.Set;

/* renamed from: X.B9f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2186B9f {
    public boolean A00;
    public final B9n A01;
    public final C2183B9b A02;
    public final Runnable A03;

    public final void A01(AbstractC2185B9e abstractC2185B9e, C1HY c1hy) {
        C7384Etj.A0Y(abstractC2185B9e, 1);
        F2N lifecycle = c1hy.getLifecycle();
        if (((C5303Dfm) lifecycle).A01 != EnumC10573Huf.A03) {
            B9Y b9y = new B9Y(abstractC2185B9e, new C2188B9i(abstractC2185B9e, c1hy));
            abstractC2185B9e.A01.add(b9y);
            b9y.A02(false);
            C2183B9b.A00(this.A02, b9y);
            C2187B9g c2187B9g = new C2187B9g(abstractC2185B9e, this, lifecycle, b9y);
            lifecycle.A04(c2187B9g);
            abstractC2185B9e.A02.add(c2187B9g);
        }
    }

    public final void A00(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C2183B9b c2183B9b = this.A02;
        B9q b9q = new B9q(onBackInvokedDispatcher);
        Set<AbstractC2184B9c> set = c2183B9b.A03;
        if (set.add(b9q)) {
            c2183B9b.A00.A02(c2183B9b, b9q, 1);
        }
        B9p b9p = new B9p(onBackInvokedDispatcher);
        if (set.add(b9p)) {
            c2183B9b.A00.A02(c2183B9b, b9p, 0);
        }
    }

    public C2186B9f(Runnable runnable) {
        this.A03 = runnable;
        C2183B9b c2183B9b = new C2183B9b(new B9o(this));
        this.A02 = c2183B9b;
        B9n b9n = new B9n(this);
        this.A01 = b9n;
        c2183B9b.A02(b9n);
    }

    public C2186B9f() {
        this(null);
    }
}
