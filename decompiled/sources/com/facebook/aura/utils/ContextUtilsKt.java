package com.facebook.aura.utils;

/* loaded from: classes5.dex */
public abstract class ContextUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        return (android.app.Activity) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.app.Activity findActivity(android.content.Context r3) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r3, r0)
        L4:
            boolean r2 = r3 instanceof android.content.ContextWrapper
            r1 = 0
            boolean r0 = r3 instanceof android.app.Activity
            if (r2 == 0) goto L1b
            if (r0 != 0) goto L1d
            r0 = r3
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r0 == r3) goto L20
            X.C7384Etj.A0X(r0)
            r3 = r0
            goto L4
        L1b:
            if (r0 == 0) goto L20
        L1d:
            android.app.Activity r3 = (android.app.Activity) r3
            return r3
        L20:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.utils.ContextUtilsKt.findActivity(android.content.Context):android.app.Activity");
    }
}
