package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ClientInstruction {
    public static G50<ClientInstruction> CONVERTER = C8921Ftd.A00(18);
    public static long sMcfTypeId;
    public final int instructionType;
    public final String requestId;
    public final String turnId;

    public static native ClientInstruction createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientInstruction) {
                ClientInstruction clientInstruction = (ClientInstruction) obj;
                String str = this.turnId;
                String str2 = clientInstruction.turnId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.requestId;
                    String str4 = clientInstruction.requestId;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    if (this.instructionType == clientInstruction.instructionType) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.turnId)) + AnonymousClass005.A0H(this.requestId)) * 31) + this.instructionType;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("ClientInstruction{turnId=");
        sbA0x.append(this.turnId);
        sbA0x.append(",requestId=");
        sbA0x.append(this.requestId);
        sbA0x.append(",instructionType=");
        return BV8.A0z(sbA0x, this.instructionType);
    }

    public ClientInstruction(String str, String str2, int i) {
        this.turnId = str;
        this.requestId = str2;
        this.instructionType = i;
    }
}
