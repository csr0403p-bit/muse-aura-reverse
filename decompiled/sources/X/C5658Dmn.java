package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Deque;

/* renamed from: X.Dmn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5658Dmn {
    public final DmR A00;
    public final C5902Drl A01;
    public final C5615Dlu A02;
    public final Dn9 A03;
    public final Deque<Long> A04 = BV4.A0s();
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final C5669Dmy A08;
    public final HeroPlayerSetting A09;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5658Dmn(X.DmR r5, X.C5615Dlu r6, com.facebook.video.heroplayer.setting.HeroPlayerSetting r7) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayDeque r0 = X.BV4.A0s()
            r4.A04 = r0
            X.Dn9 r3 = X.Dn9.A02
            r4.A03 = r3
            r4.A09 = r7
            r4.A02 = r6
            r4.A00 = r5
            X.Dmy r1 = new X.Dmy
            r1.<init>(r5, r7)
            r4.A08 = r1
            X.DmR r0 = r1.A00
            boolean r0 = X.C4904DDx.A00(r0)
            java.util.Map<X.BXi, X.Drl> r1 = r1.A02
            if (r0 == 0) goto L4e
            X.BXi r0 = X.BXi.LIVE_DEFAULT
        L26:
            java.lang.Object r0 = r1.get(r0)
            X.Drl r0 = (X.C5902Drl) r0
            r4.A01 = r0
            r2 = 1
            X.DDx r1 = r5.A03
            if (r1 == 0) goto L4c
            if (r0 == 0) goto L4c
            boolean r0 = r7.enableDynamicMinRebufferMsController
            if (r0 != 0) goto L43
            boolean r0 = r7.enableLiveDynamicMinRebufferMsController
            if (r0 == 0) goto L4c
            boolean r0 = r1.A04()
            if (r0 == 0) goto L4c
        L43:
            r0 = 1
        L44:
            r4.A05 = r0
            boolean r0 = r7.enableGlobalStallMonitor
            if (r0 == 0) goto L64
            monitor-enter(r3)
            goto L51
        L4c:
            r0 = 0
            goto L44
        L4e:
            X.BXi r0 = X.BXi.VOD
            goto L26
        L51:
            boolean r0 = X.Dn9.A00     // Catch: java.lang.Throwable -> L61
            monitor-exit(r3)
            if (r0 == 0) goto L64
            int r0 = r7.globalStallCountsToUpdateDynamicRebuffer
            if (r0 <= 0) goto L64
            boolean r0 = X.C4904DDx.A00(r5)
            if (r0 != 0) goto L64
            goto L65
        L61:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            throw r0
        L64:
            r2 = 0
        L65:
            r4.A07 = r2
            boolean r0 = r7.useFixedGlobalStallQuery
            r4.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5658Dmn.<init>(X.DmR, X.Dlu, com.facebook.video.heroplayer.setting.HeroPlayerSetting):void");
    }
}
