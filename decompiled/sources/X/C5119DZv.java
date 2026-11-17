package X;

import android.content.res.AssetManager;
import com.facebook.aura.graphql.AuraGraphQLExecutorFactory;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.DZv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5119DZv {
    public final AssetManager A00;
    public final BWN A01;
    public final ConcurrentHashMap<String, C5120DZw> A03 = C60O.A1C();
    public final ConcurrentHashMap<String, Integer> A02 = C60O.A1C();

    public final int A00(String str) {
        C7384Etj.A0Y(str, 0);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.A02;
        Integer numValueOf = concurrentHashMap.get(str);
        if (numValueOf == null) {
            C5120DZw c5120DZwA02 = A02(str);
            c5120DZwA02.A05.getValue();
            numValueOf = Integer.valueOf(c5120DZwA02.A04.hashCode());
            Integer numPutIfAbsent = concurrentHashMap.putIfAbsent(str, numValueOf);
            if (numPutIfAbsent != null) {
                numValueOf = numPutIfAbsent;
            }
        }
        return AnonymousClass001.A0F(numValueOf);
    }

    public final C5120DZw A02(String str) {
        C5120DZw c5120DZw;
        C7384Etj.A0Y(str, 0);
        boolean zEquals = str.equals("iap-android");
        if (zEquals || str.equals("placesdata-android")) {
            if (!zEquals && !str.equals("placesdata-android")) {
                throw BV5.A0T("No implementation bound to key: %s", new Object[]{str});
            }
            str = AuraGraphQLExecutorFactory.ABRA_ANDROID_BUILD_CONFIG;
        }
        ConcurrentHashMap<String, C5120DZw> concurrentHashMap = this.A03;
        C5120DZw c5120DZwPutIfAbsent = concurrentHashMap.get(str);
        if (c5120DZwPutIfAbsent == null && (c5120DZwPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c5120DZw = new C5120DZw(this.A00, this.A01, str)))) == null) {
            c5120DZwPutIfAbsent = c5120DZw;
        }
        return c5120DZwPutIfAbsent;
    }

    public C5119DZv(AssetManager assetManager, BWN bwn) {
        this.A00 = assetManager;
        this.A01 = bwn;
    }

    public final DZu A01(int i, String str) {
        C5120DZw c5120DZwA02 = A02(str);
        ConcurrentHashMap<Integer, DZu> concurrentHashMap = c5120DZwA02.A03.A00;
        Integer numValueOf = Integer.valueOf(i);
        DZu c5130DaE = concurrentHashMap.get(numValueOf);
        if (c5130DaE == null) {
            Da2 value = c5120DZwA02.A07.getValue();
            int iA07 = value.A07(12);
            if (iA07 != 0) {
                int iA01 = DZx.A01(value, iA07) + 4;
                ByteBuffer byteBuffer = value.A04;
                if (byteBuffer != null) {
                    byteBuffer.getInt(iA01 - 4);
                }
            }
            DZy dZyA01 = C5120DZw.A01(value, i);
            DZu dZuPutIfAbsent = null;
            if (dZyA01 == null || (dZuPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (c5130DaE = new C5130DaE(c5120DZwA02.A01, dZyA01)))) != null) {
                c5130DaE = dZuPutIfAbsent;
            }
        }
        return c5130DaE;
    }
}
