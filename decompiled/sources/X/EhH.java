package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper;

/* loaded from: classes5.dex */
public final class EhH implements InterfaceC6133Dwb {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public EhH(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    @Override // X.InterfaceC6133Dwb
    public final void APy(String str) {
        ServiceEventCallbackImpl serviceEventCallbackImpl;
        String str2;
        if (3 - this.$t != 0) {
            str2 = ((DmR) this.A01).A03.A0Q;
            if (str2 == null) {
                return;
            } else {
                serviceEventCallbackImpl = ((HeroExoPlayer2InitHelper) this.A00).A0F;
            }
        } else {
            serviceEventCallbackImpl = ((C5593DlT) this.A00).A0S;
            str2 = ((DmR) this.A01).A03.A0Q;
            if (str2 == null) {
                return;
            }
        }
        BYP.A00(serviceEventCallbackImpl, str2, "MEDIA_CODEC_RENDERER_UPGRADE", "MEDIA_CODEC_RENDERER_SUPPORT_FORMAT_CHANGE", str);
    }
}
