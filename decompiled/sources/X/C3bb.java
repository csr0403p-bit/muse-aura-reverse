package X;

import androidx.compose.material.TextFieldColors;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bb, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bb implements Ht9, G0W {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C3bb(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.$t = i;
        this.A00 = obj;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.runtime.MutableState] */
    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.$t == 0) {
            BFM bfmA0P = AnonymousClass005.A0P(obj2, obj3);
            bfmA0P.AgE(-1525724089);
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass005.A0d(bfmA0P);
            BRg bRgThen = C0yB.A00((InterfaceC05011Yg) this.A00, interfaceC1072AWd, BRg.A00).then(new AX9(null, interfaceC1072AWd, null, (Function0) this.A01, this.A03, false, this.A02));
            AnonymousClass001.A1D(bfmA0P);
            return bRgThen;
        }
        BFM bfmA0P2 = AnonymousClass005.A0P(obj2, obj3);
        bfmA0P2.AgE(1423138213);
        TextFieldColors textFieldColors = (TextFieldColors) this.A00;
        boolean z = this.A02;
        boolean z2 = obj == C19X.A03 ? false : this.A03;
        C0dy c0dy = (C0dy) this.A01;
        C19Y c19y = (C19Y) textFieldColors;
        bfmA0P2.AgE(727091888);
        MutableState mutableStateA00 = C1er.A00(bfmA0P2, new B6A(!z ? c19y.A01 : z2 ? c19y.A05 : MutableState.A0A((MutableState) C17z.A00(c0dy, bfmA0P2, 0)) ? c19y.A08 : c19y.A0C));
        BBI bbi = (BBI) bfmA0P2;
        BBI.A0R(bbi, false);
        return AnonymousClass006.A0P(bbi, ((B6A) mutableStateA00.getValue()).A00);
    }
}
