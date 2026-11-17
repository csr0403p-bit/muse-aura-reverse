package X;

import android.content.pm.PackageManager;
import java.io.IOException;

/* renamed from: X.DqJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5830DqJ extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5830DqJ(PackageManager packageManager) {
        super(1);
        this.$t = 1;
        this.A01 = "com.facebook.aura";
        this.A00 = packageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.$t
            if (r0 == 0) goto L27
            android.content.pm.PackageItemInfo r4 = (android.content.pm.PackageItemInfo) r4
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            java.lang.String r1 = r4.packageName
            java.lang.String r0 = r3.A01
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L21
            java.lang.Object r1 = r3.A00
            android.content.pm.PackageManager r1 = (android.content.pm.PackageManager) r1
            java.lang.String r0 = r4.packageName
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r0)
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L27:
            com.facebook.quicklog.MarkerEditor r1 = X.AbstractC7559F3s.A01(r4)
            java.lang.String r0 = "get_token_error"
            com.facebook.quicklog.PointEditor r2 = r1.pointEditor(r0)
            java.lang.String r1 = "provider_name"
            java.lang.String r0 = r3.A01
            com.facebook.quicklog.PointEditor r2 = r2.addPointData(r1, r0)
            java.lang.String r1 = "error_type"
            java.lang.String r0 = "IOException"
            com.facebook.quicklog.PointEditor r2 = r2.addPointData(r1, r0)
            java.lang.Object r0 = r3.A00
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L4d
            java.lang.String r1 = "[no error message"
        L4d:
            java.lang.String r0 = "error_message"
            r2.addPointData(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5830DqJ.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5830DqJ(IOException iOException, String str) {
        super(1);
        this.$t = 0;
        this.A01 = str;
        this.A00 = iOException;
    }
}
