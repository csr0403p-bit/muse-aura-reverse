package com.facebook.aura.conversation.lifecycle;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1", f = "ConversationResumeResetEffect.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1(AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, HtJ<? super ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1> htJ) {
        super(2, htJ);
        this.$navigator = auraNavigator;
        this.$sidePanelController = hatchSidePanelController;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1(this.$navigator, this.$sidePanelController, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final C10543Hqv c10543Hqv = new C10543Hqv();
            C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundFlow;
            final AuraNavigator auraNavigator = this.$navigator;
            final HatchSidePanelController hatchSidePanelController = this.$sidePanelController;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    Long l;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C10543Hqv<Long> c10543Hqv2 = c10543Hqv;
                    if (z) {
                        Long l2 = c10543Hqv2.element;
                        if (l2 != null) {
                            l = new Long(jElapsedRealtime - l2.longValue());
                        } else {
                            l = null;
                        }
                        c10543Hqv2.element = null;
                        if (l != null && l.longValue() >= 3600000) {
                            AuraNavigator auraNavigator2 = auraNavigator;
                            ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
                            if (auraNavigator2.isInBackStack(conversationTabScreenKey)) {
                                hatchSidePanelController.hideImmediately();
                                auraNavigator.navigate(conversationTabScreenKey, LaunchFlag.REPLACE_BACKSTACK);
                            }
                        }
                    } else {
                        c10543Hqv2.element = (T) new Long(jElapsedRealtime);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
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
        return ((ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
