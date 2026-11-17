package X;

import com.facebook.common.exceptionhandler.ExitAppReportingStackTraceButWithoutUserFacingCrashDialogException;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class C6U implements Runnable {
    public static final String __redex_internal_original_name = "AppExitUtil$exitWhenNextInBackground$killIfInBackground$1";
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Callable<Boolean> A02;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;Ljava/lang/Runnable;Ljava/lang/String;)V */
    public C6U(Runnable runnable, String str, Callable callable) {
        this.A02 = callable;
        this.A00 = runnable;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if ((C5V.A04 == null || !C5V.A04.A04) && !AnonymousClass001.A1X(this.A02.call())) {
            CFK.A04("AppExitUtil", "Killing process in background.");
            this.A00.run();
            String str = this.A01;
            C7384Etj.A0X(str);
            C6T.A00(new ExitAppReportingStackTraceButWithoutUserFacingCrashDialogException(str));
        }
    }
}
