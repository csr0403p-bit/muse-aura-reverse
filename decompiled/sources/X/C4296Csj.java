package X;

import X.A5o;
import X.AbstractC4291Csa;
import X.AbstractC4298Csm;
import X.AbstractC4300Cso;
import X.AbstractC4410CvW;
import X.C4292Cse;
import X.C4296Csj;
import X.C4381Cug;
import X.C60O;
import X.C7384Etj;
import X.C7592F5f;
import X.C7593F5g;
import X.C7594F5h;
import X.EZ7;
import X.F5Z;
import X.F60;
import X.FGI;
import X.InterfaceC4370CuQ;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1;
import com.sun.jna.Callback;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Csj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4296Csj extends AbstractC4291Csa {
    public CancellationSignal A00;
    public InterfaceC4370CuQ<C4381Cug, GetCredentialException> A01;
    public Executor A02;
    public final Context A03;
    public final GetCredentialController$resultReceiver$1 A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1] */
    public C4296Csj(Context context) {
        super(context);
        this.A03 = context;
        final Handler handlerA02 = C60O.A02();
        this.A04 = new ResultReceiver(handlerA02) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) throws FrameworkClassParsingException {
                Object objA00;
                String string;
                Bundle bundle2;
                int i2;
                Function0 c7594F5h;
                C7384Etj.A0Y(bundle, 1);
                C4296Csj c4296Csj = this;
                EZ7 ez7 = new EZ7(C4292Cse.A01, 2);
                Executor executor = c4296Csj.A02;
                if (executor == null) {
                    C7384Etj.A0b("executor");
                    throw F60.createAndThrow();
                }
                InterfaceC4370CuQ<C4381Cug, GetCredentialException> interfaceC4370CuQ = c4296Csj.A01;
                if (interfaceC4370CuQ == null) {
                    C7384Etj.A0b(Callback.METHOD_NAME);
                    throw F60.createAndThrow();
                }
                if (AbstractC4291Csa.A00(bundle, c4296Csj.A00, interfaceC4370CuQ, executor, ez7)) {
                    return;
                }
                int i3 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) A5o.A00(bundle, Intent.class, "RESULT_DATA");
                Executor executor2 = c4296Csj.A02;
                if (executor2 == null) {
                    C7384Etj.A0b("executor");
                    throw F60.createAndThrow();
                }
                InterfaceC4370CuQ<C4381Cug, GetCredentialException> interfaceC4370CuQ2 = c4296Csj.A01;
                if (interfaceC4370CuQ2 == null) {
                    C7384Etj.A0b(Callback.METHOD_NAME);
                    throw F60.createAndThrow();
                }
                CancellationSignal cancellationSignal = c4296Csj.A00;
                if (i3 != 1) {
                    Log.w("GetCredentialController", FGI.A0T("Returned request code ", " which  does not match what was given ", 1, i3));
                    return;
                }
                if (AbstractC4291Csa.A01(cancellationSignal, new C7592F5f(0, executor2, interfaceC4370CuQ2), new F5Z(0), i)) {
                    return;
                }
                if (intent == null) {
                    c7594F5h = new C7593F5g(4, interfaceC4370CuQ2, executor2);
                } else {
                    if (Build.VERSION.SDK_INT >= 34) {
                        objA00 = AbstractC4298Csm.A00(intent);
                        if (objA00 == null) {
                            objA00 = AbstractC4298Csm.A01(intent);
                            i2 = 4;
                        }
                        i2 = 3;
                    } else {
                        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                        if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                            Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                            if (bundleExtra2 == null) {
                                objA00 = null;
                            } else {
                                String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                if (string2 == null) {
                                    throw C60O.A0i("Bundle was missing exception type.");
                                }
                                objA00 = AbstractC4410CvW.A00(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                            }
                            i2 = 4;
                        } else {
                            objA00 = new C4381Cug(AbstractC4300Cso.A01(bundle2, string));
                            i2 = 3;
                        }
                    }
                    c7594F5h = new C7594F5h(interfaceC4370CuQ2, objA00, executor2, i2);
                }
                if (CredentialProviderPlayServicesImpl.A00(cancellationSignal)) {
                    return;
                }
                c7594F5h.invoke();
            }
        };
    }
}
