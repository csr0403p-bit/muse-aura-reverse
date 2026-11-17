package com.facebook.rsys.roomtypecalling.gen;

import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallingTags {
    public static G50<CallingTags> CONVERTER = C8922Fte.A00(16);
    public static long sMcfTypeId;

    public static native CallingTags createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public String toString() {
        return "CallingTags{}";
    }
}
