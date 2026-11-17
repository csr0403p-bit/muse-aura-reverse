package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.05h, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05h extends AbstractC7559F3s implements G2j<AP1, BRg, BFM, Integer, Unit> {
    public final /* synthetic */ G0W<AP1, BFM, Integer, Unit> $content;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05h(BRg bRg, G0W<? super AP1, ? super BFM, ? super Integer, Unit> g0w) {
        super(4);
        this.$modifier = bRg;
        this.$content = g0w;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Unit invoke(AP1 ap1, BRg bRg, BFM bfm, Integer num) {
        BRg bRg2 = bRg;
        BFM bfm2 = bfm;
        int iA0F = AnonymousClass001.A0F(num);
        int iA0d = (iA0F & 6) == 0 ? AnonymousClass004.A0d(bfm2, ap1) | iA0F : iA0F;
        if ((iA0F & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm2, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm2, iA0d)) {
            BRg bRgThen = this.$modifier.then(bRg2);
            G0W<AP1, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm2;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm2, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function0);
            AnonymousClass003.A0o(bfm2, interfaceC1380AiAA0c, akqA04);
            BPg.A01(bfm2, Integer.valueOf(iA0J), C1515AkP.A03);
            AnonymousClass003.A0n(bfm2, bRgA01);
            AnonymousClass004.A1B(bbi, ap1, bfm2, g0w, iA0d & 14);
        } else {
            bfm2.Afo();
        }
        return Unit.INSTANCE;
    }
}
