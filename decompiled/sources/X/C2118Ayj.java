package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.Ayj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2118Ayj extends ThreadLocal<C78T> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ C78T initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw C3cG.A0Q("no Looper on this thread");
        }
        C2119Ayk c2119Ayk = new C2119Ayk(Handler.createAsync(looperMyLooper), choreographer);
        return C78W.A02(c2119Ayk, c2119Ayk.A06);
    }
}
