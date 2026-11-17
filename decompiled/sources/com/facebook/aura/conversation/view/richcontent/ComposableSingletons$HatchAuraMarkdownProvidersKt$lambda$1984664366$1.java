package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1809ArT;
import X.G2j;
import com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import kotlin.Unit;

/* renamed from: com.facebook.aura.conversation.view.richcontent.ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$-1984664366$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$1984664366$1 extends AbstractC7559F3s implements G2j<InlineMathPayload, AuraMarkdownTheme, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$1984664366$1 INSTANCE = new ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$1984664366$1();

    public ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$1984664366$1() {
        super(4);
    }

    public final void invoke(InlineMathPayload inlineMathPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
        HatchInlineMathKt.m680HatchInlineMathww6aTOc(inlineMathPayload.expression, null, (int) C1809ArT.A00(auraMarkdownTheme.baseTextStyle.A02.A01), auraMarkdownTheme.baseTextColor, bfm, AnonymousClass004.A1b(inlineMathPayload, auraMarkdownTheme) ? 1 : 0, 2);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(InlineMathPayload inlineMathPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
        invoke(inlineMathPayload, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
