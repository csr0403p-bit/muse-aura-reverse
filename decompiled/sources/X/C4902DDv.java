package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.base.Supplier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DDv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4902DDv implements CXN {
    public final InterfaceC4913DEg A00;
    public final InterfaceC4913DEg A01;
    public final DE9 A02;
    public final C5326DgK A03;
    public final DEF A04;
    public final DmR A05;
    public final C5580Dky A06;
    public final Supplier<Long> A07;
    public final AtomicBoolean A08;
    public final AtomicBoolean A09;
    public final AtomicReference<DE4> A0A;
    public final /* synthetic */ C4900DDt A0B;

    public C4902DDv(InterfaceC4913DEg interfaceC4913DEg, InterfaceC4913DEg interfaceC4913DEg2, DE9 de9, C5326DgK c5326DgK, DEF def, DmR dmR, C4900DDt c4900DDt, C5580Dky c5580Dky, Supplier supplier, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicReference atomicReference) {
        this.A0B = c4900DDt;
        this.A05 = dmR;
        this.A07 = supplier;
        this.A02 = de9;
        this.A00 = interfaceC4913DEg;
        this.A01 = interfaceC4913DEg2;
        this.A04 = def;
        this.A06 = c5580Dky;
        this.A08 = atomicBoolean;
        this.A09 = atomicBoolean2;
        this.A03 = c5326DgK;
        this.A0A = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.CXN
    public final C1J createDataSource() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        CXO cxo;
        InterfaceC4913DEg interfaceC4913DEg = this.A00;
        boolean z5 = interfaceC4913DEg instanceof DXI;
        C5580Dky c5580Dky = this.A06;
        String str = c5580Dky != null ? c5580Dky.A0K : null;
        DmR dmR = this.A05;
        C4904DDx c4904DDx = dmR.A03;
        C3159C0h c3159C0h = new C3159C0h(dmR.A02, c4904DDx.A09, c4904DDx.A0Q, c4904DDx.A0F, c4904DDx.A0G, str, c4904DDx.A0Y);
        Supplier<Long> supplier = this.A07;
        String str2 = dmR.A08;
        C4900DDt c4900DDt = this.A0B;
        ServiceEventCallbackImpl serviceEventCallbackImpl = c4900DDt.A04;
        AtomicBoolean atomicBoolean = this.A08;
        AtomicBoolean atomicBoolean2 = this.A09;
        String factoryName = DDU.defaultFactory.getFactoryName();
        AtomicBoolean atomicBooleanA12 = BV4.A12(false);
        InterfaceC4913DEg interfaceC4913DEg2 = this.A01;
        DEF def = this.A04;
        C4904DDx c4904DDx2 = dmR.A03;
        boolean z6 = c4904DDx2.A0a;
        boolean z7 = c4904DDx2.A0b;
        if (c5580Dky != null) {
            z = c5580Dky.A0T;
            z2 = c5580Dky.A0W;
            z3 = c5580Dky.A0X;
            z4 = c5580Dky.A0S;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        HeroPlayerSetting heroPlayerSetting = c4900DDt.A05;
        boolean z8 = heroPlayerSetting.shouldLogInbandTelemetryBweDebugString;
        boolean z9 = heroPlayerSetting.enableVrlQplLoggingEvents;
        boolean z10 = heroPlayerSetting.enableNetworkRequestIdentityTags;
        boolean z11 = heroPlayerSetting.enableNetworkRequestIdentityTagsPrefetch;
        InterfaceC6113Dvs interfaceC6113Dvs = c4900DDt.A06;
        String str3 = (c5580Dky == null || C5580Dky.A00(c5580Dky) <= 0) ? null : C5580Dky.A04(c5580Dky).A03.A0W;
        int i = heroPlayerSetting.forceOneSemanticsWaveHandling;
        String str4 = dmR.A09;
        DEY dey = c4900DDt.A02;
        C7384Etj.A0Y(atomicBoolean, 7);
        AnonymousClass002.A1F(atomicBoolean2, 8, factoryName);
        C7384Etj.A0Y(dey, 29);
        DEW dew = new DEW(interfaceC4913DEg, interfaceC4913DEg2, serviceEventCallbackImpl, def, dey, c3159C0h, interfaceC6113Dvs, supplier, str2, "", factoryName, str3, str4, atomicBoolean, atomicBoolean2, atomicBooleanA12, new EZ8(C7426Evi.A00, 2), i, false, z6, z7, z, z2, z3, z4, z8, z9, z10, z11, false);
        dew.A10 = heroPlayerSetting.showDebugStats;
        if (z5 || this.A03 != null) {
            DDg dDg = new DDg(heroPlayerSetting.enableTransferListenerCallbackPerfFix);
            cxo = dDg.A01;
            ArrayList arrayListA0u = BV5.A0u(dew);
            if (z5 && interfaceC4913DEg != null) {
                arrayListA0u.add(((DXI) interfaceC4913DEg).A01);
                if (interfaceC4913DEg2 != null) {
                    arrayListA0u.add(((DQo) interfaceC4913DEg2).A07);
                }
            }
            C5326DgK c5326DgK = this.A03;
            if (c5326DgK != null) {
                arrayListA0u.add(c5326DgK);
            }
            dDg.A01(arrayListA0u);
            dew = dDg;
        } else {
            cxo = null;
        }
        DEV dev = DE0.A0G;
        C4904DDx c4904DDx3 = dmR.A03;
        C3159C0h c3159C0h2 = new C3159C0h(dmR.A02, c4904DDx3.A09, c4904DDx3.A0Q, c4904DDx3.A0F, c4904DDx3.A0G, str, c4904DDx3.A0Y);
        String str5 = heroPlayerSetting.userAgent;
        return new C4899DDs(new DE0(this.A02, DDU.defaultFactory, dew, cxo, c3159C0h2, str5, this.A0A, heroPlayerSetting.predictiveDashReadTimeoutMs, heroPlayerSetting.liveDashChunkMaxBufferSizeBytes, heroPlayerSetting.gen.skip_transfer_end_for_unopened_memory_source, heroPlayerSetting.regularFetchForAdvertisedLiveSegments && (def == DEF.LIVE_VIDEO || def == DEF.LIVE_AUDIO)), null, false);
    }
}
