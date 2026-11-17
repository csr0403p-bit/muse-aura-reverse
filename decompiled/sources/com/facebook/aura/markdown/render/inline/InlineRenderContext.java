package com.facebook.aura.markdown.render.inline;

import X.AnonymousClass003;
import X.BO6;
import X.C3cG;
import X.G0U;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityHandler;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntityRange;
import com.facebook.aura.markdown.render.AuraMarkdownInlineEntitySlot;
import java.util.List;

/* loaded from: classes4.dex */
public final class InlineRenderContext {
    public final G0U<String, String> imageAltFormatter;
    public final BO6<String, AuraMarkdownInlineEntityHandler> inlineEntityHandlers;
    public final List<AuraMarkdownInlineEntityRange> inlineEntityRanges;
    public final List<AuraMarkdownInlineEntitySlot> inlineEntitySlots;
    public final List<InlineMathEntity> mathEntities;
    public final boolean reflowSoftBreaks;

    public final G0U<String, String> getImageAltFormatter() {
        return this.imageAltFormatter;
    }

    public final BO6<String, AuraMarkdownInlineEntityHandler> getInlineEntityHandlers() {
        return this.inlineEntityHandlers;
    }

    public final List<AuraMarkdownInlineEntityRange> getInlineEntityRanges() {
        return this.inlineEntityRanges;
    }

    public final List<AuraMarkdownInlineEntitySlot> getInlineEntitySlots() {
        return this.inlineEntitySlots;
    }

    public final List<InlineMathEntity> getMathEntities() {
        return this.mathEntities;
    }

    public final boolean getReflowSoftBreaks() {
        return this.reflowSoftBreaks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InlineRenderContext(G0U<? super String, String> g0u, BO6<String, AuraMarkdownInlineEntityHandler> bo6, boolean z) {
        AnonymousClass003.A0u(g0u, bo6);
        this.imageAltFormatter = g0u;
        this.inlineEntityHandlers = bo6;
        this.reflowSoftBreaks = z;
        this.mathEntities = C3cG.A0h();
        this.inlineEntitySlots = C3cG.A0h();
        this.inlineEntityRanges = C3cG.A0h();
    }
}
