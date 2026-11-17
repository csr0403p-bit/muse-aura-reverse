package X;

import android.os.Looper;

/* renamed from: X.Cha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3944Cha {
    public static long A01;
    public static final C3961Ci5 A02 = new C3961Ci5();
    public static final C3944Cha A03 = new C3944Cha();
    public final C3946Chd A00;

    public final boolean A00(InterfaceC3959Ci2 interfaceC3959Ci2) {
        C3946Chd c3946Chd = this.A00;
        RunnableC3943ChZ runnableC3943ChZ = new RunnableC3943ChZ(interfaceC3959Ci2, c3946Chd.A01, c3946Chd);
        c3946Chd.A02.set(runnableC3943ChZ);
        c3946Chd.A00.post(runnableC3943ChZ);
        return true;
    }

    public C3944Cha(int i) {
    }

    public C3944Cha() {
        Looper looperA0D = BV5.A0D("PushTokenRefresherJobLogic");
        if (looperA0D != null) {
            this.A00 = new C3946Chd(looperA0D, C3960Ci3.A00);
            return;
        }
        throw BV4.A0U();
    }
}
