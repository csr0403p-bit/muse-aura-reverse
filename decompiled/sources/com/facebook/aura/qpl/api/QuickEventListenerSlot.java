package com.facebook.aura.qpl.api;

import X.BV4;
import X.BV5;
import X.Bs8;
import X.C7384Etj;
import X.CFK;
import X.COt;
import X.CP0;
import X.CP8;
import X.DI6;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class QuickEventListenerSlot extends CP8 {
    public static final QuickEventListenerSlot INSTANCE = new QuickEventListenerSlot();
    public static final AtomicReference<DI6> delegate = BV5.A1A();

    public final void install(DI6 di6) {
        C7384Etj.A0Y(di6, 0);
        AtomicReference<DI6> atomicReference = delegate;
        if (Bs8.A00(null, di6, atomicReference)) {
            refreshMarkers();
        } else if (atomicReference.get() != di6) {
            DI6 di62 = atomicReference.get();
            CFK.A0H(QuickEventListenerSlotKt.TAG, "Slot already holds %s; ignoring %s", di62 != null ? di62.getName() : null, di6.getName());
        }
    }

    @Override // X.CP8, X.DI6
    public void onMarkerPoint(COt cOt, int i, long j, boolean z) {
        C7384Etj.A0Y(cOt, 0);
        DI6 di6 = delegate.get();
        if (di6 != null) {
            di6.onMarkerPoint(cOt, i, j, z);
        }
    }

    public final void uninstall(DI6 di6) {
        C7384Etj.A0Y(di6, 0);
        if (Bs8.A00(di6, null, delegate)) {
            refreshMarkers();
        }
    }

    @Override // X.DI6
    public CP0 getListenerMarkers() {
        CP0 listenerMarkers;
        DI6 di6 = delegate.get();
        return (di6 == null || (listenerMarkers = di6.getListenerMarkers()) == null) ? CP0.A04 : listenerMarkers;
    }

    @Override // X.DI6
    public String getName() {
        return "aura_listener_slot";
    }

    private final void refreshMarkers() {
        BV4.A0D().updateListenerMarkers();
    }

    @Override // X.CP8, X.DI6
    public void onMarkerAnnotate(COt cOt, int i) {
        DI6 di6A01 = CP8.A01(cOt);
        if (di6A01 != null) {
            di6A01.onMarkerAnnotate(cOt, i);
        }
    }

    @Override // X.CP8, X.DI6
    public void onMarkerDrop(COt cOt) {
        DI6 di6A01 = CP8.A01(cOt);
        if (di6A01 != null) {
            di6A01.onMarkerDrop(cOt);
        }
    }

    @Override // X.CP8, X.DI6
    public void onMarkerRestart(COt cOt) {
        DI6 di6A01 = CP8.A01(cOt);
        if (di6A01 != null) {
            di6A01.onMarkerRestart(cOt);
        }
    }

    @Override // X.CP8, X.DI6
    public void onMarkerStart(COt cOt) {
        DI6 di6A01 = CP8.A01(cOt);
        if (di6A01 != null) {
            di6A01.onMarkerStart(cOt);
        }
    }

    @Override // X.CP8, X.DI6
    public void onMarkerStop(COt cOt) {
        DI6 di6A01 = CP8.A01(cOt);
        if (di6A01 != null) {
            di6A01.onMarkerStop(cOt);
        }
    }
}
