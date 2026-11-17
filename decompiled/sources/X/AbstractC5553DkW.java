package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.DkW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5553DkW {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C6154Dwx A03;
    public final C5325DgJ A04;
    public final List<C5376DhT> A05;
    public final List<C5493DjV> A06;
    public final List<C5493DjV> A07;
    public final List<C5493DjV> A08;

    public static DhD A01(List list) {
        return ((AbstractC5553DkW) list.get(0)).A03();
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Dwx;Ljava/util/List<LX/DhT;>;LX/DkX;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;Ljava/lang/String;)LX/DkW; */
    public static AbstractC5553DkW A02(C6154Dwx c6154Dwx, AbstractC5554DkX abstractC5554DkX, String str, List list, List list2, List list3, List list4, long j) {
        if (abstractC5554DkX instanceof C5556DkZ) {
            return new C5555DkY(c6154Dwx, (C5556DkZ) abstractC5554DkX, str, null, list, list2, list3, list4, j, -1L);
        }
        if (abstractC5554DkX instanceof Dl3) {
            return new C5582Dl1(c6154Dwx, (Dl3) abstractC5554DkX, list, list2, list3, list4, j);
        }
        throw C60O.A0i("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public final DhD A03() {
        return this instanceof C5555DkY ? ((C5555DkY) this).A04 : (C5582Dl1) this;
    }

    public final String A04() {
        if (this instanceof C5555DkY) {
            return ((C5555DkY) this).A05;
        }
        C5582Dl1 c5582Dl1 = (C5582Dl1) this;
        if (c5582Dl1 instanceof C5355Dgz) {
            return ((C5355Dgz) c5582Dl1).A00;
        }
        return null;
    }

    public final String A05() {
        return ((C5376DhT) C8j4.A0p(this.A05)).A03;
    }

    public final boolean A06() {
        if (this instanceof C5555DkY) {
            return false;
        }
        Dl3 dl3 = ((C5582Dl1) this).A00;
        if (dl3 instanceof Dl0) {
            return ((Dl0) dl3).A03;
        }
        return false;
    }

    public final boolean A07() {
        if (this instanceof C5555DkY) {
            return false;
        }
        Dl3 dl3 = ((C5582Dl1) this).A00;
        return (dl3 instanceof Dl0) && ((Dl0) dl3).A00 != null;
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Dwx;Ljava/util/List<LX/DhT;>;LX/DkX;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;)V */
    public AbstractC5553DkW(C6154Dwx c6154Dwx, AbstractC5554DkX abstractC5554DkX, List list, List list2, List list3, List list4, long j) {
        C5325DgJ c5325DgJ;
        C1G.A07(BV6.A1b(list));
        this.A02 = j;
        this.A05 = list;
        this.A03 = c6154Dwx;
        this.A07 = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.A06 = list3;
        this.A08 = list4;
        if (abstractC5554DkX instanceof Dl0) {
            Dl0 dl0 = (Dl0) abstractC5554DkX;
            C7408Eum c7408Eum = dl0.A01;
            if (c7408Eum != null) {
                C6154Dwx c6154Dwx2 = this.A03;
                c5325DgJ = new C5325DgJ(c7408Eum.A00(c6154Dwx2.A0Y, c6154Dwx2.A05, 0L, 0L), 0L, -1L);
            } else {
                c5325DgJ = ((AbstractC5554DkX) dl0).A02;
            }
        } else {
            c5325DgJ = abstractC5554DkX.A02;
        }
        this.A04 = c5325DgJ;
        this.A01 = BV8.A0I(abstractC5554DkX.A00, abstractC5554DkX.A01);
        this.A00 = abstractC5554DkX instanceof Dl3 ? ((Dl3) abstractC5554DkX).A03 : 0L;
    }

    public static C6154Dwx A00(List list, int i) {
        return ((AbstractC5553DkW) list.get(i)).A03;
    }
}
