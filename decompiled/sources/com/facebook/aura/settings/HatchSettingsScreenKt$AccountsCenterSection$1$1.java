package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06787bB;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC06807bD;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$AccountsCenterSection$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ MutableState<Boolean> $acWasOpened$delegate;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onValidateSessionAfterAccountCenter;

    @DebugMetadata(c = "com.facebook.aura.settings.HatchSettingsScreenKt$AccountsCenterSection$1$1$1", f = "HatchSettingsScreen.kt", l = {1142}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$AccountsCenterSection$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onValidateSessionAfterAccountCenter;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$onValidateSessionAfterAccountCenter = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$onValidateSessionAfterAccountCenter, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super Unit>, Object> g0u = this.$onValidateSessionAfterAccountCenter;
                this.label = 1;
                if (g0u.invoke(this) == enumC10460Hji) {
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
            return new AnonymousClass1(this.$onValidateSessionAfterAccountCenter, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        if (MutableState.A0A((MutableState) this.$acWasOpened$delegate)) {
            MutableState.A09(false, this.$acWasOpened$delegate);
            AnonymousClass001.A1J(new AnonymousClass1(this.$onValidateSessionAfterAccountCenter, null), this.$coroutineScope);
        }
        return new InterfaceC06807bD() { // from class: com.facebook.aura.settings.HatchSettingsScreenKt$AccountsCenterSection$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$AccountsCenterSection$1$1(C3UX c3ux, MutableState<Boolean> mutableState, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$acWasOpened$delegate = mutableState;
        this.$onValidateSessionAfterAccountCenter = g0u;
    }
}
