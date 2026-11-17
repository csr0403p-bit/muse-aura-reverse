package androidx.startup;

import X.AbstractC3136BzG;
import X.BV5;
import X.Bx3;
import X.Bx4;
import X.C3cG;
import X.C60O;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.facebook.aura.R;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw C3cG.A0Q("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw C3cG.A0Q("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw C3cG.A0Q("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw C3cG.A0Q("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C3cG.A0Q("Not allowed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        Bx3 bx3A00 = Bx3.A00(context);
        Class<?> cls = getClass();
        try {
            try {
                AbstractC3136BzG.A00("Startup");
                Context context2 = bx3A00.A00;
                Bundle bundle = ((PackageItemInfo) context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128)).metaData;
                String string = context2.getString(R.string._name_removed__res_0x7f12015a);
                if (bundle != null) {
                    try {
                        HashSet hashSetA13 = C60O.A13();
                        Iterator itA0w = BV5.A0w(bundle);
                        while (itA0w.hasNext()) {
                            String str = (String) itA0w.next();
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls2 = Class.forName(str);
                                if (Bx4.class.isAssignableFrom(cls2)) {
                                    bx3A00.A02.add(cls2);
                                }
                            }
                        }
                        Iterator<Class<? extends Bx4<?>>> it = bx3A00.A02.iterator();
                        while (it.hasNext()) {
                            Bx3.A01(bx3A00, it.next(), hashSetA13);
                        }
                    } catch (ClassNotFoundException e) {
                        throw new StartupException(e);
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } finally {
            Trace.endSection();
        }
    }
}
