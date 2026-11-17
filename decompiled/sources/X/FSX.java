package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public final class FSX {
    public final C8072FSa A01;
    public final Map<String, FSW> A02 = BV4.A0u();
    public final Set<FSW> A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A00 = true;

    public final FSW A00() {
        FSW fsw = new FSW(this);
        Map<String, FSW> map = this.A02;
        String str = fsw.A08;
        if (map.containsKey(str)) {
            throw C60O.A0i("spring is already registered");
        }
        map.put(str, fsw);
        return fsw;
    }

    public final void A01(String str) {
        FSW fsw = this.A02.get(str);
        if (fsw == null) {
            throw C60Q.A0V("springId ", str, " does not reference a registered spring");
        }
        this.A03.add(fsw);
        if (this.A00) {
            this.A00 = false;
            C8072FSa c8072FSa = this.A01;
            if (c8072FSa.A02) {
                return;
            }
            c8072FSa.A02 = true;
            c8072FSa.A00 = SystemClock.uptimeMillis();
            Choreographer choreographer = c8072FSa.A04;
            Choreographer.FrameCallback frameCallback = c8072FSa.A03;
            choreographer.removeFrameCallback(frameCallback);
            choreographer.postFrameCallback(frameCallback);
        }
    }

    public FSX(C8072FSa c8072FSa) {
        this.A01 = c8072FSa;
        c8072FSa.A01 = this;
    }
}
