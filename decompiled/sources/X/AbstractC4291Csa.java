package X;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

/* renamed from: X.Csa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4291Csa<T1, T2, R2, R1, E1> extends C4292Cse {
    public final Context A00;

    /* JADX WARN: Incorrect types in method signature: (Landroid/os/Bundle;LX/G0V<-Ljava/lang/String;-Ljava/lang/String;+TE1;>;Ljava/util/concurrent/Executor;LX/CuQ<TR1;TE1;>;Landroid/os/CancellationSignal;)Z */
    public static final boolean A00(Bundle bundle, CancellationSignal cancellationSignal, InterfaceC4370CuQ interfaceC4370CuQ, Executor executor, G0V g0v) {
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        C7594F5h c7594F5h = new C7594F5h(interfaceC4370CuQ, g0v.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), executor, 2);
        if (!CredentialProviderPlayServicesImpl.A00(cancellationSignal)) {
            c7594F5h.invoke();
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/G0V<-Landroid/os/CancellationSignal;-Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/Unit;>;LX/G0U<-Landroidx/credentials/exceptions/GetCredentialException;Lkotlin/Unit;>;Landroid/os/CancellationSignal;)Z */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.credentials.exceptions.GetCredentialException] */
    public static final boolean A01(CancellationSignal cancellationSignal, G0U g0u, G0V g0v, int i) {
        if (i == -1) {
            return false;
        }
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = BV6.A0T(FGI.A0I("activity with result code: ", i, " indicating not RESULT_OK"));
        if (i == 0) {
            c10543HqvA0z.element = new GetCredentialCancellationException("android.credentials.GetCredentialException.TYPE_USER_CANCELED", "activity is cancelled by the user.");
        }
        g0v.invoke(cancellationSignal, new C7593F5g(3, c10543HqvA0z, g0u));
        return true;
    }

    public AbstractC4291Csa(Context context) {
        super(context);
        this.A00 = context;
    }
}
