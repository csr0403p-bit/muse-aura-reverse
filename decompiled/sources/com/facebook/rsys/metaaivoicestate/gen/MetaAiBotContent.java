package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiBotContent {
    public static G50<MetaAiBotContent> CONVERTER = C8921Ftd.A00(32);
    public static long sMcfTypeId;
    public final GenAiBizAgentViewModel bizAgentViewModel;
    public final String botResponseId;
    public final String botSpeakerId;
    public final MetaAiCaption caption;
    public final Boolean isProactive;
    public final String llmResponseContents;
    public final String otid;
    public final GenAiTextPromptViewModel textPrompts;

    public static native MetaAiBotContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiBotContent) {
                MetaAiBotContent metaAiBotContent = (MetaAiBotContent) obj;
                MetaAiCaption metaAiCaption = this.caption;
                MetaAiCaption metaAiCaption2 = metaAiBotContent.caption;
                if (metaAiCaption != null ? metaAiCaption.equals(metaAiCaption2) : metaAiCaption2 == null) {
                    String str = this.llmResponseContents;
                    String str2 = metaAiBotContent.llmResponseContents;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (str.equals(str2)) {
                    }
                    String str3 = this.otid;
                    String str4 = metaAiBotContent.otid;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    Boolean bool = this.isProactive;
                    Boolean bool2 = metaAiBotContent.isProactive;
                    if (bool == null) {
                        if (bool2 != null) {
                            return false;
                        }
                    } else if (bool.equals(bool2)) {
                    }
                    GenAiTextPromptViewModel genAiTextPromptViewModel = this.textPrompts;
                    GenAiTextPromptViewModel genAiTextPromptViewModel2 = metaAiBotContent.textPrompts;
                    if (genAiTextPromptViewModel == null) {
                        if (genAiTextPromptViewModel2 != null) {
                            return false;
                        }
                    } else if (genAiTextPromptViewModel.equals(genAiTextPromptViewModel2)) {
                    }
                    String str5 = this.botResponseId;
                    String str6 = metaAiBotContent.botResponseId;
                    if (str5 == null) {
                        if (str6 != null) {
                            return false;
                        }
                    } else if (str5.equals(str6)) {
                    }
                    GenAiBizAgentViewModel genAiBizAgentViewModel = this.bizAgentViewModel;
                    GenAiBizAgentViewModel genAiBizAgentViewModel2 = metaAiBotContent.bizAgentViewModel;
                    if (genAiBizAgentViewModel == null) {
                        if (genAiBizAgentViewModel2 != null) {
                            return false;
                        }
                    } else if (genAiBizAgentViewModel.equals(genAiBizAgentViewModel2)) {
                    }
                    String str7 = this.botSpeakerId;
                    String str8 = metaAiBotContent.botSpeakerId;
                    if (str7 == null) {
                        if (str8 != null) {
                            return false;
                        }
                    } else if (str7.equals(str8)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AbstractC7608F5v.A02(AnonymousClass006.A0D(this.caption)) + AnonymousClass006.A0G(this.llmResponseContents)) * 31) + AnonymousClass006.A0G(this.otid)) * 31) + AnonymousClass006.A0D(this.isProactive)) * 31) + AnonymousClass006.A0D(this.textPrompts)) * 31) + AnonymousClass006.A0G(this.botResponseId)) * 31) + AnonymousClass006.A0D(this.bizAgentViewModel)) * 31) + AnonymousClass005.A0H(this.botSpeakerId);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiBotContent{caption=");
        sbA0x.append(this.caption);
        sbA0x.append(",llmResponseContents=");
        sbA0x.append(this.llmResponseContents);
        sbA0x.append(",otid=");
        sbA0x.append(this.otid);
        sbA0x.append(",isProactive=");
        sbA0x.append(this.isProactive);
        sbA0x.append(",textPrompts=");
        sbA0x.append(this.textPrompts);
        sbA0x.append(",botResponseId=");
        sbA0x.append(this.botResponseId);
        sbA0x.append(",bizAgentViewModel=");
        sbA0x.append(this.bizAgentViewModel);
        sbA0x.append(",botSpeakerId=");
        return AbstractC7610F5x.A0w(this.botSpeakerId, sbA0x);
    }

    public MetaAiBotContent(MetaAiCaption metaAiCaption, String str, String str2, Boolean bool, GenAiTextPromptViewModel genAiTextPromptViewModel, String str3, GenAiBizAgentViewModel genAiBizAgentViewModel, String str4) {
        this.caption = metaAiCaption;
        this.llmResponseContents = str;
        this.otid = str2;
        this.isProactive = bool;
        this.textPrompts = genAiTextPromptViewModel;
        this.botResponseId = str3;
        this.bizAgentViewModel = genAiBizAgentViewModel;
        this.botSpeakerId = str4;
    }
}
