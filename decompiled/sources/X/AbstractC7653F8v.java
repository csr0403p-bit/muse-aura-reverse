package X;

import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F8v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7653F8v {
    public static String A01(F94 f94) {
        if (f94.AXm().AOn()) {
            return null;
        }
        return f94.AXm().AgW();
    }

    public static C10453Hir A00(F9C f9c, F94 f94) {
        HashMap mapA0u;
        String strAgW;
        C10453Hir c10453Hir = new C10453Hir();
        Integer numAXl = f94.AXl();
        Integer num = C79.A0C;
        if (numAXl != num) {
            f94.Afp();
            return null;
        }
        while (true) {
            Integer numARK = f94.ARK();
            Integer num2 = C79.A0K;
            if (numARK == num2) {
                return c10453Hir;
            }
            String strAXk = f94.AXk();
            boolean zA1P = BV5.A1P(FBK.A00(strAXk), 32);
            f94.ARK();
            if (!zA1P) {
                if ("payload".equals(strAXk)) {
                    c10453Hir.A01 = F94.A01(f94);
                } else if (AgeCheckFunnelLogging.KEY_LAYOUT.equals(strAXk)) {
                    Hsf hsf = new Hsf();
                    if (f94.AXl() != num) {
                        f94.Afp();
                        hsf = null;
                    } else {
                        while (f94.ARK() != num2) {
                            String strAXk2 = f94.AXk();
                            boolean zA1P2 = BV5.A1P(FBK.A00(strAXk2), 32);
                            f94.ARK();
                            if (!zA1P2 && "bloks_payload".equals(strAXk2)) {
                                F9C f9c2 = new F9C(f9c);
                                F61 f61 = new F61();
                                if (f94.AXl() != num) {
                                    f94.Afp();
                                    f61 = null;
                                } else {
                                    while (f94.ARK() != num2) {
                                        String strAXk3 = f94.AXk();
                                        boolean zA1P3 = BV5.A1P(FBK.A00(strAXk3), 32);
                                        f94.ARK();
                                        if (!zA1P3) {
                                            if ("action".equals(strAXk3)) {
                                                F95 f95AXm = f94.AXm();
                                                F9C f9c3 = new F9C(f9c2);
                                                f9c3.A00("action");
                                                F99 f99 = new F99(null);
                                                f61.A04 = F93.A00(new F9E(f9c3, new F9F(f99.A00, f99.A01)), f95AXm);
                                            } else if ("tree".equals(strAXk3)) {
                                                F9C f9c4 = new F9C(f9c2);
                                                f9c4.A00("tree");
                                                f61.A00 = AbstractC7654F8w.A01(f9c4, f94);
                                            } else {
                                                ArrayList arrayListA0h = null;
                                                ArrayList arrayListA0h2 = null;
                                                ArrayList arrayListA0h3 = null;
                                                ArrayList arrayListA0h4 = null;
                                                ArrayList arrayListA0h5 = null;
                                                ArrayList arrayListA0h6 = null;
                                                ArrayList arrayListA0h7 = null;
                                                ArrayList arrayListA0h8 = null;
                                                ArrayList arrayListA0h9 = null;
                                                ArrayList arrayListA0h10 = null;
                                                Hnz hnz = null;
                                                C10489Hlr c10489Hlr = null;
                                                ArrayList arrayListA0h11 = null;
                                                ArrayList arrayListA0h12 = null;
                                                F6w f6w = null;
                                                ArrayList arrayListA0h13 = null;
                                                if ("data".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h2 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F6K f6k = new F6K();
                                                            if (f94.AXl() != num) {
                                                                f94.Afp();
                                                            } else {
                                                                while (f94.ARK() != num2) {
                                                                    String strAXk4 = f94.AXk();
                                                                    boolean zA1P4 = BV5.A1P(FBK.A00(strAXk4), 32);
                                                                    f94.ARK();
                                                                    if (!zA1P4) {
                                                                        if ("id".equals(strAXk4)) {
                                                                            f6k.A01 = A01(f94);
                                                                        } else if ("type".equals(strAXk4)) {
                                                                            f6k.A02 = A01(f94);
                                                                        } else if ("data".equals(strAXk4)) {
                                                                            f6k.A03 = AbstractC7655F8x.A01(f94);
                                                                        } else if ("scoped".equals(strAXk4)) {
                                                                            f6k.A00 = F94.A00(f94);
                                                                        }
                                                                    }
                                                                    f94.Afp();
                                                                }
                                                                arrayListA0h2.add(f6k);
                                                            }
                                                        }
                                                    }
                                                    f61.A07 = arrayListA0h2;
                                                } else if ("embedded_payloads".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h3 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            C7616F6s c7616F6sA00 = AbstractC7656F8y.A00(f9c2, f94, "embedded_payloads");
                                                            if (c7616F6sA00 != null) {
                                                                arrayListA0h3.add(c7616F6sA00);
                                                            }
                                                        }
                                                    }
                                                    f61.A08 = arrayListA0h3;
                                                } else if ("referenced".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h4 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F94.A02(f94, arrayListA0h4);
                                                        }
                                                    }
                                                    f61.A0H = arrayListA0h4;
                                                } else if ("referenced_external".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h5 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F94.A02(f94, arrayListA0h5);
                                                        }
                                                    }
                                                    f61.A0D = arrayListA0h5;
                                                } else if ("referenced_embedded_payloads".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h6 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F94.A02(f94, arrayListA0h6);
                                                        }
                                                    }
                                                    f61.A0C = arrayListA0h6;
                                                } else if ("referenced_templates".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h7 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F94.A02(f94, arrayListA0h7);
                                                        }
                                                    }
                                                    f61.A0F = arrayListA0h7;
                                                } else if ("referenced_ft_entries".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h8 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F94.A02(f94, arrayListA0h8);
                                                        }
                                                    }
                                                    f61.A0E = arrayListA0h8;
                                                } else if ("referenced_values".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h9 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F94.A02(f94, arrayListA0h9);
                                                        }
                                                    }
                                                    f61.A0G = arrayListA0h9;
                                                } else if ("props".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h10 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F97 f97 = new F97();
                                                            if (f94.AXl() != num) {
                                                                f94.Afp();
                                                            } else {
                                                                while (f94.ARK() != num2) {
                                                                    String strAXk5 = f94.AXk();
                                                                    boolean zA1P5 = BV5.A1P(FBK.A00(strAXk5), 32);
                                                                    f94.ARK();
                                                                    if (!zA1P5) {
                                                                        if ("id".equals(strAXk5)) {
                                                                            f97.A00 = A01(f94);
                                                                        } else if ("name".equals(strAXk5)) {
                                                                            f97.A01 = A01(f94);
                                                                        }
                                                                    }
                                                                    f94.Afp();
                                                                }
                                                                arrayListA0h10.add(f97);
                                                            }
                                                        }
                                                    }
                                                    f61.A0A = arrayListA0h10;
                                                } else if ("error_attribution".equals(strAXk3)) {
                                                    Hnz hnz2 = new Hnz();
                                                    if (f94.AXl() != num) {
                                                        f94.Afp();
                                                    } else {
                                                        while (f94.ARK() != num2) {
                                                            String strAXk6 = f94.AXk();
                                                            boolean zA1P6 = BV5.A1P(FBK.A00(strAXk6), 32);
                                                            f94.ARK();
                                                            if (!zA1P6) {
                                                                if ("logging_id".equals(strAXk6)) {
                                                                    hnz2.A00 = A01(f94);
                                                                } else if ("source_map_id".equals(strAXk6)) {
                                                                    hnz2.A01 = A01(f94);
                                                                }
                                                            }
                                                            f94.Afp();
                                                        }
                                                        hnz = hnz2;
                                                    }
                                                    f61.A01 = hnz;
                                                } else if ("step_debugger_metadata".equals(strAXk3)) {
                                                    C10489Hlr c10489Hlr2 = new C10489Hlr();
                                                    if (f94.AXl() != num) {
                                                        f94.Afp();
                                                    } else {
                                                        while (f94.ARK() != num2) {
                                                            String strAXk7 = f94.AXk();
                                                            boolean zA1P7 = BV5.A1P(FBK.A00(strAXk7), 32);
                                                            f94.ARK();
                                                            if (!zA1P7 && "breakpoints".equals(strAXk7)) {
                                                                c10489Hlr2.A00 = AbstractC7655F8x.A01(f94);
                                                            }
                                                            f94.Afp();
                                                        }
                                                        c10489Hlr = c10489Hlr2;
                                                    }
                                                    f61.A03 = c10489Hlr;
                                                } else if ("component_queries".equals(strAXk3)) {
                                                    Integer numAXl2 = f94.AXl();
                                                    Integer num3 = C79.A00;
                                                    if (numAXl2 == num3) {
                                                        arrayListA0h11 = C3cG.A0h();
                                                        while (true) {
                                                            Integer numARK2 = f94.ARK();
                                                            Integer num4 = C79.A01;
                                                            if (numARK2 == num4) {
                                                                break;
                                                            }
                                                            F91 f91 = new F91();
                                                            if (f94.AXl() != num) {
                                                                f94.Afp();
                                                            } else {
                                                                while (f94.ARK() != num2) {
                                                                    String strAXk8 = f94.AXk();
                                                                    boolean zA1P8 = BV5.A1P(FBK.A00(strAXk8), 32);
                                                                    f94.ARK();
                                                                    if (!zA1P8) {
                                                                        HashMap<String, String> map = null;
                                                                        HashSet hashSetA13 = null;
                                                                        if ("id".equals(strAXk8)) {
                                                                            f91.A06 = f94.AXm().AOn() ? null : f94.AXm().AgW();
                                                                        } else if ("app_id_expr".equals(strAXk8)) {
                                                                            f91.A00 = F93.A01(f94);
                                                                        } else if (AuraBloksDataProps.PARAMS.equals(strAXk8)) {
                                                                            f91.A03 = F93.A01(f94);
                                                                        } else if ("client_params".equals(strAXk8)) {
                                                                            f91.A02 = F93.A01(f94);
                                                                        } else if (DexStore.DEPS_FILENAME.equals(strAXk8)) {
                                                                            if (f94.AXl() == num3) {
                                                                                hashSetA13 = C60O.A13();
                                                                                while (f94.ARK() != num4) {
                                                                                    F94.A02(f94, hashSetA13);
                                                                                }
                                                                            }
                                                                            f91.A08 = hashSetA13;
                                                                        } else if ("targets".equals(strAXk8)) {
                                                                            if (f94.AXl() == num) {
                                                                                HashMap<String, String> mapA0u2 = BV4.A0u();
                                                                                while (f94.ARK() != num2) {
                                                                                    String strAXk9 = f94.AXk();
                                                                                    f94.ARK();
                                                                                    if (f94.AXl() == C79.A0c) {
                                                                                        mapA0u2.put(strAXk9, null);
                                                                                    } else if (!f94.AXm().AOn() && (strAgW = f94.AXm().AgW()) != null) {
                                                                                        mapA0u2.put(strAXk9, strAgW);
                                                                                    }
                                                                                }
                                                                                map = mapA0u2;
                                                                            }
                                                                            f91.A07 = map;
                                                                        } else if ("cache_ttl_expr".equals(strAXk8)) {
                                                                            f91.A01 = F93.A01(f94);
                                                                        } else if ("disk_cache_enabled".equals(strAXk8)) {
                                                                            f91.A04 = F94.A00(f94);
                                                                        } else if ("is_scoped".equals(strAXk8)) {
                                                                            f91.A05 = F94.A00(f94);
                                                                        }
                                                                    }
                                                                    f94.Afp();
                                                                }
                                                                arrayListA0h11.add(f91);
                                                            }
                                                        }
                                                    }
                                                    f61.A06 = arrayListA0h11;
                                                } else if ("hoisted_async_components".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h12 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F96 f96 = new F96();
                                                            if (f94.AXl() != num) {
                                                                f94.Afp();
                                                            } else {
                                                                while (f94.ARK() != num2) {
                                                                    String strAXk10 = f94.AXk();
                                                                    boolean zA1P9 = BV5.A1P(FBK.A00(strAXk10), 32);
                                                                    f94.ARK();
                                                                    if (!zA1P9) {
                                                                        if ("id".equals(strAXk10)) {
                                                                            f96.A01 = F94.A01(f94);
                                                                        } else if ("payload".equals(strAXk10)) {
                                                                            f96.A00 = F90.A00(f94);
                                                                        }
                                                                    }
                                                                    f94.Afp();
                                                                }
                                                                arrayListA0h12.add(f96);
                                                            }
                                                        }
                                                    }
                                                    f61.A09 = arrayListA0h12;
                                                } else if ("depth".equals(strAXk3)) {
                                                    f61.A05 = Integer.valueOf(f94.AXm().ANp());
                                                } else if ("ft".equals(strAXk3)) {
                                                    if (f94.AXl() == num) {
                                                        HashMap mapA0u3 = BV4.A0u();
                                                        while (f94.ARK() != num2) {
                                                            String strAXk11 = f94.AXk();
                                                            f94.ARK();
                                                            Object objA00 = AbstractC7655F8x.A00(f94);
                                                            C7384Etj.A0Z(objA00, "null cannot be cast to non-null type kotlin.String");
                                                            mapA0u3.put(strAXk11, objA00);
                                                        }
                                                        f6w = new F6w(f9c2, mapA0u3);
                                                    }
                                                    f61.A02 = f6w;
                                                } else if ("templates".equals(strAXk3)) {
                                                    if (f94.AXl() == num) {
                                                        mapA0u = BV4.A0u();
                                                        while (f94.ARK() != num2) {
                                                            String strAXk12 = f94.AXk();
                                                            f94.ARK();
                                                            F9C f9c5 = new F9C(f9c2);
                                                            f9c5.A00("templates", strAXk12);
                                                            mapA0u.put(strAXk12, AbstractC7654F8w.A01(f9c5, f94));
                                                        }
                                                    } else {
                                                        mapA0u = null;
                                                    }
                                                    f61.A0K = mapA0u;
                                                } else if ("values".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h13 = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F8L f8l = new F8L();
                                                            if (f94.AXl() != num) {
                                                                f94.Afp();
                                                            } else {
                                                                while (f94.ARK() != num2) {
                                                                    String strAXk13 = f94.AXk();
                                                                    boolean zA1P10 = BV5.A1P(FBK.A00(strAXk13), 32);
                                                                    f94.ARK();
                                                                    if (!zA1P10) {
                                                                        if ("id".equals(strAXk13)) {
                                                                            f8l.A02 = F94.A01(f94);
                                                                        } else if ("depth".equals(strAXk13)) {
                                                                            f8l.A01 = Integer.valueOf(f94.AXm().ANp());
                                                                        } else if ("expression".equals(strAXk13)) {
                                                                            f8l.A00 = new FDG((F9H) null, (C7648F8p) null, (Integer) null, f94.AXm().AgW());
                                                                        }
                                                                    }
                                                                    f94.Afp();
                                                                }
                                                                arrayListA0h13.add(f8l);
                                                            }
                                                        }
                                                    }
                                                    f61.A0I = arrayListA0h13;
                                                } else if ("ct".equals(strAXk3)) {
                                                    f61.A0J = AbstractC7655F8x.A01(f94);
                                                } else if ("referenced_ct".equals(strAXk3)) {
                                                    if (f94.AXl() == C79.A00) {
                                                        arrayListA0h = C3cG.A0h();
                                                        while (f94.ARK() != C79.A01) {
                                                            F94.A02(f94, arrayListA0h);
                                                        }
                                                    }
                                                    f61.A0B = arrayListA0h;
                                                }
                                            }
                                        }
                                        f94.Afp();
                                    }
                                    List<F8L> list = f61.A0I;
                                    if (list != null) {
                                        Iterator<F8L> it = list.iterator();
                                        int i = 0;
                                        while (it.hasNext()) {
                                            it.next();
                                            int i2 = i + 1;
                                            if (i < 0) {
                                                AbstractC0885AGm.A14();
                                                throw F60.createAndThrow();
                                            }
                                            i = i2;
                                        }
                                    }
                                    Hnz hnz3 = f61.A01;
                                    if (hnz3 != null) {
                                        String str = hnz3.A01;
                                        if (str != null) {
                                            f9c2.A01 = str;
                                        }
                                        String str2 = hnz3.A00;
                                        if (str2 != null) {
                                            f9c2.A00 = str2;
                                        }
                                    }
                                }
                                hsf.A00 = f61;
                            }
                            f94.Afp();
                        }
                    }
                    c10453Hir.A00 = hsf;
                } else {
                    continue;
                }
            }
            f94.Afp();
        }
    }
}
