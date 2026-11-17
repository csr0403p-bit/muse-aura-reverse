package com.facebook.aura.markdown.render.inline;

import X.AHD;
import X.AnonymousClass005;
import X.ApQ;
import X.C06H;
import X.C1819Ari;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityRange;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot;

/* loaded from: classes4.dex */
public final class InlineRenderResult {
    public static final int $stable = AuraMarkdownInlineEntityRange.$stable | AuraMarkdownInlineEntitySlot.$stable;
    public final ApQ annotated;
    public final AHD<AuraMarkdownInlineEntityRange> inlineEntityRanges;
    public final AHD<AuraMarkdownInlineEntitySlot> inlineEntitySlots;
    public final AHD<InlineMathEntity> mathEntities;
    public final int textDirection;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineRenderResult) {
                InlineRenderResult inlineRenderResult = (InlineRenderResult) obj;
                if (!C7384Etj.areEqual(this.annotated, inlineRenderResult.annotated) || !C7384Etj.areEqual(this.mathEntities, inlineRenderResult.mathEntities) || !C7384Etj.areEqual(this.inlineEntitySlots, inlineRenderResult.inlineEntitySlots) || !C7384Etj.areEqual(this.inlineEntityRanges, inlineRenderResult.inlineEntityRanges) || this.textDirection != inlineRenderResult.textDirection) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-mET9d1o$default, reason: not valid java name */
    public static /* synthetic */ InlineRenderResult m1426copymET9d1o$default(InlineRenderResult inlineRenderResult, ApQ apQ, AHD ahd, AHD ahd2, AHD ahd3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            apQ = inlineRenderResult.annotated;
        }
        if ((i2 & 2) != 0) {
            ahd = inlineRenderResult.mathEntities;
        }
        if ((i2 & 4) != 0) {
            ahd2 = inlineRenderResult.inlineEntitySlots;
        }
        if ((i2 & 8) != 0) {
            ahd3 = inlineRenderResult.inlineEntityRanges;
        }
        if ((i2 & 16) != 0) {
            i = inlineRenderResult.textDirection;
        }
        return inlineRenderResult.m1428copymET9d1o(apQ, ahd, ahd2, ahd3, i);
    }

    public final ApQ component1() {
        return this.annotated;
    }

    public final AHD<InlineMathEntity> component2() {
        return this.mathEntities;
    }

    public final AHD<AuraMarkdownInlineEntitySlot> component3() {
        return this.inlineEntitySlots;
    }

    public final AHD<AuraMarkdownInlineEntityRange> component4() {
        return this.inlineEntityRanges;
    }

    /* renamed from: component5-s_7X-co, reason: not valid java name */
    public final int m1427component5s_7Xco() {
        return this.textDirection;
    }

    public final ApQ getAnnotated() {
        return this.annotated;
    }

    public final AHD<AuraMarkdownInlineEntityRange> getInlineEntityRanges() {
        return this.inlineEntityRanges;
    }

    public final AHD<AuraMarkdownInlineEntitySlot> getInlineEntitySlots() {
        return this.inlineEntitySlots;
    }

    public final AHD<InlineMathEntity> getMathEntities() {
        return this.mathEntities;
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m1429getTextDirections_7Xco() {
        return this.textDirection;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.inlineEntityRanges, AnonymousClass005.A0F(this.inlineEntitySlots, AnonymousClass005.A0F(this.mathEntities, AnonymousClass005.A0E(this.annotated)))) + this.textDirection;
    }

    public String toString() {
        ApQ apQ = this.annotated;
        AHD<InlineMathEntity> ahd = this.mathEntities;
        AHD<AuraMarkdownInlineEntitySlot> ahd2 = this.inlineEntitySlots;
        AHD<AuraMarkdownInlineEntityRange> ahd3 = this.inlineEntityRanges;
        String strA00 = C1819Ari.A00(this.textDirection);
        StringBuilder sbA0f = C3cG.A0f(apQ, "InlineRenderResult(annotated=");
        sbA0f.append(", mathEntities=");
        sbA0f.append(ahd);
        sbA0f.append(", inlineEntitySlots=");
        sbA0f.append(ahd2);
        sbA0f.append(", inlineEntityRanges=");
        sbA0f.append(ahd3);
        return C3cJ.A0N(", textDirection=", strA00, sbA0f);
    }

    public InlineRenderResult(ApQ apQ, AHD<InlineMathEntity> ahd, AHD<AuraMarkdownInlineEntitySlot> ahd2, AHD<AuraMarkdownInlineEntityRange> ahd3, int i) {
        AnonymousClass005.A14(apQ, ahd, ahd2, ahd3);
        this.annotated = apQ;
        this.mathEntities = ahd;
        this.inlineEntitySlots = ahd2;
        this.inlineEntityRanges = ahd3;
        this.textDirection = i;
    }

    /* renamed from: copy-mET9d1o, reason: not valid java name */
    public final InlineRenderResult m1428copymET9d1o(ApQ apQ, AHD<InlineMathEntity> ahd, AHD<AuraMarkdownInlineEntitySlot> ahd2, AHD<AuraMarkdownInlineEntityRange> ahd3, int i) {
        AnonymousClass005.A14(apQ, ahd, ahd2, ahd3);
        return new InlineRenderResult(apQ, ahd, ahd2, ahd3, i);
    }

    public /* synthetic */ InlineRenderResult(ApQ apQ, AHD ahd, AHD ahd2, AHD ahd3, int i, C06H c06h) {
        this(apQ, ahd, ahd2, ahd3, i);
    }
}
