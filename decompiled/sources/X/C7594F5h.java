package X;

import android.net.ConnectivityManager;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.F5h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7594F5h implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C7594F5h(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Executor executor;
        Runnable runnable;
        switch (this.$t) {
            case 0:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0((Exception) this.A00, (Executor) this.A01, (InterfaceC4370CuQ) this.A02);
            case 1:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0((Executor) this.A00, (InterfaceC4370CuQ) this.A01, (C10543Hqv) this.A02);
            case 2:
                executor = (Executor) this.A00;
                final InterfaceC4370CuQ interfaceC4370CuQ = (InterfaceC4370CuQ) this.A01;
                final Object obj = this.A02;
                runnable = new Runnable() { // from class: X.Ctx
                    public static final String __redex_internal_original_name = "CredentialProviderController$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC4370CuQ.AT2(obj);
                    }
                };
                executor.execute(runnable);
                return Unit.INSTANCE;
            case 3:
                executor = (Executor) this.A00;
                final InterfaceC4370CuQ interfaceC4370CuQ2 = (InterfaceC4370CuQ) this.A01;
                final C4381Cug c4381Cug = (C4381Cug) this.A02;
                runnable = new Runnable() { // from class: X.Cth
                    public static final String __redex_internal_original_name = "ResponseUtils$Companion$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC4370CuQ2.onResult(c4381Cug);
                    }
                };
                executor.execute(runnable);
                return Unit.INSTANCE;
            case 4:
                executor = (Executor) this.A00;
                final InterfaceC4370CuQ interfaceC4370CuQ3 = (InterfaceC4370CuQ) this.A01;
                final GetCredentialException getCredentialException = (GetCredentialException) this.A02;
                runnable = new Runnable() { // from class: X.CtT
                    public static final String __redex_internal_original_name = "ResponseUtils$Companion$$ExternalSyntheticLambda8";

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4370CuQ interfaceC4370CuQ4 = interfaceC4370CuQ3;
                        Throwable thA0T = getCredentialException;
                        if (thA0T == null) {
                            thA0T = BV6.A0T("No provider data returned");
                        }
                        interfaceC4370CuQ4.AT2(thA0T);
                    }
                };
                executor.execute(runnable);
                return Unit.INSTANCE;
            case 5:
                F1F f1f = (F1F) this.A00;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.A01;
                ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) this.A02;
                if (f1f.element) {
                    EK9.A00().A02(AbstractC6620EKo.A00, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                }
                return Unit.INSTANCE;
            default:
                ELE ele = (ELE) this.A00;
                Object obj2 = this.A01;
                BzB bzB = (BzB) this.A02;
                String string = obj2.toString();
                EK9 ek9A00 = EK9.A00();
                String str = ELE.A02;
                ek9A00.A02(str, C3cJ.A0L(bzB, " (", C3cG.A0f(obj2, "Updating progress for ")));
                WorkDatabase workDatabase = ele.A00;
                workDatabase.beginTransaction();
                try {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) workDatabase;
                    C6605EJh c6605EJh = (C6605EJh) workDatabase_Impl.A06.getValue();
                    C7384Etj.A0Y(string, 0);
                    EKE eke = (EKE) C7596F5j.A00(c6605EJh.A01, string, 12);
                    if (eke == null) {
                        throw C3cG.A0Q("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (eke.A0E == EnumC6619EKm.A06) {
                        EMr eMr = new EMr(bzB, string);
                        C6644ELo c6644ELo = (C6644ELo) workDatabase_Impl.A05.getValue();
                        BV5.A1D(c6644ELo.A01, new C7592F5f(12, c6644ELo, eMr));
                    } else {
                        EK9.A00();
                        BV4.A1K("Ignoring setProgressAsync(...). WorkSpec (", string, ") is not in a RUNNING state.", str);
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    return null;
                } finally {
                }
        }
    }
}
