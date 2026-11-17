package X;

import com.facebook.tigon.iface.TigonRequest;

/* renamed from: X.CXn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3612CXn extends AbstractC3609CXj {
    public static final void A00(C3610CXl c3610CXl, TigonRequest tigonRequest) {
        C7384Etj.A0Y(tigonRequest, 1);
        C3611CXm c3611CXm = AbstractC3609CXj.A00;
        c3611CXm.A05(c3610CXl, tigonRequest.method);
        c3611CXm.A05(c3610CXl, tigonRequest.url);
        C3611CXm.A01(c3611CXm, c3610CXl, tigonRequest.headers);
        CXp cXp = tigonRequest.httpPriority;
        c3610CXl.A00(cXp.A00);
        c3610CXl.A00(cXp.A01 ? (byte) 1 : (byte) 0);
        c3610CXl.A00(tigonRequest.retryable ? (byte) 1 : (byte) 0);
        c3610CXl.A00(tigonRequest.replaySafe ? (byte) 1 : (byte) 0);
        C3611CXm.A03(c3610CXl, tigonRequest.connectionTimeoutMS);
        C3611CXm.A03(c3610CXl, tigonRequest.idleTimeoutMS);
        C3611CXm.A03(c3610CXl, tigonRequest.requestTimeoutMS);
        C3611CXm.A03(c3610CXl, tigonRequest.responseTimeoutMS);
        CYV cyv = tigonRequest.requestCategory;
        C7384Etj.A0Y(cyv, 1);
        C3611CXm.A02(c3610CXl, cyv.value);
        CXt cXt = tigonRequest.purpose;
        C7384Etj.A0Y(cXt, 1);
        C3611CXm.A02(c3610CXl, cXt.value);
        c3611CXm.A05(c3610CXl, tigonRequest.loggingId);
        C3611CXm.A02(c3610CXl, tigonRequest.startupStatusOnAdded);
        C3611CXm.A03(c3610CXl, tigonRequest.addedToMiddlewareSinceEpochMS);
        c3611CXm.A04(c3610CXl, tigonRequest);
    }
}
