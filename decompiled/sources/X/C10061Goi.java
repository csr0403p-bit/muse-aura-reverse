package X;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* renamed from: X.Goi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10061Goi implements Serializable {
    public static C10061Goi A00 = new C10061Goi();
    public static final long serialVersionUID = 1;
    public final int _maxNestingDepth = 1000;

    public final void A00(int i) {
        int i2 = this._maxNestingDepth;
        if (i > i2) {
            throw new StreamConstraintsException(String.format("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i), Integer.valueOf(i2), FGI.A0U("`StreamWriteConstraints.", "getMaxNestingDepth", "()`")));
        }
    }
}
