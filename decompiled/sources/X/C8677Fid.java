package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Fid, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8677Fid extends AbstractC8671FiX {
    public final C8673FiZ A00;
    public final C8670FiW A01;

    public C8677Fid(C6837Eap c6837Eap, C8659FiK c8659FiK, C8670FiW c8670FiW, C8675Fib c8675Fib) {
        super(c8659FiK, c8675Fib);
        this.A01 = c8670FiW;
        C8673FiZ c8673FiZ = new C8673FiZ(c6837Eap, c8659FiK, new C8679Fif("__container", c8675Fib.A0N, false), this);
        this.A00 = c8673FiZ;
        List<InterfaceC8698Fiy> list = Collections.EMPTY_LIST;
        c8673FiZ.AdB(list, list);
    }

    @Override // X.AbstractC8671FiX, X.InterfaceC8694Fiu
    public final void AD3(Matrix matrix, RectF rectF, boolean z) {
        super.AD3(matrix, rectF, z);
        this.A00.AD3(this.A0A, rectF, z);
    }
}
