package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.acra.util.minidump.MinidumpReader;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.assist.AssistIdentityStateKt$AssistIdentityTransitionEffect$1$1", f = "AssistIdentityState.kt", l = {105, MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AssistIdentityStateKt$AssistIdentityTransitionEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onCollapsed;
    public final /* synthetic */ AssistIdentityState $transition;
    public int label;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssistIdentityPhase.values().length];
            try {
                AnonymousClass002.A13(AssistIdentityPhase.COLLAPSING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AssistIdentityPhase.EXPANDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AssistIdentityPhase.EXPANDED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AssistIdentityPhase.COLLAPSED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityStateKt$AssistIdentityTransitionEffect$1$1(AssistIdentityState assistIdentityState, Function0<Unit> function0, HtJ<? super AssistIdentityStateKt$AssistIdentityTransitionEffect$1$1> htJ) {
        super(2, htJ);
        this.$transition = assistIdentityState;
        this.$onCollapsed = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AssistIdentityStateKt$AssistIdentityTransitionEffect$1$1(this.$transition, this.$onCollapsed, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            int iOrdinal = this.$transition.getPhase().ordinal();
            if (iOrdinal == 1) {
                AssistIdentityState assistIdentityState = this.$transition;
                this.label = 1;
                if (assistIdentityState.animateCollapse(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                this.$onCollapsed.invoke();
            } else if (iOrdinal == 3) {
                AssistIdentityState assistIdentityState2 = this.$transition;
                this.label = 2;
                if (assistIdentityState2.animateExpansion(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else if (iOrdinal != 0 && iOrdinal != 2) {
                throw C3cG.A0q();
            }
        } else if (i == 1) {
            Hwg.A00(obj);
            this.$onCollapsed.invoke();
        } else {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AssistIdentityStateKt$AssistIdentityTransitionEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
