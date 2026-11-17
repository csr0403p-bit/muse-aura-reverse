package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C3TQ;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.G2k;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.audio.podcast.PodcastPresentationResolver;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt;
import com.facebook.aura.conversation.view.richcontent.MessageSenderSemanticsKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageContent$richContentBody$1 extends AbstractC7559F3s implements G2j<BRg, Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ String $attachmentSender;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ B6A $inlineCodeBackground;
    public final /* synthetic */ B6A $linkColor;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ Function0<Unit> $onBubbleTap;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ G0V<String, String, Unit> $onSlidesClick;
    public final /* synthetic */ Function0<Unit> $onTextRevealCompleted;
    public final /* synthetic */ G0U<String, Unit> $onUrlClick;
    public final /* synthetic */ MutableState<String> $phoneNumberForAction$delegate;
    public final /* synthetic */ boolean $reflowSoftLineBreaks;
    public final /* synthetic */ AHD<HatchContentViewModelData> $richContent;
    public final /* synthetic */ String $sender;
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ boolean $shouldAnimateText;
    public final /* synthetic */ String $streamingRevealKey;
    public final /* synthetic */ C1822Arm $textStyle;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$HatchMessageContent$richContentBody$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $attachmentSender;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ B6A $inlineCodeBackground;
        public final /* synthetic */ B6A $linkColor;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
        public final /* synthetic */ Function0<Unit> $onBubbleTap;
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
        public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0V<String, String, Unit> $onSlidesClick;
        public final /* synthetic */ Function0<Unit> $onTextRevealCompleted;
        public final /* synthetic */ G0U<String, Unit> $onUrlClick;
        public final /* synthetic */ MutableState<String> $phoneNumberForAction$delegate;
        public final /* synthetic */ boolean $reflowSoftLineBreaks;
        public final /* synthetic */ AHD<HatchContentViewModelData> $richContent;
        public final /* synthetic */ boolean $selectionEnabled;
        public final /* synthetic */ BRg $selectionModifier;
        public final /* synthetic */ String $sender;
        public final /* synthetic */ String $sharedElementKeyPrefix;
        public final /* synthetic */ boolean $shouldAnimateText;
        public final /* synthetic */ String $streamingRevealKey;
        public final /* synthetic */ C1822Arm $textStyle;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$HatchMessageContent$richContentBody$1$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G2k<String, String, BRg, BFM, Integer, Unit> {
            public final /* synthetic */ HatchMessageUiModel $message;

            public final void invoke(String str, String str2, BRg bRg, BFM bfm, int i) {
                AnonymousClass005.A0x(str, str2, bRg);
                int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
                if ((i & 48) == 0) {
                    iA0d |= AnonymousClass004.A0e(bfm, str2);
                }
                if ((i & 384) == 0) {
                    iA0d |= AnonymousClass004.A0f(bfm, bRg);
                }
                if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
                    HatchInlineAudioPlayerKt.m624HatchInlineAudioPlayerFItCLgY(str, str2, null, null, null, this.$message.id, PodcastPresentationResolver.INSTANCE.isPodcastPath(str) ? "podcast" : this.$message.role == HatchMessageRole.USER ? "voice_note" : "audio", bRg, 0L, null, bfm, AnonymousClass001.A0C(iA0d << 15, iA0d & 126), 796);
                } else {
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(HatchMessageUiModel hatchMessageUiModel) {
                super(5);
                this.$message = hatchMessageUiModel;
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, BRg bRg, BFM bfm, Integer num) {
                invoke(str, str2, bRg, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<? extends HatchContentViewModelData> ahd, HatchMessageUiModel hatchMessageUiModel, BRg bRg, String str, G0U<? super String, Unit> g0u, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function0, BRg bRg2, boolean z, boolean z2, C1822Arm c1822Arm, B6A b6a, B6A b6a2, boolean z3, String str2, Function0<Unit> function02, G0V<? super String, ? super String, Unit> g0v2, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u2, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0V<? super String, ? super String, Unit> g0v6, G0U<? super HatchContentViewModelData, Unit> g0u3, G0U<? super String, Unit> g0u4, String str3, String str4, MutableState<String> mutableState) {
            super(2);
            this.$richContent = ahd;
            this.$message = hatchMessageUiModel;
            this.$modifier = bRg;
            this.$sender = str;
            this.$onUrlClick = g0u;
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$onSlidesClick = g0v;
            this.$onBubbleTap = function0;
            this.$selectionModifier = bRg2;
            this.$selectionEnabled = z;
            this.$shouldAnimateText = z2;
            this.$textStyle = c1822Arm;
            this.$linkColor = b6a;
            this.$inlineCodeBackground = b6a2;
            this.$reflowSoftLineBreaks = z3;
            this.$streamingRevealKey = str2;
            this.$onTextRevealCompleted = function02;
            this.$onInlineImageClick = g0v2;
            this.$onInlineImageGridClick = g0v3;
            this.$onImageError = g0u2;
            this.$onInlineFileClick = g0v4;
            this.$onInlineSlidesClick = g0v5;
            this.$onInlineVideoClick = g0v6;
            this.$onRichFormatOpenCTAClick = g0u3;
            this.$onArtifactVisible = g0u4;
            this.$sharedElementKeyPrefix = str3;
            this.$attachmentSender = str4;
            this.$phoneNumberForAction$delegate = mutableState;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AHD<HatchContentViewModelData> ahd = this.$richContent;
                HatchMessageUiModel hatchMessageUiModel = this.$message;
                boolean z = hatchMessageUiModel.isStreaming;
                String str = hatchMessageUiModel.id;
                BRg bRgMessageSenderSemantics = MessageSenderSemanticsKt.messageSenderSemantics(this.$modifier, this.$sender);
                String strA0M = FGI.A0M(this.$message.id, "_");
                C3TQ c3tq = HatchMessageBubbleKt.BubbleInnerPadding;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onSlidesClick, AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$userSession, AnonymousClass001.A1T(bfm, this.$message, bfm.A65(this.$onUrlClick))))));
                G0U<String, Unit> g0u = this.$onUrlClick;
                HatchMessageUiModel hatchMessageUiModel2 = this.$message;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Context context = this.$context;
                AuraNavigator auraNavigator = this.$navigator;
                G0V<String, String, Unit> g0v = this.$onSlidesClick;
                MutableState<String> mutableState = this.$phoneNumberForAction$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchMessageBubbleContentKt$HatchMessageContent$richContentBody$1$1$1$1(g0u, hatchMessageUiModel2, abstractC3358CGz, context, auraNavigator, g0v, mutableState);
                    bfm.Ai0(objAaT);
                }
                G0V g0v2 = (G0V) objAaT;
                Function0<Unit> function0 = this.$onBubbleTap;
                BRg bRg = this.$selectionModifier;
                boolean z2 = this.$selectionEnabled;
                boolean z3 = this.$shouldAnimateText;
                C1822Arm c1822Arm = this.$textStyle;
                B6A b6a = this.$linkColor;
                B6A b6a2 = this.$inlineCodeBackground;
                boolean z4 = this.$reflowSoftLineBreaks;
                String str2 = this.$streamingRevealKey;
                Function0<Unit> function02 = this.$onTextRevealCompleted;
                boolean zA67 = bfm.A67(this.$context);
                Context context2 = this.$context;
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchMessageBubbleContentKt$HatchMessageContent$richContentBody$1$1$2$1(context2);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u2 = (G0U) objAaT2;
                boolean zA672 = bfm.A67(this.$context);
                Context context3 = this.$context;
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchMessageBubbleContentKt$HatchMessageContent$richContentBody$1$1$3$1(context3);
                    bfm.Ai0(objAaT3);
                }
                HatchRichResponseContentKt.m685HatchRichResponseContentXdLsqko(ahd, g0v2, bRgMessageSenderSemantics, function0, bRg, z2, z3, c1822Arm, b6a, null, b6a2, z4, str, str2, function02, 0, 0, false, false, false, g0u2, (G0U) objAaT3, true, false, strA0M, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onImageError, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onRichFormatOpenCTAClick, B1V.A00(bfm, new AnonymousClass4(this.$message), 693940486), this.$onArtifactVisible, this.$sharedElementKeyPrefix, this.$attachmentSender, z, c3tq, ComposableSingletons$HatchMessageBubbleContentKt.f29lambda$157773351, bfm, 805306368, 0, 3456, 100663680, 1015808, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageContent$richContentBody$1(HatchMessageUiModel hatchMessageUiModel, AHD<? extends HatchContentViewModelData> ahd, BRg bRg, String str, G0U<? super String, Unit> g0u, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function0, boolean z, C1822Arm c1822Arm, B6A b6a, B6A b6a2, boolean z2, String str2, Function0<Unit> function02, G0V<? super String, ? super String, Unit> g0v2, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u2, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0V<? super String, ? super String, Unit> g0v6, G0U<? super HatchContentViewModelData, Unit> g0u3, G0U<? super String, Unit> g0u4, String str3, String str4, MutableState<String> mutableState) {
        super(4);
        this.$message = hatchMessageUiModel;
        this.$richContent = ahd;
        this.$modifier = bRg;
        this.$sender = str;
        this.$onUrlClick = g0u;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$onSlidesClick = g0v;
        this.$onBubbleTap = function0;
        this.$shouldAnimateText = z;
        this.$textStyle = c1822Arm;
        this.$linkColor = b6a;
        this.$inlineCodeBackground = b6a2;
        this.$reflowSoftLineBreaks = z2;
        this.$streamingRevealKey = str2;
        this.$onTextRevealCompleted = function02;
        this.$onInlineImageClick = g0v2;
        this.$onInlineImageGridClick = g0v3;
        this.$onImageError = g0u2;
        this.$onInlineFileClick = g0v4;
        this.$onInlineSlidesClick = g0v5;
        this.$onInlineVideoClick = g0v6;
        this.$onRichFormatOpenCTAClick = g0u3;
        this.$onArtifactVisible = g0u4;
        this.$sharedElementKeyPrefix = str3;
        this.$attachmentSender = str4;
        this.$phoneNumberForAction$delegate = mutableState;
    }

    public final void invoke(BRg bRg, boolean z, BFM bfm, int i) {
        int iA0d = AnonymousClass002.A0B(bRg, i) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            bfm.Afo();
        } else {
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            HatchMessageBubbleContentKt.HatchMessageEntityProviders(hatchMessageUiModel, B1V.A00(bfm, new AnonymousClass1(this.$richContent, hatchMessageUiModel, this.$modifier, this.$sender, this.$onUrlClick, this.$userSession, this.$context, this.$navigator, this.$onSlidesClick, this.$onBubbleTap, bRg, z, this.$shouldAnimateText, this.$textStyle, this.$linkColor, this.$inlineCodeBackground, this.$reflowSoftLineBreaks, this.$streamingRevealKey, this.$onTextRevealCompleted, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onImageError, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$sharedElementKeyPrefix, this.$attachmentSender, this.$phoneNumberForAction$delegate), 1945341757), bfm, HatchMessageUiModel.$stable | 48);
        }
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Boolean bool, BFM bfm, Integer num) {
        invoke(bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
