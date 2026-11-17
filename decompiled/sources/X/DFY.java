package X;

import android.content.Context;
import com.facebook.aura.analytics.impl.MetaAppInfoProvider;
import com.facebook.aura.analytics.impl.MetaPrivacyContextProvider;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DFY {
    public DG4 A00;
    public DGD A01;
    public CI7 A02;
    public AbstractC4937DFs A03;
    public DGc A04;
    public CI8 A05;
    public InterfaceC4081ClT A06;
    public DFV A07;
    public InterfaceC4083Clb A08;
    public InterfaceC4083Clb A09;
    public MetaAppInfoProvider A0A;
    public MetaPrivacyContextProvider A0B;
    public DGI A0C;
    public InterfaceC4944DGi A0D;
    public Class<? extends SamplingPolicyConfig> A0E;
    public Class<? extends InterfaceC4012Cjq> A0F;
    public Set<String> A0G = Collections.EMPTY_SET;
    public F18<InterfaceC4071ClJ> A0H;
    public final Context A0I;

    public DFY(Context context) {
        if (context == null) {
            throw C60O.A0i(ReplyAttributionSerializer.TYPE_CONTEXT);
        }
        this.A0I = context.getApplicationContext();
    }
}
