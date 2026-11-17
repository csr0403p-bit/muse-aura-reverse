package kotlinx.serialization.json;

import X.AbstractC08159sy;
import X.C07669ib;
import X.C07849iy;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j5;
import X.C9314GDq;
import X.C9hr;
import X.C9i3;
import X.C9iY;
import X.C9iZ;
import X.C9rA;
import X.C9tI;
import X.C9tJ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;

/* loaded from: classes4.dex */
public final class JsonLiteralSerializer implements C9hr<JsonLiteral> {
    public static final JsonLiteralSerializer A01 = new JsonLiteralSerializer();
    public static final C9iZ A00 = C9iY.A05("kotlinx.serialization.json.JsonLiteral", C07669ib.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        JsonElement jsonElementA8V = C9i3.A00(interfaceC07829iw).A8V();
        if (jsonElementA8V instanceof JsonLiteral) {
            return jsonElementA8V;
        }
        StringBuilder sbA0x = C60O.A0x("Unexpected JSON element, expected JsonLiteral, had ");
        C8j5.A0o(sbA0x, jsonElementA8V);
        throw C9rA.A03(jsonElementA8V, sbA0x.toString());
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        long jLongValue;
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        C7384Etj.A0Y(interfaceC07789is, 0);
        C7384Etj.A0Y(jsonLiteral, 1);
        C9i3.A01(interfaceC07789is);
        if (!jsonLiteral.A02) {
            C9iZ c9iZ = jsonLiteral.A01;
            if (c9iZ == null) {
                String str = jsonLiteral.A00;
                Long lA0s = C9tI.A0s(str);
                if (lA0s != null) {
                    jLongValue = lA0s.longValue();
                } else {
                    C7384Etj.A0Y(str, 0);
                    C9314GDq c9314GDqA00 = AbstractC08159sy.A00(str);
                    if (c9314GDqA00 != null) {
                        jLongValue = c9314GDqA00.A00;
                        interfaceC07789is = interfaceC07789is.AAH(C07849iy.A00);
                    } else {
                        Double dA0v = C9tJ.A0v(str);
                        if (dA0v != null) {
                            interfaceC07789is.AAC(dA0v.doubleValue());
                            return;
                        }
                        Boolean boolA0E = C7BY.A0E(str);
                        if (boolA0E != null) {
                            interfaceC07789is.AA6(boolA0E.booleanValue());
                            return;
                        }
                    }
                }
                interfaceC07789is.AAM(jLongValue);
                return;
            }
            interfaceC07789is = interfaceC07789is.AAH(c9iZ);
        }
        interfaceC07789is.AAU(jsonLiteral.A00);
    }
}
