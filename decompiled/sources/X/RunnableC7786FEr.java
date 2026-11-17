package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FEr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7786FEr implements Runnable {
    public static final String __redex_internal_original_name = "AccessibilityUtils$postFocusOrder$1";
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ FDW A01;
    public final /* synthetic */ List<Object> A02;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+Ljava/lang/Object;>;LX/FDW;LX/FBB;)V */
    public RunnableC7786FEr(FBB fbb, FDW fdw, List list) {
        this.A02 = list;
        this.A01 = fdw;
        this.A00 = fbb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<Object> it = this.A02.iterator();
        int id = -1;
        while (it.hasNext()) {
            Object next = it.next();
            FDW fdw = this.A01;
            FB7 fb7 = new FB7(new F6N(next == null ? null : next instanceof String ? (String) next : next.toString()));
            FB5.A00(fdw, fb7, 0);
            FDW fdw2 = fb7.A00;
            if (fdw2 == null) {
                FFI.A01(this.A00, AnonymousClass001.A0v(" not found in hierarchy.", C3cG.A0f(next, "Component with server id: ")), null);
            } else {
                View viewA09 = fdw2.A09(this.A00);
                if (viewA09 != null) {
                    new I0D(0).A02(viewA09, true);
                    if (viewA09.getId() == -1) {
                        viewA09.setId(View.generateViewId());
                    }
                    if (id != -1) {
                        viewA09.setAccessibilityTraversalAfter(id);
                    }
                    id = viewA09.getId();
                }
            }
        }
    }
}
