package X;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUE extends AbstractC07127nr implements G0V {
    public final int $t = 0;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/runtime/MutableState<LX/AWp;>;ZLX/AWd;LX/HtJ<-LX/BUE;>;)V */
    public BUE(InterfaceC1072AWd interfaceC1072AWd, MutableState mutableState, HtJ htJ, boolean z) {
        super(2, htJ);
        this.A01 = mutableState;
        this.A04 = z;
        this.A03 = interfaceC1072AWd;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        switch (this.$t) {
            case 0:
                boolean z = this.A04;
                return new BUE((AOe) this.A01, (C1073AWe) this.A02, (GraphicsLayer) this.A03, htJ, z);
            case 1:
                return new BUE((InterfaceC1072AWd) this.A03, (MutableState) this.A01, htJ, this.A04);
            default:
                BUE bue = new BUE((TextFieldSelectionState) this.A02, (BRr) this.A03, htJ, this.A04);
                bue.A01 = obj;
                return bue;
        }
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        Boolean bool;
        switch (this.$t) {
            case 0:
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.A00;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        if (this.A04) {
                            AT5<Float, AOW> at5 = ((C1073AWe) this.A02).A09;
                            Float fA0l = AnonymousClass001.A0l();
                            this.A00 = 1;
                            if (at5.A04(fA0l, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    } else {
                        if (i != 1) {
                            Hwg.A00(obj);
                            mutableState = ((C1073AWe) this.A02).A0A;
                            bool = false;
                            mutableState.Af8(bool);
                            return Unit.INSTANCE;
                        }
                        Hwg.A00(obj);
                    }
                    AT5<Float, AOW> at52 = ((C1073AWe) this.A02).A09;
                    Float fA0m = AnonymousClass001.A0m();
                    AOe aOe = (AOe) this.A01;
                    BTA btaA01 = BTA.A01((C1073AWe) this.A02, (GraphicsLayer) this.A03, 32);
                    this.A00 = 2;
                    if (AnonymousClass002.A0i(at52, aOe, fA0m, this, btaA01) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    mutableState = ((C1073AWe) this.A02).A0A;
                    bool = false;
                    mutableState.Af8(bool);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    MutableState.A09(false, ((C1073AWe) this.A02).A0A);
                    throw th;
                }
            case 1:
                EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
                int i2 = this.A00;
                if (i2 == 0) {
                    Hwg.A00(obj);
                    AWp aWp = (AWp) ((MutableState) this.A01).getValue();
                    if (aWp != null) {
                        boolean z = this.A04;
                        InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) this.A03;
                        mutableState = (MutableState) this.A01;
                        InterfaceC04911Xu aWk = z ? new AWk(aWp) : new AWl(aWp);
                        if (interfaceC1072AWd != null) {
                            this.A02 = mutableState;
                            this.A00 = 1;
                            if (interfaceC1072AWd.A9u(aWk, this) == enumC10460Hji2) {
                                return enumC10460Hji2;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                mutableState = (MutableState) this.A02;
                Hwg.A00(obj);
                bool = null;
                mutableState.Af8(bool);
                return Unit.INSTANCE;
            default:
                if (this.A00 != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                C3UX c3ux = (C3UX) this.A01;
                Integer num = C79.A0K;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.A02;
                BRr bRr = (BRr) this.A03;
                BU6 bu6 = new BU6(textFieldSelectionState, (TextFieldSelectionState) bRr, (BRr) null, (HtJ<? super BU6>) 34);
                C6ys c6ys = C6ys.A00;
                GAo.A02(num, c6ys, bu6, c3ux);
                TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) this.A02;
                boolean z2 = this.A04;
                GAo.A02(num, c6ys, new BUA(textFieldSelectionState2, bRr, null, 0, z2), c3ux).AO5(C2294BSu.A00(this.A02, 44));
                return GAo.A02(num, c6ys, new BUA((TextFieldSelectionState) this.A02, bRr, null, 1, z2), c3ux);
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUE) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;LX/BRr;ZLX/HtJ<-LX/BUE;>;)V */
    public BUE(TextFieldSelectionState textFieldSelectionState, BRr bRr, HtJ htJ, boolean z) {
        super(2, htJ);
        this.A02 = textFieldSelectionState;
        this.A03 = bRr;
        this.A04 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (ZLX/AWe;LX/AOe<Ljava/lang/Float;>;Landroidx/compose/ui/graphics/layer/GraphicsLayer;LX/HtJ<-LX/BUE;>;)V */
    public BUE(AOe aOe, C1073AWe c1073AWe, GraphicsLayer graphicsLayer, HtJ htJ, boolean z) {
        super(2, htJ);
        this.A04 = z;
        this.A02 = c1073AWe;
        this.A01 = aOe;
        this.A03 = graphicsLayer;
    }
}
