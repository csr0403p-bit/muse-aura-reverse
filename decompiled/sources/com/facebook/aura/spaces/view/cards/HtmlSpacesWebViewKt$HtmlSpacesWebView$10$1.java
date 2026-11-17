package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$10$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ MutableState<Integer> $topColor$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$10$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, MutableState<Integer> mutableState) {
        super(1);
        this.$session = htmlSpacesWebViewSession;
        this.$topColor$delegate = mutableState;
    }

    public final void invoke(int i) {
        HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
        Integer numValueOf = Integer.valueOf(i);
        htmlSpacesWebViewSession.lastTopColor = numValueOf;
        this.$topColor$delegate.Af8(numValueOf);
        G0U<? super Integer, Unit> g0u = this.$session.onTopColorDetected;
        if (g0u != null) {
            g0u.invoke(numValueOf);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
