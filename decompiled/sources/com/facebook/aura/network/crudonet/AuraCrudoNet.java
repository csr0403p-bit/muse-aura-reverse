package com.facebook.aura.network.crudonet;

import X.AbstractC5321DgF;
import X.C4021Ck4;
import X.C7384Etj;
import X.F0C;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AuraCrudoNet {
    public static final AuraCrudoNet INSTANCE = new AuraCrudoNet();
    public static final F0C requestFactory$delegate = AbstractC5321DgF.A03(AuraCrudoNet$requestFactory$2.INSTANCE);
    public static final F0C networkExecutor$delegate = AbstractC5321DgF.A03(AuraCrudoNet$networkExecutor$2.INSTANCE);

    public static final /* synthetic */ ExecutorService access$getNetworkExecutor(AuraCrudoNet auraCrudoNet) {
        return (ExecutorService) C7384Etj.A0G(networkExecutor$delegate);
    }

    private final ExecutorService getNetworkExecutor() {
        return (ExecutorService) C7384Etj.A0G(networkExecutor$delegate);
    }

    public final C4021Ck4 getRequestFactory() {
        return (C4021Ck4) C7384Etj.A0G(requestFactory$delegate);
    }
}
