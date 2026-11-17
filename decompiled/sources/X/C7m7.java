package X;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7m7, reason: invalid class name */
/* loaded from: classes3.dex */
public class C7m7 {
    public ComponentName A03 = null;
    public String A09 = null;
    public String A08 = null;
    public Uri A06 = null;
    public String A0A = null;
    public Rect A05 = null;
    public Intent A04 = null;
    public ClipData A02 = null;
    public Bundle A07 = null;
    public final Set<String> A0C = C60O.A13();
    public int A00 = 0;
    public long A01 = 0;
    public boolean A0B = false;

    public static final int A00(C7m7 c7m7, int i) {
        int i2;
        if (AnonymousClass002.A1L(((8 & c7m7.A01) > 0L ? 1 : ((8 & c7m7.A01) == 0L ? 0 : -1)))) {
            i &= -67108865;
            if (Build.VERSION.SDK_INT <= 30) {
                return i;
            }
            i2 = 33554432;
        } else {
            if (Build.VERSION.SDK_INT > 30) {
                i &= -33554433;
            }
            i2 = 67108864;
        }
        return i | i2;
    }

    public Intent A03(Context context) {
        String packageName;
        Intent intent = new Intent();
        intent.setComponent(this.A03);
        intent.setFlags(this.A00);
        if (this.A0B) {
            intent.setComponent(new ComponentName(context, "com.facebook.invalid_class.f4c3b00c"));
            packageName = context.getPackageName();
        } else {
            intent.setAction(this.A08);
            intent.setDataAndType(this.A06, this.A0A);
            intent.setSourceBounds(this.A05);
            intent.setSelector(this.A04);
            intent.setClipData(this.A02);
            Iterator<String> it = this.A0C.iterator();
            while (it.hasNext()) {
                intent.addCategory(AnonymousClass005.A0j(it));
            }
            if (this.A07 != null) {
                intent.setExtrasClassLoader(context.getClassLoader());
                intent.putExtras(this.A07);
            }
            long j = this.A01;
            if ((1 & j) != 0) {
                if ((4 & j) == 0) {
                    String packageName2 = this.A09;
                    if (packageName2 == null) {
                        packageName2 = context.getPackageName();
                        this.A09 = packageName2;
                    }
                    intent.setPackage(packageName2);
                    if ((2 & this.A01) == 0) {
                        if (intent.getAction() != null && !intent.getAction().startsWith("android")) {
                            return intent;
                        }
                        if (intent.getCategories() == null || intent.getCategories().isEmpty()) {
                            throw C60O.A0i("Please set reporter for SecurePendingIntent library");
                        }
                        return intent;
                    }
                    if (!this.A09.equals(context.getPackageName())) {
                        throw C60O.A0i("Please set reporter for SecurePendingIntent library");
                    }
                }
                return intent;
            }
            if (intent.getComponent() == null) {
                throw new SecurityException("Must generate PendingIntent based on an explicit intent.");
            }
            packageName = intent.getComponent().getPackageName();
        }
        intent.setPackage(packageName);
        return intent;
    }

    public void A05(Bundle bundle, ClassLoader classLoader) {
        Bundle bundle2 = this.A07;
        if (bundle2 == null) {
            bundle2 = new Bundle();
            this.A07 = bundle2;
        }
        if (classLoader != null) {
            bundle2.setClassLoader(classLoader);
        }
        this.A07.putAll(bundle);
    }

    public final PendingIntent A01(Context context, int i, int i2) {
        return PendingIntent.getActivity(context, i, A03(context), A00(this, i2));
    }

    public final PendingIntent A02(Context context, int i, int i2) {
        return PendingIntent.getBroadcast(context, i, A03(context), A00(this, i2));
    }

    public void A04(Intent intent, ClassLoader classLoader) {
        this.A03 = intent.getComponent();
        this.A08 = intent.getAction();
        this.A06 = intent.getData();
        this.A0A = intent.getType();
        this.A05 = intent.getSourceBounds();
        this.A04 = intent.getSelector();
        this.A02 = intent.getClipData();
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            this.A0C.addAll(categories);
        }
        this.A00 = intent.getFlags();
        if (intent.getExtras() != null) {
            if (classLoader != null) {
                intent.setExtrasClassLoader(classLoader);
            }
            A05(intent.getExtras(), classLoader);
        }
    }
}
