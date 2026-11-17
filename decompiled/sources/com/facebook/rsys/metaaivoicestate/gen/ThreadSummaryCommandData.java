package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ThreadSummaryCommandData {
    public static G50<ThreadSummaryCommandData> CONVERTER = C8922Fte.A00(3);
    public static long sMcfTypeId;
    public final Integer maxMessagesToSummarize;

    public static native ThreadSummaryCommandData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThreadSummaryCommandData) {
                Integer num = this.maxMessagesToSummarize;
                Integer num2 = ((ThreadSummaryCommandData) obj).maxMessagesToSummarize;
                if (num != null ? !num.equals(num2) : num2 != null) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass006.A0D(this.maxMessagesToSummarize);
    }

    public String toString() {
        return BV8.A0v(this.maxMessagesToSummarize, C60O.A0x("ThreadSummaryCommandData{maxMessagesToSummarize="));
    }

    public ThreadSummaryCommandData(Integer num) {
        this.maxMessagesToSummarize = num;
    }
}
