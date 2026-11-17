package X;

import java.io.IOException;

/* renamed from: X.Efw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7090Efw {
    public static int A03;
    public static C7090Efw A04;
    public static final Object A05 = C3cG.A0T();
    public CCV A00;
    public IOException A01;
    public C7090Efw A02;

    public static C7090Efw A00() {
        synchronized (A05) {
            C7090Efw c7090Efw = A04;
            if (c7090Efw == null) {
                return new C7090Efw();
            }
            A04 = c7090Efw.A02;
            c7090Efw.A02 = null;
            A03--;
            return c7090Efw;
        }
    }

    public final void A01() {
        synchronized (A05) {
            int i = A03;
            if (i < 5) {
                this.A00 = null;
                this.A01 = null;
                A03 = i + 1;
                C7090Efw c7090Efw = A04;
                if (c7090Efw != null) {
                    this.A02 = c7090Efw;
                }
                A04 = this;
            }
        }
    }
}
