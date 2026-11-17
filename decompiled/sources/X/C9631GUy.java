package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callintent.gen.CallIntentFactoryListener;
import com.facebook.rsys.sdk.RsysSdkImpl;

/* renamed from: X.GUy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9631GUy extends CallIntentFactoryListener {
    public final /* synthetic */ RsysSdkImpl A00;

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public final void onCallIntentDismissed(CallIntent callIntent) {
        C7384Etj.A0Y(callIntent, 0);
        RsysSdkImpl rsysSdkImpl = this.A00;
        rsysSdkImpl.A04.execute(new C9630GUx(callIntent, rsysSdkImpl), 0L);
    }

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public final void onIncomingCallIntent(CallIntent callIntent) {
        C7384Etj.A0Y(callIntent, 0);
        RsysSdkImpl rsysSdkImpl = this.A00;
        rsysSdkImpl.A04.execute(new C9629GUw(callIntent, rsysSdkImpl), 0L);
    }

    public C9631GUy(RsysSdkImpl rsysSdkImpl) {
        this.A00 = rsysSdkImpl;
    }

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public final void onIncomingCollision(CallIntent callIntent) {
    }

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public final void onMessageError(int i, McfReference mcfReference, String str) {
    }
}
