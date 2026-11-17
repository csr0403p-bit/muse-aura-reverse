package com.facebook.aura.header.view;

import X.AT5;
import X.AT8;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C1003AOr;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.HeaderAction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.header.view.HeaderButtonKt$rememberLeavingHeaderActions$2$1", f = "HeaderButton.kt", l = {465}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HeaderButtonKt$rememberLeavingHeaderActions$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<List<HeaderAction>> $leaving$delegate;
    public final /* synthetic */ List<HeaderAction> $removed;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderButtonKt$rememberLeavingHeaderActions$2$1(List<HeaderAction> list, MutableState<List<HeaderAction>> mutableState, HtJ<? super HeaderButtonKt$rememberLeavingHeaderActions$2$1> htJ) {
        super(2, htJ);
        this.$removed = list;
        this.$leaving$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HeaderButtonKt$rememberLeavingHeaderActions$2$1(this.$removed, this.$leaving$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$removed.isEmpty()) {
                AT5 at5A00 = AT8.A00(0.0f);
                Float fA0m = AnonymousClass001.A0m();
                C1003AOr c1003AOrHeaderPillSpring = HeaderButtonKt.headerPillSpring();
                this.label = 1;
                if (AnonymousClass002.A0i(at5A00, c1003AOrHeaderPillSpring, fA0m, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$leaving$delegate.Af8(C0881AGi.A00);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HeaderButtonKt$rememberLeavingHeaderActions$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
