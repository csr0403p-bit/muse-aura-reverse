package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ReadAloudData {
    public static G50<ReadAloudData> CONVERTER = C8921Ftd.A00(12);
    public static long sMcfTypeId;
    public final String conversationId;
    public final String messageId;
    public final Boolean pause;

    public static native ReadAloudData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReadAloudData) {
                ReadAloudData readAloudData = (ReadAloudData) obj;
                String str = this.conversationId;
                String str2 = readAloudData.conversationId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.messageId;
                    String str4 = readAloudData.messageId;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    Boolean bool = this.pause;
                    Boolean bool2 = readAloudData.pause;
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
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.conversationId)) + AnonymousClass006.A0G(this.messageId)) * 31) + C3cH.A02(this.pause);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("ReadAloudData{conversationId=");
        sbA0x.append(this.conversationId);
        sbA0x.append(",messageId=");
        sbA0x.append(this.messageId);
        sbA0x.append(",pause=");
        return BV8.A0v(this.pause, sbA0x);
    }

    public ReadAloudData(String str, String str2, Boolean bool) {
        this.conversationId = str;
        this.messageId = str2;
        this.pause = bool;
    }
}
