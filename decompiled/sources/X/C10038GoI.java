package X;

/* renamed from: X.GoI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10038GoI extends AbstractC10020Gns {
    public Object A00;
    public String A01;
    public final C9516GMj A02;
    public final AbstractC10020Gns A03;

    public C10038GoI() {
        super.A02 = 0;
        super.A00 = -1;
        this.A03 = null;
        this.A02 = C9516GMj.A01;
    }

    public C10038GoI(AbstractC10020Gns abstractC10020Gns, C9517GMk c9517GMk) {
        Object obj;
        C9516GMj c9516GMj;
        super.A02 = abstractC10020Gns.A02;
        super.A00 = abstractC10020Gns.A00;
        this.A03 = abstractC10020Gns.A01();
        this.A01 = abstractC10020Gns.A02();
        if (abstractC10020Gns instanceof C10038GoI) {
            obj = ((C10038GoI) abstractC10020Gns).A00;
        } else if (abstractC10020Gns instanceof C10018Gnq) {
            obj = ((C10018Gnq) abstractC10020Gns).A01;
        } else if (abstractC10020Gns instanceof C10019Gnr) {
            obj = ((C10019Gnr) abstractC10020Gns).A04;
        } else {
            obj = null;
        }
        this.A00 = obj;
        if (abstractC10020Gns instanceof C10019Gnr) {
            C10019Gnr c10019Gnr = (C10019Gnr) abstractC10020Gns;
            c9516GMj = new C9516GMj(c9517GMk, c10019Gnr.A01, c10019Gnr.A00, -1L, -1L);
        } else {
            c9516GMj = C9516GMj.A01;
        }
        this.A02 = c9516GMj;
    }

    public C10038GoI(C10038GoI c10038GoI, int i) {
        super.A02 = i;
        super.A00 = -1;
        this.A03 = c10038GoI;
        this.A02 = c10038GoI.A02;
    }

    public C10038GoI(C9516GMj c9516GMj, AbstractC10020Gns abstractC10020Gns) {
        Object obj;
        super.A02 = abstractC10020Gns.A02;
        super.A00 = abstractC10020Gns.A00;
        this.A03 = abstractC10020Gns.A01();
        this.A01 = abstractC10020Gns.A02();
        if (abstractC10020Gns instanceof C10038GoI) {
            obj = ((C10038GoI) abstractC10020Gns).A00;
        } else if (abstractC10020Gns instanceof C10018Gnq) {
            obj = ((C10018Gnq) abstractC10020Gns).A01;
        } else if (abstractC10020Gns instanceof C10019Gnr) {
            obj = ((C10019Gnr) abstractC10020Gns).A04;
        } else {
            obj = null;
        }
        this.A00 = obj;
        this.A02 = c9516GMj;
    }
}
