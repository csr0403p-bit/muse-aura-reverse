package X;

import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import com.instagram.common.lispy.lang.BloksScriptingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.FAv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7697FAv implements InterfaceC7700FAy<Map<String, Object>> {
    public final C7699FAx A00;

    @Override // X.InterfaceC7700FAy
    public final FAO AKk(FB4 fb4) {
        FAO fao;
        C7699FAx c7699FAx = this.A00;
        synchronized (c7699FAx) {
            fao = new FAO(c7699FAx.A00, C7699FAx.A00(fb4, c7699FAx).A00);
        }
        return fao;
    }

    @Override // X.InterfaceC7700FAy
    public final /* bridge */ /* synthetic */ FAN AfK(F6L f6l, Object obj, Map map) {
        String strA0p;
        Object objA00;
        Map map2 = (Map) obj;
        if (map.containsKey("key_lispy")) {
            try {
                strA0p = (String) FDH.A00(Hj6.A02, new FDG((F9H) null, f6l.A02, (Integer) null, C60O.A0p("key_lispy", map)), f6l);
            } catch (BloksScriptingException e) {
                FFI.A01(null, "Exception getting key_lispy value", e);
            }
        } else {
            strA0p = C60O.A0p("key", map);
        }
        if (strA0p != null) {
            Object obj2 = map.get(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM);
            if (map2 != null) {
                objA00 = map2.get(strA0p);
            } else {
                C7699FAx c7699FAx = this.A00;
                synchronized (c7699FAx) {
                    objA00 = c7699FAx.A00.get(strA0p);
                }
            }
            boolean zEquals = HatchUrlSegments.THUMBNAIL_SIZE_PARAM.equals(obj2);
            Map map3 = map2;
            if (zEquals || objA00 == null) {
                objA00 = F9I.A00(f6l, map);
                HashMap mapA0w = map2 != null ? BV4.A0w(map2) : BV4.A0u();
                mapA0w.put(strA0p, objA00);
                map3 = mapA0w;
            }
            return new FAN(new C7698FAw(this.A00, objA00, strA0p, (Map) map.get("debug_metadata"), zEquals), map3);
        }
        throw C3cG.A0Q("Key not defined in data manifest");
    }

    public C7697FAv(C7699FAx c7699FAx) {
        this.A00 = c7699FAx;
    }
}
