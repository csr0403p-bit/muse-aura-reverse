package X;

import android.database.Observable;

/* renamed from: X.DFu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4938DFu extends Observable<DFz> {
    public static DFz[] A00(C4938DFu c4938DFu) {
        DFz[] dFzArr;
        synchronized (((Observable) c4938DFu).mObservers) {
            dFzArr = (DFz[]) ((Observable) c4938DFu).mObservers.toArray(new DFz[0]);
        }
        return dFzArr;
    }
}
