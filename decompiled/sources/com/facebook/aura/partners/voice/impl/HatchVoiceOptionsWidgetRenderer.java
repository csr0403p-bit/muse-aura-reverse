package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchVoiceOptionsWidgetRenderer implements ConversationWidgetRenderer {
    public static final HatchVoiceOptionsWidgetRenderer INSTANCE = new HatchVoiceOptionsWidgetRenderer();

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceOptionsWidgetRenderer$Render$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationWidgetContext $context;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, int i) {
            super(2);
            this.$widget = hatchWidget;
            this.$context = conversationWidgetContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetRenderer.this.Render(this.$widget, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceOptionsWidgetRenderer$Render$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConversationWidgetContext $context;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, int i) {
            super(2);
            this.$widget = hatchWidget;
            this.$context = conversationWidgetContext;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceOptionsWidgetRenderer.this.Render(this.$widget, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    public boolean canRender(HatchWidget hatchWidget) {
        C7384Etj.A0Y(hatchWidget, 0);
        return hatchWidget.data instanceof VoiceOptionsWidgetData;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    @Override // com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Render(com.facebook.aura.model.HatchWidget r23, com.facebook.aura.conversation.widget.api.ConversationWidgetContext r24, X.BRg r25, X.BFM r26, int r27) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.impl.HatchVoiceOptionsWidgetRenderer.Render(com.facebook.aura.model.HatchWidget, com.facebook.aura.conversation.widget.api.ConversationWidgetContext, X.BRg, X.BFM, int):void");
    }
}
