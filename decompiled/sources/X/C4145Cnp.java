package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.signin.internal.zaf;

/* renamed from: X.Cnp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4145Cnp extends AbstractC4162CoM<zaf> implements InterfaceC4148Cns {
    public final Bundle A00;
    public final C4173Cod A01;
    public final Integer A02;

    public C4145Cnp(Context context, Bundle bundle, Looper looper, InterfaceC4139Cng interfaceC4139Cng, InterfaceC4140Cnh interfaceC4140Cnh, C4173Cod c4173Cod) {
        super(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, 44);
        this.A01 = c4173Cod;
        this.A00 = bundle;
        this.A02 = c4173Cod.A00;
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final boolean AbJ() {
        return true;
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final int AHi() {
        return 12451000;
    }
}
