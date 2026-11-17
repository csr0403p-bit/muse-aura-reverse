package X;

import com.facebook.acra.anr.IANRDetector;

/* renamed from: X.C6e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3261C6e implements C7U {
    public final /* synthetic */ C64 A00;

    public C3261C6e(C64 c64) {
        this.A00 = c64;
    }

    @Override // X.C7U
    public final void AN5(Thread thread, Throwable th) {
        IANRDetector iANRDetector = C64.A09;
        if (iANRDetector != null) {
            iANRDetector.pause();
        }
    }
}
