package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.FBz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7723FBz implements HrW {
    public static final C7723FBz A00 = new C7723FBz();

    @Override // X.HrW
    public final long now() {
        return AwakeTimeSinceBootClock.INSTANCE.now();
    }
}
