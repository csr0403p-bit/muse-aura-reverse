package com.facebook.aura.network.crudonet;

import X.AbstractC7559F3s;
import X.C4021Ck4;
import X.C4026CkF;
import X.C4027CkG;
import X.C4032CkY;
import X.C7384Etj;
import X.CYA;
import X.F0C;
import com.crossapp.tigonhttp.TigonHttpClient$TigonHttpClientServiceHolder;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraCrudoNet$requestFactory$2 extends AbstractC7559F3s implements Function0<C4021Ck4> {
    public static final AuraCrudoNet$requestFactory$2 INSTANCE = new AuraCrudoNet$requestFactory$2();

    /* renamed from: com.facebook.aura.network.crudonet.AuraCrudoNet$requestFactory$2$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public final String get() {
            return AuraUserAgent.fullUserAgent.getValue();
        }
    }

    public AuraCrudoNet$requestFactory$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4021Ck4 invoke() {
        C4032CkY c4032CkY = new C4032CkY();
        int i = AuraTigonServiceProvider.GATEWAY_STREAM_OPEN_PING_TIMEOUT_MS;
        TigonHttpClient$TigonHttpClientServiceHolder tigonHttpClient$TigonHttpClientServiceHolder = F0C.A02().A00;
        F0C f0c = AuraCrudoNet.networkExecutor$delegate;
        c4032CkY.A00 = new CYA(tigonHttpClient$TigonHttpClientServiceHolder, (ExecutorService) C7384Etj.A0G(f0c));
        c4032CkY.A01 = (ExecutorService) C7384Etj.A0G(f0c);
        C4027CkG c4027CkG = new C4027CkG(c4032CkY);
        return new C4021Ck4(AnonymousClass1.INSTANCE, new C4026CkF(), c4027CkG);
    }
}
