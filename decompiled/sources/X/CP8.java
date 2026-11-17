package X;

import com.facebook.aura.qpl.api.QuickEventListenerSlot;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes5.dex */
public abstract class CP8 implements DI6 {
    public static DI6 A01(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return QuickEventListenerSlot.delegate.get();
    }

    @Override // X.DI6
    public abstract void onMarkerDrop(COt cOt);

    @Override // X.DI6
    public /* synthetic */ void onMarkerPoint(COt cOt, int i, long j, boolean z) {
    }

    @Override // X.DI6
    public abstract void onMarkerStart(COt cOt);

    @Override // X.DI6
    public abstract void onMarkerStop(COt cOt);

    @Override // X.DI6
    public CP9 getListenerFlags() {
        return CP9.A01;
    }

    @Override // X.DI6
    public void onMarkEvent(COt cOt) {
    }

    @Override // X.DI6
    public void onMarkerRestart(COt cOt) {
    }

    @Override // X.DI6
    public void onMetadataCollected(COt cOt) {
    }

    @Override // X.DI6
    public void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
    }

    @Override // X.DI6
    public void onMarkerAnnotate(COt cOt, int i) {
    }
}
