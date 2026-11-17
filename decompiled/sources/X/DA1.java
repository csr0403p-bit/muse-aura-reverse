package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper;

/* loaded from: classes5.dex */
public final class DA1 implements InterfaceC5408Di1 {
    public final /* synthetic */ InterfaceC5860Dqu A00;
    public final /* synthetic */ HeroExoPlayer2InitHelper A01;

    public DA1(InterfaceC5860Dqu interfaceC5860Dqu, HeroExoPlayer2InitHelper heroExoPlayer2InitHelper) {
        this.A00 = interfaceC5860Dqu;
        this.A01 = heroExoPlayer2InitHelper;
    }

    @Override // X.InterfaceC5408Di1
    public final void onMetadata(C5402Dhv c5402Dhv) {
        InterfaceC5403Dhw[] interfaceC5403DhwArr = c5402Dhv.A01;
        if (interfaceC5403DhwArr.length > 0) {
            InterfaceC5403Dhw interfaceC5403Dhw = interfaceC5403DhwArr[0];
            if (!(interfaceC5403Dhw instanceof DYO)) {
                ((Dlw) this.A00).A2A.AUB(c5402Dhv);
                return;
            }
            DYO dyo = (DYO) interfaceC5403Dhw;
            ((Dlw) this.A00).A2A.ATq(dyo.A05, dyo.A03, dyo.A02, 0L);
        }
    }
}
