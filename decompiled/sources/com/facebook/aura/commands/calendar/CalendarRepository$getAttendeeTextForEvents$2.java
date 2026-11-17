package com.facebook.aura.commands.calendar;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFI;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$getAttendeeTextForEvents$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class CalendarRepository$getAttendeeTextForEvents$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Map<Long, ? extends String>>, Object> {
    public final /* synthetic */ Set<Long> $eventIds;
    public int label;
    public final /* synthetic */ CalendarRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarRepository$getAttendeeTextForEvents$2(Set<Long> set, CalendarRepository calendarRepository, HtJ<? super CalendarRepository$getAttendeeTextForEvents$2> htJ) {
        super(2, htJ);
        this.$eventIds = set;
        this.this$0 = calendarRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new CalendarRepository$getAttendeeTextForEvents$2(this.$eventIds, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$eventIds.isEmpty()) {
            return AGH.A0E();
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        String strA0L = AbstractC0878AGe.A0L(",", "", "", this.$eventIds, CalendarRepository$getAttendeeTextForEvents$2$placeholders$1.INSTANCE);
        try {
            ContentResolver contentResolverA00 = AbstractC07127nr.A00(this.this$0);
            Uri uri = CalendarContract.Attendees.CONTENT_URI;
            String[] strArr = {"event_id", "attendeeName", "attendeeEmail"};
            String strA0r = C60O.A0r("event_id IN (", strA0L);
            Set<Long> set = this.$eventIds;
            ArrayList arrayListA0i = AnonymousClass003.A0i(set);
            Iterator<Long> it = set.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(String.valueOf(C3cG.A05(it.next())));
            }
            Cursor cursorQuery = contentResolverA00.query(uri, strArr, strA0r, (String[]) arrayListA0i.toArray(new String[0]), null);
            if (cursorQuery != null) {
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("event_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("attendeeName");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("attendeeEmail");
                    while (true) {
                        String str = null;
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        String string = cursorQuery.getString(columnIndexOrThrow2);
                        if (string == null || string.length() <= 0) {
                            string = null;
                        }
                        String string2 = cursorQuery.getString(columnIndexOrThrow3);
                        if (string2 != null && string2.length() > 0) {
                            str = string2;
                        }
                        String strA0L2 = AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", BFI.A0F(new String[]{string, str}), null);
                        if (strA0L2.length() > 0) {
                            ((List) C60R.A0Z(C3cG.A0S(cursorQuery.getLong(columnIndexOrThrow)), linkedHashMapA0j)).add(strA0L2);
                        }
                    }
                    cursorQuery.close();
                } finally {
                }
            }
        } catch (Exception e) {
            AbstractC07127nr.A0H("Failed to read attendees: ", e.getMessage());
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(linkedHashMapA0j.size()));
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            linkedHashMapA15.put(entryA0l.getKey(), AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", (Iterable) entryA0l.getValue(), null));
        }
        return linkedHashMapA15;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super Map<Long, String>> htJ) {
        return ((CalendarRepository$getAttendeeTextForEvents$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Map<Long, ? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super Map<Long, String>>) htJ);
    }
}
