package com.facebook.aura.lifecycle;

import X.A3q;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BGK;
import X.BLG;
import X.C20Q;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.GDB;
import X.HnJ;
import java.util.Set;

/* loaded from: classes2.dex */
public final class AuraAppLifecycleManager {
    public static final AuraAppLifecycleManager INSTANCE = new AuraAppLifecycleManager();
    public static final BLG<Boolean> _isAppInForegroundImmediate;
    public static final BLG<Boolean> _isAppInForegroundNormalPriority;
    public static final BLG<Boolean> _isAssistOverlayActive;
    public static final C20Q<Boolean> isAppInForegroundFlow;
    public static final C20Q<Boolean> isAppInForegroundImmediateFlow;
    public static final C20Q<Boolean> isAssistOverlayActiveFlow;
    public static final C20Q<Boolean> isWindowSurfaceVisibleFlow;
    public static volatile TopResumed topResumed;
    public static final BLG<Set<Object>> windowSurfaceOwners;

    public final class TopResumed {
        public final boolean isInPictureInPicture;
        public final int token;

        public final int getToken() {
            return this.token;
        }

        public final boolean isInPictureInPicture() {
            return this.isInPictureInPicture;
        }

        public TopResumed(int i, boolean z) {
            this.token = i;
            this.isInPictureInPicture = z;
        }
    }

    public final void markWindowSurfaceVisible(Object obj, boolean z) {
        Set<Object> value;
        Set<Object> set;
        C7384Etj.A0Y(obj, 0);
        BLG<Set<Object>> blg = windowSurfaceOwners;
        do {
            value = blg.getValue();
            set = value;
        } while (!blg.A6e(value, z ? BGK.A02(obj, set) : BGK.A04(obj, set)));
    }

    static {
        Boolean boolA0h = AnonymousClass001.A0h();
        C9286GCn c9286GCnA14 = C3cG.A14(boolA0h);
        _isAppInForegroundImmediate = c9286GCnA14;
        C9286GCn c9286GCnA142 = C3cG.A14(boolA0h);
        _isAppInForegroundNormalPriority = c9286GCnA142;
        C9286GCn c9286GCnA143 = C3cG.A14(boolA0h);
        _isAssistOverlayActive = c9286GCnA143;
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        windowSurfaceOwners = c9286GCnA01;
        isAppInForegroundFlow = C3cG.A11(c9286GCnA142);
        isAppInForegroundImmediateFlow = C3cG.A11(c9286GCnA14);
        isAssistOverlayActiveFlow = C3cG.A11(c9286GCnA143);
        isWindowSurfaceVisibleFlow = GDB.A01(new AuraAppLifecycleManager$special$$inlined$map$1(c9286GCnA01));
    }

    public final boolean isAppInForeground() {
        return _isAppInForegroundImmediate.getValue().booleanValue();
    }

    public final C20Q<Boolean> isAppInForegroundFlow() {
        return isAppInForegroundFlow;
    }

    public final boolean isAppInForegroundFlowValue() {
        return AnonymousClass003.A1Z(_isAppInForegroundNormalPriority);
    }

    public final C20Q<Boolean> isAppInForegroundImmediateFlow() {
        return isAppInForegroundImmediateFlow;
    }

    public final boolean isAppInUse() {
        TopResumed topResumed2 = topResumed;
        return (topResumed2 == null || topResumed2.isInPictureInPicture) ? false : true;
    }

    public final boolean isAssistOverlayActive() {
        return AnonymousClass003.A1Z(_isAssistOverlayActive);
    }

    public final C20Q<Boolean> isAssistOverlayActiveFlow() {
        return isAssistOverlayActiveFlow;
    }

    public final C20Q<Boolean> isWindowSurfaceVisibleFlow() {
        return isWindowSurfaceVisibleFlow;
    }

    public final void markAppInBackground() {
        BLG<Boolean> blg = _isAppInForegroundImmediate;
        Boolean boolA0h = AnonymousClass001.A0h();
        AnonymousClass001.A1E(_isAppInForegroundNormalPriority, C3cG.A0V(blg, boolA0h), boolA0h);
    }

    public final void markAppInForegroundImmediate() {
        AnonymousClass004.A1D(true, _isAppInForegroundImmediate);
    }

    public final void markAppInForegroundOnWorkerThread() {
        AnonymousClass004.A1D(true, _isAppInForegroundNormalPriority);
    }

    public final void markAssistOverlayActive(boolean z) {
        AnonymousClass004.A1D(z, _isAssistOverlayActive);
    }

    public final void markPictureInPicture(int i, boolean z) {
        TopResumed topResumed2 = topResumed;
        if (topResumed2 == null || topResumed2.token != i) {
            return;
        }
        topResumed = new TopResumed(i, z);
    }

    public final void markTopResumedActivity(int i, boolean z, boolean z2) {
        TopResumed topResumed2;
        TopResumed topResumed3 = topResumed;
        if (z) {
            topResumed2 = new TopResumed(i, z2);
        } else if (topResumed3 == null || topResumed3.token != i) {
            return;
        } else {
            topResumed2 = null;
        }
        topResumed = topResumed2;
    }

    public final boolean canPresentInteractiveUi() {
        return isAppInForeground() || AnonymousClass003.A1Z(_isAssistOverlayActive);
    }
}
