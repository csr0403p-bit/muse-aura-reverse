package X;

import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AtR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1906AtR implements InterfaceC1240AfW {
    public final int A00;
    public final AZ0 A01;
    public final C1YX A02;
    public final Function0<C1924Atl> A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1906AtR) {
                C1906AtR c1906AtR = (C1906AtR) obj;
                if (!this.A01.equals(c1906AtR.A01) || this.A00 != c1906AtR.A00 || !this.A02.equals(c1906AtR.A02) || !C7384Etj.areEqual(this.A03, c1906AtR.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, AnonymousClass005.A0F(this.A02, (AnonymousClass005.A0E(this.A01) + this.A00) * 31));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HorizontalScrollLayoutModifier(scrollerPosition=");
        sbA0x.append(this.A01);
        sbA0x.append(", cursorOffset=");
        sbA0x.append(this.A00);
        sbA0x.append(", transformedText=");
        sbA0x.append(this.A02);
        sbA0x.append(", textLayoutResultProvider=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AZ0;ILX/1YX;Lkotlin/jvm/functions/Function0<LX/Atl;>;)V */
    public C1906AtR(AZ0 az0, C1YX c1yx, Function0 function0, int i) {
        this.A01 = az0;
        this.A00 = i;
        this.A02 = c1yx;
        this.A03 = function0;
    }

    @Override // X.InterfaceC1240AfW
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iA00 = Constraints.A00(j);
        int iAQO = c3tg.AQO(iA00);
        int iA01 = Constraints.A01(j);
        if (iAQO >= iA01) {
            j = Constraints.A05(Constraints.A03(j), Integer.MAX_VALUE, Constraints.A02(j), iA00);
        }
        AZE azeAQW = c3tg.AQW(j);
        int iMin = Math.min(azeAQW.A01, iA01);
        return AXY.A01(axy, new BTS(azeAQW, this, axy, iMin, 0), iMin, azeAQW.A00);
    }

    @Override // X.BRg
    public final /* synthetic */ boolean all(G0U g0u) {
        return AnonymousClass003.A1X(this, g0u);
    }

    @Override // X.BRg
    public final /* synthetic */ Object foldIn(Object obj, G0V g0v) {
        return g0v.invoke(obj, this);
    }

    @Override // X.BRg
    public final /* synthetic */ BRg then(BRg bRg) {
        return BRP.A00(this, bRg);
    }
}
