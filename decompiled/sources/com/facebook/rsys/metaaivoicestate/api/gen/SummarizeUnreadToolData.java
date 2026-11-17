package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class SummarizeUnreadToolData {
    public static G50<SummarizeUnreadToolData> CONVERTER = C8921Ftd.A00(14);
    public static long sMcfTypeId;
    public final ArrayList<UnreadMessage> messages;
    public final String requestId;
    public final String turnId;

    public static native SummarizeUnreadToolData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SummarizeUnreadToolData) {
                SummarizeUnreadToolData summarizeUnreadToolData = (SummarizeUnreadToolData) obj;
                String str = this.turnId;
                String str2 = summarizeUnreadToolData.turnId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.requestId;
                    String str4 = summarizeUnreadToolData.requestId;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    if (this.messages.equals(summarizeUnreadToolData.messages)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.messages, (AbstractC7608F5v.A02(AnonymousClass006.A0G(this.turnId)) + AnonymousClass005.A0H(this.requestId)) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("SummarizeUnreadToolData{turnId=");
        sbA0x.append(this.turnId);
        sbA0x.append(",requestId=");
        sbA0x.append(this.requestId);
        sbA0x.append(",messages=");
        return BV8.A0v(this.messages, sbA0x);
    }

    public SummarizeUnreadToolData(String str, String str2, ArrayList<UnreadMessage> arrayList) {
        arrayList.getClass();
        this.turnId = str;
        this.requestId = str2;
        this.messages = arrayList;
    }
}
