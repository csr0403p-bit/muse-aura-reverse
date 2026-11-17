package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cG;
import X.C7BY;
import X.F60;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.navigation.key.VoiceCatalogFilterKind;
import com.facebook.aura.partners.voice.api.VoiceCatalogCriteria;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class VoiceSettingsListViewModelKt {
    public static final long CATALOG_SEARCH_DEBOUNCE_MS = 300;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCatalogFilterKind.values().length];
            try {
                AnonymousClass002.A13(VoiceCatalogFilterKind.GENDER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceCatalogFilterKind.ACCENT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceCatalogFilterKind.TONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int activeFilterCount(VoiceCatalogCriteria voiceCatalogCriteria) {
        int i = 0;
        List listAsList = Arrays.asList(voiceCatalogCriteria.gender, voiceCatalogCriteria.accent, voiceCatalogCriteria.tone);
        if (!(listAsList instanceof Collection) || !listAsList.isEmpty()) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (strA0j != null && !C7BY.A0j(strA0j) && (i = i + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        return i;
    }

    public static final String telemetryKind(VoiceCatalogCriteria voiceCatalogCriteria) {
        return (C7BY.A0j(voiceCatalogCriteria.query) || activeFilterCount(voiceCatalogCriteria) <= 0) ? !C7BY.A0j(voiceCatalogCriteria.query) ? AuraDeeplinkRouteMapper.SEARCH_ROUTE : activeFilterCount(voiceCatalogCriteria) > 0 ? "filters" : "none" : "search_and_filters";
    }

    public static final String telemetryValue(VoiceCatalogFilterKind voiceCatalogFilterKind) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = voiceCatalogFilterKind.ordinal();
        if (iOrdinal == 0) {
            return "gender";
        }
        if (iOrdinal == 1) {
            return "accent";
        }
        if (iOrdinal == 2) {
            return "tone";
        }
        throw C3cG.A0q();
    }
}
