package X;

import android.view.ViewParent;

/* loaded from: classes6.dex */
public final class FYX implements Runnable {
    public static final String __redex_internal_original_name = "ForwardingListener$DisallowIntercept";
    public final /* synthetic */ FYM A00;

    public FYX(FYM fym) {
        this.A00 = fym;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
