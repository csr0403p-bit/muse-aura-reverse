package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.CFf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3336CFf {
    public final C3338CFi A00;
    public final C3335CFe A01;
    public final C3339CFj A02;

    public C3336CFf(Context context, C3339CFj c3339CFj, SamplingPolicyConfig samplingPolicyConfig, String str) {
        this.A02 = c3339CFj;
        this.A01 = new C3335CFe(context, str);
        this.A00 = samplingPolicyConfig != null ? new C3338CFi(samplingPolicyConfig) : null;
    }
}
