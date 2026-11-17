package com.facebook.aura.auth.encryption;

import X.AbstractC7559F3s;
import X.BV4;
import X.C4021Ck4;
import X.C4022Ck5;
import X.C4031CkX;
import X.C4oT;
import X.C7384Etj;
import X.C79;
import X.CGl;
import X.Ck3;
import X.Ck7;
import X.InterfaceC4039Ckg;
import com.facebook.aura.appid.AuraClientToken;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.network.crudonet.AuraCrudoNet;
import com.facebook.aura.network.endpoint.AuraEndpointSelector;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraPasswordEncryptionHelper$controller$2 extends AbstractC7559F3s implements Function0<Ck7> {
    public static final AuraPasswordEncryptionHelper$controller$2 INSTANCE = new AuraPasswordEncryptionHelper$controller$2();

    public AuraPasswordEncryptionHelper$controller$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Ck7 invoke() {
        C4oT c4oTAuthPrefs = HatchPrefsStore.INSTANCE.authPrefs();
        C4022Ck5 c4022Ck5 = new C4022Ck5(new Ck3((C4021Ck4) C7384Etj.A0G(AuraCrudoNet.requestFactory$delegate), new InterfaceC4039Ckg() { // from class: com.facebook.aura.auth.encryption.AuraPasswordEncryptionHelper$controller$2$frlRequestFactory$1
            @Override // X.InterfaceC4039Ckg
            public final String get() {
                return AuraClientToken.loggedOutARAccessToken;
            }
        }, new AuraEndpointSelector()));
        CGl cGl = new CGl(c4oTAuthPrefs);
        C4031CkX c4031CkX = new C4031CkX(c4022Ck5, BV4.A0f());
        Integer num = C79.A00;
        if (Ck7.A07 == null) {
            synchronized (Ck7.class) {
                if (Ck7.A07 == null) {
                    Ck7 ck7 = new Ck7();
                    ck7.A01 = cGl;
                    ck7.A00 = c4031CkX;
                    ck7.A02 = num;
                    ck7.A03 = true;
                    Ck7.A07 = ck7;
                    Ck7.A07.A01();
                }
            }
        }
        return Ck7.A07;
    }
}
