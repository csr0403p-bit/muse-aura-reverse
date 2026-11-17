package X;

import android.content.Context;

/* renamed from: X.AKo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0975AKo implements InterfaceC0976AKp {
    public final long A00;
    public final Context A01;
    public final C3TQ A02;
    public final AXN A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(obj != null ? obj.getClass() : null)) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
                C0975AKo c0975AKo = (C0975AKo) obj;
                if (C7384Etj.areEqual(this.A01, c0975AKo.A01) && C7384Etj.areEqual(this.A03, c0975AKo.A03)) {
                    long j = this.A00;
                    long j2 = c0975AKo.A00;
                    long j3 = B6A.A01;
                    if (j != j2 || !this.A02.equals(c0975AKo.A02)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A01));
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass005.A0G(this.A02, C60R.A00(j, iA0F));
    }

    public C0975AKo(Context context, C3TQ c3tq, AXN axn, long j) {
        this.A01 = context;
        this.A03 = axn;
        this.A00 = j;
        this.A02 = c3tq;
    }
}
