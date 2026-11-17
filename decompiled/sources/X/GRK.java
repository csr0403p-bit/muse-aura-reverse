package X;

import com.facebook.debug.tracer.Tracer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes6.dex */
public abstract class GRK {
    public static final GRZ A01;
    public static final List<G0V<GRZ, GRZ, Unit>> A03;
    public static final GRJ A02 = GRW.A00;
    public static final ConcurrentHashMap<String, GRZ> A04 = C60O.A1C();
    public static AtomicReference<GRZ> A00 = BV4.A16(null);

    static {
        List<G0V<GRZ, GRZ, Unit>> listSynchronizedList = Collections.synchronizedList(C3cG.A0h());
        C7384Etj.A0U(listSynchronizedList);
        A03 = listSynchronizedList;
        A01 = new GRZ(null, "CALL_ENDED_NO_OP_STORE", C8472Feb.A00(40), GRO.A00(GRH.A02, null, new C8630Fhh(10)), false);
    }

    public static final GRZ A00(String str) {
        Tracer.A01("RpStores.getStoreForLocalCallId");
        try {
            GRZ grzComputeIfAbsent = A04.computeIfAbsent(str, new GRL(str));
            C7384Etj.A0U(grzComputeIfAbsent);
            GRZ grz = grzComputeIfAbsent;
            if (C7384Etj.areEqual(grz, A01)) {
                AbstractC7608F5v.A1L(FGI.A0M("Accessing an RpStore after the Call has ended & UI is finished. localCallId=", str));
            }
            return grz;
        } finally {
            Tracer.A00();
        }
    }
}
