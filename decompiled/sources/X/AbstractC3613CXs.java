package X;

import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonRequestBuilder;
import java.util.HashMap;

/* renamed from: X.CXs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3613CXs extends CY0 {
    public static final TigonError A00(byte[] bArr, int i) {
        C7384Etj.A0Y(bArr, 0);
        C3614CXy c3614CXy = new C3614CXy(bArr, i);
        C3615CXz c3615CXz = CY0.A00;
        return new TigonError(TigonErrorCode.A00.fromValue(C3615CXz.A00(c3614CXy)), c3615CXz.A04(c3614CXy), c3615CXz.A04(c3614CXy), C3615CXz.A00(c3614CXy));
    }

    public static final CY1 A01(byte[] bArr, int i) {
        C7384Etj.A0Y(bArr, 0);
        C3614CXy c3614CXy = new C3614CXy(bArr, i);
        C3615CXz c3615CXz = CY0.A00;
        c3615CXz.A04(c3614CXy);
        CY1 cy1 = new CY1(A02(c3614CXy));
        c3615CXz.A05(c3614CXy, cy1);
        return cy1;
    }

    public static final TigonRequest A02(C3614CXy c3614CXy) {
        C3615CXz c3615CXz = CY0.A00;
        String strA04 = c3615CXz.A04(c3614CXy);
        String strA042 = c3615CXz.A04(c3614CXy);
        HashMap mapA03 = C3615CXz.A03(c3615CXz, c3614CXy);
        CXp cXp = new CXp(c3614CXy.A00(), c3614CXy.A00() != 0);
        boolean z = c3614CXy.A00() != 0;
        boolean z2 = c3614CXy.A00() != 0;
        long jA01 = C3615CXz.A01(c3614CXy);
        long jA012 = C3615CXz.A01(c3614CXy);
        long jA013 = C3615CXz.A01(c3614CXy);
        long jA014 = C3615CXz.A01(c3614CXy);
        CYV cyv = CYV.A00.get(Integer.valueOf(C3615CXz.A00(c3614CXy)));
        if (cyv == null) {
            cyv = CYV.A07;
        }
        CXt cXt = CXt.A00.get(Integer.valueOf(C3615CXz.A00(c3614CXy)));
        if (cXt == null) {
            cXt = CXt.A04;
        }
        String strA043 = c3615CXz.A04(c3614CXy);
        int iA00 = C3615CXz.A00(c3614CXy);
        long jA015 = C3615CXz.A01(c3614CXy);
        TigonRequestBuilder tigonRequestBuilder = new TigonRequestBuilder(strA04, strA042);
        tigonRequestBuilder.addHeaders(mapA03);
        tigonRequestBuilder.httpPriority = cXp;
        tigonRequestBuilder.retryable = z;
        tigonRequestBuilder.replaySafe = z2;
        tigonRequestBuilder.requestCategory = cyv;
        tigonRequestBuilder.purpose = cXt;
        tigonRequestBuilder.setConnectionTimeoutMS(jA01);
        tigonRequestBuilder.setIdleTimeoutMS(jA012);
        tigonRequestBuilder.setRequestTimeoutMS(jA013);
        tigonRequestBuilder.setResponseTimeoutMS(jA014);
        tigonRequestBuilder.setLoggingId(strA043);
        tigonRequestBuilder.startupStatusOnAdded = iA00;
        tigonRequestBuilder.addedToMiddlewareSinceEpochMS = jA015;
        c3615CXz.A05(c3614CXy, tigonRequestBuilder);
        return tigonRequestBuilder.build();
    }
}
