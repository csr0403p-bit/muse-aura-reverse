package com.facebook.rsys.call.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.video.gen.VideoStream;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class ParticipantMediaState {
    public static G50<ParticipantMediaState> CONVERTER = C8926Fti.A00(15);
    public static long sMcfTypeId;
    public final ArrayList<AudioStream> audioStreams;
    public final ArrayList<VideoStream> videoStreams;

    public static native ParticipantMediaState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParticipantMediaState) {
                ParticipantMediaState participantMediaState = (ParticipantMediaState) obj;
                if (!this.videoStreams.equals(participantMediaState.videoStreams) || !this.audioStreams.equals(participantMediaState.audioStreams)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.audioStreams, BV8.A09(this.videoStreams));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("ParticipantMediaState{videoStreams=");
        sbA0x.append(this.videoStreams);
        sbA0x.append(",audioStreams=");
        return BV8.A0v(this.audioStreams, sbA0x);
    }

    public ParticipantMediaState(ArrayList<VideoStream> arrayList, ArrayList<AudioStream> arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.videoStreams = arrayList;
        this.audioStreams = arrayList2;
    }
}
