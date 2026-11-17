package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cci, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3684Cci implements InterfaceC3745Cdi {
    public final List A00;

    public C3684Cci(Context context, AbstractC3744Cdh abstractC3744Cdh) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A00 = arrayListA0h;
        if (((C3677Ccb) abstractC3744Cdh).A02) {
            arrayListA0h.add(new C3703Cd1(context, abstractC3744Cdh));
        }
    }
}
