package com.facebook.rsys.ai.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ModelOverrides {
    public static G50<ModelOverrides> CONVERTER = C8923Ftf.A00(10);
    public static long sMcfTypeId;
    public final String historyOverride;
    public final String inferenceApi;
    public final String modelTier;
    public final Boolean safetyLlmEnabled;
    public final String streamingLlmHostOverride;
    public final String streamingLlmPortOverride;
    public final String systemPrompt;
    public final String temperature;
    public final String topK;
    public final String topP;

    public class Builder {
        public String historyOverride;
        public String inferenceApi;
        public String modelTier;
        public Boolean safetyLlmEnabled;
        public String streamingLlmHostOverride;
        public String streamingLlmPortOverride;
        public String systemPrompt;
        public String temperature;
        public String topK;
        public String topP;

        public ModelOverrides build() {
            return new ModelOverrides(this);
        }
    }

    public static native ModelOverrides createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModelOverrides) {
                ModelOverrides modelOverrides = (ModelOverrides) obj;
                String str = this.modelTier;
                String str2 = modelOverrides.modelTier;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.topP;
                    String str4 = modelOverrides.topP;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    String str5 = this.topK;
                    String str6 = modelOverrides.topK;
                    if (str5 == null) {
                        if (str6 != null) {
                            return false;
                        }
                    } else if (str5.equals(str6)) {
                    }
                    String str7 = this.temperature;
                    String str8 = modelOverrides.temperature;
                    if (str7 == null) {
                        if (str8 != null) {
                            return false;
                        }
                    } else if (str7.equals(str8)) {
                    }
                    String str9 = this.inferenceApi;
                    String str10 = modelOverrides.inferenceApi;
                    if (str9 == null) {
                        if (str10 != null) {
                            return false;
                        }
                    } else if (str9.equals(str10)) {
                    }
                    String str11 = this.systemPrompt;
                    String str12 = modelOverrides.systemPrompt;
                    if (str11 == null) {
                        if (str12 != null) {
                            return false;
                        }
                    } else if (str11.equals(str12)) {
                    }
                    Boolean bool = this.safetyLlmEnabled;
                    Boolean bool2 = modelOverrides.safetyLlmEnabled;
                    if (bool == null) {
                        if (bool2 != null) {
                            return false;
                        }
                    } else if (bool.equals(bool2)) {
                    }
                    String str13 = this.streamingLlmHostOverride;
                    String str14 = modelOverrides.streamingLlmHostOverride;
                    if (str13 == null) {
                        if (str14 != null) {
                            return false;
                        }
                    } else if (str13.equals(str14)) {
                    }
                    String str15 = this.streamingLlmPortOverride;
                    String str16 = modelOverrides.streamingLlmPortOverride;
                    if (str15 == null) {
                        if (str16 != null) {
                            return false;
                        }
                    } else if (str15.equals(str16)) {
                    }
                    String str17 = this.historyOverride;
                    String str18 = modelOverrides.historyOverride;
                    if (str17 == null) {
                        if (str18 != null) {
                            return false;
                        }
                    } else if (str17.equals(str18)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.modelTier)) + AnonymousClass006.A0G(this.topP)) * 31) + AnonymousClass006.A0G(this.topK)) * 31) + AnonymousClass006.A0G(this.temperature)) * 31) + AnonymousClass006.A0G(this.inferenceApi)) * 31) + AnonymousClass006.A0G(this.systemPrompt)) * 31) + AnonymousClass006.A0D(this.safetyLlmEnabled)) * 31) + AnonymousClass006.A0G(this.streamingLlmHostOverride)) * 31) + AnonymousClass006.A0G(this.streamingLlmPortOverride)) * 31) + AnonymousClass005.A0H(this.historyOverride);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("ModelOverrides{modelTier=");
        sbA0x.append(this.modelTier);
        sbA0x.append(",topP=");
        sbA0x.append(this.topP);
        sbA0x.append(",topK=");
        sbA0x.append(this.topK);
        sbA0x.append(",temperature=");
        sbA0x.append(this.temperature);
        sbA0x.append(",inferenceApi=");
        sbA0x.append(this.inferenceApi);
        sbA0x.append(",systemPrompt=");
        sbA0x.append(this.systemPrompt);
        sbA0x.append(",safetyLlmEnabled=");
        sbA0x.append(this.safetyLlmEnabled);
        sbA0x.append(",streamingLlmHostOverride=");
        sbA0x.append(this.streamingLlmHostOverride);
        sbA0x.append(",streamingLlmPortOverride=");
        sbA0x.append(this.streamingLlmPortOverride);
        sbA0x.append(",historyOverride=");
        return AbstractC7610F5x.A0w(this.historyOverride, sbA0x);
    }

    public ModelOverrides(Builder builder) {
        this.modelTier = builder.modelTier;
        this.topP = builder.topP;
        this.topK = builder.topK;
        this.temperature = builder.temperature;
        this.inferenceApi = builder.inferenceApi;
        this.systemPrompt = builder.systemPrompt;
        this.safetyLlmEnabled = builder.safetyLlmEnabled;
        this.streamingLlmHostOverride = builder.streamingLlmHostOverride;
        this.streamingLlmPortOverride = builder.streamingLlmPortOverride;
        this.historyOverride = builder.historyOverride;
    }
}
