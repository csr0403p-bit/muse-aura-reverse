package X;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class F5Z implements Ht9, G0V {
    public final int $t;

    public F5Z(int i) {
        this.$t = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        Function0 function0 = (Function0) obj2;
        C7384Etj.A0Y(function0, 1);
        if (!CredentialProviderPlayServicesImpl.A00((CancellationSignal) obj)) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
