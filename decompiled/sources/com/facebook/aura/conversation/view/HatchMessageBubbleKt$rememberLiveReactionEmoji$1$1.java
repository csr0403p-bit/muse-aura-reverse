package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.HatchReactionLanding;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1", f = "HatchMessageBubble.kt", l = {492}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C22I<HatchReactionLanding> $landed;
    public final /* synthetic */ MutableState<String> $liveEmoji$delegate;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ String $serverMessageId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1(C22I<HatchReactionLanding> c22i, String str, String str2, MutableState<String> mutableState, HtJ<? super HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1> htJ) {
        super(2, htJ);
        this.$landed = c22i;
        this.$messageId = str;
        this.$serverMessageId = str2;
        this.$liveEmoji$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1(this.$landed, this.$messageId, this.$serverMessageId, this.$liveEmoji$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchReactionLanding> c22i = this.$landed;
            final String str = this.$messageId;
            final String str2 = this.$serverMessageId;
            final MutableState<String> mutableState = this.$liveEmoji$delegate;
            C20Z<? super HatchReactionLanding> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchReactionLanding) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HatchReactionLanding hatchReactionLanding, HtJ<? super Unit> htJ) {
                    if (HatchMessageBubbleKt.landingMatchesMessage(hatchReactionLanding.messageId, str, str2)) {
                        mutableState.Af8(hatchReactionLanding.emoji);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageBubbleKt$rememberLiveReactionEmoji$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
