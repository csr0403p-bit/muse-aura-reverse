package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.FaH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8241FaH implements InterfaceC8323Fbp {
    public final /* synthetic */ ViewOnKeyListenerC8233Fa9 A00;

    public C8241FaH(ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9) {
        this.A00 = viewOnKeyListenerC8233Fa9;
    }

    @Override // X.InterfaceC8323Fbp
    public final void ATi(MenuItem menuItem, C8249FaR c8249FaR) {
        ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9 = this.A00;
        Handler handler = viewOnKeyListenerC8233Fa9.A0I;
        handler.removeCallbacksAndMessages(null);
        List<C8319Fbl> list = viewOnKeyListenerC8233Fa9.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (c8249FaR == list.get(i).A01) {
                if (i != -1) {
                    int i2 = i + 1;
                    handler.postAtTime(new RunnableC8246FaO(menuItem, this, i2 < list.size() ? list.get(i2) : null, c8249FaR), c8249FaR, SystemClock.uptimeMillis() + 200);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC8323Fbp
    public final void ATj(MenuItem menuItem, C8249FaR c8249FaR) {
        this.A00.A0I.removeCallbacksAndMessages(c8249FaR);
    }
}
