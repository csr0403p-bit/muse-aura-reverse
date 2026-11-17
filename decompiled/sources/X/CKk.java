package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes5.dex */
public final class CKk implements InterfaceC3408CKu {
    public final Context A00;
    public final CK5 A01;
    public final C3399CJq A02;
    public final Handler A03 = C60O.A02();

    @Override // X.InterfaceC3408CKu
    public final CSA<CLD> ACS() {
        C3399CJq c3399CJq = this.A02;
        String packageName = this.A00.getPackageName();
        C3404CKi c3404CKi = c3399CJq.A00;
        if (c3404CKi == null) {
            return C3399CJq.A01();
        }
        C3399CJq.A03.A02("requestUpdateInfo(%s)", packageName);
        CSE cse = new CSE();
        CK1 ck1 = new CK1(cse, cse, c3399CJq);
        c3404CKi.A01().post(new CKj(((CKp) ck1).A00, cse, ck1, c3404CKi));
        return cse.A00;
    }

    public CKk(Context context, CK5 ck5, C3399CJq c3399CJq) {
        this.A02 = c3399CJq;
        this.A01 = ck5;
        this.A00 = context;
    }
}
