package X;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.9sU, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sU {
    public static final C08119su A03 = new C9sU() { // from class: X.9su
        {
            new C9sa(C79.A0C, "    ", "type", false, false, false, false, false, true, false, false, false, true, false, false, false);
            C07959pz c07959pz = AbstractC2260BKq.A00;
        }
    };
    public final C9sa A00;
    public final C9sD A01 = new C9sD();
    public final C07959pz A02;

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9jG<+TT;>;Ljava/lang/String;)TT; */
    public final Object A00(String str, C9jG c9jG) {
        C7384Etj.A0Y(c9jG, 0);
        C7384Etj.A0Y(str, 1);
        C9sS c9sW = !this.A00.A03 ? new C9sW(str) : new C9sg(str);
        Object objA8b = new C9sP(c9jG.getDescriptor(), this, c9sW, null, C9sh.A04).A8b(c9jG);
        c9sW.A0J();
        return objA8b;
    }

    public final <T> T A01(C9jG<? extends T> c9jG, JsonElement jsonElement) {
        C7384Etj.A0Y(c9jG, 0);
        C7384Etj.A0Y(jsonElement, 1);
        return (T) C9sZ.A00(c9jG, this, jsonElement);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9hv<-TT;>;TT;)Ljava/lang/String; */
    public final String A02(Object obj, C9hv c9hv) {
        C7384Etj.A0Y(c9hv, 0);
        BKQ bkq = new BKQ();
        try {
            AbstractC07969sc.A00(obj, c9hv, this, bkq);
            return bkq.toString();
        } finally {
            BQF.A00.A00(bkq.A01);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9hv<-TT;>;TT;)Lkotlinx/serialization/json/JsonElement; */
    public final JsonElement A03(Object obj, C9hv c9hv) {
        C7384Etj.A0Y(c9hv, 0);
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        new C9sM(new C2291BSr(c10543HqvA0z, 4), this).AAR(obj, c9hv);
        T t = c10543HqvA0z.element;
        if (t != null) {
            return (JsonElement) t;
        }
        C7384Etj.A0b("result");
        throw F60.createAndThrow();
    }

    public final JsonElement A04(String str) {
        C7384Etj.A0Y(str, 0);
        return (JsonElement) A00(str, JsonElementSerializer.A00);
    }

    public C9sU(C9sa c9sa, C07959pz c07959pz) {
        this.A00 = c9sa;
        this.A02 = c07959pz;
    }
}
