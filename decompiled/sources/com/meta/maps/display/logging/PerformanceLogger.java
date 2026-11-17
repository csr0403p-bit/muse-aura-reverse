package com.meta.maps.display.logging;

/* loaded from: classes4.dex */
public interface PerformanceLogger {
    void endAllInstancesOfMarker(int i, short s);

    boolean isMarkerOn(int i, int i2);

    void markerAnnotate(int i, String str, String str2, int i2);

    void markerEnd(int i, short s, int i2);

    void markerPoint(int i, String str, int i2, int i3);

    void markerStart(int i, int i2);
}
