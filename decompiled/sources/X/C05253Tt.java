package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.3Tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05253Tt implements InterfaceC05151eP, C0Ig {
    public final long A00;
    public final AXN A01;
    public final /* synthetic */ C0z7 A02 = C0z7.A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05253Tt) {
                C05253Tt c05253Tt = (C05253Tt) obj;
                if (!C7384Etj.areEqual(this.A01, c05253Tt.A01) || this.A00 != c05253Tt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC05151eP
    public final BRg A4C(Alignment alignment, BRg bRg) {
        return this.A02.A4C(alignment, bRg);
    }

    @Override // X.C0Ig
    public final float AHP() {
        AXN axn = this.A01;
        long j = this.A00;
        if (Constraints.A09(j)) {
            return axn.Agy(Constraints.A00(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // X.C0Ig
    public final float AHT() {
        AXN axn = this.A01;
        long j = this.A00;
        if (Constraints.A0A(j)) {
            return axn.Agy(Constraints.A01(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // X.InterfaceC05151eP
    public final BRg AQJ(BRg bRg) {
        return this.A02.AQJ(bRg);
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxWithConstraintsScopeImpl(density=");
        sb.append(this.A01);
        sb.append(", constraints=");
        return AnonymousClass007.A0Z(Constraints.A08(this.A00), sb);
    }

    public C05253Tt(AXN axn, long j) {
        this.A01 = axn;
        this.A00 = j;
    }
}
