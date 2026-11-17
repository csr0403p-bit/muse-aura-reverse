package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.3bQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bQ implements Ht9, G0V {
    public final int $t;
    public final Object A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int iA0B;
        Object next;
        Object objValueOf;
        int length;
        switch (this.$t) {
            case 2:
                G0W g0w = (G0W) this.A00;
                BFM bfm = (BFM) obj;
                int iA0F = AnonymousClass001.A0F(obj2);
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(iA0F), bfm, iA0F)) {
                    AnonymousClass001.A1G(C0ce.A01, bfm, g0w, 6);
                } else {
                    bfm.Afo();
                }
                return Unit.INSTANCE;
            case 3:
                G0V g0v = (G0V) this.A00;
                ArrayList arrayList = new ArrayList();
                Iterator itA0n = AnonymousClass002.A0n((Map) g0v.invoke(obj, obj2));
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            case 4:
                char[] cArr = (char[]) this.A00;
                CharSequence charSequence = (CharSequence) obj;
                int iA0F2 = AnonymousClass001.A0F(obj2);
                C7384Etj.A0Y(charSequence, 2);
                int iA0D = C7BY.A0D(charSequence, cArr, iA0F2);
                if (iA0D < 0) {
                    return null;
                }
                objValueOf = Integer.valueOf(iA0D);
                length = 1;
                break;
            case 5:
                List list = (List) this.A00;
                CharSequence charSequence2 = (CharSequence) obj;
                int iA0F3 = AnonymousClass001.A0F(obj2);
                C7384Etj.A0Y(charSequence2, 2);
                if (list.size() == 1) {
                    next = (String) AbstractC0878AGe.A0J(list);
                    iA0B = C7BY.A0B(charSequence2, next, iA0F3, false);
                    if (iA0B < 0) {
                        return null;
                    }
                } else {
                    if (iA0F3 < 0) {
                        iA0F3 = 0;
                    }
                    ADq aDq = new ADq(iA0F3, charSequence2.length());
                    boolean z = charSequence2 instanceof String;
                    iA0B = aDq.A00;
                    int i = aDq.A01;
                    int i2 = aDq.A02;
                    if (z) {
                        if (i2 > 0) {
                            if (iA0B > i) {
                                return null;
                            }
                        } else if (i2 >= 0 || i > iA0B) {
                            return null;
                        }
                        while (true) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    String str = (String) next;
                                    String str2 = (String) charSequence2;
                                    int length2 = str.length();
                                    C7384Etj.A0Y(str2, 2);
                                    if (str.regionMatches(0, str2, iA0B, length2)) {
                                        if (next != 0) {
                                        }
                                    }
                                }
                            }
                            if (iA0B == i) {
                                return null;
                            }
                            iA0B += i2;
                        }
                    } else {
                        if (i2 > 0) {
                            if (iA0B > i) {
                                return null;
                            }
                        } else if (i2 >= 0 || i > iA0B) {
                            return null;
                        }
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str3 = (String) next;
                                    if (C7BY.A0p(str3, charSequence2, 0, iA0B, str3.length(), false)) {
                                        if (next != 0) {
                                        }
                                    }
                                }
                            }
                            if (iA0B == i) {
                                return null;
                            }
                            iA0B += i2;
                        }
                    }
                }
                HxE hxE = new HxE(Integer.valueOf(iA0B), next);
                objValueOf = hxE.first;
                length = ((String) hxE.second).length();
                break;
            default:
                C1051ASv c1051ASv = (C1051ASv) this.A00;
                float fA02 = AnonymousClass001.A02(obj2);
                ((C1299Agk) obj).A02();
                c1051ASv.element = fA02;
                return Unit.INSTANCE;
        }
        return AnonymousClass002.A0p(objValueOf, length);
    }

    public C3bQ(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }
}
