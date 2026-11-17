package com.facebook.rsys.ai.gen;

import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VideoContext {
    public static G50<VideoContext> CONVERTER = C8923Ftf.A00(14);
    public static long sMcfTypeId;
    public final String videoPrompt;

    public class Builder {
        public String videoPrompt;

        public VideoContext build() {
            return new VideoContext(this);
        }
    }

    public static native VideoContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoContext) {
            return this.videoPrompt.equals(((VideoContext) obj).videoPrompt);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.videoPrompt.hashCode();
    }

    public String toString() {
        return FGI.A0U("VideoContext{videoPrompt=", this.videoPrompt, "}");
    }

    public VideoContext(Builder builder) {
        builder.videoPrompt.getClass();
        this.videoPrompt = builder.videoPrompt;
    }
}
