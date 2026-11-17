package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class SendMessageCommandData {
    public static G50<SendMessageCommandData> CONVERTER = C8922Fte.A00(0);
    public static long sMcfTypeId;
    public final String message;
    public final String receiverName;
    public final Boolean userConfirmationGranted;

    public static native SendMessageCommandData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SendMessageCommandData) {
                SendMessageCommandData sendMessageCommandData = (SendMessageCommandData) obj;
                String str = this.receiverName;
                String str2 = sendMessageCommandData.receiverName;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.message;
                    String str4 = sendMessageCommandData.message;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    Boolean bool = this.userConfirmationGranted;
                    Boolean bool2 = sendMessageCommandData.userConfirmationGranted;
                    if (bool == null) {
                        if (bool2 != null) {
                            return false;
                        }
                    } else if (bool.equals(bool2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.receiverName)) + AnonymousClass006.A0G(this.message)) * 31) + C3cH.A02(this.userConfirmationGranted);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("SendMessageCommandData{receiverName=");
        sbA0x.append(this.receiverName);
        sbA0x.append(",message=");
        sbA0x.append(this.message);
        sbA0x.append(",userConfirmationGranted=");
        return BV8.A0v(this.userConfirmationGranted, sbA0x);
    }

    public SendMessageCommandData(String str, String str2, Boolean bool) {
        this.receiverName = str;
        this.message = str2;
        this.userConfirmationGranted = bool;
    }
}
