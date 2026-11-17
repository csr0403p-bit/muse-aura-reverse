package androidx.compose.foundation.text;

import X.AWo;
import X.AWp;
import X.AWx;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BUD;
import X.BUE;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1072AWd;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends AbstractC07127nr implements G0W<AWo, AWx, HtJ<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ MutableState<AWp> $pressedInteraction;
    public final /* synthetic */ C3UX $scope;
    public /* synthetic */ long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3UX;Landroidx/compose/runtime/MutableState<LX/AWp;>;LX/AWd;LX/HtJ<-Landroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1;>;)V */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(InterfaceC1072AWd interfaceC1072AWd, MutableState mutableState, HtJ htJ, C3UX c3ux) {
        super(3, htJ);
        this.$scope = c3ux;
        this.$pressedInteraction = mutableState;
        this.$interactionSource = interfaceC1072AWd;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(AWo aWo, AWx aWx, HtJ<? super Unit> htJ) {
        long j = aWx.A00;
        C3UX c3ux = this.$scope;
        MutableState<AWp> mutableState = this.$pressedInteraction;
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.$interactionSource, mutableState, htJ, c3ux);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.L$0 = aWo;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.J$0 = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AWo aWo = (AWo) this.L$0;
            long j = this.J$0;
            AnonymousClass001.A1J(new BUD(this.$pressedInteraction, this.$interactionSource, null, 3, j), this.$scope);
            this.label = 1;
            obj = aWo.AhU(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        boolean zA1X = AnonymousClass001.A1X(obj);
        AnonymousClass001.A1J(new BUE(this.$interactionSource, this.$pressedInteraction, (HtJ) null, zA1X), this.$scope);
        return Unit.INSTANCE;
    }
}
