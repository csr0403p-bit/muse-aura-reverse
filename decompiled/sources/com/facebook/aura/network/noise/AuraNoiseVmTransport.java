package com.facebook.aura.network.noise;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C6686ERv;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.ERo;
import X.F0C;
import X.G0V;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.crossapp.tigonhttp.noise.NoiseConnectionDemandListener;

/* loaded from: classes5.dex */
public final class AuraNoiseVmTransport {
    public static final AuraNoiseVmTransport INSTANCE = new AuraNoiseVmTransport();
    public static final F0C<NoiseDemandListenerRegistry<NoiseConnectionDemandListener, Long>> demandListenersLazy;
    public static volatile boolean httpRoutingEnabled = false;
    public static final boolean isEnabled = true;
    public static final F0C<NoiseChannelManagerHolder> managerHolderLazy;

    public final String connectionKeyFromUrl(String str) {
        C7384Etj.A0Y(str, 0);
        C6686ERv.A00(NoiseChannelManagerHolder.Companion);
        return NoiseChannelManagerHolder.connectionKeyFromUrlNative(str);
    }

    public final synchronized void registerConnectionDemandHandler(G0V<? super Long, ? super String, Boolean> g0v) {
        C7384Etj.A0Y(g0v, 0);
        demandListenersLazy.getValue().replace(new AuraNoiseVmTransportKt$sam$com_crossapp_tigonhttp_noise_NoiseConnectionDemandListener$0(g0v));
    }

    public final synchronized void rejectConnectionDemand(long j, AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason) {
        ERo eRo;
        switch (AnonymousClass001.A0E(auraNoiseConnectionDemandRejectionReason, 1)) {
            case 0:
                eRo = ERo.A04;
                break;
            case 1:
                eRo = ERo.A02;
                break;
            case 2:
                eRo = ERo.A05;
                break;
            case 3:
                eRo = ERo.A07;
                break;
            case 4:
                eRo = ERo.A06;
                break;
            case 5:
                eRo = ERo.A03;
                break;
            default:
                throw C3cG.A0q();
        }
        F0C.A03().rejectConnectionDemand(j, eRo);
    }

    public final void setHttpZstdPaths(String str) {
        C7384Etj.A0Y(str, 0);
        F0C<NoiseChannelManagerHolder> f0c = managerHolderLazy;
        f0c.getValue().setHttpZstdPaths(str);
        f0c.getValue().setHttpZstdEnabled(!C7BY.A0j(str));
    }

    public final synchronized void unregisterConnectionDemandHandler() {
        F0C<NoiseDemandListenerRegistry<NoiseConnectionDemandListener, Long>> f0c = demandListenersLazy;
        if (f0c.AOX()) {
            f0c.getValue().clear();
        } else {
            setHttpRoutingGate(false);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraNoiseConnectionDemandRejectionReason.values().length];
            try {
                AnonymousClass002.A13(AuraNoiseConnectionDemandRejectionReason.OFFLINE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraNoiseConnectionDemandRejectionReason.BACKGROUND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraNoiseConnectionDemandRejectionReason.PAUSED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraNoiseConnectionDemandRejectionReason.SESSION_ENDED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraNoiseConnectionDemandRejectionReason.RETRY_EXHAUSTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AuraNoiseConnectionDemandRejectionReason.INTERNAL, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Integer num = C79.A00;
        managerHolderLazy = AbstractC5321DgF.A02(num, AuraNoiseVmTransport$managerHolderLazy$1.INSTANCE);
        demandListenersLazy = AbstractC5321DgF.A02(num, AuraNoiseVmTransport$demandListenersLazy$1.INSTANCE);
    }

    private final NoiseDemandListenerRegistry<NoiseConnectionDemandListener, Long> getDemandListeners() {
        return demandListenersLazy.getValue();
    }

    public final boolean getHttpRoutingEnabled() {
        return httpRoutingEnabled;
    }

    public final boolean isEnabled() {
        return isEnabled;
    }

    public final void setHttpRoutingGate(boolean z) {
        httpRoutingEnabled = z;
        if (z || managerHolderLazy.AOX()) {
            F0C.A03().setHttpEnabled(z);
        }
    }

    private final NoiseChannelManagerHolder getManagerHolder() {
        return F0C.A03();
    }

    public final NoiseChannelManagerHolder holder() {
        return F0C.A03();
    }

    public final void setHttpZstdUploadsEnabled(boolean z) {
        F0C.A03().setHttpZstdUploadsEnabled(z);
    }
}
