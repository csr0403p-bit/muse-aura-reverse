package X;

import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class HuB implements Comparator<ComponentInfo> {
    public static final Set<String> A00 = BV5.A0v(new String[]{"com.facebook.lite", "com.facebook.liteqa", "com.instagram.lite"});

    public static int A00(String str) {
        C7384Etj.A0Y(str, 0);
        List<String> list = Hj7.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 2;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (str.equals(strA0j) || str.startsWith(FGI.A0M(strA0j, "."))) {
                return A00.contains(str) ? 1 : 0;
            }
        }
        return 2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ComponentInfo componentInfo, ComponentInfo componentInfo2) {
        ComponentInfo componentInfo3 = componentInfo;
        ComponentInfo componentInfo4 = componentInfo2;
        int iCompareTo = Integer.valueOf(A00(((PackageItemInfo) componentInfo3).packageName)).compareTo(Integer.valueOf(A00(((PackageItemInfo) componentInfo4).packageName)));
        return iCompareTo == 0 ? ((PackageItemInfo) componentInfo3).packageName.compareTo(((PackageItemInfo) componentInfo4).packageName) : iCompareTo;
    }
}
