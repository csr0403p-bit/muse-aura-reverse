package X;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import java.util.concurrent.Executor;

/* renamed from: X.Csx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC4309Csx {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, C4294Csh c4294Csh, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ<C4381Cug, GetCredentialException> interfaceC4370CuQ);

    void onPrepareCredential(C4294Csh c4294Csh, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ<C4314CtC, GetCredentialException> interfaceC4370CuQ);
}
