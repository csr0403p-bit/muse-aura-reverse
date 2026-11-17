package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Dfm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5303Dfm extends F2N {
    public C5305Dfo<C2Kw, C5313Dfw> A00 = new C5305Dfo<>();
    public EnumC10573Huf A01;
    public ArrayList<EnumC10573Huf> A02;
    public boolean A03;
    public int A04;
    public boolean A05;
    public final BLG<EnumC10573Huf> A06;
    public final WeakReference<C1HY> A07;
    public final boolean A08;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // X.F2N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C2Kw r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5303Dfm.A04(X.2Kw):void");
    }

    @Override // X.F2N
    public final void A05(C2Kw c2Kw) {
        C7384Etj.A0Y(c2Kw, 0);
        A03("removeObserver");
        this.A00.A01(c2Kw);
    }

    public final void A07(EnumC10573Huf enumC10573Huf) {
        C7384Etj.A0Y(enumC10573Huf, 0);
        A03("setCurrentState");
        A02(enumC10573Huf);
    }

    private final EnumC10573Huf A00(C2Kw c2Kw) {
        C5313Dfw value;
        HashMap<C2Kw, C5307Dfq<C2Kw, C5313Dfw>> map = this.A00.A00;
        C5307Dfq<C2Kw, C5313Dfw> c5307Dfq = map.containsKey(c2Kw) ? map.get(c2Kw).A01 : null;
        EnumC10573Huf enumC10573Huf = (c5307Dfq == null || (value = c5307Dfq.getValue()) == null) ? null : value.A00;
        ArrayList<EnumC10573Huf> arrayList = this.A02;
        EnumC10573Huf enumC10573Huf2 = arrayList.isEmpty() ? null : arrayList.get(arrayList.size() - 1);
        EnumC10573Huf enumC10573Huf3 = this.A01;
        if (enumC10573Huf != null && enumC10573Huf.compareTo(enumC10573Huf3) < 0) {
            enumC10573Huf3 = enumC10573Huf;
        }
        return (enumC10573Huf2 == null || enumC10573Huf2.compareTo(enumC10573Huf3) >= 0) ? enumC10573Huf3 : enumC10573Huf2;
    }

    private final void A01() {
        EnumC3085Bxl enumC3085Bxl;
        C1HY c1hy = this.A07.get();
        if (c1hy == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C5305Dfo<C2Kw, C5313Dfw> c5305Dfo = this.A00;
            boolean z = true;
            if (((C5304Dfn) c5305Dfo).A00 != 0) {
                C5307Dfq<C2Kw, C5313Dfw> c5307Dfq = c5305Dfo.A02;
                C7384Etj.A0X(c5307Dfq);
                EnumC10573Huf enumC10573Huf = c5307Dfq.getValue().A00;
                C5307Dfq<C2Kw, C5313Dfw> c5307Dfq2 = this.A00.A01;
                C7384Etj.A0X(c5307Dfq2);
                EnumC10573Huf enumC10573Huf2 = c5307Dfq2.getValue().A00;
                if (enumC10573Huf != enumC10573Huf2 || this.A01 != enumC10573Huf2) {
                    z = false;
                }
            }
            this.A03 = false;
            if (z) {
                this.A06.Af8(this.A01);
                return;
            }
            EnumC10573Huf enumC10573Huf3 = this.A01;
            C5307Dfq<C2Kw, C5313Dfw> c5307Dfq3 = this.A00.A02;
            C7384Etj.A0X(c5307Dfq3);
            if (enumC10573Huf3.compareTo(c5307Dfq3.getValue().A00) < 0) {
                C5305Dfo<C2Kw, C5313Dfw> c5305Dfo2 = this.A00;
                C5307Dfq c5307Dfq4 = c5305Dfo2.A01;
                C5307Dfq c5307Dfq5 = c5305Dfo2.A02;
                C5316Dfz c5316Dfz = new C5316Dfz();
                c5316Dfz.A00 = c5307Dfq5;
                c5316Dfz.A01 = c5307Dfq4;
                c5305Dfo2.A03.put(c5316Dfz, false);
                while (c5316Dfz.hasNext() && !this.A03) {
                    Map.Entry entry = (Map.Entry) c5316Dfz.next();
                    C7384Etj.A0X(entry);
                    Object key = entry.getKey();
                    C5313Dfw c5313Dfw = (C5313Dfw) entry.getValue();
                    while (c5313Dfw.A00.compareTo(this.A01) > 0 && !this.A03 && this.A00.A00.containsKey(key)) {
                        EnumC3085Bxl enumC3085BxlA00 = EnumC3085Bxl.A00(c5313Dfw.A00);
                        if (enumC3085BxlA00 == null) {
                            StringBuilder sb = new StringBuilder("no event down from ");
                            sb.append(c5313Dfw.A00);
                            throw new IllegalStateException(sb.toString());
                        }
                        EnumC10573Huf enumC10573HufA01 = enumC3085BxlA00.A01();
                        ArrayList<EnumC10573Huf> arrayList = this.A02;
                        arrayList.add(enumC10573HufA01);
                        c5313Dfw.A00(c1hy, enumC3085BxlA00);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            C5307Dfq<C2Kw, C5313Dfw> c5307Dfq6 = this.A00.A01;
            if (!this.A03 && c5307Dfq6 != null && this.A01.compareTo(c5307Dfq6.getValue().A00) > 0) {
                C5305Dfo<C2Kw, C5313Dfw> c5305Dfo3 = this.A00;
                C5311Dfu c5311Dfu = new C5311Dfu(c5305Dfo3);
                c5305Dfo3.A03.put(c5311Dfu, false);
                while (c5311Dfu.hasNext() && !this.A03) {
                    Map.Entry entry2 = (Map.Entry) c5311Dfu.next();
                    Object key2 = entry2.getKey();
                    C5313Dfw c5313Dfw2 = (C5313Dfw) entry2.getValue();
                    while (c5313Dfw2.A00.compareTo(this.A01) < 0 && !this.A03 && this.A00.A00.containsKey(key2)) {
                        EnumC10573Huf enumC10573Huf4 = c5313Dfw2.A00;
                        ArrayList<EnumC10573Huf> arrayList2 = this.A02;
                        arrayList2.add(enumC10573Huf4);
                        C7384Etj.A0Y(enumC10573Huf4, 0);
                        int iOrdinal = enumC10573Huf4.ordinal();
                        if (iOrdinal == 2) {
                            enumC3085Bxl = EnumC3085Bxl.ON_START;
                        } else if (iOrdinal == 3) {
                            enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
                        } else {
                            if (iOrdinal != 1) {
                                StringBuilder sb2 = new StringBuilder("no event up from ");
                                sb2.append(c5313Dfw2.A00);
                                throw new IllegalStateException(sb2.toString());
                            }
                            enumC3085Bxl = EnumC3085Bxl.ON_CREATE;
                        }
                        c5313Dfw2.A00(c1hy, enumC3085Bxl);
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                }
            }
        }
    }

    private final void A02(EnumC10573Huf enumC10573Huf) {
        EnumC10573Huf enumC10573Huf2 = this.A01;
        if (enumC10573Huf2 != enumC10573Huf) {
            C1HY c1hy = this.A07.get();
            if (enumC10573Huf2 == EnumC10573Huf.A04 && enumC10573Huf == EnumC10573Huf.A03) {
                StringBuilder sb = new StringBuilder("State must be at least '");
                sb.append(EnumC10573Huf.A02);
                sb.append("' to be moved to '");
                sb.append(enumC10573Huf);
                sb.append("' in component ");
                sb.append(c1hy);
                throw new IllegalStateException(sb.toString());
            }
            EnumC10573Huf enumC10573Huf3 = EnumC10573Huf.A03;
            if (enumC10573Huf2 == enumC10573Huf3) {
                StringBuilder sb2 = new StringBuilder("State is '");
                sb2.append(enumC10573Huf3);
                sb2.append("' and cannot be moved to `");
                sb2.append(enumC10573Huf);
                sb2.append("` in component ");
                sb2.append(c1hy);
                throw new IllegalStateException(sb2.toString());
            }
            this.A01 = enumC10573Huf;
            if (this.A05 || this.A04 != 0) {
                this.A03 = true;
                return;
            }
            this.A05 = true;
            A01();
            this.A05 = false;
            if (this.A01 == enumC10573Huf3) {
                this.A00 = new C5305Dfo<>();
            }
        }
    }

    private final void A03(String str) {
        if (this.A08 && !Dg0.A00().A03()) {
            throw new IllegalStateException(FGI.A0U("Method ", str, " must be called on the main thread"));
        }
    }

    public final void A06(EnumC3085Bxl enumC3085Bxl) {
        A03("handleLifecycleEvent");
        A02(enumC3085Bxl.A01());
    }

    public C5303Dfm(C1HY c1hy, boolean z) {
        this.A08 = z;
        EnumC10573Huf enumC10573Huf = EnumC10573Huf.A04;
        this.A01 = enumC10573Huf;
        this.A02 = C3cG.A0h();
        this.A07 = BV4.A0q(c1hy);
        this.A06 = new C9286GCn(enumC10573Huf);
    }
}
