package com.facebook.aura.email.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00r;
import X.C7384Etj;
import X.G0U;
import android.view.View;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailHtmlBodyKt$EmailHtmlBody$5$1 extends AbstractC7559F3s implements G0U<View, Unit> {
    public final /* synthetic */ int $backgroundColor;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ String $document;
    public final /* synthetic */ MutableState<Boolean> $failed$delegate;
    public final /* synthetic */ C00r $heightPx$delegate;

    /* renamed from: com.facebook.aura.email.view.EmailHtmlBodyKt$EmailHtmlBody$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public final /* synthetic */ C00r $heightPx$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C00r c00r) {
            super(1);
            this.$heightPx$delegate = c00r;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.$heightPx$delegate.AdX(i);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailHtmlBodyKt$EmailHtmlBody$5$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $failed$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState<Boolean> mutableState) {
            super(0);
            this.$failed$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableState.A09(true, this.$failed$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        C7384Etj.A0Y(view, 0);
        if (view instanceof EmailBodyWebView) {
            EmailBodyWebView emailBodyWebView = (EmailBodyWebView) view;
            emailBodyWebView.onHeight = new AnonymousClass1(this.$heightPx$delegate);
            emailBodyWebView.onFailure = new AnonymousClass2(this.$failed$delegate);
            emailBodyWebView.bind(this.$document, this.$density.AFo(), this.$backgroundColor);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailHtmlBodyKt$EmailHtmlBody$5$1(String str, AXN axn, int i, C00r c00r, MutableState<Boolean> mutableState) {
        super(1);
        this.$document = str;
        this.$density = axn;
        this.$backgroundColor = i;
        this.$heightPx$delegate = c00r;
        this.$failed$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }
}
