package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class B91 {
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/B9B;>;LX/ApY;I)Ljava/util/List<LX/B9B;>; */
    public static final List A00(C1736ApY c1736ApY, List list, int i) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            B9B b9b = (B9B) obj;
            if (C7384Etj.areEqual(b9b.getWeight(), c1736ApY) && b9b.mo21getStyle_LCdwA() == i) {
                arrayListA0t.add(obj);
            }
        }
        if (arrayListA0t.isEmpty()) {
            ArrayList arrayListA0t2 = C60Q.A0t(list);
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                Object obj2 = list.get(i4);
                if (((B9B) obj2).mo21getStyle_LCdwA() == i) {
                    arrayListA0t2.add(obj2);
                }
            }
            if (!arrayListA0t2.isEmpty()) {
                list = arrayListA0t2;
            }
            int i5 = c1736ApY.A00;
            C1736ApY c1736ApY2 = null;
            if (C7384Etj.A00(i5, 400) < 0) {
                int size3 = list.size();
                C1736ApY c1736ApY3 = null;
                int i6 = 0;
                while (true) {
                    if (i6 < size3) {
                        C1736ApY weight = ((B9B) list.get(i6)).getWeight();
                        if (C7384Etj.A00(weight.A00, i5) >= 0) {
                            if (C7384Etj.A00(weight.A00, i5) <= 0) {
                                c1736ApY2 = weight;
                                break;
                            }
                            if (c1736ApY3 == null || C7384Etj.A00(weight.A00, c1736ApY3.A00) < 0) {
                                c1736ApY3 = weight;
                            }
                        } else if (c1736ApY2 == null || C7384Etj.A00(weight.A00, c1736ApY2.A00) > 0) {
                            c1736ApY2 = weight;
                        }
                        i6++;
                    } else if (c1736ApY2 == null) {
                        c1736ApY2 = c1736ApY3;
                    }
                }
                arrayListA0t = C60Q.A0t(list);
                int size4 = list.size();
                while (i2 < size4) {
                    Object obj3 = list.get(i2);
                    if (C7384Etj.areEqual(((B9B) obj3).getWeight(), c1736ApY2)) {
                        arrayListA0t.add(obj3);
                    }
                    i2++;
                }
            } else {
                int iA00 = C7384Etj.A00(i5, 500);
                int size5 = list.size();
                C1736ApY c1736ApY4 = null;
                int i7 = 0;
                if (iA00 <= 0) {
                    C1736ApY c1736ApY5 = null;
                    while (true) {
                        if (i7 < size5) {
                            C1736ApY weight2 = ((B9B) list.get(i7)).getWeight();
                            if (C7384Etj.A00(weight2.A00, 500) <= 0) {
                                if (C7384Etj.A00(weight2.A00, i5) >= 0) {
                                    if (C7384Etj.A00(weight2.A00, i5) <= 0) {
                                        c1736ApY4 = weight2;
                                        break;
                                    }
                                    if (c1736ApY4 == null || C7384Etj.A00(weight2.A00, c1736ApY4.A00) < 0) {
                                        c1736ApY4 = weight2;
                                    }
                                } else if (c1736ApY5 == null || C7384Etj.A00(weight2.A00, c1736ApY5.A00) > 0) {
                                    c1736ApY5 = weight2;
                                }
                            }
                            i7++;
                        } else if (c1736ApY4 != null) {
                            break;
                        }
                    }
                    c1736ApY5 = c1736ApY4;
                    arrayListA0t = C60Q.A0t(list);
                    int size6 = list.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        Object obj4 = list.get(i8);
                        if (C7384Etj.areEqual(((B9B) obj4).getWeight(), c1736ApY5)) {
                            arrayListA0t.add(obj4);
                        }
                    }
                    if (arrayListA0t.isEmpty()) {
                        int size7 = list.size();
                        C1736ApY c1736ApY6 = null;
                        int i9 = 0;
                        while (true) {
                            if (i9 < size7) {
                                C1736ApY weight3 = ((B9B) list.get(i9)).getWeight();
                                if (C7384Etj.A00(weight3.A00, 500) >= 0) {
                                    if (C7384Etj.A00(weight3.A00, i5) >= 0) {
                                        if (C7384Etj.A00(weight3.A00, i5) <= 0) {
                                            c1736ApY6 = weight3;
                                            break;
                                        }
                                        if (c1736ApY6 == null || C7384Etj.A00(weight3.A00, c1736ApY6.A00) < 0) {
                                            c1736ApY6 = weight3;
                                        }
                                    } else if (c1736ApY2 == null || C7384Etj.A00(weight3.A00, c1736ApY2.A00) > 0) {
                                        c1736ApY2 = weight3;
                                    }
                                }
                                i9++;
                            } else if (c1736ApY6 != null) {
                                break;
                            }
                        }
                        c1736ApY2 = c1736ApY6;
                        arrayListA0t = C60Q.A0t(list);
                        int size8 = list.size();
                        while (i2 < size8) {
                            Object obj5 = list.get(i2);
                            if (C7384Etj.areEqual(((B9B) obj5).getWeight(), c1736ApY2)) {
                                arrayListA0t.add(obj5);
                            }
                            i2++;
                        }
                    }
                } else {
                    while (true) {
                        if (i7 < size5) {
                            C1736ApY weight4 = ((B9B) list.get(i7)).getWeight();
                            if (C7384Etj.A00(weight4.A00, i5) >= 0) {
                                if (C7384Etj.A00(weight4.A00, i5) <= 0) {
                                    c1736ApY4 = weight4;
                                    break;
                                }
                                if (c1736ApY4 == null || C7384Etj.A00(weight4.A00, c1736ApY4.A00) < 0) {
                                    c1736ApY4 = weight4;
                                }
                            } else if (c1736ApY2 == null || C7384Etj.A00(weight4.A00, c1736ApY2.A00) > 0) {
                                c1736ApY2 = weight4;
                            }
                            i7++;
                        } else if (c1736ApY4 != null) {
                            break;
                        }
                    }
                    c1736ApY2 = c1736ApY4;
                    arrayListA0t = C60Q.A0t(list);
                    int size9 = list.size();
                    while (i2 < size9) {
                        Object obj6 = list.get(i2);
                        if (C7384Etj.areEqual(((B9B) obj6).getWeight(), c1736ApY2)) {
                            arrayListA0t.add(obj6);
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayListA0t;
    }
}
