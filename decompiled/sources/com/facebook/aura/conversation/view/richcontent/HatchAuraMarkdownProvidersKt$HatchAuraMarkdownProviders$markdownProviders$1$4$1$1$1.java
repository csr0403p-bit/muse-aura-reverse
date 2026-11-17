package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.model.HatchCodeParams;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$4$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraBlock.CodeBlock $block;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$4$1$1$1(G0U<? super HatchContentViewModelData, Unit> g0u, AuraBlock.CodeBlock codeBlock) {
        super(0);
        this.$it = g0u;
        this.$block = codeBlock;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<HatchContentViewModelData, Unit> g0u = this.$it;
        AuraBlock.CodeBlock codeBlock = this.$block;
        String str = codeBlock.code;
        String str2 = codeBlock.language;
        if (str2 == null) {
            str2 = "";
        }
        g0u.invoke(new HatchContentViewModelData.Code(new HatchCodeParams(str, str2), null));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
