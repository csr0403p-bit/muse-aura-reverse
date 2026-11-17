package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes5.dex */
public interface DI6 {
    CP9 getListenerFlags();

    CP0 getListenerMarkers();

    String getName();

    void onMarkEvent(COt cOt);

    void onMarkerAnnotate(COt cOt, int i);

    void onMarkerDrop(COt cOt);

    void onMarkerPoint(COt cOt, int i, long j, boolean z);

    void onMarkerRestart(COt cOt);

    void onMarkerStart(COt cOt);

    void onMarkerStop(COt cOt);

    void onMetadataCollected(COt cOt);

    void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger);
}
