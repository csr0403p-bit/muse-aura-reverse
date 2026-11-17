package com.facebook.aura.settings;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$2$1", f = "HatchLegalWebPageScreen.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $slideOffset;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$2$1(AT5<Float, AOW> at5, HtJ<? super HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$2$1> htJ) {
        super(2, htJ);
        this.$slideOffset = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$2$1(this.$slideOffset, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<Float, AOW> at5 = this.$slideOffset;
            Float fA0l = AnonymousClass001.A0l();
            this.label = 1;
            if (AnonymousClass002.A0i(at5, at5.A08, fA0l, this, null) == enumC10460Hji) {
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
        return new HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$2$1(this.$slideOffset, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
