package X;

import android.graphics.Rect;

/* renamed from: X.Eiu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7230Eiu implements Runnable {
    public static final String __redex_internal_original_name = "FrescoController2Impl$fetch$fetchRunnable$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Rect A01;
    public final /* synthetic */ InterfaceC7300EkR A02;
    public final /* synthetic */ C7226Eiq A03;
    public final /* synthetic */ C7218Eii A04;
    public final /* synthetic */ Object A05;

    public RunnableC7230Eiu(Rect rect, InterfaceC7300EkR interfaceC7300EkR, C7226Eiq c7226Eiq, C7218Eii c7218Eii, Object obj, long j) {
        this.A00 = j;
        this.A02 = interfaceC7300EkR;
        this.A04 = c7218Eii;
        this.A03 = c7226Eiq;
        this.A05 = obj;
        this.A01 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.A00;
        InterfaceC7300EkR interfaceC7300EkR = this.A02;
        C7219Eij c7219Eij = (C7219Eij) interfaceC7300EkR;
        if (j == c7219Eij.A07()) {
            C7218Eii c7218Eii = this.A04;
            InterfaceC7237Ej1 interfaceC7237Ej1 = c7218Eii.A00;
            C7226Eiq c7226Eiq = this.A03;
            Object obj = this.A05;
            InterfaceC7250EjU interfaceC7250EjU = c7219Eij.A0E;
            Rect rect = this.A01;
            InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0ABM = interfaceC7237Ej1.ABM(rect != null ? new C7482Exf(rect.width(), rect.height()) : null, c7226Eiq, interfaceC7250EjU, obj, j);
            synchronized (c7219Eij) {
                if (j == c7219Eij.A07()) {
                    InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0 = c7219Eij.A03;
                    if (interfaceC7236Ej0 != null && interfaceC7236Ej0 != interfaceC7236Ej0ABM) {
                        interfaceC7236Ej0.A6Q();
                    }
                    c7219Eij.A03 = interfaceC7236Ej0ABM;
                }
            }
            interfaceC7236Ej0ABM.Agc((InterfaceC7248EjS) interfaceC7300EkR, c7218Eii.A03);
        }
    }
}
