package com.facebook.aura.library.model;

import X.A3q;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.HxE;
import android.icu.text.DateFormat;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.library.repo.Goal;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class HatchGoalsTabViewModelKt {
    public static final String DETAIL_ENGAGEMENT_SURFACE = "goal_detail";
    public static final String TAP_INTERACTION_SOURCE = "android_tap";

    public static final Long parseTimestampMillis(String str) {
        if (str != null && !C7BY.A0j(str)) {
            try {
                return Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
            } catch (DateTimeParseException unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ AHD distinctByIdExcluding$default(List list, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = A3q.A00;
        }
        return distinctByIdExcluding(list, set);
    }

    public static final JsonObject sourceMetadata(String str) {
        C7384Etj.A0Y(str, 0);
        return new JsonObject(AnonymousClass006.A10(PhotosSearchHandlerKt.PARAM_SOURCE, C9oY.A07(str)));
    }

    public static final AHD<Goal> distinctByIdExcluding(List<Goal> list, Set<String> set) {
        Set setA0f = AbstractC0878AGe.A0f(set);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Goal goal : list) {
            if (setA0f.add(goal.id)) {
                arrayListA0h.add(goal);
            }
        }
        return AGI.A07(arrayListA0h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AHD<CompletedGoalsSection> groupCompletedGoalsByMonth(List<Goal> list, Locale locale) {
        ArrayList<Goal> arrayListA0h = C3cG.A0h();
        for (Goal goal : list) {
            if (goal.isCompleted()) {
                arrayListA0h.add(goal);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return AHI.A01;
        }
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMMy", locale);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        for (Goal goal2 : arrayListA0h) {
            AnonymousClass002.A1J(goal2, parseTimestampMillis(goal2.createdAt), arrayListA0i);
        }
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.library.model.HatchGoalsTabViewModelKt$groupCompletedGoalsByMonth$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Long l = (Long) ((HxE) t2).second;
                Long l2 = l;
                if (l == null) {
                    l2 = Long.MIN_VALUE;
                }
                Object obj = ((HxE) t).second;
                if (obj == null) {
                    obj = Long.MIN_VALUE;
                }
                return l2.compareTo((Long) obj);
            }
        };
        for (HxE hxE : AbstractC0878AGe.A0c(arrayListA0i, new Comparator() { // from class: com.facebook.aura.library.model.HatchGoalsTabViewModelKt$groupCompletedGoalsByMonth$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((Goal) ((HxE) t2).first).id, ((Goal) ((HxE) t).first).id) : iCompare;
            }
        })) {
            A a = hxE.first;
            Number number = (Number) hxE.second;
            String str = number != null ? instanceForSkeleton.format(new Date(number.longValue())) : null;
            Object objA0h = linkedHashMapA0j.get(str);
            if (objA0h == null) {
                objA0h = C3cG.A0h();
                linkedHashMapA0j.put(str, objA0h);
            }
            ((List) objA0h).add(a);
        }
        ArrayList arrayList = new ArrayList(linkedHashMapA0j.size());
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            arrayList.add(new CompletedGoalsSection((String) entryA0l.getKey(), AGI.A07((Iterable) entryA0l.getValue())));
        }
        return AGI.A07(arrayList);
    }

    public static final AHD<Goal> withSessionCompletion(List<Goal> list, Set<String> set) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (Goal goal : list) {
            Goal goal2 = goal;
            if (!goal2.isCompleted() || set.contains(goal2.id)) {
                arrayListA0h.add(goal);
            }
        }
        return AGI.A07(arrayListA0h);
    }
}
