package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.FWc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8139FWc {
    public static C8139FWc A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public C8137FWa A00;

    public final synchronized Drawable A02(Context context, int i) {
        return this.A00.A03(context, i);
    }

    public static synchronized C8139FWc A00() {
        if (A01 == null) {
            A01();
        }
        return A01;
    }

    public static synchronized void A01() {
        C8137FWa c8137FWa;
        if (A01 == null) {
            C8139FWc c8139FWc = new C8139FWc();
            A01 = c8139FWc;
            synchronized (C8137FWa.class) {
                try {
                    c8137FWa = C8137FWa.A05;
                    if (c8137FWa == null) {
                        c8137FWa = new C8137FWa();
                        C8137FWa.A05 = c8137FWa;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c8139FWc.A00 = c8137FWa;
            C8137FWa c8137FWa2 = A01.A00;
            C8138FWb c8138FWb = new C8138FWb();
            synchronized (c8137FWa2) {
                try {
                    c8137FWa2.A01 = c8138FWb;
                } finally {
                }
            }
        }
    }
}
