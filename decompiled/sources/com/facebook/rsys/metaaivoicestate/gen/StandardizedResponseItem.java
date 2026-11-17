package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass001;
import X.C8922Fte;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class StandardizedResponseItem {
    public static G50<StandardizedResponseItem> CONVERTER = C8922Fte.A00(2);
    public static long sMcfTypeId;
    public final String payload;
    public final int type;

    public static native StandardizedResponseItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StandardizedResponseItem) {
                StandardizedResponseItem standardizedResponseItem = (StandardizedResponseItem) obj;
                if (this.type != standardizedResponseItem.type || !this.payload.equals(standardizedResponseItem.payload)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.payload, (527 + this.type) * 31);
    }

    public String toString() {
        return FGI.A09(this.type, "StandardizedResponseItem{type=", ",payload=", this.payload, "}");
    }

    public StandardizedResponseItem(int i, String str) {
        str.getClass();
        this.type = i;
        this.payload = str;
    }
}
