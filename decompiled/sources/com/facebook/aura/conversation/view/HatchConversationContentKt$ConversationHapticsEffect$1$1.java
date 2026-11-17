package com.facebook.aura.conversation.view;

import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BO7;
import X.C05573ua;
import X.C0dx;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.app.Activity;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationContentKt$ConversationHapticsEffect$1$1", f = "HatchConversationContent.kt", l = {973}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationContentKt$ConversationHapticsEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$ConversationHapticsEffect$1$1(HatchConversationViewModel hatchConversationViewModel, Activity activity, C0dx c0dx, HtJ<? super HatchConversationContentKt$ConversationHapticsEffect$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchConversationViewModel;
        this.$activity = activity;
        this.$haptics = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationContentKt$ConversationHapticsEffect$1$1(this.$viewModel, this.$activity, this.$haptics, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final BO7 bo7 = new BO7();
            HatchConversationRepository hatchConversationRepository = this.$viewModel.repository;
            C05573ua c05573uaA01 = AbstractC05633ui.A01(new HatchConversationContentKt$ConversationHapticsEffect$1$1$invokeSuspend$$inlined$map$1(hatchConversationRepository.reactionLanded), new HatchConversationContentKt$ConversationHapticsEffect$1$1$invokeSuspend$$inlined$map$2(hatchConversationRepository.assistantMessageStarted), new HatchConversationContentKt$ConversationHapticsEffect$1$1$invokeSuspend$$inlined$map$3(hatchConversationRepository.sendFailed));
            final Activity activity = this.$activity;
            final C0dx c0dx = this.$haptics;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationContentKt$ConversationHapticsEffect$1$1.4

                /* renamed from: com.facebook.aura.conversation.view.HatchConversationContentKt$ConversationHapticsEffect$1$1$4$WhenMappings */
                /* loaded from: classes6.dex */
                public abstract /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ConversationHapticEvent.values().length];
                        try {
                            AnonymousClass002.A13(ConversationHapticEvent.REACTION, iArr);
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            AnonymousClass002.A14(ConversationHapticEvent.REPLY_STARTED, iArr);
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            AnonymousClass002.A15(ConversationHapticEvent.SEND_FAILED, iArr);
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
                
                    if ((r3 - r2.element) >= com.facebook.aura.components.reactions.AuraReactionHapticsKt.getAURA_REACTION_HAPTIC_MAX_MS()) goto L21;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(com.facebook.aura.conversation.view.ConversationHapticEvent r7, X.HtJ<? super kotlin.Unit> r8) {
                    /*
                        r6 = this;
                        com.facebook.aura.lifecycle.AuraAppLifecycleManager r0 = com.facebook.aura.lifecycle.AuraAppLifecycleManager.INSTANCE
                        boolean r0 = r0.isAppInForeground()
                        if (r0 == 0) goto L14
                        android.app.Activity r0 = r1
                        r5 = 1
                        r2 = 0
                        if (r0 == 0) goto L17
                        boolean r0 = r0.isInPictureInPictureMode()
                        if (r0 != r5) goto L17
                    L14:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L17:
                        long r3 = android.os.SystemClock.elapsedRealtime()
                        int r1 = r7.ordinal()
                        if (r1 == r2) goto L3c
                        if (r1 == r5) goto L2e
                        r0 = 2
                        if (r1 != r0) goto L45
                        X.0dx r1 = r3
                        int r0 = com.facebook.aura.vds.compose.accessibility.AuraHaptics.FAILURE
                    L2a:
                        r1.AXr(r0)
                        goto L14
                    L2e:
                        X.BO7 r0 = r2
                        long r0 = r0.element
                        long r3 = r3 - r0
                        long r1 = com.facebook.aura.components.reactions.AuraReactionHapticsKt.getAURA_REACTION_HAPTIC_MAX_MS()
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 < 0) goto L14
                        goto L40
                    L3c:
                        X.BO7 r0 = r2
                        r0.element = r3
                    L40:
                        X.0dx r1 = r3
                        int r0 = com.facebook.aura.vds.compose.accessibility.AuraHaptics.SUCCESS
                        goto L2a
                    L45:
                        kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt$ConversationHapticsEffect$1$1.AnonymousClass4.emit(com.facebook.aura.conversation.view.ConversationHapticEvent, X.HtJ):java.lang.Object");
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConversationHapticEvent) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (c05573uaA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
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
        return ((HatchConversationContentKt$ConversationHapticsEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
