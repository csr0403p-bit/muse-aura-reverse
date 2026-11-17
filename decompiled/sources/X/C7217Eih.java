package X;

import android.content.res.Resources;
import android.graphics.Rect;
import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Eih, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7217Eih implements InterfaceC7237Ej1 {
    public final InterfaceC7145EhB A00;
    public final C7182Ehs A01;
    public final InterfaceC7258Eji A02;

    @Override // X.InterfaceC7237Ej1
    public final C7226Eiq A7p(Resources resources, Rect rect, InterfaceC7540F0s interfaceC7540F0s, C7197Ei9 c7197Ei9, Ejq ejq, Object obj) {
        CCV bitmapCacheKey;
        C7506EyQ c7506EyQ;
        String strADg;
        String str;
        C7197Ei9 c7197Ei92 = c7197Ei9;
        AnonymousClass003.A0u(resources, ejq);
        if (c7197Ei9 == null) {
            c7197Ei92 = C7197Ei9.A0P;
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        if (interfaceC7540F0s instanceof EnumC7399Eud) {
            if (ejq instanceof C7506EyQ) {
                if (rect != null) {
                    rect.width();
                    rect.height();
                }
                strADg = "NopUriModifier";
                str = "Disabled:";
            } else {
                strADg = ejq.ADg();
                str = "NotSupportedImageSource: ";
            }
            String strA0M = FGI.A0M(str, strADg);
            if (interfaceC7540F0s != null) {
                linkedHashMapA0j.put("smart_fetch_strategy", interfaceC7540F0s);
            }
            linkedHashMapA0j.put("smart_mod_result", strA0M);
        } else if (interfaceC7540F0s != null) {
            throw C3cG.A0q();
        }
        if (!(ejq instanceof F07)) {
            if (ejq instanceof C7506EyQ) {
                c7506EyQ = (C7506EyQ) ejq;
            } else if (ejq instanceof C2eD) {
                Ejq[] ejqArr = ((C2eD) ejq).A00;
                Ejq ejq2 = ejqArr.length == 0 ? null : ejqArr[0];
                if (ejq2 instanceof C7506EyQ) {
                    c7506EyQ = (C7506EyQ) ejq2;
                }
            }
            Map<String, Object> map = c7506EyQ.A02;
            if (map != null) {
                linkedHashMapA0j.put("image_source_extras", map);
            }
        }
        C7183Eht c7183EhtA01 = AbstractC7216Eig.A01(this.A02, c7197Ei92, ejq);
        if (c7183EhtA01 != null) {
            C7182Ehs c7182Ehs = this.A01;
            C7267Ejs.A00();
            bitmapCacheKey = c7182Ehs.A03.getBitmapCacheKey(c7183EhtA01, obj);
        } else {
            bitmapCacheKey = null;
        }
        return new C7226Eiq(resources, bitmapCacheKey, rect != null ? new C7482Exf(rect.width(), rect.height()) : null, c7197Ei92, ejq, c7183EhtA01, linkedHashMapA0j);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Eiq;Ljava/lang/Object;LX/EjU;JLX/Exf;)LX/Ej0<LX/EfF<LX/EfB;>;>; */
    @Override // X.InterfaceC7237Ej1
    public final InterfaceC7236Ej0 ABM(C7482Exf c7482Exf, C7226Eiq c7226Eiq, InterfaceC7250EjU interfaceC7250EjU, Object obj, long j) {
        C7384Etj.A0Y(c7226Eiq, 0);
        Ejq ejq = c7226Eiq.A04;
        C7182Ehs c7182Ehs = this.A01;
        InterfaceC7258Eji interfaceC7258Eji = this.A02;
        C7197Ei9 c7197Ei9 = c7226Eiq.A03;
        AtomicLong atomicLong = AbstractC7261Ejl.A00;
        Object obj2 = AbstractC7216Eig.A00(c7482Exf, interfaceC7258Eji, c7197Ei9, ejq, c7182Ehs, interfaceC7250EjU, obj, FGI.A0B(j, HatchSpacesDataSourceKt.VERSION_QUERY_PARAM), c7226Eiq.A06).get();
        C7384Etj.A0U(obj2);
        return (InterfaceC7236Ej0) obj2;
    }

    public C7217Eih(InterfaceC7145EhB interfaceC7145EhB, InterfaceC7258Eji interfaceC7258Eji, C7182Ehs c7182Ehs) {
        this.A01 = c7182Ehs;
        this.A02 = interfaceC7258Eji;
        this.A00 = interfaceC7145EhB;
    }
}
