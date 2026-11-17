package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class F9E implements F9H {
    public final F9C A00;
    public final F9H A01;
    public final F0C A02;

    public F9E(F9C f9c, F9H f9h) {
        C7384Etj.A0Y(f9c, 1);
        this.A01 = f9h;
        this.A00 = f9c;
        this.A02 = C5322DgG.A01((Function0) new Hil(this, 7));
    }

    @Override // X.F9H
    public final F9H AIT() {
        return this.A01.AIT();
    }

    @Override // X.F9H
    public final String AM3() {
        return this.A01.AM3();
    }

    @Override // X.F9H
    public final F9H AQ2(F9H f9h) {
        return new F9E(this.A00, this.A01.AQ2(f9h));
    }

    @Override // X.F9H
    public final String getLoggingId() {
        String str;
        F9D f9d = (F9D) this.A02.getValue();
        if (f9d != null && (str = f9d.A00) != null) {
            return str;
        }
        F9H f9hAIT = this.A01.AIT();
        if (f9hAIT != null) {
            return f9hAIT.getLoggingId();
        }
        return null;
    }

    @Override // X.F9H
    public final F9G ACu() {
        ArrayList arrayListA0h = C3cG.A0h();
        F9H f9h = this.A01;
        String strAM3 = f9h.AM3();
        F0C f0c = this.A02;
        F9D f9d = (F9D) f0c.getValue();
        if (f9d != null) {
            arrayListA0h.addAll(f9d.A02);
        }
        if (strAM3 != null && strAM3.length() != 0) {
            arrayListA0h.add(strAM3);
        }
        F9D f9d2 = (F9D) f0c.getValue();
        return new F9G(f9h.AIT(), FGI.A0U(f9d2 != null ? f9d2.A01 : null, "|", C3cH.A0e(":", arrayListA0h)));
    }
}
