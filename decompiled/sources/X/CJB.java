package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class CJB implements CFD {
    public final CFD A00;

    @Override // X.CFD
    public final /* bridge */ /* synthetic */ Object AjF() {
        String string;
        Context context = ((CJD) this.A00).A00.A00;
        if (context == null) {
            throw BV4.A0a("Cannot return null from a non-@Nullable @Provides method");
        }
        try {
            Bundle bundle = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return C3cG.A0O(context.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public CJB(CFD cfd) {
        this.A00 = cfd;
    }
}
