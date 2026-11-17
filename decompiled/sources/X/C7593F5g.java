package X;

import android.net.ConnectivityManager;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.F5g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7593F5g implements Ht9, Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C7593F5g(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(CancellationSignal cancellationSignal, Object obj, Object obj2, int i) {
        C7593F5g c7593F5g = new C7593F5g(i, obj, obj2);
        if (CredentialProviderPlayServicesImpl.A00(cancellationSignal)) {
            return;
        }
        c7593F5g.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Executor executorA04;
        Runnable runnable;
        switch (this.$t) {
            case 0:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0((Executor) this.A00, (InterfaceC4370CuQ) this.A01);
            case 1:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0((Executor) this.A00, (InterfaceC4370CuQ) this.A01);
            case 2:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0((Executor) this.A00, (InterfaceC4370CuQ) this.A01);
            case 3:
                ((G0U) this.A00).invoke(((C10543Hqv) this.A01).element);
                return Unit.INSTANCE;
            case 4:
                executorA04 = (Executor) this.A00;
                final InterfaceC4370CuQ interfaceC4370CuQ = (InterfaceC4370CuQ) this.A01;
                runnable = new Runnable() { // from class: X.Ctj
                    public static final String __redex_internal_original_name = "ResponseUtils$Companion$$ExternalSyntheticLambda2";

                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC4370CuQ.AT2(BV6.A0T("No provider data returned."));
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 5:
                final C4288CsU c4288CsU = (C4288CsU) this.A00;
                final C4381Cug c4381Cug = (C4381Cug) this.A01;
                executorA04 = c4288CsU.A04();
                runnable = new Runnable() { // from class: X.CtF
                    public static final String __redex_internal_original_name = "CredentialProviderBeginSignInController$$ExternalSyntheticLambda3";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4288CsU c4288CsU2 = c4288CsU;
                        c4288CsU2.A03().onResult(c4381Cug);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 6:
                final C4288CsU c4288CsU2 = (C4288CsU) this.A00;
                final C10543Hqv c10543Hqv = (C10543Hqv) this.A01;
                executorA04 = c4288CsU2.A04();
                runnable = new Runnable() { // from class: X.CtD
                    public static final String __redex_internal_original_name = "CredentialProviderBeginSignInController$$ExternalSyntheticLambda7";

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        c4288CsU2.A03().AT2(c10543Hqv.element);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 7:
                final C4288CsU c4288CsU3 = (C4288CsU) this.A00;
                final GetCredentialException getCredentialException = (GetCredentialException) this.A01;
                executorA04 = c4288CsU3.A04();
                runnable = new Runnable() { // from class: X.CtI
                    public static final String __redex_internal_original_name = "CredentialProviderBeginSignInController$$ExternalSyntheticLambda6";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4288CsU c4288CsU4 = c4288CsU3;
                        c4288CsU4.A03().AT2(getCredentialException);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 8:
                final C4288CsU c4288CsU4 = (C4288CsU) this.A00;
                final GetCredentialUnknownException getCredentialUnknownException = (GetCredentialUnknownException) this.A01;
                executorA04 = c4288CsU4.A04();
                runnable = new Runnable() { // from class: X.CtE
                    public static final String __redex_internal_original_name = "CredentialProviderBeginSignInController$$ExternalSyntheticLambda17";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4288CsU c4288CsU5 = c4288CsU4;
                        c4288CsU5.A03().AT2(getCredentialUnknownException);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 9:
                final C4288CsU c4288CsU5 = (C4288CsU) this.A00;
                final GetCredentialException getCredentialException2 = (GetCredentialException) this.A01;
                executorA04 = c4288CsU5.A04();
                runnable = new Runnable() { // from class: X.CtG
                    public static final String __redex_internal_original_name = "CredentialProviderBeginSignInController$$ExternalSyntheticLambda16";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4288CsU c4288CsU6 = c4288CsU5;
                        c4288CsU6.A03().AT2(getCredentialException2);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 10:
                final C4289CsX c4289CsX = (C4289CsX) this.A00;
                final C4381Cug c4381Cug2 = (C4381Cug) this.A01;
                executorA04 = c4289CsX.A04();
                runnable = new Runnable() { // from class: X.CtJ
                    public static final String __redex_internal_original_name = "CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda8";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4289CsX c4289CsX2 = c4289CsX;
                        c4289CsX2.A03().onResult(c4381Cug2);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 11:
                final C4289CsX c4289CsX2 = (C4289CsX) this.A00;
                final C10543Hqv c10543Hqv2 = (C10543Hqv) this.A01;
                executorA04 = c4289CsX2.A04();
                runnable = new Runnable() { // from class: X.CtO
                    public static final String __redex_internal_original_name = "CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda1";

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        c4289CsX2.A03().AT2(c10543Hqv2.element);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 12:
                final C4289CsX c4289CsX3 = (C4289CsX) this.A00;
                final GetCredentialException getCredentialException3 = (GetCredentialException) this.A01;
                executorA04 = c4289CsX3.A04();
                runnable = new Runnable() { // from class: X.CtL
                    public static final String __redex_internal_original_name = "CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda3";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4289CsX c4289CsX4 = c4289CsX3;
                        c4289CsX4.A03().AT2(getCredentialException3);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 13:
                final C4289CsX c4289CsX4 = (C4289CsX) this.A00;
                final GetCredentialUnknownException getCredentialUnknownException2 = (GetCredentialUnknownException) this.A01;
                executorA04 = c4289CsX4.A04();
                runnable = new Runnable() { // from class: X.CtP
                    public static final String __redex_internal_original_name = "CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda18";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4289CsX c4289CsX5 = c4289CsX4;
                        c4289CsX5.A03().AT2(getCredentialUnknownException2);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 14:
                final C4289CsX c4289CsX5 = (C4289CsX) this.A00;
                final GetCredentialException getCredentialException4 = (GetCredentialException) this.A01;
                executorA04 = c4289CsX5.A04();
                runnable = new Runnable() { // from class: X.CtM
                    public static final String __redex_internal_original_name = "CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda16";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4289CsX c4289CsX6 = c4289CsX5;
                        c4289CsX6.A03().AT2(getCredentialException4);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 15:
                final C4289CsX c4289CsX6 = (C4289CsX) this.A00;
                final GetCredentialUnsupportedException getCredentialUnsupportedException = (GetCredentialUnsupportedException) this.A01;
                executorA04 = c4289CsX6.A04();
                runnable = new Runnable() { // from class: X.CtK
                    public static final String __redex_internal_original_name = "CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda9";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4289CsX c4289CsX7 = c4289CsX6;
                        c4289CsX7.A03().AT2(getCredentialUnsupportedException);
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 16:
                executorA04 = (Executor) this.A00;
                final InterfaceC4370CuQ interfaceC4370CuQ2 = (InterfaceC4370CuQ) this.A01;
                runnable = new Runnable() { // from class: X.CtZ
                    public static final String __redex_internal_original_name = "GetCredentialController$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC4370CuQ2.AT2(BV6.A0T("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    }
                };
                executorA04.execute(runnable);
                return Unit.INSTANCE;
            case 17:
                return EKp.A01((ConnectivityManager) this.A01, (G0U) this.A00);
            case 18:
                EL2 el2 = (EL2) this.A00;
                Object obj = this.A01;
                EL8<T> el8 = el2.A00;
                synchronized (el8.A03) {
                    HashSet hashSet = el8.A04;
                    if (hashSet.remove(obj) && hashSet.isEmpty()) {
                        ELD eld = (ELD) el8;
                        BV4.A1E(EK9.A00(), C3cI.A0Y(eld), ": unregistering receiver", AbstractC6654EMm.A00);
                        eld.A01.unregisterReceiver(eld.A00);
                    }
                }
                return Unit.INSTANCE;
            case 19:
                final EK5 ek5 = (EK5) this.A00;
                final UUID uuid = (UUID) this.A01;
                WorkDatabase workDatabase = ek5.A04;
                C7384Etj.A0U(workDatabase);
                workDatabase.runInTransaction(new Runnable() { // from class: X.EJx
                    public static final String __redex_internal_original_name = "CancelWorkRunnable$$ExternalSyntheticLambda5";

                    @Override // java.lang.Runnable
                    public final void run() {
                        EKJ.A00(ek5, uuid.toString());
                    }
                });
                EKK.A00(workDatabase, ek5.A07);
                return Unit.INSTANCE;
            default:
                return ((G0U) this.A00).invoke(this.A01);
        }
    }
}
