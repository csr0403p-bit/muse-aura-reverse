package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Fif, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8679Fif implements InterfaceC8696Fiw {
    public final String A00;
    public final List<InterfaceC8696Fiw> A01;
    public final boolean A02;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        return new C8673FiZ(c6837Eap, c8659FiK, this, abstractC8671FiX);
    }

    public final String toString() {
        return FGI.A0e("ShapeGroup{name='", this.A00, "' Shapes: ", Arrays.toString(this.A01.toArray()), '}');
    }

    public C8679Fif(String str, List<InterfaceC8696Fiw> list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }
}
