package com.facebook.rsys.call.datamessage.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class DataMessage {
    public static G50<DataMessage> CONVERTER = C8926Fti.A00(9);
    public static long sMcfTypeId;
    public final byte[] payload;
    public final ArrayList<String> recipients;
    public final String topic;

    public static native DataMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DataMessage) {
                DataMessage dataMessage = (DataMessage) obj;
                if (!this.recipients.equals(dataMessage.recipients) || !this.topic.equals(dataMessage.topic) || !Arrays.equals(this.payload, dataMessage.payload)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.topic, BV8.A09(this.recipients)) + Arrays.hashCode(this.payload);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DataMessage{recipients=");
        sbA0x.append(this.recipients);
        sbA0x.append(",topic=");
        sbA0x.append(this.topic);
        sbA0x.append(",payload=");
        return BV8.A0v(this.payload, sbA0x);
    }

    public DataMessage(ArrayList<String> arrayList, String str, byte[] bArr) {
        AbstractC7609F5w.A1H(arrayList, str, bArr);
        this.recipients = arrayList;
        this.topic = str;
        this.payload = bArr;
    }
}
