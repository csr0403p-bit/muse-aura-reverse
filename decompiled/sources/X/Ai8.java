package X;

import android.graphics.Paint;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* loaded from: classes4.dex */
public final class Ai8 extends AbstractC1387AiH {
    public static final InterfaceC1330AhH A02;
    public AbstractC1383AiD A00;
    public final C1241AfX A01;

    static {
        C1776AqX c1776AqX = new C1776AqX();
        c1776AqX.Ad4(B6A.A05);
        c1776AqX.A01.setStrokeWidth(1.0f);
        c1776AqX.A01.setStyle(Paint.Style.STROKE);
        A02 = c1776AqX;
    }

    @Override // X.AbstractC1387AiH
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 A0j() {
        return this.A01;
    }

    @Override // X.AbstractC1387AiH
    public final AbstractC1383AiD A0l() {
        return this.A00;
    }

    @Override // X.AbstractC1387AiH
    public final void A0s() {
        if (this.A00 == null) {
            this.A00 = new Ai9(this);
        }
    }

    @Override // X.AbstractC1387AiH
    public final void A0u(InterfaceC1327AhE interfaceC1327AhE, GraphicsLayer graphicsLayer) throws Throwable {
        C1453AjM c1453AjM = this.A0P;
        InterfaceC1464AjX interfaceC1464AjXA00 = AbstractC1333AhK.A00(c1453AjM);
        C0910AHm<C1453AjM> c0910AHmA0C = c1453AjM.A0C();
        C1453AjM[] c1453AjMArr = c0910AHmA0C.A01;
        int i = c0910AHmA0C.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM2 = c1453AjMArr[i2];
            if (c1453AjM2.A0d.A0G.A0G) {
                try {
                    c1453AjM2.A0f.A04.A0t(interfaceC1327AhE, graphicsLayer);
                } catch (Throwable th) {
                    c1453AjM2.A0a(th);
                    throw F60.createAndThrow();
                }
            }
        }
        if (interfaceC1464AjXA00.getShowLayoutBounds()) {
            InterfaceC1330AhH interfaceC1330AhH = A02;
            long j = ((AZE) this).A03;
            interfaceC1327AhE.A9e(interfaceC1330AhH, 0.5f, 0.5f, C8j3.A0G(j) - 0.5f, AnonymousClass002.A09(j) - 0.5f);
        }
    }

    @Override // X.C3Tr
    public final int AQM(int i) {
        C1381AiB c1381AiBA00 = C1453AjM.A00(this.A0P);
        InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
        C1453AjM c1453AjM = c1381AiBA00.A01;
        return interfaceC1380AiA.maxIntrinsicHeight(c1453AjM.A0f.A04, c1453AjM.A0d.A0G.A0c(), i);
    }

    @Override // X.C3Tr
    public final int AQO(int i) {
        C1381AiB c1381AiBA00 = C1453AjM.A00(this.A0P);
        InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
        C1453AjM c1453AjM = c1381AiBA00.A01;
        return interfaceC1380AiA.maxIntrinsicWidth(c1453AjM.A0f.A04, c1453AjM.A0d.A0G.A0c(), i);
    }

    @Override // X.C3TG
    public final AZE AQW(long j) {
        if (this.A0E) {
            AbstractC1383AiD abstractC1383AiD = this.A00;
            C7384Etj.A0X(abstractC1383AiD);
            j = ((AZE) abstractC1383AiD).A04;
        }
        A0X(j);
        C1453AjM c1453AjM = this.A0P;
        C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            c1453AjMArr[i2].A0d.A0G.A0A = C79.A0C;
        }
        A0v(c1453AjM.A09.mo7measure3p2s80s(this, c1453AjM.A0d.A0G.A0c(), j));
        A0o();
        return this;
    }

    @Override // X.C3Tr
    public final int AQo(int i) {
        C1381AiB c1381AiBA00 = C1453AjM.A00(this.A0P);
        InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
        C1453AjM c1453AjM = c1381AiBA00.A01;
        return interfaceC1380AiA.minIntrinsicHeight(c1453AjM.A0f.A04, c1453AjM.A0d.A0G.A0c(), i);
    }

    @Override // X.C3Tr
    public final int AQq(int i) {
        C1381AiB c1381AiBA00 = C1453AjM.A00(this.A0P);
        InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) c1381AiBA00.A00.getValue();
        C1453AjM c1453AjM = c1381AiBA00.A01;
        return interfaceC1380AiA.minIntrinsicWidth(c1453AjM.A0f.A04, c1453AjM.A0d.A0G.A0c(), i);
    }

    public Ai8(C1453AjM c1453AjM) {
        super(c1453AjM);
        C1241AfX c1241AfX = new C1241AfX();
        this.A01 = c1241AfX;
        c1241AfX.updateCoordinator$ui(this);
        this.A00 = c1453AjM.A0B != null ? new Ai9(this) : null;
    }

    @Override // X.AbstractC1387AiH, X.AZE
    public final void A0a(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0a(graphicsLayer, f, j);
        if (((AbstractC1424Ait) this).A06) {
            return;
        }
        this.A0P.A0d.A0G.A0d();
    }

    /* JADX WARN: Incorrect types in method signature: (JFLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    @Override // X.AbstractC1387AiH, X.AZE
    public final void A0b(G0U g0u, float f, long j) {
        super.A0b(g0u, f, j);
        if (((AbstractC1424Ait) this).A06) {
            return;
        }
        this.A0P.A0d.A0G.A0d();
    }
}
