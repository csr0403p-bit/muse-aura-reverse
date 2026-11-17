package X;

import android.graphics.RuntimeShader;
import android.util.LruCache;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Unit;

/* renamed from: X.Dd3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5192Dd3 {
    public static final C5192Dd3 A00;
    public static final List<C2427BbD> A01;
    public static final Map<String, C06827l3> A02;
    public static final Set<String> A03;
    public static final F0C A04;
    public static final F0C A05;
    public static final C06827l3 A06;
    public static final C06827l3 A07;
    public static final C06827l3 A08;
    public static final C06827l3 A09;
    public static final C06827l3 A0A;

    static {
        C5192Dd3 c5192Dd3 = new C5192Dd3();
        A00 = c5192Dd3;
        List<C2427BbD> listAsList = Arrays.asList(new C2427BbD(new EZ5(0), "inputImage", "uniform shader inputImage;\n"), new C2427BbD(new EZ7(c5192Dd3, 3), "passIndex", "uniform int passIndex;\n"), new C2427BbD(new EZ5(1), "bkResolution", "uniform float2 bkResolution;\n"), new C2427BbD(new EZ5(2), "bkRenderMargin", "uniform float4 bkRenderMargin;\n"));
        A01 = listAsList;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<C2427BbD> it = listAsList.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(it.next().A01);
        }
        A03 = linkedHashSetA0k;
        Integer num = C79.A01;
        A05 = AbstractC5321DgF.A00(num, 1);
        A04 = AbstractC5321DgF.A00(num, 0);
        A0A = C06827l3.A02("\\bpassIndex\\b");
        A07 = C06827l3.A02("\\bbkResolution\\b");
        A06 = C06827l3.A02("\\bbkRenderMargin\\b");
        A08 = C06827l3.A02("/\\*[\\s\\S]*?\\*/");
        A09 = C06827l3.A02("//[^\\r\\n]*");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(linkedHashSetA0k));
        for (Object obj : linkedHashSetA0k) {
            String str = (String) obj;
            C7384Etj.A0Y(str, 0);
            String strQuote = Pattern.quote(str);
            C7384Etj.A0U(strQuote);
            linkedHashMap.put(obj, C06827l3.A02(FGI.A0U("\\buniform\\b[^;]*?\\b", strQuote, "\\b[^;]*;")));
        }
        A02 = linkedHashMap;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;ILX/FBB;)Ljava/util/List<Landroid/graphics/RuntimeShader;>; */
    public final ArrayList A00(FBB fbb, String str, int i) {
        String strA0U;
        C3075BxE c3075BxE = new C3075BxE(str, i);
        F0C f0c = A04;
        if (((LruCache) f0c.getValue()).get(c3075BxE) != null) {
            return null;
        }
        F0C f0c2 = A05;
        String str2 = (String) ((LruCache) f0c2.getValue()).get(c3075BxE);
        if (str2 == null) {
            String strA03 = A09.A03(A08.A03(str, ""), "");
            StringBuilder sbA0w = C60O.A0w();
            for (C2427BbD c2427BbD : A01) {
                if (AnonymousClass001.A1X(c2427BbD.A02.invoke(Integer.valueOf(i), strA03))) {
                    String str3 = c2427BbD.A01;
                    C06827l3 c06827l3A02 = A02.get(str3);
                    if (c06827l3A02 == null) {
                        String strQuote = Pattern.quote(str3);
                        C7384Etj.A0U(strQuote);
                        c06827l3A02 = C06827l3.A02(FGI.A0U("\\buniform\\b[^;]*?\\b", strQuote, "\\b[^;]*;"));
                    }
                    if (!c06827l3A02.A07(strA03)) {
                        sbA0w.append(c2427BbD.A00);
                    }
                }
            }
            strA0U = FGI.A0U(sbA0w.toString(), PairsDiscretionDocument.TERMINATOR, str);
        } else {
            strA0U = str2;
        }
        ArrayList arrayListA11 = C60O.A11(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayListA11.add(new RuntimeShader(strA0U));
            } catch (IllegalArgumentException e) {
                ((LruCache) f0c.getValue()).put(c3075BxE, Unit.INSTANCE);
                FFI.A00(fbb, "AGSL compile failed; falling back to unmodified capture", e);
                return null;
            }
        }
        if (str2 == null) {
            ((LruCache) f0c2.getValue()).put(c3075BxE, strA0U);
        }
        return arrayListA11;
    }
}
