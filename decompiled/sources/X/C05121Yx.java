package X;

import com.meta.compose.indication.bouncy.BouncyNode;

/* renamed from: X.1Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05121Yx implements C3UH {
    @Override // X.C3UH
    public final C1Z3 create(C0dy c0dy) {
        C7384Etj.A0Y(c0dy, 0);
        return new BouncyNode(c0dy);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C05121Yx) && Float.compare(0.9f, 0.9f) == 0 && Float.compare(400.0f, 400.0f) == 0 && Float.compare(0.0f, 0.0f) == 0);
    }

    @Override // X.C3UH
    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(0.9f) * 31;
        int iFloatToIntBits2 = Float.floatToIntBits(400.0f);
        return ((((iFloatToIntBits + iFloatToIntBits2) * 31) + iFloatToIntBits2) * 31) + Float.floatToIntBits(0.0f);
    }

    @Override // X.InterfaceC05011Yg
    public final /* synthetic */ InterfaceC05111Yt rememberUpdatedInstance(C0dy c0dy, BFM bfm, int i) {
        bfm.AgE(1257603829);
        C1Z0 c1z0 = C1Z0.A00;
        AnonymousClass002.A19(bfm);
        return c1z0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BouncyIndication(pressedScale=");
        sb.append(0.9f);
        sb.append(", pressStiffness=");
        sb.append(400.0f);
        sb.append(", unpressStiffness=");
        sb.append(400.0f);
        sb.append(", initialClickedVelocity=");
        sb.append(0.0f);
        return AnonymousClass001.A0v(")", sb);
    }
}
