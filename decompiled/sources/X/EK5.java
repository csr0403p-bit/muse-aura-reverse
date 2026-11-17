package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.room.RoomDatabaseKt__RoomDatabaseKt;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.work.OperationKt;
import androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1;
import androidx.work.impl.WorkDatabase;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EK5 extends F3R {
    public static EK5 A0B;
    public static EK5 A0C;
    public static final Object A0D;
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public EKi A02;
    public EKU A03;
    public WorkDatabase A04;
    public EK4 A05;
    public ENP A06;
    public List<ELY> A07;
    public boolean A08 = false;
    public final ELC A09;
    public final C3UX A0A;

    static {
        EK9.A01("WorkManagerImpl");
        A0D = C3cG.A0T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EK5 A00(Context context) {
        EK5 ek5A00;
        synchronized (A0D) {
            try {
                ek5A00 = A0C;
                if (ek5A00 == null) {
                    ek5A00 = A0B;
                }
                if (ek5A00 == null) {
                    Context applicationContext = context.getApplicationContext();
                    Object objInvoke = null;
                    if (applicationContext instanceof CGF) {
                        A01(applicationContext, ((CGF) applicationContext).getWorkManagerConfiguration());
                        ek5A00 = A00(applicationContext);
                    } else {
                        try {
                            objInvoke = applicationContext.getClass().getMethod("getDelegate", null).invoke(applicationContext, null);
                        } catch (Exception unused) {
                        }
                        if (!(objInvoke instanceof CGF)) {
                            throw C3cG.A0Q("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                        }
                        A01(applicationContext, ((CGF) objInvoke).getWorkManagerConfiguration());
                        ek5A00 = A00(applicationContext);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ek5A00;
    }

    public static void A01(Context context, EKi eKi) {
        synchronized (A0D) {
            if (A0C == null) {
                Context applicationContext = context.getApplicationContext();
                EK5 ek5 = A0B;
                if (ek5 == null) {
                    C7384Etj.A0Y(applicationContext, 0);
                    C6616EKj c6616EKj = new C6616EKj(eKi.A07);
                    final Context contextA0I = AnonymousClass001.A0I(applicationContext);
                    ExecutorC6622EKr executorC6622EKr = c6616EKj.A01;
                    C7384Etj.A0U(executorC6622EKr);
                    ED6 ed6 = eKi.A01;
                    applicationContext.getResources();
                    if (C7BY.A0j("androidx.work.workdb")) {
                        throw C60O.A0i("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                    }
                    EEk eEk = new EEk(contextA0I, WorkDatabase.class, "androidx.work.workdb");
                    eEk.A00 = new InterfaceC6553EEo() { // from class: X.EEm
                        @Override // X.InterfaceC6553EEo
                        public final EET A7T(C6552EEn c6552EEn) {
                            Context context2 = contextA0I;
                            String str = c6552EEn.A02;
                            ECx eCx = c6552EEn.A01;
                            if (str == null || str.length() == 0) {
                                throw C60O.A0i("Must set a non-null database name to a configuration that uses the no backup directory.");
                            }
                            return new EET(context2, eCx, str, true, true);
                        }
                    };
                    eEk.A02 = executorC6622EKr;
                    eEk.A0B.add(new ED5(ed6));
                    eEk.A01(EMK.A00);
                    eEk.A01(new ECz(contextA0I, 2, 3));
                    eEk.A01(EML.A00);
                    eEk.A01(EMM.A00);
                    eEk.A01(new ECz(contextA0I, 5, 6));
                    eEk.A01(EMN.A00);
                    eEk.A01(EMO.A00);
                    eEk.A01(EMP.A00);
                    eEk.A01(new ECy(contextA0I));
                    eEk.A01(new ECz(contextA0I, 10, 11));
                    eEk.A01(EMH.A00);
                    eEk.A01(EMI.A00);
                    eEk.A01(EMJ.A00);
                    eEk.A01(ELI.A00);
                    eEk.A01(new ECz(contextA0I, 21, 22));
                    eEk.A06 = false;
                    eEk.A05 = true;
                    eEk.A04 = true;
                    WorkDatabase workDatabase = (WorkDatabase) eEk.A00();
                    ELC elc = new ELC(AnonymousClass001.A0I(applicationContext), c6616EKj);
                    EKU eku = new EKU(applicationContext.getApplicationContext(), eKi, workDatabase, c6616EKj);
                    EK6 ek6 = EK6.A00;
                    C7384Etj.A0Y(workDatabase, 3);
                    ek5 = new EK5(applicationContext.getApplicationContext(), eKi, eku, workDatabase, elc, c6616EKj, ek6.invoke(applicationContext, eKi, c6616EKj, workDatabase, elc, eku));
                    A0B = ek5;
                }
                A0C = ek5;
            } else if (A0B != null) {
                throw C3cG.A0Q("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    public final void A07() {
        synchronized (A0D) {
            this.A08 = true;
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
                this.A00 = null;
            }
        }
    }

    public final void A08() {
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            try {
                AbstractC3136BzG.A00("ReschedulingWork");
            } finally {
                if (zIsEnabled) {
                    Trace.endSection();
                }
            }
        }
        EKB.A02(this.A01);
        WorkDatabase workDatabase = this.A04;
        BV5.A1E(((C6605EJh) F0C.A01(workDatabase)).A01, new C7588F5b(9));
        EKK.A00(workDatabase, this.A07);
    }

    public final void A09(String str) {
        ENF enf = this.A02.A04;
        String strA0M = FGI.A0M("CancelWorkByTag_", str);
        ExecutorC6622EKr executorC6622EKr = ((C6616EKj) this.A06).A01;
        C7384Etj.A0U(executorC6622EKr);
        OperationKt.A00(enf, strA0M, executorC6622EKr, new C7600F5n(this, str, 2));
    }

    public final void A0A(String str) {
        ENF enf = this.A02.A04;
        String strA0M = FGI.A0M("CancelWorkByName_", str);
        ExecutorC6622EKr executorC6622EKr = ((C6616EKj) this.A06).A01;
        C7384Etj.A0U(executorC6622EKr);
        OperationKt.A00(enf, strA0M, executorC6622EKr, new C7600F5n(this, str, 3));
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EKi;LX/ENP;Landroidx/work/impl/WorkDatabase;Ljava/util/List<LX/ELY;>;LX/EKU;LX/ELC;)V */
    public EK5(Context context, final EKi eKi, EKU eku, final WorkDatabase workDatabase, ELC elc, ENP enp, final List list) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw C3cG.A0Q("Cannot initialize WorkManager in direct boot mode");
        }
        EK9 ek9 = new EK9(4);
        synchronized (EK9.A01) {
            if (EK9.A02 == null) {
                EK9.A02 = ek9;
            }
        }
        this.A01 = applicationContext;
        this.A06 = enp;
        this.A04 = workDatabase;
        this.A03 = eku;
        this.A09 = elc;
        this.A02 = eKi;
        this.A07 = list;
        C6616EKj c6616EKj = (C6616EKj) enp;
        C3UX c3ux = c6616EKj.A05;
        this.A0A = c3ux;
        this.A05 = new EK4(workDatabase);
        final ExecutorC6622EKr executorC6622EKr = c6616EKj.A01;
        eku.A02(new InterfaceC6635ELf() { // from class: X.ELM
            @Override // X.InterfaceC6635ELf
            public final void ATA(final C6630ELa c6630ELa, boolean z) {
                Executor executor = executorC6622EKr;
                final WorkDatabase workDatabase2 = workDatabase;
                final List list2 = list;
                final EKi eKi2 = eKi;
                executor.execute(new Runnable() { // from class: X.EKl
                    public static final String __redex_internal_original_name = "Schedulers$$ExternalSyntheticLambda2";

                    @Override // java.lang.Runnable
                    public final void run() {
                        WorkDatabase workDatabase3 = workDatabase2;
                        C6630ELa c6630ELa2 = c6630ELa;
                        List list3 = list2;
                        EL5 el5A01 = F0C.A01(workDatabase3);
                        String str = c6630ELa2.A01;
                        if (AnonymousClass001.A1X(C7596F5j.A00(((C6605EJh) el5A01).A01, str, 15))) {
                            return;
                        }
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((ELY) it.next()).cancel(str);
                        }
                        EKK.A00(workDatabase3, list3);
                    }
                });
            }
        });
        ((C6616EKj) this.A06).A01.execute(new RunnableC6609EJz(applicationContext, this));
        Context context2 = this.A01;
        boolean zA1a = AnonymousClass002.A1a(c3ux, context2);
        if (CGO.A00(context2, eKi)) {
            EIN ein = ((C6605EJh) F0C.A01(workDatabase)).A01;
            C7588F5b c7588F5b = new C7588F5b(7);
            EIR invalidationTracker = ein.getInvalidationTracker();
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, zA1a ? 1 : 0);
            C7384Etj.A0Y(strArr, 0);
            RoomDatabaseKt__RoomDatabaseKt.A00(invalidationTracker.A02);
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.A03;
            HxE<String[], int[]> hxEA05 = triggerBasedInvalidationTracker.A05(strArr);
            String[] strArr2 = hxEA05.first;
            int[] iArr = hxEA05.second;
            C7384Etj.A0Y(strArr2, 0);
            C7384Etj.A0Y(iArr, zA1a ? 1 : 0);
            C20Q c05663ul = new C05663ul(new C07308ij(triggerBasedInvalidationTracker, (HtJ) null, iArr, strArr2, zA1a));
            C5297Dfd c5297Dfd = invalidationTracker.A01;
            C3pU.A02(c3ux, new C10650I0u(new C8900FtH(context2, null), GDB.A01(AbstractC05623ug.A01(new C10650I0u(3, new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(null), new C60I(ein, c7588F5b, AbstractC05623ug.A01(new C10650I0u(0, new C8901FtI(invalidationTracker, null, 0), new C10650I0u(new C8902FtJ(invalidationTracker, null, 0), c5297Dfd != null ? AbstractC05633ui.A01(c05663ul, new AnonymousClass603(0, c5297Dfd.A0A, strArr2)) : c05663ul, zA1a ? 1 : 0))), 0)))), 5));
        }
    }
}
