package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.Coe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4174Coe extends AbstractC4162CoM {
    public final Bundle A00;

    public C4174Coe(Context context, Looper looper, C4007Cje c4007Cje, InterfaceC4392Cuv interfaceC4392Cuv, InterfaceC4393Cuw interfaceC4393Cuw, C4173Cod c4173Cod) {
        super(context, looper, interfaceC4392Cuv, interfaceC4393Cuw, c4173Cod, 16);
        this.A00 = c4007Cje == null ? BV6.A0N() : new Bundle(c4007Cje.A00);
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final boolean AbJ() {
        C4173Cod c4173Cod = ((AbstractC4162CoM) this).A00;
        if (!TextUtils.isEmpty(null)) {
            c4173Cod.A03.get(AbstractC4265Crn.A02);
            if (!c4173Cod.A04.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final int AHi() {
        return 12451000;
    }
}
