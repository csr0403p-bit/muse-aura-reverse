package X;

import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.GRh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9601GRh extends C7438Evz implements G0U<CallModel, Boolean> {
    public static final C9601GRh A00 = new C9601GRh();

    public C9601GRh() {
        super(1, GSN.class, "isSelfAudioOn", "isSelfAudioOn(Lcom/facebook/rsys/call/gen/CallModel;)Z", 1);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Boolean invoke(CallModel callModel) {
        boolean z;
        CallModel callModel2 = callModel;
        C7384Etj.A0Y(callModel2, 0);
        ParticipantMediaState participantMediaState = callModel2.selfParticipant.mediaState;
        if (participantMediaState == null) {
            z = true;
            break;
        }
        z = false;
        ArrayList<AudioStream> arrayList = participantMediaState.audioStreams;
        C7384Etj.A0T(arrayList);
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<AudioStream> it = arrayList.iterator();
            while (it.hasNext()) {
                int i = it.next().streamState;
                if (i == 3 || i == 2 || i == 0) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
