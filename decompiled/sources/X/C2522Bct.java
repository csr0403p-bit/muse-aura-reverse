package X;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.Bct, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2522Bct {
    public final Map<C2421Bax, AbstractC2527Bcy> A00 = C3cG.A0j();
    public final TreeMap<Size, C2421Bax> A01 = new TreeMap<>(new C2482Bc9());
    public final AbstractC2527Bcy A02;
    public final AbstractC2527Bcy A03;

    public final AbstractC2527Bcy A00(C2421Bax c2421Bax) {
        BeS.A06(C2421Bax.A08.contains(c2421Bax), AnonymousClass007.A0a("Unknown quality: ", c2421Bax));
        return c2421Bax == C2421Bax.A02 ? this.A02 : c2421Bax == C2421Bax.A03 ? this.A03 : this.A00.get(c2421Bax);
    }

    public C2522Bct(InterfaceC2420Baw interfaceC2420Baw) {
        Iterator itA0z = BV5.A0z(C2421Bax.A07);
        while (itA0z.hasNext()) {
            C2421Bax c2421Bax = (C2421Bax) itA0z.next();
            BeS.A07(c2421Bax instanceof Bb0, "Currently only support ConstantQuality");
            InterfaceC2523Bcu interfaceC2523BcuACK = interfaceC2420Baw.ACK(((C2423Baz) ((Bb0) c2421Bax)).A00);
            if (interfaceC2523BcuACK != null) {
                AbstractC2875Bni.A00(interfaceC2523BcuACK, "profiles = ", "CapabilitiesByQuality");
                List<AbstractC2509Bcf> listAMe = interfaceC2523BcuACK.AMe();
                if (listAMe.isEmpty()) {
                    AbstractC2875Bni.A03("CapabilitiesByQuality", AnonymousClass001.A0v(" has no video validated profiles.", C3cG.A0f(c2421Bax, "EncoderProfiles of quality ")));
                } else {
                    int iAEh = interfaceC2523BcuACK.AEh();
                    int iAJS = interfaceC2523BcuACK.AJS();
                    List<AbstractC2528Bcz> listACZ = interfaceC2523BcuACK.ACZ();
                    BeS.A06(BV6.A1b(listAMe), "Should contain at least one VideoProfile.");
                    C2524Bcv c2524Bcv = new C2524Bcv(!listACZ.isEmpty() ? listACZ.get(0) : null, listAMe.get(0), BV5.A13(listACZ), BV5.A13(listAMe), iAEh, iAJS);
                    C2520Bcr c2520Bcr = (C2520Bcr) c2524Bcv.A01;
                    this.A01.put(BV6.A0P(c2520Bcr.A08, c2520Bcr.A06), c2421Bax);
                    this.A00.put(c2421Bax, c2524Bcv);
                }
            }
        }
        if (this.A00.isEmpty()) {
            AbstractC2875Bni.A02("CapabilitiesByQuality", "No supported EncoderProfiles");
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.A00.values());
        this.A02 = (AbstractC2527Bcy) arrayDeque.peekFirst();
        this.A03 = (AbstractC2527Bcy) arrayDeque.peekLast();
    }
}
