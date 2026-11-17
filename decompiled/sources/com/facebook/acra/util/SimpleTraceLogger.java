package com.facebook.acra.util;

import X.BV4;
import X.C60O;
import android.os.SystemClock;
import java.util.Locale;
import java.util.Queue;

/* loaded from: classes5.dex */
public class SimpleTraceLogger {
    public static final int NO_LIMIT = 0;
    public static final String TAG = "SimpleTraceLogger";
    public Queue<TraceLogLine> mTrace = BV4.A0y();
    public final int mTraceCountLimit;

    public class TraceLogLine {
        public final long time;
        public final String trace;

        public String toString() {
            return String.format(Locale.US, "[%d] %s", Long.valueOf(this.time), this.trace);
        }

        public TraceLogLine(String str, long j) {
            this.trace = str;
            this.time = j;
        }
    }

    public void append(String str) {
        synchronized (this) {
            if (this.mTraceCountLimit > 0 && this.mTrace.size() == this.mTraceCountLimit) {
                this.mTrace.remove();
            }
            this.mTrace.offer(new TraceLogLine(str, SystemClock.uptimeMillis()));
        }
    }

    public synchronized void clear() {
        this.mTrace = BV4.A0y();
    }

    public synchronized String toString(int i) {
        StringBuilder sbA0w;
        sbA0w = C60O.A0w();
        int i2 = 0;
        int iMax = i <= 0 ? 0 : Math.max(this.mTrace.size() - i, 0);
        for (TraceLogLine traceLogLine : this.mTrace) {
            if (i2 >= iMax) {
                BV4.A1O(sbA0w, traceLogLine);
                sbA0w.append('\n');
            }
            i2++;
        }
        return sbA0w.toString();
    }

    public SimpleTraceLogger(int i) {
        this.mTraceCountLimit = i;
    }

    public void append(String str, Object... objArr) {
        append(String.format(str, objArr));
    }

    public synchronized String toString() {
        return toString(0);
    }
}
