package X;

import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* renamed from: X.Cir, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C3986Cir implements Comparator {
    public static final /* synthetic */ C3986Cir A00 = new C3986Cir();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        String str = feature.A00;
        String str2 = feature2.A00;
        return !str.equals(str2) ? str.compareTo(str2) : (feature.A00() > feature2.A00() ? 1 : (feature.A00() == feature2.A00() ? 0 : -1));
    }
}
