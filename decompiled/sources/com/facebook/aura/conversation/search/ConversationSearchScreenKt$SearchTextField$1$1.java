package com.facebook.aura.conversation.search;

import X.AWk;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C1qN;
import X.C20Z;
import X.C3Em;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC04911Xu;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchTextField$1$1", f = "ConversationSearchScreen.kt", l = {432}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnActivate$delegate;
    public final /* synthetic */ InterfaceC1072AWd $fieldInteractionSource;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchScreenKt$SearchTextField$1$1(InterfaceC1072AWd interfaceC1072AWd, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super ConversationSearchScreenKt$SearchTextField$1$1> htJ) {
        super(2, htJ);
        this.$fieldInteractionSource = interfaceC1072AWd;
        this.$currentOnActivate$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConversationSearchScreenKt$SearchTextField$1$1(this.$fieldInteractionSource, this.$currentOnActivate$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3Em<InterfaceC04911Xu> c3Em = ((C1qN) this.$fieldInteractionSource).A00;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnActivate$delegate;
            C20Z<? super InterfaceC04911Xu> c20z = new C20Z() { // from class: com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchTextField$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((InterfaceC04911Xu) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(InterfaceC04911Xu interfaceC04911Xu, HtJ<? super Unit> htJ) {
                    if (interfaceC04911Xu instanceof AWk) {
                        C1BO<Function0<Unit>> c1bo2 = c1bo;
                        float f = ConversationSearchScreenKt.SearchFieldCornerRadius;
                        Function0 function0A0A = C1BO.A0A(c1bo2);
                        if (function0A0A != null) {
                            function0A0A.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c3Em.collect(c20z, this) == enumC10460Hji) {
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
        return ((ConversationSearchScreenKt$SearchTextField$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
