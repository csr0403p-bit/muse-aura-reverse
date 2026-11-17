package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import android.content.Context;
import android.widget.Toast;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedStatusSheetKt$FeedStatusSheet$2$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $generateErrorMessage;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ FeedViewModel $viewModel;

    /* renamed from: com.facebook.aura.feed.view.FeedStatusSheetKt$FeedStatusSheet$2$1$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator) {
            super(0);
            this.$navigator = auraNavigator;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$navigator.back();
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedStatusSheetKt$FeedStatusSheet$2$1$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $generateErrorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str) {
            super(0);
            this.$context = context;
            this.$generateErrorMessage = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Toast.makeText(this.$context, this.$generateErrorMessage, 0).show();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedStatusSheetKt$FeedStatusSheet$2$1$3$1(FeedViewModel feedViewModel, AuraNavigator auraNavigator, Context context, String str) {
        super(0);
        this.$viewModel = feedViewModel;
        this.$navigator = auraNavigator;
        this.$context = context;
        this.$generateErrorMessage = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, HatchSubsurface.TAB_FEED, HatchScreen.FEED_STATUS_SHEET, HatchComponent.FEED_GENERATE_BUTTON, null, null, null);
        this.$viewModel.regenerateSelectedPrompt(new AnonymousClass1(this.$navigator), new AnonymousClass2(this.$context, this.$generateErrorMessage));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
