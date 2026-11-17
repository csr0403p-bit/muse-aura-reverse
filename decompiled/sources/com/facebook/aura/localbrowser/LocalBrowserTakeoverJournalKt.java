package com.facebook.aura.localbrowser;

import X.AGH;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class LocalBrowserTakeoverJournalKt {
    public static final boolean isTakeoverJournalUrl(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass006.A1b("https://", str) || AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, str);
    }

    public static final Map<String, String> telemetry(TakeoverJournalJson takeoverJournalJson) {
        boolean z;
        boolean z2;
        C7384Etj.A0Y(takeoverJournalJson, 0);
        HxE hxEA0r = C3cG.A0r("journal_entries", String.valueOf(takeoverJournalJson.entries.size()));
        boolean z3 = false;
        HxE hxEA0r2 = C3cG.A0r("journal_complete", String.valueOf(takeoverJournalJson.complete));
        HxE hxEA0r3 = C3cG.A0r("takeover_ms", String.valueOf(takeoverJournalJson.ended_at_ms - takeoverJournalJson.started_at_ms));
        List<TakeoverJournalEntryJson> list = takeoverJournalJson.entries;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<TakeoverJournalEntryJson> it = list.iterator();
            while (it.hasNext()) {
                if ("navigated".equals(it.next().activity.kind)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        HxE hxEA0r4 = C3cH.A0r("navigated", z);
        List<TakeoverJournalEntryJson> list2 = takeoverJournalJson.entries;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = false;
        } else {
            Iterator<TakeoverJournalEntryJson> it2 = list2.iterator();
            while (it2.hasNext()) {
                if ("form_submitted".equals(it2.next().activity.kind)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        HxE hxEA0r5 = C3cH.A0r("form_submitted", z2);
        List<TakeoverJournalEntryJson> list3 = takeoverJournalJson.entries;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<TakeoverJournalEntryJson> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                TakeoverFieldValueJson takeoverFieldValueJson = it3.next().activity.value;
                if ("filled".equals(takeoverFieldValueJson != null ? takeoverFieldValueJson.kind : null)) {
                    z3 = true;
                    break;
                }
            }
        }
        return AGH.A0D(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, C3cG.A0r("protected_filled", String.valueOf(z3)));
    }
}
