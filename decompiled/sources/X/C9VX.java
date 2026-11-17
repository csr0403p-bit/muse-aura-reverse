package X;

import java.util.List;

/* renamed from: X.9VX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VX extends C06G {
    public final C9WR A00;
    public final C9WR A01;
    public final List<C9Vk> A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9VX) {
                C9VX c9vx = (C9VX) obj;
                if (this.A00 != c9vx.A00 || this.A01 != c9vx.A01 || !C7384Etj.areEqual(this.A02, c9vx.A02) || this.A03 != c9vx.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00))), this.A03);
    }

    public C9VX(C9WR c9wr, C9WR c9wr2, List<C9Vk> list, boolean z) {
        AnonymousClass003.A0u(c9wr, c9wr2);
        this.A00 = c9wr;
        this.A01 = c9wr2;
        this.A02 = list;
        this.A03 = z;
    }
}
