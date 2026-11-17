package X;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ff0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8493Ff0 {
    public C8497Ff4 A00;
    public final int A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C8492Fez A03(C8492Fez c8492Fez, C8490Fex c8490Fex) {
        if (this instanceof FP0) {
            FP0 fp0 = (FP0) this;
            boolean zA1Y = C60P.A1Y(c8490Fex, c8492Fez);
            C8005FOz c8005FOz = fp0.A03;
            if (c8005FOz.A02 == EnumC7946FMb.A04 && (c8490Fex.A00.A07() & 8) != 0) {
                C8497Ff4 c8497Ff4A00 = AbstractC8508FfF.A00(fp0.A02);
                fp0.A00 = Integer.valueOf(((c8497Ff4A00 == null || c8497Ff4A00.A00.A0C(8) != zA1Y) ? c8492Fez.A00 : c8492Fez.A01).A00);
            }
            C7931FLd c7931FLd = c8005FOz.A0B;
            AbstractC8162FXe.A02(null);
            Iterator<FPH> it = c7931FLd.A00.iterator();
            while (it.hasNext()) {
                it.next().AW6();
            }
        } else {
            C8477Fek c8477Fek = (C8477Fek) this;
            if ((c8490Fex.A00.A07() & 519) != 0) {
                C8345FcJ c8345FcJ = c8492Fez.A01;
                C8345FcJ c8345FcJ2 = c8492Fez.A00;
                boolean zA1P = AnonymousClass002.A1P(c8345FcJ.A01, c8345FcJ2.A01);
                boolean z = zA1P;
                if (c8345FcJ.A03 != c8345FcJ2.A03) {
                    z = (zA1P ? 1 : 0) | 2;
                }
                boolean z2 = z;
                if (c8345FcJ.A02 != c8345FcJ2.A02) {
                    z2 = (z ? 1 : 0) | 4;
                }
                int i = z2;
                if (c8345FcJ.A00 != c8345FcJ2.A00) {
                    i = (z2 ? 1 : 0) | 8;
                }
                C8j4.A1O(c8490Fex, c8477Fek.A00, i);
            }
        }
        return c8492Fez;
    }

    public C8497Ff4 A04(C8497Ff4 c8497Ff4, List<C8490Fex> list) {
        float f;
        if (!(this instanceof FP0)) {
            C8477Fek c8477Fek = (C8477Fek) this;
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i = 0;
            for (int iA00 = C60O.A00(list); iA00 >= 0; iA00--) {
                C8490Fex c8490Fex = list.get(iA00);
                Number numberA0j = BV6.A0j(c8490Fex, c8477Fek.A00);
                if (numberA0j != null) {
                    int iIntValue = numberA0j.intValue();
                    float fA05 = c8490Fex.A00.A05();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA05;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA05;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA05;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA05;
                    }
                    i |= iIntValue;
                }
            }
            C8474Feh c8474Feh = c8477Fek.A01;
            C8496Ff3 c8496Ff3 = c8497Ff4.A00;
            C8345FcJ c8345FcJA03 = C8345FcJ.A03(c8496Ff3.A04(519), c8496Ff3.A04(64));
            ArrayList<InterfaceC8476Fej> arrayList = c8474Feh.A04;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C8479Fem c8479Fem = (C8479Fem) arrayList.get(size);
                C8345FcJ c8345FcJ = c8479Fem.A02;
                ArrayList<C8480Fen> arrayList2 = c8479Fem.A05;
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    C8480Fen c8480Fen = arrayList2.get(size2);
                    int i2 = c8480Fen.A05;
                    if ((i2 & i) != 0) {
                        C8481Feo c8481Feo = c8480Fen.A07;
                        if (!c8481Feo.A08) {
                            c8481Feo.A08 = true;
                            InterfaceC8485Fes interfaceC8485Fes = c8481Feo.A07;
                            if (interfaceC8485Fes != null) {
                                ((C8482Fep) interfaceC8485Fes).A00.setVisibility(0);
                            }
                        }
                        if (i2 == 1) {
                            int i3 = c8345FcJ.A01;
                            if (i3 > 0) {
                                c8480Fen.A01(c8345FcJA03.A01 / i3);
                            }
                            f = rectF.left;
                        } else if (i2 == 2) {
                            int i4 = c8345FcJ.A03;
                            if (i4 > 0) {
                                c8480Fen.A01(c8345FcJA03.A03 / i4);
                            }
                            f = rectF.top;
                        } else if (i2 == 4) {
                            int i5 = c8345FcJ.A02;
                            if (i5 > 0) {
                                c8480Fen.A01(c8345FcJA03.A02 / i5);
                            }
                            f = rectF.right;
                        } else if (i2 == 8) {
                            int i6 = c8345FcJ.A00;
                            if (i6 > 0) {
                                c8480Fen.A01(c8345FcJA03.A00 / i6);
                            }
                            f = rectF.bottom;
                        }
                        C8481Feo c8481Feo2 = c8480Fen.A07;
                        float f2 = f * 1.0f;
                        if (c8481Feo2.A00 != f2) {
                            c8481Feo2.A00 = f2;
                            InterfaceC8485Fes interfaceC8485Fes2 = c8481Feo2.A07;
                            if (interfaceC8485Fes2 != null) {
                                ((C8482Fep) interfaceC8485Fes2).A00.setAlpha(f2);
                            }
                        }
                    }
                }
            }
        } else {
            AnonymousClass003.A0u(c8497Ff4, list);
            FP0.A00(c8497Ff4, (FP0) this);
        }
        return c8497Ff4;
    }

    public void A05(C8490Fex c8490Fex) {
        if (this instanceof FP0) {
            FP0 fp0 = (FP0) this;
            C7384Etj.A0Y(c8490Fex, 0);
            C7931FLd c7931FLd = fp0.A03.A0B;
            AbstractC8162FXe.A02(null);
            Iterator<FPH> it = c7931FLd.A00.iterator();
            while (it.hasNext()) {
                it.next().ASw();
            }
            fp0.A01 = false;
            fp0.A00 = null;
            return;
        }
        if (!(this instanceof C8477Fek)) {
            return;
        }
        C8477Fek c8477Fek = (C8477Fek) this;
        if ((c8490Fex.A00.A07() & 519) == 0) {
            return;
        }
        c8477Fek.A00.remove(c8490Fex);
        ArrayList<InterfaceC8476Fej> arrayList = c8477Fek.A01.A04;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C8479Fem c8479Fem = (C8479Fem) arrayList.get(size);
            int i = c8479Fem.A00;
            boolean zA1N = AnonymousClass002.A1N(i);
            int i2 = i - 1;
            c8479Fem.A00 = i2;
            if (zA1N && i2 == 0) {
                C8479Fem.A00(c8479Fem);
            }
        }
    }

    public void A06(C8490Fex c8490Fex) {
        if (this instanceof FP0) {
            FP0 fp0 = (FP0) this;
            C7384Etj.A0Y(c8490Fex, 0);
            fp0.A01 = true;
            fp0.A00 = null;
            C7931FLd c7931FLd = fp0.A03.A0B;
            AbstractC8162FXe.A02(null);
            Iterator<FPH> it = c7931FLd.A00.iterator();
            while (it.hasNext()) {
                it.next().AUs();
            }
            return;
        }
        if (!(this instanceof C8477Fek)) {
            return;
        }
        C8477Fek c8477Fek = (C8477Fek) this;
        if ((c8490Fex.A00.A07() & 519) == 0) {
            return;
        }
        ArrayList<InterfaceC8476Fej> arrayList = c8477Fek.A01.A04;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((C8479Fem) arrayList.get(size)).A00++;
        }
    }

    public AbstractC8493Ff0(int i) {
        this.A01 = i;
    }
}
