package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes.dex */
public final class ScheduledTaskCreatedPresentation extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String description;
    public final String taskId;
    public final String title;

    /* loaded from: classes3.dex */
    public final class Companion {
        public final C9hr<ScheduledTaskCreatedPresentation> serializer() {
            return ScheduledTaskCreatedPresentation$$serializer.INSTANCE;
        }

        public final ScheduledTaskCreatedPresentation fromJson(JsonElement jsonElement) {
            return ScheduledTaskCreatedPresentationJsonKt.parseScheduledTaskCreatedPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(scheduledTaskCreatedPresentation.taskId, c9iZ, 0);
        c9j5.AAV(scheduledTaskCreatedPresentation.title, c9iZ, 1);
        if (c9j5.AfR() || scheduledTaskCreatedPresentation.description != null) {
            c9j5.AAP(scheduledTaskCreatedPresentation.description, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScheduledTaskCreatedPresentation) {
                ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation = (ScheduledTaskCreatedPresentation) obj;
                if (!C7384Etj.areEqual(this.taskId, scheduledTaskCreatedPresentation.taskId) || !C7384Etj.areEqual(this.title, scheduledTaskCreatedPresentation.title) || !C7384Etj.areEqual(this.description, scheduledTaskCreatedPresentation.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ScheduledTaskCreatedPresentation copy$default(ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scheduledTaskCreatedPresentation.taskId;
        }
        if ((i & 2) != 0) {
            str2 = scheduledTaskCreatedPresentation.title;
        }
        if ((i & 4) != 0) {
            str3 = scheduledTaskCreatedPresentation.description;
        }
        return scheduledTaskCreatedPresentation.copy(str, str2, str3);
    }

    public final String component1() {
        return this.taskId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.taskId)) + AnonymousClass006.A0G(this.description);
    }

    public ScheduledTaskCreatedPresentation(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.taskId = str;
        this.title = str2;
        this.description = str3;
    }

    public final ScheduledTaskCreatedPresentation copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new ScheduledTaskCreatedPresentation(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ScheduledTaskCreatedPresentation(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }

    public /* synthetic */ ScheduledTaskCreatedPresentation(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ScheduledTaskCreatedPresentation$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.taskId = str;
        this.title = str2;
        this.description = (i & 4) == 0 ? null : str3;
    }
}
