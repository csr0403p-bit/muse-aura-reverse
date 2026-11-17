package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Csy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4310Csy {
    public static Object A00(Context context, C4294Csh c4294Csh, HtJ htJ) throws PackageManager.NameNotFoundException {
        InterfaceC4309Csx interfaceC4309CsxA02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBL.A04;
        GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        CancellationSignal cancellationSignal = new CancellationSignal();
        gbl.AO2(new C7590F5d(cancellationSignal, 1));
        C4311Csz c4311Csz = new C4311Csz(gbl);
        F52 f52 = new F52(1);
        C3359CHc c3359CHc = new C3359CHc(context);
        if (c4294Csh.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            interfaceC4309CsxA02 = C3359CHc.A00(c3359CHc);
        } else {
            Iterator<AbstractC4308Csw> it = c4294Csh.A01.iterator();
            while (it.hasNext()) {
                it.next();
            }
            interfaceC4309CsxA02 = c3359CHc.A02(true);
        }
        if (interfaceC4309CsxA02 == null) {
            c4311Csz.AT2(new GetCredentialProviderConfigurationException("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC4309CsxA02.onGetCredential(context, c4294Csh, cancellationSignal, f52, c4311Csz);
        }
        return gbl.A0F();
    }
}
