package com.facebook.aura.feed.view;

import X.AHD;
import X.AIW;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AYD;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BL4;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C0924AIa;
import X.C0A8;
import X.C0dx;
import X.C0eO;
import X.C0v5;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DP;
import X.C1YD;
import X.C1YY;
import X.C1b8;
import X.C2VU;
import X.C31t;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C7mU;
import X.C90m;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC04981Yd;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.explore.view.cards.IdeaCardPreviewImageKt;
import com.facebook.aura.feed.repo.FeedCarouselItem;
import com.facebook.aura.feed.repo.FeedCarouselUnit;
import com.facebook.aura.feed.repo.FeedHeroImageUnit;
import com.facebook.aura.feed.repo.FeedIdeaAction;
import com.facebook.aura.feed.repo.FeedMediaKind;
import com.facebook.aura.feed.repo.FeedPostMetadata;
import com.facebook.aura.feed.repo.FeedReaction;
import com.facebook.aura.feed.repo.FeedSocialEmbed;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedTextUnit;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedVideo;
import com.facebook.aura.feed.repo.FeedWidgetUnit;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.file.view.SocialSourceIconKt;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentSocialSource;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public abstract class FeedUnitRowKt {
    public static final float AttachmentTopPadding = 12.0f;
    public static final float CarouselItemGap = 10.0f;
    public static final float CarouselItemSize = 180.0f;
    public static final float CarouselPlayButtonSize = 44.0f;
    public static final int FeedVideoCrossfadeDurationMs = 200;
    public static final String FeedVideoSurfaceTag = "hatch_feed";
    public static final float FeedVideoVisibleFraction = 0.6f;
    public static final String FeedWidgetKind = "html";
    public static final float GlyphGap = 10.0f;
    public static final float GlyphIconInset = 12.0f;
    public static final float GlyphSize = 44.0f;
    public static final int ITEM_DELETE = 1;
    public static final float KickerBottomPadding = 6.0f;
    public static final float KickerGap = 10.0f;
    public static final float MediaMaxHeight = 462.0f;
    public static final float PlayButtonBackgroundAlpha = 0.7f;
    public static final float PlayButtonSize = 56.0f;
    public static final boolean ShowKicker = false;
    public static final float TitleBottomPadding = 4.0f;
    public static final float UfiHorizontalPadding = 10.0f;
    public static final float UfiLabelGap = 6.0f;
    public static final float UfiPressedScale = 0.82f;
    public static final float UfiVerticalPadding = 16.0f;
    public static final float VideoCornerControlTouchSize = 48.0f;
    public static final float VideoCornerControlVisualInset = 10.0f;
    public static final float VideoExpandButtonScrimAlpha = 0.5f;
    public static final float WhyReasonDividerThickness = 1.0f;
    public static final float WhyReasonDividerTopPadding = 12.0f;
    public static final float WhyReasonDividerTopPaddingUnderMedia = 16.0f;
    public static final float WhyReasonHeaderActionOverhang = 4.0f;
    public static final float WhyReasonHeaderActionPadding = 5.0f;
    public static final float WhyReasonHeaderTopPadding = 12.0f;
    public static final float WhyReasonTextTopPadding = 4.0f;
    public static final float WideAspectRatio = 1.7777778f;
    public static final C1D3 AttachmentShape = C1D8.A00(12.0f);
    public static final float ContentIndent = (AuraDimensKt.SpacingMedium + 44.0f) + 10.0f;
    public static final C1D3 UfiActionShape = C1D8.A00(24.0f);

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedHeroImageAttachment$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedHeroImageUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FeedHeroImageUnit feedHeroImageUnit, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedHeroImageUnit;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedHeroImageAttachment(this.$unit, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedHeroImageAttachment$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedHeroImageUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FeedHeroImageUnit feedHeroImageUnit, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedHeroImageUnit;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedHeroImageAttachment(this.$unit, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedHeroImageAttachment$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedHeroImageUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FeedHeroImageUnit feedHeroImageUnit, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedHeroImageUnit;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedHeroImageAttachment(this.$unit, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitAttachment$2, reason: invalid class name and case insensitive filesystem */
    public final class C118902 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118902(FeedUnit feedUnit, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitAttachment(this.$unit, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitBody$2, reason: invalid class name and case insensitive filesystem */
    public final class C118912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onComment;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onDelete;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onDislike;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onLike;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118912(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, G0U<? super FeedUnit, Unit> g0u2, G0U<? super FeedUnit, Unit> g0u3, G0U<? super FeedUnit, Unit> g0u4, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$onLike = g0u;
            this.$onDislike = g0u2;
            this.$onComment = g0u3;
            this.$onDelete = g0u4;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitBody(this.$unit, this.$absolutePosition, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitGlyph$1, reason: invalid class name and case insensitive filesystem */
    public final class C118921 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $emoji;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118921(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$iconUrl = str;
            this.$emoji = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitGlyph(this.$iconUrl, this.$emoji, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitGlyph$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $emoji;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$iconUrl = str;
            this.$emoji = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitGlyph(this.$iconUrl, this.$emoji, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitIdeaAction$2, reason: invalid class name and case insensitive filesystem */
    public final class C118932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ FeedIdeaAction $ideaAction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118932(FeedIdeaAction feedIdeaAction, FeedUnit feedUnit, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$ideaAction = feedIdeaAction;
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitIdeaAction(this.$ideaAction, this.$unit, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitKicker$1, reason: invalid class name and case insensitive filesystem */
    public final class C118941 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118941(FeedUnit feedUnit, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitKicker(this.$unit, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitKicker$3, reason: invalid class name and case insensitive filesystem */
    public final class C118953 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118953(FeedUnit feedUnit, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitKicker(this.$unit, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C118962 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onComment;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onDelete;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onDislike;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onLike;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118962(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, G0U<? super FeedUnit, Unit> g0u2, G0U<? super FeedUnit, Unit> g0u3, G0U<? super FeedUnit, Unit> g0u4, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$onLike = g0u;
            this.$onDislike = g0u2;
            this.$onComment = g0u3;
            this.$onDelete = g0u4;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitRow(this.$unit, this.$absolutePosition, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitUfi$2, reason: invalid class name and case insensitive filesystem */
    public final class C118972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onComment;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onDelete;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onDislike;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onLike;
        public final /* synthetic */ Function0<Unit> $onWhyToggle;
        public final /* synthetic */ FeedUnit $unit;
        public final /* synthetic */ boolean $whyExpanded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118972(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, G0U<? super FeedUnit, Unit> g0u2, G0U<? super FeedUnit, Unit> g0u3, G0U<? super FeedUnit, Unit> g0u4, boolean z, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$onLike = g0u;
            this.$onDislike = g0u2;
            this.$onComment = g0u3;
            this.$onDelete = g0u4;
            this.$whyExpanded = z;
            this.$onWhyToggle = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitUfi(this.$unit, this.$absolutePosition, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$whyExpanded, this.$onWhyToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedUnitWhyReasonHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C118982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onDelete;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118982(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$onDelete = g0u;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedUnitWhyReasonHeader(this.$unit, this.$absolutePosition, this.$onDelete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedVideoAttachment$3, reason: invalid class name and case insensitive filesystem */
    public final class C118993 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedUnit $unit;
        public final /* synthetic */ FeedVideo $video;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118993(FeedUnit feedUnit, FeedVideo feedVideo, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$video = feedVideo;
            this.$absolutePosition = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedVideoAttachment(this.$unit, this.$video, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedVideoControlButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C119001 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119001(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedVideoControlButton(this.$iconRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedVideoMedia$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenInViewer;
        public final /* synthetic */ G0U<Boolean, Unit> $onPlaybackToggled;
        public final /* synthetic */ String $posterUrl;
        public final /* synthetic */ String $videoId;
        public final /* synthetic */ Uri $videoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Uri uri, String str, String str2, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$videoUri = uri;
            this.$videoId = str;
            this.$posterUrl = str2;
            this.$onOpenInViewer = function0;
            this.$onPlaybackToggled = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedVideoMedia(this.$videoUri, this.$videoId, this.$posterUrl, this.$onOpenInViewer, this.$onPlaybackToggled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedVideoPlayer$2, reason: invalid class name and case insensitive filesystem */
    public final class C119012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isMuted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMediaRendered;
        public final /* synthetic */ FeedVideoPlaybackState $playbackState;
        public final /* synthetic */ String $videoId;
        public final /* synthetic */ Uri $videoUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119012(Uri uri, String str, FeedVideoPlaybackState feedVideoPlaybackState, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$videoUri = uri;
            this.$videoId = str;
            this.$playbackState = feedVideoPlaybackState;
            this.$isMuted = z;
            this.$onMediaRendered = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedVideoPlayer(this.$videoUri, this.$videoId, this.$playbackState, this.$isMuted, this.$onMediaRendered, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedWidgetAttachment$3, reason: invalid class name and case insensitive filesystem */
    public final class C119023 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedWidgetUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119023(FeedWidgetUnit feedWidgetUnit, BRg bRg, int i, int i2) {
            super(2);
            this.$unit = feedWidgetUnit;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedUnitRowKt.FeedWidgetAttachment(this.$unit, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$openExternalUri$1, reason: invalid class name and case insensitive filesystem */
    public final class C119031 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $this_openExternalUri;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119031(Context context, String str) {
            super(0);
            this.$this_openExternalUri = context;
            this.$url = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FeedUnitRowKt.startExternalUriActivity(this.$this_openExternalUri, this.$url);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static final Map<String, String> editionLogMetadata(FeedUnit feedUnit) {
        C7384Etj.A0Y(feedUnit, 0);
        C0924AIa c0924AIa = new C0924AIa();
        if (feedUnit.getRunId().length() > 0) {
            c0924AIa.put(HatchMetadataKey.GENERATION_RUN_ID.getValue(), feedUnit.getRunId());
        }
        String value = feedUnit.getEditionKind().getValue();
        if (value != null) {
            AnonymousClass001.A1C(HatchMetadataKey.GENERATION_EDITION_KIND, value, c0924AIa);
        }
        if (feedUnit.getEditionLocalDate().length() > 0) {
            c0924AIa.put(HatchMetadataKey.GENERATION_EDITION_LOCAL_DATE.getValue(), feedUnit.getEditionLocalDate());
        }
        if (feedUnit.getEditionGeneratedAtMs() > 0) {
            c0924AIa.put(HatchMetadataKey.GENERATION_EDITION_GENERATED_AT_MS.getValue(), String.valueOf(feedUnit.getEditionGeneratedAtMs()));
        }
        return AIW.A0K(c0924AIa);
    }

    public static final Map<String, String> feedCardLogMetadata(FeedUnit feedUnit, int i) {
        C7384Etj.A0Y(feedUnit, 0);
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put(HatchMetadataKey.FEED_CARD_ID.getValue(), feedUnit.getId());
        AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIa, i);
        FeedIdeaAction ideaAction = feedUnit.getIdeaAction();
        if (ideaAction != null) {
            c0924AIa.put(HatchMetadataKey.IDEA_CARD_ID.getValue(), ideaAction.ideaId);
        }
        c0924AIa.putAll(editionLogMetadata(feedUnit));
        return AIW.A0K(c0924AIa);
    }

    /* renamed from: feedImageContentItem-mL-hObY, reason: not valid java name */
    public static final ContentItem m845feedImageContentItemmLhObY(String str, String str2, long j, ContentSocialSource contentSocialSource) {
        String strA0S = C7BY.A0S(str, str, '?');
        return new ContentItem(C7BY.A0R(strA0S, strA0S, '/'), ContentType.Image.INSTANCE, null, str, null, str2, null, null, AuraImageKt.m2575auraDecodeSizeForozmzZPI(j), false, contentSocialSource, null, null, null, null);
    }

    public static final ContentItem feedVideoContentItem(String str, String str2, String str3, ContentSocialSource contentSocialSource) {
        String strA0S = C7BY.A0S(str, str, '?');
        return new ContentItem(C7BY.A0R(strA0S, strA0S, '/'), ContentType.Video.INSTANCE, null, str, null, str3, null, str2, null, false, contentSocialSource, null, null, null, null);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FeedMediaKind.values().length];
            try {
                AnonymousClass005.A0v(FeedMediaKind.IMAGE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(FeedMediaKind.VIDEO, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeedVideoPlaybackState.values().length];
            try {
                AnonymousClass005.A0v(FeedVideoPlaybackState.STOPPED, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(FeedVideoPlaybackState.PAUSED, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(FeedVideoPlaybackState.PLAYING, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedHeroImageAttachment(com.facebook.aura.feed.repo.FeedHeroImageUnit r41, int r42, X.BRg r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedUnitRowKt.FeedHeroImageAttachment(com.facebook.aura.feed.repo.FeedHeroImageUnit, int, X.BRg, X.BFM, int, int):void");
    }

    public static final void FeedHeroImageAttachment$lambda$8(MutableState<BL4> mutableState, long j) {
        mutableState.Af8(new BL4(j));
    }

    /* renamed from: FeedUfiAction-lVb_Clg, reason: not valid java name */
    public static final void m836FeedUfiActionlVb_Clg(int i, String str, long j, Function0<Unit> function0, BRg bRg, Boolean bool, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i2, int i3) {
        BRg bRgA0Y;
        BRg bRgA01;
        BBI bbi;
        boolean z;
        BRg bRg2 = bRg;
        Boolean bool2 = bool;
        String str3 = str2;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        bfm.AgG(-1125530897);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function0);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i5 = i3 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0D |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bool2);
            iA0D |= iA0i;
        }
        int i6 = i3 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0D |= iA0j;
        } else if ((1572864 & i2) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str3);
            iA0D |= iA0j;
        }
        int i7 = i3 & 128;
        int iA0a = 12582912;
        if (i7 != 0) {
            iA0D |= iA0a;
        } else if ((12582912 & i2) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0v2);
            iA0D |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                bool2 = null;
            }
            if (i6 != 0) {
                str3 = null;
            }
            if (i7 != 0) {
                g0v2 = null;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            if (function0 == null) {
                bfm.AgE(119327321);
                bbi = (BBI) bfm;
                z = false;
                BBI.A0R(bbi, false);
                bRgA01 = BRg.A00;
                bRgA0Y = bRgA01;
            } else {
                bfm.AgE(119435294);
                bRgA0Y = BRg.A00;
                BRg bRgA03 = C11U.A03(ufiBounce(bRgA0Y, interfaceC1072AWd, bfm, 54), UfiActionShape);
                C1YD c1yd = new C1YD(0);
                boolean zA67 = bfm.A67(c0dxA0T) | AnonymousClass004.A1M(iA0D);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == obj) {
                    objAaT2 = new FeedUnitRowKt$FeedUfiAction$clickModifier$1$1(c0dxA0T, function0);
                    bfm.Ai0(objAaT2);
                }
                bRgA01 = C0v5.A01(null, interfaceC1072AWd, bRgA03, c1yd, str, (Function0) objAaT2, true);
                bbi = (BBI) bfm;
                z = false;
                BBI.A0R(bbi, false);
            }
            BRg bRgThen = bRg2.then(bRgA01);
            if (bool2 == null) {
                bfm.AgE(696602743);
            } else {
                bfm.AgE(696604085);
                boolean zA1H = AnonymousClass007.A1H(iA0D);
                Object objAaT3 = bfm.AaT();
                if (zA1H || objAaT3 == obj) {
                    objAaT3 = new FeedUnitRowKt$FeedUfiAction$1$1(bool2);
                    bfm.Ai0(objAaT3);
                }
                bRgA0Y = AnonymousClass001.A0Y(bRgA0Y, objAaT3, z);
            }
            BBI.A0R(bbi, z);
            BRg bRgA0B = C3U4.A0B(bRgThen.then(bRgA0Y), UfiHorizontalPadding, UfiVerticalPadding);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, UfiLabelGap);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA012, iA0J);
            if (g0v2 != null) {
                bfm.AgE(525367096);
                AnonymousClass003.A13(bfm, g0v2, iA0D >> 21);
            } else {
                bfm.AgE(525415115);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.X_SMALL, str3 == null ? str : null, j, null, bfm, AnonymousClass001.A0B(iA0D << 6, AnonymousClass001.A03()), 33);
            }
            BBI.A0R(bbi, z);
            if (str3 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, j, AnonymousClass006.A0k(bfm, 525828283).subheadlineMedium, null, null, null, z, z ? 1 : 0, z ? 1 : 0, z ? 1 : 0, null, null, null, bfm, ((iA0D >> 18) & 14) | (iA0D & 896), z ? 1 : 0, 16370);
            } else {
                bfm.AgE(525914959);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FeedUnitRowKt$FeedUfiAction$3(i, str, j, function0, bRg2, bool2, str3, g0v2, i2, i3);
        }
    }

    public static final void FeedUnitAttachment(FeedUnit feedUnit, int i, BRg bRg, BFM bfm, int i2, int i3) {
        ContentItem contentItemM845feedImageContentItemmLhObY;
        BRg bRg2 = bRg;
        bfm.AgG(877904794);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (feedUnit instanceof FeedTextUnit) {
                bfm.AgE(1852921790);
            } else if (feedUnit instanceof FeedHeroImageUnit) {
                bfm.AgE(1852923239);
                FeedHeroImageAttachment((FeedHeroImageUnit) feedUnit, i, bRg2, bfm, iA0d & 1022, 0);
            } else if (feedUnit instanceof FeedCarouselUnit) {
                bfm.AgE(1606357485);
                G0U<FeedTapKind, Unit> g0uRememberFeedTapReporter = FeedTapReportingKt.rememberFeedTapReporter(feedUnit.getId(), bfm, 0);
                AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
                AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120266);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120267);
                boolean zA1K = AnonymousClass003.A1K(bfm, feedUnit.getSocialEmbed(), g0uRememberFeedTapReporter);
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    FeedSocialEmbed socialEmbed = feedUnit.getSocialEmbed();
                    objAaT = socialEmbed != null ? toContentSocialSource(socialEmbed, new FeedUnitRowKt$FeedUnitAttachment$socialSource$1$1(g0uRememberFeedTapReporter)) : null;
                    bfm.Ai0(objAaT);
                }
                ContentSocialSource contentSocialSource = (ContentSocialSource) objAaT;
                boolean zA65 = bfm.A65(AnonymousClass002.A0Y(bfm));
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new BL4(AnonymousClass003.A0N(r1.Abr(CarouselItemSize)));
                    bfm.Ai0(objAaT2);
                }
                long j = ((BL4) objAaT2).A00;
                FeedCarouselUnit feedCarouselUnit = (FeedCarouselUnit) feedUnit;
                boolean zA1W = AnonymousClass002.A1W(bfm, contentSocialSource, AnonymousClass003.A1K(bfm, feedCarouselUnit.attachment.items, abstractC3358CGzA0h), bfm.A64(j));
                Object objAaT3 = bfm.AaT();
                if (zA1W || objAaT3 == C78N.A00) {
                    AHD<FeedCarouselItem> ahd = feedCarouselUnit.attachment.items;
                    ArrayList arrayList = new ArrayList();
                    for (FeedCarouselItem feedCarouselItem : ahd) {
                        String strResolveFeedMediaUrl = FeedMediaUrlKt.resolveFeedMediaUrl(feedCarouselItem.url, abstractC3358CGzA0h);
                        if (strResolveFeedMediaUrl != null) {
                            String strFeedMediaSharedKey = feedMediaSharedKey(feedUnit.getId(), strResolveFeedMediaUrl);
                            int iOrdinal = feedCarouselItem.kind.ordinal();
                            if (iOrdinal == 0) {
                                contentItemM845feedImageContentItemmLhObY = m845feedImageContentItemmLhObY(strResolveFeedMediaUrl, strFeedMediaSharedKey, j, contentSocialSource);
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                String str = feedCarouselItem.posterUrl;
                                contentItemM845feedImageContentItemmLhObY = feedVideoContentItem(strResolveFeedMediaUrl, str != null ? FeedMediaUrlKt.resolveFeedMediaUrl(str, abstractC3358CGzA0h) : null, strFeedMediaSharedKey, contentSocialSource);
                            }
                            arrayList.add(contentItemM845feedImageContentItemmLhObY);
                        }
                    }
                    objAaT3 = AnonymousClass001.A0z(bfm, arrayList);
                }
                AHD ahd2 = (AHD) objAaT3;
                BRg bRgA0C = C3U4.A0C(bRg2, 0.0f, AttachmentTopPadding, 0.0f, 0.0f);
                C1DP c1dp = new C1DP(ContentIndent, 0.0f, AuraDimensKt.SpacingMedium, 0.0f);
                C9m9 c9m9A00 = AcQ.A00(CarouselItemGap);
                boolean zA1X = AnonymousClass005.A1X(bfm, g0uRememberFeedTapReporter, auraNavigatorA0b, AnonymousClass005.A1R(bfm, ahd2, strA012, strA01) | AnonymousClass004.A1F(iA0d), AnonymousClass003.A1C(iA0d));
                Object objAaT4 = bfm.AaT();
                if (zA1X || objAaT4 == C78N.A00) {
                    objAaT4 = new FeedUnitRowKt$FeedUnitAttachment$1$1(ahd2, strA012, strA01, feedUnit, i, g0uRememberFeedTapReporter, auraNavigatorA0b);
                    bfm.Ai0(objAaT4);
                }
                C1YY.A00(null, null, c9m9A00, c1dp, null, bfm, null, bRgA0C, (G0U) objAaT4, RuntimeInternals.IOPRIO_BACKGROUND, 490, false, false);
            } else {
                if (!(feedUnit instanceof FeedWidgetUnit)) {
                    throw AnonymousClass005.A0k(bfm, 1852925728);
                }
                bfm.AgE(1853082832);
                FeedWidgetAttachment((FeedWidgetUnit) feedUnit, bRg2, bfm, (iA0d & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118902(feedUnit, i, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedUnitBody(com.facebook.aura.feed.repo.FeedUnit r30, int r31, X.G0U<? super com.facebook.aura.feed.repo.FeedUnit, kotlin.Unit> r32, X.G0U<? super com.facebook.aura.feed.repo.FeedUnit, kotlin.Unit> r33, X.G0U<? super com.facebook.aura.feed.repo.FeedUnit, kotlin.Unit> r34, X.G0U<? super com.facebook.aura.feed.repo.FeedUnit, kotlin.Unit> r35, X.BRg r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedUnitRowKt.FeedUnitBody(com.facebook.aura.feed.repo.FeedUnit, int, X.G0U, X.G0U, X.G0U, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void FeedUnitGlyph(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BRg bRg2 = bRg;
        bfm.AgG(-1522183744);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str != null) {
                bfm.AgE(-1111093959);
                IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(str, C10G.A07(bRg2, GlyphSize), 0, B18.A02, null, null, bfm, (iA0d & 14) | 3072, 52);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass3 = new C118921(str, str2, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -1110931550);
            BRg bRgA02 = C11U.A02(bRg2, GlyphSize);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA01 = C1b8.A01(bRgA02, AnonymousClass001.A0f(bfm, akh).bubble);
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(-1110794561);
                AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(bRgA01, GlyphIconInset), BOf.A00(bfm, R.drawable.aura_tab_feed_outline_24, 0), AuraIconSize.X_SMALL, null, C06G.A0L(bfm, akh), null, bfm, AnonymousClass001.A04(), 32);
            } else {
                C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -1110523001).title3Medium;
                long jA0C = C06G.A0C(bfm);
                BRg bRgA022 = C10G.A02(C2VU.A09, bRgA01, false);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = FeedUnitRowKt$FeedUnitGlyph$2$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0X(bRgA022, objAaT), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16368);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(str, str2, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedUnitIdeaAction(com.facebook.aura.feed.repo.FeedIdeaAction r21, com.facebook.aura.feed.repo.FeedUnit r22, int r23, X.BRg r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedUnitRowKt.FeedUnitIdeaAction(com.facebook.aura.feed.repo.FeedIdeaAction, com.facebook.aura.feed.repo.FeedUnit, int, X.BRg, X.BFM, int, int):void");
    }

    public static final void FeedUnitKicker(FeedUnit feedUnit, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c118953;
        String str;
        String str2;
        BRg bRg2 = bRg;
        bfm.AgG(886938954);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            G0U<FeedTapKind, Unit> g0uRememberFeedTapReporter = FeedTapReportingKt.rememberFeedTapReporter(feedUnit.getId(), bfm, 0);
            FeedSocialEmbed socialEmbed = feedUnit.getSocialEmbed();
            if (socialEmbed != null) {
                str = socialEmbed.sourceName;
                str2 = socialEmbed.sourceIconUrl;
            } else {
                str = null;
                str2 = null;
            }
            if (C7BY.A0j(feedUnit.getKicker()) && str == null && str2 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c118953 = new C118941(feedUnit, i, bRg2, i2, i3);
                    bBbAAc.A06 = c118953;
                }
                return;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String str3 = socialEmbed != null ? socialEmbed.destinationUrl : null;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120285);
            BRg bRgA03 = C3U4.A03(bRg2, KickerBottomPadding);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, KickerGap);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, i5);
            C90m c90m = C90m.A00;
            String upperCase = feedUnit.getKicker().toUpperCase(Locale.ROOT);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).footnoteEmphasized;
            long jA09 = C06G.A09(bfm);
            BRg bRgA02 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(upperCase, AnonymousClass001.A0O(c90m, bRgA02, true), jA09, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (str3 != null) {
                bfm.AgE(-595499223);
                C1YD c1yd = new C1YD(0);
                boolean zA1U = AnonymousClass005.A1U(bfm, g0uRememberFeedTapReporter, contextA0H, str3, AnonymousClass002.A1W(bfm, str, AnonymousClass001.A1M(iA0d), AnonymousClass001.A1N(iA0d)));
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new FeedUnitRowKt$FeedUnitKicker$2$1$1(g0uRememberFeedTapReporter, contextA0H, str3, feedUnit, i, str);
                    bfm.Ai0(objAaT);
                }
                bRgA02 = C0v5.A02(bRgA02, c1yd, objAaT, strA01);
            } else {
                strA01 = null;
                bfm.AgE(-595592626);
            }
            BBI.A0R(bbi, false);
            SocialSourceIconKt.SocialSourceIcon(str, str2, strA01, bRgA02, bfm, 0, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c118953 = new C118953(feedUnit, i, bRg2, i2, i3);
            bBbAAc.A06 = c118953;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* renamed from: FeedUnitOverflow-jgcpOPg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m837FeedUnitOverflowjgcpOPg(com.facebook.aura.feed.repo.FeedUnit r42, int r43, X.G0U<? super com.facebook.aura.feed.repo.FeedUnit, kotlin.Unit> r44, X.BRg r45, long r46, float r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedUnitRowKt.m837FeedUnitOverflowjgcpOPg(com.facebook.aura.feed.repo.FeedUnit, int, X.G0U, X.BRg, long, float, X.BFM, int, int):void");
    }

    public static final void FeedUnitRow(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, G0U<? super FeedUnit, Unit> g0u2, G0U<? super FeedUnit, Unit> g0u3, G0U<? super FeedUnit, Unit> g0u4, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(feedUnit, 0);
        AnonymousClass005.A16(g0u, g0u2, g0u3, g0u4, 2);
        bfm.AgG(-774283561);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u3);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u4);
        }
        int i4 = i3 & 64;
        if (i4 != 0) {
            iA0d |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            FeedUnitGlyph(feedUnit.getIconUrl(), feedUnit.getEmoji(), C3U4.A0C(BRg.A00, AuraDimensKt.SpacingMedium, 0.0f, 0.0f, 0.0f), bfm, 0, 0);
            FeedUnitBody(feedUnit, i, g0u, g0u2, g0u3, g0u4, c1062ATq, bfm, AnonymousClass004.A03(iA0d, AnonymousClass003.A06(iA0d, (iA0d & 14) | 1572864)), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118962(feedUnit, i, g0u, g0u2, g0u3, g0u4, bRg2, i2, i3);
        }
    }

    public static final void FeedUnitUfi(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, G0U<? super FeedUnit, Unit> g0u2, G0U<? super FeedUnit, Unit> g0u3, G0U<? super FeedUnit, Unit> g0u4, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        AKH<AuraColors> akh;
        long jA0L;
        int i4;
        BRg bRgA0Q = bRg;
        bfm.AgG(-482233183);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u3);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u4);
        }
        if ((i2 & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0t(bfm, z);
        }
        if ((i2 & 12582912) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function0);
        }
        int i5 = i3 & 256;
        int iA0l = 100663296;
        if (i5 != 0) {
            iA0d |= iA0l;
        } else if ((i2 & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRgA0Q);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 38347923, 38347922), bfm, iA0d)) {
            if (i5 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1AC c1ac = C2VU.A04;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u5 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u5);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            float f = UfiHorizontalPadding;
            BRg bRgA012 = AYD.A01(bs0, -f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u5, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            boolean zA1Z = AnonymousClass002.A1Z(feedUnit.getReaction(), FeedReaction.LIKE);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120290);
            if (zA1Z) {
                bfm.AgE(-2083215715);
                akh = AuraColorsKt.LocalAuraColors;
                jA0L = AnonymousClass001.A0f(bfm, akh).link;
            } else {
                bfm.AgE(-2083214844);
                akh = AuraColorsKt.LocalAuraColors;
                jA0L = C06G.A0L(bfm, akh);
            }
            BBI.A0R(bbi, false);
            int i7 = iA0d & 14;
            boolean zA17 = AnonymousClass003.A17(i7) | AnonymousClass004.A1K(iA0d);
            Object objAaT = bfm.AaT();
            if (zA17 || objAaT == C78N.A00) {
                objAaT = new FeedUnitRowKt$FeedUnitUfi$1$1$1$1(g0u, feedUnit);
                bfm.Ai0(objAaT);
            }
            m836FeedUfiActionlVb_Clg(R.drawable.aura_thumbs_up, strA01, jA0L, (Function0) objAaT, null, Boolean.valueOf(zA1Z), null, null, bfm, 0, 208);
            boolean zA1Z2 = AnonymousClass002.A1Z(feedUnit.getReaction(), FeedReaction.DISLIKE);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12028f);
            long j2 = zA1Z2 ? AnonymousClass006.A0i(bfm, akh, -2083203747).link : AnonymousClass006.A0i(bfm, akh, -2083202876).primaryText;
            BBI.A0R(bbi, false);
            boolean zA1E = AnonymousClass003.A1E(iA0d) | AnonymousClass003.A17(i7);
            Object objAaT2 = bfm.AaT();
            if (zA1E || objAaT2 == C78N.A00) {
                objAaT2 = new FeedUnitRowKt$FeedUnitUfi$1$1$2$1(g0u2, feedUnit);
                bfm.Ai0(objAaT2);
            }
            m836FeedUfiActionlVb_Clg(R.drawable.aura_thumbs_down, strA012, j2, (Function0) objAaT2, null, Boolean.valueOf(zA1Z2), null, null, bfm, 0, 208);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12028e);
            long jA0L2 = C06G.A0L(bfm, akh);
            boolean zA1L = AnonymousClass005.A1L(iA0d) | AnonymousClass003.A17(i7);
            Object objAaT3 = bfm.AaT();
            if (zA1L || objAaT3 == C78N.A00) {
                objAaT3 = new FeedUnitRowKt$FeedUnitUfi$1$1$3$1(g0u3, feedUnit);
                bfm.Ai0(objAaT3);
            }
            m836FeedUfiActionlVb_Clg(R.drawable.feed_speech_bubble_outline, strA013, jA0L2, (Function0) objAaT3, null, null, feedUnit.getIdeaAction() == null ? strA013 : null, null, bfm, 0, 176);
            FeedIdeaAction ideaAction = feedUnit.getIdeaAction();
            if (ideaAction == null) {
                bfm.AgE(-153997027);
                BBI.A0R(bbi, false);
                i4 = 8388608;
            } else {
                bfm.AgE(-153997026);
                i4 = 8388608;
                FeedUnitIdeaAction(ideaAction, feedUnit, i, null, bfm, (iA0d << 3) & 1008, 8);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            C01N.A07(bfm, AnonymousClass001.A0O(c90m, bs0, true));
            if (feedUnit.getPostMetadata().getHasContent()) {
                bfm.AgE(1067783899);
                FeedPostMetadata postMetadata = feedUnit.getPostMetadata();
                boolean zA172 = AnonymousClass003.A17(i7) | AnonymousClass003.A1C(iA0d) | ((29360128 & iA0d) == i4);
                Object objAaT4 = bfm.AaT();
                if (zA172 || objAaT4 == C78N.A00) {
                    objAaT4 = new FeedUnitRowKt$FeedUnitUfi$1$2$1(feedUnit, i, function0);
                    bfm.Ai0(objAaT4);
                }
                FeedPostInformationKt.FeedPostInformationButton(postMetadata, z, (Function0) objAaT4, AYD.A01(bs0, f, 0.0f), bfm, ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3072, 0);
            } else {
                bfm.AgE(1068116095);
                m837FeedUnitOverflowjgcpOPg(feedUnit, i, g0u4, AYD.A01(bs0, f, 0.0f), 0L, 0.0f, bfm, i7 | 3072 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0d >> 9) & 896), 48);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118972(feedUnit, i, g0u, g0u2, g0u3, g0u4, z, function0, bRgA0Q, i2, i3);
        }
    }

    /* renamed from: FeedUnitWhyReason-hGBTI10, reason: not valid java name */
    public static final void m838FeedUnitWhyReasonhGBTI10(FeedUnit feedUnit, int i, G0U<? super FeedUnit, Unit> g0u, float f, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA0P = bRg;
        bfm.AgG(893794554);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i4 != 0) {
                bRgA0P = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            BRg bRgA0C = C3U4.A0C(BRg.A00, 0.0f, f, 0.0f, 0.0f);
            C1062ATq c1062ATq = C10G.A02;
            C1b8.A04(bfm, C10G.A04(bRgA0C.then(c1062ATq), WhyReasonDividerThickness), AnonymousClass002.A0c(bfm).border);
            FeedUnitWhyReasonHeader(feedUnit, i, g0u, c1062ATq, bfm, AnonymousClass002.A07(iA0d, (iA0d & 14) | 3072), 0);
            FeedPostInformationKt.FeedPostMetadataContent(feedUnit.getPostMetadata(), C3U4.A0C(c1062ATq, 0.0f, WhyReasonTextTopPadding - WhyReasonHeaderActionOverhang, 0.0f, 0.0f), bfm, 48, 0);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FeedUnitRowKt$FeedUnitWhyReason$2(feedUnit, i, g0u, f, bRgA0P, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedUnitWhyReasonHeader(com.facebook.aura.feed.repo.FeedUnit r31, int r32, X.G0U<? super com.facebook.aura.feed.repo.FeedUnit, kotlin.Unit> r33, X.BRg r34, X.BFM r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedUnitRowKt.FeedUnitWhyReasonHeader(com.facebook.aura.feed.repo.FeedUnit, int, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void FeedVideoAttachment(FeedUnit feedUnit, FeedVideo feedVideo, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c118993;
        float fFloatValue;
        BRg bRg2 = bRg;
        bfm.AgG(919045836);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, feedVideo);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            G0U<FeedTapKind, Unit> g0uRememberFeedTapReporter = FeedTapReportingKt.rememberFeedTapReporter(feedUnit.getId(), bfm, 0);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, feedVideo.url, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = FeedMediaUrlKt.resolveFeedMediaUrl(feedVideo.url, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str = (String) objAaT;
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    c118993 = new FeedUnitRowKt$FeedVideoAttachment$resolvedUrl$2(feedUnit, feedVideo, i, bRg2, i2, i3);
                }
            } else {
                boolean zA65 = bfm.A65(str);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = null;
                    try {
                        objAaT2 = C7Je.A01(str);
                    } catch (SecurityException | UnsupportedOperationException unused) {
                    }
                    bfm.Ai0(objAaT2);
                }
                Uri uri = (Uri) objAaT2;
                if (uri == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        c118993 = new FeedUnitRowKt$FeedVideoAttachment$videoUri$2(feedUnit, feedVideo, i, bRg2, i2, i3);
                    }
                } else {
                    boolean zA1K2 = AnonymousClass003.A1K(bfm, feedVideo.posterUrl, abstractC3358CGzA0h);
                    Object objAaT3 = bfm.AaT();
                    if (zA1K2 || objAaT3 == C78N.A00) {
                        String str2 = feedVideo.posterUrl;
                        objAaT3 = str2 != null ? FeedMediaUrlKt.resolveFeedMediaUrl(str2, abstractC3358CGzA0h) : null;
                        bfm.Ai0(objAaT3);
                    }
                    String str3 = (String) objAaT3;
                    Float f = feedVideo.aspectRatio;
                    if (f == null || f.floatValue() <= 0.0f) {
                        f = null;
                    }
                    AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                    boolean zA1P = AnonymousClass003.A1P(bfm, feedUnit.getSocialEmbed(), g0uRememberFeedTapReporter, bfm.A65(feedUnit.getId()) | AnonymousClass003.A1K(bfm, str, str3));
                    Object objAaT4 = bfm.AaT();
                    if (zA1P || objAaT4 == C78N.A00) {
                        String strFeedMediaSharedKey = feedMediaSharedKey(feedUnit.getId(), str);
                        FeedSocialEmbed socialEmbed = feedUnit.getSocialEmbed();
                        objAaT4 = feedVideoContentItem(str, str3, strFeedMediaSharedKey, socialEmbed != null ? toContentSocialSource(socialEmbed, new FeedUnitRowKt$FeedVideoAttachment$viewerItem$1$1(g0uRememberFeedTapReporter)) : null);
                        bfm.Ai0(objAaT4);
                    }
                    ContentItem contentItem = (ContentItem) objAaT4;
                    String id = feedUnit.getId();
                    int i5 = iA0d & 14;
                    int i6 = iA0d & 896;
                    boolean zA1O = AnonymousClass003.A1O(bfm, auraNavigatorA0b, contentItem, bfm.A65(g0uRememberFeedTapReporter) | AnonymousClass002.A1Q(i5, 4) | AnonymousClass002.A1Q(i6, 256));
                    Object objAaT5 = bfm.AaT();
                    if (zA1O || objAaT5 == C78N.A00) {
                        objAaT5 = new FeedUnitRowKt$FeedVideoAttachment$1$1(g0uRememberFeedTapReporter, feedUnit, i, auraNavigatorA0b, contentItem);
                        bfm.Ai0(objAaT5);
                    }
                    Function0 function0 = (Function0) objAaT5;
                    boolean zA652 = bfm.A65(g0uRememberFeedTapReporter) | AnonymousClass002.A1Q(i5, 4) | AnonymousClass002.A1Q(i6, 256);
                    Object objAaT6 = bfm.AaT();
                    if (zA652 || objAaT6 == C78N.A00) {
                        objAaT6 = new FeedUnitRowKt$FeedVideoAttachment$2$1(g0uRememberFeedTapReporter, feedUnit, i);
                        bfm.Ai0(objAaT6);
                    }
                    G0U g0u = (G0U) objAaT6;
                    BRg bRgUnitInsets = unitInsets(C3U4.A0C(bRg2, 0.0f, AttachmentTopPadding, 0.0f, 0.0f));
                    BRg bRgA0A = C10G.A02;
                    BRg bRgA00 = C10G.A00(C2VU.A02, bRgUnitInsets.then(bRgA0A), false);
                    BS0 bs0 = BRg.A00;
                    if (f != null) {
                        bRgA0A = C10G.A0A(bs0, Float.NaN, MediaMaxHeight);
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 1.7777778f;
                    }
                    FeedVideoMedia(uri, id, str3, function0, g0u, C11U.A03(bRgA00.then(BJe.A00(bRgA0A, fFloatValue, false)), AttachmentShape), bfm, 0, 0);
                }
            }
            bBbAAc.A06 = c118993;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c118993 = new C118993(feedUnit, feedVideo, i, bRg2, i2, i3);
            bBbAAc.A06 = c118993;
        }
    }

    /* renamed from: FeedVideoCornerButton-TN_CM5M, reason: not valid java name */
    public static final void m839FeedVideoCornerButtonTN_CM5M(int i, String str, float f, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1430130212);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A06(bfm, f);
        }
        if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function0);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 9363, 9362), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C1b8.A00(C11U.A03(C3U4.A09(C0v5.A04(C10G.A07(bRg2, VideoCornerControlTouchSize), new C1YD(0), str, function0, true), VideoCornerControlVisualInset), C1D8.A00), 0.5f, B6A.A01), f), BOf.A00(bfm, i, iA0D & 14), AuraIconSize.X_TINY, str, B6A.A08, B18.A02, bfm, (AVy.$stable << 3) | 221568 | ((iA0D << 6) & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FeedUnitRowKt$FeedVideoCornerButton$1(i, str, f, function0, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedVideoMedia(android.net.Uri r55, java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, X.G0U<? super java.lang.Boolean, kotlin.Unit> r59, X.BRg r60, X.BFM r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedUnitRowKt.FeedVideoMedia(android.net.Uri, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void FeedVideoPlayer(Uri uri, String str, FeedVideoPlaybackState feedVideoPlaybackState, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-557856476);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uri) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass005.A0A(bfm, feedVideoPlaybackState);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchVideoPlayer hatchVideoPlayerRememberHatchVideoPlayer = RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.ALL, z, false, bfm, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 4);
            boolean zA1S = AnonymousClass001.A1S(bfm, hatchVideoPlayerRememberHatchVideoPlayer, (iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new FeedUnitRowKt$FeedVideoPlayer$1$1(feedVideoPlaybackState, hatchVideoPlayerRememberHatchVideoPlayer, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, feedVideoPlaybackState);
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(bRg2, uri, hatchVideoPlayerRememberHatchVideoPlayer, str, null, null, false, true, !z, false, false, false, HatchVideoPlayer.ResizeMode.ZOOM, 0.0f, FeedVideoSurfaceTag, null, false, false, false, null, false, null, null, null, function0, null, null, bfm, ((iA0T >> 15) & 14) | 12582912 | ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0T << 6) & 7168), 24966, iA0T & 57344, 117418608);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119012(uri, str, feedVideoPlaybackState, z, function0, bRg2, i, i2);
        }
    }

    public static final void FeedWidgetAttachment(FeedWidgetUnit feedWidgetUnit, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1612898075);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, feedWidgetUnit) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = {feedWidgetUnit.getId()};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = FeedUnitRowKt$FeedWidgetAttachment$cachedHeightPx$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            String id = feedWidgetUnit.getId();
            String str = feedWidgetUnit.attachment.html;
            JSONState jSONState = new JSONState(0L, (JsonObject) null, 3, (C06H) null);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = FeedUnitRowKt$FeedWidgetAttachment$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            int iA02 = MutableState.A02(mutableStateA0N);
            boolean zA65 = bfm.A65(mutableStateA0N);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new FeedUnitRowKt$FeedWidgetAttachment$2$1(mutableStateA0N);
                bfm.Ai0(objAaT3);
            }
            HatchWidgetWebViewKt.m689HatchWidgetWebView0jEhg8(id, "html", str, jSONState, g0u, null, null, null, iA02, (G0U) objAaT3, null, null, unitInsets(C3U4.A04(bRg2, AttachmentTopPadding)), bfm, (JSONState.$stable << 9) | 24624, 0, 3296);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119023(feedWidgetUnit, bRg2, i, i2);
        }
    }

    public static final String feedLinkType(String str) {
        String strA0u = AnonymousClass001.A0u(C7BY.A0S(str, "", HatchMapSceneKt.ARTIFACT_ID_SEPARATOR));
        if (strA0u.equals(AuraDeeplinkHandlerActivity.HTTP) || strA0u.equals("https")) {
            return "web";
        }
        if (strA0u.equals("sandbox") && AnonymousClass005.A1a(C7BY.A0K(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, str), "workspace/")) {
            return "workspace";
        }
        return null;
    }

    public static final String feedMediaSharedKey(String str, String str2) {
        return FGI.A0d("feed_media_", str, "_", C7BY.A0S(str2, str2, '?'));
    }

    public static final void logFeedUnitClick(HatchComponent hatchComponent, FeedUnit feedUnit, int i) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.FEED, HatchSubsurface.FEED_WIDGET, HatchScreen.FEED_HOME, hatchComponent, null, feedCardLogMetadata(feedUnit, i), null);
    }

    public static final void openExternalUri(Context context, String str) {
        openFeedLink(new C119031(context, str));
    }

    public static final ContentSocialSource toContentSocialSource(FeedSocialEmbed feedSocialEmbed, Function0<Unit> function0) {
        return new ContentSocialSource(feedSocialEmbed.destinationUrl, feedSocialEmbed.author, feedSocialEmbed.sourceName, feedSocialEmbed.sourceIconUrl, function0);
    }

    public static final BRg ufiBounce(BRg bRg, InterfaceC1072AWd interfaceC1072AWd, BFM bfm, int i) {
        C1BO c1boA01 = C31t.A01(new C1003AOr(null, 0.5f, 400.0f), bfm, C1BO.A0F(C0eO.A00(interfaceC1072AWd, bfm, (i >> 3) & 14)) ? 0.82f : 1.0f, 3120, 20);
        boolean zA65 = bfm.A65(c1boA01);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new FeedUnitRowKt$ufiBounce$1$1(c1boA01);
            bfm.Ai0(objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }

    public static final BRg unitInsets(BRg bRg) {
        return C3U4.A0C(bRg, ContentIndent, 0.0f, AuraDimensKt.SpacingMedium, 0.0f);
    }

    public static final long FeedHeroImageAttachment$lambda$7(MutableState<BL4> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final void FeedVideoControlButton(int i, BRg bRg, BFM bfm, int i2, int i3) {
        bfm.AgG(-636353721);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(C1b8.A00(C11U.A03(bRg, C1D8.A00), 0.7f, B6A.A08), BOf.A00(bfm, i, iA0D & 14), AuraIconSize.SMALL, null, B6A.A01, B18.A04, bfm, (AVy.$stable << 3) | 224640, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119001(i, bRg, i2, i3);
        }
    }

    public static final /* synthetic */ FeedVideoPlaybackState access$FeedVideoMedia$lambda$1(MutableState mutableState) {
        return (FeedVideoPlaybackState) mutableState.getValue();
    }

    public static final void openFeedLink(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (ActivityNotFoundException | IllegalArgumentException | SecurityException unused) {
            ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f1206c1);
        }
    }

    public static final void startExternalUriActivity(Context context, String str) {
        C7mU.A00().A04().A05(context, new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }
}
