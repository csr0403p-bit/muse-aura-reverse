package com.facebook.aura.commands.calendar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.G0V;
import X.HtJ;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.aura.commands.calendar.CalendarRepository;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$listEventsForSearch$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class CalendarRepository$listEventsForSearch$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<CalendarRepository.SearchRow>>, Object> {
    public final /* synthetic */ long $endTime;
    public final /* synthetic */ long $startTime;
    public int label;
    public final /* synthetic */ CalendarRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarRepository$listEventsForSearch$2(CalendarRepository calendarRepository, long j, long j2, HtJ<? super CalendarRepository$listEventsForSearch$2> htJ) {
        super(2, htJ);
        this.this$0 = calendarRepository;
        this.$startTime = j;
        this.$endTime = j2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new CalendarRepository$listEventsForSearch$2(this.this$0, this.$startTime, this.$endTime, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        ArrayList arrayListA12 = C60O.A12(obj);
        Uri.Builder builderBuildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
        long j = this.$startTime;
        long j2 = this.$endTime;
        ContentUris.appendId(builderBuildUpon, j);
        ContentUris.appendId(builderBuildUpon, j2);
        try {
            Cursor cursorQuery = AbstractC07127nr.A00(this.this$0).query(builderBuildUpon.build(), CalendarRepository.SEARCH_EVENT_PROJECTION, null, null, "begin ASC");
            if (cursorQuery == null) {
                return arrayListA12;
            }
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("event_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("title");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(HatchWebPageParserKt.DESCRIPTION);
                int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("begin");
                int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("end");
                int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("allDay");
                int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("eventLocation");
                int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("calendar_id");
                int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("calendar_displayName");
                int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("eventTimezone");
                int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow("rrule");
                int columnIndexOrThrow12 = cursorQuery.getColumnIndexOrThrow("availability");
                int columnIndexOrThrow13 = cursorQuery.getColumnIndexOrThrow("eventStatus");
                int columnIndexOrThrow14 = cursorQuery.getColumnIndexOrThrow("calendar_color");
                int columnIndexOrThrow15 = cursorQuery.getColumnIndexOrThrow("organizer");
                while (cursorQuery.moveToNext()) {
                    long j3 = cursorQuery.getLong(columnIndexOrThrow);
                    CalendarRepository.Companion companion = CalendarRepository.Companion;
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    if (string == null) {
                        string = "";
                    }
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow4);
                    Long lA0S = C3cG.A0S(cursorQuery.getLong(columnIndexOrThrow5));
                    if (cursorQuery.isNull(columnIndexOrThrow5)) {
                        lA0S = null;
                    }
                    boolean z = cursorQuery.getInt(columnIndexOrThrow6) == 1;
                    String string3 = cursorQuery.getString(columnIndexOrThrow7);
                    long j5 = cursorQuery.getLong(columnIndexOrThrow8);
                    String string4 = cursorQuery.getString(columnIndexOrThrow9);
                    if (string4 == null) {
                        string4 = "";
                    }
                    String string5 = cursorQuery.getString(columnIndexOrThrow10);
                    String string6 = cursorQuery.getString(columnIndexOrThrow11);
                    Integer numA0R = cursorQuery.isNull(columnIndexOrThrow12) ? null : C3cG.A0R(cursorQuery.getInt(columnIndexOrThrow12));
                    Integer numA0R2 = cursorQuery.isNull(columnIndexOrThrow13) ? null : C3cG.A0R(cursorQuery.getInt(columnIndexOrThrow13));
                    Integer numA0R3 = C3cG.A0R(cursorQuery.getInt(columnIndexOrThrow14));
                    Integer num = null;
                    if (!cursorQuery.isNull(columnIndexOrThrow14)) {
                        num = numA0R3;
                    }
                    arrayListA12.add(new CalendarRepository.SearchRow(companion.buildSyncEventPayload$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(j3, string, string2, j4, lA0S, z, string3, j5, string4, string5, string6, numA0R, numA0R2, num), j3, cursorQuery.getString(columnIndexOrThrow15)));
                }
                cursorQuery.close();
                return arrayListA12;
            } finally {
            }
        } catch (Exception e) {
            AbstractC07127nr.A0H("Failed to list events for search: ", e.getMessage());
            return arrayListA12;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super List<CalendarRepository.SearchRow>> htJ) {
        return ((CalendarRepository$listEventsForSearch$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
