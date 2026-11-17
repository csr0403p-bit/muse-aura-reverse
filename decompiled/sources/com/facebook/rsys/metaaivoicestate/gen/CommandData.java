package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CommandData {
    public static G50<CommandData> CONVERTER = C8921Ftd.A00(19);
    public static long sMcfTypeId;
    public final SendMessageCommandData sendMessageCommandData;
    public final ShapeOfFeedCommandData shapeOfFeedCommandData;
    public final ThreadSummaryCommandData threadSummaryCommandData;

    public static native CommandData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommandData) {
                CommandData commandData = (CommandData) obj;
                ShapeOfFeedCommandData shapeOfFeedCommandData = this.shapeOfFeedCommandData;
                ShapeOfFeedCommandData shapeOfFeedCommandData2 = commandData.shapeOfFeedCommandData;
                if (shapeOfFeedCommandData != null ? shapeOfFeedCommandData.equals(shapeOfFeedCommandData2) : shapeOfFeedCommandData2 == null) {
                    ThreadSummaryCommandData threadSummaryCommandData = this.threadSummaryCommandData;
                    ThreadSummaryCommandData threadSummaryCommandData2 = commandData.threadSummaryCommandData;
                    if (threadSummaryCommandData == null) {
                        if (threadSummaryCommandData2 != null) {
                            return false;
                        }
                    } else if (threadSummaryCommandData.equals(threadSummaryCommandData2)) {
                    }
                    SendMessageCommandData sendMessageCommandData = this.sendMessageCommandData;
                    SendMessageCommandData sendMessageCommandData2 = commandData.sendMessageCommandData;
                    if (sendMessageCommandData == null) {
                        if (sendMessageCommandData2 != null) {
                            return false;
                        }
                    } else if (sendMessageCommandData.equals(sendMessageCommandData2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0D(this.shapeOfFeedCommandData)) + AnonymousClass006.A0D(this.threadSummaryCommandData)) * 31) + C3cH.A02(this.sendMessageCommandData);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CommandData{shapeOfFeedCommandData=");
        sbA0x.append(this.shapeOfFeedCommandData);
        sbA0x.append(",threadSummaryCommandData=");
        sbA0x.append(this.threadSummaryCommandData);
        sbA0x.append(",sendMessageCommandData=");
        return BV8.A0v(this.sendMessageCommandData, sbA0x);
    }

    public CommandData(ShapeOfFeedCommandData shapeOfFeedCommandData, ThreadSummaryCommandData threadSummaryCommandData, SendMessageCommandData sendMessageCommandData) {
        this.shapeOfFeedCommandData = shapeOfFeedCommandData;
        this.threadSummaryCommandData = threadSummaryCommandData;
        this.sendMessageCommandData = sendMessageCommandData;
    }
}
