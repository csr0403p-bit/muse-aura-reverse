package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AjA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1441AjA {
    public static final <T extends AbstractC1439Aj8 & InterfaceC1451AjK> void A00(T t, Function0<Unit> function0) {
        C1446AjF c1446AjF = t.ownerScope;
        if (c1446AjF == null) {
            c1446AjF = new C1446AjF(t);
            t.ownerScope = c1446AjF;
        }
        C1481Ajo c1481Ajo = ((AndroidComposeView) AbstractC1414Aij.A07(t)).A0q;
        c1481Ajo.A00.A03(c1446AjF, function0, C1446AjF.A01);
    }
}
