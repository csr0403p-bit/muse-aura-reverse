package X;

import android.graphics.PointF;

/* renamed from: X.Fjk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8745Fjk implements InterfaceC8696Fiw {
    public final C8767Fk6 A00;
    public final InterfaceC8761Fk0<PointF, PointF> A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        return new C8709FjA(c8659FiK, this, abstractC8671FiX);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Fk0<Landroid/graphics/PointF;Landroid/graphics/PointF;>;LX/Fk6;ZZ)V */
    public C8745Fjk(C8767Fk6 c8767Fk6, InterfaceC8761Fk0 interfaceC8761Fk0, String str, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = interfaceC8761Fk0;
        this.A00 = c8767Fk6;
        this.A04 = z;
        this.A03 = z2;
    }
}
