package com.facebook.rsys.ai.gen;

import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class SelectedEmbodimentParams {
    public static G50<SelectedEmbodimentParams> CONVERTER = C8923Ftf.A00(13);
    public static long sMcfTypeId;
    public final String selectedEmbodimentSettingsID;

    public class Builder {
        public String selectedEmbodimentSettingsID;

        public SelectedEmbodimentParams build() {
            return new SelectedEmbodimentParams(this);
        }
    }

    public static native SelectedEmbodimentParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectedEmbodimentParams) {
            return this.selectedEmbodimentSettingsID.equals(((SelectedEmbodimentParams) obj).selectedEmbodimentSettingsID);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.selectedEmbodimentSettingsID.hashCode();
    }

    public String toString() {
        return FGI.A0U("SelectedEmbodimentParams{selectedEmbodimentSettingsID=", this.selectedEmbodimentSettingsID, "}");
    }

    public SelectedEmbodimentParams(Builder builder) {
        builder.selectedEmbodimentSettingsID.getClass();
        this.selectedEmbodimentSettingsID = builder.selectedEmbodimentSettingsID;
    }
}
