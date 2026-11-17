package X;

import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes4.dex */
public final class A6L implements AutoCloseable, Dg3 {
    public boolean A00;
    public final A6N A01;
    public final String A02;

    public final void A00(F2N f2n, SavedStateRegistry savedStateRegistry) {
        if (this.A00) {
            throw C3cG.A0Q("Already attached to lifecycleOwner");
        }
        this.A00 = true;
        f2n.A04(this);
        savedStateRegistry.A03(this.A01.A00.A00, this.A02);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public A6L(A6N a6n, String str) {
        this.A02 = str;
        this.A01 = a6n;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        boolean zA1b = AnonymousClass004.A1b(c1hy, enumC3085Bxl);
        if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
            this.A00 = zA1b;
            c1hy.getLifecycle().A05(this);
        }
    }
}
