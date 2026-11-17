package X;

import android.view.TouchDelegate;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;

/* renamed from: X.FJk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7891FJk implements Runnable {
    public static final String __redex_internal_original_name = "Touch_expansionKt$setupTouchDelegates$1";
    public final /* synthetic */ FHQ A00;
    public final /* synthetic */ List<FJn> A01;

    public RunnableC7891FJk(FHQ fhq, List<FJn> list) {
        this.A00 = fhq;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.A00;
        while ((parent instanceof ViewGroup) && !(parent instanceof FGJ)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
            if (touchDelegate instanceof C7892FJl) {
                ((C7892FJl) touchDelegate).A00(this.A01);
            } else if (touchDelegate == null) {
                viewGroup.setTouchDelegate(new C7892FJl(viewGroup, this.A01));
            }
            parent = viewGroup.getParent();
        }
    }
}
