package X;

import android.os.Handler;
import com.facebook.aura.R;
import java.util.AbstractMap;

/* loaded from: classes6.dex */
public final class F62 {
    public final long A02;
    public final F6C A04;
    public final boolean A06;
    public final Handler A03 = C60O.A02();
    public boolean A00 = false;
    public boolean A01 = true;
    public final Runnable A05 = new F63(this);

    public final void A00() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        F6C f6c = this.A04;
        FBB fbb = f6c.A03.get();
        if (fbb != null) {
            ((AbstractMap) fbb.A03(R.id.bk_context_key_timers)).remove(f6c.A02);
        }
    }

    public F62(F6C f6c, long j, boolean z) {
        this.A02 = j;
        this.A06 = z;
        this.A04 = f6c;
    }
}
