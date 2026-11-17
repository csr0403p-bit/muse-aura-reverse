package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.Crf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4258Crf extends AbstractC4162CoM {
    public final C4260Crh A00;

    public C4258Crf(Context context, Looper looper, C4260Crh c4260Crh, InterfaceC4139Cng interfaceC4139Cng, InterfaceC4140Cnh interfaceC4140Cnh, C4173Cod c4173Cod) {
        super(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, 68);
        Boolean boolValueOf = Boolean.valueOf((c4260Crh == null ? C4260Crh.A02 : c4260Crh).A01);
        byte[] bArr = new byte[16];
        AbstractC4383Cuj.A00.nextBytes(bArr);
        this.A00 = new C4260Crh(boolValueOf, BV6.A0q(bArr));
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final int AHi() {
        return 12800000;
    }
}
