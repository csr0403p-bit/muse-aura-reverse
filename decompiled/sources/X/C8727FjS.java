package X;

import java.util.List;

/* renamed from: X.FjS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8727FjS implements InterfaceC8696Fiw {
    public final float A00;
    public final C8764Fk3 A01;
    public final C8689Fip A02;
    public final C8689Fip A03;
    public final C8766Fk5 A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final List<C8689Fip> A08;
    public final boolean A09;

    @Override // X.InterfaceC8696Fiw
    public final InterfaceC8698Fiy Agv(C6837Eap c6837Eap, C8659FiK c8659FiK, AbstractC8671FiX abstractC8671FiX) {
        return new C8710FjB(c8659FiK, this, abstractC8671FiX);
    }

    public C8727FjS(C8764Fk3 c8764Fk3, C8689Fip c8689Fip, C8689Fip c8689Fip2, C8766Fk5 c8766Fk5, Integer num, Integer num2, String str, List list, float f, boolean z) {
        this.A07 = str;
        this.A02 = c8689Fip;
        this.A08 = list;
        this.A01 = c8764Fk3;
        this.A04 = c8766Fk5;
        this.A03 = c8689Fip2;
        this.A05 = num;
        this.A06 = num2;
        this.A00 = f;
        this.A09 = z;
    }
}
