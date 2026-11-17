package com.facebook.aura.nodes;

import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class HatchNodeClient$attach$snap$1 extends AbstractC7559F3s implements G0U<ClientRegisterCapabilitiesParamsJson, ClientRegisterCapabilitiesParamsJson> {
    public final /* synthetic */ HatchNodeClient this$0;

    @Override // X.G0U
    public final ClientRegisterCapabilitiesParamsJson invoke(ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson) {
        C7384Etj.A0Y(clientRegisterCapabilitiesParamsJson, 0);
        Long lCurrentConnectionGeneration = this.this$0.invocationDispatcher.currentConnectionGeneration();
        int[] iArr = {0, 1, 2};
        HatchNodeClient hatchNodeClient = this.this$0;
        int i = 0;
        do {
            int i2 = iArr[i];
            if (lCurrentConnectionGeneration != null) {
                try {
                    ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJsonA07 = AnonymousClass801.A07(i2, clientRegisterCapabilitiesParamsJson, hatchNodeClient.userSession, lCurrentConnectionGeneration.longValue());
                    C7384Etj.A0X(clientRegisterCapabilitiesParamsJsonA07);
                    clientRegisterCapabilitiesParamsJson = clientRegisterCapabilitiesParamsJsonA07;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    CFK.A08(HatchNodeClientKt.TAG, FGI.A0H("Capability contributor failed: ", i2), e2);
                }
            }
            i++;
        } while (i < 3);
        return clientRegisterCapabilitiesParamsJson;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$attach$snap$1(HatchNodeClient hatchNodeClient) {
        super(1);
        this.this$0 = hatchNodeClient;
    }
}
