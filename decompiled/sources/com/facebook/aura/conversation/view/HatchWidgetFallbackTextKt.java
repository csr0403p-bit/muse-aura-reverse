package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C06G;
import X.FGI;
import X.G0V;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchWidgetFallbackTextKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchWidgetFallbackTextKt$HatchWidgetFallbackText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;
        public final /* synthetic */ String $widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, String str2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$widgetId = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(this.$text, this.$modifier, HatchMessageBubbleKt.getHatchBubbleBodyTextStyle(bfm, 0), false, null, FGI.A0M("widget_fallback:", this.$widgetId), new B6A(C06G.A07(bfm)), null, null, false, false, null, bfm, 0, 0, 3992);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchWidgetFallbackTextKt$HatchWidgetFallbackText$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageVersion;
        public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;
        public final /* synthetic */ String $widgetId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, String str3, BRg bRg, InlineContentCallbacks inlineContentCallbacks, int i, int i2) {
            super(2);
            this.$text = str;
            this.$widgetId = str2;
            this.$imageVersion = str3;
            this.$modifier = bRg;
            this.$inlineContentCallbacks = inlineContentCallbacks;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWidgetFallbackTextKt.HatchWidgetFallbackText(this.$text, this.$widgetId, this.$imageVersion, this.$modifier, this.$inlineContentCallbacks, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchWidgetFallbackText(java.lang.String r24, java.lang.String r25, java.lang.String r26, X.BRg r27, com.facebook.aura.conversation.view.InlineContentCallbacks r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchWidgetFallbackTextKt.HatchWidgetFallbackText(java.lang.String, java.lang.String, java.lang.String, X.BRg, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BFM, int, int):void");
    }
}
