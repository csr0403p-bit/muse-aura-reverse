package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Cox, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4187Cox {
    public static C4187Cox A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final C4165CoQ A02;

    public final synchronized void A01() {
        C4165CoQ c4165CoQ = this.A02;
        Lock lock = c4165CoQ.A01;
        lock.lock();
        try {
            c4165CoQ.A00.edit().clear().apply();
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static synchronized C4187Cox A00(Context context) {
        C4187Cox c4187Cox;
        Context applicationContext = context.getApplicationContext();
        c4187Cox = A03;
        if (c4187Cox == null) {
            c4187Cox = new C4187Cox(applicationContext);
            A03 = c4187Cox;
        }
        return c4187Cox;
    }

    public C4187Cox(Context context) {
        C4165CoQ c4165CoQA00 = C4165CoQ.A00(context);
        this.A02 = c4165CoQA00;
        this.A00 = c4165CoQA00.A02();
        this.A01 = c4165CoQA00.A03();
    }
}
