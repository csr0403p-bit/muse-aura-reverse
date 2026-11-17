package X;

import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUH extends AbstractC07127nr implements G0V {
    public final int $t = 0;
    public int A00;
    public Object A01;
    public Object A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AgA;Landroidx/compose/foundation/gestures/UpdatableAnimationState;LX/3MW;JLX/HtJ<-LX/BUH;>;)V */
    public BUH(C3MW c3mw, C1265AgA c1265AgA, UpdatableAnimationState updatableAnimationState, HtJ htJ, long j) {
        super(2, htJ);
        this.A02 = c1265AgA;
        this.A04 = updatableAnimationState;
        this.A05 = c3mw;
        this.A03 = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t == 0) {
            BUH buh = new BUH((C3MW) this.A05, (C1265AgA) this.A02, (UpdatableAnimationState) this.A04, htJ, this.A03);
            buh.A01 = obj;
            return buh;
        }
        BUH buh2 = new BUH((AWo) this.A04, (InterfaceC1072AWd) this.A05, (TextFieldSelectionState) this.A01, htJ, this.A03);
        buh2.A02 = obj;
        return buh2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.A00;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass001.A1J(new BUD(this.A01, this.A05, null, 6, this.A03), (C3UX) this.A02);
                AWo aWo = (AWo) this.A04;
                this.A00 = 1;
                obj = aWo.AhU(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else if (i != 1) {
                Hwg.A00(obj);
                ((TextFieldSelectionState) this.A01).A01 = null;
            } else {
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            AWp aWp = ((TextFieldSelectionState) this.A01).A01;
            if (aWp != null) {
                InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) this.A05;
                InterfaceC04911Xu aWk = zA1X ? new AWk(aWp) : new AWl(aWp);
                this.A00 = 2;
                if (interfaceC1072AWd.A9u(aWk, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            ((TextFieldSelectionState) this.A01).A01 = null;
        } else {
            EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
            int i2 = this.A00;
            CancellationException e = null;
            try {
                try {
                    if (i2 == 0) {
                        Hwg.A00(obj);
                        HoC hoCA02 = HzS.A02(((C3UX) this.A01).AEA());
                        C1265AgA c1265AgA = (C1265AgA) this.A02;
                        c1265AgA.A04 = true;
                        ScrollingLogic scrollingLogic = c1265AgA.A08;
                        C3UY c3uy = C3UY.A02;
                        ContentInViewNode$launchAnimation$2$1 contentInViewNode$launchAnimation$2$1 = new ContentInViewNode$launchAnimation$2$1((C3MW) this.A05, c1265AgA, (UpdatableAnimationState) this.A04, null, hoCA02, this.A03);
                        this.A00 = 1;
                        if (scrollingLogic.A07(c3uy, this, contentInViewNode$launchAnimation$2$1) == enumC10460Hji2) {
                            return enumC10460Hji2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    C0910AHm<C1281AgR> c0910AHm = ((C1265AgA) this.A02).A07.A00;
                    ADq aDqA0C = ATD.A0C(0, c0910AHm.A00);
                    int i3 = aDqA0C.A00;
                    int i4 = aDqA0C.A01;
                    if (i3 <= i4) {
                        while (true) {
                            c0910AHm.A01[i3].A01.resumeWith(Unit.INSTANCE);
                            if (i3 == i4) {
                                break;
                            }
                            i3++;
                        }
                    }
                    c0910AHm.A09();
                    C1265AgA c1265AgA2 = (C1265AgA) this.A02;
                    c1265AgA2.A04 = false;
                    c1265AgA2.A07.A00(null);
                    ((C1265AgA) this.A02).A06 = false;
                } catch (CancellationException e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                C1265AgA c1265AgA3 = (C1265AgA) this.A02;
                c1265AgA3.A04 = false;
                c1265AgA3.A07.A00(e);
                ((C1265AgA) this.A02).A06 = false;
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUH) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AWo;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;JLX/AWd;LX/HtJ<-LX/BUH;>;)V */
    public BUH(AWo aWo, InterfaceC1072AWd interfaceC1072AWd, TextFieldSelectionState textFieldSelectionState, HtJ htJ, long j) {
        super(2, htJ);
        this.A04 = aWo;
        this.A01 = textFieldSelectionState;
        this.A03 = j;
        this.A05 = interfaceC1072AWd;
    }
}
