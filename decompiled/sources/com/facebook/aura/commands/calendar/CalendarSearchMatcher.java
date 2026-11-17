package com.facebook.aura.commands.calendar;

import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AnonymousClass003;
import X.BFI;
import X.C06G;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.commands.calendar.CalendarSearchMatcher;
import com.facebook.aura.commands.core.NodeTextRelevanceScorer;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class CalendarSearchMatcher {
    public static final CalendarSearchMatcher INSTANCE = new CalendarSearchMatcher();
    public static final long UNPARSEABLE_START_MS = 2305843009213693951L;
    public static final double WEIGHT_ATTENDEES = 2.0d;
    public static final double WEIGHT_CALENDAR = 0.5d;
    public static final double WEIGHT_LOCATION = 1.5d;
    public static final double WEIGHT_NOTES = 1.0d;
    public static final double WEIGHT_ORGANIZER = 2.0d;
    public static final double WEIGHT_TITLE = 3.0d;

    public final class ScoredEvent extends C06G {
        public final SearchableEvent event;
        public final double score;

        public ScoredEvent(SearchableEvent searchableEvent, double d) {
            C7384Etj.A0Y(searchableEvent, 0);
            this.event = searchableEvent;
            this.score = d;
        }

        public final ScoredEvent copy(SearchableEvent searchableEvent, double d) {
            C7384Etj.A0Y(searchableEvent, 0);
            return new ScoredEvent(searchableEvent, d);
        }

        public static /* synthetic */ ScoredEvent copy$default(ScoredEvent scoredEvent, SearchableEvent searchableEvent, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                searchableEvent = scoredEvent.event;
            }
            if ((i & 2) != 0) {
                d = scoredEvent.score;
            }
            C7384Etj.A0Y(searchableEvent, 0);
            return new ScoredEvent(searchableEvent, d);
        }

        public final SearchableEvent component1() {
            return this.event;
        }

        public final double component2() {
            return this.score;
        }

        public final SearchableEvent getEvent() {
            return this.event;
        }

        public final double getScore() {
            return this.score;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SearchableEvent extends C06G {
        public final List<NodeTextRelevanceScorer.WeightedField> fields;
        public final CalendarEventPayloadJson payload;
        public final long startMs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchableEvent copy$default(SearchableEvent searchableEvent, CalendarEventPayloadJson calendarEventPayloadJson, List list, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                calendarEventPayloadJson = searchableEvent.payload;
            }
            if ((i & 2) != 0) {
                list = searchableEvent.fields;
            }
            if ((i & 4) != 0) {
                j = searchableEvent.startMs;
            }
            return searchableEvent.copy(calendarEventPayloadJson, list, j);
        }

        public final CalendarEventPayloadJson component1() {
            return this.payload;
        }

        public final List<NodeTextRelevanceScorer.WeightedField> component2() {
            return this.fields;
        }

        public final long component3() {
            return this.startMs;
        }

        public final List<NodeTextRelevanceScorer.WeightedField> getFields() {
            return this.fields;
        }

        public final CalendarEventPayloadJson getPayload() {
            return this.payload;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public SearchableEvent(CalendarEventPayloadJson calendarEventPayloadJson, List<NodeTextRelevanceScorer.WeightedField> list, long j) {
            AnonymousClass003.A0u(calendarEventPayloadJson, list);
            this.payload = calendarEventPayloadJson;
            this.fields = list;
            this.startMs = j;
        }

        public final SearchableEvent copy(CalendarEventPayloadJson calendarEventPayloadJson, List<NodeTextRelevanceScorer.WeightedField> list, long j) {
            AnonymousClass003.A0u(calendarEventPayloadJson, list);
            return new SearchableEvent(calendarEventPayloadJson, list, j);
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final SearchableEvent searchableOf(CalendarEventPayloadJson calendarEventPayloadJson, String str, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(calendarEventPayloadJson, 0);
        NodeTextRelevanceScorer nodeTextRelevanceScorer = NodeTextRelevanceScorer.INSTANCE;
        return new SearchableEvent(calendarEventPayloadJson, BFI.A0F(new NodeTextRelevanceScorer.WeightedField[]{nodeTextRelevanceScorer.field(str, 3.0d), nodeTextRelevanceScorer.field(str3, 1.5d), nodeTextRelevanceScorer.field(str2, 1.0d), nodeTextRelevanceScorer.field(str4, 0.5d), nodeTextRelevanceScorer.field(str5, 2.0d), nodeTextRelevanceScorer.field(str6, 2.0d)}), parseStartMs(calendarEventPayloadJson.start_date));
    }

    private final Comparator<ScoredEvent> bestOccurrence(final long j) {
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarSearchMatcher$bestOccurrence$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Double.valueOf(((CalendarSearchMatcher.ScoredEvent) t).score).compareTo(Double.valueOf(((CalendarSearchMatcher.ScoredEvent) t2).score));
            }
        };
        return new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarSearchMatcher$bestOccurrence$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                long j2 = ((CalendarSearchMatcher.ScoredEvent) t2).event.startMs;
                long j3 = j;
                return C60Q.A01(Long.valueOf(Math.abs(j2 - j3)), Math.abs(((CalendarSearchMatcher.ScoredEvent) t).event.startMs - j3));
            }
        };
    }

    private final Comparator<ScoredEvent> rankOrder(final long j) {
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarSearchMatcher$rankOrder$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Double.valueOf(((CalendarSearchMatcher.ScoredEvent) t2).score).compareTo(Double.valueOf(((CalendarSearchMatcher.ScoredEvent) t).score));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarSearchMatcher$rankOrder$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                long j2 = ((CalendarSearchMatcher.ScoredEvent) t).event.startMs;
                long j3 = j;
                return C60Q.A01(Long.valueOf(Math.abs(j2 - j3)), Math.abs(((CalendarSearchMatcher.ScoredEvent) t2).event.startMs - j3));
            }
        };
        return new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarSearchMatcher$rankOrder$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((CalendarSearchMatcher.ScoredEvent) t).event.payload.event_id, ((CalendarSearchMatcher.ScoredEvent) t2).event.payload.event_id) : iCompare;
            }
        };
    }

    private final double scoreEvent(List<String> list, String str, SearchableEvent searchableEvent) {
        return NodeTextRelevanceScorer.INSTANCE.score(list, str, searchableEvent.fields, 1.0d);
    }

    public static /* synthetic */ SearchableEvent searchableOf$default(CalendarSearchMatcher calendarSearchMatcher, CalendarEventPayloadJson calendarEventPayloadJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 2) != 0) {
            str = calendarEventPayloadJson.title;
        }
        if ((i & 4) != 0) {
            str2 = calendarEventPayloadJson.notes;
        }
        if ((i & 8) != 0) {
            str3 = calendarEventPayloadJson.location;
        }
        if ((i & 16) != 0) {
            str4 = calendarEventPayloadJson.calendar_name;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        return calendarSearchMatcher.searchableOf(calendarEventPayloadJson, str, str2, str3, str4, str5, str6);
    }

    private final long parseStartMs(String str) {
        try {
            return C60Q.A05(str);
        } catch (DateTimeParseException unused) {
            return UNPARSEABLE_START_MS;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<CalendarEventPayloadJson> rank(String str, List<SearchableEvent> list, int i, long j) {
        AnonymousClass003.A0u(str, list);
        if (i > 0) {
            NodeTextRelevanceScorer nodeTextRelevanceScorer = NodeTextRelevanceScorer.INSTANCE;
            List<String> list2 = nodeTextRelevanceScorer.tokenize(str);
            if (!list2.isEmpty()) {
                String strNormalize = nodeTextRelevanceScorer.normalize(str);
                ArrayList arrayListA0h = C3cG.A0h();
                for (SearchableEvent searchableEvent : list) {
                    double dScoreEvent = INSTANCE.scoreEvent(list2, strNormalize, searchableEvent);
                    if (dScoreEvent > 0.0d) {
                        arrayListA0h.add(new ScoredEvent(searchableEvent, dScoreEvent));
                    }
                }
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                for (Object obj : arrayListA0h) {
                    String str2 = ((ScoredEvent) obj).event.payload.event_id;
                    ((List) C60R.A0Z(C7BY.A0S(str2, str2, '#'), linkedHashMapA0j)).add(obj);
                }
                ArrayList arrayListA11 = C60O.A11(linkedHashMapA0j.size());
                Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
                while (itA0i.hasNext()) {
                    List list3 = (List) C3cH.A0l(itA0i).getValue();
                    Comparator<ScoredEvent> comparatorBestOccurrence = INSTANCE.bestOccurrence(j);
                    C7384Etj.A0Y(list3, 0);
                    Iterator it = list3.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        if (comparatorBestOccurrence.compare(next, next2) < 0) {
                            next = next2;
                        }
                    }
                    arrayListA11.add(next);
                }
                List listA0a = AbstractC0878AGe.A0a(AbstractC0878AGe.A0c(arrayListA11, rankOrder(j)), i);
                ArrayList arrayListA0i = AnonymousClass003.A0i(listA0a);
                Iterator it2 = listA0a.iterator();
                while (it2.hasNext()) {
                    arrayListA0i.add(((ScoredEvent) it2.next()).event.payload);
                }
                return arrayListA0i;
            }
        }
        return C0881AGi.A00;
    }

    public final double score(String str, SearchableEvent searchableEvent) {
        AnonymousClass003.A0u(str, searchableEvent);
        NodeTextRelevanceScorer nodeTextRelevanceScorer = NodeTextRelevanceScorer.INSTANCE;
        List<String> list = nodeTextRelevanceScorer.tokenize(str);
        if (list.isEmpty()) {
            return 0.0d;
        }
        return scoreEvent(list, nodeTextRelevanceScorer.normalize(str), searchableEvent);
    }
}
