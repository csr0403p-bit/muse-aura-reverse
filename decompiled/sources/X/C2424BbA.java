package X;

import android.os.Build;
import android.os.SystemClock;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.BbA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2424BbA {
    public long A00 = -1;
    public BWz A01;
    public final BWz A02;
    public final CameraUseInconsistentTimebaseQuirk A03;
    public final InterfaceC2425BbB A04;

    public final long A00(long j) {
        boolean z;
        BWz bWz;
        BWz bWz2 = this.A01;
        if (bWz2 == null) {
            if (this.A03 != null) {
                AbstractC2875Bni.A03("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
                z = false;
            } else if ((SystemClock.elapsedRealtimeNanos() / 1000) - (System.nanoTime() / 1000) > 3000000) {
                z = true;
            } else {
                bWz2 = this.A02;
                this.A01 = bWz2;
            }
            bWz2 = BV6.A0J(j, SystemClock.elapsedRealtimeNanos() / 1000) < BV6.A0J(j, System.nanoTime() / 1000) ? BWz.REALTIME : BWz.UPTIME;
            if (!z || bWz2 == (bWz = this.A02)) {
                AbstractC2875Bni.A00(bWz2, "Detect input timebase = ", "VideoTimebaseConverter");
            } else {
                int i = Build.VERSION.SDK_INT;
                AbstractC2875Bni.A02("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), i >= 31 ? FGI.A0M(", SOC: ", Build.SOC_MODEL) : "", bWz, bWz2));
            }
            this.A01 = bWz2;
        }
        int iOrdinal = bWz2.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 0) {
                throw BV4.A0N(AnonymousClass007.A0a("Unknown timebase: ", bWz2));
            }
            return j;
        }
        if (this.A00 == -1) {
            long j2 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            int i2 = 0;
            long j3 = 0;
            do {
                long jNanoTime = System.nanoTime() / 1000;
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                long jNanoTime2 = System.nanoTime() / 1000;
                long j4 = jNanoTime2 - jNanoTime;
                if (i2 == 0 || j4 < j2) {
                    j3 = jElapsedRealtimeNanos - ((jNanoTime + jNanoTime2) >> 1);
                    j2 = j4;
                }
                i2++;
            } while (i2 < 3);
            long jMax = Math.max(0L, j3);
            this.A00 = jMax;
            AbstractC2875Bni.A01("VideoTimebaseConverter", FGI.A0B(jMax, "mUptimeToRealtimeOffsetUs = "));
        }
        return j - this.A00;
    }

    public C2424BbA(BWz bWz, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk, InterfaceC2425BbB interfaceC2425BbB) {
        this.A04 = interfaceC2425BbB;
        this.A02 = bWz;
        this.A03 = cameraUseInconsistentTimebaseQuirk;
    }
}
