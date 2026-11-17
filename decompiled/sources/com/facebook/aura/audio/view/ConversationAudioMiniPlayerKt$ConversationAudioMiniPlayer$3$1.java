package com.facebook.aura.audio.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BHP;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import com.facebook.common.callercontext.ContextChain;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$3$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;
    public final /* synthetic */ String $dismissLabel;

    /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends Function0<Unit>> c1bo) {
            super(0);
            this.$currentOnDismiss$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            C1BO<Function0<Unit>> c1bo = this.$currentOnDismiss$delegate;
            ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
            C1BO.A0D(c1bo);
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0C(interfaceC0857A6e, Collections.singletonList(new BHP(this.$dismissLabel, new AnonymousClass1(this.$currentOnDismiss$delegate))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$3$1(String str, C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$dismissLabel = str;
        this.$currentOnDismiss$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
