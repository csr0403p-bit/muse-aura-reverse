package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.CJg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3392CJg {
    public CKb A00;
    public static final CJQ A02 = new CJQ("SplitInstallService");
    public static final Intent A01 = C60P.A03("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE);

    public static CSC A00() {
        A02.A02("onError(%d)", BV5.A1Y(-14));
        return CSC.A01(new SplitInstallException(-14));
    }

    public static /* bridge */ /* synthetic */ ArrayList A01(Collection collection) {
        ArrayList arrayListA11 = C60O.A11(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putString("module_name", strA0j);
            arrayListA11.add(bundleA0N);
        }
        return arrayListA11;
    }
}
