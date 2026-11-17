package com.facebook.aura.hotels;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C9oY;
import X.C9sU;
import X.DCl;
import X.F0C;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.OpaqueWidgetData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class HotelResultsJsonKt {
    public static final F0C isoCurrencyCodes$delegate = AbstractC5321DgF.A03(HotelResultsJsonKt$isoCurrencyCodes$2.INSTANCE);

    public static final HotelResults hotelResults(HatchWidget hatchWidget) {
        OpaqueWidgetData opaqueWidgetData;
        String str;
        Object objA0s;
        JsonObject jsonObject;
        HotelAttributionJson hotelAttributionJson;
        JsonObject jsonObject2;
        Object objA0s2;
        C7384Etj.A0Y(hatchWidget, 0);
        if (HotelResultModelsKt.HOTEL_RESULTS_KIND.equals(hatchWidget.kind)) {
            HatchWidgetData hatchWidgetData = hatchWidget.data;
            if ((hatchWidgetData instanceof OpaqueWidgetData) && (opaqueWidgetData = (OpaqueWidgetData) hatchWidgetData) != null && (str = opaqueWidgetData.dataJson) != null) {
                Charset charset = DCl.A05;
                if (str.getBytes(charset).length <= 2097152) {
                    try {
                        C9sU c9sU = HatchJsonKt.HatchJson;
                        JsonObject jsonObjectA05 = C9oY.A05(c9sU.A04(str));
                        Object obj = jsonObjectA05.get("typed_data");
                        if (!(obj instanceof JsonObject) || (jsonObject = (JsonObject) obj) == null) {
                            jsonObject = jsonObjectA05;
                        }
                        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                        Iterator<Map.Entry<String, JsonElement>> it = jsonObject.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entryA0l = C3cH.A0l(it);
                            if (!"attribution".equals(C60O.A0t(entryA0l))) {
                                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                            }
                        }
                        if (new JsonObject(linkedHashMapA0j).toString().getBytes(charset).length > 1048576) {
                            objA0s = null;
                        } else {
                            int i = HotelResultsJson.$stable;
                            HotelResultsJson hotelResultsJson = (HotelResultsJson) c9sU.A01(HotelResultsJson$$serializer.INSTANCE, jsonObject);
                            Object obj2 = jsonObjectA05.get("attribution");
                            if (!(obj2 instanceof JsonObject) || (jsonObject2 = (JsonObject) obj2) == null) {
                                hotelAttributionJson = null;
                            } else {
                                try {
                                    objA0s2 = (HotelAttributionJson) c9sU.A01(HotelAttributionJson$$serializer.INSTANCE, jsonObject2);
                                } catch (Throwable th) {
                                    objA0s2 = C3cG.A0s(th);
                                }
                                if (objA0s2 instanceof C10571Hud) {
                                    objA0s2 = null;
                                }
                                hotelAttributionJson = (HotelAttributionJson) objA0s2;
                            }
                            objA0s = hotelResultsJson.toDomain(hotelAttributionJson);
                        }
                    } catch (Throwable th2) {
                        objA0s = C3cG.A0s(th2);
                    }
                    if (objA0s instanceof C10571Hud) {
                        objA0s = null;
                    }
                    HotelResults hotelResults = (HotelResults) objA0s;
                    if (hotelResults != null && !hotelResults.hotels.isEmpty()) {
                        return hotelResults;
                    }
                }
            }
        }
        return null;
    }

    public static final Set<String> getIsoCurrencyCodes() {
        return (Set) isoCurrencyCodes$delegate.getValue();
    }

    public static final String hotelWebUrl(String str) {
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(str);
        if (strHotelNonBlank == null || !AnonymousClass006.A1b("https://", strHotelNonBlank)) {
            return null;
        }
        return strHotelNonBlank;
    }

    public static final AHD<String> toHotelHighlights(List<HotelAmenityHighlightJson> list, String str) {
        ArrayList arrayListA0y = C3cI.A0y(list);
        for (HotelAmenityHighlightJson hotelAmenityHighlightJson : list) {
            HotelAmenityHighlightJson hotelAmenityHighlightJson2 = hotelAmenityHighlightJson;
            if (AbstractC0878AGe.A0k(C60O.A19("room", "property"), hotelAmenityHighlightJson2.scope) && (str == null || str.equals(hotelAmenityHighlightJson2.scope))) {
                arrayListA0y.add(hotelAmenityHighlightJson);
            }
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0y.iterator();
        while (it.hasNext()) {
            String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(((HotelAmenityHighlightJson) it.next()).name);
            if (strHotelNonBlank != null) {
                arrayListA0h.add(strHotelNonBlank);
            }
        }
        return AGI.A07(AbstractC0878AGe.A0a(arrayListA0h, 2));
    }
}
