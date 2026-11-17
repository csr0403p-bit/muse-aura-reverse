package X;

import android.view.View;

/* renamed from: X.FaN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8245FaN implements Runnable {
    public static final String __redex_internal_original_name = "ActionMenuPresenter$OpenOverflowRunnable";
    public C8242FaI A00;
    public final /* synthetic */ C8243FaJ A01;

    public RunnableC8245FaN(C8242FaI c8242FaI, C8243FaJ c8243FaJ) {
        this.A01 = c8243FaJ;
        this.A00 = c8242FaI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC8322Fbo interfaceC8322Fbo;
        C8243FaJ c8243FaJ = this.A01;
        C8249FaR c8249FaR = c8243FaJ.A06;
        if (c8249FaR != null && (interfaceC8322Fbo = c8249FaR.A03) != null) {
            interfaceC8322Fbo.AUA(c8249FaR);
        }
        View view = (View) c8243FaJ.A08;
        if (view != null && view.getWindowToken() != null) {
            C8242FaI c8242FaI = this.A00;
            AbstractC8231Fa7 abstractC8231Fa7 = c8242FaI.A03;
            if (abstractC8231Fa7 != null && abstractC8231Fa7.AP1()) {
                c8243FaJ.A0D = c8242FaI;
            } else if (c8242FaI.A01 != null) {
                AbstractC8231Fa7 abstractC8231Fa7A00 = c8242FaI.A00();
                if (abstractC8231Fa7A00 instanceof ViewOnKeyListenerC8234FaA) {
                    ((ViewOnKeyListenerC8234FaA) abstractC8231Fa7A00).A07 = false;
                } else {
                    ((ViewOnKeyListenerC8233Fa9) abstractC8231Fa7A00).A0D = false;
                }
                abstractC8231Fa7A00.Afd();
                c8243FaJ.A0D = c8242FaI;
            }
        }
        c8243FaJ.A0B = null;
    }
}
