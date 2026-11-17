package X;

import X.AbstractC4291Csa;
import X.BV6;
import X.C10543Hqv;
import X.C3cG;
import X.C4289CsX;
import X.C4292Cse;
import X.C4306Csu;
import X.C4381Cug;
import X.C60Q;
import X.C7384Etj;
import X.C7590F5d;
import X.C7593F5g;
import X.CRy;
import X.EZ7;
import X.F5Z;
import X.FGI;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.p000authapi.zbao;
import com.sun.jna.Callback;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.CsX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4289CsX extends AbstractC4291Csa<C4294Csh, GetSignInIntentRequest, SignInCredential, C4381Cug, GetCredentialException> {
    public CancellationSignal A00;
    public InterfaceC4370CuQ<C4381Cug, GetCredentialException> A01;
    public Executor A02;
    public final Context A03;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 A04;

    public final InterfaceC4370CuQ<C4381Cug, GetCredentialException> A03() {
        InterfaceC4370CuQ<C4381Cug, GetCredentialException> interfaceC4370CuQ = this.A01;
        if (interfaceC4370CuQ != null) {
            return interfaceC4370CuQ;
        }
        C7384Etj.A0b(Callback.METHOD_NAME);
        throw F60.createAndThrow();
    }

    public final Executor A04() {
        Executor executor = this.A02;
        if (executor != null) {
            return executor;
        }
        C7384Etj.A0b("executor");
        throw F60.createAndThrow();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Csh;LX/CuQ<LX/Cug;Landroidx/credentials/exceptions/GetCredentialException;>;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V */
    public final void A05(C4294Csh c4294Csh, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ) {
        this.A00 = cancellationSignal;
        this.A01 = interfaceC4370CuQ;
        this.A02 = executor;
        if (CredentialProviderPlayServicesImpl.A00(cancellationSignal)) {
            return;
        }
        try {
            List<AbstractC4308Csw> list = c4294Csh.A01;
            if (list.size() != 1) {
                throw new GetCredentialUnsupportedException("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION", "GetSignInWithGoogleOption cannot be combined with other options.");
            }
            AbstractC4308Csw abstractC4308Csw = list.get(0);
            C7384Etj.A0Z(abstractC4308Csw, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
            String str = ((C4307Csv) abstractC4308Csw).A00;
            CRy.A03(str);
            CRy.A03(str);
            final C4241CrD c4241CrDA00 = CRy.A00(this.A03);
            CRy.A03(str);
            final GetSignInIntentRequest getSignInIntentRequest = new GetSignInIntentRequest(str, 0, null, c4241CrDA00.A00, null, false);
            C4231Cqf c4231CqfA00 = C4232Cqg.A00();
            c4231CqfA00.A03 = new Feature[]{AbstractC4328CtQ.A05};
            c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.CrG
                @Override // X.InterfaceC4375CuV
                public final void accept(Object obj, Object obj2) {
                    zbao zbaoVar = new zbao((CSE) obj2);
                    zba zbaVar = (zba) ((AbstractC4160CoH) obj).A03();
                    GetSignInIntentRequest getSignInIntentRequest2 = getSignInIntentRequest;
                    CRy.A03(getSignInIntentRequest2);
                    zbaVar.A01(zba.A00(getSignInIntentRequest2, zbaVar, zbaoVar), 3);
                }
            };
            CSC cscA01 = AbstractC4178Com.A01(c4241CrDA00, c4231CqfA00, 1555, 0);
            cscA01.A06(new C4954DHn(new C7592F5f(2, cancellationSignal, this), 3), AbstractC3097ByB.A00);
            cscA01.A0E(new F5H(1, cancellationSignal, this));
        } catch (GetCredentialUnsupportedException e) {
            C7593F5g.A00(cancellationSignal, e, this, 15);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public C4289CsX(Context context) {
        super(context);
        this.A03 = context;
        final Handler handlerA02 = C60O.A02();
        this.A04 = new ResultReceiver(handlerA02) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v13, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                CancellationSignal cancellationSignal;
                int i2;
                T getCredentialInterruptedException;
                Throwable th;
                C7384Etj.A0Y(bundle, 1);
                C4289CsX c4289CsX = this;
                if (AbstractC4291Csa.A00(bundle, c4289CsX.A00, c4289CsX.A03(), c4289CsX.A04(), new EZ7(C4292Cse.A01, 1))) {
                    return;
                }
                int i3 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                if (i3 != 1) {
                    Log.w("GetSignInIntent", FGI.A0T("Returned request code ", " which  does not match what was given ", 1, i3));
                    return;
                }
                if (AbstractC4291Csa.A01(c4289CsX.A00, new C7590F5d(c4289CsX, 4), new F5Z(2), i)) {
                    return;
                }
                try {
                    SignInCredential signInCredentialA05 = CRy.A00(c4289CsX.A03).A05(intent);
                    String str = signInCredentialA05.A07;
                    if (str == null) {
                        Log.w("GetSignInIntent", "Credential returned but no google Id found");
                        throw BV6.A0T("When attempting to convert get response, null credential found");
                    }
                    String str2 = signInCredentialA05.A02;
                    C7384Etj.A0U(str2);
                    String str3 = signInCredentialA05.A03;
                    String str4 = str3 != null ? str3 : null;
                    String str5 = signInCredentialA05.A04;
                    String str6 = str5 != null ? str5 : null;
                    String str7 = signInCredentialA05.A05;
                    String str8 = str7 != null ? str7 : null;
                    String str9 = signInCredentialA05.A08;
                    String str10 = str9 != null ? str9 : null;
                    Uri uri = signInCredentialA05.A00;
                    C7593F5g.A00(c4289CsX.A00, new C4381Cug(new C4306Csu(uri != null ? uri : null, str2, str, str4, str8, str6, str10)), c4289CsX, 10);
                } catch (GetCredentialException e) {
                    cancellationSignal = c4289CsX.A00;
                    i2 = 12;
                    th = e;
                    C7593F5g.A00(cancellationSignal, th, c4289CsX, i2);
                } catch (ApiException e2) {
                    C10543Hqv c10543HqvA0z = C3cG.A0z();
                    c10543HqvA0z.element = BV6.A0T(e2.getMessage());
                    int i4 = e2.mStatus.A00;
                    if (i4 != 16) {
                        if (C60Q.A1W(C4292Cse.A02, i4)) {
                            getCredentialInterruptedException = new GetCredentialInterruptedException("android.credentials.GetCredentialException.TYPE_INTERRUPTED", e2.getMessage());
                        }
                        cancellationSignal = c4289CsX.A00;
                        i2 = 11;
                        th = c10543HqvA0z;
                        C7593F5g.A00(cancellationSignal, th, c4289CsX, i2);
                    }
                    getCredentialInterruptedException = new GetCredentialCancellationException("android.credentials.GetCredentialException.TYPE_USER_CANCELED", e2.getMessage());
                    c10543HqvA0z.element = getCredentialInterruptedException;
                    cancellationSignal = c4289CsX.A00;
                    i2 = 11;
                    th = c10543HqvA0z;
                    C7593F5g.A00(cancellationSignal, th, c4289CsX, i2);
                } catch (Throwable th2) {
                    Throwable thA0T = BV6.A0T(th2.getMessage());
                    cancellationSignal = c4289CsX.A00;
                    i2 = 13;
                    th = thA0T;
                    C7593F5g.A00(cancellationSignal, th, c4289CsX, i2);
                }
            }
        };
    }
}
