package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$10$9$1 extends AbstractC7559F3s implements G0V<FeedUnit, Integer, Unit> {
    public final /* synthetic */ String $discussErrorMessage;
    public final /* synthetic */ String $discussPostEyebrow;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ FeedViewModel $viewModel;

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$10$9$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<FeedUnit, Unit> {
        public final /* synthetic */ String $discussPostEyebrow;
        public final /* synthetic */ AuraNavigator $navigator;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FeedUnit feedUnit) {
            C7384Etj.A0Y(feedUnit, 0);
            FeedTabScreenKt.stageFeedDiscussion(feedUnit, this.$discussPostEyebrow);
            AuraNavigator auraNavigator = this.$navigator;
            ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
            auraNavigator.popToTabRoot(conversationTabScreenKey);
            this.$navigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AuraNavigator auraNavigator) {
            super(1);
            this.$discussPostEyebrow = str;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(FeedUnit feedUnit) {
            invoke2(feedUnit);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$10$9$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ String $discussErrorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$discussErrorMessage = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C06G.A0i(AuraToast.Duration.SHORT, this.$discussErrorMessage);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$10$9$1(FeedViewModel feedViewModel, String str, AuraNavigator auraNavigator, String str2) {
        super(2);
        this.$viewModel = feedViewModel;
        this.$discussPostEyebrow = str;
        this.$navigator = auraNavigator;
        this.$discussErrorMessage = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(FeedUnit feedUnit, Integer num) {
        invoke(feedUnit, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FeedUnit feedUnit, int i) {
        AnonymousClass006.A0b(feedUnit).logClick(HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, HatchComponent.FEED_UNIT_COMMENT, null, FeedUnitRowKt.feedCardLogMetadata(feedUnit, i), null);
        this.$viewModel.materializeForDiscussion(feedUnit, new AnonymousClass1(this.$discussPostEyebrow, this.$navigator), new AnonymousClass2(this.$discussErrorMessage));
    }
}
