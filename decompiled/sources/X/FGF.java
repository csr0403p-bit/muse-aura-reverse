package X;

import com.facebook.rendercore.RenderTreeNode;

/* loaded from: classes6.dex */
public class FGF {
    public AbstractC7837FGt A00;
    public RenderTreeNode A01;
    public boolean A02;
    public final Object A05;
    public final FGH A04 = new FGH();
    public final C7831FGm A03 = new C7831FGm();

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[EDGE_INSN: B:38:0x00b2->B:74:0x00b7 BREAK  A[LOOP:2: B:22:0x0066->B:39:0x00b4]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[EDGE_INSN: B:67:0x00c5->B:44:0x00c5 BREAK  A[LOOP:0: B:7:0x0019->B:43:0x00c1], EDGE_INSN: B:68:0x00c5->B:44:0x00c5 BREAK  A[LOOP:0: B:7:0x0019->B:43:0x00c1]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.FG1 r32) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGF.A02(X.FG1):boolean");
    }

    public static Integer A00(FGF fgf) {
        return fgf.A01.A07.AJX();
    }

    public final boolean A01() {
        C0917AHt<FG4> c0917AHt = this.A01.A07.A04.A00;
        if (c0917AHt != null && c0917AHt.A01 != 0) {
            return true;
        }
        C0917AHt<FGS> c0917AHt2 = this.A04.A00;
        return (c0917AHt2 == null || c0917AHt2.A01 == 0) ? false : true;
    }

    public FGF(RenderTreeNode renderTreeNode, Object obj) {
        this.A05 = obj;
        this.A01 = renderTreeNode;
    }
}
