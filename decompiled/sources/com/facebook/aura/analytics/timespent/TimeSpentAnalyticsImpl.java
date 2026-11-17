package com.facebook.aura.analytics.timespent;

import X.C7384Etj;
import X.DLR;
import com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterface;

/* loaded from: classes5.dex */
public final class TimeSpentAnalyticsImpl implements TimeSpentAnalytics {
    public final AuraAnalyticsDecoratorInterface analyticsDecorator;
    public final DLR timeSpentBitArray;

    @Override // com.facebook.aura.analytics.timespent.TimeSpentAnalytics
    public void recordAppBackgrounded() {
        processTimeSpentInteractionEvent(2);
    }

    @Override // com.facebook.aura.analytics.timespent.TimeSpentAnalytics
    public void recordAppForegrounded() {
        processTimeSpentInteractionEvent(0);
    }

    @Override // com.facebook.aura.analytics.timespent.TimeSpentAnalytics
    public void recordUserInteraction() {
        processTimeSpentInteractionEvent(1);
    }

    @Override // com.facebook.aura.analytics.timespent.TimeSpentAnalytics
    public void reportTimeChangeEvent() {
        processTimeSpentInteractionEvent(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void processTimeSpentInteractionEvent(int r11) {
        /*
            r10 = this;
            X.DLR r5 = r10.timeSpentBitArray
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r11 == 0) goto L1d
            r9 = 1
            if (r11 == r9) goto L2e
            r0 = 2
            if (r11 == r0) goto L1d
            r0 = 3
            if (r11 == r0) goto L1d
            r0 = 5
            if (r11 == r0) goto L1d
            r0 = 6
            if (r11 == r0) goto L1d
            r0 = 7
            if (r11 == r0) goto L1d
        L1c:
            return
        L1d:
            int[] r0 = r5.A06
            if (r0 == 0) goto L1c
            long r1 = r1 / r3
            X.DLT r6 = X.DLR.A00(r5, r11, r1)
            r0 = 0
            r5.A06 = r0
            r0 = 0
            r5.A03 = r0
            goto L70
        L2e:
            long r1 = r1 / r3
            long r3 = r5.A03
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r6 = r5.A02
            long r3 = r1 - r6
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L89
            r6 = 64
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L89
            r6 = 0
        L46:
            int[] r7 = r5.A06
            if (r7 != 0) goto L7b
            r5.A03 = r1
            r5.A02 = r1
            r0 = 2
            int[] r1 = new int[r0]
            r5.A06 = r1
            r0 = 0
            r1[r0] = r9
            r1[r9] = r0
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r5.A05
            if (r0 == 0) goto L64
            java.lang.Object r0 = r0.invoke()
            java.lang.String r0 = (java.lang.String) r0
            r5.A04 = r0
        L64:
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
        L6a:
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
        L70:
            if (r6 == 0) goto L1c
            com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterface r0 = r10.analyticsDecorator
            r0.decorateTimeSpentInteractionEvent(r6)
            r6.logAndRelease()
            return
        L7b:
            int r0 = (int) r3
            int r4 = r0 >> 5
            r3 = r7[r4]
            r0 = r0 & 31
            int r9 = r9 << r0
            r9 = r9 | r3
            r7[r4] = r9
            r5.A03 = r1
            goto L6a
        L89:
            X.DLT r6 = X.DLR.A00(r5, r9, r1)
            r0 = 0
            r5.A06 = r0
            r7 = 0
            r5.A03 = r7
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.analytics.timespent.TimeSpentAnalyticsImpl.processTimeSpentInteractionEvent(int):void");
    }

    public TimeSpentAnalyticsImpl() {
        AuraAnalyticsDecoratorInterface auraAnalyticsDecoratorInterfaceBuild = new AuraAnalyticsDecoratorInterface.BuilderImpl("AuraAnalyticsDecorator").build();
        C7384Etj.A0U(auraAnalyticsDecoratorInterfaceBuild);
        this.analyticsDecorator = auraAnalyticsDecoratorInterfaceBuild;
        this.timeSpentBitArray = new DLR(new TimeSpentAnalyticsImpl$timeSpentBitArray$1(this), TimeSpentAnalyticsImpl$timeSpentBitArray$2.INSTANCE);
    }

    private final long now() {
        return System.currentTimeMillis();
    }
}
