package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.GRg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9600GRg extends C7438Evz implements G0U<CallModel, Boolean> {
    public static final C9600GRg A00 = new C9600GRg();

    public C9600GRg() {
        super(1, GSN.class, "isBotAudioEnabled", "isBotAudioEnabled(Lcom/facebook/rsys/call/gen/CallModel;)Ljava/lang/Boolean;", 1);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Boolean invoke(CallModel callModel) {
        CallParticipant next;
        AudioStream next2;
        CallModel callModel2 = callModel;
        C7384Etj.A0Y(callModel2, 0);
        ArrayList<CallParticipant> arrayList = callModel2.remoteParticipants;
        if (arrayList == null) {
            return true;
        }
        Iterator<CallParticipant> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (HatchPriceImpressionEventDataKt.NO_DISCOUNT.equals(next.userId)) {
                break;
            }
        }
        CallParticipant callParticipant = next;
        if (callParticipant == null) {
            return true;
        }
        ArrayList<AudioStream> arrayList2 = callParticipant.mediaState.audioStreams;
        C7384Etj.A0T(arrayList2);
        Iterator<AudioStream> it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (next2.type == 9) {
                break;
            }
        }
        AudioStream audioStream = next2;
        if (audioStream != null) {
            return Boolean.valueOf(audioStream.streamStateDesired == 3);
        }
        return null;
    }
}
