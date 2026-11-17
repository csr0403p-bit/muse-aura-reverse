package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9Vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07419Vt extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bodyHeight;
    public final /* synthetic */ InterfaceC07449Vz $callbacks;
    public final /* synthetic */ C07389Vo $data;
    public final /* synthetic */ List<String> $keys;
    public final /* synthetic */ C9W5 $loader;
    public final /* synthetic */ C07429Vx $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/9Vo;Ljava/util/List<Ljava/lang/String;>;FLX/9Vx;LX/9W5;LX/9Vz;)V */
    public C07419Vt(C9W5 c9w5, InterfaceC07449Vz interfaceC07449Vz, C07389Vo c07389Vo, C07429Vx c07429Vx, List list, float f) {
        super(1);
        this.$data = c07389Vo;
        this.$keys = list;
        this.$bodyHeight = f;
        this.$style = c07429Vx;
        this.$loader = c9w5;
        this.$callbacks = interfaceC07449Vz;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        C0CD c0cd2 = c0cd;
        C7384Etj.A0Y(c0cd2, 0);
        final List<C07409Vs> list = this.$data.A00;
        BUZ buz = new BUZ(this.$keys, 12);
        final float f = this.$bodyHeight;
        final C07429Vx c07429Vx = this.$style;
        final C9W5 c9w5 = this.$loader;
        final InterfaceC07449Vz interfaceC07449Vz = this.$callbacks;
        c0cd2.APL(new BT9(25, buz, list), C2297BSx.A00(list, 41), B1U.A02(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: X.9Vu
            @Override // X.G2j
            public final /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                int iA0F = AnonymousClass001.A0F(num);
                BFM bfm2 = bfm;
                int iA0F2 = AnonymousClass001.A0F(num2);
                int iA0d = (iA0F2 & 6) == 0 ? AnonymousClass004.A0d(bfm2, anonymousClass037) | iA0F2 : iA0F2;
                if ((iA0F2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm2, iA0F);
                }
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm2, iA0d)) {
                    C07409Vs c07409Vs = (C07409Vs) list.get(iA0F);
                    bfm2.AgE(-351678843);
                    float f2 = f;
                    C07429Vx c07429Vx2 = c07429Vx;
                    C9W5 c9w52 = c9w5;
                    InterfaceC07449Vz interfaceC07449Vz2 = interfaceC07449Vz;
                    boolean zA65 = bfm2.A65(interfaceC07449Vz2) | ((((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm2.A63(iA0F)) || (iA0d & 48) == 32);
                    Object objAaT = bfm2.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new C2350BUz(interfaceC07449Vz2, iA0F, 2);
                        bfm2.Ai0(objAaT);
                    }
                    C9Vw.A02(bfm2, c9w52, c07409Vs, c07429Vx2, (Function0) objAaT, f2, 0);
                    AnonymousClass001.A1D(bfm2);
                } else {
                    bfm2.Afo();
                }
                return Unit.INSTANCE;
            }
        }, 2039820996), list.size());
        return Unit.INSTANCE;
    }
}
