package com.facebook.aura.conversation.view.typewritertext;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C0Hi;
import X.C1JY;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$textContent$1$3$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ G0U<Integer, Unit> $onDoubleClick;
    public final /* synthetic */ C1JY $textToolbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$textContent$1$3$1(C1JY c1jy, C0Hi c0Hi, G0U<? super Integer, Unit> g0u) {
        super(1);
        this.$textToolbar = c1jy;
        this.$focusManager = c0Hi;
        this.$onDoubleClick = g0u;
    }

    public final void invoke(int i) {
        HatchTrailingFadeTypewriterTextKt.removeSelectionFocus(this.$textToolbar, this.$focusManager);
        AnonymousClass005.A0l(i, this.$onDoubleClick);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
