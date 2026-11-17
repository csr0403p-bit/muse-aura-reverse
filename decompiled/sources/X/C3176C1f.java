package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.aura.qpl.module.AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.C1f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3176C1f extends CAH<C3177C1g> {
    public PowerManager A00;
    public boolean A01;
    public final Context A02;

    public static final ListenableFuture<?> A00(COt cOt, C3177C1g c3177C1g, C3177C1g c3177C1g2) {
        C7384Etj.A0Y(cOt, 0);
        if (c3177C1g != null && c3177C1g2 != null) {
            int i = c3177C1g2.A00;
            int i2 = c3177C1g.A00;
            EtT.A01(CAH.A01(CAH.A01(CAH.A01(cOt.AHg(), cOt, "battery_usage", i - i2), cOt, "start_battery_level", i2), cOt, "end_battery_level", i), AbstractC3178C1h.A00(c3177C1g.A01), "start_battery_state");
            EtT.A01(cOt.AHg(), AbstractC3178C1h.A00(c3177C1g2.A01), "end_battery_state");
            EtT.A01(cOt.AHg(), Boolean.valueOf(c3177C1g.A02), "start_low_power_enabled");
            EtT.A01(cOt.AHg(), Boolean.valueOf(c3177C1g2.A02), "end_low_power_enabled");
        }
        return CPZ.A01;
    }

    @Override // X.DHp
    public final boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return ((AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1) interfaceC3173C1c).isPowerStatsEnabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071 A[Catch: Exception -> 0x0079, PHI: r2
  0x0071: PHI (r2v4 android.os.PowerManager) = (r2v3 android.os.PowerManager), (r2v8 android.os.PowerManager) binds: [B:29:0x005c, B:35:0x006f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0079, blocks: (B:28:0x005a, B:30:0x005e, B:32:0x0068, B:33:0x006a, B:36:0x0071), top: B:43:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    @Override // X.CAH
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3177C1g snapshot() {
        /*
            r7 = this;
            android.content.Context r3 = r7.A02
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r6)
            r5 = 0
            android.content.Intent r4 = r3.registerReceiver(r5, r0)
            r0 = -1
            if (r4 == 0) goto L24
            java.lang.String r1 = "level"
            int r2 = r4.getIntExtra(r1, r0)
            java.lang.String r1 = "scale"
            int r1 = r4.getIntExtra(r1, r0)
            if (r2 < 0) goto L24
            if (r1 <= 0) goto L24
            int r0 = r2 * 100
            int r0 = r0 / r1
        L24:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r6)
            android.content.Intent r4 = r3.registerReceiver(r5, r1)
            if (r4 == 0) goto L57
            java.lang.String r2 = "status"
            r1 = -1
            int r2 = r4.getIntExtra(r2, r1)
            r1 = 1
            if (r2 == r1) goto L57
            r1 = 2
            if (r2 == r1) goto L54
            r1 = 3
            if (r2 == r1) goto L51
            r1 = 4
            if (r2 == r1) goto L4e
            r1 = 5
            if (r2 != r1) goto L57
            java.lang.Integer r5 = X.C79.A0K
        L48:
            boolean r1 = r7.A01
            if (r1 != 0) goto L7d
            r4 = 1
            goto L5a
        L4e:
            java.lang.Integer r5 = X.C79.A0P
            goto L48
        L51:
            java.lang.Integer r5 = X.C79.A01
            goto L48
        L54:
            java.lang.Integer r5 = X.C79.A0C
            goto L48
        L57:
            java.lang.Integer r5 = X.C79.A00
            goto L48
        L5a:
            android.os.PowerManager r2 = r7.A00     // Catch: java.lang.Exception -> L79
            if (r2 != 0) goto L71
            java.lang.String r1 = "power"
            java.lang.Object r2 = r3.getSystemService(r1)     // Catch: java.lang.Exception -> L79
            boolean r1 = r2 instanceof android.os.PowerManager     // Catch: java.lang.Exception -> L79
            if (r1 == 0) goto L6d
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch: java.lang.Exception -> L79
        L6a:
            r7.A00 = r2     // Catch: java.lang.Exception -> L79
            goto L6f
        L6d:
            r2 = 0
            goto L6a
        L6f:
            if (r2 == 0) goto L7d
        L71:
            boolean r1 = r2.isPowerSaveMode()     // Catch: java.lang.Exception -> L79
            r2 = 1
            if (r1 == r4) goto L7e
            goto L7d
        L79:
            r7.A01 = r4
            r2 = 0
            goto L7e
        L7d:
            r2 = 0
        L7e:
            X.C1g r1 = new X.C1g
            r1.<init>(r0, r5, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3176C1f.snapshot():X.C1g");
    }

    @Override // X.DHp
    public final /* bridge */ /* synthetic */ ListenableFuture decorateEvent(COt cOt, Object obj, Object obj2) {
        return A00(cOt, (C3177C1g) obj, (C3177C1g) obj2);
    }

    @Override // X.DHp
    public final String getProviderName() {
        return "power_stats";
    }

    @Override // X.DHp
    public final int getProviderTypeId() {
        return 19;
    }

    @Override // X.DHp
    public final Class<C3177C1g> getSnapshotType() {
        return C3177C1g.class;
    }

    public C3176C1f(Context context) {
        this.A02 = context;
    }
}
