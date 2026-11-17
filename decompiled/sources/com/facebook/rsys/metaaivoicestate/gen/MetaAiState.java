package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiState {
    public static G50<MetaAiState> CONVERTER = C8921Ftd.A00(37);
    public static long sMcfTypeId;
    public final MetaAiBotContent botContent;
    public final int state;
    public final MetaAiUserContent userContent;

    public static native MetaAiState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiState) {
                MetaAiState metaAiState = (MetaAiState) obj;
                if (this.state == metaAiState.state) {
                    MetaAiBotContent metaAiBotContent = this.botContent;
                    MetaAiBotContent metaAiBotContent2 = metaAiState.botContent;
                    if (metaAiBotContent != null ? metaAiBotContent.equals(metaAiBotContent2) : metaAiBotContent2 == null) {
                        MetaAiUserContent metaAiUserContent = this.userContent;
                        MetaAiUserContent metaAiUserContent2 = metaAiState.userContent;
                        if (metaAiUserContent == null) {
                            if (metaAiUserContent2 != null) {
                                return false;
                            }
                        } else if (metaAiUserContent.equals(metaAiUserContent2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.state) * 31) + AnonymousClass006.A0D(this.botContent)) * 31) + C3cH.A02(this.userContent);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiState{state=");
        sbA0x.append(this.state);
        sbA0x.append(",botContent=");
        sbA0x.append(this.botContent);
        sbA0x.append(",userContent=");
        return BV8.A0v(this.userContent, sbA0x);
    }

    public MetaAiState(int i, MetaAiBotContent metaAiBotContent, MetaAiUserContent metaAiUserContent) {
        this.state = i;
        this.botContent = metaAiBotContent;
        this.userContent = metaAiUserContent;
    }
}
