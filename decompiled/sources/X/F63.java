package X;

import com.facebook.aura.R;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;

/* loaded from: classes6.dex */
public final class F63 implements Runnable {
    public static final String __redex_internal_original_name = "BloksTimer$1";
    public final /* synthetic */ F62 A00;

    public F63(F62 f62) {
        this.A00 = f62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F62 f62 = this.A00;
        F6C f6c = f62.A04;
        WeakReference<FBB> weakReference = f6c.A03;
        FBB fbb = weakReference.get();
        if (fbb != null) {
            HsM hsM = f6c.A01;
            C9115Fyg c9115FygA00 = C9115Fyg.A00();
            c9115FygA00.A06(f6c.A02, 0);
            AbstractC7691FAk.A00(f6c.A00, C9115Fyg.A03(c9115FygA00, fbb, 1), hsM);
        }
        if (f62.A06) {
            if (f62.A00 || f62.A01) {
                return;
            }
            f62.A03.postDelayed(this, f62.A02);
            return;
        }
        FBB fbb2 = weakReference.get();
        if (fbb2 != null) {
            ((AbstractMap) fbb2.A03(R.id.bk_context_key_timers)).remove(f6c.A02);
        }
    }
}
