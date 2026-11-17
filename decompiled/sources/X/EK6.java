package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class EK6 extends C7438Evz implements G2l<Context, EKi, ENP, WorkDatabase, ELC, EKU, List<? extends ELY>> {
    public static final EK6 A00 = new EK6();

    @Override // X.G2l
    public final /* bridge */ /* synthetic */ List<? extends ELY> invoke(Context context, EKi eKi, ENP enp, WorkDatabase workDatabase, ELC elc, EKU eku) {
        Context context2 = context;
        EKi eKi2 = eKi;
        ENP enp2 = enp;
        WorkDatabase workDatabase2 = workDatabase;
        ELC elc2 = elc;
        EKU eku2 = eku;
        AnonymousClass005.A17(context2, eKi2, enp2, workDatabase2, elc2);
        C7384Etj.A0Y(eku2, 5);
        AII aiiA17 = AIM.A17();
        EKB ekb = new EKB(context2, eKi2, workDatabase2);
        PackageManager packageManager = context2.getPackageManager();
        C7384Etj.A0U(packageManager);
        F3S.A00(new ComponentName(context2, (Class<?>) SystemJobService.class), packageManager, F3b.A00, true);
        EK9.A00().A02(EKK.A00, "Created SystemJobScheduler and enabled SystemJobService");
        aiiA17.add(ekb);
        aiiA17.add(new EKW(context2, eKi2, eku2, new EL6(eku2, enp2), elc2, enp2));
        return AIM.A18(aiiA17);
    }

    public EK6() {
        super(6, ENL.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }
}
