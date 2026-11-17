package com.facebook.aura.spaces.view.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C6t6;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$5$1", f = "HtmlSpacesWebView.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C6t6 $webView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$5$1(C6t6 c6t6, HtJ<? super HtmlSpacesWebViewKt$HtmlSpacesWebView$5$1> htJ) {
        super(2, htJ);
        this.$webView = c6t6;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlSpacesWebViewKt$HtmlSpacesWebView$5$1(this.$webView, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HtmlSpacesWebViewKt$HtmlSpacesWebView$5$1(this.$webView, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20qA01 = GDB.A01(AuraAppLifecycleManager.isAppInForegroundFlow);
            final C6t6 c6t6 = this.$webView;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$5$1.1
                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    C6t6 c6t62 = c6t6;
                    if (z) {
                        HtmlSpacesWebViewKt.resumeSpacesMedia(c6t62);
                    } else {
                        HtmlSpacesWebViewKt.pauseSpacesMedia(c6t62);
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
