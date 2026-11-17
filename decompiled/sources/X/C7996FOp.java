package X;

import android.content.Context;

/* renamed from: X.FOp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7996FOp implements InterfaceC10557Hsn {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Integer A01;

    public C7996FOp(Context context, Integer num) {
        this.A00 = context;
        this.A01 = num;
    }

    @Override // X.InterfaceC10557Hsn
    public final boolean AOJ() {
        Context context = this.A00;
        int iIntValue = this.A01.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                return false;
            }
            if (iIntValue != 2) {
                throw C3cG.A0q();
            }
            if (C60P.A00(context) != 32) {
                return false;
            }
        }
        return true;
    }
}
