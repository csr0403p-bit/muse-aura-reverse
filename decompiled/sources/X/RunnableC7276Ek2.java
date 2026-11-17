package X;

/* renamed from: X.Ek2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7276Ek2 implements Runnable {
    public static final String __redex_internal_original_name = "AnimationBackendDelegateWithInactivityCheck$1";
    public final /* synthetic */ C7277Ek3 A00;

    public RunnableC7276Ek2(C7277Ek3 c7277Ek3) {
        this.A00 = c7277Ek3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7277Ek3 c7277Ek3 = this.A00;
        synchronized (c7277Ek3) {
            c7277Ek3.A03 = false;
            if (c7277Ek3.A06.now() - c7277Ek3.A00 > 2000) {
                C7269Eju c7269Eju = c7277Ek3.A02;
                if (c7269Eju != null) {
                    if (c7269Eju.A0D) {
                        InterfaceC7274Ejz interfaceC7274Ejz = c7269Eju.A09;
                        if (interfaceC7274Ejz != null) {
                            interfaceC7274Ejz.AWF();
                        }
                    } else {
                        c7269Eju.clear();
                    }
                }
            } else {
                C7277Ek3.A00(c7277Ek3);
            }
        }
    }
}
