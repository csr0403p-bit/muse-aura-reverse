package X;

import androidx.appcompat.widget.ActionMenuView;
import com.facebook.acra.util.minidump.MinidumpReader;

/* renamed from: X.Fb1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8277Fb1 implements InterfaceC8331Fby {
    public boolean A00;
    public final /* synthetic */ C8256Fac A01;

    public C8277Fb1(C8256Fac c8256Fac) {
        this.A01 = c8256Fac;
    }

    @Override // X.InterfaceC8331Fby
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        C8243FaJ c8243FaJ;
        if (this.A00) {
            return;
        }
        this.A00 = true;
        C8256Fac c8256Fac = this.A01;
        ActionMenuView actionMenuView = ((C8254Faa) c8256Fac.A06).A09.A0A;
        if (actionMenuView != null && (c8243FaJ = actionMenuView.A04) != null) {
            c8243FaJ.A01();
        }
        c8256Fac.A04.onPanelClosed(MinidumpReader.MODULE_FULL_SIZE, c8249FaR);
        this.A00 = false;
    }

    @Override // X.InterfaceC8331Fby
    public final boolean AUQ(C8249FaR c8249FaR) {
        this.A01.A04.onMenuOpened(MinidumpReader.MODULE_FULL_SIZE, c8249FaR);
        return true;
    }
}
