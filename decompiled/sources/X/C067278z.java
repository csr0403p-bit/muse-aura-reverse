package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.facebook.aura.connectorconsent.LocalConnectorConsent;
import com.facebook.aura.health.HealthConnectPermissionUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.78z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C067278z extends Hx6<Set<? extends String>, Set<? extends String>> {
    public final Hx6<Set<String>, Set<String>> A00;

    public C067278z(String str) {
        this.A00 = Build.VERSION.SDK_INT >= 34 ? new AnonymousClass792() : new AnonymousClass790(HealthConnectPermissionUtils.PROVIDER_PACKAGE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        AnonymousClass004.A1b(context, set2);
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<? extends String> it = set2.iterator();
            while (it.hasNext()) {
                if (!AnonymousClass005.A1a(AnonymousClass005.A0j(it), LocalConnectorConsent.HEALTH_CONNECT_PERMISSION_PREFIX)) {
                    throw C60O.A0i("Unsupported health connect permission");
                }
            }
        }
        if (set2.isEmpty()) {
            throw C60O.A0i("At least one permission is required!");
        }
        Intent intentCreateIntent = this.A00.createIntent(context, set2);
        C7384Etj.A0U(intentCreateIntent);
        return intentCreateIntent;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Set<? extends String> parseResult(int i, Intent intent) {
        Set<String> result = this.A00.parseResult(i, intent);
        C7384Etj.A0U(result);
        return result;
    }

    public C067278z() {
        this(HealthConnectPermissionUtils.PROVIDER_PACKAGE);
    }
}
