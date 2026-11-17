package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FQ8 implements View.OnAttachStateChangeListener {
    public FQG A00;
    public final View A01;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        FQG fqg = this.A00;
        if (fqg != null) {
            FQ1 fq1 = fqg.A00;
            if (fq1.A01) {
                return;
            }
            fq1.A01 = true;
            fq1.A04.post(fq1.A0A);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FQG fqg = this.A00;
        if (fqg != null) {
            fqg.A00.A00();
        }
    }

    public FQ8() {
    }

    public FQ8(View view) {
        this.A01 = view;
        view.addOnAttachStateChangeListener(this);
    }
}
