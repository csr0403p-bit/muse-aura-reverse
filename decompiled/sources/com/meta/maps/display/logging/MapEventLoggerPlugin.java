package com.meta.maps.display.logging;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.meta.maps.NativeBase;
import com.meta.maps.core.Analytics;
import com.meta.maps.display.MaplibrePlugin;

/* loaded from: classes4.dex */
public final class MapEventLoggerPlugin extends MaplibrePlugin {
    public static final Companion Companion = new Companion();
    public LoggingLevel consoleLogLevel;
    public String joinKey;
    public LoggingLevel qplLogLevel;
    public String requestId;
    public String surfaceId;
    public SurfaceType surfaceType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoggingLevel {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ LoggingLevel[] $VALUES;
        public static final LoggingLevel ERRORS;
        public static final LoggingLevel EVERYTHING;
        public static final LoggingLevel INFO;
        public static final LoggingLevel NONE;
        public static final LoggingLevel VERBOSE;
        public final int value;

        static {
            LoggingLevel loggingLevel = new LoggingLevel(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, 0);
            NONE = loggingLevel;
            LoggingLevel loggingLevel2 = new LoggingLevel("ERRORS", 1, 1);
            ERRORS = loggingLevel2;
            LoggingLevel loggingLevel3 = new LoggingLevel("INFO", 2, 2);
            INFO = loggingLevel3;
            LoggingLevel loggingLevel4 = new LoggingLevel("VERBOSE", 3, 3);
            VERBOSE = loggingLevel4;
            LoggingLevel loggingLevel5 = new LoggingLevel("EVERYTHING", 4, 4);
            EVERYTHING = loggingLevel5;
            LoggingLevel[] loggingLevelArr = {loggingLevel, loggingLevel2, loggingLevel3, loggingLevel4, loggingLevel5};
            $VALUES = loggingLevelArr;
            $ENTRIES = C3cG.A0w(loggingLevelArr);
        }

        public static Ey9<LoggingLevel> getEntries() {
            return $ENTRIES;
        }

        public static LoggingLevel valueOf(String str) {
            return (LoggingLevel) Enum.valueOf(LoggingLevel.class, str);
        }

        public static LoggingLevel[] values() {
            return (LoggingLevel[]) $VALUES.clone();
        }

        public LoggingLevel(String str, int i, int i2) {
            this.value = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEventLoggerPlugin(PerformanceLogger performanceLogger) {
        super(create(performanceLogger), (NativeBase.Disposer) MaplibrePlugin.Companion);
        C7384Etj.A0Y(performanceLogger, 0);
        cacheThisInstance();
    }

    private final native void cacheThisInstance();

    public static final native long create();

    public static final native long create(PerformanceLogger performanceLogger);

    public final native LoggingLevel getConsoleLogLevel();

    public final native String getJoinKey();

    public final native LoggingLevel getQplLogLevel();

    public final native String getRequestId();

    public final native String getSurfaceId();

    public final native SurfaceType getSurfaceType();

    public final native void setAnalytics(Analytics analytics);

    public final native void setConsoleLogLevel(LoggingLevel loggingLevel);

    public final native void setJoinKey(String str);

    public final native void setQplLogLevel(LoggingLevel loggingLevel);

    public final native void setRequestId(String str);

    public final native void setSurfaceId(String str);

    public final native void setSurfaceType(SurfaceType surfaceType);

    public final class Companion {
        public final long create(PerformanceLogger performanceLogger) {
            return MapEventLoggerPlugin.create(performanceLogger);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }

        public final long create() {
            return MapEventLoggerPlugin.create();
        }
    }

    public MapEventLoggerPlugin(long j, Object obj) {
        super(j, (NativeBase.Disposer) MaplibrePlugin.Companion);
    }

    public MapEventLoggerPlugin() {
        super(create(), (NativeBase.Disposer) MaplibrePlugin.Companion);
        cacheThisInstance();
    }
}
