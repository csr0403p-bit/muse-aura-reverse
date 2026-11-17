package X;

import android.os.Handler;
import androidx.media3.common.util.Util;

/* renamed from: X.Dxe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6194Dxe implements InterfaceC5532Dk9 {
    public InterfaceC5547DkP A00;
    public boolean A01;
    public final C6014Dtx A02;
    public final /* synthetic */ C6159Dx2 A03;

    public C6194Dxe(C6159Dx2 c6159Dx2, C6014Dtx c6014Dtx) {
        this.A03 = c6159Dx2;
        this.A02 = c6014Dtx;
    }

    @Override // X.InterfaceC5532Dk9
    public final void release() {
        Handler handler = this.A03.A01;
        handler.getClass();
        Util.A0L(handler, new Runnable() { // from class: X.Dxs
            public static final String __redex_internal_original_name = "DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                C6194Dxe c6194Dxe = this.A00;
                if (c6194Dxe.A01) {
                    return;
                }
                InterfaceC5547DkP interfaceC5547DkP = c6194Dxe.A00;
                if (interfaceC5547DkP != null) {
                    interfaceC5547DkP.Aa8(c6194Dxe.A02);
                }
                c6194Dxe.A03.A0A.remove(c6194Dxe);
                c6194Dxe.A01 = true;
            }
        });
    }
}
