package X;

import android.view.KeyEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FPE implements View.OnKeyListener {
    public final /* synthetic */ C7983FOa A00;

    public FPE(C7983FOa c7983FOa) {
        this.A00 = c7983FOa;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        Function0<Unit> function0 = this.A00.A03;
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }
}
