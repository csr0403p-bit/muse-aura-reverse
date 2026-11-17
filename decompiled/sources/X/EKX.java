package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class EKX implements Function0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C6617EKk A01;
    public final /* synthetic */ C6614EKg A02;
    public final /* synthetic */ UUID A03;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EnumC6619EKm enumC6619EKm;
        C6614EKg c6614EKg = this.A02;
        UUID uuid = this.A03;
        C6617EKk c6617EKk = this.A01;
        Context context = this.A00;
        String string = uuid.toString();
        C6605EJh c6605EJh = (C6605EJh) c6614EKg.A01;
        C7384Etj.A0Y(string, 0);
        EKE eke = (EKE) C7596F5j.A00(c6605EJh.A01, string, 12);
        if (eke == null || (enumC6619EKm = eke.A0E) == EnumC6619EKm.A07 || enumC6619EKm == EnumC6619EKm.A05 || enumC6619EKm == EnumC6619EKm.A03) {
            throw C3cG.A0Q("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        EKU eku = (EKU) c6614EKg.A00;
        synchronized (eku.A09) {
            EK9.A00();
            Log.i(EKU.A0B, FGI.A0U("Moving WorkSpec (", string, ") to the foreground"));
            WorkerWrapper workerWrapperRemove = eku.A05.remove(string);
            if (workerWrapperRemove != null) {
                if (eku.A01 == null) {
                    Context context2 = eku.A00;
                    C7384Etj.A0Y(context2, 0);
                    Object systemService = context2.getApplicationContext().getSystemService("power");
                    C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                    String strA0M = FGI.A0M("WorkManager: ", "ProcessorForegroundLck");
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strA0M);
                    synchronized (CVT.A00) {
                        CVT.A01.put(wakeLockNewWakeLock, strA0M);
                    }
                    C7384Etj.A0X(wakeLockNewWakeLock);
                    eku.A01 = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.acquire();
                }
                eku.A06.put(string, workerWrapperRemove);
                Context context3 = eku.A00;
                C6630ELa c6630ELaA00 = AbstractC6646ELq.A00(workerWrapperRemove.A05);
                Intent intent = new Intent(context3, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_START_FOREGROUND");
                intent.putExtra("KEY_WORKSPEC_ID", c6630ELaA00.A01);
                intent.putExtra("KEY_GENERATION", c6630ELaA00.A00);
                intent.putExtra("KEY_NOTIFICATION_ID", c6617EKk.A01);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6617EKk.A00);
                intent.putExtra("KEY_NOTIFICATION", c6617EKk.A02);
                context3.startForegroundService(intent);
            }
        }
        C6630ELa c6630ELaA002 = AbstractC6646ELq.A00(eke);
        Intent intent2 = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent2.setAction("ACTION_NOTIFY");
        intent2.putExtra("KEY_NOTIFICATION_ID", c6617EKk.A01);
        intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6617EKk.A00);
        intent2.putExtra("KEY_NOTIFICATION", c6617EKk.A02);
        intent2.putExtra("KEY_WORKSPEC_ID", c6630ELaA002.A01);
        intent2.putExtra("KEY_GENERATION", c6630ELaA002.A00);
        context.startService(intent2);
        return null;
    }

    public /* synthetic */ EKX(Context context, C6617EKk c6617EKk, C6614EKg c6614EKg, UUID uuid) {
        this.A02 = c6614EKg;
        this.A03 = uuid;
        this.A01 = c6617EKk;
        this.A00 = context;
    }
}
