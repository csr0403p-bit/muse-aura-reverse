package androidx.compose.foundation.text.input.internal.selection;

import X.AWo;
import X.AWx;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BUH;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC1072AWd;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", l = {1821}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 extends AbstractC07127nr implements G0W<AWo, AWx, HtJ<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ TextFieldSelectionState $this_defaultDetectTextFieldTapGestures;
    public /* synthetic */ long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(InterfaceC1072AWd interfaceC1072AWd, TextFieldSelectionState textFieldSelectionState, HtJ<? super TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2> htJ) {
        super(3, htJ);
        this.$interactionSource = interfaceC1072AWd;
        this.$this_defaultDetectTextFieldTapGestures = textFieldSelectionState;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(AWo aWo, AWx aWx, HtJ<? super Unit> htJ) {
        long j = aWx.A00;
        TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(this.$interactionSource, this.$this_defaultDetectTextFieldTapGestures, htJ);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.L$0 = aWo;
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.J$0 = j;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AWo aWo = (AWo) this.L$0;
            long j = this.J$0;
            InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
            if (interfaceC1072AWd != null) {
                BUH buh = new BUH(aWo, interfaceC1072AWd, this.$this_defaultDetectTextFieldTapGestures, (HtJ) null, j);
                this.label = 1;
                if (Hxb.A00(buh, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
