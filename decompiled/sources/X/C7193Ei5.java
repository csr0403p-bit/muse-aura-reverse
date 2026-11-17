package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ei5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7193Ei5 implements InterfaceC7250EjU {
    public final List<InterfaceC7250EjU> A00;

    @Override // X.InterfaceC7208EiR
    public final void AUz(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AUz(str, str2, str3);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // X.InterfaceC7250EjU
    public final void AVN(String str) {
        C7384Etj.A0Y(str, 0);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AVN(str);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // X.InterfaceC7208EiR
    public final boolean AbF(String str) {
        C7384Etj.A0Y(str, 0);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).AbF(str)) {
                return true;
            }
        }
        return false;
    }

    public C7193Ei5(Set<? extends InterfaceC7250EjU> set) {
        this.A00 = C60O.A11(set.size());
        for (InterfaceC7250EjU interfaceC7250EjU : set) {
            if (interfaceC7250EjU != null) {
                ((AbstractCollection) this.A00).add(interfaceC7250EjU);
            }
        }
    }

    @Override // X.InterfaceC7208EiR
    public final void AV1(String str, String str2, Map<String, String> map) {
        AnonymousClass003.A0u(str, str2);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AV1(str, str2, map);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // X.InterfaceC7208EiR
    public final void AV3(String str, String str2, Throwable th, Map<String, String> map) {
        AnonymousClass005.A0x(str, str2, th);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AV3(str, str2, th, map);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // X.InterfaceC7208EiR
    public final void AV5(String str, String str2, Map<String, String> map) {
        AnonymousClass003.A0u(str, str2);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AV5(str, str2, map);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // X.InterfaceC7208EiR
    public final void AV7(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AV7(str, str2);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // X.InterfaceC7250EjU
    public final void AVP(C7183Eht c7183Eht, String str, Throwable th, boolean z) {
        AnonymousClass005.A0x(c7183Eht, str, th);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AVP(c7183Eht, str, th, z);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // X.InterfaceC7250EjU
    public final void AVR(C7183Eht c7183Eht, Object obj, String str, boolean z) {
        AnonymousClass005.A0x(c7183Eht, obj, str);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AVR(c7183Eht, obj, str, z);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // X.InterfaceC7250EjU
    public final void AVT(C7183Eht c7183Eht, String str, boolean z) {
        AnonymousClass003.A0u(c7183Eht, str);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AVT(c7183Eht, str, z);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // X.InterfaceC7208EiR
    public final void AWu(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        List<InterfaceC7250EjU> list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.get(i).AWu(str, str2, z);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public C7193Ei5(InterfaceC7250EjU... interfaceC7250EjUArr) {
        ArrayList arrayListA11 = C60O.A11(interfaceC7250EjUArr.length);
        this.A00 = arrayListA11;
        for (InterfaceC7250EjU interfaceC7250EjU : interfaceC7250EjUArr) {
            if (interfaceC7250EjU != null) {
                arrayListA11.add(interfaceC7250EjU);
            }
        }
    }
}
