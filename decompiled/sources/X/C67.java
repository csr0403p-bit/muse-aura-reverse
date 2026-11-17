package X;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.facebook.common.exceptionhandler.ExitAppReportingStackTraceButWithoutUserFacingCrashDialogException;
import com.facebook.common.exceptionhandler.UserInitiatedExpectedAppExitException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class C67 implements Thread.UncaughtExceptionHandler {
    public static C67 A03;
    public final Thread.UncaughtExceptionHandler A01;
    public byte[] mOomReservation;
    public final Object A00 = C3cG.A0T();
    public volatile List<C6m> A02 = Collections.unmodifiableList(C3cG.A0h());

    public static synchronized C67 A00() {
        C67 c67;
        c67 = A03;
        if (c67 == null) {
            Log.d("ExceptionHandlerManager", "ExceptionHandlerManager not explicitly initialized, using default mode");
            if (A03 != null) {
                throw C3cG.A0Q("Already initialized!");
            }
            Log.d("ExceptionHandlerManager", FGI.A0r("initializing exception handler manager, prioritized=", true));
            C67 c672 = new C67(Thread.getDefaultUncaughtExceptionHandler());
            A03 = c672;
            Thread.setDefaultUncaughtExceptionHandler(c672);
            c67 = A03;
        }
        return c67;
    }

    public static synchronized void A02(C7U c7u) {
        C67 c67A00 = A00();
        synchronized (c67A00) {
            ArrayList arrayListA0t = BV4.A0t(c67A00.A02);
            arrayListA0t.add(new C6m(c7u));
            Collections.sort(arrayListA0t);
            c67A00.A02 = Collections.unmodifiableList(arrayListA0t);
        }
    }

    public C67(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.mOomReservation = null;
        this.A01 = uncaughtExceptionHandler;
        this.mOomReservation = new byte[4096];
    }

    public static void A01() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
            Log.e("ExceptionHandlerManager", "Error during exception handling", th);
        }
        try {
            System.exit(10);
        } catch (Throwable th2) {
            Log.e("ExceptionHandlerManager", "Error during exception handling", th2);
        }
        while (true) {
        }
    }

    public static void A03(Throwable th) {
        String str;
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length + 1];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
        if (C5V.A04 == null || (str = C5V.A04.A03) == null) {
            str = "unknown";
        }
        stackTraceElementArr[length] = new StackTraceElement("Z", "init", str, -1);
        th.setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        String message;
        String strA0Y = C3cI.A0Y(th);
        if (strA0Y.equals("CannotDeliverBroadcastException")) {
            if (Build.VERSION.SDK_INT == 33) {
                return;
            }
        } else if (strA0Y.equals("SecurityException") && (message = th.getMessage()) != null && message.contains("Unable to find app for caller") && message.contains("publishing content providers")) {
            return;
        }
        synchronized (this.A00) {
            try {
                if (Process.getThreadPriority(0) > -10) {
                    Process.setThreadPriority(-10);
                }
            } catch (Exception unused) {
            }
            boolean z = th instanceof OutOfMemoryError;
            this.mOomReservation = null;
            List<C6m> list = this.A02;
            try {
                try {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        try {
                            list.get(size).A00.AN5(thread, th);
                        } catch (Throwable th2) {
                            if (z) {
                                Log.e("ExceptionHandlerManager", "OOM while handling OOM");
                            } else {
                                Log.e("ExceptionHandlerManager", "Error during exception handling", th2);
                            }
                        }
                    }
                    A03(th);
                } catch (Throwable unused2) {
                    A03(th);
                    if ((th instanceof ExitAppReportingStackTraceButWithoutUserFacingCrashDialogException) || (th instanceof UserInitiatedExpectedAppExitException)) {
                        Log.w("ExceptionHandlerManager", BV5.A0n("Exit: ", th));
                    } else {
                        uncaughtExceptionHandler = this.A01;
                        if (uncaughtExceptionHandler != null) {
                        }
                    }
                }
                if ((th instanceof ExitAppReportingStackTraceButWithoutUserFacingCrashDialogException) || (th instanceof UserInitiatedExpectedAppExitException)) {
                    Log.w("ExceptionHandlerManager", BV5.A0n("Exit: ", th));
                } else {
                    uncaughtExceptionHandler = this.A01;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            } catch (Throwable th3) {
                try {
                    Log.e("ExceptionHandlerManager", "Error during exception handling", th3);
                } catch (Throwable unused3) {
                    A01();
                }
            }
            A01();
            throw F60.createAndThrow();
        }
    }
}
