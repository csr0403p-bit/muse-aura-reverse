package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1V;
import X.B6A;
import X.BFM;
import X.C1822Arm;
import X.C78N;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.markdown.render.AuraMarkdownDefaults;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageContent$textContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ B6A $inlineCodeBackground;
    public final /* synthetic */ B6A $linkColor;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
    public final /* synthetic */ G0V<String, String, Unit> $onSlidesClick;
    public final /* synthetic */ Function0<Unit> $onTextRevealCompleted;
    public final /* synthetic */ G0U<String, Unit> $onUrlClick;
    public final /* synthetic */ MutableState<String> $phoneNumberForAction$delegate;
    public final /* synthetic */ boolean $reflowSoftLineBreaks;
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ boolean $shouldAnimateText;
    public final /* synthetic */ String $streamingRevealKey;
    public final /* synthetic */ C1822Arm $textStyle;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$HatchMessageContent$textContent$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ B6A $inlineCodeBackground;
        public final /* synthetic */ B6A $linkColor;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
        public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
        public final /* synthetic */ G0V<String, String, Unit> $onSlidesClick;
        public final /* synthetic */ Function0<Unit> $onTextRevealCompleted;
        public final /* synthetic */ G0U<String, Unit> $onUrlClick;
        public final /* synthetic */ MutableState<String> $phoneNumberForAction$delegate;
        public final /* synthetic */ boolean $reflowSoftLineBreaks;
        public final /* synthetic */ String $sharedElementKeyPrefix;
        public final /* synthetic */ boolean $shouldAnimateText;
        public final /* synthetic */ String $streamingRevealKey;
        public final /* synthetic */ C1822Arm $textStyle;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$HatchMessageContent$textContent$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ B6A $inlineCodeBackground;
            public final /* synthetic */ B6A $linkColor;
            public final /* synthetic */ HatchMessageUiModel $message;
            public final /* synthetic */ Function0<Unit> $onTextRevealCompleted;
            public final /* synthetic */ boolean $reflowSoftLineBreaks;
            public final /* synthetic */ boolean $shouldAnimateText;
            public final /* synthetic */ String $streamingRevealKey;
            public final /* synthetic */ C1822Arm $textStyle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchMessageUiModel hatchMessageUiModel, C1822Arm c1822Arm, boolean z, String str, B6A b6a, B6A b6a2, boolean z2, Function0<Unit> function0) {
                super(2);
                this.$message = hatchMessageUiModel;
                this.$textStyle = c1822Arm;
                this.$reflowSoftLineBreaks = z;
                this.$streamingRevealKey = str;
                this.$linkColor = b6a;
                this.$inlineCodeBackground = b6a2;
                this.$shouldAnimateText = z2;
                this.$onTextRevealCompleted = function0;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    if (this.$message.isStreamingUserMessage) {
                        bfm.AgE(-399806733);
                        String str = this.$message.content;
                        boolean zA65 = bfm.A65(this.$textStyle);
                        C1822Arm c1822Arm = this.$textStyle;
                        Object objAaT = bfm.AaT();
                        if (zA65 || objAaT == C78N.A00) {
                            objAaT = AuraMarkdownDefaults.INSTANCE.bodyTextStyle(c1822Arm);
                            bfm.Ai0(objAaT);
                        }
                        HatchStreamingUserMessageTextKt.HatchStreamingUserMessageText(str, (C1822Arm) objAaT, this.$reflowSoftLineBreaks, null, bfm, 0, 8);
                    } else {
                        bfm.AgE(-399524013);
                        HatchMessageUiModel hatchMessageUiModel = this.$message;
                        AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(hatchMessageUiModel.content, null, this.$textStyle, hatchMessageUiModel.isStreaming, this.$streamingRevealKey, null, this.$linkColor, null, this.$inlineCodeBackground, this.$reflowSoftLineBreaks, this.$shouldAnimateText, this.$onTextRevealCompleted, bfm, 12582912, 0, 34);
                    }
                    AnonymousClass002.A19(bfm);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchMessageUiModel hatchMessageUiModel, G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0U<? super String, Unit> g0u, String str, G0U<? super String, Unit> g0u2, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, G0V<? super String, ? super String, Unit> g0v6, MutableState<String> mutableState, C1822Arm c1822Arm, boolean z, String str2, B6A b6a, B6A b6a2, boolean z2, Function0<Unit> function0) {
            super(2);
            this.$message = hatchMessageUiModel;
            this.$onInlineImageClick = g0v;
            this.$onInlineImageGridClick = g0v2;
            this.$onInlineFileClick = g0v3;
            this.$onInlineSlidesClick = g0v4;
            this.$onInlineVideoClick = g0v5;
            this.$onImageError = g0u;
            this.$sharedElementKeyPrefix = str;
            this.$onUrlClick = g0u2;
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$onSlidesClick = g0v6;
            this.$phoneNumberForAction$delegate = mutableState;
            this.$textStyle = c1822Arm;
            this.$reflowSoftLineBreaks = z;
            this.$streamingRevealKey = str2;
            this.$linkColor = b6a;
            this.$inlineCodeBackground = b6a2;
            this.$shouldAnimateText = z2;
            this.$onTextRevealCompleted = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchMessageUiModel hatchMessageUiModel = this.$message;
                boolean z = hatchMessageUiModel.isStreaming;
                String str = hatchMessageUiModel.id;
                G0V<String, String, Unit> g0v = this.$onInlineImageClick;
                G0V<AHD<HatchInlineImageData>, Integer, Unit> g0v2 = this.$onInlineImageGridClick;
                G0V<String, String, Unit> g0v3 = this.$onInlineFileClick;
                G0V<String, String, Unit> g0v4 = this.$onInlineSlidesClick;
                G0V<String, String, Unit> g0v5 = this.$onInlineVideoClick;
                G0U<String, Unit> g0u = this.$onImageError;
                String str2 = this.$sharedElementKeyPrefix;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onSlidesClick, AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$userSession, AnonymousClass001.A1T(bfm, this.$message, bfm.A65(this.$onUrlClick))))));
                G0U<String, Unit> g0u2 = this.$onUrlClick;
                HatchMessageUiModel hatchMessageUiModel2 = this.$message;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Context context = this.$context;
                AuraNavigator auraNavigator = this.$navigator;
                G0V<String, String, Unit> g0v6 = this.$onSlidesClick;
                MutableState<String> mutableState = this.$phoneNumberForAction$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchMessageBubbleContentKt$HatchMessageContent$textContent$1$1$1$1(g0u2, hatchMessageUiModel2, abstractC3358CGz, context, auraNavigator, g0v6, mutableState);
                    bfm.Ai0(objAaT);
                }
                HatchAuraMarkdownProvidersKt.HatchAuraMarkdownProviders(null, g0v, g0v2, g0v3, g0v4, g0v5, null, g0u, str2, str, z, null, (G0U) objAaT, B1V.A00(bfm, new AnonymousClass2(this.$message, this.$textStyle, this.$reflowSoftLineBreaks, this.$streamingRevealKey, this.$linkColor, this.$inlineCodeBackground, this.$shouldAnimateText, this.$onTextRevealCompleted), -743642079), bfm, 0, 3072, 2113);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageContent$textContent$1(HatchMessageUiModel hatchMessageUiModel, G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0U<? super String, Unit> g0u, String str, G0U<? super String, Unit> g0u2, AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, G0V<? super String, ? super String, Unit> g0v6, MutableState<String> mutableState, C1822Arm c1822Arm, boolean z, String str2, B6A b6a, B6A b6a2, boolean z2, Function0<Unit> function0) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$onInlineImageClick = g0v;
        this.$onInlineImageGridClick = g0v2;
        this.$onInlineFileClick = g0v3;
        this.$onInlineSlidesClick = g0v4;
        this.$onInlineVideoClick = g0v5;
        this.$onImageError = g0u;
        this.$sharedElementKeyPrefix = str;
        this.$onUrlClick = g0u2;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$onSlidesClick = g0v6;
        this.$phoneNumberForAction$delegate = mutableState;
        this.$textStyle = c1822Arm;
        this.$reflowSoftLineBreaks = z;
        this.$streamingRevealKey = str2;
        this.$linkColor = b6a;
        this.$inlineCodeBackground = b6a2;
        this.$shouldAnimateText = z2;
        this.$onTextRevealCompleted = function0;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            HatchMessageBubbleContentKt.HatchMessageEntityProviders(hatchMessageUiModel, B1V.A00(bfm, new AnonymousClass1(hatchMessageUiModel, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onImageError, this.$sharedElementKeyPrefix, this.$onUrlClick, this.$userSession, this.$context, this.$navigator, this.$onSlidesClick, this.$phoneNumberForAction$delegate, this.$textStyle, this.$reflowSoftLineBreaks, this.$streamingRevealKey, this.$linkColor, this.$inlineCodeBackground, this.$shouldAnimateText, this.$onTextRevealCompleted), -1730806952), bfm, HatchMessageUiModel.$stable | 48);
        } else {
            bfm.Afo();
        }
    }
}
