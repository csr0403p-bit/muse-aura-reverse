package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1809ArT;
import X.G2j;
import com.facebook.aura.markdown.parser.custom.extensions.MathBlockPayload;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$580816159$1 extends AbstractC7559F3s implements G2j<MathBlockPayload, AuraMarkdownTheme, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$580816159$1 INSTANCE = new ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$580816159$1();

    public ComposableSingletons$HatchAuraMarkdownProvidersKt$lambda$580816159$1() {
        super(4);
    }

    public final void invoke(MathBlockPayload mathBlockPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
        HatchMathContentKt.m682HatchMathContentw0dp6WY(mathBlockPayload.expression, AnonymousClass002.A1a(mathBlockPayload, auraMarkdownTheme), null, 0.0f, (int) C1809ArT.A00(auraMarkdownTheme.baseTextStyle.A02.A01), auraMarkdownTheme.baseTextColor, bfm, 3120, 4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(MathBlockPayload mathBlockPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
        invoke(mathBlockPayload, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
