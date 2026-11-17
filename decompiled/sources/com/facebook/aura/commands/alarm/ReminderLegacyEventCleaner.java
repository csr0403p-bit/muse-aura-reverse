package com.facebook.aura.commands.alarm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cJ;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.CalendarContract;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ReminderLegacyEventCleaner {
    public static final ReminderLegacyEventCleaner INSTANCE = new ReminderLegacyEventCleaner();

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderLegacyEventCleaner$deleteEvent$2", f = "ReminderLegacyEventCleaner.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderLegacyEventCleaner$deleteEvent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $eventId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$eventId = j;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$eventId, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, this.$eventId);
                C7384Etj.A0U(uriWithAppendedId);
                this.$context.getContentResolver().delete(uriWithAppendedId, null, null);
            } catch (Exception e) {
                CFK.A06(ReminderLegacyEventCleanerKt.TAG, FGI.A0L("Failed to delete legacy reminder event ", this.$eventId, ": ", e.getMessage()));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object deleteEvent(Context context, long j, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new AnonymousClass2(j, context, null));
    }
}
