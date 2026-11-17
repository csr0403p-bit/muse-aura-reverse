package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$9$1", f = "HatchConversation.kt", l = {346}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$9$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ConversationAudioPlayback $audio;
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ C1BO<G0V<String, String, Unit>> $currentOnJumpToAudioSource$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentRequestBottomFollow$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ C20Q<Unit> $tabReselectedFlow;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$9$1(C20Q<Unit> c20q, ConversationAudioPlayback conversationAudioPlayback, LazyListState lazyListState, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, MutableState<Boolean> mutableState, C1BO<? extends G0V<? super String, ? super String, Unit>> c1bo3, HtJ<? super HatchConversationKt$HatchConversation$9$1> htJ) {
        super(2, htJ);
        this.$tabReselectedFlow = c20q;
        this.$audio = conversationAudioPlayback;
        this.$listState = lazyListState;
        this.$currentItems$delegate = c1bo;
        this.$currentRequestBottomFollow$delegate = c1bo2;
        this.$autoFollowEnabled$delegate = mutableState;
        this.$currentOnJumpToAudioSource$delegate = c1bo3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$9$1(this.$tabReselectedFlow, this.$audio, this.$listState, this.$currentItems$delegate, this.$currentRequestBottomFollow$delegate, this.$autoFollowEnabled$delegate, this.$currentOnJumpToAudioSource$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<Unit> c20q = this.$tabReselectedFlow;
            if (c20q != null) {
                final ConversationAudioPlayback conversationAudioPlayback = this.$audio;
                final LazyListState lazyListState = this.$listState;
                final C1BO<AHD<HatchConversationListItem>> c1bo = this.$currentItems$delegate;
                final C1BO<Function0<Unit>> c1bo2 = this.$currentRequestBottomFollow$delegate;
                final MutableState<Boolean> mutableState = this.$autoFollowEnabled$delegate;
                final C1BO<G0V<String, String, Unit>> c1bo3 = this.$currentOnJumpToAudioSource$delegate;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$9$1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
                    
                        r1 = r6.getValue();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
                    
                        if (r1 == null) goto L39;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
                    
                        r1.invoke(r4, r5.sourceSessionId);
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(kotlin.Unit r8, X.HtJ<? super kotlin.Unit> r9) {
                        /*
                            r7 = this;
                            com.facebook.aura.conversation.view.ConversationAudioPlayback r0 = r1
                            com.facebook.aura.audio.HatchAudioPlayerRepository r0 = r0.repository
                            X.1BN<com.facebook.aura.audio.HatchAudioPlaybackState> r0 = r0.playbackState
                            java.lang.Object r0 = r0.getValue()
                            com.facebook.aura.audio.HatchAudioPlaybackState r0 = (com.facebook.aura.audio.HatchAudioPlaybackState) r0
                            r6 = 0
                            if (r0 == 0) goto L7c
                            com.facebook.aura.audio.HatchAudioItem r5 = r0.item
                            if (r5 == 0) goto L7c
                            java.lang.String r4 = r5.sourceMessageId
                            if (r4 == 0) goto L7c
                            X.1BO<X.AHD<com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r0 = r3
                            java.util.Iterator r3 = X.C1BO.A09(r0)
                            r2 = 0
                        L1e:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L82
                            java.lang.Object r1 = r3.next()
                            com.facebook.aura.conversation.viewmodel.HatchConversationListItem r1 = (com.facebook.aura.conversation.viewmodel.HatchConversationListItem) r1
                            boolean r0 = r1 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationListItem.Message
                            if (r0 == 0) goto L64
                            com.facebook.aura.conversation.viewmodel.HatchConversationListItem$Message r1 = (com.facebook.aura.conversation.viewmodel.HatchConversationListItem.Message) r1
                            if (r1 == 0) goto L64
                            com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r0 = r1.message
                            if (r0 == 0) goto L64
                            java.lang.String r0 = r0.id
                        L38:
                            boolean r0 = r4.equals(r0)
                            if (r0 == 0) goto L61
                            if (r2 < 0) goto L82
                            androidx.compose.foundation.lazy.LazyListState r0 = r2
                            java.util.List r1 = X.AnonymousClass003.A0j(r0)
                            boolean r0 = r1 instanceof java.util.Collection
                            if (r0 == 0) goto L66
                            boolean r0 = r1.isEmpty()
                            if (r0 == 0) goto L66
                        L50:
                            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r5
                            r1 = 0
                            androidx.compose.runtime.MutableState.A09(r1, r0)
                            androidx.compose.foundation.lazy.LazyListState r0 = r2
                            java.lang.Object r1 = r0.A05(r2, r1, r9)
                            X.Hji r0 = X.EnumC10460Hji.A02
                            if (r1 != r0) goto L91
                            return r1
                        L61:
                            int r2 = r2 + 1
                            goto L1e
                        L64:
                            r0 = r6
                            goto L38
                        L66:
                            java.util.Iterator r1 = r1.iterator()
                        L6a:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L50
                            java.lang.Object r0 = r1.next()
                            X.16C r0 = (X.C16C) r0
                            X.Acs r0 = (X.C1160Acs) r0
                            int r0 = r0.A07
                            if (r0 != r2) goto L6a
                        L7c:
                            X.1BO<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r4
                            X.C1BO.A0D(r0)
                            goto L91
                        L82:
                            X.1BO<X.G0V<java.lang.String, java.lang.String, kotlin.Unit>> r0 = r6
                            java.lang.Object r1 = r0.getValue()
                            X.G0V r1 = (X.G0V) r1
                            if (r1 == 0) goto L91
                            java.lang.String r0 = r5.sourceSessionId
                            r1.invoke(r4, r0)
                        L91:
                            kotlin.Unit r1 = kotlin.Unit.INSTANCE
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$9$1.AnonymousClass1.emit(kotlin.Unit, X.HtJ):java.lang.Object");
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationKt$HatchConversation$9$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
