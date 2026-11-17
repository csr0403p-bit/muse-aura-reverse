package com.facebook.rsys.callintent.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallIntentCreationResult {
    public static G50<CallIntentCreationResult> CONVERTER = C8926Fti.A00(23);
    public static long sMcfTypeId;
    public final CallIntent callIntent;
    public final String collidedLocalCallId;
    public final int statusCode;

    public static native CallIntentCreationResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallIntentCreationResult) {
                CallIntentCreationResult callIntentCreationResult = (CallIntentCreationResult) obj;
                CallIntent callIntent = this.callIntent;
                CallIntent callIntent2 = callIntentCreationResult.callIntent;
                if (callIntent != null ? callIntent.equals(callIntent2) : callIntent2 == null) {
                    if (this.statusCode == callIntentCreationResult.statusCode) {
                        String str = this.collidedLocalCallId;
                        String str2 = callIntentCreationResult.collidedLocalCallId;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0D(this.callIntent)) + this.statusCode) * 31) + AnonymousClass005.A0H(this.collidedLocalCallId);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallIntentCreationResult{callIntent=");
        sbA0x.append(this.callIntent);
        sbA0x.append(",statusCode=");
        sbA0x.append(this.statusCode);
        sbA0x.append(",collidedLocalCallId=");
        return AbstractC7610F5x.A0w(this.collidedLocalCallId, sbA0x);
    }

    public CallIntentCreationResult(CallIntent callIntent, int i, String str) {
        this.callIntent = callIntent;
        this.statusCode = i;
        this.collidedLocalCallId = str;
    }
}
