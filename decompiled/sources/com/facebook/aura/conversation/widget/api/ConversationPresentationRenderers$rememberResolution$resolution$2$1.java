package com.facebook.aura.conversation.widget.api;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.InterfaceC05161qu;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.widget.api.ConversationPresentationResolution;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.memory.AuraByteLruCache;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.JSONState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.widget.api.ConversationPresentationRenderers$rememberResolution$resolution$2$1", f = "ConversationPresentationRenderer.kt", l = {93}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConversationPresentationRenderers$rememberResolution$resolution$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<ConversationPresentationResolution>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HxE<String, JSONState> $key;
    public final /* synthetic */ HatchWidgetPresentation $presentation;
    public final /* synthetic */ AuraByteLruCache<HxE<String, JSONState>, ConversationPresentationResolution> $resolutions;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.conversation.widget.api.ConversationPresentationRenderers$rememberResolution$resolution$2$1$1", f = "ConversationPresentationRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.widget.api.ConversationPresentationRenderers$rememberResolution$resolution$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConversationPresentationResolution>, Object> {
        public final /* synthetic */ HatchWidgetPresentation $presentation;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchWidgetPresentation hatchWidgetPresentation, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$presentation = hatchWidgetPresentation;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$presentation, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            ConversationPresentationContent conversationPresentationContentContentFor = ConversationPresentationRenderers.INSTANCE.contentFor(this.$presentation);
            return conversationPresentationContentContentFor != null ? new ConversationPresentationResolution.Ready(conversationPresentationContentContentFor) : ConversationPresentationResolution.FileCard.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConversationPresentationResolution> htJ) {
            return new AnonymousClass1(this.$presentation, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationPresentationRenderers$rememberResolution$resolution$2$1(AuraByteLruCache<HxE<String, JSONState>, ConversationPresentationResolution> auraByteLruCache, HxE<String, JSONState> hxE, HatchWidgetPresentation hatchWidgetPresentation, HtJ<? super ConversationPresentationRenderers$rememberResolution$resolution$2$1> htJ) {
        super(2, htJ);
        this.$resolutions = auraByteLruCache;
        this.$key = hxE;
        this.$presentation = hatchWidgetPresentation;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ConversationPresentationRenderers$rememberResolution$resolution$2$1 conversationPresentationRenderers$rememberResolution$resolution$2$1 = new ConversationPresentationRenderers$rememberResolution$resolution$2$1(this.$resolutions, this.$key, this.$presentation, htJ);
        conversationPresentationRenderers$rememberResolution$resolution$2$1.L$0 = obj;
        return conversationPresentationRenderers$rememberResolution$resolution$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            obj = this.$resolutions.get(this.$key);
            if (obj == null) {
                C78T c78tM764default = AuraDispatchers.INSTANCE.m764default();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$presentation, null);
                this.L$0 = null;
                this.L$1 = mutableState;
                this.label = 1;
                obj = GAo.A00(this, c78tM764default, anonymousClass1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            mutableState.Af8(obj);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$1;
        Hwg.A00(obj);
        this.$resolutions.put(this.$key, obj);
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<ConversationPresentationResolution> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((ConversationPresentationRenderers$rememberResolution$resolution$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
