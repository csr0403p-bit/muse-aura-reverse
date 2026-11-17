package X;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.WorkForegroundKt$workForeground$2;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* renamed from: X.EKh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6615EKh {
    public static final String A00 = C7384Etj.A0I("WorkForegroundRunnable");

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EKE;LX/EKa;LX/EL0;LX/ENP;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(Context context, EL0 el0, AbstractC6610EKa abstractC6610EKa, EKE eke, ENP enp, HtJ htJ) {
        if (eke.A0L && Build.VERSION.SDK_INT < 31) {
            Executor executor = ((C6616EKj) enp).A02;
            C7384Etj.A0U(executor);
            Object objA00 = GAo.A00(htJ, Hu0.A01(executor), new WorkForegroundKt$workForeground$2(context, el0, abstractC6610EKa, eke, null));
            if (objA00 == EnumC10460Hji.A02) {
                return objA00;
            }
        }
        return Unit.INSTANCE;
    }
}
