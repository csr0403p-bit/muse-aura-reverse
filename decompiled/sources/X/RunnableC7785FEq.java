package X;

import android.view.View;
import java.util.Arrays;

/* renamed from: X.FEq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7785FEq implements Runnable {
    public static final String __redex_internal_original_name = "AccessibilityUtils$setLabelFor$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ Object A02;

    public RunnableC7785FEq(View view, FBB fbb, Object obj) {
        this.A02 = obj;
        this.A01 = fbb;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strA0M;
        Object obj = this.A02;
        String string = obj instanceof String ? (String) obj : obj.toString();
        FBB fbb = this.A01;
        FDW fdwA00 = FB6.A00(FBA.A03(fbb), new F6N(string));
        if (fdwA00 == null) {
            strA0M = String.format("Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work.", Arrays.copyOf(new Object[]{string}, 1));
        } else {
            View viewA09 = fdwA00.A09(fbb);
            if (viewA09 != null) {
                int id = viewA09.getId();
                if (id == -1) {
                    id = View.generateViewId();
                    viewA09.setId(id);
                }
                this.A00.setLabelFor(id);
                return;
            }
            strA0M = FGI.A0M("No View found for component with id: ", string);
        }
        FFI.A01(fbb, strA0M, null);
    }
}
