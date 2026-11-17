package com.facebook.rsys.mediastats.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ScreenShareStats {
    public static G50<ScreenShareStats> CONVERTER = C8921Ftd.A00(1);
    public static long sMcfTypeId;
    public final Integer contentType;

    public static native ScreenShareStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScreenShareStats) {
                Integer num = this.contentType;
                Integer num2 = ((ScreenShareStats) obj).contentType;
                if (num != null ? !num.equals(num2) : num2 != null) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass006.A0D(this.contentType);
    }

    public String toString() {
        return BV8.A0v(this.contentType, C60O.A0x("ScreenShareStats{contentType="));
    }

    public ScreenShareStats(Integer num) {
        this.contentType = num;
    }
}
