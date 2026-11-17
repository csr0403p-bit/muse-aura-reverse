package com.facebook.aura.network.transport.tigon;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.F0C;
import com.facebook.aura.gateway.HatchGatewayPreconnect;
import com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchScopedVmChannel;
import com.facebook.aura.network.transport.HatchTransportFactory;
import com.facebook.aura.network.transport.HatchWebSocket;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClient;
import com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient;
import com.facebook.aura.network.transport.tigon.TigonHatchHttpClient;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class TigonTransportFactory implements HatchTransportFactory {
    public static final TigonTransportFactory INSTANCE = new TigonTransportFactory();
    public static final F0C metaBearerHttpClient$delegate;
    public static final F0C metaBearerWebSocket$delegate;
    public static final F0C metaUnauthHttpClient$delegate;
    public static final F0C metaUnauthWebSocket$delegate;
    public static final F0C vmJwtHttpClient$delegate;
    public static final F0C vmJwtNoiseGatewayWebSocket$delegate;

    @Override // com.facebook.aura.network.transport.HatchTransportFactory
    public HatchHttpClient httpClient(HatchAuthScheme hatchAuthScheme) {
        F0C f0c;
        C7384Etj.A0Y(hatchAuthScheme, 0);
        int iOrdinal = hatchAuthScheme.ordinal();
        if (iOrdinal == 0) {
            f0c = vmJwtHttpClient$delegate;
        } else if (iOrdinal == 1) {
            f0c = metaBearerHttpClient$delegate;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f0c = metaUnauthHttpClient$delegate;
        }
        return (HatchHttpClient) f0c.getValue();
    }

    @Override // com.facebook.aura.network.transport.HatchTransportFactory
    public HatchWebSocket webSocket(HatchAuthScheme hatchAuthScheme) {
        F0C f0c;
        int iA0E = AnonymousClass001.A0E(hatchAuthScheme, 0);
        if (iA0E == 0) {
            f0c = vmJwtNoiseGatewayWebSocket$delegate;
        } else if (iA0E == 1) {
            f0c = metaBearerWebSocket$delegate;
        } else {
            if (iA0E != 2) {
                throw C3cG.A0q();
            }
            f0c = metaUnauthWebSocket$delegate;
        }
        return (HatchWebSocket) f0c.getValue();
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAuthScheme.values().length];
            try {
                AnonymousClass002.A13(HatchAuthScheme.VM_JWT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAuthScheme.META_BEARER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAuthScheme.META_UNAUTH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HatchGatewayPreconnect.parkedTransportHook = GatewayParkedTransport.INSTANCE;
        vmJwtHttpClient$delegate = AbstractC5321DgF.A03(TigonTransportFactory$vmJwtHttpClient$2.INSTANCE);
        metaBearerHttpClient$delegate = AbstractC5321DgF.A03(TigonTransportFactory$metaBearerHttpClient$2.INSTANCE);
        metaUnauthHttpClient$delegate = AbstractC5321DgF.A03(TigonTransportFactory$metaUnauthHttpClient$2.INSTANCE);
        vmJwtNoiseGatewayWebSocket$delegate = AbstractC5321DgF.A03(TigonTransportFactory$vmJwtNoiseGatewayWebSocket$2.INSTANCE);
        metaBearerWebSocket$delegate = AbstractC5321DgF.A03(TigonTransportFactory$metaBearerWebSocket$2.INSTANCE);
        metaUnauthWebSocket$delegate = AbstractC5321DgF.A03(TigonTransportFactory$metaUnauthWebSocket$2.INSTANCE);
    }

    private final HatchHttpClient getMetaBearerHttpClient() {
        return (HatchHttpClient) metaBearerHttpClient$delegate.getValue();
    }

    private final HatchWebSocket getMetaBearerWebSocket() {
        return (HatchWebSocket) metaBearerWebSocket$delegate.getValue();
    }

    private final HatchHttpClient getMetaUnauthHttpClient() {
        return (HatchHttpClient) metaUnauthHttpClient$delegate.getValue();
    }

    private final HatchWebSocket getMetaUnauthWebSocket() {
        return (HatchWebSocket) metaUnauthWebSocket$delegate.getValue();
    }

    private final HatchHttpClient getVmJwtHttpClient() {
        return (HatchHttpClient) vmJwtHttpClient$delegate.getValue();
    }

    private final HatchWebSocket getVmJwtNoiseGatewayWebSocket() {
        return (HatchWebSocket) vmJwtNoiseGatewayWebSocket$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchHttpClient reportingClient(HatchAuthScheme hatchAuthScheme) {
        return new CachingHatchHttpClient(new FlipperReportingHatchHttpClient(new AuraNetworkLogRecordingHatchHttpClient(new TigonHatchHttpClient(hatchAuthScheme, TigonHatchHttpClient.AnonymousClass1.INSTANCE, TigonHatchHttpClient.AnonymousClass2.INSTANCE, TigonHatchHttpClient.AnonymousClass3.INSTANCE, TigonHatchHttpClient.AnonymousClass4.INSTANCE, false))), hatchAuthScheme);
    }

    @Override // com.facebook.aura.network.transport.HatchTransportFactory
    public HatchScopedVmChannel openScopedVmChannel(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return TigonScopedVmChannels.INSTANCE.open(str, str2, str3);
    }

    @Override // com.facebook.aura.network.transport.HatchTransportFactory
    public boolean willUseTigon(HatchAuthScheme hatchAuthScheme) {
        return true;
    }
}
