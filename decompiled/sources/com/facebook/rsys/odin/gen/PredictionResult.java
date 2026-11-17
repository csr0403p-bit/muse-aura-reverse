package com.facebook.rsys.odin.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class PredictionResult {
    public static G50<PredictionResult> CONVERTER = C8922Fte.A00(8);
    public static long sMcfTypeId;
    public final String errorMessage;
    public final boolean success;
    public final float value;
    public final ArrayList<Float> values;

    public static native PredictionResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PredictionResult) {
                PredictionResult predictionResult = (PredictionResult) obj;
                if (this.success != predictionResult.success || this.value != predictionResult.value || !this.values.equals(predictionResult.values) || !this.errorMessage.equals(predictionResult.errorMessage)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.errorMessage, AnonymousClass005.A0F(this.values, AnonymousClass005.A02((527 + (this.success ? 1 : 0)) * 31, this.value)));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("PredictionResult{success=");
        sbA0x.append(this.success);
        sbA0x.append(",value=");
        sbA0x.append(this.value);
        sbA0x.append(",values=");
        sbA0x.append(this.values);
        sbA0x.append(",errorMessage=");
        return AbstractC7610F5x.A0w(this.errorMessage, sbA0x);
    }

    public PredictionResult(boolean z, float f, ArrayList<Float> arrayList, String str) {
        arrayList.getClass();
        str.getClass();
        this.success = z;
        this.value = f;
        this.values = arrayList;
        this.errorMessage = str;
    }
}
