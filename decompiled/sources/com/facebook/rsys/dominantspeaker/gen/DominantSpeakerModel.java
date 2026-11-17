package com.facebook.rsys.dominantspeaker.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class DominantSpeakerModel {
    public static G50<DominantSpeakerModel> CONVERTER = C8925Fth.A00(22);
    public static long sMcfTypeId;
    public final String dominantSpeakerUserId;
    public final ArrayList<String> recentDominantSpeakerUserIds;

    public static native DominantSpeakerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DominantSpeakerModel) {
                DominantSpeakerModel dominantSpeakerModel = (DominantSpeakerModel) obj;
                if (!this.dominantSpeakerUserId.equals(dominantSpeakerModel.dominantSpeakerUserId) || !this.recentDominantSpeakerUserIds.equals(dominantSpeakerModel.recentDominantSpeakerUserIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.recentDominantSpeakerUserIds, BV8.A0B(this.dominantSpeakerUserId));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DominantSpeakerModel{dominantSpeakerUserId=");
        sbA0x.append(this.dominantSpeakerUserId);
        sbA0x.append(",recentDominantSpeakerUserIds=");
        return BV8.A0v(this.recentDominantSpeakerUserIds, sbA0x);
    }

    public DominantSpeakerModel(String str, ArrayList<String> arrayList) {
        str.getClass();
        arrayList.getClass();
        this.dominantSpeakerUserId = str;
        this.recentDominantSpeakerUserIds = arrayList;
    }
}
