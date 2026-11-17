package X;

import android.graphics.Typeface;
import androidx.compose.ui.Alignment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BUu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2346BUu extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2346BUu(Alignment alignment, C6837Eap c6837Eap, Function0<Float> function0, BRg bRg, boolean z, boolean z2, boolean z3, B3A b3a, boolean z4, C8661FiM c8661FiM, Alignment alignment2, ARL arl, boolean z5, Map<String, ? extends Typeface> map, int i, int i2, int i3) {
        super(2);
        this.$t = arl;
        this.A04 = bRg;
        this.A09 = b3a;
        this.A08 = c6837Eap;
        this.A0D = z5;
        this.A0E = map;
        this.A0B = i;
        this.A0A = z;
        this.A0C = i2;
        this.A06 = z2;
        this.A03 = alignment;
        this.A05 = function0;
        this.A0F = i3;
        this.A07 = z3;
        this.A00 = z4 ? 1 : 0;
        this.A01 = c8661FiM;
        this.A02 = alignment2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        C6837Eap c6837Eap = (C6837Eap) this.A04;
        Function0 function0 = (Function0) this.A09;
        BRg bRg = (BRg) this.A08;
        boolean z = this.A0D;
        boolean z2 = this.A0E;
        boolean z3 = this.A0B;
        B3A b3a = (B3A) this.A0A;
        boolean z4 = this.A0C;
        C8661FiM c8661FiM = (C8661FiM) this.A06;
        B3B.A00(bfmA0P, (Alignment) this.A03, bRg, (ARL) this.A05, c6837Eap, b3a, c8661FiM, (Map) this.A07, function0, this.A00 | 1, this.A01, this.A02, z, z2, z3, z4, this.A0F);
        return Unit.INSTANCE;
    }
}
