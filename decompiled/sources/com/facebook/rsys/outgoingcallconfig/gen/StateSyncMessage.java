package com.facebook.rsys.outgoingcallconfig.gen;

import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class StateSyncMessage {
    public static G50<StateSyncMessage> CONVERTER = C8922Fte.A00(10);
    public static long sMcfTypeId;
    public final byte[] data;
    public final String topic;

    public static native StateSyncMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StateSyncMessage) {
                StateSyncMessage stateSyncMessage = (StateSyncMessage) obj;
                if (!this.topic.equals(stateSyncMessage.topic) || !Arrays.equals(this.data, stateSyncMessage.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A0B(this.topic) + Arrays.hashCode(this.data);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("StateSyncMessage{topic=");
        sbA0x.append(this.topic);
        sbA0x.append(",data=");
        return BV8.A0v(this.data, sbA0x);
    }

    public StateSyncMessage(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.topic = str;
        this.data = bArr;
    }
}
