package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$markdown$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0V<String, Boolean, Unit> $onUrlClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$onUrlClick.invoke(str, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$markdown$1$1$1(G0V<? super String, ? super Boolean, Unit> g0v) {
        super(1);
        this.$onUrlClick = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
