package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class LetterWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final LetterBodyPreview bodyPreview;
    public final String byline;
    public final LetterBriefingWidgetContent content;
    public final String emoji;
    public final String title;

    public final class Companion {
        public final C9hr<LetterWidgetData> serializer() {
            return LetterWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LetterWidgetData(LetterBriefingWidgetContent letterBriefingWidgetContent, String str, String str2, String str3, LetterBodyPreview letterBodyPreview) {
        C7384Etj.A0Y(letterBriefingWidgetContent, 0);
        this.content = letterBriefingWidgetContent;
        this.emoji = str;
        this.title = str2;
        this.byline = str3;
        this.bodyPreview = letterBodyPreview;
    }

    public final LetterWidgetData copy(LetterBriefingWidgetContent letterBriefingWidgetContent, String str, String str2, String str3, LetterBodyPreview letterBodyPreview) {
        C7384Etj.A0Y(letterBriefingWidgetContent, 0);
        return new LetterWidgetData(letterBriefingWidgetContent, str, str2, str3, letterBodyPreview);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LetterWidgetData) {
                LetterWidgetData letterWidgetData = (LetterWidgetData) obj;
                if (!C7384Etj.areEqual(this.content, letterWidgetData.content) || !C7384Etj.areEqual(this.emoji, letterWidgetData.emoji) || !C7384Etj.areEqual(this.title, letterWidgetData.title) || !C7384Etj.areEqual(this.byline, letterWidgetData.byline) || !C7384Etj.areEqual(this.bodyPreview, letterWidgetData.bodyPreview)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LetterWidgetData copy$default(LetterWidgetData letterWidgetData, LetterBriefingWidgetContent letterBriefingWidgetContent, String str, String str2, String str3, LetterBodyPreview letterBodyPreview, int i, Object obj) {
        if ((i & 1) != 0) {
            letterBriefingWidgetContent = letterWidgetData.content;
        }
        if ((i & 2) != 0) {
            str = letterWidgetData.emoji;
        }
        if ((i & 4) != 0) {
            str2 = letterWidgetData.title;
        }
        if ((i & 8) != 0) {
            str3 = letterWidgetData.byline;
        }
        if ((i & 16) != 0) {
            letterBodyPreview = letterWidgetData.bodyPreview;
        }
        return letterWidgetData.copy(letterBriefingWidgetContent, str, str2, str3, letterBodyPreview);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(LetterWidgetData letterWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(letterWidgetData.content, LetterBriefingWidgetContent$$serializer.INSTANCE, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || letterWidgetData.emoji != null) {
            c9j5.AAP(letterWidgetData.emoji, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || letterWidgetData.title != null) {
            c9j5.AAP(letterWidgetData.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || letterWidgetData.byline != null) {
            c9j5.AAP(letterWidgetData.byline, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || letterWidgetData.bodyPreview != null) {
            c9j5.AAP(letterWidgetData.bodyPreview, LetterBodyPreviewSerializer.INSTANCE, c9iZ, 4);
        }
    }

    public final LetterBriefingWidgetContent component1() {
        return this.content;
    }

    public final String component2() {
        return this.emoji;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.byline;
    }

    public final LetterBodyPreview component5() {
        return this.bodyPreview;
    }

    public final LetterBodyPreview getBodyPreview() {
        return this.bodyPreview;
    }

    public final String getByline() {
        return this.byline;
    }

    public final LetterBriefingWidgetContent getContent() {
        return this.content;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0E(this.content) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.byline)) * 31) + C3cH.A02(this.bodyPreview);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LetterWidgetData(LetterBriefingWidgetContent letterBriefingWidgetContent, String str, String str2, String str3, LetterBodyPreview letterBodyPreview, int i, C06H c06h) {
        this(letterBriefingWidgetContent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : letterBodyPreview);
    }

    public /* synthetic */ LetterWidgetData(int i, LetterBriefingWidgetContent letterBriefingWidgetContent, String str, String str2, String str3, LetterBodyPreview letterBodyPreview, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LetterWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.content = letterBriefingWidgetContent;
        if ((i & 2) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.byline = null;
        } else {
            this.byline = str3;
        }
        if ((i & 16) == 0) {
            this.bodyPreview = null;
        } else {
            this.bodyPreview = letterBodyPreview;
        }
    }
}
