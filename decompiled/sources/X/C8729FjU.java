package X;

import android.graphics.PointF;

/* renamed from: X.FjU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8729FjU implements InterfaceC8696Fiw {
    public final C8689Fip A00;
    public final InterfaceC8761Fk0<PointF, PointF> A01;
    public final InterfaceC8761Fk0<PointF, PointF> A02;
    public final String A03;
    public final boolean A04;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        return new C8707Fj8(c8659FiK, this, abstractC8671FiX);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RectangleShape{position=");
        sbA0x.append(this.A01);
        sbA0x.append(", size=");
        sbA0x.append(this.A02);
        return C8j3.A15(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Fk0<Landroid/graphics/PointF;Landroid/graphics/PointF;>;LX/Fk0<Landroid/graphics/PointF;Landroid/graphics/PointF;>;LX/Fip;Z)V */
    public C8729FjU(C8689Fip c8689Fip, InterfaceC8761Fk0 interfaceC8761Fk0, InterfaceC8761Fk0 interfaceC8761Fk02, String str, boolean z) {
        this.A03 = str;
        this.A01 = interfaceC8761Fk0;
        this.A02 = interfaceC8761Fk02;
        this.A00 = c8689Fip;
        this.A04 = z;
    }
}
