package com.facebook.aura.main;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1", f = "LoggingAuraNavigator.kt", l = {486}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1(AuraNavigator auraNavigator, HtJ<? super LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1> htJ) {
        super(2, htJ);
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1(this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass602 anonymousClass602 = new AnonymousClass602(AuraAppLifecycleManager.isAppInForegroundFlow, 0);
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.main.LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    if (z) {
                        AuraNavigator auraNavigator2 = auraNavigator;
                        if (auraNavigator2 instanceof LoggingAuraNavigator) {
                            ((LoggingAuraNavigator) auraNavigator2).reportForeground();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (anonymousClass602.collect(c20z, this) == enumC10460Hji) {
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
        return new LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1(this.$navigator, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
