package androidx.credentials.playservices;

import X.AbstractC3097ByB;
import X.AbstractC4178Com;
import X.AbstractC4272Cry;
import X.AbstractC4308Csw;
import X.AbstractC4328CtQ;
import X.AbstractC4335Cta;
import X.AbstractC4450CwS;
import X.AbstractC4451CwT;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BV6;
import X.C10543Hqv;
import X.C3cG;
import X.C4001CjU;
import X.C4163CoN;
import X.C4231Cqf;
import X.C4232Cqg;
import X.C4241CrD;
import X.C4252CrP;
import X.C4276Cs4;
import X.C4288CsU;
import X.C4289CsX;
import X.C4294Csh;
import X.C4296Csj;
import X.C4307Csv;
import X.C4349Ctr;
import X.C4381Cug;
import X.C4389Cup;
import X.C4954DHn;
import X.C7384Etj;
import X.C7593F5g;
import X.C7594F5h;
import X.C7595F5i;
import X.C8j3;
import X.CRy;
import X.CSC;
import X.CSP;
import X.F5I;
import X.F60;
import X.G0U;
import X.InterfaceC3786CeU;
import X.InterfaceC4309Csx;
import X.InterfaceC4370CuQ;
import X.InterfaceC4375CuV;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateProviderConfigurationException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialService;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialService$Stub$Proxy;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$clearCredentialState$1$callback$1;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$getCredential$1$callback$1;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.p000authapi.zban;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class CredentialProviderPlayServicesImpl implements InterfaceC4309Csx {
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    public static final String TAG = "PlayServicesImpl";
    public final Context context;
    public C4001CjU googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
        this.googleApiAvailability = C4001CjU.A00;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public static final Unit onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ, Boolean bool) {
        C7593F5g c7593F5g = new C7593F5g(2, interfaceC4370CuQ, executor);
        if (!A00(cancellationSignal)) {
            c7593F5g.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.credentials.exceptions.ClearCredentialException] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, androidx.credentials.exceptions.ClearCredentialException] */
    public static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ, Exception exc) {
        C7384Etj.A0Y(exc, 3);
        Log.w(TAG, "Clearing restore credential failed", exc);
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = new ClearCredentialUnknownException("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", "Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).mStatus.A00 == 40201) {
            c10543HqvA0z.element = new ClearCredentialUnknownException("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", "The restore credential internal service had a failure.");
        }
        C7594F5h c7594F5h = new C7594F5h(interfaceC4370CuQ, c10543HqvA0z, executor, 1);
        if (A00(cancellationSignal)) {
            return;
        }
        c7594F5h.invoke();
    }

    public static final Unit onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ, ClearCredentialStateResponse clearCredentialStateResponse) {
        C7593F5g c7593F5g = new C7593F5g(0, interfaceC4370CuQ, executor);
        if (!A00(cancellationSignal)) {
            c7593F5g.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ, Void r5) {
        C7593F5g c7593F5g = new C7593F5g(1, interfaceC4370CuQ, executor);
        if (!A00(cancellationSignal)) {
            c7593F5g.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ, Exception exc) {
        C7384Etj.A0Y(exc, 4);
        C7594F5h c7594F5h = new C7594F5h(executor, interfaceC4370CuQ, exc, 0);
        if (A00(cancellationSignal)) {
            return;
        }
        c7594F5h.invoke();
    }

    public void onClearCredential(C4389Cup c4389Cup, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ<Void, ClearCredentialException> interfaceC4370CuQ) {
        AnonymousClass005.A11(c4389Cup, executor, interfaceC4370CuQ, 0);
        if (A00(cancellationSignal)) {
            return;
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            runFallbackClearCredFlow(c4389Cup, cancellationSignal, executor, interfaceC4370CuQ);
            return;
        }
        Context context = this.context;
        C7384Etj.A0Y(context, 0);
        C4252CrP c4252CrP = new C4252CrP(context, InterfaceC3786CeU.A00, C4252CrP.A00, C4276Cs4.A02);
        final ClearCredentialStateRequest clearCredentialStateRequest = new ClearCredentialStateRequest();
        C4231Cqf c4231CqfA00 = C4232Cqg.A00();
        c4231CqfA00.A03 = new Feature[]{AbstractC4335Cta.A04};
        c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.CrN
            @Override // X.InterfaceC4375CuV
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ClearCredentialStateRequest clearCredentialStateRequest2 = clearCredentialStateRequest;
                InternalIdentityCredentialClient$clearCredentialState$1$callback$1 internalIdentityCredentialClient$clearCredentialState$1$callback$1 = new InternalIdentityCredentialClient$clearCredentialState$1$callback$1((CSE) obj2);
                IIdentityCredentialService iIdentityCredentialService = (IIdentityCredentialService) ((AbstractC4160CoH) obj).A03();
                ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true));
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                parcelObtain.writeStrongBinder(internalIdentityCredentialClient$clearCredentialState$1$callback$1.asBinder());
                parcelObtain.writeInt(1);
                clearCredentialStateRequest2.writeToParcel(parcelObtain, 0);
                parcelObtain.writeInt(1);
                apiMetadata.writeToParcel(parcelObtain, 0);
                ((IIdentityCredentialService$Stub$Proxy) iIdentityCredentialService).A00(parcelObtain, 9);
            }
        };
        CSC cscA01 = AbstractC4178Com.A01(c4252CrP, c4231CqfA00, 32708, 1);
        cscA01.A06(new C4954DHn(new C7595F5i(cancellationSignal, interfaceC4370CuQ, executor, 0), 0), AbstractC3097ByB.A00);
        cscA01.A0E(new F5I(cancellationSignal, c4389Cup, interfaceC4370CuQ, this, executor, 0));
    }

    public void onCreateCredential(Context context, AbstractC4451CwT abstractC4451CwT, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ) {
        AnonymousClass005.A12(context, executor, interfaceC4370CuQ, 0);
        if (!A00(cancellationSignal)) {
            throw C8j3.A18("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    @Override // X.InterfaceC4309Csx
    public void onGetCredential(Context context, C4294Csh c4294Csh, final CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4370CuQ<C4381Cug, GetCredentialException> interfaceC4370CuQ) {
        AnonymousClass005.A0y(context, c4294Csh, executor);
        C7384Etj.A0Y(interfaceC4370CuQ, 4);
        if (A00(cancellationSignal)) {
            return;
        }
        List<AbstractC4308Csw> list = c4294Csh.A01;
        Iterator<AbstractC4308Csw> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator<AbstractC4308Csw> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Iterator<AbstractC4308Csw> it3 = list.iterator();
            while (it3.hasNext()) {
                if (it3.next() instanceof C4307Csv) {
                    new C4289CsX(context).A05(c4294Csh, cancellationSignal, executor, interfaceC4370CuQ);
                    return;
                }
            }
            new C4288CsU(context).A05(c4294Csh, cancellationSignal, executor, interfaceC4370CuQ);
            return;
        }
        final C4296Csj c4296Csj = new C4296Csj(context);
        c4296Csj.A00 = cancellationSignal;
        c4296Csj.A01 = interfaceC4370CuQ;
        c4296Csj.A02 = executor;
        if (A00(cancellationSignal)) {
            return;
        }
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundleA0N.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", c4294Csh.A02);
        bundleA0N.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", c4294Csh.A00);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (AbstractC4308Csw abstractC4308Csw : list) {
            arrayListA0i.add(new CredentialOption(abstractC4308Csw.A01, abstractC4308Csw.A00, abstractC4308Csw.A02, "", "", ""));
        }
        final GetCredentialRequest getCredentialRequest = new GetCredentialRequest(bundleA0N, new ResultReceiver(null), null, arrayListA0i);
        Context context2 = c4296Csj.A03;
        C7384Etj.A0Y(context2, 0);
        C4252CrP c4252CrP = new C4252CrP(context2, InterfaceC3786CeU.A00, C4252CrP.A00, C4276Cs4.A02);
        C4231Cqf c4231CqfA00 = C4232Cqg.A00();
        c4231CqfA00.A03 = new Feature[]{AbstractC4335Cta.A00};
        c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.CrO
            @Override // X.InterfaceC4375CuV
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                GetCredentialRequest getCredentialRequest2 = getCredentialRequest;
                InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1 = new InternalIdentityCredentialClient$getCredential$1$callback$1((CSE) obj2);
                IIdentityCredentialService iIdentityCredentialService = (IIdentityCredentialService) ((AbstractC4160CoH) obj).A03();
                ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true));
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                parcelObtain.writeStrongBinder(internalIdentityCredentialClient$getCredential$1$callback$1.asBinder());
                parcelObtain.writeInt(1);
                getCredentialRequest2.writeToParcel(parcelObtain, 0);
                parcelObtain.writeInt(1);
                apiMetadata.writeToParcel(parcelObtain, 0);
                ((IIdentityCredentialService$Stub$Proxy) iIdentityCredentialService).A00(parcelObtain, 1);
            }
        };
        CSC cscA01 = AbstractC4178Com.A01(c4252CrP, c4231CqfA00, 32701, 0);
        cscA01.A06(new C4954DHn(new G0U() { // from class: X.Csf
            @Override // X.G0U
            public final Object invoke(Object obj) {
                CancellationSignal cancellationSignal2 = cancellationSignal;
                C4296Csj c4296Csj2 = c4296Csj;
                Executor executor2 = executor;
                InterfaceC4370CuQ interfaceC4370CuQ2 = interfaceC4370CuQ;
                PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) obj;
                if (!CredentialProviderPlayServicesImpl.A00(cancellationSignal2)) {
                    Context context3 = c4296Csj2.A03;
                    Intent intent = new Intent(context3, (Class<?>) HiddenActivity.class);
                    c4296Csj2.A02(intent, c4296Csj2.A04, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingGetCredentialHandle.A00);
                    try {
                        context3.startActivity(intent);
                    } catch (Exception unused) {
                        C7593F5g.A00(cancellationSignal2, interfaceC4370CuQ2, executor2, 16);
                    }
                }
                return Unit.INSTANCE;
            }
        }, 4), AbstractC3097ByB.A00);
        cscA01.A0E(new F5I(interfaceC4370CuQ, c4296Csj, cancellationSignal, c4294Csh, executor, 1));
    }

    @Override // X.InterfaceC4309Csx
    public /* synthetic */ void onPrepareCredential(C4294Csh c4294Csh, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ) {
    }

    public final void setGoogleApiAvailability(C4001CjU c4001CjU) {
        C7384Etj.A0Y(c4001CjU, 0);
        this.googleApiAvailability = c4001CjU;
    }

    public static final boolean A00(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i(TAG, "No cancellationSignal found");
            return false;
        }
        if (!cancellationSignal.isCanceled()) {
            return false;
        }
        Log.i(TAG, "the flow has been canceled");
        return true;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.A01(context, i);
    }

    public static final Unit onClearCredential$lambda$0(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        executor.execute(new Runnable() { // from class: X.Ctb
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(interfaceC4370CuQ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void onClearCredential$lambda$0$0(InterfaceC4370CuQ interfaceC4370CuQ) {
        interfaceC4370CuQ.AT2(new ClearCredentialProviderConfigurationException("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    public static final Unit onClearCredential$lambda$1$0(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new Runnable() { // from class: X.Cte
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda6";

            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4370CuQ.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onClearCredential$lambda$3$0(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ, final C10543Hqv c10543Hqv) {
        executor.execute(new Runnable() { // from class: X.CtR
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(interfaceC4370CuQ, c10543Hqv);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void onClearCredential$lambda$3$0$0(InterfaceC4370CuQ interfaceC4370CuQ, C10543Hqv c10543Hqv) {
        interfaceC4370CuQ.AT2(c10543Hqv.element);
    }

    public static final Unit onClearCredential$lambda$4$0(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: X.Cto
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda19";

            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4370CuQ.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, C4389Cup c4389Cup, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ, Exception exc) {
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(c4389Cup, cancellationSignal, executor, interfaceC4370CuQ);
    }

    public static final Unit onCreateCredential$lambda$0(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        executor.execute(new Runnable() { // from class: X.Ctc
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda5";

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(interfaceC4370CuQ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void onCreateCredential$lambda$0$0(InterfaceC4370CuQ interfaceC4370CuQ) {
        interfaceC4370CuQ.AT2(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    public static final Unit onGetCredential$lambda$0(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        executor.execute(new Runnable() { // from class: X.Ctn
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda17";

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(interfaceC4370CuQ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onGetCredential$lambda$1(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        executor.execute(new Runnable() { // from class: X.Ctm
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda16";

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(interfaceC4370CuQ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void onGetCredential$lambda$1$0(InterfaceC4370CuQ interfaceC4370CuQ) {
        interfaceC4370CuQ.AT2(new GetCredentialProviderConfigurationException("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(C4389Cup c4389Cup, final CancellationSignal cancellationSignal, final Executor executor, final InterfaceC4370CuQ<Void, ClearCredentialException> interfaceC4370CuQ) {
        final C4241CrD c4241CrDA00 = CRy.A00(this.context);
        c4241CrDA00.A01.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = AbstractC4272Cry.A00;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw C8j3.A17();
        }
        C4163CoN.A03();
        C4231Cqf c4231CqfA00 = C4232Cqg.A00();
        c4231CqfA00.A03 = new Feature[]{AbstractC4328CtQ.A01};
        c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.CrE
            @Override // X.InterfaceC4375CuV
            public final void accept(Object obj, Object obj2) {
                C4241CrD c4241CrD = c4241CrDA00;
                zban zbanVar = new zban((CSE) obj2);
                zba zbaVar = (zba) ((AbstractC4160CoH) obj).A03();
                String str = c4241CrD.A00;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zbaVar.A00);
                parcelObtain.writeStrongBinder(zbanVar.asBinder());
                parcelObtain.writeString(str);
                zbaVar.A01(parcelObtain, 2);
            }
        };
        c4231CqfA00.A02 = false;
        CSC cscA01 = AbstractC4178Com.A01(c4241CrDA00, c4231CqfA00, 1554, 1);
        cscA01.A06(new C4954DHn(new C7595F5i(cancellationSignal, interfaceC4370CuQ, executor, 1), 1), AbstractC3097ByB.A00);
        cscA01.A0E(new CSP() { // from class: X.CtA
            @Override // X.CSP
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2(this, cancellationSignal, executor, interfaceC4370CuQ, exc);
            }
        });
    }

    public static final Unit runFallbackClearCredFlow$lambda$0$0(Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: X.Ctg
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda7";

            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4370CuQ.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit runFallbackClearCredFlow$lambda$2$0$0(final Exception exc, Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        Log.w(TAG, AnonymousClass007.A0a("During clear credential sign out failed with ", exc));
        executor.execute(new Runnable() { // from class: X.CtW
            public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda18";

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0(interfaceC4370CuQ, exc);
            }
        });
        return Unit.INSTANCE;
    }

    public final C4001CjU getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        int iA01 = this.googleApiAvailability.A01(this.context, i);
        if (iA01 == 0) {
            return true;
        }
        Log.w(TAG, AnonymousClass007.A0a("Connection with Google Play Services was not successful. Connection result is: ", new ConnectionResult(iA01)));
        return false;
    }

    public static final void onGetCredential$lambda$0$0(InterfaceC4370CuQ interfaceC4370CuQ) {
        interfaceC4370CuQ.AT2(new GetCredentialProviderConfigurationException("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "this device requires a Google Play Services update for the given feature to be supported"));
    }

    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(InterfaceC4370CuQ interfaceC4370CuQ, Exception exc) {
        interfaceC4370CuQ.AT2(new ClearCredentialUnknownException("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", exc.getMessage()));
    }

    public void onSignalCredentialState(AbstractC4450CwS abstractC4450CwS, Executor executor, final InterfaceC4370CuQ interfaceC4370CuQ) {
        AnonymousClass005.A0x(abstractC4450CwS, executor, interfaceC4370CuQ);
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_SIGNAL_API)) {
            executor.execute(new Runnable() { // from class: X.Ctp
                public static final String __redex_internal_original_name = "CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda21";

                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4370CuQ.AT2(new SignalCredentialStateProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
                }
            });
        } else {
            C7384Etj.A0Y(this.context, 0);
            C7384Etj.A0Y(null, 0);
            throw F60.createAndThrow();
        }
    }

    @Override // X.InterfaceC4309Csx
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public /* synthetic */ void onGetCredential(Context context, C4349Ctr c4349Ctr, CancellationSignal cancellationSignal, Executor executor, InterfaceC4370CuQ interfaceC4370CuQ) {
    }
}
