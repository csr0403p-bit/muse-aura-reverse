package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ei4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7192Ei4 implements InterfaceC7251EjV {
    public final List<InterfaceC7251EjV> A00;

    @Override // X.InterfaceC7027EeY
    public final void AUy(InterfaceC7029Eea interfaceC7029Eea, String str, String str2) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AUy(interfaceC7029Eea, str, str2);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // X.InterfaceC7251EjV
    public final void AVM(InterfaceC7029Eea interfaceC7029Eea) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AVM(interfaceC7029Eea);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // X.InterfaceC7251EjV
    public final void AVS(InterfaceC7029Eea interfaceC7029Eea) {
        C7384Etj.A0Y(interfaceC7029Eea, 0);
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AVS(interfaceC7029Eea);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // X.InterfaceC7027EeY
    public final boolean AbE(InterfaceC7029Eea interfaceC7029Eea, String str) {
        boolean zA1a = AnonymousClass002.A1a(interfaceC7029Eea, str);
        List<InterfaceC7251EjV> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<InterfaceC7251EjV> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().AbE(interfaceC7029Eea, str)) {
                    return zA1a;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC7027EeY
    public final void AV0(InterfaceC7029Eea interfaceC7029Eea, String str, Map<String, String> map) {
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AV0(interfaceC7029Eea, str, map);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // X.InterfaceC7027EeY
    public final void AV2(InterfaceC7029Eea interfaceC7029Eea, String str, Throwable th, Map<String, String> map) {
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AV2(interfaceC7029Eea, str, th, map);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // X.InterfaceC7027EeY
    public final void AV4(InterfaceC7029Eea interfaceC7029Eea, String str, Map<String, String> map) {
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AV4(interfaceC7029Eea, str, map);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // X.InterfaceC7251EjV
    public final void AVQ(InterfaceC7029Eea interfaceC7029Eea) {
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AVQ(interfaceC7029Eea);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    public C7192Ei4(Set<? extends InterfaceC7251EjV> set) {
        ArrayList arrayListA0h = C3cG.A0h();
        this.A00 = arrayListA0h;
        for (InterfaceC7251EjV interfaceC7251EjV : set) {
            if (interfaceC7251EjV != null) {
                arrayListA0h.add(interfaceC7251EjV);
            }
        }
    }

    @Override // X.InterfaceC7027EeY
    public final void AV6(InterfaceC7029Eea interfaceC7029Eea, String str) {
        AnonymousClass003.A0u(interfaceC7029Eea, str);
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AV6(interfaceC7029Eea, str);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // X.InterfaceC7251EjV
    public final void AVO(InterfaceC7029Eea interfaceC7029Eea, Throwable th) {
        AnonymousClass003.A0u(interfaceC7029Eea, th);
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AVO(interfaceC7029Eea, th);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // X.InterfaceC7027EeY
    public final void AWt(InterfaceC7029Eea interfaceC7029Eea, String str, boolean z) {
        AnonymousClass003.A0u(interfaceC7029Eea, str);
        Iterator<InterfaceC7251EjV> it = this.A00.iterator();
        while (it.hasNext()) {
            try {
                it.next().AWt(interfaceC7029Eea, str, z);
            } catch (Exception e) {
                AbstractC3422CMk.A05("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }
}
