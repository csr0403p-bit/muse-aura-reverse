package com.facebook.aura.partners.voice.chrome;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C1BO;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContext;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1", f = "VoiceConversationPresentationAction.kt", l = {73}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C1BO<ConversationPresentationActionContext> $currentContext$delegate;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<ConversationPresentationActionContext> $currentContext$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1BO<ConversationPresentationActionContext> c1bo) {
            super(0);
            this.$currentContext$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$currentContext$delegate.getValue().isConnected);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1$2", f = "VoiceConversationPresentationAction.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1(C1BO<ConversationPresentationActionContext> c1bo, HtJ<? super VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1> htJ) {
        super(2, htJ);
        this.$currentContext$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1(this.$currentContext$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$currentContext$delegate));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass2, c05663ulA01);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new VoiceConversationPresentationAction$rememberAction$1$1$1$connected$1(this.$currentContext$delegate, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
