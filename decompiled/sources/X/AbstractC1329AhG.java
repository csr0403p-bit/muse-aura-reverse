package X;

import android.view.View;

/* renamed from: X.AhG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1329AhG {
    public static final View A00(C1Z3 c1z3) {
        if (((AbstractC1439Aj8) c1z3).node.isAttached) {
            return (View) AbstractC1333AhK.A00(AbstractC1414Aij.A04(c1z3));
        }
        ASP.A01("Cannot get View because the Modifier node is not currently attached.");
        throw F60.createAndThrow();
    }
}
