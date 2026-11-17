package X;

import android.app.ActivityManager;
import com.facebook.aura.localbrowser.ManagedBrowserDecoder;

/* renamed from: X.Ee3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7001Ee3 implements InterfaceC7005EeA<C7167Ehc> {
    public final ActivityManager A00;

    public C7001Ee3(ActivityManager activityManager) {
        C7384Etj.A0Y(activityManager, 0);
        this.A00 = activityManager;
    }

    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ C7167Ehc get() {
        int iMin = Math.min(this.A00.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new C7167Ehc(iMin < 33554432 ? 4194304 : iMin < 67108864 ? ManagedBrowserDecoder.MAX_REQUEST_BYTES : iMin / 4, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
