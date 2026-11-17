package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class BSD implements View.OnAttachStateChangeListener {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public BSD(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.BUj] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.$t == 0) {
            AbstractC1718Ap2 abstractC1718Ap2 = (AbstractC1718Ap2) this.A01;
            C1HY c1hyA00 = AbstractC1720Ap8.A00(abstractC1718Ap2);
            if (c1hyA00 == null) {
                throw C3cG.A0Q(AnonymousClass001.A0v(" has no ViewTreeLifecycleOwner", C3cG.A0f(abstractC1718Ap2, "View tree for ")));
            }
            ((C10543Hqv) this.A00).element = BDZ.A00(abstractC1718Ap2, c1hyA00.getLifecycle());
            abstractC1718Ap2.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.$t != 0) {
            ((View) this.A01).removeOnAttachStateChangeListener(this);
            ((BBH) this.A00).A0b();
        }
    }
}
