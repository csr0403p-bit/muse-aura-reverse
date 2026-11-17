package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.790, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass790 extends Hx6<Set<? extends String>, Set<? extends String>> {
    public final String A00;

    public AnonymousClass790(String str) {
        this.A00 = HealthConnectPermissionUtils.PROVIDER_PACKAGE;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        C7384Etj.A0Y(set2, 1);
        C7AG c7ag = new C7AG(new EY5(0), new C8iN(set2, 0));
        ArrayList<? extends Parcelable> arrayListA0h = C3cG.A0h();
        C7AH c7ah = new C7AH(c7ag);
        while (c7ah.hasNext()) {
            arrayListA0h.add(c7ah.next());
        }
        AbstractC7529Ezo.A00("HealthConnectClient", FGI.A0I("Requesting ", set2.size(), " permissions."));
        Intent intentA03 = C60P.A03(HealthConnectPermissionUtils.PERMISSION_REQUEST_ACTION);
        intentA03.putParcelableArrayListExtra("requested_permissions_string", arrayListA0h);
        String str = this.A00;
        if (str.length() > 0) {
            intentA03.setPackage(str);
        }
        return intentA03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.A3q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set, java.util.Set<? extends java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.A3q] */
    @Override // X.Hx6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.util.Set<? extends java.lang.String> parseResult(int r2, android.content.Intent r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L5d
            java.lang.String r0 = "granted_permissions_string"
            java.util.ArrayList r1 = r3.getParcelableArrayListExtra(r0)
            if (r1 == 0) goto L5d
            r0 = 0
            X.8iN r2 = new X.8iN
            r2.<init>(r1, r0)
            r0 = 1
            X.EY5 r1 = new X.EY5
            r1.<init>(r0)
            X.7AG r0 = new X.7AG
            r0.<init>(r1, r2)
            X.7AH r2 = new X.7AH
            r2.<init>(r0)
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L3c
            X.A3q r3 = X.A3q.A00
        L28:
            if (r3 == 0) goto L5d
        L2a:
            java.lang.String r2 = "Granted "
            int r1 = r3.size()
            java.lang.String r0 = " permissions."
            java.lang.String r1 = X.FGI.A0I(r2, r1, r0)
            java.lang.String r0 = "HealthConnectClient"
            X.AbstractC7529Ezo.A00(r0, r1)
            return r3
        L3c:
            java.lang.Object r1 = r2.next()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L4b
            java.util.Set r3 = java.util.Collections.singleton(r1)
            goto L28
        L4b:
            java.util.LinkedHashSet r3 = X.C3cG.A0k()
        L4f:
            r3.add(r1)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r1 = r2.next()
            goto L4f
        L5d:
            X.A3q r3 = X.A3q.A00
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass790.parseResult(int, android.content.Intent):java.lang.Object");
    }

    public AnonymousClass790() {
        this(HealthConnectPermissionUtils.PROVIDER_PACKAGE);
    }
}
