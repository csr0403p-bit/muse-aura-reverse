package com.facebook.aura.health;

import X.AGH;
import X.C06H;
import X.C3cG;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HealthRecordCounts {
    public final int aggregates;
    public final int events;
    public final int meals;
    public final int sleep;
    public final int workouts;

    public final int getAggregates() {
        return this.aggregates;
    }

    public final int getEvents() {
        return this.events;
    }

    public final int getMeals() {
        return this.meals;
    }

    public final int getSleep() {
        return this.sleep;
    }

    public final int getTotal() {
        return this.aggregates + this.workouts + this.sleep + this.events + this.meals;
    }

    public final int getWorkouts() {
        return this.workouts;
    }

    public final Map<String, String> metadata() {
        return AGH.A0D(C3cG.A0r("record_count_aggregates", String.valueOf(this.aggregates)), C3cG.A0r("record_count_workouts", String.valueOf(this.workouts)), C3cG.A0r("record_count_sleep", String.valueOf(this.sleep)), C3cG.A0r("record_count_events", String.valueOf(this.events)), C3cG.A0r("record_count_meals", String.valueOf(this.meals)), C3cG.A0r("total_records", String.valueOf(getTotal())));
    }

    public HealthRecordCounts(int i, int i2, int i3, int i4, int i5) {
        this.aggregates = i;
        this.workouts = i2;
        this.sleep = i3;
        this.events = i4;
        this.meals = i5;
    }

    public /* synthetic */ HealthRecordCounts(int i, int i2, int i3, int i4, int i5, int i6, C06H c06h) {
        this(i, i2, i3, i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
