package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import com.meta.health.core.MetaHealthQuery;
import java.time.Instant;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUL extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0004: IPUT (r6 I:java.lang.String), (r1 I:X.BUL) (LINE:4) X.BUL.A06 java.lang.String, block:B:2:0x0000 */
    public BUL(Object obj, InterfaceC2026Awf interfaceC2026Awf, String str, long j, Au3 au3, TextFieldSelectionManager textFieldSelectionManager, InterfaceC2128Ayu interfaceC2128Ayu, HtJ<? super BUL> htJ) {
        String str2;
        super(2, au3);
        this.$t = textFieldSelectionManager;
        this.A03 = obj;
        this.A06 = str2;
        this.A01 = interfaceC2128Ayu;
        this.A04 = str;
        this.A05 = interfaceC2026Awf;
        this.A02 = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        String str;
        long j;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        if (this.$t != 0) {
            obj4 = this.A05;
            obj5 = this.A02;
            obj3 = this.A04;
            obj2 = this.A03;
            j = this.A01;
            str = this.A06;
            i = 1;
        } else {
            obj2 = this.A03;
            str = this.A06;
            j = this.A01;
            obj3 = this.A04;
            obj4 = this.A05;
            obj5 = this.A02;
            i = 0;
        }
        return new BUL(obj2, obj4, obj3, obj5, str, htJ, i, j);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (this.A00 != 0) {
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                MetaHealthQuery metaHealthQuery = (MetaHealthQuery) this.A05;
                C8954FuV c8954FuV = (C8954FuV) this.A02;
                Instant instant = (Instant) this.A04;
                Instant instant2 = (Instant) this.A03;
                Long lA0S = C3cG.A0S(this.A01);
                String str = this.A06;
                this.A00 = 1;
                obj = metaHealthQuery.A05(c8954FuV, lA0S, str, instant, instant2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return obj;
        }
        EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
        if (this.A00 != 0) {
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            InterfaceC2026Awf interfaceC2026Awf = (InterfaceC2026Awf) this.A03;
            String str2 = this.A06;
            long j = this.A01;
            this.A00 = 1;
            obj = interfaceC2026Awf.Agd(str2, this, j);
            if (obj == enumC10460Hji2) {
                return enumC10460Hji2;
            }
        }
        Au3 au3 = (Au3) obj;
        if (au3 != null) {
            InterfaceC2128Ayu interfaceC2128Ayu = (InterfaceC2128Ayu) this.A02;
            long j2 = au3.A00;
            long jA00 = AbstractC1815ArZ.A00(interfaceC2128Ayu.transformedToOriginal(C8j3.A0G(j2)), interfaceC2128Ayu.transformedToOriginal(AnonymousClass002.A09(j2)));
            Au3 au32 = (Au3) this.A04;
            if (au32 == null || jA00 != au32.A00) {
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.A05;
                MutableState<C1805ArO> mutableState = textFieldSelectionManager.A0S;
                if (C7384Etj.areEqual(MutableState.A04((MutableState) mutableState), this.A06) && interfaceC2128Ayu == textFieldSelectionManager.A0C) {
                    textFieldSelectionManager.A0G.invoke(C8j4.A0e(C8j4.A0d(mutableState).A01, jA00));
                    textFieldSelectionManager.A0B = C8j3.A0j(jA00);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUL) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
