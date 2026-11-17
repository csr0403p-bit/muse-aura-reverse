package X;

import android.content.Context;

/* renamed from: X.CiW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3982CiW implements InterfaceC3984CiY {
    public final Context A00;
    public final F0G A01;

    @Override // X.InterfaceC3984CiY
    public final Object AYX(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        return c3979CiT;
    }

    @Override // X.InterfaceC3984CiY
    public final boolean AfW(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        return false;
    }

    public C3982CiW(Context context, F0G f0g) {
        this.A00 = context;
        this.A01 = f0g;
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "token_ack";
    }
}
