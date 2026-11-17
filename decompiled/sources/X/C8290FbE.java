package X;

import android.view.Window;
import com.facebook.acra.util.minidump.MinidumpReader;

/* renamed from: X.FbE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8290FbE implements InterfaceC8331Fby {
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A00;

    public C8290FbE(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        this.A00 = layoutInflaterFactory2C8250FaT;
    }

    @Override // X.InterfaceC8331Fby
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        this.A00.A0V(c8249FaR);
    }

    @Override // X.InterfaceC8331Fby
    public final boolean AUQ(C8249FaR c8249FaR) {
        Window.Callback callback = this.A00.A09.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(MinidumpReader.MODULE_FULL_SIZE, c8249FaR);
        return true;
    }
}
