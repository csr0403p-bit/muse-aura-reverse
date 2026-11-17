package androidx.compose.foundation.text.input.internal;

import X.AbstractC07127nr;
import X.AbstractC1769AqM;
import X.AnonymousClass001;
import X.AuI;
import X.AuQ;
import X.BU6;
import X.C1881Asv;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C6ys;
import X.C79;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1079AXi;
import X.InterfaceC1631An5;
import X.InterfaceC1655Ane;
import X.InterfaceC2147AzZ;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {127}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<?>, Object> {
    public final /* synthetic */ InterfaceC2147AzZ $composeImm;
    public final /* synthetic */ AuI $imeOptions;
    public final /* synthetic */ C1881Asv $layoutState;
    public final /* synthetic */ G0U<ImeAction, Unit> $onImeAction;
    public final /* synthetic */ AbstractC1769AqM $receiveContentConfiguration;
    public final /* synthetic */ TransformedTextFieldState $state;
    public final /* synthetic */ C3Em<Unit> $stylusHandwritingTrigger;
    public final /* synthetic */ InterfaceC1655Ane $this_platformSpecificTextInputSession;
    public final /* synthetic */ Function0<Unit> $updateSelectionState;
    public final /* synthetic */ G0U<Boolean, Unit> $updateTouchMode;
    public final /* synthetic */ InterfaceC1079AXi $viewConfiguration;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3Em<Lkotlin/Unit;>;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;LX/Asv;LX/AzZ;LX/Ane;LX/AuI;LX/AqM;LX/G0U<-Landroidx/compose/ui/text/input/ImeAction;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/AXi;LX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;LX/HtJ<-Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;>;)V */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(AbstractC1769AqM abstractC1769AqM, InterfaceC2147AzZ interfaceC2147AzZ, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, InterfaceC1655Ane interfaceC1655Ane, InterfaceC1079AXi interfaceC1079AXi, AuI auI, HtJ htJ, Function0 function0, G0U g0u, G0U g0u2, C3Em c3Em) {
        super(2, htJ);
        this.$stylusHandwritingTrigger = c3Em;
        this.$state = transformedTextFieldState;
        this.$layoutState = c1881Asv;
        this.$composeImm = interfaceC2147AzZ;
        this.$this_platformSpecificTextInputSession = interfaceC1655Ane;
        this.$imeOptions = auI;
        this.$receiveContentConfiguration = abstractC1769AqM;
        this.$onImeAction = g0u;
        this.$updateSelectionState = function0;
        this.$viewConfiguration = interfaceC1079AXi;
        this.$updateTouchMode = g0u2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C3Em<Unit> c3Em = this.$stylusHandwritingTrigger;
        TransformedTextFieldState transformedTextFieldState = this.$state;
        C1881Asv c1881Asv = this.$layoutState;
        InterfaceC2147AzZ interfaceC2147AzZ = this.$composeImm;
        InterfaceC1655Ane interfaceC1655Ane = this.$this_platformSpecificTextInputSession;
        AuI auI = this.$imeOptions;
        AbstractC1769AqM abstractC1769AqM = this.$receiveContentConfiguration;
        G0U<ImeAction, Unit> g0u = this.$onImeAction;
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(abstractC1769AqM, interfaceC2147AzZ, c1881Asv, transformedTextFieldState, interfaceC1655Ane, this.$viewConfiguration, auI, htJ, this.$updateSelectionState, g0u, this.$updateTouchMode, c3Em);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C3UX c3ux = (C3UX) this.L$0;
            Integer num = C79.A0K;
            BU6 bu6A0M = BU6.A0M(this.$state, this.$composeImm, null, 24);
            C6ys c6ys = C6ys.A00;
            GAo.A02(num, c6ys, bu6A0M, c3ux);
            C3Em<Unit> c3Em = this.$stylusHandwritingTrigger;
            if (c3Em != null) {
                AnonymousClass001.A1I(c6ys, BU6.A0M(c3Em, this.$composeImm, null, 25), c3ux);
            }
            TransformedTextFieldState transformedTextFieldState = this.$state;
            final AuQ auQ = new AuQ(this.$composeImm, this.$layoutState, transformedTextFieldState, c3ux);
            InterfaceC1655Ane interfaceC1655Ane = this.$this_platformSpecificTextInputSession;
            final TransformedTextFieldState transformedTextFieldState2 = this.$state;
            final AuI auI = this.$imeOptions;
            final AbstractC1769AqM abstractC1769AqM = this.$receiveContentConfiguration;
            final InterfaceC2147AzZ interfaceC2147AzZ = this.$composeImm;
            final G0U<ImeAction, Unit> g0u = this.$onImeAction;
            final C1881Asv c1881Asv = this.$layoutState;
            final Function0<Unit> function0 = this.$updateSelectionState;
            final InterfaceC1079AXi interfaceC1079AXi = this.$viewConfiguration;
            final G0U<Boolean, Unit> g0u2 = this.$updateTouchMode;
            InterfaceC1631An5 interfaceC1631An5 = new InterfaceC1631An5() { // from class: X.Atr
                @Override // X.InterfaceC1631An5
                public final InputConnection A7q(EditorInfo editorInfo) {
                    TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2;
                    AuI auI2 = auI;
                    AbstractC1769AqM abstractC1769AqM2 = abstractC1769AqM;
                    InterfaceC2147AzZ interfaceC2147AzZ2 = interfaceC2147AzZ;
                    G0U g0u3 = g0u;
                    C1923Atk c1923Atk = new C1923Atk(abstractC1769AqM2, interfaceC2147AzZ2, auQ, new C1910AtV(transformedTextFieldState3), c1881Asv, transformedTextFieldState3, interfaceC1079AXi, function0, g0u3, g0u2);
                    AbstractC1644AnK.A00(editorInfo, auI2, transformedTextFieldState3.A07(), abstractC1769AqM2 != null ? AndroidTextInputSession_androidKt.A00 : null, At0.A01(transformedTextFieldState3));
                    return new AuL(editorInfo, c1923Atk);
                }
            };
            this.label = 1;
            if (interfaceC1655Ane.Ag6(interfaceC1631An5, this) == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<?> htJ) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
