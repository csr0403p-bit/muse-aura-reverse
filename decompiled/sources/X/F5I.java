package X;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class F5I implements CSP {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public F5I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.A00 = obj4;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj5;
        this.A04 = obj3;
    }

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        if (this.$t == 0) {
            CredentialProviderPlayServicesImpl.onClearCredential$lambda$6((CredentialProviderPlayServicesImpl) this.A00, (C4389Cup) this.A01, (CancellationSignal) this.A02, (Executor) this.A03, (InterfaceC4370CuQ) this.A04, exc);
            return;
        }
        C4294Csh c4294Csh = (C4294Csh) this.A00;
        C4296Csj c4296Csj = (C4296Csj) this.A01;
        InterfaceC4370CuQ interfaceC4370CuQ = (InterfaceC4370CuQ) this.A02;
        Executor executor = (Executor) this.A03;
        CancellationSignal cancellationSignal = (CancellationSignal) this.A04;
        boolean z = false;
        Iterator<AbstractC4308Csw> it = c4294Csh.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next() instanceof C4307Csv) {
                z = true;
                break;
            }
        }
        if (z) {
            Log.w("GetCredentialController", "Pre-u credman get flow failed for get sign in intent; retrying with gis flow");
            new C4289CsX(c4296Csj.A03).A05(c4294Csh, cancellationSignal, executor, interfaceC4370CuQ);
        } else {
            Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
            new C4288CsU(c4296Csj.A03).A05(c4294Csh, cancellationSignal, executor, interfaceC4370CuQ);
        }
    }
}
