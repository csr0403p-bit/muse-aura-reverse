package com.facebook.aura.accountcenter;

import X.AbstractC7559F3s;
import X.C4021Ck4;
import X.C7384Etj;
import X.Ck3;
import X.InterfaceC4039Ckg;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.network.crudonet.AuraCrudoNet;
import com.facebook.aura.network.endpoint.AuraEndpointSelector;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraMetaCookieRequestFactory$instance$2 extends AbstractC7559F3s implements Function0<Ck3> {
    public static final AuraMetaCookieRequestFactory$instance$2 INSTANCE = new AuraMetaCookieRequestFactory$instance$2();

    public AuraMetaCookieRequestFactory$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Ck3 invoke() {
        return new Ck3((C4021Ck4) C7384Etj.A0G(AuraCrudoNet.requestFactory$delegate), new InterfaceC4039Ckg() { // from class: com.facebook.aura.accountcenter.AuraMetaCookieRequestFactory$instance$2.1
            @Override // X.InterfaceC4039Ckg
            public final String get() {
                return AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken();
            }
        }, new AuraEndpointSelector());
    }
}
