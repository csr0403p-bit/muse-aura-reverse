package com.facebook.rsys.devxagent.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DevXAgentTextAiContentBlock {
    public static G50<DevXAgentTextAiContentBlock> CONVERTER = C8925Fth.A00(7);
    public static long sMcfTypeId;
    public final int blockType;
    public final String content;
    public final boolean thinkingInProgress;
    public final String thinkingTitle;

    public static native DevXAgentTextAiContentBlock createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevXAgentTextAiContentBlock) {
                DevXAgentTextAiContentBlock devXAgentTextAiContentBlock = (DevXAgentTextAiContentBlock) obj;
                if (this.blockType == devXAgentTextAiContentBlock.blockType && this.content.equals(devXAgentTextAiContentBlock.content)) {
                    String str = this.thinkingTitle;
                    String str2 = devXAgentTextAiContentBlock.thinkingTitle;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.thinkingInProgress == devXAgentTextAiContentBlock.thinkingInProgress) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.content, (527 + this.blockType) * 31) + AnonymousClass006.A0G(this.thinkingTitle)) * 31) + (this.thinkingInProgress ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevXAgentTextAiContentBlock{blockType=");
        sbA0x.append(this.blockType);
        sbA0x.append(",content=");
        sbA0x.append(this.content);
        sbA0x.append(",thinkingTitle=");
        sbA0x.append(this.thinkingTitle);
        sbA0x.append(",thinkingInProgress=");
        return AbstractC7610F5x.A0y(sbA0x, this.thinkingInProgress);
    }

    public DevXAgentTextAiContentBlock(int i, String str, String str2, boolean z) {
        str.getClass();
        this.blockType = i;
        this.content = str;
        this.thinkingTitle = str2;
        this.thinkingInProgress = z;
    }
}
