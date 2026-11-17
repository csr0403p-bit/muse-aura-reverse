package X;

import android.graphics.RuntimeShader;
import java.util.List;

/* renamed from: X.Hzu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10628Hzu {
    public int A00;
    public EGO A01;
    public String A02;
    public final G0V<C5219Ddb, List<? extends RuntimeShader>, EGO> A03;
    public final G0W<String, Integer, FBB, List<RuntimeShader>> A04;

    /* JADX WARN: Multi-variable type inference failed */
    public C10628Hzu() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;ILjava/util/List<LX/Dd4;>;[FLX/FBB;)LX/EGO; */
    public final EGO A00(FBB fbb, String str, List list, float[] fArr, int i) {
        EGO egoInvoke = this.A01;
        if (!str.equals(this.A02) || i != this.A00 || egoInvoke == null) {
            String strA03 = C5192Dd3.A09.A03(C5192Dd3.A08.A03(str, ""), "");
            egoInvoke = this.A03.invoke(new C5219Ddb(C5220Ddc.A04, i, 0, C5192Dd3.A0A.A07(strA03), C5192Dd3.A07.A07(strA03), C5192Dd3.A06.A07(strA03)), this.A04.invoke(str, Integer.valueOf(i), fbb));
            this.A02 = str;
            this.A00 = i;
            this.A01 = egoInvoke;
        }
        egoInvoke.A03(list, fArr);
        return egoInvoke;
    }

    public /* synthetic */ C10628Hzu(G0V g0v, G0W g0w, C06H c06h, int i) {
        C8634Fhl c8634Fhl = new C8634Fhl(C5192Dd3.A00, 0);
        I02 i02 = I02.A00;
        this.A04 = c8634Fhl;
        this.A03 = i02;
    }
}
