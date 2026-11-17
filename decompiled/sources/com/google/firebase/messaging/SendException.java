package com.google.firebase.messaging;

/* loaded from: classes5.dex */
public final class SendException extends Exception {
    public final int errorCode;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SendException(java.lang.String r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            r2 = 0
            if (r4 == 0) goto L13
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r4.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1743242157: goto L16;
                case -1290953729: goto L20;
                case -920906446: goto L2b;
                case -617027085: goto L2e;
                case -95047692: goto L38;
                default: goto L13;
            }
        L13:
            r3.errorCode = r2
            return
        L16:
            java.lang.String r0 = "service_not_available"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r2 = 3
            goto L13
        L20:
            java.lang.String r0 = "toomanymessages"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r2 = 4
            goto L13
        L2b:
            java.lang.String r0 = "invalid_parameters"
            goto L3a
        L2e:
            java.lang.String r0 = "messagetoobig"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r2 = 2
            goto L13
        L38:
            java.lang.String r0 = "missing_to"
        L3a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r2 = 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.SendException.<init>(java.lang.String):void");
    }
}
