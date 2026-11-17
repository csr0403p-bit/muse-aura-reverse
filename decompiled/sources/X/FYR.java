package X;

import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.rsys.metaaivoicestate.api.gen.ChatHistory;
import com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FYR extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FYR(String str, Object obj, int i) {
        super(1);
        this.$t = i;
        this.A00 = obj;
        this.A01 = str;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        switch (this.$t) {
            case 0:
                G0V g0v = (G0V) obj;
                C7384Etj.A0Y(g0v, 0);
                ((IapSessionContextController) this.A00).A01.A00().ACo(new GPG(g0v), this.A01);
                break;
            case 1:
                GR9 gr9 = (GR9) obj;
                C7384Etj.A0Y(gr9, 0);
                MetaAiVoiceStateApi metaAiVoiceStateApi = (MetaAiVoiceStateApi) gr9.ACQ(MetaAiVoiceStateApi.CONVERTER);
                if (metaAiVoiceStateApi != null) {
                    metaAiVoiceStateApi.sendMessage(this.A01, (ChatHistory) this.A00);
                    break;
                }
                break;
            default:
                C7384Etj.A0Y(obj, 0);
                FBN fbn = (FBN) this.A00;
                Object obj2 = fbn.A06;
                String str = this.A01;
                synchronized (obj2) {
                    Iterator<C7719FBv> it = fbn.A09.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        C7719FBv next = it.next();
                        if (C7384Etj.areEqual(next, obj)) {
                            it.remove();
                        } else if (next.A00.equals(str)) {
                            i++;
                        }
                    }
                    z = i == 0;
                }
                if (z) {
                    fbn.A0A.execute(new RunnableC7703FBb(fbn, str));
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
