package com.facebook.rsys.stream.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes6.dex */
public class StreamModel {
    public static G50<StreamModel> CONVERTER = C8922Fte.A00(24);
    public static long sMcfTypeId;
    public final HashSet<Integer> allowedCustomVideoContentTypes;
    public final ArrayList<LocalVideoStream> localVideoStreams;

    public static native StreamModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StreamModel) {
                StreamModel streamModel = (StreamModel) obj;
                if (!this.allowedCustomVideoContentTypes.equals(streamModel.allowedCustomVideoContentTypes) || !this.localVideoStreams.equals(streamModel.localVideoStreams)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.localVideoStreams, BV8.A09(this.allowedCustomVideoContentTypes));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("StreamModel{allowedCustomVideoContentTypes=");
        sbA0x.append(this.allowedCustomVideoContentTypes);
        sbA0x.append(",localVideoStreams=");
        return BV8.A0v(this.localVideoStreams, sbA0x);
    }

    public StreamModel(HashSet<Integer> hashSet, ArrayList<LocalVideoStream> arrayList) {
        hashSet.getClass();
        arrayList.getClass();
        this.allowedCustomVideoContentTypes = hashSet;
        this.localVideoStreams = arrayList;
    }
}
