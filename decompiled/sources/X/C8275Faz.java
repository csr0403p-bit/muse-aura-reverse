package X;

import android.view.Window;
import com.facebook.acra.util.minidump.MinidumpReader;

/* renamed from: X.Faz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8275Faz implements InterfaceC8331Fby {
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A00;

    public C8275Faz(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        this.A00 = layoutInflaterFactory2C8250FaT;
    }

    @Override // X.InterfaceC8331Fby
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        C8249FaR c8249FaRA03 = c8249FaR.A03();
        boolean zA1Z = AnonymousClass006.A1Z(c8249FaRA03, c8249FaR);
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A00;
        if (zA1Z) {
            c8249FaR = c8249FaRA03;
        }
        C8278Fb2[] c8278Fb2Arr = layoutInflaterFactory2C8250FaT.A0f;
        if (c8278Fb2Arr != null) {
            for (C8278Fb2 c8278Fb2 : c8278Fb2Arr) {
                if (c8278Fb2 != null && c8278Fb2.A0A == c8249FaR) {
                    if (!zA1Z) {
                        layoutInflaterFactory2C8250FaT.A0U(c8278Fb2, z);
                        return;
                    } else {
                        layoutInflaterFactory2C8250FaT.A0T(c8249FaRA03, c8278Fb2, c8278Fb2.A01);
                        layoutInflaterFactory2C8250FaT.A0U(c8278Fb2, true);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC8331Fby
    public final boolean AUQ(C8249FaR c8249FaR) {
        Window.Callback callback;
        if (c8249FaR != c8249FaR.A03()) {
            return true;
        }
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A00;
        if (!layoutInflaterFactory2C8250FaT.A0X || (callback = layoutInflaterFactory2C8250FaT.A09.getCallback()) == null || layoutInflaterFactory2C8250FaT.A0T) {
            return true;
        }
        callback.onMenuOpened(MinidumpReader.MODULE_FULL_SIZE, c8249FaR);
        return true;
    }
}
