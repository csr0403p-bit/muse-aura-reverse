package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC05553uI;
import X.AnonymousClass006;
import X.C06827l3;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.EnumC05543uF;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VisualCanvas extends C06G {
    public static final String LINK_ACTION_TYPENAME = "GenAILinkActionPrimitive";
    public static final String NOTIFICATION_ACTION_TYPENAME = "GENAIStreamedPayloadNotificationAction";
    public static final String TAG = "VisualCanvas";
    public static final C06827l3 TIMEOUT_SECONDS_REGEX = new C06827l3("(\\d+)\\s+seconds");

    @SerializedName("avatar_animation")
    public final EnumC05543uF avatarAnimation;

    @SerializedName("background_animation")
    public final String backgroundAnimation;

    @SerializedName("background_img_url")
    public final String backgroundImageUrl;

    @SerializedName("background_video_url")
    public final String backgroundVideoUrl;

    @SerializedName("current_chapter_index")
    public final Integer currentChapterIndex;

    @SerializedName("current_facts")
    public final Map<String, String> currentFacts;

    @SerializedName("reset_all")
    public final Boolean resetAll;
    public final transient AbstractC05553uI toastAction;

    @SerializedName("toast")
    public final MetaAiToastModel toastModel;

    @SerializedName("total_chapters")
    public final Integer totalChapters;

    @SerializedName("trigger")
    public final Trigger trigger;

    @SerializedName("uuid")
    public final String uuid;

    public static /* synthetic */ VisualCanvas copy$default(VisualCanvas visualCanvas, Trigger trigger, String str, String str2, String str3, String str4, EnumC05543uF enumC05543uF, Integer num, Integer num2, Map map, Boolean bool, MetaAiToastModel metaAiToastModel, AbstractC05553uI abstractC05553uI, int i, Object obj) {
        Trigger trigger2 = trigger;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        EnumC05543uF enumC05543uF2 = enumC05543uF;
        Integer num3 = num;
        Integer num4 = num2;
        Map map2 = map;
        Boolean bool2 = bool;
        MetaAiToastModel metaAiToastModel2 = metaAiToastModel;
        AbstractC05553uI abstractC05553uI2 = abstractC05553uI;
        if ((i & 1) != 0) {
            trigger2 = visualCanvas.trigger;
        }
        if ((i & 2) != 0) {
            str5 = visualCanvas.uuid;
        }
        if ((i & 4) != 0) {
            str6 = visualCanvas.backgroundImageUrl;
        }
        if ((i & 8) != 0) {
            str7 = visualCanvas.backgroundVideoUrl;
        }
        if ((i & 16) != 0) {
            str8 = visualCanvas.backgroundAnimation;
        }
        if ((i & 32) != 0) {
            enumC05543uF2 = visualCanvas.avatarAnimation;
        }
        if ((i & 64) != 0) {
            num3 = visualCanvas.currentChapterIndex;
        }
        if ((i & 128) != 0) {
            num4 = visualCanvas.totalChapters;
        }
        if ((i & 256) != 0) {
            map2 = visualCanvas.currentFacts;
        }
        if ((i & 512) != 0) {
            bool2 = visualCanvas.resetAll;
        }
        if ((i & 1024) != 0) {
            metaAiToastModel2 = visualCanvas.toastModel;
        }
        if ((i & 2048) != 0) {
            abstractC05553uI2 = visualCanvas.toastAction;
        }
        return new VisualCanvas(trigger2, str5, str6, str7, str8, enumC05543uF2, num3, num4, map2, bool2, metaAiToastModel2, abstractC05553uI2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualCanvas) {
                VisualCanvas visualCanvas = (VisualCanvas) obj;
                if (!C7384Etj.areEqual(this.trigger, visualCanvas.trigger) || !C7384Etj.areEqual(this.uuid, visualCanvas.uuid) || !C7384Etj.areEqual(this.backgroundImageUrl, visualCanvas.backgroundImageUrl) || !C7384Etj.areEqual(this.backgroundVideoUrl, visualCanvas.backgroundVideoUrl) || !C7384Etj.areEqual(this.backgroundAnimation, visualCanvas.backgroundAnimation) || this.avatarAnimation != visualCanvas.avatarAnimation || !C7384Etj.areEqual(this.currentChapterIndex, visualCanvas.currentChapterIndex) || !C7384Etj.areEqual(this.totalChapters, visualCanvas.totalChapters) || !C7384Etj.areEqual(this.currentFacts, visualCanvas.currentFacts) || !C7384Etj.areEqual(this.resetAll, visualCanvas.resetAll) || !C7384Etj.areEqual(this.toastModel, visualCanvas.toastModel) || !C7384Etj.areEqual(this.toastAction, visualCanvas.toastAction)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Trigger component1() {
        return this.trigger;
    }

    public final Boolean component10() {
        return this.resetAll;
    }

    public final MetaAiToastModel component11() {
        return this.toastModel;
    }

    public final AbstractC05553uI component12() {
        return this.toastAction;
    }

    public final String component2() {
        return this.uuid;
    }

    public final String component3() {
        return this.backgroundImageUrl;
    }

    public final String component4() {
        return this.backgroundVideoUrl;
    }

    public final String component5() {
        return this.backgroundAnimation;
    }

    public final EnumC05543uF component6() {
        return this.avatarAnimation;
    }

    public final Integer component7() {
        return this.currentChapterIndex;
    }

    public final Integer component8() {
        return this.totalChapters;
    }

    public final Map<String, String> component9() {
        return this.currentFacts;
    }

    public final VisualCanvas copy(Trigger trigger, String str, String str2, String str3, String str4, EnumC05543uF enumC05543uF, Integer num, Integer num2, Map<String, String> map, Boolean bool, MetaAiToastModel metaAiToastModel, AbstractC05553uI abstractC05553uI) {
        return new VisualCanvas(trigger, str, str2, str3, str4, enumC05543uF, num, num2, map, bool, metaAiToastModel, abstractC05553uI);
    }

    public final EnumC05543uF getAvatarAnimation() {
        return this.avatarAnimation;
    }

    public final String getBackgroundAnimation() {
        return this.backgroundAnimation;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    public final Integer getCurrentChapterIndex() {
        return this.currentChapterIndex;
    }

    public final Map<String, String> getCurrentFacts() {
        return this.currentFacts;
    }

    public final Boolean getResetAll() {
        return this.resetAll;
    }

    public final AbstractC05553uI getToastAction() {
        return this.toastAction;
    }

    public final MetaAiToastModel getToastModel() {
        return this.toastModel;
    }

    public final Integer getTotalChapters() {
        return this.totalChapters;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((((((((((((((AnonymousClass006.A0D(this.trigger) * 31) + AnonymousClass006.A0G(this.uuid)) * 31) + AnonymousClass006.A0G(this.backgroundImageUrl)) * 31) + AnonymousClass006.A0G(this.backgroundVideoUrl)) * 31) + AnonymousClass006.A0G(this.backgroundAnimation)) * 31) + AnonymousClass006.A0D(this.avatarAnimation)) * 31) + AnonymousClass006.A0D(this.currentChapterIndex)) * 31) + AnonymousClass006.A0D(this.totalChapters)) * 31) + AnonymousClass006.A0D(this.currentFacts)) * 31) + AnonymousClass006.A0D(this.resetAll)) * 31) + AnonymousClass006.A0D(this.toastModel)) * 31) + C3cH.A02(this.toastAction);
    }

    public String toString() {
        Trigger trigger = this.trigger;
        String str = this.uuid;
        String str2 = this.backgroundImageUrl;
        String str3 = this.backgroundVideoUrl;
        String str4 = this.backgroundAnimation;
        EnumC05543uF enumC05543uF = this.avatarAnimation;
        Integer num = this.currentChapterIndex;
        Integer num2 = this.totalChapters;
        Map<String, String> map = this.currentFacts;
        Boolean bool = this.resetAll;
        MetaAiToastModel metaAiToastModel = this.toastModel;
        AbstractC05553uI abstractC05553uI = this.toastAction;
        StringBuilder sbA0f = C3cG.A0f(trigger, "VisualCanvas(trigger=");
        sbA0f.append(", uuid=");
        sbA0f.append(str);
        sbA0f.append(", backgroundImageUrl=");
        sbA0f.append(str2);
        sbA0f.append(", backgroundVideoUrl=");
        sbA0f.append(str3);
        sbA0f.append(", backgroundAnimation=");
        sbA0f.append(str4);
        sbA0f.append(", avatarAnimation=");
        sbA0f.append(enumC05543uF);
        sbA0f.append(", currentChapterIndex=");
        sbA0f.append(num);
        sbA0f.append(", totalChapters=");
        sbA0f.append(num2);
        sbA0f.append(", currentFacts=");
        sbA0f.append(map);
        sbA0f.append(", resetAll=");
        sbA0f.append(bool);
        sbA0f.append(", toastModel=");
        sbA0f.append(metaAiToastModel);
        return C3cJ.A0L(abstractC05553uI, ", toastAction=", sbA0f);
    }

    public VisualCanvas(Trigger trigger, String str, String str2, String str3, String str4, EnumC05543uF enumC05543uF, Integer num, Integer num2, Map<String, String> map, Boolean bool, MetaAiToastModel metaAiToastModel, AbstractC05553uI abstractC05553uI) {
        this.trigger = trigger;
        this.uuid = str;
        this.backgroundImageUrl = str2;
        this.backgroundVideoUrl = str3;
        this.backgroundAnimation = str4;
        this.avatarAnimation = enumC05543uF;
        this.currentChapterIndex = num;
        this.totalChapters = num2;
        this.currentFacts = map;
        this.resetAll = bool;
        this.toastModel = metaAiToastModel;
        this.toastAction = abstractC05553uI;
    }

    public /* synthetic */ VisualCanvas(Trigger trigger, String str, String str2, String str3, String str4, EnumC05543uF enumC05543uF, Integer num, Integer num2, Map map, Boolean bool, MetaAiToastModel metaAiToastModel, AbstractC05553uI abstractC05553uI, int i, C06H c06h) {
        this((i & 1) != 0 ? null : trigger, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : enumC05543uF, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : map, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : metaAiToastModel, (i & 2048) != 0 ? null : abstractC05553uI);
    }

    public VisualCanvas() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
