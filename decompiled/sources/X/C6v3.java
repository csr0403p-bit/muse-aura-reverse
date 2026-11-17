package X;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.6v3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class C6v3 {
    public static final C05663ul A01(Function0 function0) {
        return new C05663ul(new C07318ik(null, null, function0));
    }

    public static final MutableState A00(BFM bfm, Object obj, C78T c78t, C20Q c20q, int i) {
        if ((i & 2) != 0) {
            c78t = C6ys.A00;
        }
        boolean zA1M = AnonymousClass003.A1M(bfm, c78t, c20q);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new C07268if((Object) c78t, (Activity) c20q, (C79e) null, (HtJ<? super C07268if>) 2);
            bfm.Ai0(objAaT);
        }
        return C3UV.A00(bfm, obj, c20q, c78t, (G0V) objAaT);
    }
}
