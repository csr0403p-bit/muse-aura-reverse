package org.webrtc;

import X.C3cG;
import X.C60O;
import X.FGI;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class Logging {
    public static final Logger fallbackLogger = createFallbackLogger();
    public static Loggable loggable;
    public static Severity loggableSeverity;
    public static volatile boolean loggingEnabled;

    public interface Natives {
        void enableLogThreads();

        void enableLogTimeStamps();

        void enableLogToDebugOutput(int i);

        void log(int i, String str, String str2);
    }

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static Logger createFallbackLogger() throws SecurityException {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        if (loggable != null) {
            throw C3cG.A0Q("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
        }
        LoggingJni.get().enableLogToDebugOutput(severity.ordinal());
        loggingEnabled = true;
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        if (str == null || str2 == null) {
            throw C60O.A0i("Logging tag or message may not be null.");
        }
        Loggable loggable2 = loggable;
        if (loggable2 != null) {
            if (severity.ordinal() >= loggableSeverity.ordinal()) {
                loggable2.onLogMessage(str2, severity, str);
            }
        } else if (loggingEnabled) {
            LoggingJni.get().log(severity.ordinal(), str, str2);
        } else {
            int iOrdinal = severity.ordinal();
            fallbackLogger.log(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? Level.FINE : Level.SEVERE : Level.WARNING : Level.INFO, FGI.A0U(str, ": ", str2));
        }
    }

    public static void v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    public static void w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    public static void enableLogThreads() {
        LoggingJni.get().enableLogThreads();
    }

    public static void enableLogTimeStamps() {
        LoggingJni.get().enableLogTimeStamps();
    }

    public static void e(String str, String str2, Throwable th) {
        log(Severity.LS_ERROR, str, str2);
        Severity severity = Severity.LS_ERROR;
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }

    public static void w(String str, String str2, Throwable th) {
        log(Severity.LS_WARNING, str, str2);
        Severity severity = Severity.LS_WARNING;
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }
}
