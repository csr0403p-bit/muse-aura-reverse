package com.facebook.rsys.filelogging.gen;

import X.AbstractC7607F5u;
import X.AnonymousClass001;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class LogFileStats {
    public static G50<LogFileStats> CONVERTER = C8925Fth.A00(37);
    public static long sMcfTypeId;
    public final int droppedLogBytes;
    public final int droppedLogsCount;
    public final int logBytes;
    public final int logsCount;

    public static native LogFileStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LogFileStats) {
                LogFileStats logFileStats = (LogFileStats) obj;
                if (this.logsCount != logFileStats.logsCount || this.logBytes != logFileStats.logBytes || this.droppedLogsCount != logFileStats.droppedLogsCount || this.droppedLogBytes != logFileStats.droppedLogBytes) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.logsCount) * 31) + this.logBytes) * 31) + this.droppedLogsCount) * 31) + this.droppedLogBytes;
    }

    public String toString() {
        int i = this.logsCount;
        int i2 = this.logBytes;
        int i3 = this.droppedLogsCount;
        int i4 = this.droppedLogBytes;
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7607F5u.A1P("LogFileStats{logsCount=", ",logBytes=", sbA0w, i, i2);
        AbstractC7607F5u.A1P(",droppedLogsCount=", ",droppedLogBytes=", sbA0w, i3, i4);
        return AnonymousClass001.A0v("}", sbA0w);
    }

    public LogFileStats(int i, int i2, int i3, int i4) {
        this.logsCount = i;
        this.logBytes = i2;
        this.droppedLogsCount = i3;
        this.droppedLogBytes = i4;
    }
}
