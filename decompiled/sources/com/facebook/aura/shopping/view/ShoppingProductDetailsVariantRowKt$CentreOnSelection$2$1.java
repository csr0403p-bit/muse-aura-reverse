package com.facebook.aura.shopping.view;

import X.ATD;
import X.Ab3;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1110AYw;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.view.ShoppingProductDetailsVariantRowKt$CentreOnSelection$2$1", f = "ShoppingProductDetailsVariantRow.kt", l = {478, 478}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ShoppingProductDetailsVariantRowKt$CentreOnSelection$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Float $centreTargetPx;
    public final /* synthetic */ MutableState<Boolean> $hasCentred$delegate;
    public final /* synthetic */ C1110AYw $scrollState;
    public int I$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsVariantRowKt$CentreOnSelection$2$1(Float f, C1110AYw c1110AYw, MutableState<Boolean> mutableState, HtJ<? super ShoppingProductDetailsVariantRowKt$CentreOnSelection$2$1> htJ) {
        super(2, htJ);
        this.$centreTargetPx = f;
        this.$scrollState = c1110AYw;
        this.$hasCentred$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsVariantRowKt$CentreOnSelection$2$1(this.$centreTargetPx, this.$scrollState, this.$hasCentred$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA02;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Float f = this.$centreTargetPx;
            if (f != null) {
                int iA04 = ATD.A04(Ab3.A01(f.floatValue()), 0, this.$scrollState.A01.AGd());
                boolean zA0A = MutableState.A0A((MutableState) this.$hasCentred$delegate);
                C1110AYw c1110AYw = this.$scrollState;
                this.I$0 = iA04;
                if (zA0A) {
                    this.label = 1;
                    objA02 = C3cG.A0U(ScrollExtensionsKt.A00(AnonymousClass003.A0Q(null), c1110AYw, this, iA04 - c1110AYw.A04.AGd()));
                } else {
                    this.label = 2;
                    objA02 = ScrollExtensionsKt.A02(c1110AYw, this, iA04 - c1110AYw.A04.AGd());
                }
                if (objA02 == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(true, this.$hasCentred$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsVariantRowKt$CentreOnSelection$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
