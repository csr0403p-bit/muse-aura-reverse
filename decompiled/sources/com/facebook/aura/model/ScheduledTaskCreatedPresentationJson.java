package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ScheduledTaskCreatedPresentationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String description;
    public final String task_id;
    public final String title;

    public final class Companion {
        public final C9hr<ScheduledTaskCreatedPresentationJson> serializer() {
            return ScheduledTaskCreatedPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ScheduledTaskCreatedPresentationJson scheduledTaskCreatedPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(scheduledTaskCreatedPresentationJson.task_id)) {
            c9j5.AAV(scheduledTaskCreatedPresentationJson.task_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(scheduledTaskCreatedPresentationJson.title)) {
            c9j5.AAV(scheduledTaskCreatedPresentationJson.title, c9iZ, 1);
        }
        if (zAfR || scheduledTaskCreatedPresentationJson.description != null) {
            c9j5.AAP(scheduledTaskCreatedPresentationJson.description, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScheduledTaskCreatedPresentationJson) {
                ScheduledTaskCreatedPresentationJson scheduledTaskCreatedPresentationJson = (ScheduledTaskCreatedPresentationJson) obj;
                if (!C7384Etj.areEqual(this.task_id, scheduledTaskCreatedPresentationJson.task_id) || !C7384Etj.areEqual(this.title, scheduledTaskCreatedPresentationJson.title) || !C7384Etj.areEqual(this.description, scheduledTaskCreatedPresentationJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ScheduledTaskCreatedPresentationJson copy$default(ScheduledTaskCreatedPresentationJson scheduledTaskCreatedPresentationJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scheduledTaskCreatedPresentationJson.task_id;
        }
        if ((i & 2) != 0) {
            str2 = scheduledTaskCreatedPresentationJson.title;
        }
        if ((i & 4) != 0) {
            str3 = scheduledTaskCreatedPresentationJson.description;
        }
        return scheduledTaskCreatedPresentationJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.task_id;
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

    public final String getTask_id() {
        return this.task_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.task_id)) + AnonymousClass006.A0G(this.description);
    }

    public final ScheduledTaskCreatedPresentation toDomain() {
        String strA0l;
        String strA0l2 = AnonymousClass002.A0l(this.task_id);
        String str = null;
        if (strA0l2.length() > 0) {
            String strA0l3 = AnonymousClass002.A0l(this.title);
            if (strA0l3.length() > 0) {
                String str2 = this.description;
                if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
                    str = strA0l;
                }
                return new ScheduledTaskCreatedPresentation(strA0l2, strA0l3, str);
            }
        }
        return null;
    }

    public ScheduledTaskCreatedPresentationJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.task_id = str;
        this.title = str2;
        this.description = str3;
    }

    public final ScheduledTaskCreatedPresentationJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new ScheduledTaskCreatedPresentationJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ScheduledTaskCreatedPresentationJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.task_id = "";
        } else {
            this.task_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
    }

    public /* synthetic */ ScheduledTaskCreatedPresentationJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public ScheduledTaskCreatedPresentationJson() {
        this("", "", null);
    }
}
