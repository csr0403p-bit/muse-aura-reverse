package X;

import com.facebook.analytics2.logger.interfaces.DefaultFFDBProvider;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.util.Iterator;

/* renamed from: X.Cjp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4011Cjp {
    public final Iterator<InterfaceC3367CHl> A00;
    public final InterfaceC4009Cjn A01;
    public final InterfaceC4014Cju A02;
    public final InterfaceC4012Cjq A03;
    public final InterfaceC4071ClJ A04;
    public final SamplingPolicyConfig A05;
    public final Integer A06;

    public final void A00() {
        Iterator<InterfaceC3367CHl> it = this.A00;
        if (!it.hasNext()) {
            throw C3cG.A0Q("No more batches to upload");
        }
        InterfaceC3367CHl next = it.next();
        C4010Cjo c4010Cjo = new C4010Cjo(next, this.A06);
        InterfaceC4012Cjq interfaceC4012Cjq = this.A03;
        SamplingPolicyConfig samplingPolicyConfig = this.A05;
        interfaceC4012Cjq.upload(c4010Cjo, new C4008Cjj(next, this.A01, this.A04, samplingPolicyConfig), this.A02);
    }

    public C4011Cjp(InterfaceC4009Cjn interfaceC4009Cjn, InterfaceC4014Cju interfaceC4014Cju, InterfaceC4012Cjq interfaceC4012Cjq, InterfaceC4071ClJ interfaceC4071ClJ, SamplingPolicyConfig samplingPolicyConfig, Integer num, Iterator it) {
        this.A03 = interfaceC4012Cjq;
        this.A06 = num;
        this.A00 = it;
        this.A01 = interfaceC4009Cjn;
        this.A05 = samplingPolicyConfig;
        this.A04 = interfaceC4071ClJ == null ? new DefaultFFDBProvider() : interfaceC4071ClJ;
        this.A02 = interfaceC4014Cju;
        if (it == null) {
            throw C60O.A0i("mBatchPayloadIterator is null");
        }
    }
}
