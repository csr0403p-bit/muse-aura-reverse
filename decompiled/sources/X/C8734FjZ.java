package X;

import android.graphics.Path;

/* renamed from: X.FjZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8734FjZ implements InterfaceC8696Fiw {
    public final Path.FillType A00;
    public final C8764Fk3 A01;
    public final C8766Fk5 A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        return new Fj5(c8659FiK, this, abstractC8671FiX);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ShapeFill{color=, fillEnabled=");
        sbA0x.append(this.A05);
        return C8j3.A15(sbA0x);
    }

    public C8734FjZ(Path.FillType fillType, C8764Fk3 c8764Fk3, C8766Fk5 c8766Fk5, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A00 = fillType;
        this.A01 = c8764Fk3;
        this.A02 = c8766Fk5;
        this.A04 = z2;
    }
}
