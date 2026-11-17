package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class CJK {
    public static final CJQ A01 = new CJQ("SplitInstallInfoProvider");
    public final Context A00;

    public final C7394EuX A02(Bundle bundle) throws XmlPullParserException, Resources.NotFoundException, IOException {
        CJQ cjq;
        Object[] objArr;
        String str;
        String attributeValue;
        String attributeValue2;
        if (bundle == null) {
            cjq = A01;
            objArr = new Object[0];
            str = "No metadata found in Context.";
        } else {
            int i = bundle.getInt("com.android.vending.splits");
            if (i != 0) {
                try {
                    XmlResourceParser xml = this.A00.getResources().getXml(i);
                    HashMap mapA0u = BV4.A0u();
                    while (xml.next() != 1) {
                        try {
                            if (xml.getEventType() == 2) {
                                if (xml.getName().equals("splits")) {
                                    while (xml.next() != 3) {
                                        if (xml.getEventType() == 2) {
                                            if (xml.getName().equals("module")) {
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= xml.getAttributeCount()) {
                                                        break;
                                                    }
                                                    if (xml.getAttributeName(i2).equals("name")) {
                                                        String attributeValue3 = xml.getAttributeValue(i2);
                                                        if (attributeValue3 != null) {
                                                            while (xml.next() != 3) {
                                                                if (xml.getEventType() == 2) {
                                                                    if (xml.getName().equals("language")) {
                                                                        while (xml.next() != 3) {
                                                                            if (xml.getEventType() == 2) {
                                                                                if (xml.getName().equals("entry")) {
                                                                                    int i3 = 0;
                                                                                    while (true) {
                                                                                        if (i3 >= xml.getAttributeCount()) {
                                                                                            attributeValue = null;
                                                                                            break;
                                                                                        }
                                                                                        if (xml.getAttributeName(i3).equals("key")) {
                                                                                            attributeValue = xml.getAttributeValue(i3);
                                                                                            break;
                                                                                        }
                                                                                        i3++;
                                                                                    }
                                                                                    int i4 = 0;
                                                                                    while (true) {
                                                                                        if (i4 >= xml.getAttributeCount()) {
                                                                                            attributeValue2 = null;
                                                                                            break;
                                                                                        }
                                                                                        if (xml.getAttributeName(i4).equals("split")) {
                                                                                            attributeValue2 = xml.getAttributeValue(i4);
                                                                                            break;
                                                                                        }
                                                                                        i4++;
                                                                                    }
                                                                                    int i5 = 1;
                                                                                    while (true) {
                                                                                        int next = xml.next();
                                                                                        if (next == 2) {
                                                                                            i5++;
                                                                                        } else if (next == 3) {
                                                                                            i5--;
                                                                                        } else {
                                                                                            continue;
                                                                                        }
                                                                                        if (i5 == 0) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (attributeValue != null && attributeValue2 != null) {
                                                                                        if (!mapA0u.containsKey(attributeValue)) {
                                                                                            mapA0u.put(attributeValue, BV4.A0u());
                                                                                        }
                                                                                        ((Map) mapA0u.get(attributeValue)).put(attributeValue3, attributeValue2);
                                                                                    }
                                                                                } else {
                                                                                    int i6 = 1;
                                                                                    while (true) {
                                                                                        int next2 = xml.next();
                                                                                        if (next2 == 2) {
                                                                                            i6++;
                                                                                        } else if (next2 == 3) {
                                                                                            i6--;
                                                                                        } else {
                                                                                            continue;
                                                                                        }
                                                                                        if (i6 != 0) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        int i7 = 1;
                                                                        while (true) {
                                                                            int next3 = xml.next();
                                                                            if (next3 == 2) {
                                                                                i7++;
                                                                            } else if (next3 == 3) {
                                                                                i7--;
                                                                            } else {
                                                                                continue;
                                                                            }
                                                                            if (i7 != 0) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            }
                                            int i8 = 1;
                                            while (true) {
                                                int next4 = xml.next();
                                                if (next4 == 2) {
                                                    i8++;
                                                } else if (next4 == 3) {
                                                    i8--;
                                                } else {
                                                    continue;
                                                }
                                                if (i8 != 0) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int i9 = 1;
                                    while (true) {
                                        int next5 = xml.next();
                                        if (next5 == 2) {
                                            i9++;
                                        } else if (next5 == 3) {
                                            i9--;
                                        } else {
                                            continue;
                                        }
                                        if (i9 != 0) {
                                        }
                                    }
                                }
                            }
                        } catch (IOException | IllegalStateException | XmlPullParserException e) {
                            Log.e("SplitInstall", "Error while parsing splits.xml", e);
                            cjq = A01;
                            objArr = new Object[0];
                            str = "Can't parse languages metadata.";
                        }
                    }
                    HashMap mapA0u2 = BV4.A0u();
                    Iterator itA0i = C3cG.A0i(mapA0u);
                    while (itA0i.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0i);
                        mapA0u2.put(entryA0l.getKey(), BV5.A15((Map) entryA0l.getValue()));
                    }
                    return new C7394EuX(Collections.unmodifiableMap(mapA0u2));
                } catch (Resources.NotFoundException unused) {
                    A01.A04("Resource with languages metadata doesn't exist.", new Object[0]);
                    return null;
                }
            }
            cjq = A01;
            objArr = new Object[0];
            str = "No metadata found in AndroidManifest.";
        }
        cjq.A04(str, objArr);
        return null;
    }

    public static final HashSet A01(PackageInfo packageInfo) {
        Bundle bundle = ((PackageItemInfo) packageInfo.applicationInfo).metaData;
        HashSet hashSetA13 = C60O.A13();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                A01.A01("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSetA13, BV4.A1a(string, ","));
                hashSetA13.remove("");
                hashSetA13.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        CJQ cjq = A01;
        if (strArr == null) {
            cjq.A01("No splits are found or app cannot be found in package manager.", new Object[0]);
            return hashSetA13;
        }
        cjq.A01("Adding splits from package manager: %s", Arrays.toString(strArr));
        Collections.addAll(hashSetA13, strArr);
        return hashSetA13;
    }

    public final HashSet A03() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        try {
            packageInfo = this.A00.getPackageManager().getPackageInfo("com.facebook.aura", 128);
        } catch (PackageManager.NameNotFoundException unused) {
            A01.A02("App is not found in PackageManager", BV4.A1W());
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? C60O.A13() : A00(packageInfo);
    }

    public CJK(Context context) {
        this.A00 = context;
        context.getPackageName();
    }

    public static final HashSet A00(PackageInfo packageInfo) {
        HashSet hashSetA13 = C60O.A13();
        Iterator it = A01(packageInfo).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (!strA0j.startsWith("config.") && !strA0j.contains(".config.")) {
                hashSetA13.add(strA0j);
            }
        }
        return hashSetA13;
    }
}
