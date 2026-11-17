package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BxN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3081BxN {
    public static final C3082BxO A00 = new C3082BxO();

    public static final void A01(Context context, BWN bwn) {
        C7384Etj.A0Y(context, 0);
        C3082BxO c3082BxO = A00;
        C2468Bbv c2468Bbv = new C2468Bbv(bwn, new C5322DgG(null, new C6597EIz(context, bwn)));
        AtomicReference<C2468Bbv> atomicReference = c3082BxO.A00;
        Bs8.A00(null, c2468Bbv, atomicReference);
        if (atomicReference.get() == null) {
            throw BV4.A0U();
        }
    }

    public static final C5119DZv A00() {
        C5119DZv value;
        AtomicReference<C2468Bbv> atomicReference = A00.A00;
        C2468Bbv c2468Bbv = atomicReference.get();
        if (c2468Bbv == null || (value = c2468Bbv.A00.getValue()) == null) {
            A01(C4JM.A00(), BWN.A02);
            C2468Bbv c2468Bbv2 = atomicReference.get();
            if (c2468Bbv2 == null || (value = c2468Bbv2.A00.getValue()) == null) {
                throw BV4.A0c("StaticPandoFlatbufferProvider failed to initialize");
            }
        }
        return value;
    }
}
