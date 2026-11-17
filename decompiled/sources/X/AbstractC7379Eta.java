package X;

/* renamed from: X.Eta, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7379Eta {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List A00(java.lang.Class r6, java.lang.Object r7) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r3 = "ComponentDiscovery"
            r5 = 0
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            if (r2 != 0) goto L11
            java.lang.String r0 = "Context has no PackageManager."
        Ld:
            android.util.Log.w(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L31
        L11:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            r1.<init>(r7, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r2.getServiceInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            if (r0 != 0) goto L29
            java.lang.StringBuilder r1 = X.BV5.A0q(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.String r0 = " has no service info."
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto Ld
        L29:
            android.os.Bundle r5 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L31
        L2c:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r3, r0)
        L31:
            if (r5 != 0) goto L3b
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r3, r0)
            java.util.List r4 = java.util.Collections.EMPTY_LIST
        L3a:
            return r4
        L3b:
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r3 = X.BV5.A0w(r5)
        L43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r5.get(r2)
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L43
            r0 = 31
            java.lang.String r0 = r2.substring(r0)
            r4.add(r0)
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7379Eta.A00(java.lang.Class, java.lang.Object):java.util.List");
    }
}
