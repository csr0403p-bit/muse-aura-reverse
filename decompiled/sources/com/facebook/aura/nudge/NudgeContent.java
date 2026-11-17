package com.facebook.aura.nudge;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NudgeContent extends C06G {
    public static final int $stable = 0;
    public final String actionLabel;
    public final String dismissLabel;
    public final int iconRes;
    public final boolean isIconTinted;
    public final G0V<BFM, Integer, Unit> leading;
    public final NudgePresentation presentation;
    public final String subtitle;
    public final int subtitleMaxLines;
    public final String title;
    public final int titleMaxLines;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NudgeContent) {
                NudgeContent nudgeContent = (NudgeContent) obj;
                if (this.iconRes != nudgeContent.iconRes || !C7384Etj.areEqual(this.title, nudgeContent.title) || !C7384Etj.areEqual(this.actionLabel, nudgeContent.actionLabel) || this.titleMaxLines != nudgeContent.titleMaxLines || !C7384Etj.areEqual(this.subtitle, nudgeContent.subtitle) || this.subtitleMaxLines != nudgeContent.subtitleMaxLines || this.isIconTinted != nudgeContent.isIconTinted || !C7384Etj.areEqual(this.leading, nudgeContent.leading) || this.presentation != nudgeContent.presentation || !C7384Etj.areEqual(this.dismissLabel, nudgeContent.dismissLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NudgeContent(int i, String str, String str2, int i2, String str3, int i3, boolean z, G0V g0v, NudgePresentation nudgePresentation, String str4, int i4, C06H c06h) {
        this(i, str, str2, (i4 & 8) != 0 ? 2 : i2, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? 3 : i3, (i4 & 64) != 0 ? true : z, (i4 & 128) != 0 ? null : g0v, (i4 & 256) != 0 ? NudgePresentation.CARD : nudgePresentation, (i4 & 512) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NudgeContent copy$default(NudgeContent nudgeContent, int i, String str, String str2, int i2, String str3, int i3, boolean z, G0V g0v, NudgePresentation nudgePresentation, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = nudgeContent.iconRes;
        }
        if ((i4 & 2) != 0) {
            str = nudgeContent.title;
        }
        if ((i4 & 4) != 0) {
            str2 = nudgeContent.actionLabel;
        }
        if ((i4 & 8) != 0) {
            i2 = nudgeContent.titleMaxLines;
        }
        if ((i4 & 16) != 0) {
            str3 = nudgeContent.subtitle;
        }
        if ((i4 & 32) != 0) {
            i3 = nudgeContent.subtitleMaxLines;
        }
        if ((i4 & 64) != 0) {
            z = nudgeContent.isIconTinted;
        }
        if ((i4 & 128) != 0) {
            g0v = nudgeContent.leading;
        }
        if ((i4 & 256) != 0) {
            nudgePresentation = nudgeContent.presentation;
        }
        if ((i4 & 512) != 0) {
            str4 = nudgeContent.dismissLabel;
        }
        return nudgeContent.copy(i, str, str2, i2, str3, i3, z, g0v, nudgePresentation, str4);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final String component10() {
        return this.dismissLabel;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.actionLabel;
    }

    public final int component4() {
        return this.titleMaxLines;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final int component6() {
        return this.subtitleMaxLines;
    }

    public final boolean component7() {
        return this.isIconTinted;
    }

    public final G0V<BFM, Integer, Unit> component8() {
        return this.leading;
    }

    public final NudgePresentation component9() {
        return this.presentation;
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final String getDismissLabel() {
        return this.dismissLabel;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final G0V<BFM, Integer, Unit> getLeading() {
        return this.leading;
    }

    public final NudgePresentation getPresentation() {
        return this.presentation;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleMaxLines() {
        return this.titleMaxLines;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.presentation, (C0KA.A01((((((AnonymousClass005.A0I(this.actionLabel, AnonymousClass005.A0I(this.title, this.iconRes * 31)) + this.titleMaxLines) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + this.subtitleMaxLines) * 31, this.isIconTinted) + AnonymousClass006.A0D(this.leading)) * 31) + AnonymousClass005.A0H(this.dismissLabel);
    }

    public final boolean isIconTinted() {
        return this.isIconTinted;
    }

    public final NudgeContent copy(int i, String str, String str2, int i2, String str3, int i3, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, NudgePresentation nudgePresentation, String str4) {
        AnonymousClass003.A0x(str, str2);
        C7384Etj.A0Y(nudgePresentation, 8);
        return new NudgeContent(i, str, str2, i2, str3, i3, z, g0v, nudgePresentation, str4);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NudgeContent(int i, String str, String str2, int i2, String str3, int i3, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, NudgePresentation nudgePresentation, String str4) {
        AnonymousClass003.A0x(str, str2);
        C7384Etj.A0Y(nudgePresentation, 8);
        this.iconRes = i;
        this.title = str;
        this.actionLabel = str2;
        this.titleMaxLines = i2;
        this.subtitle = str3;
        this.subtitleMaxLines = i3;
        this.isIconTinted = z;
        this.leading = g0v;
        this.presentation = nudgePresentation;
        this.dismissLabel = str4;
    }
}
