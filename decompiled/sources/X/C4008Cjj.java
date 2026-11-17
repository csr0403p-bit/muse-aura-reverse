package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.IOException;

/* renamed from: X.Cjj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4008Cjj implements InterfaceC4013Cjt {
    public final InterfaceC3367CHl A00;
    public final InterfaceC4009Cjn A01;
    public final InterfaceC4071ClJ A02;
    public final SamplingPolicyConfig A03;

    @Override // X.InterfaceC4013Cjt
    public final void onFailure(IOException iOException) {
        InterfaceC3367CHl interfaceC3367CHl = this.A00;
        if (interfaceC3367CHl.ANC()) {
            interfaceC3367CHl.unlock();
        }
        this.A01.onFailure(iOException);
    }

    public C4008Cjj(InterfaceC3367CHl interfaceC3367CHl, InterfaceC4009Cjn interfaceC4009Cjn, InterfaceC4071ClJ interfaceC4071ClJ, SamplingPolicyConfig samplingPolicyConfig) {
        this.A00 = interfaceC3367CHl;
        this.A03 = samplingPolicyConfig;
        this.A02 = interfaceC4071ClJ;
        this.A01 = interfaceC4009Cjn;
    }
}
