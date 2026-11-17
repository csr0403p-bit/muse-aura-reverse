package com.facebook.aura.hotels;

import X.AGI;
import X.AHD;
import X.AnonymousClass005;
import X.BFI;
import X.C0881AGi;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public abstract class HotelSelectionJsonKt {
    public static final String contactAddress(HotelLocationJson hotelLocationJson) {
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(hotelLocationJson.formatted);
        return strHotelNonBlank == null ? HotelResultModelsKt.hotelNonBlank(C3cH.A0e(", ", BFI.A0F(new String[]{HotelResultModelsKt.hotelNonBlank(hotelLocationJson.address_line_1), HotelResultModelsKt.hotelNonBlank(hotelLocationJson.address_line_2), HotelResultModelsKt.hotelNonBlank(hotelLocationJson.city), HotelResultModelsKt.hotelNonBlank(hotelLocationJson.province), HotelResultModelsKt.hotelNonBlank(hotelLocationJson.postal_code), HotelResultModelsKt.hotelNonBlank(hotelLocationJson.country)}))) : strHotelNonBlank;
    }

    public static final String contactText(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        String strA00 = null;
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null && jsonPrimitive.A01()) {
            strA00 = jsonPrimitive.A00();
        }
        return HotelResultModelsKt.hotelNonBlank(strA00);
    }

    public static final AHD<HotelInfoSection> toHotelInfoSections(JsonElement jsonElement) {
        List<JsonElement> list;
        Object objA0s;
        String strHotelNonBlank;
        if (!(jsonElement instanceof JsonArray) || (list = (JsonArray) jsonElement) == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (JsonElement jsonElement2 : list) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                int i = HotelInfoSectionJson.$stable;
                objA0s = (HotelInfoSectionJson) c9sU.A01(HotelInfoSectionJson$$serializer.INSTANCE, jsonElement2);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            HotelInfoSectionJson hotelInfoSectionJson = (HotelInfoSectionJson) objA0s;
            if (hotelInfoSectionJson != null && (strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(hotelInfoSectionJson.title)) != null) {
                List<String> list2 = hotelInfoSectionJson.items;
                ArrayList arrayListA0h2 = C3cG.A0h();
                Iterator<String> it = list2.iterator();
                while (it.hasNext()) {
                    String strHotelNonBlank2 = HotelResultModelsKt.hotelNonBlank(AnonymousClass005.A0j(it));
                    if (strHotelNonBlank2 != null) {
                        arrayListA0h2.add(strHotelNonBlank2);
                    }
                }
                if (!arrayListA0h2.isEmpty()) {
                    arrayListA0h.add(new HotelInfoSection(strHotelNonBlank, AGI.A07(arrayListA0h2)));
                }
            }
        }
        return AGI.A07(arrayListA0h);
    }
}
