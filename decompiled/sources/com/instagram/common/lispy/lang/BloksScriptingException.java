package com.instagram.common.lispy.lang;

import X.AbstractC7609F5w;
import X.BV6;
import X.C3cG;
import X.F9G;
import X.F9H;
import X.FFJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class BloksScriptingException extends RuntimeException implements FFJ {
    public final BloksLispyException mException;
    public final F9H mSourceMapNode;

    @Override // X.FFJ
    public final void AFP() {
        this.mException.getMessage();
    }

    @Override // X.FFJ
    public final void AHF() {
        F9H f9h = this.mSourceMapNode;
        if (f9h != null) {
            f9h.getLoggingId();
        }
    }

    @Override // X.FFJ
    public final void AHu() {
        this.mException.getCause();
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.mException.getCause();
    }

    public BloksScriptingException(F9H f9h, BloksLispyException bloksLispyException) {
        super(bloksLispyException);
        this.mSourceMapNode = f9h;
        this.mException = bloksLispyException;
    }

    @Override // X.FFJ
    public final List<String> ACv() {
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.addAll(((LispyException) this.mException).lispyStackTrace);
        F9H f9h = this.mSourceMapNode;
        if (f9h != null) {
            ArrayList arrayListA0x = null;
            while (true) {
                F9G f9gACu = f9h.ACu();
                if (f9gACu == null) {
                    if (arrayListA0x != null) {
                        break;
                    }
                } else {
                    arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
                    arrayListA0x.add(f9gACu.A01);
                    f9h = f9gACu.A00;
                    if (f9h == null) {
                        break;
                    }
                }
            }
            Iterator it = arrayListA0x.iterator();
            while (it.hasNext()) {
                BV6.A1S(arrayListA0h, it);
            }
        }
        return arrayListA0h;
    }
}
