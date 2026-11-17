package X;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class CHY extends Handler {
    public static final CHY A00 = new CHY();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        C7384Etj.A0Y(logRecord, 0);
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = AbstractC5302Dfl.A01;
        String loggerName = logRecord.getLoggerName();
        C7384Etj.A0U(loggerName);
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else {
            i = 3;
            if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
                i = 4;
            }
        }
        String message = logRecord.getMessage();
        C7384Etj.A0U(message);
        Throwable thrown = logRecord.getThrown();
        String strA0p = C60O.A0p(loggerName, AbstractC5302Dfl.A00);
        if (strA0p == null) {
            strA0p = BQG.A17(loggerName, 23);
        }
        if (Log.isLoggable(strA0p, i)) {
            if (thrown != null) {
                StringBuilder sbA0g = C3cG.A0g(message);
                sbA0g.append('\n');
                message = C8j3.A14(Log.getStackTraceString(thrown), sbA0g);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iA08 = C7BY.A08(message, '\n', i2);
                if (iA08 == -1) {
                    iA08 = length;
                }
                do {
                    iMin = Math.min(iA08, i2 + 4000);
                    Log.println(i, strA0p, message.substring(i2, iMin));
                    i2 = iMin;
                } while (iMin < iA08);
                i2 = iMin + 1;
            }
        }
    }
}
