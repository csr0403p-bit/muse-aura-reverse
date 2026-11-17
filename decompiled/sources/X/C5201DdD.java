package X;

import android.os.Looper;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Vector;

/* renamed from: X.DdD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5201DdD {
    public HandlerC5202DdE A00;
    public C5205DdH A01;
    public final AbstractC5200DdC A02;
    public final AbstractC5200DdC A03;
    public final AbstractC5200DdC A04;
    public final AbstractC5200DdC A05;
    public final AbstractC5200DdC A06;
    public final AbstractC5200DdC A07;
    public final AbstractC5200DdC A08;
    public final AbstractC5200DdC A09;
    public final AbstractC5200DdC A0A;
    public final AbstractC5200DdC A0B;
    public final AbstractC5200DdC A0C;
    public final AbstractC5200DdC A0D;
    public final AbstractC5200DdC A0E;
    public final AbstractC5200DdC A0F;
    public final AbstractC5200DdC A0G;
    public final AbstractC5200DdC A0H;
    public final AbstractC5200DdC A0I;
    public final C5207DdJ<C5210DdM> A0J;

    public C5201DdD(Looper looper, C4025CkE c4025CkE, InterfaceC4036Ckc interfaceC4036Ckc, CGw cGw, C5207DdJ c5207DdJ, C4oT c4oT) {
        HandlerC5202DdE handlerC5202DdE = new HandlerC5202DdE(looper);
        handlerC5202DdE.A0B = false;
        handlerC5202DdE.A05 = new C5214DdQ();
        handlerC5202DdE.A00 = -1;
        C5212DdO c5212DdO = new C5212DdO(handlerC5202DdE);
        handlerC5202DdE.A06 = c5212DdO;
        handlerC5202DdE.A07 = new C5213DdP(handlerC5202DdE);
        handlerC5202DdE.A0A = BV4.A0u();
        handlerC5202DdE.A09 = C3cG.A0h();
        handlerC5202DdE.A08 = this;
        HandlerC5202DdE.A00(c5212DdO, handlerC5202DdE);
        HandlerC5202DdE.A00(handlerC5202DdE.A07, handlerC5202DdE);
        this.A00 = handlerC5202DdE;
        this.A0J = c5207DdJ;
        this.A01 = new C5205DdH(new C5208DdK());
        F48 f48 = new F48(c4025CkE, this, cGw, C79.A00, 0);
        this.A04 = f48;
        F48 f482 = new F48(c4025CkE, this, cGw, C79.A01, 1);
        this.A0F = f482;
        F49 f49 = new F49(c4025CkE, interfaceC4036Ckc, this, c4oT, C79.A0C, 0);
        this.A09 = f49;
        F47 f47 = new F47(c4025CkE, this, C79.A0K, 2);
        this.A0G = f47;
        F49 f492 = new F49(c4025CkE, interfaceC4036Ckc, this, c4oT, C79.A0P, 2);
        this.A0B = f492;
        F47 f472 = new F47(c4025CkE, this, C79.A0T, 3);
        this.A0I = f472;
        F49 f493 = new F49(c4025CkE, interfaceC4036Ckc, this, c4oT, C79.A0W, 1);
        this.A0A = f493;
        F46 f46 = new F46(this, C79.A0Z, 2);
        this.A0E = f46;
        F46 f462 = new F46(this, C79.A0Y, 5);
        this.A0H = f462;
        F47 f473 = new F47(this, cGw, C79.A06, 0);
        this.A05 = f473;
        F47 f474 = new F47(this, cGw, C79.A0c, 1);
        this.A0C = f474;
        F46 f463 = new F46(this, C79.A07, 0);
        this.A02 = f463;
        C5197Dd9 c5197Dd9 = new C5197Dd9(c4025CkE, interfaceC4036Ckc, this, cGw, c4oT, C79.A02);
        this.A06 = c5197Dd9;
        F46 f464 = new F46(this, C79.A03, 3);
        this.A07 = f464;
        F46 f465 = new F46(this, C79.A04, 4);
        this.A08 = f465;
        F46 f466 = new F46(this, C79.A05, 1);
        this.A0D = f466;
        C5215DdR c5215DdR = new C5215DdR(C79.A08);
        this.A03 = c5215DdR;
        HandlerC5202DdE.A00(f48, handlerC5202DdE);
        A00(f482, f49, f47, f492, this);
        A00(f472, f493, f462, f46, this);
        A00(f473, f474, f463, c5197Dd9, this);
        A00(f464, f465, f466, c5215DdR, this);
        this.A00.A04 = f48;
    }

    public static void A00(C5211DdN c5211DdN, C5211DdN c5211DdN2, C5211DdN c5211DdN3, C5211DdN c5211DdN4, C5201DdD c5201DdD) {
        HandlerC5202DdE.A00(c5211DdN, c5201DdD.A00);
        HandlerC5202DdE.A00(c5211DdN2, c5201DdD.A00);
        HandlerC5202DdE.A00(c5211DdN3, c5201DdD.A00);
        HandlerC5202DdE.A00(c5211DdN4, c5201DdD.A00);
    }

    public static final void A01(C5201DdD c5201DdD, AbstractC5200DdC abstractC5200DdC, C5208DdK c5208DdK) {
        Integer num = abstractC5200DdC.A00;
        C7384Etj.A0Y(num, 0);
        c5208DdK.A04 = num;
        C5205DdH c5205DdH = new C5205DdH(c5208DdK);
        c5201DdD.A01 = c5205DdH;
        C5207DdJ<C5210DdM> c5207DdJ = c5201DdD.A0J;
        C5210DdM c5210DdM = new C5210DdM(c5205DdH);
        HandlerC5206DdI handlerC5206DdI = c5207DdJ.A04;
        if (handlerC5206DdI == null) {
            throw C3cG.A0Q("To dispatch asynchronously constructor must be provided a looper");
        }
        BV4.A1D(handlerC5206DdI, c5210DdM, 1);
        c5201DdD.A00.A03 = abstractC5200DdC;
    }

    public final String toString() throws IOException {
        int i;
        int size;
        C5204DdG c5204DdG;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(FGI.A0M("AuthManagerImplStateMachine", ":"));
        HandlerC5202DdE handlerC5202DdE = this.A00;
        if (handlerC5202DdE == null) {
            i = 0;
        } else {
            C5214DdQ c5214DdQ = handlerC5202DdE.A05;
            synchronized (c5214DdQ) {
                i = c5214DdQ.A00;
            }
        }
        printWriter.println(FGI.A0H(" total records=", i));
        int i2 = 0;
        while (true) {
            HandlerC5202DdE handlerC5202DdE2 = this.A00;
            if (handlerC5202DdE2 == null) {
                size = 0;
            } else {
                C5214DdQ c5214DdQ2 = handlerC5202DdE2.A05;
                synchronized (c5214DdQ2) {
                    size = c5214DdQ2.A02.size();
                }
            }
            if (i2 >= size) {
                break;
            }
            HandlerC5202DdE handlerC5202DdE3 = this.A00;
            if (handlerC5202DdE3 != null) {
                C5214DdQ c5214DdQ3 = handlerC5202DdE3.A05;
                synchronized (c5214DdQ3) {
                    int i3 = c5214DdQ3.A01 + i2;
                    if (i3 >= 20) {
                        i3 -= 20;
                    }
                    Vector<C5204DdG> vector = c5214DdQ3.A02;
                    c5204DdG = i3 >= vector.size() ? null : vector.get(i3);
                }
            }
            printWriter.println(FGI.A0W(" rec[", "]: ", c5204DdG.toString(), i2));
            printWriter.flush();
            i2++;
        }
        HandlerC5202DdE handlerC5202DdE4 = this.A00;
        printWriter.println(FGI.A0M("curState=", (handlerC5202DdE4 == null ? null : handlerC5202DdE4.A0C[handlerC5202DdE4.A00].A00).A02()));
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }
}
