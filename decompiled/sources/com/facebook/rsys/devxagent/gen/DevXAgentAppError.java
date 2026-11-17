package com.facebook.rsys.devxagent.gen;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DevXAgentAppError {
    public static G50<DevXAgentAppError> CONVERTER = C8925Fth.A00(4);
    public static long sMcfTypeId;
    public final String component;
    public final String correlationId;
    public final String operation;
    public final String reason;
    public final int severity;

    public static native DevXAgentAppError createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevXAgentAppError) {
                DevXAgentAppError devXAgentAppError = (DevXAgentAppError) obj;
                if (this.severity == devXAgentAppError.severity && this.component.equals(devXAgentAppError.component) && this.operation.equals(devXAgentAppError.operation) && this.reason.equals(devXAgentAppError.reason)) {
                    String str = this.correlationId;
                    String str2 = devXAgentAppError.correlationId;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.reason, AnonymousClass005.A0I(this.operation, AnonymousClass005.A0I(this.component, (527 + this.severity) * 31))) + AnonymousClass006.A0G(this.correlationId);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevXAgentAppError{severity=");
        sbA0x.append(this.severity);
        sbA0x.append(",component=");
        sbA0x.append(this.component);
        sbA0x.append(",operation=");
        sbA0x.append(this.operation);
        sbA0x.append(",reason=");
        sbA0x.append(this.reason);
        sbA0x.append(",correlationId=");
        return AbstractC7610F5x.A0w(this.correlationId, sbA0x);
    }

    public DevXAgentAppError(int i, String str, String str2, String str3, String str4) {
        AbstractC7609F5w.A1H(str, str2, str3);
        this.severity = i;
        this.component = str;
        this.operation = str2;
        this.reason = str3;
        this.correlationId = str4;
    }
}
