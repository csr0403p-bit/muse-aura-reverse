package X;

import com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FZW extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZW() {
        super(1);
        this.$t = 0;
        this.A00 = -1;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.$t != 0) {
            GR9 gr9 = (GR9) obj;
            C7384Etj.A0Y(gr9, 0);
            MetaAiVoiceStateApi metaAiVoiceStateApi = (MetaAiVoiceStateApi) gr9.ACQ(MetaAiVoiceStateApi.CONVERTER);
            if (metaAiVoiceStateApi != null) {
                metaAiVoiceStateApi.sendEvent(this.A00);
            }
        } else {
            C7899FJt c7899FJt = (C7899FJt) obj;
            C7384Etj.A0Y(c7899FJt, 0);
            c7899FJt.A01(new C8633Fhk(0), new Object[0]);
            int i = this.A00;
            c7899FJt.A01(new C7904FJz(i), new Object[]{new HzI(i)});
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZW(int i) {
        super(1);
        this.$t = 1;
        this.A00 = i;
    }
}
