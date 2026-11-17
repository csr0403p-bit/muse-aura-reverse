package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchPromptPreviewText extends C06G {
    public static final int $stable = 0;
    public final String actorName;
    public final String text;

    public HatchPromptPreviewText(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.actorName = str2;
    }

    public final HatchPromptPreviewText copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchPromptPreviewText(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPromptPreviewText) {
                HatchPromptPreviewText hatchPromptPreviewText = (HatchPromptPreviewText) obj;
                if (!C7384Etj.areEqual(this.text, hatchPromptPreviewText.text) || !C7384Etj.areEqual(this.actorName, hatchPromptPreviewText.actorName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPromptPreviewText copy$default(HatchPromptPreviewText hatchPromptPreviewText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPromptPreviewText.text;
        }
        if ((i & 2) != 0) {
            str2 = hatchPromptPreviewText.actorName;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchPromptPreviewText(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.actorName;
    }

    public final String getActorName() {
        return this.actorName;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0G(this.actorName);
    }

    public String toString() {
        return super.toString();
    }
}
