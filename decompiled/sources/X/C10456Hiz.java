package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import java.util.Map;

/* renamed from: X.Hiz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10456Hiz implements HsY {
    public final Context A00;

    @Override // X.HsY
    public final int AFZ(int i) throws PackageManager.NameNotFoundException {
        Long l;
        Map<Integer, C10596Hxs> map = HxW.A00;
        try {
            PackageInfo packageInfo = this.A00.getPackageManager().getPackageInfo(HealthConnectPermissionUtils.PROVIDER_PACKAGE, 0);
            C7384Etj.A0X(packageInfo);
            long longVersionCode = packageInfo.getLongVersionCode();
            C10596Hxs c10596Hxs = (C10596Hxs) BV5.A0f(map, i);
            return (c10596Hxs == null || (l = c10596Hxs.A01) == null || l.longValue() > longVersionCode) ? 1 : 2;
        } catch (PackageManager.NameNotFoundException unused) {
            throw C3cG.A0Q("Provider APK not installed!");
        }
    }

    public C10456Hiz(Context context) {
        this.A00 = context;
    }
}
