package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.9sT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sT {
    public int A00;
    public final C9sS A01;
    public final boolean A02;
    public final boolean A03;

    public C9sT(C9sa c9sa, C9sS c9sS) {
        C7384Etj.A0Y(c9sS, 1);
        this.A01 = c9sS;
        this.A02 = c9sa.A0C;
        this.A03 = c9sa.A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C08059so r11, X.HtJ r12, X.C9sT r13) {
        /*
            r1 = 3
            boolean r0 = r12 instanceof X.C2319BTt
            if (r0 == 0) goto La1
            r5 = r12
            X.BTt r5 = (X.C2319BTt) r5
            int r0 = r5.$t
            if (r0 != r1) goto La1
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A05
            X.Hji r10 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r9 = 6
            r8 = 7
            r7 = 4
            r6 = 1
            if (r0 == 0) goto L53
            if (r0 != r6) goto La8
            java.lang.Object r0 = r5.A04
            java.lang.Object r4 = r5.A03
            java.util.AbstractMap r4 = (java.util.AbstractMap) r4
            java.lang.Object r13 = r5.A02
            X.9sT r13 = (X.C9sT) r13
            java.lang.Object r11 = r5.A01
            X.9so r11 = (X.C08059so) r11
            X.Hwg.A00(r1)
            r4.put(r0, r1)
            X.9sS r3 = r13.A01
            byte r0 = r3.A05()
            if (r0 == r7) goto L51
            if (r0 == r8) goto Lb0
            java.lang.String r2 = "Expected end of the object or comma"
        L45:
            int r1 = r3.A00
            java.lang.String r0 = ""
            r3.A0N(r2, r0, r1)
        L4c:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L51:
            r1 = 4
            goto L66
        L53:
            X.Hwg.A00(r1)
            X.9sS r3 = r13.A01
            byte r1 = r3.A06(r9)
            byte r0 = r3.A04()
            if (r0 == r7) goto L9e
            java.util.LinkedHashMap r4 = X.C3cG.A0j()
        L66:
            X.9sS r2 = r13.A01
            boolean r0 = r2.A0P()
            if (r0 == 0) goto L90
            boolean r0 = r13.A02
            if (r0 == 0) goto L8b
            java.lang.String r1 = r2.A0C()
        L76:
            r0 = 5
            r2.A06(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r5.A01 = r11
            r5.A02 = r13
            r5.A03 = r4
            r5.A04 = r1
            r5.A00 = r6
            r11.A02 = r5
            r11.A01 = r0
            return r10
        L8b:
            java.lang.String r1 = r2.A0B()
            goto L76
        L90:
            if (r1 == r9) goto Lad
            if (r1 != r7) goto Lb0
            boolean r0 = r13.A03
            if (r0 != 0) goto Lad
            java.lang.String r0 = "object"
            X.C9rA.A05(r0, r2)
            goto L4c
        L9e:
            java.lang.String r2 = "Unexpected leading comma"
            goto L45
        La1:
            X.BTt r5 = new X.BTt
            r5.<init>(r12, r13)
            goto L17
        La8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lad:
            r2.A06(r8)
        Lb0:
            kotlinx.serialization.json.JsonObject r0 = new kotlinx.serialization.json.JsonObject
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sT.A00(X.9so, X.HtJ, X.9sT):java.lang.Object");
    }

    public static final JsonArray A01(C9sT c9sT) {
        C9sS c9sS = c9sT.A01;
        byte bA05 = c9sS.A05();
        if (c9sS.A04() != 4) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (!c9sS.A0P()) {
                    if (bA05 == 8) {
                        c9sS.A06((byte) 9);
                    } else if (bA05 == 4) {
                        if (!c9sT.A03) {
                            C9rA.A05("array", c9sS);
                        }
                        c9sS.A06((byte) 9);
                    }
                    return new JsonArray(arrayList);
                }
                arrayList.add(c9sT.A03());
                bA05 = c9sS.A05();
                if (bA05 != 4) {
                    boolean z = bA05 == 9;
                    int i = c9sS.A00;
                    if (!z) {
                        c9sS.A0N("Expected end of the array or comma", "", i);
                        break;
                    }
                }
            }
        } else {
            c9sS.A0N("Unexpected leading comma", "", c9sS.A00);
        }
        throw F60.createAndThrow();
    }

    public static final JsonPrimitive A02(C9sT c9sT, boolean z) {
        String strA0C;
        if (c9sT.A02 || !z) {
            strA0C = c9sT.A01.A0C();
            if (!z && HatchCcvLoggingKt.NO_POSTAL_FIELD.equals(strA0C)) {
                return JsonNull.A00;
            }
        } else {
            strA0C = c9sT.A01.A0B();
        }
        return new JsonLiteral(strA0C, null, z);
    }

    public final JsonElement A03() {
        String strA0M;
        JsonElement jsonObject;
        Object objInvoke;
        C9sS c9sS = this.A01;
        byte bA04 = c9sS.A04();
        boolean z = true;
        if (bA04 != 1) {
            if (bA04 != 0) {
                if (bA04 == 6) {
                    int i = this.A00 + 1;
                    this.A00 = i;
                    if (i == 200) {
                        C9sX c9sX = new C9sX(null, this);
                        Unit unit = Unit.INSTANCE;
                        C08059so c08059so = new C08059so();
                        c08059so.A03 = c9sX;
                        c08059so.A01 = unit;
                        c08059so.A02 = c08059so;
                        Object obj = C9t9.A00;
                        c08059so.A00 = obj;
                        while (true) {
                            objInvoke = c08059so.A00;
                            HtJ<Object> htJ = c08059so.A02;
                            if (htJ == null) {
                                break;
                            }
                            if (obj.equals(objInvoke)) {
                                try {
                                    G0W<? super C08059so<?, ?>, Object, ? super HtJ<Object>, ? extends Object> g0w = c08059so.A03;
                                    Object obj2 = c08059so.A01;
                                    if (g0w instanceof AbstractC8884Fsp) {
                                        C0862A6j.A02(g0w, 3);
                                        objInvoke = g0w.invoke(c08059so, obj2, htJ);
                                    } else {
                                        C7384Etj.A0Y(g0w, 0);
                                        C78T context = htJ.getContext();
                                        AbstractC8884Fsp c7Bo = context == C6ys.A00 ? new C7Bo(htJ) : new C7Bh(htJ, context);
                                        C0862A6j.A02(g0w, 3);
                                        objInvoke = g0w.invoke(c08059so, obj2, c7Bo);
                                    }
                                } catch (Throwable th) {
                                    htJ.resumeWith(new C10571Hud(th));
                                }
                                if (objInvoke != EnumC10460Hji.A02) {
                                }
                            } else {
                                c08059so.A00 = obj;
                            }
                            htJ.resumeWith(objInvoke);
                        }
                        Hwg.A00(objInvoke);
                        jsonObject = (JsonElement) objInvoke;
                    } else {
                        byte bA06 = c9sS.A06((byte) 6);
                        if (c9sS.A04() != 4) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            while (true) {
                                if (c9sS.A0P()) {
                                    String strA0C = this.A02 ? c9sS.A0C() : c9sS.A0B();
                                    c9sS.A06((byte) 5);
                                    linkedHashMap.put(strA0C, A03());
                                    bA06 = c9sS.A05();
                                    if (bA06 != 4) {
                                        if (bA06 != 7) {
                                            strA0M = "Expected end of the object or comma";
                                        }
                                    }
                                } else if (bA06 == 6) {
                                    c9sS.A06((byte) 7);
                                } else if (bA06 == 4) {
                                    if (!this.A03) {
                                        C9rA.A05("object", c9sS);
                                    }
                                    c9sS.A06((byte) 7);
                                }
                            }
                            jsonObject = new JsonObject(linkedHashMap);
                        } else {
                            strA0M = "Unexpected leading comma";
                        }
                    }
                    this.A00--;
                    return jsonObject;
                }
                if (bA04 == 8) {
                    return A01(this);
                }
                strA0M = FGI.A0M("Cannot read Json element because of unexpected ", C9t0.A01(bA04));
                c9sS.A0N(strA0M, "", c9sS.A00);
                throw F60.createAndThrow();
            }
            z = false;
        }
        return A02(this, z);
    }
}
