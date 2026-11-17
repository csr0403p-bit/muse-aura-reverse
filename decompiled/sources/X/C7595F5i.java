package X;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import java.util.concurrent.Executor;

/* renamed from: X.F5i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7595F5i implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C7595F5i(CancellationSignal cancellationSignal, InterfaceC4370CuQ interfaceC4370CuQ, Executor executor, int i) {
        this.$t = i;
        this.A00 = cancellationSignal;
        this.A01 = executor;
        this.A02 = interfaceC4370CuQ;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        return this.$t != 0 ? CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0((CancellationSignal) this.A00, (Executor) this.A01, (InterfaceC4370CuQ) this.A02, null) : CredentialProviderPlayServicesImpl.onClearCredential$lambda$4((CancellationSignal) this.A00, (Executor) this.A01, (InterfaceC4370CuQ) this.A02, (ClearCredentialStateResponse) obj);
    }
}
