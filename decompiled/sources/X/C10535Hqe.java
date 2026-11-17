package X;

import android.content.Context;
import com.facebook.aura.bloks.screenquery.prebundledtemplate.AuraCdsTemplateProvider;
import com.facebook.aura.bloks.screenquery.prebundledtemplate.AuraTemplateProvider;
import com.instagram.common.bloks.BloksParseResult;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Hqe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10535Hqe {
    public static final C10535Hqe A00 = new C10535Hqe();
    public static final ConcurrentHashMap<Integer, BloksParseResult> A02 = C60O.A1C();
    public static final ConcurrentHashMap<Integer, String> A01 = C60O.A1C();

    public final BloksParseResult A00(Context context, Integer num) {
        int iIntValue;
        F61 f61;
        String templateJSON;
        if (num == null) {
            iIntValue = 0;
        } else {
            iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 16542) {
                FFI.A01(null, AnonymousClass001.A0v(" but none was found. Using the default template instead.", C3cG.A0f(num, "Expected a valid screen template for implementation key: ")), null);
                iIntValue = 0;
            }
        }
        ConcurrentHashMap<Integer, BloksParseResult> concurrentHashMap = A02;
        Integer numValueOf = Integer.valueOf(iIntValue);
        BloksParseResult bloksParseResultPutIfAbsent = concurrentHashMap.get(numValueOf);
        if (bloksParseResultPutIfAbsent == null) {
            int iIntValue2 = numValueOf.intValue();
            if (iIntValue2 != 0 && iIntValue2 != 16542) {
                FFI.A01(null, AnonymousClass001.A0v(" but none was found. Using the default template instead.", C3cG.A0f(numValueOf, "Expected a valid screen template for implementation key: ")), null);
                iIntValue2 = 0;
            }
            ConcurrentHashMap<Integer, String> concurrentHashMap2 = A01;
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            String strPutIfAbsent = concurrentHashMap2.get(numValueOf2);
            if (strPutIfAbsent == null) {
                if (iIntValue2 == 0) {
                    templateJSON = AuraTemplateProvider.getTemplateJSON(context);
                } else {
                    if (iIntValue2 != 16542) {
                        throw AbstractC7610F5x.A0o(numValueOf2);
                    }
                    templateJSON = AuraCdsTemplateProvider.getTemplateJSON(context);
                }
                if (templateJSON == null) {
                    throw FGI.A04("Got null screen template for implementation key: ", ". Please make sure to provide a valid screen template!", iIntValue2);
                }
                strPutIfAbsent = concurrentHashMap2.putIfAbsent(numValueOf2, templateJSON);
                if (strPutIfAbsent == null) {
                    strPutIfAbsent = templateJSON;
                }
            }
            C3330CEv c3330CEvA0l = AbstractC7610F5x.A0l(strPutIfAbsent);
            c3330CEvA0l.ARK();
            C10453Hir c10453HirA00 = C10453Hir.A00(c3330CEvA0l);
            C7384Etj.A0U(c10453HirA00);
            Hsf hsf = c10453HirA00.A00;
            if (hsf == null || (f61 = hsf.A00) == null) {
                throw C60O.A0i("Screen template must contain a valid BloksResponse");
            }
            BloksParseResult bloksParseResultA01 = BloksParseResult.A01(null, f61, null);
            bloksParseResultPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, bloksParseResultA01);
            if (bloksParseResultPutIfAbsent == null) {
                bloksParseResultPutIfAbsent = bloksParseResultA01;
            }
        }
        return bloksParseResultPutIfAbsent;
    }
}
