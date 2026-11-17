package X;

import java.util.HashMap;

/* renamed from: X.CfX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3844CfX<T> implements InterfaceC3723CdM<T> {
    public final Ce6 A00;
    public final InterfaceC3914Cgs<T, byte[]> A01;
    public final AbstractC3874Cg5 A02;
    public final InterfaceC3926Ch7 A03;
    public final String A04;

    @Override // X.InterfaceC3723CdM
    public final void AcV(AbstractC3732CdV<T> abstractC3732CdV) {
        final InterfaceC3932ChE interfaceC3932ChE = new InterfaceC3932ChE() { // from class: X.Cgh
        };
        InterfaceC3926Ch7 interfaceC3926Ch7 = this.A03;
        AbstractC3874Cg5 abstractC3874Cg5 = this.A02;
        if (abstractC3732CdV == null) {
            throw BV4.A0a("Null event");
        }
        String str = this.A04;
        if (str == null) {
            throw BV4.A0a("Null transportName");
        }
        InterfaceC3914Cgs<T, byte[]> interfaceC3914Cgs = this.A01;
        if (interfaceC3914Cgs == null) {
            throw BV4.A0a("Null transformer");
        }
        Ce6 ce6 = this.A00;
        if (ce6 == null) {
            throw BV4.A0a("Null encoding");
        }
        if (!"".isEmpty()) {
            throw BV8.A0l("");
        }
        C3847Cfc c3847Cfc = (C3847Cfc) interfaceC3926Ch7;
        InterfaceC3924Ch5 interfaceC3924Ch5 = c3847Cfc.A00;
        Ce4 ce4 = (Ce4) abstractC3732CdV;
        Ce5 ce5 = ce4.A00;
        C3867Cfw c3867Cfw = (C3867Cfw) abstractC3874Cg5;
        String str2 = c3867Cfw.A01;
        if (str2 == null) {
            throw BV4.A0a("Null backendName");
        }
        if (ce5 == null) {
            throw BV4.A0a("Null priority");
        }
        final C3867Cfw c3867CfwA00 = AbstractC3873Cg4.A00(ce5, str2, c3867Cfw.A02);
        HashMap mapA0u = BV4.A0u();
        final C3832CfL c3832CfLA00 = AbstractC3833CfM.A00(new C3853Cfi(ce6, interfaceC3914Cgs.apply(ce4.A01)), null, Long.valueOf(c3847Cfc.A02.ALc()), Long.valueOf(c3847Cfc.A03.ALc()), str, mapA0u);
        final C3857Cfm c3857Cfm = (C3857Cfm) interfaceC3924Ch5;
        c3857Cfm.A04.execute(new Runnable() { // from class: X.CfU
            public static final String __redex_internal_original_name = "DefaultScheduler$$ExternalSyntheticLambda0";

            /* JADX WARN: Code restructure failed: missing block: B:44:0x01db, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x01df, code lost:
            
                throw r0;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 493
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC3841CfU.run():void");
            }
        });
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Cg5;Ljava/lang/String;LX/Ce6;LX/Cgs<TT;[B>;LX/Ch7;)V */
    public C3844CfX(Ce6 ce6, InterfaceC3914Cgs interfaceC3914Cgs, AbstractC3874Cg5 abstractC3874Cg5, InterfaceC3926Ch7 interfaceC3926Ch7, String str) {
        this.A02 = abstractC3874Cg5;
        this.A04 = str;
        this.A00 = ce6;
        this.A01 = interfaceC3914Cgs;
        this.A03 = interfaceC3926Ch7;
    }
}
