package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AST implements AXN {
    public C1DO A00 = AEl.A00;
    public ASR A01;
    public C16Z A02;
    public Function0<? extends ASQ> A03;

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / AEm();
    }

    public final ASR A00(G0U<? super AT3, Unit> g0u) {
        BUX buxA00 = BUX.A00((Object) g0u, 15);
        ASR asr = new ASR();
        asr.A00 = buxA00;
        this.A01 = asr;
        return asr;
    }

    public final ASR A01(G0U<? super C16Z, Unit> g0u) {
        ASR asr = new ASR();
        asr.A00 = g0u;
        this.A01 = asr;
        return asr;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A00.getDensity().AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A00.getDensity().AFo();
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }
}
