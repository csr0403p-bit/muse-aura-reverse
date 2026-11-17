package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchWidgetWebViewKt$HatchWidgetWebView$4$1 extends AbstractC7559F3s implements G0U<Context, FrameLayout> {
    public final /* synthetic */ MutableState<Boolean> $rendererUnrecoverable$delegate;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$HatchWidgetWebView$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $rendererUnrecoverable$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState) {
            super(0);
            this.$rendererUnrecoverable$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableState.A09(true, this.$rendererUnrecoverable$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final FrameLayout invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        return HatchWidgetWebViewKt.createWidgetContainer(context, new AnonymousClass1(this.$rendererUnrecoverable$delegate));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWidgetWebViewKt$HatchWidgetWebView$4$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$rendererUnrecoverable$delegate = mutableState;
    }
}
