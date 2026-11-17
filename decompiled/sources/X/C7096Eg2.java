package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Eg2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7096Eg2 {
    public final Context A00;
    public final C7101EgF A01;
    public final C7102EgG A02;
    public final C7106EgK A03;
    public final C7103EgH A04;
    public final InterfaceC7005EeA<File> A05;
    public final String A06;

    public C7096Eg2(Eg3 eg3) {
        C7101EgF c7101EgF;
        C7102EgG c7102EgG;
        this.A00 = eg3.A02;
        InterfaceC7005EeA<File> c3514CRo = eg3.A01;
        if (c3514CRo == null) {
            c3514CRo = new C3514CRo(this, 0);
            eg3.A01 = c3514CRo;
        }
        this.A06 = "image_cache";
        c3514CRo.getClass();
        this.A05 = c3514CRo;
        this.A03 = eg3.A00;
        synchronized (C7101EgF.class) {
            c7101EgF = C7101EgF.A00;
            if (c7101EgF == null) {
                c7101EgF = new C7101EgF();
                C7101EgF.A00 = c7101EgF;
            }
        }
        this.A01 = c7101EgF;
        synchronized (C7102EgG.class) {
            c7102EgG = C7102EgG.A00;
            if (c7102EgG == null) {
                c7102EgG = new C7102EgG();
                C7102EgG.A00 = c7102EgG;
            }
        }
        this.A02 = c7102EgG;
        this.A04 = C7103EgH.A00;
    }
}
