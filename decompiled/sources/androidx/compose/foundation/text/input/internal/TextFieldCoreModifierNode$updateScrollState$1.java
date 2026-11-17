package androidx.compose.foundation.text.input.internal;

import X.AaC;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1110AYw;
import X.C1864Asd;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1866Asg;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import com.facebook.aura.wearablebroadcast.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", l = {510, MC.wearables_hatch.__CONFIG__}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $offsetDifference;
    public final /* synthetic */ AaC $rawCursorRect;
    public final /* synthetic */ boolean $shouldBringIntoView;
    public int label;
    public final /* synthetic */ C1864Asd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Asd;FZLX/AaC;LX/HtJ<-Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode$updateScrollState$1;>;)V */
    public TextFieldCoreModifierNode$updateScrollState$1(C1864Asd c1864Asd, AaC aaC, HtJ htJ, float f, boolean z) {
        super(2, htJ);
        this.this$0 = c1864Asd;
        this.$offsetDifference = f;
        this.$shouldBringIntoView = z;
        this.$rawCursorRect = aaC;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.this$0, this.$rawCursorRect, htJ, this.$offsetDifference, this.$shouldBringIntoView);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1110AYw c1110AYw = this.this$0.A02;
            float fCeil = this.$offsetDifference;
            if (!Float.isNaN(fCeil) && !Float.isInfinite(fCeil)) {
                double d = fCeil;
                fCeil = (float) (fCeil > 0.0f ? Math.ceil(d) : Math.floor(d));
            }
            this.label = 1;
            if (ScrollExtensionsKt.A02(c1110AYw, this, fCeil) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        if (this.$shouldBringIntoView) {
            InterfaceC1866Asg interfaceC1866Asg = this.this$0.A06.A02;
            AaC aaC = this.$rawCursorRect;
            this.label = 2;
            if (interfaceC1866Asg.A5L(aaC, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
