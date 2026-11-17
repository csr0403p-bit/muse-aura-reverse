package X;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUI extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final Object A04;
    public final Object A05;

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        BUI bui;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i2;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        int i3;
        switch (this.$t) {
            case 0:
                obj4 = this.A02;
                obj2 = this.A04;
                obj3 = this.A05;
                obj5 = this.A01;
                i = 0;
                BUI bui2 = new BUI(obj5, (BRr) obj4, (G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object>) htJ, (G0U<? super AWx, Unit>) obj3, (PressGestureScopeImpl) obj2, (HtJ<? super BUI>) i);
                bui2.A03 = obj;
                return bui2;
            case 1:
                bui = new BUI(this.A05, this.A03, this.A04, htJ, 1);
                bui.A01 = obj;
                return bui;
            case 2:
                obj8 = this.A03;
                obj7 = this.A05;
                obj6 = this.A04;
                obj9 = this.A01;
                i2 = 2;
                BUI bui3 = new BUI(obj8, (InterfaceC1655Ane) obj9, (G0U<? super AuT, Unit>) obj6, (AuP) obj7, (InterfaceC1766AqJ) htJ, (HtJ<? super BUI>) i2);
                bui3.A02 = obj;
                return bui3;
            case 3:
                obj14 = this.A01;
                obj11 = this.A03;
                obj12 = this.A02;
                obj13 = this.A05;
                obj10 = this.A04;
                i3 = 3;
                return new BUI(obj11, obj13, obj10, obj12, obj14, htJ, i3);
            case 4:
                obj10 = this.A04;
                obj11 = this.A03;
                obj12 = this.A02;
                obj13 = this.A05;
                obj14 = this.A01;
                i3 = 4;
                return new BUI(obj11, obj13, obj10, obj12, obj14, htJ, i3);
            case 5:
                obj6 = this.A04;
                obj7 = this.A05;
                obj8 = this.A03;
                obj9 = this.A01;
                i2 = 5;
                BUI bui32 = new BUI(obj8, (InterfaceC1655Ane) obj9, (G0U<? super AuT, Unit>) obj6, (AuP) obj7, (InterfaceC1766AqJ) htJ, (HtJ<? super BUI>) i2);
                bui32.A02 = obj;
                return bui32;
            case 6:
                bui = new BUI(this.A05, this.A03, this.A04, htJ, 6);
                bui.A01 = obj;
                return bui;
            case 7:
                obj2 = this.A04;
                obj3 = this.A05;
                obj4 = this.A02;
                obj5 = this.A01;
                i = 7;
                BUI bui22 = new BUI(obj5, (BRr) obj4, (G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object>) htJ, (G0U<? super AWx, Unit>) obj3, (PressGestureScopeImpl) obj2, (HtJ<? super BUI>) i);
                bui22.A03 = obj;
                return bui22;
            default:
                obj11 = this.A03;
                obj13 = this.A05;
                obj10 = this.A04;
                obj12 = this.A02;
                obj14 = this.A01;
                i3 = 8;
                return new BUI(obj11, obj13, obj10, obj12, obj14, htJ, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUI(Object obj, PagerState pagerState, C1BO<? extends List<? extends Item>> c1bo, C1BO<? extends G0U<? super Item, String>> c1bo2, C1BO<String> c1bo3, C1BO<? extends G0U<? super Item, Unit>> c1bo4, HtJ<? super BUI> htJ) {
        super(2, c1bo4);
        this.$t = htJ;
        this.A03 = obj;
        this.A05 = pagerState;
        this.A04 = c1bo;
        this.A02 = c1bo2;
        this.A01 = c1bo3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a5 A[Catch: all -> 0x03e3, TRY_ENTER, TryCatch #2 {, blocks: (B:142:0x03b7, B:144:0x03bb, B:145:0x03bd, B:147:0x03c3, B:148:0x03c8, B:149:0x03cc, B:136:0x03a5, B:138:0x03a9, B:139:0x03ab, B:141:0x03b1), top: B:179:0x026f }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b7 A[Catch: all -> 0x03e3, TryCatch #2 {, blocks: (B:142:0x03b7, B:144:0x03bb, B:145:0x03bd, B:147:0x03c3, B:148:0x03c8, B:149:0x03cc, B:136:0x03a5, B:138:0x03a9, B:139:0x03ab, B:141:0x03b1), top: B:179:0x026f }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0333 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v2, types: [T] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r1v91, types: [T, X.AgN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.HoC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.Ane] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f0 -> B:15:0x0076). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUI) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUI(Object obj, BRr bRr, G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object> g0w, G0U<? super AWx, Unit> g0u, PressGestureScopeImpl pressGestureScopeImpl, HtJ<? super BUI> htJ) {
        super(2, g0w);
        this.$t = htJ;
        this.A02 = bRr;
        this.A04 = pressGestureScopeImpl;
        this.A05 = g0u;
        this.A01 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUI(Object obj, TrackpadScrollingLogic trackpadScrollingLogic, ScrollingLogic scrollingLogic, C10543Hqv<C1277AgN> c10543Hqv, HtJ<? super BUI> htJ) {
        super(2, c10543Hqv);
        this.$t = htJ;
        this.A03 = trackpadScrollingLogic;
        this.A05 = obj;
        this.A04 = scrollingLogic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BUI(Object obj, InterfaceC1655Ane interfaceC1655Ane, G0U<? super AuT, Unit> g0u, AuP auP, InterfaceC1766AqJ interfaceC1766AqJ, HtJ<? super BUI> htJ) {
        super(2, interfaceC1766AqJ);
        this.$t = htJ;
        this.A04 = g0u;
        this.A05 = auP;
        this.A03 = obj;
        this.A01 = interfaceC1655Ane;
    }
}
