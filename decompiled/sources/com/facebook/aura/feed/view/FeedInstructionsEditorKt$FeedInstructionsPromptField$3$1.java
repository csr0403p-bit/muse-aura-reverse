package com.facebook.aura.feed.view;

import X.AbstractC1815ArZ;
import X.AbstractC7559F3s;
import X.C1518AkS;
import X.C1805ArO;
import X.C1C3;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedInstructionsEditorKt$FeedInstructionsPromptField$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ G0U<C1805ArO, Unit> $onTextChange;
    public final /* synthetic */ C1805ArO $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedInstructionsEditorKt$FeedInstructionsPromptField$3$1(G0U<? super C1805ArO, Unit> g0u, C1805ArO c1805ArO, C1518AkS c1518AkS, C1C3 c1c3) {
        super(0);
        this.$onTextChange = g0u;
        this.$text = c1805ArO;
        this.$focusRequester = c1518AkS;
        this.$keyboardController = c1c3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<C1805ArO, Unit> g0u = this.$onTextChange;
        C1805ArO c1805ArO = this.$text;
        int length = c1805ArO.A01.A00.length();
        g0u.invoke(new C1805ArO(c1805ArO.A01, c1805ArO.A02, AbstractC1815ArZ.A00(length, length)));
        C1518AkS.A00(this.$focusRequester);
        C1C3 c1c3 = this.$keyboardController;
        if (c1c3 != null) {
            c1c3.Afd();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
