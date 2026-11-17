package com.facebook.aura.commands.battery;

/* loaded from: classes3.dex */
public abstract class BatteryStateKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.commands.battery.BatteryState readCurrentBatteryState(android.content.Context r12) {
        /*
            r2 = 0
            X.C7384Etj.A0Y(r12, r2)
            r0 = 7
            java.lang.String r1 = X.BV3.A00(r0)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r7 = 0
            android.content.Intent r6 = r12.registerReceiver(r7, r0)
            r3 = -1
            if (r6 == 0) goto Lad
            java.lang.String r0 = "level"
            int r1 = r6.getIntExtra(r0, r3)
            java.lang.String r0 = "scale"
            int r0 = r6.getIntExtra(r0, r3)
            if (r1 < 0) goto Lad
            if (r0 <= 0) goto Lad
            int r8 = r1 * 100
            int r8 = r8 / r0
            r0 = 100
            if (r8 >= r2) goto La8
            r8 = 0
        L2e:
            r5 = 1
            if (r6 == 0) goto L3b
            java.lang.String r0 = "status"
            int r0 = r6.getIntExtra(r0, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L3b:
            r4 = 5
            r3 = 2
            if (r7 == 0) goto La6
            int r0 = r7.intValue()
            if (r0 == r3) goto L47
            if (r0 != r4) goto La6
        L47:
            r9 = 1
        L48:
            if (r6 == 0) goto La4
            java.lang.String r0 = "plugged"
            int r1 = r6.getIntExtra(r0, r2)
        L50:
            r2 = 4
            if (r1 == r5) goto La1
            if (r1 == r3) goto L9e
            if (r1 == r2) goto L9b
            r0 = 8
            if (r1 == r0) goto L98
            java.lang.String r10 = "none"
        L5d:
            if (r8 < 0) goto L66
            r0 = 16
            if (r8 >= r0) goto L66
            r11 = 1
            if (r9 == 0) goto L67
        L66:
            r11 = 0
        L67:
            if (r6 == 0) goto L95
            java.lang.String r0 = "health"
            int r1 = r6.getIntExtra(r0, r5)
            if (r1 != r3) goto L79
            java.lang.String r12 = "good"
        L73:
            com.facebook.aura.commands.battery.BatteryState r7 = new com.facebook.aura.commands.battery.BatteryState
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L79:
            r0 = 3
            if (r1 != r0) goto L7f
            java.lang.String r12 = "overheat"
            goto L73
        L7f:
            if (r1 != r2) goto L84
            java.lang.String r12 = "dead"
            goto L73
        L84:
            if (r1 != r4) goto L89
            java.lang.String r12 = "over_voltage"
            goto L73
        L89:
            r0 = 6
            if (r1 != r0) goto L8f
            java.lang.String r12 = "failure"
            goto L73
        L8f:
            r0 = 7
            if (r1 != r0) goto L95
            java.lang.String r12 = "cold"
            goto L73
        L95:
            java.lang.String r12 = "unknown"
            goto L73
        L98:
            java.lang.String r10 = "dock"
            goto L5d
        L9b:
            java.lang.String r10 = "wireless"
            goto L5d
        L9e:
            java.lang.String r10 = "usb"
            goto L5d
        La1:
            java.lang.String r10 = "ac"
            goto L5d
        La4:
            r1 = 0
            goto L50
        La6:
            r9 = 0
            goto L48
        La8:
            if (r8 <= r0) goto L2e
            r8 = 100
            goto L2e
        Lad:
            r8 = -1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.battery.BatteryStateKt.readCurrentBatteryState(android.content.Context):com.facebook.aura.commands.battery.BatteryState");
    }
}
